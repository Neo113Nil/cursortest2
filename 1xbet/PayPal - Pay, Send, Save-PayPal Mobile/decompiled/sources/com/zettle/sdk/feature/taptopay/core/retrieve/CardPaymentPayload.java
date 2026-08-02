package com.zettle.sdk.feature.taptopay.core.retrieve;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0019\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007Bw\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b'\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b(\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b\u0004\u00101R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b2\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b3\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00104\u001a\u0004\b5\u00106R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b7\u0010&"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;", "Landroid/os/Parcelable;", "payload", "", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_IS_REFUNDABLE, "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/retrieve/CardPaymentPayload;Z)V", "()V", "", "referenceId", "", "amount", "transactionId", "Ljava/util/Currency;", "currency", "Ljava/util/Date;", "date", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, "cardLastDigits", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_TOTAL_FEES, "(Ljava/lang/String;JLjava/lang/String;ZLjava/util/Currency;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getAmount", "()J", "Ljava/lang/String;", "getApplicationName", "()Ljava/lang/String;", "getCardLastDigits", "getCardPaymentEntryMode", "getCardType", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "Z", "()Z", "getReferenceId", "getReferenceNumber", "Ljava/lang/Long;", "getTotalFees", "()Ljava/lang/Long;", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CardPaymentPayload implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload> CREATOR = new com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload.Creator();
    private final long amount;
    private final java.lang.String applicationName;
    private final java.lang.String cardLastDigits;
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardType;
    private final java.util.Currency currency;
    private final java.util.Date date;
    private final boolean isRefundable;
    private final java.lang.String referenceId;
    private final java.lang.String referenceNumber;
    private final java.lang.Long totalFees;
    private final java.lang.String transactionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CardPaymentPayload(java.lang.String str, long j, java.lang.String str2, boolean z, java.util.Currency currency, java.util.Date date, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        this.referenceId = str;
        this.amount = j;
        this.transactionId = str2;
        this.isRefundable = z;
        this.currency = currency;
        this.date = date;
        this.cardType = str3;
        this.referenceNumber = str4;
        this.cardLastDigits = str5;
        this.cardPaymentEntryMode = str6;
        this.applicationName = str7;
        this.totalFees = l;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: isRefundable, reason: from getter */
    public final boolean getIsRefundable() {
        return this.isRefundable;
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final java.util.Date getDate() {
        return this.date;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getReferenceNumber() {
        return this.referenceNumber;
    }

    public final java.lang.String getCardLastDigits() {
        return this.cardLastDigits;
    }

    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    public final java.lang.Long getTotalFees() {
        return this.totalFees;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPaymentPayload(com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload cardPaymentPayload, boolean z) {
        this(cardPaymentPayload.referenceId, cardPaymentPayload.amount, cardPaymentPayload.transactionId, z, cardPaymentPayload.currency, cardPaymentPayload.date, cardPaymentPayload.cardType, cardPaymentPayload.referenceNumber, cardPaymentPayload.cardLastDigits, cardPaymentPayload.cardPaymentEntryMode, cardPaymentPayload.applicationName, cardPaymentPayload.totalFees);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPaymentPayload, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardPaymentPayload() {
        this(r2, r3, r5, true, r7, new java.util.Date(), null, null, null, null, null, null);
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        long random = (long) (java.lang.Math.random() * 1000.0d);
        java.lang.String obj2 = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        java.util.Currency currency = java.util.Currency.getInstance("SEK");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.core.retrieve.CardPaymentPayload(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, (java.util.Currency) parcel.readSerializable(), (java.util.Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Long.valueOf(parcel.readLong()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.referenceId);
        parcel.writeLong(this.amount);
        parcel.writeString(this.transactionId);
        parcel.writeInt(this.isRefundable ? 1 : 0);
        parcel.writeSerializable(this.currency);
        parcel.writeSerializable(this.date);
        parcel.writeString(this.cardType);
        parcel.writeString(this.referenceNumber);
        parcel.writeString(this.cardLastDigits);
        parcel.writeString(this.cardPaymentEntryMode);
        parcel.writeString(this.applicationName);
        java.lang.Long l = this.totalFees;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }
}
