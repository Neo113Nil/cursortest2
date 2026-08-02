package com.google.maps.android.ktx;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class GoogleMapKt$awaitMapLoad$2$1 implements com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback {
    final /* synthetic */ kotlin.coroutines.Continuation<kotlin.Unit> $continuation;

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public final void onMapLoaded() {
        kotlin.coroutines.Continuation<kotlin.Unit> continuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitMapLoad$2$1(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.$continuation = continuation;
    }
}
