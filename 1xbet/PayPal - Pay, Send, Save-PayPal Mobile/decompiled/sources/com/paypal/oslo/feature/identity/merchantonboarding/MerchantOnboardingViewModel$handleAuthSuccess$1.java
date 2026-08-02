package com.paypal.oslo.feature.identity.merchantonboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1", f = "MerchantOnboardingViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {68, 85, 74}, m = "invokeSuspend", n = {"request", "request", "this_$iv", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "$i$f$fold", "$i$a$-fold-MerchantOnboardingViewModel$handleAuthSuccess$1$2", "request", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-MerchantOnboardingViewModel$handleAuthSuccess$1$1"}, nl = {131, 90, 75}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class MerchantOnboardingViewModel$handleAuthSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
    
        if (r5.invoke(r6, r8, r14) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0119, code lost:
    
        if (r4.emit(r5, r14) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.api.CodeToTokenExchange codeToTokenExchange;
        com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest codeToTokenExchangeRequest;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase updateTokenUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String obj2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest codeToTokenExchangeRequest2 = new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest(this.Camera2StreamConfigurationMap, obj2, this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.createMerchantOnboardingAuthContext());
            codeToTokenExchange = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeRequest2);
            this.getInputFormats = 1;
            obj = codeToTokenExchange.exchange(codeToTokenExchangeRequest2, this);
            if (obj != coroutine_suspended) {
                codeToTokenExchangeRequest = codeToTokenExchangeRequest2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        codeToTokenExchangeRequest = (com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeRequest) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Either either = (arrow.core.Either) obj;
        final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel = this.getHighSpeedVideoSizesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData codeToTokenExchangeData = (com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData) ((arrow.core.Either.Right) either).getValue();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Merchant onboarding token exchange succeeded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expiresInSec", java.lang.String.valueOf(codeToTokenExchangeData.getExpiresInSec()))), null, 4, null);
            updateTokenUseCase = merchantOnboardingViewModel.getHighSpeedVideoFpsRanges;
            java.lang.String token = codeToTokenExchangeData.getToken();
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.this, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeRequest);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeData);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputFormats = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError codeToTokenExchangeError = (com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(codeToTokenExchangeError.getClass()).getSimpleName();
            com.paypal.android.logger.Logger.w$default(logger, "Merchant onboarding token exchange failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "")), null, 4, null);
            mutableSharedFlow = merchantOnboardingViewModel.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack goBack = com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.NavigationEvent.GoBack.INSTANCE;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeRequest);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenExchangeError);
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputFormats = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, boolean z) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(merchantOnboardingViewModel), null, null, new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1$2$1$1(merchantOnboardingViewModel, z, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOnboardingViewModel$handleAuthSuccess$1(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel$handleAuthSuccess$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizesFor = merchantOnboardingViewModel;
    }
}
