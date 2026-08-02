package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnUiModelInitialized", "OnMonthlyIncomeAfterTaxChanged", "OnMonthlyIncomeAfterTaxFocusChanged", "OnRevisedMonthlyIncomeAfterTaxChanged", "OnRevisedMonthlyIncomeAfterTaxFocusChanged", "OnIncomeChangeOptionSelected", "OnSubmitClicked", "OnRequestError", "OnTryAgainClick", "OnRequestSuccess", "OnDeclineIncreaseClicked", "OnPrivacyPolicyLinkClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnDeclineIncreaseClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnIncomeChangeOptionSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxFocusChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnPrivacyPolicyLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxFocusChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnSubmitClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CLIApplicationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CLIApplicationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b/\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "creditAccountId", "offerId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "offeredCreditLimit", "expirationDate", "monthlyPaymentAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "privacyStatementUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "getOfferId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getOfferedCreditLimit", "getExpirationDate", "getMonthlyPaymentAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "getPrivacyStatementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit;
        private final java.lang.String expirationDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount;
        private final java.lang.String offerId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit;
        private final java.lang.String privacyStatementUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnViewCreated(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str4) {
            super("OnViewCreated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditAccountId = str;
            this.offerId = str2;
            this.currentCreditLimit = currencyAmount;
            this.offeredCreditLimit = currencyAmount2;
            this.expirationDate = str3;
            this.monthlyPaymentAmount = currencyAmount3;
            this.creditProductIdentifier = creditProductIdentifier;
            this.privacyStatementUrl = str4;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOfferedCreditLimit() {
            return this.offeredCreditLimit;
        }

        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            java.lang.String str2 = this.offerId;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.offeredCreditLimit;
            java.lang.String str3 = this.expirationDate;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.monthlyPaymentAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str4 = this.privacyStatementUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(creditAccountId=");
            sb.append(str);
            sb.append(", offerId=");
            sb.append(str2);
            sb.append(", currentCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", offeredCreditLimit=");
            sb.append(currencyAmount2);
            sb.append(", expirationDate=");
            sb.append(str3);
            sb.append(", monthlyPaymentAmount=");
            sb.append(currencyAmount3);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", privacyStatementUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.creditAccountId.hashCode();
            int hashCode2 = this.offerId.hashCode();
            int hashCode3 = this.currentCreditLimit.hashCode();
            int hashCode4 = this.offeredCreditLimit.hashCode();
            int hashCode5 = this.expirationDate.hashCode();
            int hashCode6 = this.monthlyPaymentAmount.hashCode();
            int hashCode7 = this.creditProductIdentifier.hashCode();
            java.lang.String str = this.privacyStatementUrl;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnViewCreated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onViewCreated.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, onViewCreated.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, onViewCreated.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.offeredCreditLimit, onViewCreated.offeredCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, onViewCreated.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthlyPaymentAmount, onViewCreated.monthlyPaymentAmount) && this.creditProductIdentifier == onViewCreated.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyStatementUrl, onViewCreated.privacyStatementUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnViewCreated copy(java.lang.String creditAccountId, java.lang.String offerId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit, java.lang.String expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String privacyStatementUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offeredCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthlyPaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnViewCreated(creditAccountId, offerId, currentCreditLimit, offeredCreditLimit, expirationDate, monthlyPaymentAmount, creditProductIdentifier, privacyStatementUrl);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOfferedCreditLimit() {
            return this.offeredCreditLimit;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnUiModelInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUiModelInitialized extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUiModelInitialized(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel) {
            super("OnUiModelInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationUiModel, "");
            this.uiModel = cLIApplicationUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUiModelInitialized(uiModel=");
            sb.append(cLIApplicationUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized) other).uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized(uiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnUiModelInitialized onUiModelInitialized, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIApplicationUiModel = onUiModelInitialized.uiModel;
            }
            return onUiModelInitialized.copy(cLIApplicationUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "income", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIncome"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMonthlyIncomeAfterTaxChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final java.lang.String income;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMonthlyIncomeAfterTaxChanged(java.lang.String str) {
            super("OnMonthlyIncomeAfterTaxChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.income = str;
        }

        public final java.lang.String getIncome() {
            return this.income;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.income;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMonthlyIncomeAfterTaxChanged(income=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.income.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.income, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged) other).income);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged copy(java.lang.String income) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(income, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged(income);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIncome() {
            return this.income;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxChanged onMonthlyIncomeAfterTaxChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onMonthlyIncomeAfterTaxChanged.income;
            }
            return onMonthlyIncomeAfterTaxChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxFocusChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "isFocused", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnMonthlyIncomeAfterTaxFocusChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMonthlyIncomeAfterTaxFocusChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final boolean isFocused;

        public OnMonthlyIncomeAfterTaxFocusChanged(boolean z) {
            super("OnMonthlyIncomeAfterTaxFocusChanged", null);
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }

        public final java.lang.String toString() {
            boolean z = this.isFocused;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnMonthlyIncomeAfterTaxFocusChanged(isFocused=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isFocused);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged) && this.isFocused == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged) other).isFocused;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged copy(boolean isFocused) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged(isFocused);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnMonthlyIncomeAfterTaxFocusChanged onMonthlyIncomeAfterTaxFocusChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onMonthlyIncomeAfterTaxFocusChanged.isFocused;
            }
            return onMonthlyIncomeAfterTaxFocusChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "income", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIncome"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevisedMonthlyIncomeAfterTaxChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final java.lang.String income;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRevisedMonthlyIncomeAfterTaxChanged(java.lang.String str) {
            super("OnRevisedMonthlyIncomeAfterTaxChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.income = str;
        }

        public final java.lang.String getIncome() {
            return this.income;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.income;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevisedMonthlyIncomeAfterTaxChanged(income=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.income.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.income, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged) other).income);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged copy(java.lang.String income) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(income, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged(income);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIncome() {
            return this.income;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxChanged onRevisedMonthlyIncomeAfterTaxChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRevisedMonthlyIncomeAfterTaxChanged.income;
            }
            return onRevisedMonthlyIncomeAfterTaxChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxFocusChanged;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "isFocused", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRevisedMonthlyIncomeAfterTaxFocusChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRevisedMonthlyIncomeAfterTaxFocusChanged extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final boolean isFocused;

        public OnRevisedMonthlyIncomeAfterTaxFocusChanged(boolean z) {
            super("OnRevisedMonthlyIncomeAfterTaxFocusChanged", null);
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }

        public final java.lang.String toString() {
            boolean z = this.isFocused;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRevisedMonthlyIncomeAfterTaxFocusChanged(isFocused=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isFocused);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged) && this.isFocused == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged) other).isFocused;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged copy(boolean isFocused) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged(isFocused);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsFocused() {
            return this.isFocused;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRevisedMonthlyIncomeAfterTaxFocusChanged onRevisedMonthlyIncomeAfterTaxFocusChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onRevisedMonthlyIncomeAfterTaxFocusChanged.isFocused;
            }
            return onRevisedMonthlyIncomeAfterTaxFocusChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnIncomeChangeOptionSelected;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnIncomeChangeOptionSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/IncomeChangeOption;", "getOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnIncomeChangeOptionSelected extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption option;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnIncomeChangeOptionSelected(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption incomeChangeOption) {
            super("OnIncomeChangeOptionSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incomeChangeOption, "");
            this.option = incomeChangeOption;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption getOption() {
            return this.option;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption incomeChangeOption = this.option;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnIncomeChangeOptionSelected(option=");
            sb.append(incomeChangeOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected) && this.option == ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected) other).option;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption option) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected(option);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption getOption() {
            return this.option;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnIncomeChangeOptionSelected onIncomeChangeOptionSelected, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.IncomeChangeOption incomeChangeOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                incomeChangeOption = onIncomeChangeOptionSelected.option;
            }
            return onIncomeChangeOptionSelected.copy(incomeChangeOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnSubmitClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSubmitClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnSubmitClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnSubmitClicked();

        public final int hashCode() {
            return 1986119127;
        }

        private OnSubmitClicked() {
            super("OnSubmitClicked", null);
        }

        public final java.lang.String toString() {
            return "OnSubmitClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnSubmitClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "request", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "getRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRequestError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRequestError(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest) {
            super("OnRequestError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCreditLineIncreaseRequest, "");
            this.request = requestCreditLineIncreaseRequest;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest = this.request;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRequestError(request=");
            sb.append(requestCreditLineIncreaseRequest);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.request.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError) other).request);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError(request);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestError onRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestCreditLineIncreaseRequest = onRequestError.request;
            }
            return onRequestError.copy(requestCreditLineIncreaseRequest);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnTryAgainClick;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTryAgainClick extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnTryAgainClick INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnTryAgainClick();

        public final int hashCode() {
            return -1358932213;
        }

        private OnTryAgainClick() {
            super("OnTryAgainClick", null);
        }

        public final java.lang.String toString() {
            return "OnTryAgainClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnTryAgainClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "result", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnRequestSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIIncreaseResult;", "getResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRequestSuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRequestSuccess(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult cLIIncreaseResult) {
            super("OnRequestSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIIncreaseResult, "");
            this.result = cLIIncreaseResult;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult cLIIncreaseResult = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRequestSuccess(result=");
            sb.append(cLIIncreaseResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess) other).result);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnRequestSuccess onRequestSuccess, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIIncreaseResult cLIIncreaseResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIIncreaseResult = onRequestSuccess.result;
            }
            return onRequestSuccess.copy(cLIIncreaseResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnDeclineIncreaseClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDeclineIncreaseClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnDeclineIncreaseClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnDeclineIncreaseClicked();

        public final int hashCode() {
            return -86203961;
        }

        private OnDeclineIncreaseClicked() {
            super("OnDeclineIncreaseClicked", null);
        }

        public final java.lang.String toString() {
            return "OnDeclineIncreaseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnDeclineIncreaseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnPrivacyPolicyLinkClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEvent$OnPrivacyPolicyLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPrivacyPolicyLinkClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPrivacyPolicyLinkClicked(java.lang.String str) {
            super("OnPrivacyPolicyLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPrivacyPolicyLinkClicked(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEvent.OnPrivacyPolicyLinkClicked onPrivacyPolicyLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPrivacyPolicyLinkClicked.url;
            }
            return onPrivacyPolicyLinkClicked.copy(str);
        }
    }

    public /* synthetic */ CLIApplicationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
