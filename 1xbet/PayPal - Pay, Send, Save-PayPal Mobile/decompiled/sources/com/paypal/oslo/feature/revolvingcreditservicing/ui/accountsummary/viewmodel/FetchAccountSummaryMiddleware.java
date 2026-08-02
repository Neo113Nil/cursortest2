package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00022\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010!\u001a\u00020\u001c2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#H\u0082@¢\u0006\u0004\b!\u0010%J,\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020*2\u0006\u0010 \u001a\u00020&H\u0082@¢\u0006\u0004\b+\u0010,R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010-R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00100R\u0014\u0010.\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010!\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u00104R\u0014\u00105\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00102\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00107R\u0014\u0010:\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u00108\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/FetchAccountSummaryMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "getAccountSummaryUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "balanceModuleMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;", "recentActivitiesMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;", "cashbackRewardMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "specialFinancingMapper", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "dateFormatterFacade", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;", "getWalletStatusUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;", "getProvisionedWalletTokensUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletToken;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/components/AccountSummaryBottomSheetType;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetAccountSummaryUseCase;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/BalanceModuleUiMapper;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/RecentActivitiesSectionUiStateMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/mapper/CashbackRewardMapper;", "getInputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/specialfinancing/list/mapper/SpecialFinancingMapper;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormatterFacade;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "getOutputFormats", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FetchAccountSummaryMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.starpay.api.StarPayClient getOutputFormats;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper getHighResolutionOutputSizeshNQ4ISI;

    public FetchAccountSummaryMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper balanceModuleUiMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper recentActivitiesSectionUiStateMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper cashbackRewardMapper, com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase getProvisionedWalletTokensUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountSummaryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceModuleUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recentActivitiesSectionUiStateMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashbackRewardMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormatterFacade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(starPayClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWalletStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProvisionedWalletTokensUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = creditProductIdentifier;
        this.Camera2StreamConfigurationMap = getAccountSummaryUseCase;
        this.getHighSpeedVideoSizes = balanceModuleUiMapper;
        this.getHighResolutionOutputSizeshNQ4ISI = recentActivitiesSectionUiStateMapper;
        this.getHighSpeedVideoFpsRanges = cashbackRewardMapper;
        this.getInputFormats = specialFinancingMapper;
        this.getOutputMinFrameDuration = dateFormatterFacade;
        this.getOutputFormats = starPayClient;
        this.getInputSizeshNQ4ISI = getWalletStatusUseCase;
        this.getHighSpeedVideoSizesFor = getProvisionedWalletTokensUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState accountSummaryState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(accountSummaryState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState accountSummaryState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(accountSummaryState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryState.Loading)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(function1, continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010b, code lost:
    
        if (Camera2StreamConfigurationMap(r2, r14, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0143, code lost:
    
        if (Camera2StreamConfigurationMap(r2, r14, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$fetchAccountSummary$1 fetchAccountSummaryMiddleware$fetchAccountSummary$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase getAccountSummaryUseCase;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent accountSummaryEvent;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$fetchAccountSummary$1) {
            fetchAccountSummaryMiddleware$fetchAccountSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$fetchAccountSummary$1) continuation;
            if ((fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats -= 2147483648;
                java.lang.Object obj = fetchAccountSummaryMiddleware$fetchAccountSummary$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getAccountSummaryUseCase = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = this.getHighSpeedVideoFpsRangesFor;
                    fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = function1;
                    fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI = getAccountSummaryUseCase;
                    fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = creditProductIdentifier2;
                    fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats = 1;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(fetchAccountSummaryMiddleware$fetchAccountSummary$1);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        creditProductIdentifier = creditProductIdentifier2;
                        obj = highSpeedVideoFpsRanges;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = fetchAccountSummaryMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap;
                        int i3 = fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function1 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Ior ior = (arrow.core.Ior) obj;
                    if (ior instanceof arrow.core.Ior.Left) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError accountSummaryError = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError) ((arrow.core.Ior.Left) ior).getValue();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.UpdateNeeded.INSTANCE)) {
                            accountSummaryEvent = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnAppUpdateNeeded.INSTANCE;
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Default.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(accountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Network.INSTANCE) && !(accountSummaryError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.CriticalFieldsMissing) && !(accountSummaryError instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.PartialDataAvailable)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            accountSummaryEvent = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed.INSTANCE;
                        }
                        function1.invoke(accountSummaryEvent);
                    } else if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) ((arrow.core.Ior.Right) ior).getValue();
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRanges = 0;
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap = 0;
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats = 3;
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) both.getRightValue();
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function1);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(accountSummaryOverView2);
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRanges = 0;
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.Camera2StreamConfigurationMap = 0;
                        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats = 4;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes;
                getAccountSummaryUseCase = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetAccountSummaryUseCase) fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                creditProductIdentifier = creditProductIdentifier3;
                function1 = function12;
                com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest(creditProductIdentifier, null, (java.util.List) obj, 2, null);
                fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = function1;
                fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI = null;
                fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = null;
                fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats = 2;
                obj = getAccountSummaryUseCase.invoke(servicingOverviewRequest, fetchAccountSummaryMiddleware$fetchAccountSummary$1);
            }
        }
        fetchAccountSummaryMiddleware$fetchAccountSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$fetchAccountSummary$1(this, continuation);
        java.lang.Object obj2 = fetchAccountSummaryMiddleware$fetchAccountSummary$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest(creditProductIdentifier, null, (java.util.List) obj2, 2, null);
        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoFpsRangesFor = function1;
        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighResolutionOutputSizeshNQ4ISI = null;
        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getHighSpeedVideoSizes = null;
        fetchAccountSummaryMiddleware$fetchAccountSummary$1.getInputFormats = 2;
        obj2 = getAccountSummaryUseCase.invoke(servicingOverviewRequest2, fetchAccountSummaryMiddleware$fetchAccountSummary$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r6 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$getExternalWalletTokens$1 fetchAccountSummaryMiddleware$getExternalWalletTokens$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$getExternalWalletTokens$1) {
            fetchAccountSummaryMiddleware$getExternalWalletTokens$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$getExternalWalletTokens$1) continuation;
            if ((fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap -= 2147483648;
                obj = fetchAccountSummaryMiddleware$getExternalWalletTokens$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase getWalletStatusUseCase = this.getInputSizeshNQ4ISI;
                    com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.getOutputFormats;
                    fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap = 1;
                    obj = getWalletStatusUseCase.invoke(starPayClient, fetchAccountSummaryMiddleware$getExternalWalletTokens$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj == com.paypal.oslo.feature.starpay.api.WalletStatus.READY) {
                    return null;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase getProvisionedWalletTokensUseCase = this.getHighSpeedVideoSizesFor;
                com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient2 = this.getOutputFormats;
                fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap = 2;
                java.lang.Object invoke = getProvisionedWalletTokensUseCase.invoke(starPayClient2, fetchAccountSummaryMiddleware$getExternalWalletTokens$1);
                return invoke == coroutine_suspended ? coroutine_suspended : invoke;
            }
        }
        fetchAccountSummaryMiddleware$getExternalWalletTokens$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$getExternalWalletTokens$1(this, continuation);
        obj = fetchAccountSummaryMiddleware$getExternalWalletTokens$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchAccountSummaryMiddleware$getExternalWalletTokens$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (obj == com.paypal.oslo.feature.starpay.api.WalletStatus.READY) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0122, code lost:
    
        if (r2 != r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$onAccountSummaryResult$1 fetchAccountSummaryMiddleware$onAccountSummaryResult$1;
        int i;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function12;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView2;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function13;
        java.lang.Object mapToSpecialFinancingSectionUiState;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState2;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function14;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel4;
        java.lang.Object highSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function15;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview;
        java.lang.Object mapToCashbackRewardUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView4 = accountSummaryOverView;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$onAccountSummaryResult$1) {
            fetchAccountSummaryMiddleware$onAccountSummaryResult$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$onAccountSummaryResult$1) continuation;
            if ((fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.BalanceModuleUiMapper balanceModuleUiMapper = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier4 = this.getHighSpeedVideoFpsRangesFor;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView4;
                    function12 = function1;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = function12;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 1;
                    obj = balanceModuleUiMapper.mapToBalanceModuleUiModel(accountSummaryOverView4, creditProductIdentifier4, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            function13 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor;
                            balanceModuleUiModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats;
                            creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats;
                            balanceModuleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes;
                            function12 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView5 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            accountSummaryOverView2 = accountSummaryOverView5;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) obj;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState mapToAccountFeaturesSection = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountFeaturesSectionUiStateMapperKt.mapToAccountFeaturesSection(accountSummaryOverView2);
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mapToPrioritizedAccountActionSectionUiState = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PrioritizedAccountActionsMapperKt.mapToPrioritizedAccountActionSectionUiState(accountSummaryOverView2);
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations = accountSummaryOverView2.getProductConfigurations();
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper = this.getInputFormats;
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier5 = this.getHighSpeedVideoFpsRangesFor;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel);
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel2;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState6;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = mapToAccountFeaturesSection;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = mapToPrioritizedAccountActionSectionUiState;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = function13;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 3;
                            mapToSpecialFinancingSectionUiState = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt.mapToSpecialFinancingSectionUiState(accountSummaryOverView2, productConfigurations, specialFinancingMapper, creditProductIdentifier5, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                            if (mapToSpecialFinancingSectionUiState != coroutine_suspended) {
                                accountSummarySectionUiState = mapToAccountFeaturesSection;
                                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier6 = creditProductIdentifier;
                                accountSummarySectionUiState2 = accountSummarySectionUiState6;
                                obj = mapToSpecialFinancingSectionUiState;
                                function14 = function12;
                                creditProductIdentifier2 = creditProductIdentifier6;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel5 = balanceModuleUiModel;
                                balanceModuleUiModel3 = balanceModuleUiModel2;
                                accountSummarySectionUiState3 = mapToPrioritizedAccountActionSectionUiState;
                                balanceModuleUiModel4 = balanceModuleUiModel5;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) obj;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview3 = accountSummaryOverView2.getStarPayWalletOverview();
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel4);
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel3;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = accountSummarySectionUiState;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = accountSummarySectionUiState3;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = accountSummarySectionUiState7;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration = starPayWalletOverview3;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor = function13;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 4;
                                highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(accountSummaryOverView2);
                                if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i == 3) {
                            function13 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI;
                            accountSummarySectionUiState3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI;
                            accountSummarySectionUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration;
                            accountSummarySectionUiState2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor;
                            balanceModuleUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats;
                            creditProductIdentifier2 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel6 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes;
                            kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function16 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges;
                            accountSummaryOverView2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            function14 = function16;
                            balanceModuleUiModel4 = balanceModuleUiModel6;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState72 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) obj;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview32 = accountSummaryOverView2.getStarPayWalletOverview();
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function14);
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel4);
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier2;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel3;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState2;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = accountSummarySectionUiState;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = accountSummarySectionUiState3;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = accountSummarySectionUiState72;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration = starPayWalletOverview32;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor = function13;
                            fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 4;
                            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(accountSummaryOverView2);
                            if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
                                kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function17 = function14;
                                accountSummarySectionUiState4 = accountSummarySectionUiState72;
                                obj = highSpeedVideoFpsRangesFor;
                                function15 = function17;
                                accountSummarySectionUiState5 = accountSummarySectionUiState3;
                                starPayWalletOverview = starPayWalletOverview32;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType) obj;
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper cashbackRewardMapper = this.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = accountSummaryOverView2.getRewardsSummary();
                                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier7 = this.getHighSpeedVideoFpsRangesFor;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function15);
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel4);
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel3;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = accountSummarySectionUiState;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = accountSummarySectionUiState5;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = accountSummarySectionUiState4;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration = starPayWalletOverview;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor = accountSummaryBottomSheetType2;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.Camera2StreamConfigurationMap = function13;
                                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 5;
                                mapToCashbackRewardUiModel = cashbackRewardMapper.mapToCashbackRewardUiModel(rewardsSummary, creditProductIdentifier7, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                                coroutine_suspended = coroutine_suspended;
                                if (mapToCashbackRewardUiModel != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            function13 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.Camera2StreamConfigurationMap;
                            com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview starPayWalletOverview4 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration;
                            accountSummarySectionUiState4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI;
                            accountSummarySectionUiState5 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI;
                            accountSummarySectionUiState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration;
                            accountSummarySectionUiState2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor;
                            balanceModuleUiModel3 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats;
                            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier8 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats;
                            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView6 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            accountSummaryBottomSheetType = accountSummaryBottomSheetType3;
                            creditProductIdentifier3 = creditProductIdentifier8;
                            starPayWalletOverview2 = starPayWalletOverview4;
                            accountSummaryOverView3 = accountSummaryOverView6;
                            function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded(creditProductIdentifier3, accountSummaryOverView3, balanceModuleUiModel3, accountSummarySectionUiState2, accountSummarySectionUiState, accountSummarySectionUiState4, accountSummarySectionUiState5, starPayWalletOverview2, accountSummaryBottomSheetType, (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel) obj));
                            return kotlin.Unit.INSTANCE;
                        }
                        function13 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor;
                        starPayWalletOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.StarPayWalletOverview) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState8 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> accountSummarySectionUiState9 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState10 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState11 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel balanceModuleUiModel7 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats;
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier9 = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats;
                        balanceModuleUiModel4 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function18 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView7 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        accountSummarySectionUiState4 = accountSummarySectionUiState8;
                        accountSummarySectionUiState5 = accountSummarySectionUiState9;
                        accountSummarySectionUiState = accountSummarySectionUiState10;
                        accountSummarySectionUiState2 = accountSummarySectionUiState11;
                        balanceModuleUiModel3 = balanceModuleUiModel7;
                        creditProductIdentifier2 = creditProductIdentifier9;
                        function15 = function18;
                        accountSummaryOverView2 = accountSummaryOverView7;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType accountSummaryBottomSheetType22 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType) obj;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.CashbackRewardMapper cashbackRewardMapper2 = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary2 = accountSummaryOverView2.getRewardsSummary();
                        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier72 = this.getHighSpeedVideoFpsRangesFor;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function15);
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel4);
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier2;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel3;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState2;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = accountSummarySectionUiState;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = accountSummarySectionUiState5;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = accountSummarySectionUiState4;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDuration = starPayWalletOverview;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRangesFor = accountSummaryBottomSheetType22;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.Camera2StreamConfigurationMap = function13;
                        fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 5;
                        mapToCashbackRewardUiModel = cashbackRewardMapper2.mapToCashbackRewardUiModel(rewardsSummary2, creditProductIdentifier72, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                        coroutine_suspended = coroutine_suspended;
                        if (mapToCashbackRewardUiModel != coroutine_suspended) {
                            accountSummaryBottomSheetType = accountSummaryBottomSheetType22;
                            obj = mapToCashbackRewardUiModel;
                            creditProductIdentifier3 = creditProductIdentifier2;
                            starPayWalletOverview2 = starPayWalletOverview;
                            accountSummaryOverView3 = accountSummaryOverView2;
                            function13.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoaded(creditProductIdentifier3, accountSummaryOverView3, balanceModuleUiModel3, accountSummarySectionUiState2, accountSummarySectionUiState, accountSummarySectionUiState4, accountSummarySectionUiState5, starPayWalletOverview2, accountSummaryBottomSheetType, (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.CashbackRewardUiModel) obj));
                            return kotlin.Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> function19 = (kotlin.jvm.functions.Function1) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView8 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function12 = function19;
                    accountSummaryOverView4 = accountSummaryOverView8;
                }
                balanceModuleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) obj;
                if (balanceModuleUiModel != null) {
                    function12.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent.OnDataLoadFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier10 = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.RecentActivitiesSectionUiStateMapper recentActivitiesSectionUiStateMapper = this.getHighResolutionOutputSizeshNQ4ISI;
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView4;
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel);
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier10;
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel;
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = function12;
                fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 2;
                java.lang.Object mapToRecentActivitiesUiState = recentActivitiesSectionUiStateMapper.mapToRecentActivitiesUiState(accountSummaryOverView4, creditProductIdentifier10, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                if (mapToRecentActivitiesUiState != coroutine_suspended) {
                    accountSummaryOverView2 = accountSummaryOverView4;
                    creditProductIdentifier = creditProductIdentifier10;
                    obj = mapToRecentActivitiesUiState;
                    balanceModuleUiModel2 = balanceModuleUiModel;
                    function13 = function12;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState accountSummarySectionUiState62 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState) obj;
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState mapToAccountFeaturesSection2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.AccountFeaturesSectionUiStateMapperKt.mapToAccountFeaturesSection(accountSummaryOverView2);
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.AccountSummarySectionUiState<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.prioritizedaccountactionmodule.PrioritizedAccountActionSectionUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mapToPrioritizedAccountActionSectionUiState2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.PrioritizedAccountActionsMapperKt.mapToPrioritizedAccountActionSectionUiState(accountSummaryOverView2);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations2 = accountSummaryOverView2.getProductConfigurations();
                    com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper specialFinancingMapper2 = this.getInputFormats;
                    com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier52 = this.getHighSpeedVideoFpsRangesFor;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighResolutionOutputSizeshNQ4ISI = accountSummaryOverView2;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(function12);
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balanceModuleUiModel);
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputFormats = creditProductIdentifier;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputFormats = balanceModuleUiModel2;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getHighSpeedVideoSizesFor = accountSummarySectionUiState62;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDuration = mapToAccountFeaturesSection2;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getInputSizeshNQ4ISI = mapToPrioritizedAccountActionSectionUiState2;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputSizeshNQ4ISI = function13;
                    fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM = 3;
                    mapToSpecialFinancingSectionUiState = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.mapper.SpecialFinancingSectionUiStateMapperKt.mapToSpecialFinancingSectionUiState(accountSummaryOverView2, productConfigurations2, specialFinancingMapper2, creditProductIdentifier52, fetchAccountSummaryMiddleware$onAccountSummaryResult$1);
                    if (mapToSpecialFinancingSectionUiState != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        fetchAccountSummaryMiddleware$onAccountSummaryResult$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.FetchAccountSummaryMiddleware$onAccountSummaryResult$1(this, continuation);
        java.lang.Object obj2 = fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchAccountSummaryMiddleware$onAccountSummaryResult$1.getOutputStallDurationlomOqCM;
        if (i != 0) {
        }
        balanceModuleUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.balancemodule.BalanceModuleUiModel) obj2;
        if (balanceModuleUiModel != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r12.getEnrolled() != true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView p0) {
        boolean z;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount minimumPaymentDue;
        java.lang.String value;
        java.lang.Double doubleOrNull;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount pastDueAmount;
        java.lang.String value2;
        java.lang.Double doubleOrNull2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountOverview accountOverview = p0.getAccountOverview();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing billing = accountOverview != null ? accountOverview.getBilling() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = p0.getAutopayOverview();
        double doubleValue = (billing == null || (pastDueAmount = billing.getPastDueAmount()) == null || (value2 = pastDueAmount.getValue()) == null || (doubleOrNull2 = kotlin.text.StringsKt.toDoubleOrNull(value2)) == null) ? 0.0d : doubleOrNull2.doubleValue();
        double doubleValue2 = (billing == null || (minimumPaymentDue = billing.getMinimumPaymentDue()) == null || (value = minimumPaymentDue.getValue()) == null || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(value)) == null) ? 0.0d : doubleOrNull.doubleValue();
        if (autopayOverview != null) {
            z = true;
        }
        z = false;
        java.lang.Boolean effectiveInCurrentBillingCycle = autopayOverview != null ? autopayOverview.getEffectiveInCurrentBillingCycle() : null;
        if (doubleValue > 0.0d && z) {
            return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledWithPaymentDue.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(effectiveInCurrentBillingCycle, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)) && doubleValue2 > 0.0d) {
            java.lang.String format = this.getOutputMinFrameDuration.format(billing != null ? billing.getNextPaymentDueTime() : null, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.utils.LocaleMapperKt.toLocale(this.getHighSpeedVideoFpsRangesFor));
            if (format == null) {
                format = "";
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.AutopayScheduledNextCycle(format);
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.AccountSummaryBottomSheetType.None.INSTANCE;
    }
}
