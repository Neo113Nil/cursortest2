package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1", f = "Authenticate.kt", i = {1, 2, 2}, l = {159, 160, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {"isInContextEnabled", "rememberedUserData", "isInContextEnabled"}, nl = {160, 163, 179}, s = {"Z$0", "L$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class AuthenticateKt$Authenticate$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.identity.domain.model.AuthenticationContext Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.Intent getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r7 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (r7 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            obj = this.getOutputFormats.isInContextLoginEnabled(this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputFormats.processEvent(new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.NativeAuthInitialized(((java.lang.Boolean) obj).booleanValue(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes == com.paypal.oslo.feature.identity.api.Intent.LINK_ACCOUNT, this.Camera2StreamConfigurationMap));
                return kotlin.Unit.INSTANCE;
            }
            booleanValue = this.getInputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.Pair pair = (kotlin.Pair) obj;
            if (this.getHighResolutionOutputSizeshNQ4ISI != null && booleanValue && pair != null) {
                this.getOutputFormats.processEvent(new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateEvent.InContextAuthOptionsPrefetched(this.getHighSpeedVideoFpsRanges, (java.lang.String) pair.component1(), (java.lang.String) pair.component2(), this.getHighSpeedVideoFpsRangesFor));
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(pair);
            this.getInputFormats = booleanValue;
            this.getInputSizeshNQ4ISI = 3;
            obj = this.getOutputFormats.hasRememberedUser(this);
        }
        booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.getInputFormats = booleanValue;
        this.getInputSizeshNQ4ISI = 2;
        obj = this.getOutputFormats.getRememberedUserData(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AuthenticateKt$Authenticate$6$1(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, com.paypal.oslo.feature.identity.logincontroller.LoginEffectResolver loginEffectResolver, java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, java.lang.String str, com.paypal.oslo.feature.identity.api.Intent intent, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateKt$Authenticate$6$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = authenticateViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = loginEffectResolver;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = intent;
        this.Camera2StreamConfigurationMap = authenticationContext;
    }
}
