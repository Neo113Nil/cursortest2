package com.paypal.oslo.feature.wallet.common.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "", "", "getId", "()Ljava/lang/String;", "id", "BalanceMethod", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Bank", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$BalanceMethod;", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Bank;", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Card;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PaymentMethod {
    java.lang.String getId();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$BalanceMethod;", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "info", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/model/Balance;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/model/Balance;)Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$BalanceMethod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "getInfo", "getId", "id"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BalanceMethod implements com.paypal.oslo.feature.wallet.common.model.PaymentMethod {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.model.Balance info;

        public BalanceMethod(com.paypal.oslo.feature.wallet.common.model.Balance balance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
            this.info = balance;
        }

        public final com.paypal.oslo.feature.wallet.common.model.Balance getInfo() {
            return this.info;
        }

        @Override // com.paypal.oslo.feature.wallet.common.model.PaymentMethod
        public final java.lang.String getId() {
            return this.info.getId();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.model.Balance balance = this.info;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceMethod(info=");
            sb.append(balance);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.info.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, ((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod) other).info);
        }

        public final com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod copy(com.paypal.oslo.feature.wallet.common.model.Balance info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            return new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod(info);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.model.Balance getInfo() {
            return this.info;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod copy$default(com.paypal.oslo.feature.wallet.common.model.PaymentMethod.BalanceMethod balanceMethod, com.paypal.oslo.feature.wallet.common.model.Balance balance, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                balance = balanceMethod.info;
            }
            return balanceMethod.copy(balance);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Card;", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "info", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;)Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/model/CardInfo;", "getInfo", "getId", "id"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Card implements com.paypal.oslo.feature.wallet.common.model.PaymentMethod {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.model.CardInfo info;

        public Card(com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
            this.info = cardInfo;
        }

        public final com.paypal.oslo.feature.wallet.common.model.CardInfo getInfo() {
            return this.info;
        }

        @Override // com.paypal.oslo.feature.wallet.common.model.PaymentMethod
        public final java.lang.String getId() {
            return this.info.getId();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo = this.info;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(info=");
            sb.append(cardInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.info.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, ((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card) other).info);
        }

        public final com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card copy(com.paypal.oslo.feature.wallet.common.model.CardInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            return new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card(info);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.model.CardInfo getInfo() {
            return this.info;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card copy$default(com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Card card, com.paypal.oslo.feature.wallet.common.model.CardInfo cardInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardInfo = card.info;
            }
            return card.copy(cardInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Bank;", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;", "info", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;)Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod$Bank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/model/BankAccountInfo;", "getInfo", "getId", "id"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Bank implements com.paypal.oslo.feature.wallet.common.model.PaymentMethod {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.common.model.BankAccountInfo info;

        public Bank(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
            this.info = bankAccountInfo;
        }

        public final com.paypal.oslo.feature.wallet.common.model.BankAccountInfo getInfo() {
            return this.info;
        }

        @Override // com.paypal.oslo.feature.wallet.common.model.PaymentMethod
        public final java.lang.String getId() {
            return this.info.getId();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo = this.info;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bank(info=");
            sb.append(bankAccountInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.info.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank) && kotlin.jvm.internal.Intrinsics.areEqual(this.info, ((com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank) other).info);
        }

        public final com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank copy(com.paypal.oslo.feature.wallet.common.model.BankAccountInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            return new com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank(info);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.model.BankAccountInfo getInfo() {
            return this.info;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank copy$default(com.paypal.oslo.feature.wallet.common.model.PaymentMethod.Bank bank, com.paypal.oslo.feature.wallet.common.model.BankAccountInfo bankAccountInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bankAccountInfo = bank.info;
            }
            return bank.copy(bankAccountInfo);
        }
    }
}
