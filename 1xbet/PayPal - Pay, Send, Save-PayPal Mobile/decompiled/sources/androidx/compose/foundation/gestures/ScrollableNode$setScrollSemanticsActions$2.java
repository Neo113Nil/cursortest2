package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "offset"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", i = {}, l = {579}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollableNode$setScrollSemanticsActions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object> {
    /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollableNode getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic;
        java.lang.Object highSpeedVideoSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        scrollingLogic = this.getHighSpeedVideoFpsRanges.getOutputMinFrameDuration;
        this.getHighSpeedVideoSizes = 1;
        highSpeedVideoSizes = androidx.compose.foundation.gestures.ScrollableKt.getHighSpeedVideoSizes(scrollingLogic, j, this);
        return highSpeedVideoSizes == coroutine_suspended ? coroutine_suspended : highSpeedVideoSizes;
    }

    private java.lang.Object getHighSpeedVideoFpsRangesFor(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2) create(androidx.compose.ui.geometry.Offset.m5741boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        return getHighSpeedVideoFpsRangesFor(offset.m5762unboximpl(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2(this.getHighSpeedVideoFpsRanges, continuation);
        scrollableNode$setScrollSemanticsActions$2.getHighResolutionOutputSizeshNQ4ISI = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return scrollableNode$setScrollSemanticsActions$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNode$setScrollSemanticsActions$2(androidx.compose.foundation.gestures.ScrollableNode scrollableNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = scrollableNode;
    }
}
