package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", i = {}, l = {538, 539}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailOverrideScope Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailState getHighSpeedVideoFpsRanges;
    /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r5.Camera2StreamConfigurationMap.getState().collapse(r5) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r5.getHighSpeedVideoFpsRanges.settle$material3(r6, r5) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            float f = this.getHighSpeedVideoFpsRangesFor;
            if (this.Camera2StreamConfigurationMap.getShouldHideOnCollapse()) {
                this.getHighSpeedVideoSizes = 1;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!androidx.compose.material3.WideNavigationRailStateKt.isExpanded(this.getHighSpeedVideoFpsRanges.getTargetValue())) {
            this.getHighSpeedVideoSizes = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1) create(java.lang.Float.valueOf(f.floatValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 = new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1.getHighSpeedVideoFpsRangesFor = ((java.lang.Number) obj).floatValue();
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState, kotlin.coroutines.Continuation<? super androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = modalWideNavigationRailOverrideScope;
        this.getHighSpeedVideoFpsRanges = modalWideNavigationRailState;
    }
}
