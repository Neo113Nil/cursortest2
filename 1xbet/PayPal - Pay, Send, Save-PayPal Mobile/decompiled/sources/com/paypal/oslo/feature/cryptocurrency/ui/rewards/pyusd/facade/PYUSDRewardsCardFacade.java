package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\u0016\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00103R\u0014\u00105\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00104"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/facade/PYUSDRewardsCardFacade;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getPYUSDRewardsStatusUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsHoldingsUseCase;", "getPYUSDRewardsHoldingsUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;", "updatePYUSDRewardsEnrollmentUseCase", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;", "pyusdRewardsStatusUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;", "pyusdRewardsHoldingsUiMapper", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsHoldingsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "", "isFeatureEnabled", "()Z", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "holdings", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "getRewardsCardUiState", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "holding", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentState", "enroll", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;", "rewardsStatus", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;", "getBadgeInfoForCryptoAsset", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsStatusUi;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/BadgeInfoUi;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rewards/pyusd/PYUSDRewardsStatus;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsHoldingsUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/UpdatePYUSDRewardsEnrollmentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsStatusUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/mapper/PYUSDRewardsHoldingsUiMapper;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRewardsCardFacade {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PYUSDRewardsCardFacade(com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase getPYUSDRewardsHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsStatusUiMapper pYUSDRewardsStatusUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.mapper.PYUSDRewardsHoldingsUiMapper pYUSDRewardsHoldingsUiMapper, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsHoldingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePYUSDRewardsEnrollmentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsStatusUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pYUSDRewardsHoldingsUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = getPYUSDRewardsStatusUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getPYUSDRewardsHoldingsUseCase;
        this.getHighSpeedVideoSizes = updatePYUSDRewardsEnrollmentUseCase;
        this.getHighSpeedVideoFpsRangesFor = pYUSDRewardsStatusUiMapper;
        this.Camera2StreamConfigurationMap = pYUSDRewardsHoldingsUiMapper;
        this.getOutputMinFrameDuration = featureGateManager;
    }

    public final boolean isFeatureEnabled() {
        return this.getOutputMinFrameDuration.isPyusdRewardsEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRewardsCardUiState(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$1 pYUSDRewardsCardFacade$getRewardsCardUiState$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$1) {
            pYUSDRewardsCardFacade$getRewardsCardUiState$1 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$1) continuation;
            if ((pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!isFeatureEnabled() || cryptoHoldings == null) {
                        return null;
                    }
                    pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighResolutionOutputSizeshNQ4ISI = cryptoHoldings;
                    pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getHighSpeedVideoSizes(pYUSDRewardsCardFacade$getRewardsCardUiState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cryptoHoldings = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings) pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj;
                if (pYUSDRewardsStatus != null) {
                    return null;
                }
                return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState(false, this.getHighSpeedVideoFpsRangesFor.map(pYUSDRewardsStatus), this.Camera2StreamConfigurationMap.map(this.getHighResolutionOutputSizeshNQ4ISI.invoke(cryptoHoldings.getHoldings())));
            }
        }
        pYUSDRewardsCardFacade$getRewardsCardUiState$1 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$1(this, continuation);
        java.lang.Object obj2 = pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pYUSDRewardsCardFacade$getRewardsCardUiState$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj2;
        if (pYUSDRewardsStatus != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRewardsCardUiState(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$3 pYUSDRewardsCardFacade$getRewardsCardUiState$3;
        int i;
        com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$3) {
            pYUSDRewardsCardFacade$getRewardsCardUiState$3 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$3) continuation;
            if ((pYUSDRewardsCardFacade$getRewardsCardUiState$3.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                pYUSDRewardsCardFacade$getRewardsCardUiState$3.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = pYUSDRewardsCardFacade$getRewardsCardUiState$3.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pYUSDRewardsCardFacade$getRewardsCardUiState$3.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (isFeatureEnabled() && kotlin.jvm.internal.Intrinsics.areEqual(str, "PYUSD")) {
                        pYUSDRewardsCardFacade$getRewardsCardUiState$3.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        pYUSDRewardsCardFacade$getRewardsCardUiState$3.getHighResolutionOutputSizeshNQ4ISI = cryptoHolding;
                        pYUSDRewardsCardFacade$getRewardsCardUiState$3.Camera2StreamConfigurationMap = 1;
                        obj = getHighSpeedVideoSizes(pYUSDRewardsCardFacade$getRewardsCardUiState$3);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) pYUSDRewardsCardFacade$getRewardsCardUiState$3.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj;
                if (pYUSDRewardsStatus != null) {
                    return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState(false, this.getHighSpeedVideoFpsRangesFor.map(pYUSDRewardsStatus), this.Camera2StreamConfigurationMap.map(cryptoHolding != null ? cryptoHolding.getPyusdRewardHoldings() : null));
                }
                return null;
            }
        }
        pYUSDRewardsCardFacade$getRewardsCardUiState$3 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$getRewardsCardUiState$3(this, continuation);
        java.lang.Object obj2 = pYUSDRewardsCardFacade$getRewardsCardUiState$3.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pYUSDRewardsCardFacade$getRewardsCardUiState$3.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj2;
        if (pYUSDRewardsStatus != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object enroll(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$enroll$1 pYUSDRewardsCardFacade$enroll$1;
        int i;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus pYUSDRewardsStatus;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$enroll$1) {
            pYUSDRewardsCardFacade$enroll$1 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$enroll$1) continuation;
            if ((pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    pYUSDRewardsCardFacade$enroll$1.getHighResolutionOutputSizeshNQ4ISI = pYUSDRewardsCardUiState;
                    pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRangesFor(true, pYUSDRewardsCardFacade$enroll$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pYUSDRewardsCardUiState = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState) pYUSDRewardsCardFacade$enroll$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pYUSDRewardsCardUiState2 = pYUSDRewardsCardUiState;
                pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj;
                if (pYUSDRewardsStatus != null || !pYUSDRewardsStatus.isOptIn()) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState.copy$default(pYUSDRewardsCardUiState2, false, null, null, 6, null);
                }
                return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState.copy$default(pYUSDRewardsCardUiState2, false, this.getHighSpeedVideoFpsRangesFor.map(pYUSDRewardsStatus), null, 4, null);
            }
        }
        pYUSDRewardsCardFacade$enroll$1 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$enroll$1(this, continuation);
        java.lang.Object obj2 = pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pYUSDRewardsCardFacade$enroll$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        pYUSDRewardsCardUiState2 = pYUSDRewardsCardUiState;
        pYUSDRewardsStatus = (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) obj2;
        if (pYUSDRewardsStatus != null) {
        }
        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState.copy$default(pYUSDRewardsCardUiState2, false, null, null, 6, null);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi getBadgeInfoForCryptoAsset(java.lang.String assetSymbol, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsStatusUi rewardsStatus) {
        com.paypal.pds.components.BadgeStyle.Info info;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(assetSymbol, "PYUSD") || rewardsStatus == null) {
            return null;
        }
        if (rewardsStatus.isAccruingRewards()) {
            info = com.paypal.pds.components.BadgeStyle.Positive.INSTANCE;
        } else {
            info = com.paypal.pds.components.BadgeStyle.Info.INSTANCE;
        }
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.BadgeInfoUi(info, rewardsStatus.getFormattedRate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$fetchRewardsStatus$1 pYUSDRewardsCardFacade$fetchRewardsStatus$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$fetchRewardsStatus$1) {
            pYUSDRewardsCardFacade$fetchRewardsStatus$1 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$fetchRewardsStatus$1) continuation;
            if ((pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!isFeatureEnabled()) {
                        return null;
                    }
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase = this.getHighSpeedVideoFpsRanges;
                    pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getPYUSDRewardsStatusUseCase.invoke(pYUSDRewardsCardFacade$fetchRewardsStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either).getValue();
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return null;
            }
        }
        pYUSDRewardsCardFacade$fetchRewardsStatus$1 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$fetchRewardsStatus$1(this, continuation);
        java.lang.Object obj2 = pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pYUSDRewardsCardFacade$fetchRewardsStatus$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus> continuation) {
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$updateEnrollment$1 pYUSDRewardsCardFacade$updateEnrollment$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$updateEnrollment$1) {
            pYUSDRewardsCardFacade$updateEnrollment$1 = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$updateEnrollment$1) continuation;
            if ((pYUSDRewardsCardFacade$updateEnrollment$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pYUSDRewardsCardFacade$updateEnrollment$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pYUSDRewardsCardFacade$updateEnrollment$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pYUSDRewardsCardFacade$updateEnrollment$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.UpdatePYUSDRewardsEnrollmentUseCase updatePYUSDRewardsEnrollmentUseCase = this.getHighSpeedVideoSizes;
                    pYUSDRewardsCardFacade$updateEnrollment$1.getHighSpeedVideoSizes = z;
                    pYUSDRewardsCardFacade$updateEnrollment$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = updatePYUSDRewardsEnrollmentUseCase.invoke(z, pYUSDRewardsCardFacade$updateEnrollment$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = pYUSDRewardsCardFacade$updateEnrollment$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return (com.paypal.oslo.feature.cryptocurrency.domain.model.rewards.pyusd.PYUSDRewardsStatus) ((arrow.core.Either.Right) either).getValue();
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return null;
            }
        }
        pYUSDRewardsCardFacade$updateEnrollment$1 = new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade$updateEnrollment$1(this, continuation);
        java.lang.Object obj2 = pYUSDRewardsCardFacade$updateEnrollment$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pYUSDRewardsCardFacade$updateEnrollment$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
