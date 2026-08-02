package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "offset"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2", f = "Scrollable2D.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Scrollable2DNode$setScrollSemanticsActions$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset>, java.lang.Object> {
    /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.Scrollable2DNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.ScrollingLogic2D scrollingLogic2D;
        java.lang.Object Camera2StreamConfigurationMap;
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
        long j = this.Camera2StreamConfigurationMap;
        scrollingLogic2D = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = 1;
        Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.Scrollable2DKt.Camera2StreamConfigurationMap(scrollingLogic2D, j, this);
        return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
    }

    private java.lang.Object getHighResolutionOutputSizeshNQ4ISI(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        return ((androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2) create(androidx.compose.ui.geometry.Offset.m5741boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        return getHighResolutionOutputSizeshNQ4ISI(offset.m5762unboximpl(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2 scrollable2DNode$setScrollSemanticsActions$2 = new androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        scrollable2DNode$setScrollSemanticsActions$2.Camera2StreamConfigurationMap = ((androidx.compose.ui.geometry.Offset) obj).m5762unboximpl();
        return scrollable2DNode$setScrollSemanticsActions$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Scrollable2DNode$setScrollSemanticsActions$2(androidx.compose.foundation.gestures.Scrollable2DNode scrollable2DNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = scrollable2DNode;
    }
}
