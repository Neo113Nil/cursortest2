package io.appmetrica.analytics.networktasks.impl;

/* loaded from: classes.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.NetworkTask f7372a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread f7373b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.impl.f f7374c;

    public h(io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask, io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread interruptionSafeThread, io.appmetrica.analytics.networktasks.impl.f fVar) {
        this.f7372a = networkTask;
        this.f7373b = interruptionSafeThread;
        this.f7374c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        byte[] postData;
        io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy exponentialBackoffPolicy = this.f7372a.getExponentialBackoffPolicy();
        boolean canBeExecuted = this.f7372a.getConnectionExecutionPolicy().canBeExecuted();
        boolean canBeExecuted2 = this.f7372a.getExponentialBackoffPolicy().canBeExecuted(this.f7372a.getRetryPolicyConfig());
        if (!this.f7373b.isRunning() || !canBeExecuted || !canBeExecuted2) {
            this.f7372a.onShouldNotExecute();
            return;
        }
        boolean onCreateNetworkTask = this.f7372a.onCreateNetworkTask();
        java.lang.Boolean bool = null;
        while (this.f7373b.isRunning() && onCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f7372a.getRetryPolicyConfig())) {
            io.appmetrica.analytics.networktasks.impl.f fVar = this.f7374c;
            io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask = this.f7372a;
            fVar.getClass();
            boolean z3 = false;
            if (networkTask.onPerformRequest()) {
                java.lang.String url = networkTask.getUrl();
                if (url == null || android.text.TextUtils.isEmpty(y1.g.c0(url).toString())) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Task ");
                    sb.append(networkTask.description());
                    sb.append(" url is `");
                    sb.append(url);
                    sb.append("`. All hosts = ");
                    java.util.List<java.lang.String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new java.lang.IllegalArgumentException(sb.toString()));
                } else {
                    io.appmetrica.analytics.networkapi.Request.Builder addHeader = new io.appmetrica.analytics.networkapi.Request.Builder(url).addHeader("Accept", "application/json").addHeader("User-Agent", networkTask.getUserAgent());
                    io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    java.util.Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        addHeader.addHeader((java.lang.String) entry.getKey(), i1.AbstractC0190i.Q((java.lang.Iterable) entry.getValue(), io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA, null, null, null, 62));
                    }
                    if (io.appmetrica.analytics.networktasks.internal.NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            addHeader.withMethod(io.appmetrica.analytics.networkapi.Request.Method.POST);
                            addHeader.withBody(postData);
                            java.lang.Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                addHeader.addHeader("Send-Timestamp", java.lang.String.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            java.lang.Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                addHeader.addHeader("Send-Timezone", java.lang.String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    io.appmetrica.analytics.network.internal.NetworkClientBuilder networkClientBuilder = new io.appmetrica.analytics.network.internal.NetworkClientBuilder();
                    io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder builder = new io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder();
                    int i2 = io.appmetrica.analytics.networktasks.impl.b.f7368a;
                    io.appmetrica.analytics.networkapi.Response execute = networkClientBuilder.withSettings(builder.withConnectTimeout(i2).withReadTimeout(i2).withSslSocketFactory(networkTask.getSslSocketFactory()).build()).build().newCall(addHeader.build()).execute();
                    int code = execute.getCode();
                    io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.convertMapKeysToLowerCase(execute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(execute.getResponseData());
                    }
                    if (execute.isCompleted()) {
                        z2 = networkTask.onRequestComplete();
                        bool = java.lang.Boolean.valueOf(z2);
                        if (!z2 && this.f7372a.shouldTryNextHost()) {
                            z3 = true;
                        }
                        exponentialBackoffPolicy.onHostAttemptFinished(z2);
                        onCreateNetworkTask = z3;
                    } else {
                        networkTask.onRequestError(execute.getException());
                    }
                }
            } else {
                networkTask.onRequestError(null);
            }
            z2 = false;
            bool = java.lang.Boolean.valueOf(z2);
            if (!z2) {
                z3 = true;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(z2);
            onCreateNetworkTask = z3;
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(kotlin.jvm.internal.i.a(bool, java.lang.Boolean.TRUE));
    }
}
