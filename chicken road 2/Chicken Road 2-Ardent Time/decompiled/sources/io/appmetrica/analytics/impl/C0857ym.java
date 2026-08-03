package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ym, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0857ym implements io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Am f7161a;

    /* renamed from: b, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0314dm f7162b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Jl f7163c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.RequestDataHolder f7164d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.ConfigProvider f7165e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.ResponseDataHolder f7166f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.FullUrlFormer f7167g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Rl f7168h;

    public C0857ym(io.appmetrica.analytics.impl.Am am, io.appmetrica.analytics.networktasks.internal.FullUrlFormer<io.appmetrica.analytics.impl.C0262bm> fullUrlFormer, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.ConfigProvider<io.appmetrica.analytics.impl.C0262bm> configProvider) {
        this(am, new io.appmetrica.analytics.impl.Rl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final java.lang.String description() {
        return "Startup task for component: " + this.f7161a.f4072a.f4139f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.FullUrlFormer<?> getFullUrlFormer() {
        return this.f7167g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.RequestDataHolder getRequestDataHolder() {
        return this.f7164d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.ResponseDataHolder getResponseDataHolder() {
        return this.f7166f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig getRetryPolicyConfig() {
        return ((io.appmetrica.analytics.impl.C0262bm) this.f7165e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        ((io.appmetrica.analytics.impl.Al) io.appmetrica.analytics.impl.C0560na.f6484I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f7164d.setHeader("Accept-Encoding", "encrypted");
        return this.f7161a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z2) {
        if (z2) {
            return;
        }
        this.f7163c = io.appmetrica.analytics.impl.Jl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        io.appmetrica.analytics.impl.C0314dm handle = this.f7168h.handle(this.f7166f);
        this.f7162b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(java.lang.Throwable th) {
        this.f7163c = io.appmetrica.analytics.impl.Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f7163c = io.appmetrica.analytics.impl.Jl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f7162b == null || this.f7166f.getResponseHeaders() == null) {
            return;
        }
        this.f7161a.a(this.f7162b, (io.appmetrica.analytics.impl.C0262bm) this.f7165e.getConfig(), this.f7166f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f7163c == null) {
            this.f7163c = io.appmetrica.analytics.impl.Jl.UNKNOWN;
        }
        this.f7161a.a(this.f7163c);
    }

    public C0857ym(io.appmetrica.analytics.impl.Am am, io.appmetrica.analytics.impl.Rl rl, io.appmetrica.analytics.networktasks.internal.FullUrlFormer fullUrlFormer, io.appmetrica.analytics.networktasks.internal.RequestDataHolder requestDataHolder, io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder, io.appmetrica.analytics.networktasks.internal.ConfigProvider configProvider) {
        this.f7161a = am;
        this.f7168h = rl;
        this.f7164d = requestDataHolder;
        this.f7166f = responseDataHolder;
        this.f7165e = configProvider;
        this.f7167g = fullUrlFormer;
        fullUrlFormer.setHosts(((io.appmetrica.analytics.impl.C0262bm) configProvider.getConfig()).k());
    }
}
