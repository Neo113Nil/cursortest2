package com.google.maps.android.ktx;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1 implements com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback {
    final /* synthetic */ kotlin.coroutines.Continuation<com.google.android.gms.maps.StreetViewPanorama> $continuation;

    @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
    public final void onStreetViewPanoramaReady(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        kotlin.coroutines.Continuation<com.google.android.gms.maps.StreetViewPanorama> continuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(streetViewPanorama));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(kotlin.coroutines.Continuation<? super com.google.android.gms.maps.StreetViewPanorama> continuation) {
        this.$continuation = continuation;
    }
}
