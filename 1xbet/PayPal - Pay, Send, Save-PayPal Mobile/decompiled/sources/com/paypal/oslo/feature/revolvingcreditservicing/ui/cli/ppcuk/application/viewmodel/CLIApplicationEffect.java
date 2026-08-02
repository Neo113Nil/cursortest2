package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OpenPrivacyPolicy", "NavigateToApprovalScreen", "NavigateToDeclineScreen", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$NavigateToApprovalScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$NavigateToDeclineScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$OpenPrivacyPolicy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class CLIApplicationEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CLIApplicationEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$OpenPrivacyPolicy;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$OpenPrivacyPolicy;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenPrivacyPolicy extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenPrivacyPolicy(java.lang.String str) {
            super("OpenPrivacyPolicy", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenPrivacyPolicy(url=");
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
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy) other).url);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.OpenPrivacyPolicy openPrivacyPolicy, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openPrivacyPolicy.url;
            }
            return openPrivacyPolicy.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b(\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$NavigateToApprovalScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect;", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "expirationDate", "newCreditLimit", "monthlyPaymentAmount", "offerId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component3", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$NavigateToApprovalScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getExpirationDate", "getNewCreditLimit", "getMonthlyPaymentAmount", "getOfferId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToApprovalScreen extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit;
        private final java.lang.String expirationDate;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit;
        private final java.lang.String offerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToApprovalScreen(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            super("NavigateToApprovalScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.creditAccountId = str;
            this.currentCreditLimit = currencyAmount;
            this.expirationDate = str2;
            this.newCreditLimit = currencyAmount2;
            this.monthlyPaymentAmount = currencyAmount3;
            this.offerId = str3;
            this.creditProductIdentifier = creditProductIdentifier;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
            return this.newCreditLimit;
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

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
            java.lang.String str2 = this.expirationDate;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.newCreditLimit;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.monthlyPaymentAmount;
            java.lang.String str3 = this.offerId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToApprovalScreen(creditAccountId=");
            sb.append(str);
            sb.append(", currentCreditLimit=");
            sb.append(currencyAmount);
            sb.append(", expirationDate=");
            sb.append(str2);
            sb.append(", newCreditLimit=");
            sb.append(currencyAmount2);
            sb.append(", monthlyPaymentAmount=");
            sb.append(currencyAmount3);
            sb.append(", offerId=");
            sb.append(str3);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.creditAccountId.hashCode() * 31) + this.currentCreditLimit.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.newCreditLimit.hashCode()) * 31) + this.monthlyPaymentAmount.hashCode()) * 31) + this.offerId.hashCode()) * 31) + this.creditProductIdentifier.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen navigateToApprovalScreen = (com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, navigateToApprovalScreen.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, navigateToApprovalScreen.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, navigateToApprovalScreen.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.newCreditLimit, navigateToApprovalScreen.newCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.monthlyPaymentAmount, navigateToApprovalScreen.monthlyPaymentAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, navigateToApprovalScreen.offerId) && this.creditProductIdentifier == navigateToApprovalScreen.creditProductIdentifier;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen copy(java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, java.lang.String expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount monthlyPaymentAmount, java.lang.String offerId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCreditLimit, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthlyPaymentAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen(creditAccountId, currentCreditLimit, expirationDate, newCreditLimit, monthlyPaymentAmount, offerId, creditProductIdentifier);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMonthlyPaymentAmount() {
            return this.monthlyPaymentAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
            return this.newCreditLimit;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getExpirationDate() {
            return this.expirationDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
            return this.currentCreditLimit;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToApprovalScreen navigateToApprovalScreen, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToApprovalScreen.creditAccountId;
            }
            if ((i & 2) != 0) {
                currencyAmount = navigateToApprovalScreen.currentCreditLimit;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = currencyAmount;
            if ((i & 4) != 0) {
                str2 = navigateToApprovalScreen.expirationDate;
            }
            java.lang.String str4 = str2;
            if ((i & 8) != 0) {
                currencyAmount2 = navigateToApprovalScreen.newCreditLimit;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount5 = currencyAmount2;
            if ((i & 16) != 0) {
                currencyAmount3 = navigateToApprovalScreen.monthlyPaymentAmount;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount6 = currencyAmount3;
            if ((i & 32) != 0) {
                str3 = navigateToApprovalScreen.offerId;
            }
            java.lang.String str5 = str3;
            if ((i & 64) != 0) {
                creditProductIdentifier = navigateToApprovalScreen.creditProductIdentifier;
            }
            return navigateToApprovalScreen.copy(str, currencyAmount4, str4, currencyAmount5, currencyAmount6, str5, creditProductIdentifier);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect$NavigateToDeclineScreen;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/cli/ppcuk/application/viewmodel/CLIApplicationEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDeclineScreen extends com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToDeclineScreen INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToDeclineScreen();

        public final int hashCode() {
            return 1476999038;
        }

        private NavigateToDeclineScreen() {
            super("NavigateToDeclineScreen", null);
        }

        public final java.lang.String toString() {
            return "NavigateToDeclineScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationEffect.NavigateToDeclineScreen)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CLIApplicationEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
