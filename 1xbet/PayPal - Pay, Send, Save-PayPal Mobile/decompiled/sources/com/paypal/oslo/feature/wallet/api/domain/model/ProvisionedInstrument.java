package com.paypal.oslo.feature.wallet.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "BankAccount", com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.OPERATION_NAME, "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$BankAccount;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$Card;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$PaymentToken;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProvisionedInstrument {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$Card;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "", "issuerName", "lastNChars", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssuerName", "getLastNChars", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card implements com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument {
        public static final int $stable = 0;
        private final java.lang.String issuerName;
        private final java.lang.String lastNChars;
        private final java.lang.String productClass;

        public Card(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.issuerName = str;
            this.lastNChars = str2;
            this.productClass = str3;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.issuerName;
            java.lang.String str2 = this.lastNChars;
            java.lang.String str3 = this.productClass;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(issuerName=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", productClass=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.issuerName.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.productClass.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card card = (com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, card.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, card.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.productClass, card.productClass);
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card copy(java.lang.String issuerName, java.lang.String lastNChars, java.lang.String productClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productClass, "");
            return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card(issuerName, lastNChars, productClass);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProductClass() {
            return this.productClass;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card copy$default(com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card card, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = card.issuerName;
            }
            if ((i & 2) != 0) {
                str2 = card.lastNChars;
            }
            if ((i & 4) != 0) {
                str3 = card.productClass;
            }
            return card.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$BankAccount;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "", "issuerName", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "accountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;)Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$BankAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIssuerName", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getAccountType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount implements com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType accountType;
        private final java.lang.String issuerName;
        private final java.lang.String lastNChars;

        public BankAccount(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
            this.issuerName = str;
            this.lastNChars = str2;
            this.accountType = bankAccountType;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getAccountType() {
            return this.accountType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.issuerName;
            java.lang.String str2 = this.lastNChars;
            com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.accountType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(issuerName=");
            sb.append(str);
            sb.append(", lastNChars=");
            sb.append(str2);
            sb.append(", accountType=");
            sb.append(bankAccountType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.issuerName.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.accountType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, bankAccount.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccount.lastNChars) && this.accountType == bankAccount.accountType;
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount copy(java.lang.String issuerName, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType accountType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
            return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount(issuerName, lastNChars, accountType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount copy$default(com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount bankAccount, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = bankAccount.issuerName;
            }
            if ((i & 2) != 0) {
                str2 = bankAccount.lastNChars;
            }
            if ((i & 4) != 0) {
                bankAccountType = bankAccount.accountType;
            }
            return bankAccount.copy(str, str2, bankAccountType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$PaymentToken;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "", "displayName", "issuerName", "lastNChars", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument$PaymentToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "getIssuerName", "getLastNChars"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentToken implements com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument {
        public static final int $stable = 0;
        private final java.lang.String displayName;
        private final java.lang.String issuerName;
        private final java.lang.String lastNChars;

        public PaymentToken(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.displayName = str;
            this.issuerName = str2;
            this.lastNChars = str3;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.displayName;
            java.lang.String str2 = this.issuerName;
            java.lang.String str3 = this.lastNChars;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentToken(displayName=");
            sb.append(str);
            sb.append(", issuerName=");
            sb.append(str2);
            sb.append(", lastNChars=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.displayName.hashCode() * 31) + this.issuerName.hashCode()) * 31) + this.lastNChars.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken paymentToken = (com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, paymentToken.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, paymentToken.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, paymentToken.lastNChars);
        }

        public final com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken copy(java.lang.String displayName, java.lang.String issuerName, java.lang.String lastNChars) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
            return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken(displayName, issuerName, lastNChars);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getLastNChars() {
            return this.lastNChars;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIssuerName() {
            return this.issuerName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken copy$default(com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken paymentToken, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentToken.displayName;
            }
            if ((i & 2) != 0) {
                str2 = paymentToken.issuerName;
            }
            if ((i & 4) != 0) {
                str3 = paymentToken.lastNChars;
            }
            return paymentToken.copy(str, str2, str3);
        }
    }
}
