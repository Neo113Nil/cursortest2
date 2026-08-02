package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/izettle/android/auth/dto/TransactionConfigEntryDto;", "", "", "minTransactionAmount", "maxTransactionAmount", "", "cardHolderEntryPanRegex", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getCardHolderEntryPanRegex", "()Ljava/lang/String;", "Ljava/lang/Long;", "getMaxTransactionAmount", "()Ljava/lang/Long;", "getMinTransactionAmount"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionConfigEntryDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("CARD_HOLDER_ENTRY_PAN_REGEX")
    private final java.lang.String cardHolderEntryPanRegex;

    @com.izettle.android.serialization.annotations.JsonSerialize("MAX_TRANSACTION_AMOUNT")
    private final java.lang.Long maxTransactionAmount;

    @com.izettle.android.serialization.annotations.JsonSerialize("MIN_TRANSACTION_AMOUNT")
    private final java.lang.Long minTransactionAmount;

    public TransactionConfigEntryDto(@com.izettle.android.serialization.annotations.JsonDeserialize("MIN_TRANSACTION_AMOUNT") java.lang.Long l, @com.izettle.android.serialization.annotations.JsonDeserialize("MAX_TRANSACTION_AMOUNT") java.lang.Long l2, @com.izettle.android.serialization.annotations.JsonDeserialize("CARD_HOLDER_ENTRY_PAN_REGEX") java.lang.String str) {
        this.minTransactionAmount = l;
        this.maxTransactionAmount = l2;
        this.cardHolderEntryPanRegex = str;
    }

    public final java.lang.Long getMinTransactionAmount() {
        return this.minTransactionAmount;
    }

    public final java.lang.Long getMaxTransactionAmount() {
        return this.maxTransactionAmount;
    }

    public final java.lang.String getCardHolderEntryPanRegex() {
        return this.cardHolderEntryPanRegex;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.TransactionConfigEntryDto)) {
            return false;
        }
        com.izettle.android.auth.dto.TransactionConfigEntryDto transactionConfigEntryDto = (com.izettle.android.auth.dto.TransactionConfigEntryDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigEntryDto.minTransactionAmount, this.minTransactionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigEntryDto.maxTransactionAmount, this.maxTransactionAmount) && kotlin.jvm.internal.Intrinsics.areEqual(transactionConfigEntryDto.cardHolderEntryPanRegex, this.cardHolderEntryPanRegex);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.minTransactionAmount, this.maxTransactionAmount, this.cardHolderEntryPanRegex);
    }
}
