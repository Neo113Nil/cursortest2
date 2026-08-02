package com.datadog.android.compose.internal;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.datadog.android.compose.internal.InternalInteractionTrackingKt", f = "InternalInteractionTracking.kt", i = {}, l = {98}, m = "trackDragInteraction", n = {}, s = {})
/* loaded from: classes7.dex */
final class InternalInteractionTrackingKt$trackDragInteraction$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.datadog.android.compose.internal.InternalInteractionTrackingKt.trackDragInteraction(null, null, null, this);
    }

    InternalInteractionTrackingKt$trackDragInteraction$1(kotlin.coroutines.Continuation<? super com.datadog.android.compose.internal.InternalInteractionTrackingKt$trackDragInteraction$1> continuation) {
        super(continuation);
    }
}
