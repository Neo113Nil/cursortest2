package com.google.maps.android.ktx;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\f\u0010\u0007"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanoramaView;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "cameraChangeEvents", "(Lcom/google/android/gms/maps/StreetViewPanorama;)Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "changeEvents", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "clickEvents", "longClickEvents"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StreetViewPanoramaViewKt {
    public static final java.lang.Object awaitStreetViewPanorama(com.google.android.gms.maps.StreetViewPanoramaView streetViewPanoramaView, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.StreetViewPanorama> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(safeContinuation));
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private static final java.lang.Object awaitStreetViewPanorama$$forInline(com.google.android.gms.maps.StreetViewPanoramaView streetViewPanoramaView, kotlin.coroutines.Continuation<? super com.google.android.gms.maps.StreetViewPanorama> continuation) {
        kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(safeContinuation));
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.StreetViewPanoramaCamera> cameraChangeEvents(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1(streetViewPanorama, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.StreetViewPanoramaLocation> changeEvents(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1(streetViewPanorama, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.StreetViewPanoramaOrientation> clickEvents(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1(streetViewPanorama, null));
    }

    public static final kotlinx.coroutines.flow.Flow<com.google.android.gms.maps.model.StreetViewPanoramaOrientation> longClickEvents(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetViewPanorama, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1(streetViewPanorama, null));
    }
}
