package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "BankAccount", com.paypal.oslo.feature.wallet.graphql.PaymentTokenQuery.OPERATION_NAME, "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$BankAccount;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$Card;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$PaymentToken;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProvisionInstrumentInfo {

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$Card;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "cardInfo", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "getCardInfo", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo;
        private final java.lang.String errorMessage;

        public Card(com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
            this.cardInfo = cardInfo;
            this.errorMessage = str;
        }

        public /* synthetic */ Card(com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(cardInfo, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo getCardInfo() {
            return this.cardInfo;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo = this.cardInfo;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(cardInfo=");
            sb.append(cardInfo);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cardInfo.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card card = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardInfo, card.cardInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, card.errorMessage);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card copy(com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
            return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card(cardInfo, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo getCardInfo() {
            return this.cardInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card copy$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card card, com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardInfo = card.cardInfo;
            }
            if ((i & 2) != 0) {
                str = card.errorMessage;
            }
            return card.copy(cardInfo, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$BankAccount;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "bankAccountInfo", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$BankAccount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "getBankAccountInfo", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BankAccount implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo;
        private final java.lang.String errorMessage;

        public BankAccount(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
            this.bankAccountInfo = bankAccountInfo;
            this.errorMessage = str;
        }

        public /* synthetic */ BankAccount(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bankAccountInfo, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo getBankAccountInfo() {
            return this.bankAccountInfo;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo = this.bankAccountInfo;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccount(bankAccountInfo=");
            sb.append(bankAccountInfo);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.bankAccountInfo.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountInfo, bankAccount.bankAccountInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, bankAccount.errorMessage);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount copy(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
            return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount(bankAccountInfo, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo getBankAccountInfo() {
            return this.bankAccountInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount copy$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount bankAccount, com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountInfo = bankAccount.bankAccountInfo;
            }
            if ((i & 2) != 0) {
                str = bankAccount.errorMessage;
            }
            return bankAccount.copy(bankAccountInfo, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$PaymentToken;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "paymentTokenInfo", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$PaymentToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "getPaymentTokenInfo", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentToken implements com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo;

        public PaymentToken(com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTokenInfo, "");
            this.paymentTokenInfo = paymentTokenInfo;
            this.errorMessage = str;
        }

        public /* synthetic */ PaymentToken(com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentTokenInfo, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo getPaymentTokenInfo() {
            return this.paymentTokenInfo;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo = this.paymentTokenInfo;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentToken(paymentTokenInfo=");
            sb.append(paymentTokenInfo);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.paymentTokenInfo.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken paymentToken = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokenInfo, paymentToken.paymentTokenInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, paymentToken.errorMessage);
        }

        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken copy(com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTokenInfo, "");
            return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken(paymentTokenInfo, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo getPaymentTokenInfo() {
            return this.paymentTokenInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken copy$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken paymentToken, com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentTokenInfo = paymentToken.paymentTokenInfo;
            }
            if ((i & 2) != 0) {
                str = paymentToken.errorMessage;
            }
            return paymentToken.copy(paymentTokenInfo, str);
        }
    }
}
