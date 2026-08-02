package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/google/maps/android/ktx/GoogleMapKt$awaitAnimateCamera$2$1;", "Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;", "", "onFinish", "()V", "onCancel"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes.dex */
public final class GoogleMapKt$awaitAnimateCamera$2$1 implements com.google.android.gms.maps.GoogleMap.CancelableCallback {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<kotlin.Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitAnimateCamera$2$1(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
    public final void onFinish() {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cancellableContinuation = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
    }

    @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
    public final void onCancel() {
        kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(this.$continuation, null, 1, null);
    }
}
