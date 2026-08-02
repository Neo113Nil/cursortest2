package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "StateWithUiModel", "Initial", "InitializingUiModel", "RequestCreditLineIncreaseError", "RequestCreditLineIncrease", "RetryRequestCreditLineIncrease", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncrease;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncreaseError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RetryRequestCreditLineIncrease;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CLIApplicationState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$StateWithUiModel;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "getUiModel", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncrease;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface StateWithUiModel {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel();
    }

    private CLIApplicationState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Initial();

        public final int hashCode() {
            return 993525186;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013Jb\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b.\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b/\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "offeredCreditLimit", "", "expirationDate", "monthlyPaymentAmount", "offerId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "creditAccountId", "privacyStatementUrl", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component7", "component8", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$InitializingUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getOfferedCreditLimit", "Ljava/lang/String;", "getExpirationDate", "getMonthlyPaymentAmount", "getOfferId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "getCreditAccountId", "getPrivacyStatementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializingUiModel extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState {
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
        public InitializingUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str3, java.lang.String str4) {
            super("InitializingUiModel", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.currentCreditLimit = currencyAmount;
            this.offeredCreditLimit = currencyAmount2;
            this.expirationDate = str;
            this.monthlyPaymentAmount = currencyAmount3;
            this.offerId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.creditAccountId = str3;
            this.privacyStatementUrl = str4;
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

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.offeredCreditLimit;
            java.lang.String str = this.expirationDate;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.monthlyPaymentAmount;
            java.lang.String str2 = this.offerId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str3 = this.creditAccountId;
            java.lang.String str4 = this.privacyStatementUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializingUiModel(currentCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", offeredCreditLimit=");
            sb.append(currencyAmount2);
            sb.append(", expirationDate=");
            sb.append(str);
            sb.append(", monthlyPaymentAmount=");
            sb.append(currencyAmount3);
            sb.append(", offerId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", creditAccountId=");
            sb.append(str3);
            sb.append(", privacyStatementUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.currentCreditLimit.hashCode();
            int hashCode2 = this.offeredCreditLimit.hashCode();
            int hashCode3 = this.expirationDate.hashCode();
            int hashCode4 = this.monthlyPaymentAmount.hashCode();
            int hashCode5 = this.offerId.hashCode();
            int hashCode6 = this.creditProductIdentifier.hashCode();
            int hashCode7 = this.creditAccountId.hashCode();
            java.lang.String str = this.privacyStatementUrl;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, initializingUiModel.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.offeredCreditLimit, initializingUiModel.offeredCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, initializingUiModel.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthlyPaymentAmount, initializingUiModel.monthlyPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, initializingUiModel.offerId) && this.creditProductIdentifier == initializingUiModel.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, initializingUiModel.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyStatementUrl, initializingUiModel.privacyStatementUrl);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit, java.lang.String expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount, java.lang.String offerId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId, java.lang.String privacyStatementUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offeredCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthlyPaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.InitializingUiModel(currentCreditLimit, offeredCreditLimit, expirationDate, monthlyPaymentAmount, offerId, creditProductIdentifier, creditAccountId, privacyStatementUrl);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getPrivacyStatementUrl() {
            return this.privacyStatementUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOfferedCreditLimit() {
            return this.offeredCreditLimit;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncreaseError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "request", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncreaseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "getRequest", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCreditLineIncreaseError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCreditLineIncreaseError(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            super("RequestCreditLineIncreaseError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCreditLineIncreaseRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.request = requestCreditLineIncreaseRequest;
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest = this.request;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCreditLineIncreaseError(request=");
            sb.append(requestCreditLineIncreaseRequest);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.request.hashCode() * 31) + this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError requestCreditLineIncreaseError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.request, requestCreditLineIncreaseError.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, requestCreditLineIncreaseError.readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError(request, readyInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncreaseError requestCreditLineIncreaseError, com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestCreditLineIncreaseRequest = requestCreditLineIncreaseError.request;
            }
            if ((i & 2) != 0) {
                readyInfo = requestCreditLineIncreaseError.readyInfo;
            }
            return requestCreditLineIncreaseError.copy(requestCreditLineIncreaseRequest, readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncrease;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$StateWithUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RequestCreditLineIncrease;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "getReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCreditLineIncrease extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.StateWithUiModel {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCreditLineIncrease(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel) {
            super("RequestCreditLineIncrease", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationUiModel, "");
            this.readyInfo = readyInfo;
            this.uiModel = cLIApplicationUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.StateWithUiModel
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = this.readyInfo;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCreditLineIncrease(readyInfo=");
            sb.append(readyInfo);
            sb.append(", uiModel=");
            sb.append(cLIApplicationUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.readyInfo.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease requestCreditLineIncrease = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, requestCreditLineIncrease.readyInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, requestCreditLineIncrease.uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease(readyInfo, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RequestCreditLineIncrease requestCreditLineIncrease, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                readyInfo = requestCreditLineIncrease.readyInfo;
            }
            if ((i & 2) != 0) {
                cLIApplicationUiModel = requestCreditLineIncrease.uiModel;
            }
            return requestCreditLineIncrease.copy(readyInfo, cLIApplicationUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RetryRequestCreditLineIncrease;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "request", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$RetryRequestCreditLineIncrease;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/cli/RequestCreditLineIncreaseRequest;", "getRequest", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryRequestCreditLineIncrease extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryRequestCreditLineIncrease(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            super("RetryRequestCreditLineIncrease", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCreditLineIncreaseRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.request = requestCreditLineIncreaseRequest;
            this.readyInfo = readyInfo;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest = this.request;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryRequestCreditLineIncrease(request=");
            sb.append(requestCreditLineIncreaseRequest);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.request.hashCode() * 31) + this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease retryRequestCreditLineIncrease = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.request, retryRequestCreditLineIncrease.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, retryRequestCreditLineIncrease.readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest request, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease(request, readyInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest getRequest() {
            return this.request;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.RetryRequestCreditLineIncrease retryRequestCreditLineIncrease, com.paypal.oslo.feature.revolvingcreditservicing.domain.request.cli.RequestCreditLineIncreaseRequest requestCreditLineIncreaseRequest, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestCreditLineIncreaseRequest = retryRequestCreditLineIncrease.request;
            }
            if ((i & 2) != 0) {
                readyInfo = retryRequestCreditLineIncrease.readyInfo;
            }
            return retryRequestCreditLineIncrease.copy(requestCreditLineIncreaseRequest, readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$StateWithUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/uimodel/CLIApplicationUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "getReadyInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.StateWithUiModel {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cLIApplicationUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            this.uiModel = cLIApplicationUiModel;
            this.readyInfo = readyInfo;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.StateWithUiModel
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = this.readyInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(uiModel=");
            sb.append(cLIApplicationUiModel);
            sb.append(", readyInfo=");
            sb.append(readyInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uiModel.hashCode() * 31) + this.readyInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, ready.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.readyInfo, ready.readyInfo);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready(uiModel, readyInfo);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo getReadyInfo() {
            return this.readyInfo;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.uimodel.CLIApplicationUiModel cLIApplicationUiModel, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cLIApplicationUiModel = ready.uiModel;
            }
            if ((i & 2) != 0) {
                readyInfo = ready.readyInfo;
            }
            return ready.copy(cLIApplicationUiModel, readyInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b+\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "offeredCreditLimit", "", "expirationDate", "monthlyPaymentAmount", "offerId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "creditAccountId", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component7", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationState$ReadyInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getOfferedCreditLimit", "Ljava/lang/String;", "getExpirationDate", "getMonthlyPaymentAmount", "getOfferId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "getCreditAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit;
        private final java.lang.String expirationDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount;
        private final java.lang.String offerId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit;

        public ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.currentCreditLimit = currencyAmount;
            this.offeredCreditLimit = currencyAmount2;
            this.expirationDate = str;
            this.monthlyPaymentAmount = currencyAmount3;
            this.offerId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.creditAccountId = str3;
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

        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.offeredCreditLimit;
            java.lang.String str = this.expirationDate;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.monthlyPaymentAmount;
            java.lang.String str2 = this.offerId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.String str3 = this.creditAccountId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(currentCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", offeredCreditLimit=");
            sb.append(currencyAmount2);
            sb.append(", expirationDate=");
            sb.append(str);
            sb.append(", monthlyPaymentAmount=");
            sb.append(currencyAmount3);
            sb.append(", offerId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", creditAccountId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.currentCreditLimit.hashCode() * 31) + this.offeredCreditLimit.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.monthlyPaymentAmount.hashCode()) * 31) + this.offerId.hashCode()) * 31) + this.creditProductIdentifier.hashCode()) * 31) + this.creditAccountId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, readyInfo.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.offeredCreditLimit, readyInfo.offeredCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, readyInfo.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthlyPaymentAmount, readyInfo.monthlyPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, readyInfo.offerId) && this.creditProductIdentifier == readyInfo.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, readyInfo.creditAccountId);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount offeredCreditLimit, java.lang.String expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount, java.lang.String offerId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String creditAccountId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offeredCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthlyPaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo(currentCreditLimit, offeredCreditLimit, expirationDate, monthlyPaymentAmount, offerId, creditProductIdentifier, creditAccountId);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOfferedCreditLimit() {
            return this.offeredCreditLimit;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                currencyAmount = readyInfo.currentCreditLimit;
            }
            if ((i & 2) != 0) {
                currencyAmount2 = readyInfo.offeredCreditLimit;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = currencyAmount2;
            if ((i & 4) != 0) {
                str = readyInfo.expirationDate;
            }
            java.lang.String str4 = str;
            if ((i & 8) != 0) {
                currencyAmount3 = readyInfo.monthlyPaymentAmount;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = currencyAmount3;
            if ((i & 16) != 0) {
                str2 = readyInfo.offerId;
            }
            java.lang.String str5 = str2;
            if ((i & 32) != 0) {
                creditProductIdentifier = readyInfo.creditProductIdentifier;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
            if ((i & 64) != 0) {
                str3 = readyInfo.creditAccountId;
            }
            return readyInfo.copy(currencyAmount, currencyAmount4, str4, currencyAmount5, str5, creditProductIdentifier2, str3);
        }
    }

    public /* synthetic */ CLIApplicationState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
