package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {2555}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SingleRowTopAppBarOverrideScope getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.compose.material3.AppBarKt.access$settleAppBar(this.getHighSpeedVideoFpsRanges.getScrollBehavior().getGetHighSpeedVideoFpsRangesFor(), f, this.getHighSpeedVideoFpsRanges.getScrollBehavior().getFlingAnimationSpec(), this.getHighSpeedVideoFpsRanges.getScrollBehavior().getSnapAnimationSpec(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        float floatValue = f.floatValue();
        androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1 = new androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(this.getHighSpeedVideoFpsRanges, continuation);
        defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.getHighResolutionOutputSizeshNQ4ISI = floatValue;
        return defaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1(androidx.compose.material3.SingleRowTopAppBarOverrideScope singleRowTopAppBarOverrideScope, kotlin.coroutines.Continuation<? super androidx.compose.material3.DefaultSingleRowTopAppBarOverride$SingleRowTopAppBar$appBarDragModifier$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoFpsRanges = singleRowTopAppBarOverrideScope;
    }
}
