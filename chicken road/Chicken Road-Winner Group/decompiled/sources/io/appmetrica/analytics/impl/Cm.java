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
    public final Em f5809a;

    /* renamed from: b, reason: collision with root package name */
    public C0554hm f5810b;

    /* renamed from: c, reason: collision with root package name */
    public Nl f5811c;

    /* renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f5812d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigProvider f5813e;
    public final ResponseDataHolder f;

    /* renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f5814g;

    /* renamed from: h, reason: collision with root package name */
    public final Vl f5815h;

    public Cm(Em em, FullUrlFormer<C0502fm> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider<C0502fm> configProvider) {
        this(em, new Vl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "Startup task for component: " + this.f5809a.f5916a.f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f5814g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f5812d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0502fm) this.f5813e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C0878ua.f8414H.A()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f5812d.setHeader("Accept-Encoding", "encrypted");
        return this.f5809a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z3) {
        if (z3) {
            return;
        }
        this.f5811c = Nl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C0554hm handle = this.f5815h.handle(this.f);
        this.f5810b = handle;
        return handle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
        this.f5811c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f5811c = Nl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f5810b == null || this.f.getResponseHeaders() == null) {
            return;
        }
        this.f5809a.a(this.f5810b, (C0502fm) this.f5813e.getConfig(), this.f.getResponseHeaders());
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
        if (this.f5811c == null) {
            this.f5811c = Nl.UNKNOWN;
        }
        this.f5809a.a(this.f5811c);
    }

    public Cm(Em em, Vl vl, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f5809a = em;
        this.f5815h = vl;
        this.f5812d = requestDataHolder;
        this.f = responseDataHolder;
        this.f5813e = configProvider;
        this.f5814g = fullUrlFormer;
        fullUrlFormer.setHosts(((C0502fm) configProvider.getConfig()).k());
    }
}
