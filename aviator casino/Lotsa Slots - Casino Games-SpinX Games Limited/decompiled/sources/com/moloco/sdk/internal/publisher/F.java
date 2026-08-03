package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class F implements com.moloco.sdk.publisher.InterstitialAd, com.moloco.sdk.internal.publisher.s, com.moloco.sdk.publisher.FullscreenAd<com.moloco.sdk.publisher.InterstitialAdShowListener> {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.v<com.moloco.sdk.publisher.InterstitialAdShowListener> f7074a;

    /* JADX WARN: Multi-variable type inference failed */
    public F(com.moloco.sdk.internal.publisher.v<? super com.moloco.sdk.publisher.InterstitialAdShowListener> fullscreenAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.f7074a = fullscreenAd;
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f7074a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.f7074a.getCreateAdObjectStartTime();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f7074a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(java.lang.String bidResponseJson, com.moloco.sdk.publisher.AdLoad.Listener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f7074a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.f7074a.setCreateAdObjectStartTime(j);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(com.moloco.sdk.publisher.InterstitialAdShowListener interstitialAdShowListener) {
        this.f7074a.show(com.moloco.sdk.internal.publisher.G.a(interstitialAdShowListener));
    }
}
