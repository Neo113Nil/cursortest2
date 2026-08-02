package com.paypal.oslo.feature.p2p.ui.review.state;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J\u009c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b0\u0010\"J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b\n\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010$R\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b?\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b@\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b\u0012\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bB\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "name", "formattedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "fxQuoteId", "", "isSheetVisible", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "", "sheetInstanceId", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "cachedFxQuote", "committedOption", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_PLAN_ID, "isProviderUpdatePending", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "updatedFundingOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Ljava/lang/String;ZLjava/lang/String;ILcom/paypal/oslo/feature/p2p/domain/model/FxQuote;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Ljava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "component5", "component6", "()Z", "component7", "component8", "()I", "component9", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "component10", "component11", "component12", "component13", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Ljava/lang/String;ZLjava/lang/String;ILcom/paypal/oslo/feature/p2p/domain/model/FxQuote;Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;Ljava/lang/String;ZLcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;)Lcom/paypal/oslo/feature/p2p/ui/review/state/CurrencyConversionUiState;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getName", "getFormattedAmount", "getConversionRate", "Lcom/paypal/oslo/feature/p2p/domain/model/ConversionOption;", "getSelectedOption", "getFxQuoteId", "Z", "getTransferAttemptId", com.visa.cbp.getEncExpo.warmup, "getSheetInstanceId", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getCachedFxQuote", "getCommittedOption", "getPaymentPlanId", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getUpdatedFundingOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CurrencyConversionUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.p2p.domain.model.FxQuote cachedFxQuote;
    private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption committedOption;
    private final java.lang.String conversionRate;
    private final java.lang.String formattedAmount;
    private final java.lang.String fxQuoteId;
    private final boolean isProviderUpdatePending;
    private final boolean isSheetVisible;
    private final java.lang.String name;
    private final java.lang.String paymentPlanId;
    private final com.paypal.oslo.feature.p2p.domain.model.ConversionOption selectedOption;
    private final int sheetInstanceId;
    private final java.lang.String transferAttemptId;
    private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions updatedFundingOptions;

    public CurrencyConversionUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, java.lang.String str4, boolean z, java.lang.String str5, int i, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption2, java.lang.String str6, boolean z2, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOption2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.formattedAmount = str2;
        this.conversionRate = str3;
        this.selectedOption = conversionOption;
        this.fxQuoteId = str4;
        this.isSheetVisible = z;
        this.transferAttemptId = str5;
        this.sheetInstanceId = i;
        this.cachedFxQuote = fxQuote;
        this.committedOption = conversionOption2;
        this.paymentPlanId = str6;
        this.isProviderUpdatePending = z2;
        this.updatedFundingOptions = fundingOptions;
    }

    public /* synthetic */ CurrencyConversionUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption, java.lang.String str4, boolean z, java.lang.String str5, int i, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption2, java.lang.String str6, boolean z2, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "CurrencyConversionUiState" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL : conversionOption, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : fxQuote, (i2 & 512) != 0 ? com.paypal.oslo.feature.p2p.domain.model.ConversionOption.PAYPAL : conversionOption2, (i2 & 1024) == 0 ? str6 : "", (i2 & 2048) == 0 ? z2 : false, (i2 & 4096) == 0 ? fundingOptions : null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final java.lang.String getConversionRate() {
        return this.conversionRate;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getSelectedOption() {
        return this.selectedOption;
    }

    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    public final boolean isSheetVisible() {
        return this.isSheetVisible;
    }

    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    public final int getSheetInstanceId() {
        return this.sheetInstanceId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getCachedFxQuote() {
        return this.cachedFxQuote;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getCommittedOption() {
        return this.committedOption;
    }

    public final java.lang.String getPaymentPlanId() {
        return this.paymentPlanId;
    }

    public final boolean isProviderUpdatePending() {
        return this.isProviderUpdatePending;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getUpdatedFundingOptions() {
        return this.updatedFundingOptions;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.formattedAmount;
        java.lang.String str3 = this.conversionRate;
        com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption = this.selectedOption;
        java.lang.String str4 = this.fxQuoteId;
        boolean z = this.isSheetVisible;
        java.lang.String str5 = this.transferAttemptId;
        int i = this.sheetInstanceId;
        com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.cachedFxQuote;
        com.paypal.oslo.feature.p2p.domain.model.ConversionOption conversionOption2 = this.committedOption;
        java.lang.String str6 = this.paymentPlanId;
        boolean z2 = this.isProviderUpdatePending;
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.updatedFundingOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyConversionUiState(name=");
        sb.append(str);
        sb.append(", formattedAmount=");
        sb.append(str2);
        sb.append(", conversionRate=");
        sb.append(str3);
        sb.append(", selectedOption=");
        sb.append(conversionOption);
        sb.append(", fxQuoteId=");
        sb.append(str4);
        sb.append(", isSheetVisible=");
        sb.append(z);
        sb.append(", transferAttemptId=");
        sb.append(str5);
        sb.append(", sheetInstanceId=");
        sb.append(i);
        sb.append(", cachedFxQuote=");
        sb.append(fxQuote);
        sb.append(", committedOption=");
        sb.append(conversionOption2);
        sb.append(", paymentPlanId=");
        sb.append(str6);
        sb.append(", isProviderUpdatePending=");
        sb.append(z2);
        sb.append(", updatedFundingOptions=");
        sb.append(fundingOptions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.String str = this.formattedAmount;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.conversionRate;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.selectedOption.hashCode();
        java.lang.String str3 = this.fxQuoteId;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isSheetVisible);
        int hashCode7 = this.transferAttemptId.hashCode();
        int hashCode8 = java.lang.Integer.hashCode(this.sheetInstanceId);
        com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.cachedFxQuote;
        int hashCode9 = fxQuote == null ? 0 : fxQuote.hashCode();
        int hashCode10 = this.committedOption.hashCode();
        int hashCode11 = this.paymentPlanId.hashCode();
        int hashCode12 = java.lang.Boolean.hashCode(this.isProviderUpdatePending);
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.updatedFundingOptions;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (fundingOptions != null ? fundingOptions.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState currencyConversionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, currencyConversionUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, currencyConversionUiState.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.conversionRate, currencyConversionUiState.conversionRate) && this.selectedOption == currencyConversionUiState.selectedOption && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuoteId, currencyConversionUiState.fxQuoteId) && this.isSheetVisible == currencyConversionUiState.isSheetVisible && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttemptId, currencyConversionUiState.transferAttemptId) && this.sheetInstanceId == currencyConversionUiState.sheetInstanceId && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedFxQuote, currencyConversionUiState.cachedFxQuote) && this.committedOption == currencyConversionUiState.committedOption && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentPlanId, currencyConversionUiState.paymentPlanId) && this.isProviderUpdatePending == currencyConversionUiState.isProviderUpdatePending && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedFundingOptions, currencyConversionUiState.updatedFundingOptions);
    }

    public final com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState copy(java.lang.String name2, java.lang.String formattedAmount, java.lang.String conversionRate, com.paypal.oslo.feature.p2p.domain.model.ConversionOption selectedOption, java.lang.String fxQuoteId, boolean isSheetVisible, java.lang.String transferAttemptId, int sheetInstanceId, com.paypal.oslo.feature.p2p.domain.model.FxQuote cachedFxQuote, com.paypal.oslo.feature.p2p.domain.model.ConversionOption committedOption, java.lang.String paymentPlanId, boolean isProviderUpdatePending, com.paypal.oslo.feature.p2p.domain.model.FundingOptions updatedFundingOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(committedOption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanId, "");
        return new com.paypal.oslo.feature.p2p.ui.review.state.CurrencyConversionUiState(name2, formattedAmount, conversionRate, selectedOption, fxQuoteId, isSheetVisible, transferAttemptId, sheetInstanceId, cachedFxQuote, committedOption, paymentPlanId, isProviderUpdatePending, updatedFundingOptions);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getCachedFxQuote() {
        return this.cachedFxQuote;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSheetInstanceId() {
        return this.sheetInstanceId;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTransferAttemptId() {
        return this.transferAttemptId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSheetVisible() {
        return this.isSheetVisible;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFxQuoteId() {
        return this.fxQuoteId;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getSelectedOption() {
        return this.selectedOption;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getConversionRate() {
        return this.conversionRate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getUpdatedFundingOptions() {
        return this.updatedFundingOptions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsProviderUpdatePending() {
        return this.isProviderUpdatePending;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getPaymentPlanId() {
        return this.paymentPlanId;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ConversionOption getCommittedOption() {
        return this.committedOption;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public CurrencyConversionUiState() {
        this(null, null, null, null, null, false, null, 0, null, null, null, false, null, 8191, null);
    }
}
