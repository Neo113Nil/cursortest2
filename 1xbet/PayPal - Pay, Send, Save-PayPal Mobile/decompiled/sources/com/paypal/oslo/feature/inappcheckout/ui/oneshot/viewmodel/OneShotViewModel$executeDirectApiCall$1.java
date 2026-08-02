package com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$executeDirectApiCall$1", f = "OneShotViewModel.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, l = {120, 134, 142, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m = "invokeSuspend", n = {"checkoutToken", "checkoutToken", "tokenType", "tokenValue", "checkoutToken", "tokenType", "tokenValue", "this_$iv", "response", "$i$f$fold", "$i$a$-fold-OneShotViewModel$executeDirectApiCall$1$2", "checkoutToken", "tokenType", "tokenValue", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-OneShotViewModel$executeDirectApiCall$1$1"}, nl = {127, 137, 143, 140}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class OneShotViewModel$executeDirectApiCall$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0112, code lost:
    
        if (com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.access$handleSuccess(r8, r3, r16) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014a, code lost:
    
        if (com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.access$handleError(r8, r4, r16) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.access$handleError(r16.getOutputFormats, new com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity("MISSING_CHECKOUT_TOKEN", "Checkout token is not available in session", false, null, null, 24, null), r16) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
        java.lang.String rawValue;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.InitializeNativeRypCheckoutUseCase initializeNativeRypCheckoutUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken;
        java.lang.String str;
        com.paypal.oslo.feature.inappcheckout.domain.provider.mock.MockFileNameProvider mockFileNameProvider;
        arrow.core.Either either;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appSwitchSession = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken2 = appSwitchSession.getCheckoutToken();
            if (checkoutToken2 == null) {
                mockFileNameProvider = this.getOutputFormats.Camera2StreamConfigurationMap;
                java.lang.String getOutputMinFrameDuration = mockFileNameProvider.getGetOutputMinFrameDuration();
                checkoutToken2 = getOutputMinFrameDuration != null ? new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.BAToken(getOutputMinFrameDuration) : null;
            }
            if (checkoutToken2 == null) {
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken2);
                this.getInputFormats = 1;
            } else {
                rawValue = checkoutToken2.getType().getRawValue();
                java.lang.String value = checkoutToken2.getValue();
                initializeNativeRypCheckoutUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken2);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawValue);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                this.getInputFormats = 2;
                invoke = initializeNativeRypCheckoutUseCase.invoke(value, rawValue, this);
                if (invoke != coroutine_suspended) {
                    checkoutToken = checkoutToken2;
                    str = value;
                    either = (arrow.core.Either) invoke;
                    com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel = this.getOutputFormats;
                    if (!(either instanceof arrow.core.Either.Right)) {
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        if (i == 2) {
            str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken3 = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            checkoutToken = checkoutToken3;
            rawValue = str2;
            invoke = obj;
            either = (arrow.core.Either) invoke;
            com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel2 = this.getOutputFormats;
            if (!(either instanceof arrow.core.Either.Right)) {
                com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity initializeNativeRypCheckoutResponseEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.InitializeNativeRypCheckoutResponseEntity) ((arrow.core.Either.Right) either).getValue();
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawValue);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initializeNativeRypCheckoutResponseEntity);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getInputFormats = 3;
            } else if (either instanceof arrow.core.Either.Left) {
                com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue();
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutToken);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rawValue);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(nativeXOErrorEntity);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getInputFormats = 4;
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            if (i == 3) {
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$executeDirectApiCall$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$executeDirectApiCall$1(this.getOutputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneShotViewModel$executeDirectApiCall$1(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$executeDirectApiCall$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = oneShotViewModel;
    }
}
