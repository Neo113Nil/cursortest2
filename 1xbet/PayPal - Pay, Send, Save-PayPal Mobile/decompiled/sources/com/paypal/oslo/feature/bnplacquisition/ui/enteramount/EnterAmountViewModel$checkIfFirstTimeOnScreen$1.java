package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkIfFirstTimeOnScreen$1", f = "EnterAmountViewModel.kt", i = {1}, l = {160, 163}, m = "invokeSuspend", n = {"hasEntered"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {"Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountViewModel$checkIfFirstTimeOnScreen$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1.markEnteredEnterAmountScreen(r4) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r5 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sessionStorage = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            obj = sessionStorage.hasEnteredEnterAmountScreen(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountEvent.HowItWorksPressed.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue) {
            sessionStorage2 = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
            this.Camera2StreamConfigurationMap = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkIfFirstTimeOnScreen$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkIfFirstTimeOnScreen$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountViewModel$checkIfFirstTimeOnScreen$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel enterAmountViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountViewModel$checkIfFirstTimeOnScreen$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = enterAmountViewModel;
    }
}
