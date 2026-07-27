package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import e2.AbstractC0292g;
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
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f8872a;

    /* renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f8873b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8874c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f8872a = networkTask;
        this.f8873b = interruptionSafeThread;
        this.f8874c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f8872a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f8872a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f8872a.getExponentialBackoffPolicy().canBeExecuted(this.f8872a.getRetryPolicyConfig());
        if (!this.f8873b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f8872a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f8872a.onCreateNetworkTask();
        Boolean bool = null;
        while (this.f8873b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f8872a.getRetryPolicyConfig())) {
            f fVar = this.f8874c;
            NetworkTask networkTask = this.f8872a;
            fVar.getClass();
            boolean z4 = false;
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url != null) {
                    int length = url.length() - 1;
                    int i3 = 0;
                    boolean z5 = false;
                    while (i3 <= length) {
                        char charAt = url.charAt(!z5 ? i3 : length);
                        boolean z6 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
                        if (z5) {
                            if (!z6) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z6) {
                            i3++;
                        } else {
                            z5 = true;
                        }
                    }
                    if (!TextUtils.isEmpty(url.subSequence(i3, length + 1).toString())) {
                        Request.Builder addHeader = new Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                        RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                        Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            addHeader.addHeader((String) entry.getKey(), AbstractC0292g.Z((Iterable) entry.getValue(), StringUtils.COMMA, null, null, null, 62));
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
                        int i4 = b.f8868a;
                        Response execute = builder.withConnectTimeout(i4).withReadTimeout(i4).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(addHeader.build()).execute();
                        int code = execute.getCode();
                        ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                        responseDataHolder.setResponseCode(code);
                        responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                        if (responseDataHolder.isValidResponse()) {
                            responseDataHolder.setResponseData(execute.getResponseData());
                        }
                        if (execute.isCompleted()) {
                            z3 = networkTask.onRequestComplete();
                            bool = Boolean.valueOf(z3);
                            if (!z3 && this.f8872a.shouldTryNextHost()) {
                                z4 = true;
                            }
                            exponentialBackoffPolicy.onHostAttemptFinished(z3);
                            onCreateNetworkTask = z4;
                        } else {
                            networkTask.onRequestError(execute.getException());
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("Task ");
                sb.append(networkTask.description());
                sb.append(" url is `");
                sb.append(url);
                sb.append("`. All hosts = ");
                List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                sb.append(allHosts != null ? allHosts.toString() : null);
                networkTask.onRequestError(new IllegalArgumentException(sb.toString()));
            } else {
                networkTask.onRequestError(null);
            }
            z3 = false;
            bool = Boolean.valueOf(z3);
            if (!z3) {
                z4 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z3);
            onCreateNetworkTask = z4;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(j.a(bool, Boolean.TRUE));
    }
}
