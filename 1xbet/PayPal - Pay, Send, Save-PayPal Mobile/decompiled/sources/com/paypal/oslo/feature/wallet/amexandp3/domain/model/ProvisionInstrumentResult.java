package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ²\u0001\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b.\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b/\u0010\u0014R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001bR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b2\u0010\u001bR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b3\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "", "", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "paymentTokens", "remainingPaymentTokens", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "cards", "remainingCards", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "bankAccounts", "remainingBankAccounts", "", "", "paymentTokenErrorMessage", "cardsErrorMessage", "bankAccountsErrorMessage", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPaymentTokens", "getRemainingPaymentTokens", "getCards", "getRemainingCards", "getBankAccounts", "getRemainingBankAccounts", "Ljava/util/Map;", "getPaymentTokenErrorMessage", "getCardsErrorMessage", "getBankAccountsErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProvisionInstrumentResult {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> bankAccounts;
    private final java.util.Map<java.lang.String, java.lang.String> bankAccountsErrorMessage;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> cards;
    private final java.util.Map<java.lang.String, java.lang.String> cardsErrorMessage;
    private final java.util.Map<java.lang.String, java.lang.String> paymentTokenErrorMessage;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> paymentTokens;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> remainingBankAccounts;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> remainingCards;
    private final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> remainingPaymentTokens;

    public ProvisionInstrumentResult(java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> list, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> list2, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> list3, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> list4, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> list5, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> list6, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        this.paymentTokens = list;
        this.remainingPaymentTokens = list2;
        this.cards = list3;
        this.remainingCards = list4;
        this.bankAccounts = list5;
        this.remainingBankAccounts = list6;
        this.paymentTokenErrorMessage = map;
        this.cardsErrorMessage = map2;
        this.bankAccountsErrorMessage = map3;
    }

    public /* synthetic */ ProvisionInstrumentResult(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, java.util.List list6, java.util.Map map, java.util.Map map2, java.util.Map map3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list6, (i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 128) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i & 256) != 0 ? kotlin.collections.MapsKt.emptyMap() : map3);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> getPaymentTokens() {
        return this.paymentTokens;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> getRemainingPaymentTokens() {
        return this.remainingPaymentTokens;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> getCards() {
        return this.cards;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> getRemainingCards() {
        return this.remainingCards;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> getBankAccounts() {
        return this.bankAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> getRemainingBankAccounts() {
        return this.remainingBankAccounts;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getPaymentTokenErrorMessage() {
        return this.paymentTokenErrorMessage;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getCardsErrorMessage() {
        return this.cardsErrorMessage;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getBankAccountsErrorMessage() {
        return this.bankAccountsErrorMessage;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> list = this.paymentTokens;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> list2 = this.remainingPaymentTokens;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> list3 = this.cards;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> list4 = this.remainingCards;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> list5 = this.bankAccounts;
        java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> list6 = this.remainingBankAccounts;
        java.util.Map<java.lang.String, java.lang.String> map = this.paymentTokenErrorMessage;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.cardsErrorMessage;
        java.util.Map<java.lang.String, java.lang.String> map3 = this.bankAccountsErrorMessage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionInstrumentResult(paymentTokens=");
        sb.append(list);
        sb.append(", remainingPaymentTokens=");
        sb.append(list2);
        sb.append(", cards=");
        sb.append(list3);
        sb.append(", remainingCards=");
        sb.append(list4);
        sb.append(", bankAccounts=");
        sb.append(list5);
        sb.append(", remainingBankAccounts=");
        sb.append(list6);
        sb.append(", paymentTokenErrorMessage=");
        sb.append(map);
        sb.append(", cardsErrorMessage=");
        sb.append(map2);
        sb.append(", bankAccountsErrorMessage=");
        sb.append(map3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((this.paymentTokens.hashCode() * 31) + this.remainingPaymentTokens.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.remainingCards.hashCode()) * 31) + this.bankAccounts.hashCode()) * 31) + this.remainingBankAccounts.hashCode()) * 31) + this.paymentTokenErrorMessage.hashCode()) * 31) + this.cardsErrorMessage.hashCode()) * 31) + this.bankAccountsErrorMessage.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult provisionInstrumentResult = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokens, provisionInstrumentResult.paymentTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingPaymentTokens, provisionInstrumentResult.remainingPaymentTokens) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, provisionInstrumentResult.cards) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingCards, provisionInstrumentResult.remainingCards) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccounts, provisionInstrumentResult.bankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingBankAccounts, provisionInstrumentResult.remainingBankAccounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTokenErrorMessage, provisionInstrumentResult.paymentTokenErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardsErrorMessage, provisionInstrumentResult.cardsErrorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountsErrorMessage, provisionInstrumentResult.bankAccountsErrorMessage);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult copy(java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> paymentTokens, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> remainingPaymentTokens, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> cards, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> remainingCards, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> bankAccounts, java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> remainingBankAccounts, java.util.Map<java.lang.String, java.lang.String> paymentTokenErrorMessage, java.util.Map<java.lang.String, java.lang.String> cardsErrorMessage, java.util.Map<java.lang.String, java.lang.String> bankAccountsErrorMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remainingPaymentTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remainingCards, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remainingBankAccounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTokenErrorMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardsErrorMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountsErrorMessage, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentResult(paymentTokens, remainingPaymentTokens, cards, remainingCards, bankAccounts, remainingBankAccounts, paymentTokenErrorMessage, cardsErrorMessage, bankAccountsErrorMessage);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component9() {
        return this.bankAccountsErrorMessage;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component8() {
        return this.cardsErrorMessage;
    }

    public final java.util.Map<java.lang.String, java.lang.String> component7() {
        return this.paymentTokenErrorMessage;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> component6() {
        return this.remainingBankAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo> component5() {
        return this.bankAccounts;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> component4() {
        return this.remainingCards;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo> component3() {
        return this.cards;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> component2() {
        return this.remainingPaymentTokens;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo> component1() {
        return this.paymentTokens;
    }

    public ProvisionInstrumentResult() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
