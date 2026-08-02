package com.google.maps.android.compose.streetview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1 implements com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback {
    final /* synthetic */ kotlin.coroutines.Continuation $continuation;

    @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
    public final void onStreetViewPanoramaReady(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        kotlin.coroutines.Continuation continuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(streetViewPanorama));
    }

    public StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(kotlin.coroutines.Continuation continuation) {
        this.$continuation = continuation;
    }
}
