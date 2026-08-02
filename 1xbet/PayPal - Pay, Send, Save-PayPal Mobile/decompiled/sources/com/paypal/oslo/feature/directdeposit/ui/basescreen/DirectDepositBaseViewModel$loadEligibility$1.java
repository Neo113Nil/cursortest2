package com.paypal.oslo.feature.directdeposit.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1", f = "DirectDepositBaseViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, nl = {99}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositBaseViewModel$loadEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.directdeposit.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState;
                    directDepositBaseUiState = com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Loading.INSTANCE;
                    return directDepositBaseUiState;
                }
            });
            getBankingBundleEligibilityUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = getBankingBundleEligibilityUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        final com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            final com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult = (com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult) ((arrow.core.Either.Right) either).getValue();
            directDepositBaseViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult.this, directDepositBaseViewModel);
                }
            });
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError bankingBundleEligibilityError = (com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError) ((arrow.core.Either.Left) either).getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(bankingBundleEligibilityError, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Network.INSTANCE)) {
                directDepositBaseViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState;
                        directDepositBaseUiState = com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.NetworkError.INSTANCE;
                        return directDepositBaseUiState;
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(bankingBundleEligibilityError, com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityError.Unknown.INSTANCE)) {
                directDepositBaseViewModel.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState;
                        directDepositBaseUiState = com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Error.INSTANCE;
                        return directDepositBaseUiState;
                    }
                });
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState Camera2StreamConfigurationMap(com.paypal.oslo.feature.bankingbundle.api.domain.BankingBundleEligibilityResult bankingBundleEligibilityResult, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel) {
        com.paypal.oslo.feature.directdeposit.manager.DirectDepositFeatureManager directDepositFeatureManager;
        int i = com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1.WhenMappings.$EnumSwitchMapping$0[bankingBundleEligibilityResult.getStatus().ordinal()];
        boolean z = true;
        if (i == 1) {
            return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Eligible.INSTANCE;
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Ineligible.INSTANCE;
        }
        java.util.List<com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct> products = bankingBundleEligibilityResult.getProducts();
        if (!(products instanceof java.util.Collection) || !products.isEmpty()) {
            for (com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct bundleProduct : products) {
                if (bundleProduct == com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.PAYPAL_CASH_PLUS || bundleProduct == com.paypal.oslo.feature.bankingbundle.api.domain.BundleProduct.CONSUMER_VIRTUAL_BANK_ACCOUNT) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            directDepositFeatureManager = directDepositBaseViewModel.Camera2StreamConfigurationMap;
            if (directDepositFeatureManager.isBundleEnrollmentEnabled()) {
                return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.BundleProvisioned.INSTANCE;
            }
        }
        if (z) {
            return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Ineligible.INSTANCE;
        }
        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Eligible.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.BUNDLE_PROVISIONED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.ELIGIBLE_WITH_CONDITION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.bankingbundle.api.domain.EligibilityStatus.INELIGIBLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositBaseViewModel$loadEligibility$1(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel$loadEligibility$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = directDepositBaseViewModel;
    }
}
