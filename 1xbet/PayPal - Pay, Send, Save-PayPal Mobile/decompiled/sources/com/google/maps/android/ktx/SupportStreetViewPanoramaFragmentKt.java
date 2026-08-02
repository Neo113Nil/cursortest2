package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/SupportStreetViewPanoramaFragment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SupportStreetViewPanoramaFragmentKt {
    public static final java.lang.Object awaitStreetViewPanorama(com.google.android.gms.maps.SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.StreetViewPanorama> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        supportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(new com.google.maps.android.ktx.SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final java.lang.Object awaitStreetViewPanorama$$forInline(com.google.android.gms.maps.SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.StreetViewPanorama> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        supportStreetViewPanoramaFragment.getStreetViewPanoramaAsync(new com.google.maps.android.ktx.SupportStreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(safeContinuation));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
