package com.paypal.android.taptopay.domain.model.payment;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0012J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020 HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b6\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010\u001d"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "Landroid/os/Parcelable;", "", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Analytics.ANALYTICS_ID, "", "amount", "currencyCode", "Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "digitizedCardStatus", "rawAmount", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "cardScheme", "transactionDate", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "transactionType", "<init>", "(Ljava/lang/String;DLjava/lang/String;Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;DLcom/paypal/android/taptopay/domain/model/CardScheme;Ljava/lang/String;Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "()Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "component5", "component6", "()Lcom/paypal/android/taptopay/domain/model/CardScheme;", "component7", "component8", "()Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "copy", "(Ljava/lang/String;DLjava/lang/String;Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;DLcom/paypal/android/taptopay/domain/model/CardScheme;Ljava/lang/String;Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;)Lcom/paypal/android/taptopay/domain/model/payment/TransactionContext;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAid", "D", "getAmount", "Lcom/paypal/android/taptopay/domain/model/CardScheme;", "getCardScheme", "getCurrencyCode", "Lcom/paypal/android/taptopay/domain/model/payment/DigitizedCardStatus;", "getDigitizedCardStatus", "getRawAmount", "getTransactionDate", "Lcom/paypal/android/taptopay/domain/model/payment/TransactionType;", "getTransactionType"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TransactionContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.TransactionContext> CREATOR = new com.paypal.android.taptopay.domain.model.payment.TransactionContext.Creator();
    private final java.lang.String aid;
    private final double amount;
    private final com.paypal.android.taptopay.domain.model.CardScheme cardScheme;
    private final java.lang.String currencyCode;
    private final com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus;
    private final double rawAmount;
    private final java.lang.String transactionDate;
    private final com.paypal.android.taptopay.domain.model.payment.TransactionType transactionType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TransactionContext(java.lang.String str, double d, java.lang.String str2, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus, double d2, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String str3, com.paypal.android.taptopay.domain.model.payment.TransactionType transactionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardScheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        this.aid = str;
        this.amount = d;
        this.currencyCode = str2;
        this.digitizedCardStatus = digitizedCardStatus;
        this.rawAmount = d2;
        this.cardScheme = cardScheme;
        this.transactionDate = str3;
        this.transactionType = transactionType;
    }

    public final java.lang.String getAid() {
        return this.aid;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus getDigitizedCardStatus() {
        return this.digitizedCardStatus;
    }

    public final double getRawAmount() {
        return this.rawAmount;
    }

    public final com.paypal.android.taptopay.domain.model.CardScheme getCardScheme() {
        return this.cardScheme;
    }

    public final java.lang.String getTransactionDate() {
        return this.transactionDate;
    }

    public final com.paypal.android.taptopay.domain.model.payment.TransactionType getTransactionType() {
        return this.transactionType;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        com.paypal.android.taptopay.domain.model.payment.TransactionContext transactionContext = (com.paypal.android.taptopay.domain.model.payment.TransactionContext) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.aid, transactionContext.aid) && this.amount == transactionContext.amount && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transactionContext.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitizedCardStatus, transactionContext.digitizedCardStatus) && this.rawAmount == transactionContext.rawAmount && this.cardScheme == transactionContext.cardScheme && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionDate, transactionContext.transactionDate)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionType.name(), transactionContext.transactionType.name());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.aid.hashCode();
        int hashCode2 = java.lang.Double.hashCode(this.amount);
        int hashCode3 = this.currencyCode.hashCode();
        int hashCode4 = this.digitizedCardStatus.hashCode();
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + java.lang.Double.hashCode(this.rawAmount)) * 31) + this.cardScheme.hashCode()) * 31) + this.transactionDate.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.aid);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.currencyCode);
        this.digitizedCardStatus.writeToParcel(parcel, flags);
        parcel.writeDouble(this.rawAmount);
        parcel.writeString(this.cardScheme.name());
        parcel.writeString(this.transactionDate);
        this.transactionType.writeToParcel(parcel, flags);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.aid;
        double d = this.amount;
        java.lang.String str2 = this.currencyCode;
        com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus = this.digitizedCardStatus;
        double d2 = this.rawAmount;
        com.paypal.android.taptopay.domain.model.CardScheme cardScheme = this.cardScheme;
        java.lang.String str3 = this.transactionDate;
        com.paypal.android.taptopay.domain.model.payment.TransactionType transactionType = this.transactionType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionContext(aid=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", digitizedCardStatus=");
        sb.append(digitizedCardStatus);
        sb.append(", rawAmount=");
        sb.append(d2);
        sb.append(", cardScheme=");
        sb.append(cardScheme);
        sb.append(", transactionDate=");
        sb.append(str3);
        sb.append(", transactionType=");
        sb.append(transactionType);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.android.taptopay.domain.model.payment.TransactionContext copy(java.lang.String aid, double amount, java.lang.String currencyCode, com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus, double rawAmount, com.paypal.android.taptopay.domain.model.CardScheme cardScheme, java.lang.String transactionDate, com.paypal.android.taptopay.domain.model.payment.TransactionType transactionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digitizedCardStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardScheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        return new com.paypal.android.taptopay.domain.model.payment.TransactionContext(aid, amount, currencyCode, digitizedCardStatus, rawAmount, cardScheme, transactionDate, transactionType);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.payment.TransactionType getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.CardScheme getCardScheme() {
        return this.cardScheme;
    }

    /* renamed from: component5, reason: from getter */
    public final double getRawAmount() {
        return this.rawAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus getDigitizedCardStatus() {
        return this.digitizedCardStatus;
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.android.taptopay.domain.model.payment.TransactionContext> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.android.taptopay.domain.model.payment.TransactionContext[] newArray(int i) {
            return new com.paypal.android.taptopay.domain.model.payment.TransactionContext[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.android.taptopay.domain.model.payment.TransactionContext createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.android.taptopay.domain.model.payment.TransactionContext(parcel.readString(), parcel.readDouble(), parcel.readString(), com.paypal.android.taptopay.domain.model.payment.DigitizedCardStatus.CREATOR.createFromParcel(parcel), parcel.readDouble(), com.paypal.android.taptopay.domain.model.CardScheme.valueOf(parcel.readString()), parcel.readString(), com.paypal.android.taptopay.domain.model.payment.TransactionType.CREATOR.createFromParcel(parcel));
        }
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAid() {
        return this.aid;
    }
}
