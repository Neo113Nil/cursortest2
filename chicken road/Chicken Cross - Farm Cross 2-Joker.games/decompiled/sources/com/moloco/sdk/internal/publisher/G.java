package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class G implements InterstitialAd, s, FullscreenAd<InterstitialAdShowListener> {

    /* renamed from: a, reason: collision with root package name */
    public final w<InterstitialAdShowListener> f10586a;

    /* JADX WARN: Multi-variable type inference failed */
    public G(w<? super InterstitialAdShowListener> fullscreenAd) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.f10586a = fullscreenAd;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.f10586a.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f10586a.destroy();
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc, reason: not valid java name */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.f10586a.mo7561getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f10586a.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f10586a.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo, reason: not valid java name */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j) {
        this.f10586a.mo7562setCreateAdObjectDurationLRDsOJo(j);
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    public void show(InterstitialAdShowListener interstitialAdShowListener) {
        this.f10586a.show(H.a(interstitialAdShowListener));
    }
}
