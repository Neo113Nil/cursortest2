package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowRemainingStatementBalanceSheet", "NavigateToChooseWayToPay", "NavigateBack", "NavigateToAutopay", "NavigateToPaymentSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToChooseWayToPay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToPaymentSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$ShowRemainingStatementBalanceSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class SelectAmountUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private SelectAmountUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$ShowRemainingStatementBalanceSheet;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowRemainingStatementBalanceSheet extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.ShowRemainingStatementBalanceSheet INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.ShowRemainingStatementBalanceSheet();

        public final int hashCode() {
            return -1664323941;
        }

        private ShowRemainingStatementBalanceSheet() {
            super("ShowRemainingStatementBalanceSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowRemainingStatementBalanceSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.ShowRemainingStatementBalanceSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0013R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToChooseWayToPay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "paymentAmount", "", "userAgreementUrl", "creditAccountId", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/fundinginstrument/FundingInstrument;", "fundingInstruments", "", "maxDaysInFuture", "Ljava/time/LocalDate;", "dueDate", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/time/LocalDate;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()I", "component6", "()Ljava/time/LocalDate;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/time/LocalDate;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToChooseWayToPay;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getPaymentAmount", "Ljava/lang/String;", "getUserAgreementUrl", "getCreditAccountId", "Ljava/util/List;", "getFundingInstruments", com.visa.cbp.getEncExpo.warmup, "getMaxDaysInFuture", "Ljava/time/LocalDate;", "getDueDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToChooseWayToPay extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect {
        public static final int $stable = 8;
        private final java.lang.String creditAccountId;
        private final java.time.LocalDate dueDate;
        private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments;
        private final int maxDaysInFuture;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount;
        private final java.lang.String userAgreementUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NavigateToChooseWayToPay(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list, int i, java.time.LocalDate localDate) {
            super("NavigateToChooseWayToPay", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.paymentAmount = currencyAmount;
            this.userAgreementUrl = str;
            this.creditAccountId = str2;
            this.fundingInstruments = list;
            this.maxDaysInFuture = i;
            this.dueDate = localDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getPaymentAmount() {
            return this.paymentAmount;
        }

        public final java.lang.String getUserAgreementUrl() {
            return this.userAgreementUrl;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> getFundingInstruments() {
            return this.fundingInstruments;
        }

        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.paymentAmount;
            java.lang.String str = this.userAgreementUrl;
            java.lang.String str2 = this.creditAccountId;
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> list = this.fundingInstruments;
            int i = this.maxDaysInFuture;
            java.time.LocalDate localDate = this.dueDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToChooseWayToPay(paymentAmount=");
            sb.append(currencyAmount);
            sb.append(", userAgreementUrl=");
            sb.append(str);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", fundingInstruments=");
            sb.append(list);
            sb.append(", maxDaysInFuture=");
            sb.append(i);
            sb.append(", dueDate=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.paymentAmount.hashCode();
            java.lang.String str = this.userAgreementUrl;
            int hashCode2 = str == null ? 0 : str.hashCode();
            int hashCode3 = this.creditAccountId.hashCode();
            int hashCode4 = this.fundingInstruments.hashCode();
            int hashCode5 = java.lang.Integer.hashCode(this.maxDaysInFuture);
            java.time.LocalDate localDate = this.dueDate;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (localDate != null ? localDate.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay navigateToChooseWayToPay = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAmount, navigateToChooseWayToPay.paymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.userAgreementUrl, navigateToChooseWayToPay.userAgreementUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, navigateToChooseWayToPay.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, navigateToChooseWayToPay.fundingInstruments) && this.maxDaysInFuture == navigateToChooseWayToPay.maxDaysInFuture && kotlin.jvm.internal.Intrinsics.areEqual(this.dueDate, navigateToChooseWayToPay.dueDate);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount paymentAmount, java.lang.String userAgreementUrl, java.lang.String creditAccountId, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> fundingInstruments, int maxDaysInFuture, java.time.LocalDate dueDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay(paymentAmount, userAgreementUrl, creditAccountId, fundingInstruments, maxDaysInFuture, dueDate);
        }

        /* renamed from: component6, reason: from getter */
        public final java.time.LocalDate getDueDate() {
            return this.dueDate;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxDaysInFuture() {
            return this.maxDaysInFuture;
        }

        public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument> component4() {
            return this.fundingInstruments;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getUserAgreementUrl() {
            return this.userAgreementUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getPaymentAmount() {
            return this.paymentAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToChooseWayToPay navigateToChooseWayToPay, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.time.LocalDate localDate, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                currencyAmount = navigateToChooseWayToPay.paymentAmount;
            }
            if ((i2 & 2) != 0) {
                str = navigateToChooseWayToPay.userAgreementUrl;
            }
            java.lang.String str3 = str;
            if ((i2 & 4) != 0) {
                str2 = navigateToChooseWayToPay.creditAccountId;
            }
            java.lang.String str4 = str2;
            if ((i2 & 8) != 0) {
                list = navigateToChooseWayToPay.fundingInstruments;
            }
            java.util.List list2 = list;
            if ((i2 & 16) != 0) {
                i = navigateToChooseWayToPay.maxDaysInFuture;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                localDate = navigateToChooseWayToPay.dueDate;
            }
            return navigateToChooseWayToPay.copy(currencyAmount, str3, str4, list2, i3, localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateBack();

        public final int hashCode() {
            return -350907110;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToAutopay;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAutopay extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToAutopay INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToAutopay();

        public final int hashCode() {
            return 1420898635;
        }

        private NavigateToAutopay() {
            super("NavigateToAutopay", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAutopay";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToAutopay)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToPaymentSummary;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect;", "", "popCurrent", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/selectamount/viewmodel/SelectAmountUiEffect$NavigateToPaymentSummary;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getPopCurrent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPaymentSummary extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect {
        public static final int $stable = 0;
        private final boolean popCurrent;

        public NavigateToPaymentSummary(boolean z) {
            super("NavigateToPaymentSummary", null);
            this.popCurrent = z;
        }

        public /* synthetic */ NavigateToPaymentSummary(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getPopCurrent() {
            return this.popCurrent;
        }

        public final java.lang.String toString() {
            boolean z = this.popCurrent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPaymentSummary(popCurrent=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.popCurrent);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary) && this.popCurrent == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary) other).popCurrent;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary copy(boolean popCurrent) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary(popCurrent);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getPopCurrent() {
            return this.popCurrent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountUiEffect.NavigateToPaymentSummary navigateToPaymentSummary, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = navigateToPaymentSummary.popCurrent;
            }
            return navigateToPaymentSummary.copy(z);
        }

        public NavigateToPaymentSummary() {
            this(false, 1, null);
        }
    }

    public /* synthetic */ SelectAmountUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
