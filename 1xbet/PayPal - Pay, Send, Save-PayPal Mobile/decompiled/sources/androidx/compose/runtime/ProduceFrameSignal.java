package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "<init>", "()V", "Landroidx/compose/runtime/platform/SynchronizedObject;", "p0", "", "getHighSpeedVideoSizes", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ProduceFrameSignal {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    public final java.lang.Object getHighSpeedVideoSizes(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        synchronized (obj) {
            java.lang.Object obj6 = this.getHighSpeedVideoFpsRangesFor;
            obj2 = androidx.compose.runtime.RecomposerKt.Camera2StreamConfigurationMap;
            if (obj6 == obj2) {
                obj5 = androidx.compose.runtime.RecomposerKt.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoFpsRangesFor = obj5;
                return kotlin.Unit.INSTANCE;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            synchronized (obj) {
                java.lang.Object obj7 = this.getHighSpeedVideoFpsRangesFor;
                obj3 = androidx.compose.runtime.RecomposerKt.Camera2StreamConfigurationMap;
                if (obj7 == obj3) {
                    obj4 = androidx.compose.runtime.RecomposerKt.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = obj4;
                } else {
                    this.getHighSpeedVideoFpsRangesFor = cancellableContinuationImpl2;
                    cancellableContinuationImpl2 = null;
                }
            }
            if (cancellableContinuationImpl2 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            }
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
        }
    }
}
