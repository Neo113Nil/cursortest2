package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gms/maps/SupportMapFragment;", "Lcom/google/android/gms/maps/GoogleMap;", "awaitMap", "(Lcom/google/android/gms/maps/SupportMapFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportMapFragmentKt {
    private static final java.lang.Object awaitMap$$forInline(com.google.android.gms.maps.SupportMapFragment supportMapFragment, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.GoogleMap> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        supportMapFragment.getMapAsync(new com.google.maps.android.ktx.SupportMapFragmentKt$awaitMap$2$1(cancellableContinuationImpl));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final java.lang.Object awaitMap(com.google.android.gms.maps.SupportMapFragment supportMapFragment, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.GoogleMap> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        supportMapFragment.getMapAsync(new com.google.maps.android.ktx.SupportMapFragmentKt$awaitMap$2$1(cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
