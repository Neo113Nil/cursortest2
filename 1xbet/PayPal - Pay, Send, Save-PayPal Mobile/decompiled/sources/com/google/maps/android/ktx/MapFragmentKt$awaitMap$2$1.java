package com.google.maps.android.ktx;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapFragmentKt$awaitMap$2$1 implements com.google.android.gms.maps.OnMapReadyCallback {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<com.google.android.gms.maps.GoogleMap> $continuation;

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlinx.coroutines.CancellableContinuation<com.google.android.gms.maps.GoogleMap> cancellableContinuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(googleMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapFragmentKt$awaitMap$2$1(kotlinx.coroutines.CancellableContinuation<? super com.google.android.gms.maps.GoogleMap> cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }
}
