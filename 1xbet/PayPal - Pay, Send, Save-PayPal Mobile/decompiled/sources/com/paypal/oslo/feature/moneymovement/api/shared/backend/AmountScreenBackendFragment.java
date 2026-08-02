package com.paypal.oslo.feature.moneymovement.api.shared.backend;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001dJ¬\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b?\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010$R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bJ\u0010+R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\bK\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountScreenBackendFragment;", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/RecipientNode;", "recipient", "", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;", "availableCurrencies", "defaultCurrency", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ExchangeRateNode;", "exchangeRates", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/BalanceNode;", "senderBalance", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;", "amountLimits", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/SuggestedAmountNode;", "suggestedAmounts", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;", "networkFeeEstimate", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;", "features", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;", "validationRules", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ErrorNode;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/RecipientNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/BalanceNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/RecipientNode;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;", "component4", "component5", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/BalanceNode;", "component6", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;", "component7", "component8", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;", "component9", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;", "component10", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;", "component11", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/RecipientNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/BalanceNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;Ljava/util/List;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;Ljava/util/List;)Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountScreenBackendFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/RecipientNode;", "getRecipient", "Ljava/util/List;", "getAvailableCurrencies", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/CurrencyNode;", "getDefaultCurrency", "getExchangeRates", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/BalanceNode;", "getSenderBalance", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/AmountLimitsNode;", "getAmountLimits", "getSuggestedAmounts", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/NetworkFeeNode;", "getNetworkFeeEstimate", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/FeaturesNode;", "getFeatures", "Lcom/paypal/oslo/feature/moneymovement/api/shared/backend/ValidationRulesNode;", "getValidationRules", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmountScreenBackendFragment {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimits;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> availableCurrencies;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode defaultCurrency;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> errors;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> exchangeRates;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode features;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeEstimate;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipient;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode senderBalance;
    private final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> suggestedAmounts;
    private final com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRules;

    public AmountScreenBackendFragment(com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipientNode, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> list, com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> list2, com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode balanceNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> list3, com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> list4) {
        this.recipient = recipientNode;
        this.availableCurrencies = list;
        this.defaultCurrency = currencyNode;
        this.exchangeRates = list2;
        this.senderBalance = balanceNode;
        this.amountLimits = amountLimitsNode;
        this.suggestedAmounts = list3;
        this.networkFeeEstimate = networkFeeNode;
        this.features = featuresNode;
        this.validationRules = validationRulesNode;
        this.errors = list4;
    }

    public /* synthetic */ AmountScreenBackendFragment(com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipientNode, java.util.List list, com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode, java.util.List list2, com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode balanceNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode, java.util.List list3, com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode, com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : recipientNode, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : currencyNode, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : balanceNode, (i & 32) != 0 ? null : amountLimitsNode, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : networkFeeNode, (i & 256) != 0 ? null : featuresNode, (i & 512) != 0 ? null : validationRulesNode, (i & 1024) == 0 ? list4 : null);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode getRecipient() {
        return this.recipient;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> getAvailableCurrencies() {
        return this.availableCurrencies;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> getExchangeRates() {
        return this.exchangeRates;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode getSenderBalance() {
        return this.senderBalance;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode getAmountLimits() {
        return this.amountLimits;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> getSuggestedAmounts() {
        return this.suggestedAmounts;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode getNetworkFeeEstimate() {
        return this.networkFeeEstimate;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode getFeatures() {
        return this.features;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode getValidationRules() {
        return this.validationRules;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> getErrors() {
        return this.errors;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipientNode = this.recipient;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> list = this.availableCurrencies;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode = this.defaultCurrency;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> list2 = this.exchangeRates;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode balanceNode = this.senderBalance;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode = this.amountLimits;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> list3 = this.suggestedAmounts;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode = this.networkFeeEstimate;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode = this.features;
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode = this.validationRules;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> list4 = this.errors;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountScreenBackendFragment(recipient=");
        sb.append(recipientNode);
        sb.append(", availableCurrencies=");
        sb.append(list);
        sb.append(", defaultCurrency=");
        sb.append(currencyNode);
        sb.append(", exchangeRates=");
        sb.append(list2);
        sb.append(", senderBalance=");
        sb.append(balanceNode);
        sb.append(", amountLimits=");
        sb.append(amountLimitsNode);
        sb.append(", suggestedAmounts=");
        sb.append(list3);
        sb.append(", networkFeeEstimate=");
        sb.append(networkFeeNode);
        sb.append(", features=");
        sb.append(featuresNode);
        sb.append(", validationRules=");
        sb.append(validationRulesNode);
        sb.append(", errors=");
        sb.append(list4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipientNode = this.recipient;
        int hashCode = recipientNode == null ? 0 : recipientNode.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> list = this.availableCurrencies;
        int hashCode2 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode currencyNode = this.defaultCurrency;
        int hashCode3 = currencyNode == null ? 0 : currencyNode.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> list2 = this.exchangeRates;
        int hashCode4 = list2 == null ? 0 : list2.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode balanceNode = this.senderBalance;
        int hashCode5 = balanceNode == null ? 0 : balanceNode.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimitsNode = this.amountLimits;
        int hashCode6 = amountLimitsNode == null ? 0 : amountLimitsNode.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> list3 = this.suggestedAmounts;
        int hashCode7 = list3 == null ? 0 : list3.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeNode = this.networkFeeEstimate;
        int hashCode8 = networkFeeNode == null ? 0 : networkFeeNode.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode featuresNode = this.features;
        int hashCode9 = featuresNode == null ? 0 : featuresNode.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRulesNode = this.validationRules;
        int hashCode10 = validationRulesNode == null ? 0 : validationRulesNode.hashCode();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> list4 = this.errors;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenBackendFragment)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenBackendFragment amountScreenBackendFragment = (com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenBackendFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.recipient, amountScreenBackendFragment.recipient) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableCurrencies, amountScreenBackendFragment.availableCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultCurrency, amountScreenBackendFragment.defaultCurrency) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRates, amountScreenBackendFragment.exchangeRates) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderBalance, amountScreenBackendFragment.senderBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.amountLimits, amountScreenBackendFragment.amountLimits) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedAmounts, amountScreenBackendFragment.suggestedAmounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkFeeEstimate, amountScreenBackendFragment.networkFeeEstimate) && kotlin.jvm.internal.Intrinsics.areEqual(this.features, amountScreenBackendFragment.features) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationRules, amountScreenBackendFragment.validationRules) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, amountScreenBackendFragment.errors);
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenBackendFragment copy(com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode recipient, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> availableCurrencies, com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode defaultCurrency, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> exchangeRates, com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode senderBalance, com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode amountLimits, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> suggestedAmounts, com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode networkFeeEstimate, com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode features, com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode validationRules, java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> errors) {
        return new com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountScreenBackendFragment(recipient, availableCurrencies, defaultCurrency, exchangeRates, senderBalance, amountLimits, suggestedAmounts, networkFeeEstimate, features, validationRules, errors);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.FeaturesNode getFeatures() {
        return this.features;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.NetworkFeeNode getNetworkFeeEstimate() {
        return this.networkFeeEstimate;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.SuggestedAmountNode> component7() {
        return this.suggestedAmounts;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.AmountLimitsNode getAmountLimits() {
        return this.amountLimits;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.BalanceNode getSenderBalance() {
        return this.senderBalance;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ExchangeRateNode> component4() {
        return this.exchangeRates;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode getDefaultCurrency() {
        return this.defaultCurrency;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.CurrencyNode> component2() {
        return this.availableCurrencies;
    }

    public final java.util.List<com.paypal.oslo.feature.moneymovement.api.shared.backend.ErrorNode> component11() {
        return this.errors;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.ValidationRulesNode getValidationRules() {
        return this.validationRules;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.backend.RecipientNode getRecipient() {
        return this.recipient;
    }

    public AmountScreenBackendFragment() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
