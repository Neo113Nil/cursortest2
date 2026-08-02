package com.paypal.oslo.feature.wallet.banks.ui.oauthcallback;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1", f = "BankOAuthCallbackScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.LoggerKt.log.i(">>> BANK OAUTH CALLBACK RECEIVED <<<", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregatorName", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("countryCode", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, this.getOutputMinFrameDuration), kotlin.TuplesKt.to("bankName", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("error", this.getHighSpeedVideoFpsRanges)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", this.getHighSpeedVideoSizesFor), kotlin.TuplesKt.to("credentialTokenCode", this.getHighResolutionOutputSizeshNQ4ISI)));
        if (this.getHighSpeedVideoFpsRanges != null) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, ">>> OAUTH ERROR <<<", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", this.getHighSpeedVideoFpsRanges)), null, null, 12, null);
            this.getInputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        java.lang.String str2 = this.getHighSpeedVideoSizes;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || (str = this.getHighSpeedVideoSizesFor) == null || kotlin.text.StringsKt.isBlank(str)) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.wallet.LoggerKt.log, ">>> MISSING REQUIRED PARAMS <<<", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregatorName", this.getHighSpeedVideoSizes)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", this.getHighSpeedVideoSizesFor)), null, 8, null);
            this.getInputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.oslo.feature.wallet.LoggerKt.log.i(">>> NAVIGATING TO AUTOLINK <<<", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("aggregatorName", this.getHighSpeedVideoSizes), kotlin.TuplesKt.to("bankName", this.Camera2StreamConfigurationMap)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("externalBankId", this.getHighSpeedVideoSizesFor), kotlin.TuplesKt.to("credentialToken", this.getHighResolutionOutputSizeshNQ4ISI)));
        java.lang.String str3 = this.getHighSpeedVideoSizes;
        java.lang.String str4 = this.getHighSpeedVideoSizesFor;
        java.lang.String str5 = this.getHighSpeedVideoFpsRangesFor;
        if (str5 == null) {
            str5 = "US";
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = this.getOutputMinFrameDuration;
        if (str7 == null) {
            str7 = "OAUTH2";
        }
        final com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink = new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink(str3, str4, str6, str7, this.Camera2StreamConfigurationMap, (java.lang.String) null, this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction.ADD, (com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails) null, (java.lang.String) null, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        this.getInputFormats.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.wallet.wallet.ui.Destination.AutoLink autoLink, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(autoLink);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.oauthcallback.BankOAuthCallbackScreenKt$BankOAuthCallbackScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoFpsRangesFor = str4;
        this.getOutputMinFrameDuration = str5;
        this.Camera2StreamConfigurationMap = str6;
        this.getHighSpeedVideoFpsRanges = str7;
        this.getInputFormats = appNavigator;
    }
}
