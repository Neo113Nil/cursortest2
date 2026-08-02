package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {1344}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.BottomAppBarScrollBehavior Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ float getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.material3.AppBarKt.access$settleAppBarBottom(this.Camera2StreamConfigurationMap.getGetHighSpeedVideoSizes(), f, this.Camera2StreamConfigurationMap.getFlingAnimationSpec(), this.Camera2StreamConfigurationMap.getSnapAnimationSpec(), this) == coroutine_suspended) {
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
        androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 appBarKt$BottomAppBarLayout$appBarDragModifier$2$1 = new androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(this.Camera2StreamConfigurationMap, continuation);
        appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.getHighSpeedVideoSizes = floatValue;
        return appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(androidx.compose.material3.BottomAppBarScrollBehavior bottomAppBarScrollBehavior, kotlin.coroutines.Continuation<? super androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = bottomAppBarScrollBehavior;
    }
}
