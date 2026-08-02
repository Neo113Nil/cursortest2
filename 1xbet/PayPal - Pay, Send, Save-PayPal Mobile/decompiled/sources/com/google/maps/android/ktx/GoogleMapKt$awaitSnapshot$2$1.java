package com.google.maps.android.ktx;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class GoogleMapKt$awaitSnapshot$2$1 implements com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback {
    final /* synthetic */ kotlin.coroutines.Continuation<android.graphics.Bitmap> $continuation;

    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
    public final void onSnapshotReady(android.graphics.Bitmap bitmap) {
        kotlin.coroutines.Continuation<android.graphics.Bitmap> continuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(bitmap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitSnapshot$2$1(kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        this.$continuation = continuation;
    }
}
