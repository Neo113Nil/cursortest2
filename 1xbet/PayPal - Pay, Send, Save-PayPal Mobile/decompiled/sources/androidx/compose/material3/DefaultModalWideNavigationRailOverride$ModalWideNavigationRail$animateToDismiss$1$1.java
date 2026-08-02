package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1", f = "WideNavigationRail.kt", i = {}, l = {531, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.ENROLLMENT_MOBILE_WALLET_ALREADY_ENROLLED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailOverrideScope getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.ModalWideNavigationRailState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r4.getHighResolutionOutputSizeshNQ4ISI.getState().collapse(r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r4.getHighSpeedVideoFpsRangesFor.collapse(r4) != r0) goto L14;
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
            if (this.getHighResolutionOutputSizeshNQ4ISI.getShouldHideOnCollapse()) {
                this.getHighSpeedVideoSizes = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(androidx.compose.material3.ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, androidx.compose.material3.ModalWideNavigationRailState modalWideNavigationRailState, kotlin.coroutines.Continuation<? super androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = modalWideNavigationRailOverrideScope;
        this.getHighSpeedVideoFpsRangesFor = modalWideNavigationRailState;
    }
}
