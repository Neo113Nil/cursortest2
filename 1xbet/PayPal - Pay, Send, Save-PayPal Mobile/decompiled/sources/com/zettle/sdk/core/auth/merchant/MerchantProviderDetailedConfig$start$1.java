package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/zettle/sdk/core/auth/LoggedInState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1", f = "MerchantProviderDetailedConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$start$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.zettle.sdk.core.auth.LoggedInState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.zettle.sdk.commons.state.MutableState mutableState;
        androidx.view.MutableLiveData mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2;
        com.zettle.sdk.commons.state.MutableState mutableState2;
        androidx.view.MutableLiveData mutableLiveData3;
        androidx.view.MutableLiveData mutableLiveData4;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (((com.zettle.sdk.core.auth.LoggedInState) this.Camera2StreamConfigurationMap) instanceof com.zettle.sdk.core.auth.LoggedInState.LoggedIn) {
            java.lang.Object mo23163getUserConfigd1pmJ48 = this.getHighSpeedVideoFpsRanges.mo23163getUserConfigd1pmJ48();
            final com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = (com.zettle.sdk.core.user.userconfig.DetailedUserConfig) (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48) ? null : mo23163getUserConfigd1pmJ48);
            com.zettle.sdk.core.log.LogKt.log(this.getHighSpeedVideoFpsRanges, "## Updating with config -> ".concat(java.lang.String.valueOf(detailedUserConfig)));
            mutableState2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            mutableState2.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1.1
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
                    return com.zettle.sdk.core.user.userconfig.DetailedUserConfig.this;
                }

                {
                    super(1);
                }
            });
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = detailedUserConfig;
            if (detailedUserConfig != null) {
                com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig = this.getHighSpeedVideoFpsRanges;
                com.zettle.sdk.core.auth.User.AuthState.LoggedIn loggedIn = new com.zettle.sdk.core.auth.User.AuthState.LoggedIn(com.zettle.sdk.core.auth.UserKt.toInfo(detailedUserConfig), com.zettle.sdk.core.auth.UserKt.toPaymentInfo(detailedUserConfig));
                mutableLiveData3 = merchantProviderDetailedConfig.getInputSizeshNQ4ISI;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableLiveData3.getValue(), loggedIn)) {
                    mutableLiveData4 = merchantProviderDetailedConfig.getInputSizeshNQ4ISI;
                    mutableLiveData4.postValue(loggedIn);
                }
            }
        } else {
            com.zettle.sdk.core.log.LogKt.log(this.getHighSpeedVideoFpsRanges, "## Clearing user config.");
            mutableState = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            mutableState.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1.3
                @Override // kotlin.jvm.functions.Function1
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
                    return null;
                }
            });
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = null;
            mutableLiveData = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableLiveData.getValue(), com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE)) {
                mutableLiveData2 = this.getHighSpeedVideoFpsRanges.getInputSizeshNQ4ISI;
                mutableLiveData2.postValue(com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.zettle.sdk.core.auth.LoggedInState loggedInState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1) create(loggedInState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1 merchantProviderDetailedConfig$start$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1(this.getHighSpeedVideoFpsRanges, continuation);
        merchantProviderDetailedConfig$start$1.Camera2StreamConfigurationMap = obj;
        return merchantProviderDetailedConfig$start$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$start$1(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$start$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = merchantProviderDetailedConfig;
    }
}
