package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"}, v = 1)
/* loaded from: classes6.dex */
final class ComposeScrollCaptureCallback$scrollTracker$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.semantics.SemanticsNode semanticsNode;
        androidx.compose.ui.semantics.SemanticsNode semanticsNode2;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighResolutionOutputSizeshNQ4ISI;
            semanticsNode = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object> scrollCaptureScrollByAction = androidx.compose.ui.scrollcapture.ScrollCapture_androidKt.getScrollCaptureScrollByAction(semanticsNode);
            if (scrollCaptureScrollByAction != null) {
                semanticsNode2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                boolean reverseScrolling = ((androidx.compose.ui.semantics.ScrollAxisRange) semanticsNode2.getUnmergedConfig().get(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
                if (reverseScrolling) {
                    f = -f;
                }
                androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L)));
                this.getHighSpeedVideoFpsRangesFor = reverseScrolling;
                this.Camera2StreamConfigurationMap = 1;
                obj = scrollCaptureScrollByAction.invoke(m5741boximpl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = reverseScrolling;
            } else {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                throw new kotlin.KotlinNothingValueException();
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(z ? -java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return ((androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1) create(java.lang.Float.valueOf(f.floatValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1(this.getHighSpeedVideoFpsRanges, continuation);
        composeScrollCaptureCallback$scrollTracker$1.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeScrollCaptureCallback$scrollTracker$1(androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback composeScrollCaptureCallback, kotlin.coroutines.Continuation<? super androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = composeScrollCaptureCallback;
    }
}
