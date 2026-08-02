package com.paypal.oslo.feature.cryptocurrency.ui.buy.review;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJL\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewUseCases;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/funding/EvaluateEligibleFundingOptionsUseCase;", "evaluateEligibleFundingOptions", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;", "generateQuote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/trade/ExecuteTradeUseCase;", "executeTrade", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;", "pollQuote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getPYUSDRewardsStatus", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "checkCryptoProvisioning", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/funding/EvaluateEligibleFundingOptionsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/trade/ExecuteTradeUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/funding/EvaluateEligibleFundingOptionsUseCase;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/trade/ExecuteTradeUseCase;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "component6", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/funding/EvaluateEligibleFundingOptionsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/trade/ExecuteTradeUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;)Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/ReviewUseCases;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/funding/EvaluateEligibleFundingOptionsUseCase;", "getEvaluateEligibleFundingOptions", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/quote/GenerateQuoteUseCase;", "getGenerateQuote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/trade/ExecuteTradeUseCase;", "getExecuteTrade", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollQuoteUseCase;", "getPollQuote", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/rewards/pyusd/GetPYUSDRewardsStatusUseCase;", "getGetPYUSDRewardsStatus", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "getCheckCryptoProvisioning"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReviewUseCases {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioning;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptions;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTrade;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuote;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatus;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuote;

    @javax.inject.Inject
    public ReviewUseCases(com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptionsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateEligibleFundingOptionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateQuoteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeTradeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollQuoteUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioningUseCase, "");
        this.evaluateEligibleFundingOptions = evaluateEligibleFundingOptionsUseCase;
        this.generateQuote = generateQuoteUseCase;
        this.executeTrade = executeTradeUseCase;
        this.pollQuote = pollQuoteUseCase;
        this.getPYUSDRewardsStatus = getPYUSDRewardsStatusUseCase;
        this.checkCryptoProvisioning = checkCryptoProvisioningUseCase;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase getEvaluateEligibleFundingOptions() {
        return this.evaluateEligibleFundingOptions;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase getGenerateQuote() {
        return this.generateQuote;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase getExecuteTrade() {
        return this.executeTrade;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase getPollQuote() {
        return this.pollQuote;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getGetPYUSDRewardsStatus() {
        return this.getPYUSDRewardsStatus;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getCheckCryptoProvisioning() {
        return this.checkCryptoProvisioning;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptionsUseCase = this.evaluateEligibleFundingOptions;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase = this.generateQuote;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase = this.executeTrade;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase = this.pollQuote;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase = this.getPYUSDRewardsStatus;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase = this.checkCryptoProvisioning;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewUseCases(evaluateEligibleFundingOptions=");
        sb.append(evaluateEligibleFundingOptionsUseCase);
        sb.append(", generateQuote=");
        sb.append(generateQuoteUseCase);
        sb.append(", executeTrade=");
        sb.append(executeTradeUseCase);
        sb.append(", pollQuote=");
        sb.append(pollQuoteUseCase);
        sb.append(", getPYUSDRewardsStatus=");
        sb.append(getPYUSDRewardsStatusUseCase);
        sb.append(", checkCryptoProvisioning=");
        sb.append(checkCryptoProvisioningUseCase);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.evaluateEligibleFundingOptions.hashCode() * 31) + this.generateQuote.hashCode()) * 31) + this.executeTrade.hashCode()) * 31) + this.pollQuote.hashCode()) * 31) + this.getPYUSDRewardsStatus.hashCode()) * 31) + this.checkCryptoProvisioning.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases = (com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateEligibleFundingOptions, reviewUseCases.evaluateEligibleFundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.generateQuote, reviewUseCases.generateQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.executeTrade, reviewUseCases.executeTrade) && kotlin.jvm.internal.Intrinsics.areEqual(this.pollQuote, reviewUseCases.pollQuote) && kotlin.jvm.internal.Intrinsics.areEqual(this.getPYUSDRewardsStatus, reviewUseCases.getPYUSDRewardsStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkCryptoProvisioning, reviewUseCases.checkCryptoProvisioning);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases copy(com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptions, com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuote, com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTrade, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuote, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatus, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioning) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateEligibleFundingOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateQuote, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeTrade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollQuote, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPYUSDRewardsStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioning, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases(evaluateEligibleFundingOptions, generateQuote, executeTrade, pollQuote, getPYUSDRewardsStatus, checkCryptoProvisioning);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getCheckCryptoProvisioning() {
        return this.checkCryptoProvisioning;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getGetPYUSDRewardsStatus() {
        return this.getPYUSDRewardsStatus;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase getPollQuote() {
        return this.pollQuote;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase getExecuteTrade() {
        return this.executeTrade;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase getGenerateQuote() {
        return this.generateQuote;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase getEvaluateEligibleFundingOptions() {
        return this.evaluateEligibleFundingOptions;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases copy$default(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.ReviewUseCases reviewUseCases, com.paypal.oslo.feature.cryptocurrency.domain.usecase.funding.EvaluateEligibleFundingOptionsUseCase evaluateEligibleFundingOptionsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateEligibleFundingOptionsUseCase = reviewUseCases.evaluateEligibleFundingOptions;
        }
        if ((i & 2) != 0) {
            generateQuoteUseCase = reviewUseCases.generateQuote;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase generateQuoteUseCase2 = generateQuoteUseCase;
        if ((i & 4) != 0) {
            executeTradeUseCase = reviewUseCases.executeTrade;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase executeTradeUseCase2 = executeTradeUseCase;
        if ((i & 8) != 0) {
            pollQuoteUseCase = reviewUseCases.pollQuote;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollQuoteUseCase pollQuoteUseCase2 = pollQuoteUseCase;
        if ((i & 16) != 0) {
            getPYUSDRewardsStatusUseCase = reviewUseCases.getPYUSDRewardsStatus;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase2 = getPYUSDRewardsStatusUseCase;
        if ((i & 32) != 0) {
            checkCryptoProvisioningUseCase = reviewUseCases.checkCryptoProvisioning;
        }
        return reviewUseCases.copy(evaluateEligibleFundingOptionsUseCase, generateQuoteUseCase2, executeTradeUseCase2, pollQuoteUseCase2, getPYUSDRewardsStatusUseCase2, checkCryptoProvisioningUseCase);
    }
}
