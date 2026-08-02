package com.google.maps.android.ktx;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class MapViewKt$awaitMap$2$1 implements com.google.android.gms.maps.OnMapReadyCallback {
    final /* synthetic */ kotlin.coroutines.Continuation<com.google.android.gms.maps.GoogleMap> $continuation;

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(com.google.android.gms.maps.GoogleMap googleMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.coroutines.Continuation<com.google.android.gms.maps.GoogleMap> continuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(googleMap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapViewKt$awaitMap$2$1(kotlin.coroutines.Continuation<? super com.google.android.gms.maps.GoogleMap> continuation) {
        this.$continuation = continuation;
    }
}
