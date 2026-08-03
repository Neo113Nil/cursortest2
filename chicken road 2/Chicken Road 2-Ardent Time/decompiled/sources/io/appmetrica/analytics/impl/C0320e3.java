package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320e3 implements io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl f5771a;

    public C0320e3(io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f5771a = networkClientWithCacheControl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final java.lang.String getOldETag() {
        return this.f5771a.getETag();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onError() {
        this.f5771a.onError();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onNotModified() {
        this.f5771a.onNotModified();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer.Client
    public final void onResponse(java.lang.String str, byte[] bArr) {
        this.f5771a.onResponse(str, bArr);
    }
}
