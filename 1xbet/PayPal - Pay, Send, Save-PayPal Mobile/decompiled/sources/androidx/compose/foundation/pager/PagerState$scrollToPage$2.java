package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class PagerState$scrollToPage$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        int Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
            if (highSpeedVideoSizes == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        float f = this.getHighSpeedVideoFpsRanges;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("pageOffsetFraction ");
            sb.append(f);
            sb.append(" is not within the range -0.5 to 0.5");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor.snapToItem$foundation(Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, true);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.pager.PagerState$scrollToPage$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.pager.PagerState$scrollToPage$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagerState$scrollToPage$2(androidx.compose.foundation.pager.PagerState pagerState, float f, int i, kotlin.coroutines.Continuation<? super androidx.compose.foundation.pager.PagerState$scrollToPage$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pagerState;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = i;
    }
}
