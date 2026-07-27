package io.appmetrica.analytics.networktasks.impl;

import B4.k;
import android.text.TextUtils;
import g4.AbstractC0465j;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f9846a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f9847b;

    /* renamed from: c, reason: collision with root package name */
    public final f f9848c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f9846a = networkTask;
        this.f9847b = interruptionSafeThread;
        this.f9848c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f9846a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f9846a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f9846a.getExponentialBackoffPolicy().canBeExecuted(this.f9846a.getRetryPolicyConfig());
        if (!this.f9847b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f9846a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f9846a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f9847b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f9846a.getRetryPolicyConfig())) {
            f fVar = this.f9848c;
            NetworkTask networkTask = this.f9846a;
            fVar.getClass();
            boolean z5 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(k.n0(url).toString())) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
                } else {
                    Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        addHeader.addHeader((String) entry.getKey(), AbstractC0465j.K0((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i2 = b.f9842a;
                    Response execute = builder.withConnectTimeout(i2).withReadTimeout(i2).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.isCompleted()) {
                        z = networkTask.onRequestComplete();
                        bool = Boolean.valueOf(z);
                        if (!z && this.f9846a.shouldTryNextHost()) {
                            z5 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z);
                        onCreateNetworkTask = z5;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z = false;
            bool = Boolean.valueOf(z);
            if (!z) {
                z5 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z);
            onCreateNetworkTask = z5;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(i.a(bool, Boolean.TRUE));
    }
}
