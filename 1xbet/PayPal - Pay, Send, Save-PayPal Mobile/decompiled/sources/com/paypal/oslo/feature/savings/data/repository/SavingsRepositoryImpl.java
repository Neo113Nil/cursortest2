package com.paypal.oslo.feature.savings.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\rH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\r2\u0006\u0010\u0019\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\r2\u0006\u0010\u0012\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJF\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020&0\r2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b'\u0010(JD\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020.0\r2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\nH\u0096@¢\u0006\u0004\b/\u00100J\"\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001a0\rH\u0096@¢\u0006\u0004\b2\u0010\u0018J8\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002050\r2\u0006\u0010\u0019\u001a\u00020\n2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n03H\u0096@¢\u0006\u0004\b6\u00107JT\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002090\r2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\n2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010*\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096@¢\u0006\u0004\b:\u0010;J,\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020<0\r2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0096@¢\u0006\u0004\b=\u0010\u0011J$\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020@0\r2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\bA\u0010BJZ\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020L0\r2\u0006\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\n2\b\u0010%\u001a\u0004\u0018\u00010\n2\b\u0010E\u001a\u0004\u0018\u00010#2\n\u0010H\u001a\u00060Fj\u0002`G2\n\u0010K\u001a\u00060Ij\u0002`JH\u0096@¢\u0006\u0004\bM\u0010NJ0\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020O0\r2\u0006\u0010C\u001a\u00020\n2\n\u0010H\u001a\u00060Fj\u0002`GH\u0096@¢\u0006\u0004\bP\u0010QJ,\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010R\u001a\u00020\n2\u0006\u0010T\u001a\u00020SH\u0096@¢\u0006\u0004\bU\u0010VJ$\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010W\u001a\u00020SH\u0096@¢\u0006\u0004\bX\u0010YJ$\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020Z0\r2\u0006\u0010\u0019\u001a\u00020\nH\u0096@¢\u0006\u0004\b[\u0010\u001dJ$\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\\0\r2\u0006\u0010)\u001a\u00020\nH\u0096@¢\u0006\u0004\b]\u0010\u001dJ$\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020S0\r2\u0006\u0010)\u001a\u00020\nH\u0096@¢\u0006\u0004\b^\u0010\u001dJ$\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020`0\r2\u0006\u0010?\u001a\u00020_H\u0096@¢\u0006\u0004\ba\u0010bJ\u001c\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020S0\rH\u0096@¢\u0006\u0004\bc\u0010\u0018J\u001c\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\rH\u0096@¢\u0006\u0004\bd\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010eR\u0014\u0010f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bh\u0010iR \u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010kR&\u0010n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0m8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q"}, d2 = {"Lcom/paypal/oslo/feature/savings/data/repository/SavingsRepositoryImpl;", "Lcom/paypal/oslo/feature/savings/domain/repository/SavingsRepository;", "Lcom/paypal/oslo/feature/savings/domain/client/SavingsApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "featureManager", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "currencyFormatter", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/client/SavingsApolloClient;Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;)V", "", "savingsAccountFeaturesCountryCode", "savingsAccountsUserId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "getSavingsHubData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "getSavingsBalance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countryCode", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "fetchGoals", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "fromFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_TYPE, "toFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "amount", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "transferMoneybox", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moneyboxId", "financialInstrumentId", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "transferMoneyboxSchedule", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountInfo;", "getSavingsAccount", "", "extraHeaders", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountEligibility;", "getSavingsAccountEligibility", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleId", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "updateMoneyboxTransferSchedule", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/DeleteMoneyboxTransferScheduleResult;", "deleteMoneyboxTransferSchedule", "Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalInput;", "input", "Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalResult;", "createSavingsGoal", "(Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "name", "targetAmount", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "Lcom/paypal/oslo/feature/savings/graphql/type/MoneyboxCategory;", "category", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;", "Lcom/paypal/oslo/feature/savings/graphql/type/MoneyboxType;", "type", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "updateMoneybox", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/DeleteMoneyboxResult;", "deleteMoneybox", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountId", "", "electronic1099OptIn", "updateTaxStatementDeliveryPreference", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasAcceptedSavingsAccountTermsDisclosures", "updateUserConsent", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageData;", "getSavingsLandingPageData", "Lcom/paypal/oslo/feature/savings/domain/model/goals/GoalSuccessStatus;", "getGoalSuccessStatus", "updateGoalSuccessShown", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "getDepositOptions", "(Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAutoShowTaxPreferencePrompt", "markTaxPreferencePromptShown", "Lcom/paypal/oslo/feature/savings/domain/client/SavingsApolloClient;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/savings/manager/SavingsFeatureManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/savings/util/CurrencyHandlerImpl;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "availableGoals", "Lkotlinx/coroutines/flow/StateFlow;", "getAvailableGoals", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SavingsRepositoryImpl implements com.paypal.oslo.feature.savings.domain.repository.SavingsRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.manager.SavingsFeatureManager Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> availableGoals;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SavingsRepositoryImpl(com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient, com.paypal.oslo.feature.savings.manager.SavingsFeatureManager savingsFeatureManager, com.paypal.oslo.feature.savings.util.CurrencyHandlerImpl currencyHandlerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsApolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyHandlerImpl, "");
        this.getHighSpeedVideoFpsRangesFor = savingsApolloClient;
        this.Camera2StreamConfigurationMap = savingsFeatureManager;
        this.getHighSpeedVideoFpsRanges = currencyHandlerImpl;
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.availableGoals = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>> getAvailableGoals() {
        return this.availableGoals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsHubData(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.SavingsHubData>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsHubData$1 savingsRepositoryImpl$getSavingsHubData$1;
        int i;
        arrow.core.Either either;
        java.lang.Exception e;
        arrow.core.Either either2;
        java.lang.String message;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsHubData$1) {
            savingsRepositoryImpl$getSavingsHubData$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsHubData$1) continuation;
            if ((savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getSavingsHubData$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$getSavingsHubData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI = 1;
                    obj = savingsApolloClient.getSavingsHubData(str, str2, savingsRepositoryImpl$getSavingsHubData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = savingsRepositoryImpl$getSavingsHubData$1.Camera2StreamConfigurationMap;
                        int i3 = savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoSizes;
                        int i4 = savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoFpsRanges;
                        either2 = (arrow.core.Either) savingsRepositoryImpl$getSavingsHubData$1.getInputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return either2;
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.savings.LoggerKt.log;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            logger.w("Failed to update goals data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), kotlin.collections.MapsKt.emptyMap());
                            return either2;
                        }
                    }
                    str2 = (java.lang.String) savingsRepositoryImpl$getSavingsHubData$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_HUB_DATA, "query", either);
                if (either.isRight()) {
                    return either;
                }
                com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData = (com.paypal.oslo.feature.savings.domain.model.SavingsHubData) ((arrow.core.Either.Right) either).getValue();
                try {
                    savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$getSavingsHubData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$getSavingsHubData$1.getInputSizeshNQ4ISI = either;
                    savingsRepositoryImpl$getSavingsHubData$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    savingsRepositoryImpl$getSavingsHubData$1.getOutputFormats = either;
                    savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    savingsRepositoryImpl$getSavingsHubData$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData);
                    savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoFpsRanges = 0;
                    savingsRepositoryImpl$getSavingsHubData$1.getHighSpeedVideoSizes = 0;
                    savingsRepositoryImpl$getSavingsHubData$1.Camera2StreamConfigurationMap = 0;
                    savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI = 2;
                    if (getHighResolutionOutputSizeshNQ4ISI(savingsHubData, savingsRepositoryImpl$getSavingsHubData$1) != coroutine_suspended) {
                        return either;
                    }
                    return coroutine_suspended;
                } catch (java.lang.Exception e3) {
                    e = e3;
                    either2 = either;
                    com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.savings.LoggerKt.log;
                    message = e.getMessage();
                    if (message == null) {
                    }
                    logger2.w("Failed to update goals data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), kotlin.collections.MapsKt.emptyMap());
                    return either2;
                }
            }
        }
        savingsRepositoryImpl$getSavingsHubData$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsHubData$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getSavingsHubData$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getSavingsHubData$1.getOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_HUB_DATA, "query", either);
        if (either.isRight()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalsData$1 savingsRepositoryImpl$updateGoalsData$1;
        int i;
        java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalsData$1) {
            savingsRepositoryImpl$updateGoalsData$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalsData$1) continuation;
            if ((savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$updateGoalsData$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
                    savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData);
                    savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubComponentRegistry);
                    savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRanges = 1;
                    obj = savingsHubComponentRegistry.getSavingsHubTiles(savingsHubData, savingsRepositoryImpl$updateGoalsData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    if (obj2 instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) {
                        arrayList.add(obj2);
                    }
                }
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                goals = goalZoneDTO == null ? goalZoneDTO.getGoals() : null;
                if (goals == null) {
                    goals = kotlin.collections.CollectionsKt.emptyList();
                }
                this.getHighSpeedVideoSizes.setValue(goals);
                return kotlin.Unit.INSTANCE;
            }
        }
        savingsRepositoryImpl$updateGoalsData$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalsData$1(this, continuation);
        java.lang.Object obj3 = savingsRepositoryImpl$updateGoalsData$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateGoalsData$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
        goals = goalZoneDTO2 == null ? goalZoneDTO2.getGoals() : null;
        if (goals == null) {
        }
        this.getHighSpeedVideoSizes.setValue(goals);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsBalance(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsBalance$1 savingsRepositoryImpl$getSavingsBalance$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsBalance$1) {
            savingsRepositoryImpl$getSavingsBalance$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsBalance$1) continuation;
            if ((savingsRepositoryImpl$getSavingsBalance$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getSavingsBalance$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getSavingsBalance$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getSavingsBalance$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getSavingsBalance$1.Camera2StreamConfigurationMap = 1;
                    obj = savingsApolloClient.getSavingsBalance(savingsRepositoryImpl$getSavingsBalance$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_PAYPAL_BALANCE, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getSavingsBalance$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsBalance$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getSavingsBalance$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getSavingsBalance$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_PAYPAL_BALANCE, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchGoals(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoals$1 savingsRepositoryImpl$fetchGoals$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoals$1) {
            savingsRepositoryImpl$fetchGoals$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoals$1) continuation;
            if ((savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$fetchGoals$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getHighSpeedVideoFpsRangesFor(str, savingsRepositoryImpl$fetchGoals$1);
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
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_GOALS, "query", either);
                return either;
            }
        }
        savingsRepositoryImpl$fetchGoals$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoals$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$fetchGoals$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$fetchGoals$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        arrow.core.Either either2 = (arrow.core.Either) obj2;
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_GOALS, "query", either2);
        return either2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0131 A[Catch: all -> 0x0053, RaiseCancellationException -> 0x0056, TRY_LEAVE, TryCatch #5 {RaiseCancellationException -> 0x0056, all -> 0x0053, blocks: (B:12:0x004e, B:13:0x011c, B:14:0x012b, B:16:0x0131, B:20:0x0139, B:25:0x013d, B:27:0x0147, B:28:0x014d, B:30:0x0151, B:31:0x0155, B:32:0x0165, B:34:0x016b, B:41:0x0178, B:37:0x017c, B:44:0x0180), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0147 A[Catch: all -> 0x0053, RaiseCancellationException -> 0x0056, TryCatch #5 {RaiseCancellationException -> 0x0056, all -> 0x0053, blocks: (B:12:0x004e, B:13:0x011c, B:14:0x012b, B:16:0x0131, B:20:0x0139, B:25:0x013d, B:27:0x0147, B:28:0x014d, B:30:0x0151, B:31:0x0155, B:32:0x0165, B:34:0x016b, B:41:0x0178, B:37:0x017c, B:44:0x0180), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151 A[Catch: all -> 0x0053, RaiseCancellationException -> 0x0056, TryCatch #5 {RaiseCancellationException -> 0x0056, all -> 0x0053, blocks: (B:12:0x004e, B:13:0x011c, B:14:0x012b, B:16:0x0131, B:20:0x0139, B:25:0x013d, B:27:0x0147, B:28:0x014d, B:30:0x0151, B:31:0x0155, B:32:0x0165, B:34:0x016b, B:41:0x0178, B:37:0x017c, B:44:0x0180), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b A[Catch: all -> 0x0053, RaiseCancellationException -> 0x0056, TryCatch #5 {RaiseCancellationException -> 0x0056, all -> 0x0053, blocks: (B:12:0x004e, B:13:0x011c, B:14:0x012b, B:16:0x0131, B:20:0x0139, B:25:0x013d, B:27:0x0147, B:28:0x014d, B:30:0x0151, B:31:0x0155, B:32:0x0165, B:34:0x016b, B:41:0x0178, B:37:0x017c, B:44:0x0180), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO>>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$1 savingsRepositoryImpl$fetchGoalsInternal$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.String str2;
        int i2;
        int i3;
        java.lang.Object obj2;
        int i4;
        int i5;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.DefaultRaise defaultRaise3;
        java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$1) {
            savingsRepositoryImpl$fetchGoalsInternal$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$1) continuation;
            if ((savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes -= 2147483648;
                obj = savingsRepositoryImpl$fetchGoalsInternal$1.getOutputStallDurationlomOqCM;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise4 = defaultRaise;
                        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1 savingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1(defaultRaise4, this, null);
                        str2 = str;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRanges = str2;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizesFor = defaultRaise;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise4);
                        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizes = 0;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRangesFor = 0;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        savingsRepositoryImpl$fetchGoalsInternal$1.Camera2StreamConfigurationMap = 0;
                        savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes = 1;
                        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(savingsRepositoryImpl$fetchGoalsInternal$2$moneyboxes$1, savingsRepositoryImpl$fetchGoalsInternal$1);
                        if (coroutineScope != coroutine_suspended) {
                            i2 = 0;
                            i3 = 0;
                            obj2 = defaultRaise4;
                            i4 = 0;
                            obj = coroutineScope;
                            i5 = 0;
                        }
                        return coroutine_suspended;
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise2 = defaultRaise;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = savingsRepositoryImpl$fetchGoalsInternal$1.Camera2StreamConfigurationMap;
                    int i7 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i8 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRangesFor;
                    int i9 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizes;
                    defaultRaise3 = (arrow.core.raise.DefaultRaise) savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj3 : (java.util.List) obj) {
                            if (obj3 instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) {
                                arrayList.add(obj3);
                            }
                        }
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList);
                        goals = goalZoneDTO == null ? goalZoneDTO.getGoals() : null;
                        if (goals == null) {
                            goals = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj4 : goals) {
                            if (((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj4).isGeneralSavingsTile()) {
                                arrayList2.add(obj4);
                            } else {
                                arrayList3.add(obj4);
                            }
                        }
                        kotlin.Pair pair = new kotlin.Pair(arrayList2, arrayList3);
                        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) pair.component1(), (java.lang.Iterable) pair.component2());
                        this.getHighSpeedVideoSizes.setValue(plus);
                        defaultRaise3.complete();
                        return new arrow.core.Either.Right(plus);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise2 = defaultRaise3;
                        defaultRaise2.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise2 = defaultRaise3;
                        defaultRaise2.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                int i10 = savingsRepositoryImpl$fetchGoalsInternal$1.Camera2StreamConfigurationMap;
                int i11 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighResolutionOutputSizeshNQ4ISI;
                int i12 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRangesFor;
                int i13 = savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizes;
                java.lang.Object obj5 = (arrow.core.raise.Raise) savingsRepositoryImpl$fetchGoalsInternal$1.getInputSizeshNQ4ISI;
                defaultRaise2 = (arrow.core.raise.DefaultRaise) savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizesFor;
                java.lang.String str3 = (java.lang.String) savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRanges;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i13;
                    obj2 = obj5;
                    str2 = str3;
                    i4 = i12;
                    i2 = i11;
                    i5 = i10;
                    defaultRaise = defaultRaise2;
                } catch (arrow.core.raise.RaiseCancellationException e3) {
                    e = e3;
                    defaultRaise2.complete();
                    return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise2));
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    defaultRaise2.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                java.util.List flatten = kotlin.collections.CollectionsKt.flatten((java.lang.Iterable) obj);
                com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData = new com.paypal.oslo.feature.savings.domain.model.SavingsHubData("", str2, kotlin.collections.CollectionsKt.emptyList(), flatten, null, null);
                com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
                savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizesFor = defaultRaise;
                savingsRepositoryImpl$fetchGoalsInternal$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
                savingsRepositoryImpl$fetchGoalsInternal$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flatten);
                savingsRepositoryImpl$fetchGoalsInternal$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData);
                savingsRepositoryImpl$fetchGoalsInternal$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubComponentRegistry);
                savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizes = i3;
                savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRangesFor = i4;
                savingsRepositoryImpl$fetchGoalsInternal$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                savingsRepositoryImpl$fetchGoalsInternal$1.Camera2StreamConfigurationMap = i5;
                savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes = 2;
                obj = savingsHubComponentRegistry.getSavingsHubTiles(savingsHubData, savingsRepositoryImpl$fetchGoalsInternal$1);
                if (obj != coroutine_suspended) {
                    defaultRaise3 = defaultRaise;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    while (r0.hasNext()) {
                    }
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO2 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList4);
                    goals = goalZoneDTO2 == null ? goalZoneDTO2.getGoals() : null;
                    if (goals == null) {
                    }
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    java.util.ArrayList arrayList32 = new java.util.ArrayList();
                    while (r4.hasNext()) {
                    }
                    kotlin.Pair pair2 = new kotlin.Pair(arrayList22, arrayList32);
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> plus2 = kotlin.collections.CollectionsKt.plus((java.util.Collection) pair2.component1(), (java.lang.Iterable) pair2.component2());
                    this.getHighSpeedVideoSizes.setValue(plus2);
                    defaultRaise3.complete();
                    return new arrow.core.Either.Right(plus2);
                }
                return coroutine_suspended;
            }
        }
        savingsRepositoryImpl$fetchGoalsInternal$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$fetchGoalsInternal$1(this, continuation);
        obj = savingsRepositoryImpl$fetchGoalsInternal$1.getOutputStallDurationlomOqCM;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes;
        if (i != 0) {
        }
        java.util.List flatten2 = kotlin.collections.CollectionsKt.flatten((java.lang.Iterable) obj);
        com.paypal.oslo.feature.savings.domain.model.SavingsHubData savingsHubData2 = new com.paypal.oslo.feature.savings.domain.model.SavingsHubData("", str2, kotlin.collections.CollectionsKt.emptyList(), flatten2, null, null);
        com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry savingsHubComponentRegistry2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentRegistry(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizesFor = defaultRaise;
        savingsRepositoryImpl$fetchGoalsInternal$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
        savingsRepositoryImpl$fetchGoalsInternal$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flatten2);
        savingsRepositoryImpl$fetchGoalsInternal$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubData2);
        savingsRepositoryImpl$fetchGoalsInternal$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(savingsHubComponentRegistry2);
        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoSizes = i3;
        savingsRepositoryImpl$fetchGoalsInternal$1.getHighSpeedVideoFpsRangesFor = i4;
        savingsRepositoryImpl$fetchGoalsInternal$1.getHighResolutionOutputSizeshNQ4ISI = i2;
        savingsRepositoryImpl$fetchGoalsInternal$1.Camera2StreamConfigurationMap = i5;
        savingsRepositoryImpl$fetchGoalsInternal$1.getOutputSizes = 2;
        obj = savingsHubComponentRegistry2.getSavingsHubTiles(savingsHubData2, savingsRepositoryImpl$fetchGoalsInternal$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object transferMoneybox(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1 savingsRepositoryImpl$transferMoneybox$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1) {
            savingsRepositoryImpl$transferMoneybox$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1) continuation;
            if ((savingsRepositoryImpl$transferMoneybox$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$transferMoneybox$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1 savingsRepositoryImpl$transferMoneybox$12 = savingsRepositoryImpl$transferMoneybox$1;
                java.lang.Object obj = savingsRepositoryImpl$transferMoneybox$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$transferMoneybox$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$transferMoneybox$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$transferMoneybox$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxTransferType);
                    savingsRepositoryImpl$transferMoneybox$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$transferMoneybox$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    savingsRepositoryImpl$transferMoneybox$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    savingsRepositoryImpl$transferMoneybox$12.getInputFormats = 1;
                    obj = savingsApolloClient.transferMoneybox(str, moneyboxTransferType, str2, money, str3, savingsRepositoryImpl$transferMoneybox$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$transferMoneybox$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1(this, continuation);
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneybox$1 savingsRepositoryImpl$transferMoneybox$122 = savingsRepositoryImpl$transferMoneybox$1;
        java.lang.Object obj2 = savingsRepositoryImpl$transferMoneybox$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$transferMoneybox$122.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object transferMoneyboxSchedule(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1 savingsRepositoryImpl$transferMoneyboxSchedule$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1) {
            savingsRepositoryImpl$transferMoneyboxSchedule$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1) continuation;
            if ((savingsRepositoryImpl$transferMoneyboxSchedule$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$transferMoneyboxSchedule$1.getInputFormats -= 2147483648;
                com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1 savingsRepositoryImpl$transferMoneyboxSchedule$12 = savingsRepositoryImpl$transferMoneyboxSchedule$1;
                java.lang.Object obj = savingsRepositoryImpl$transferMoneyboxSchedule$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$transferMoneyboxSchedule$12.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(frequencyType);
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    savingsRepositoryImpl$transferMoneyboxSchedule$12.getInputFormats = 1;
                    obj = savingsApolloClient.transferMoneyboxSchedule(str, str2, money, frequencyType, str3, savingsRepositoryImpl$transferMoneyboxSchedule$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX_SCHEDULE, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$transferMoneyboxSchedule$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1(this, continuation);
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$transferMoneyboxSchedule$1 savingsRepositoryImpl$transferMoneyboxSchedule$122 = savingsRepositoryImpl$transferMoneyboxSchedule$1;
        java.lang.Object obj2 = savingsRepositoryImpl$transferMoneyboxSchedule$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$transferMoneyboxSchedule$122.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.TRANSFER_MONEYBOX_SCHEDULE, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsAccount(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountInfo>>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccount$1 savingsRepositoryImpl$getSavingsAccount$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccount$1) {
            savingsRepositoryImpl$getSavingsAccount$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccount$1) continuation;
            if ((savingsRepositoryImpl$getSavingsAccount$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getSavingsAccount$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getSavingsAccount$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getSavingsAccount$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getSavingsAccount$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = savingsApolloClient.getSavingsAccount(savingsRepositoryImpl$getSavingsAccount$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getSavingsAccount$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccount$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getSavingsAccount$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getSavingsAccount$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsAccountEligibility(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccountEligibility$1 savingsRepositoryImpl$getSavingsAccountEligibility$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccountEligibility$1) {
            savingsRepositoryImpl$getSavingsAccountEligibility$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccountEligibility$1) continuation;
            if ((savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getSavingsAccountEligibility$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                    savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoSizes = 1;
                    obj = savingsApolloClient.getSavingsAccountEligibility(str, map, savingsRepositoryImpl$getSavingsAccountEligibility$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT_ELIGIBILITY, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getSavingsAccountEligibility$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsAccountEligibility$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getSavingsAccountEligibility$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_ACCOUNT_ELIGIBILITY, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateMoneyboxTransferSchedule(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1 savingsRepositoryImpl$updateMoneyboxTransferSchedule$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1) {
            savingsRepositoryImpl$updateMoneyboxTransferSchedule$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1) continuation;
            if ((savingsRepositoryImpl$updateMoneyboxTransferSchedule$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateMoneyboxTransferSchedule$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1 savingsRepositoryImpl$updateMoneyboxTransferSchedule$12 = savingsRepositoryImpl$updateMoneyboxTransferSchedule$1;
                java.lang.Object obj = savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(frequencyType);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    savingsRepositoryImpl$updateMoneyboxTransferSchedule$12.getOutputMinFrameDuration = 1;
                    obj = savingsApolloClient.updateMoneyboxTransferSchedule(str, str2, str3, frequencyType, str4, money, savingsRepositoryImpl$updateMoneyboxTransferSchedule$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX_TRANSFER_SCHEDULE, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$updateMoneyboxTransferSchedule$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1(this, continuation);
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneyboxTransferSchedule$1 savingsRepositoryImpl$updateMoneyboxTransferSchedule$122 = savingsRepositoryImpl$updateMoneyboxTransferSchedule$1;
        java.lang.Object obj2 = savingsRepositoryImpl$updateMoneyboxTransferSchedule$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateMoneyboxTransferSchedule$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX_TRANSFER_SCHEDULE, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteMoneyboxTransferSchedule(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneyboxTransferSchedule$1 savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneyboxTransferSchedule$1) {
            savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneyboxTransferSchedule$1) continuation;
            if ((savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoSizes = 1;
                    obj = savingsApolloClient.deleteMoneyboxTransferSchedule(str, str2, savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX_TRANSFER_SCHEDULE, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneyboxTransferSchedule$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$deleteMoneyboxTransferSchedule$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX_TRANSFER_SCHEDULE, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createSavingsGoal(com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalInput createSavingsGoalInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$createSavingsGoal$1 savingsRepositoryImpl$createSavingsGoal$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$createSavingsGoal$1) {
            savingsRepositoryImpl$createSavingsGoal$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$createSavingsGoal$1) continuation;
            if ((savingsRepositoryImpl$createSavingsGoal$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$createSavingsGoal$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$createSavingsGoal$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$createSavingsGoal$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$createSavingsGoal$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createSavingsGoalInput);
                    savingsRepositoryImpl$createSavingsGoal$1.Camera2StreamConfigurationMap = 1;
                    obj = savingsApolloClient.createSavingsGoal(createSavingsGoalInput, savingsRepositoryImpl$createSavingsGoal$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.CREATE_MONEYBOX, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$createSavingsGoal$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$createSavingsGoal$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$createSavingsGoal$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$createSavingsGoal$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.CREATE_MONEYBOX, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateMoneybox(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, com.paypal.oslo.api.graphql.schema.type.MoneyboxType moneyboxType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1 savingsRepositoryImpl$updateMoneybox$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1) {
            savingsRepositoryImpl$updateMoneybox$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1) continuation;
            if ((savingsRepositoryImpl$updateMoneybox$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateMoneybox$1.getInputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1 savingsRepositoryImpl$updateMoneybox$12 = savingsRepositoryImpl$updateMoneybox$1;
                java.lang.Object obj = savingsRepositoryImpl$updateMoneybox$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateMoneybox$12.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$updateMoneybox$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$updateMoneybox$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    savingsRepositoryImpl$updateMoneybox$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    savingsRepositoryImpl$updateMoneybox$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
                    savingsRepositoryImpl$updateMoneybox$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxCategory);
                    savingsRepositoryImpl$updateMoneybox$12.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxType);
                    savingsRepositoryImpl$updateMoneybox$12.getInputSizeshNQ4ISI = 1;
                    obj = savingsApolloClient.updateMoneybox(str, str2, str3, money, moneyboxCategory, moneyboxType, savingsRepositoryImpl$updateMoneybox$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$updateMoneybox$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1(this, continuation);
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateMoneybox$1 savingsRepositoryImpl$updateMoneybox$122 = savingsRepositoryImpl$updateMoneybox$1;
        java.lang.Object obj2 = savingsRepositoryImpl$updateMoneybox$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateMoneybox$122.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_MONEYBOX, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteMoneybox(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory moneyboxCategory, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.goals.DeleteMoneyboxResult>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneybox$1 savingsRepositoryImpl$deleteMoneybox$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneybox$1) {
            savingsRepositoryImpl$deleteMoneybox$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneybox$1) continuation;
            if ((savingsRepositoryImpl$deleteMoneybox$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$deleteMoneybox$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$deleteMoneybox$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$deleteMoneybox$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$deleteMoneybox$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$deleteMoneybox$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(moneyboxCategory);
                    savingsRepositoryImpl$deleteMoneybox$1.Camera2StreamConfigurationMap = 1;
                    obj = savingsApolloClient.deleteMoneybox(str, moneyboxCategory, savingsRepositoryImpl$deleteMoneybox$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$deleteMoneybox$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$deleteMoneybox$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$deleteMoneybox$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$deleteMoneybox$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.DELETE_MONEYBOX, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateTaxStatementDeliveryPreference(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateTaxStatementDeliveryPreference$1 savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateTaxStatementDeliveryPreference$1) {
            savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateTaxStatementDeliveryPreference$1) continuation;
            if ((savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizes = z;
                    savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges = 1;
                    obj = savingsApolloClient.updateTaxStatementDeliveryPreference(str, z, savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_SAVINGS_ACCOUNT_E1099, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateTaxStatementDeliveryPreference$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateTaxStatementDeliveryPreference$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_SAVINGS_ACCOUNT_E1099, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateUserConsent(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateUserConsent$1 savingsRepositoryImpl$updateUserConsent$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateUserConsent$1) {
            savingsRepositoryImpl$updateUserConsent$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateUserConsent$1) continuation;
            if ((savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoSizes = z;
                    savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRanges = 1;
                    obj = savingsApolloClient.updateUserConsent(z, savingsRepositoryImpl$updateUserConsent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_USER_CONSENT, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$updateUserConsent$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateUserConsent$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateUserConsent$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_USER_CONSENT, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSavingsLandingPageData(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsLandingPageData$1 savingsRepositoryImpl$getSavingsLandingPageData$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsLandingPageData$1) {
            savingsRepositoryImpl$getSavingsLandingPageData$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsLandingPageData$1) continuation;
            if ((savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getSavingsLandingPageData$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoSizes = 1;
                    obj = savingsApolloClient.getSavingsLandingPageData(str, savingsRepositoryImpl$getSavingsLandingPageData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_LANDING_PAGE_DATA, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getSavingsLandingPageData$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getSavingsLandingPageData$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getSavingsLandingPageData$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_SAVINGS_LANDING_PAGE_DATA, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getGoalSuccessStatus(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.goals.GoalSuccessStatus>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getGoalSuccessStatus$1 savingsRepositoryImpl$getGoalSuccessStatus$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getGoalSuccessStatus$1) {
            savingsRepositoryImpl$getGoalSuccessStatus$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getGoalSuccessStatus$1) continuation;
            if ((savingsRepositoryImpl$getGoalSuccessStatus$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getGoalSuccessStatus$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getGoalSuccessStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getGoalSuccessStatus$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getGoalSuccessStatus$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$getGoalSuccessStatus$1.Camera2StreamConfigurationMap = 1;
                    obj = savingsApolloClient.getGoalSuccessStatus(str, savingsRepositoryImpl$getGoalSuccessStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_GOAL_SUCCESS_STATUS, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getGoalSuccessStatus$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getGoalSuccessStatus$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getGoalSuccessStatus$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getGoalSuccessStatus$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_GOAL_SUCCESS_STATUS, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateGoalSuccessShown(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalSuccessShown$1 savingsRepositoryImpl$updateGoalSuccessShown$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalSuccessShown$1) {
            savingsRepositoryImpl$updateGoalSuccessShown$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalSuccessShown$1) continuation;
            if ((savingsRepositoryImpl$updateGoalSuccessShown$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$updateGoalSuccessShown$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$updateGoalSuccessShown$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$updateGoalSuccessShown$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$updateGoalSuccessShown$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    savingsRepositoryImpl$updateGoalSuccessShown$1.Camera2StreamConfigurationMap = 1;
                    obj = savingsApolloClient.updateGoalSuccessShown(str, savingsRepositoryImpl$updateGoalSuccessShown$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_GOAL_SUCCESS_SHOWN, "mutation", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$updateGoalSuccessShown$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateGoalSuccessShown$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$updateGoalSuccessShown$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$updateGoalSuccessShown$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.UPDATE_GOAL_SUCCESS_SHOWN, "mutation", (arrow.core.Either) obj2);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getDepositOptions(com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, com.paypal.oslo.feature.savings.domain.model.DepositOptionsData>> continuation) {
        com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getDepositOptions$1 savingsRepositoryImpl$getDepositOptions$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getDepositOptions$1) {
            savingsRepositoryImpl$getDepositOptions$1 = (com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getDepositOptions$1) continuation;
            if ((savingsRepositoryImpl$getDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                savingsRepositoryImpl$getDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = savingsRepositoryImpl$getDepositOptions$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savingsRepositoryImpl$getDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.savings.domain.client.SavingsApolloClient savingsApolloClient = this.getHighSpeedVideoFpsRangesFor;
                    savingsRepositoryImpl$getDepositOptions$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(depositOptionsInput);
                    savingsRepositoryImpl$getDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = savingsApolloClient.getDepositOptions(depositOptionsInput, savingsRepositoryImpl$getDepositOptions$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_DEPOSIT_OPTIONS, "query", (arrow.core.Either) obj);
                return obj;
            }
        }
        savingsRepositoryImpl$getDepositOptions$1 = new com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$getDepositOptions$1(this, continuation);
        java.lang.Object obj2 = savingsRepositoryImpl$getDepositOptions$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savingsRepositoryImpl$getDepositOptions$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.savings.analytics.SavingsApiTrackerKt.trackApiResult(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.ApiName.GET_DEPOSIT_OPTIONS, "query", (arrow.core.Either) obj2);
        return obj2;
    }

    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    public final java.lang.Object shouldAutoShowTaxPreferencePrompt(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, java.lang.Boolean>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.shouldAutoShowTaxPreferencePrompt(continuation);
    }

    @Override // com.paypal.oslo.feature.savings.domain.repository.SavingsRepository
    public final java.lang.Object markTaxPreferencePromptShown(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.markTaxPreferencePromptShown(continuation);
    }
}
