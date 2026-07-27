package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class Cm implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Em f6644a;

    /* renamed from: b, reason: collision with root package name */
    public C0703hm f6645b;

    /* renamed from: c, reason: collision with root package name */
    public Nl f6646c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f6647d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f6648e;

    /* renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f6649f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f6650g;

    /* renamed from: h, reason: collision with root package name */
    public final Vl f6651h;

    public Cm(Em em, FullUrlFormer<C0651fm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0651fm> configProvider) {
        this(em, new Vl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f6644a.f6757a.f6802f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f6650g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f6647d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f6649f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0651fm) this.f6648e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C1027ua.f9366H.A()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f6647d.setHeader("Accept-Encoding", "encrypted");
        return this.f6644a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        if (z) {
            return;
        }
        this.f6646c = Nl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0703hm handle = this.f6651h.handle(this.f6649f);
        this.f6645b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f6646c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f6646c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f6645b == null || this.f6649f.getResponseHeaders() == null) {
            return;
        }
        this.f6644a.a(this.f6645b, (C0651fm) this.f6648e.getConfig(), this.f6649f.getResponseHeaders());
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
        if (this.f6646c == null) {
            this.f6646c = Nl.UNKNOWN;
        }
        this.f6644a.a(this.f6646c);
    }

    public Cm(Em em, Vl vl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f6644a = em;
        this.f6651h = vl;
        this.f6647d = requestDataHolder;
        this.f6649f = responseDataHolder;
        this.f6648e = configProvider;
        this.f6650g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0651fm) configProvider.getConfig()).k());
    }
}
