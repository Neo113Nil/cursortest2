package com.paypal.oslo.feature.taptopay.domain.model.payment;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J\u0088\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0015J\u001d\u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020&¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u0010\u0015R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bD\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bE\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "Landroid/os/Parcelable;", "", "id", "cardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "status", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "type", "", "amount", "currencyCode", "displayAmount", "Ljava/util/Date;", "transactionDate", "merchantName", "merchantPostalCode", "merchantCategoryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;DLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "component4", "()Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "component5", "()D", "component6", "component7", "component8", "()Ljava/util/Date;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;DLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionStatus;", "getStatus", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/TransactionType;", "getType", "D", "getAmount", "getCurrencyCode", "getDisplayAmount", "Ljava/util/Date;", "getTransactionDate", "getMerchantName", "getMerchantPostalCode", "getMerchantCategoryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Transaction implements android.os.Parcelable {
    public static final int $stable = 8;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> CREATOR = new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction.Creator();
    private final double amount;
    private final java.lang.String cardId;
    private final java.lang.String currencyCode;
    private final java.lang.String displayAmount;
    private final java.lang.String id;
    private final java.lang.String merchantCategoryCode;
    private final java.lang.String merchantName;
    private final java.lang.String merchantPostalCode;
    private final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus status;
    private final java.util.Date transactionDate;
    private final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Transaction(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType, double d, java.lang.String str3, java.lang.String str4, java.util.Date date, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.cardId = str2;
        this.status = transactionStatus;
        this.type = transactionType;
        this.amount = d;
        this.currencyCode = str3;
        this.displayAmount = str4;
        this.transactionDate = date;
        this.merchantName = str5;
        this.merchantPostalCode = str6;
        this.merchantCategoryCode = str7;
    }

    public /* synthetic */ Transaction(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType, double d, java.lang.String str3, java.lang.String str4, java.util.Date date, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, transactionStatus, transactionType, d, str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : date, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType getType() {
        return this.type;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getDisplayAmount() {
        return this.displayAmount;
    }

    public final java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public final java.lang.String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.cardId);
        this.status.writeToParcel(dest, flags);
        this.type.writeToParcel(dest, flags);
        dest.writeDouble(this.amount);
        dest.writeString(this.currencyCode);
        dest.writeString(this.displayAmount);
        dest.writeSerializable(this.transactionDate);
        dest.writeString(this.merchantName);
        dest.writeString(this.merchantPostalCode);
        dest.writeString(this.merchantCategoryCode);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.cardId;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus transactionStatus = this.status;
        com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType transactionType = this.type;
        double d = this.amount;
        java.lang.String str3 = this.currencyCode;
        java.lang.String str4 = this.displayAmount;
        java.util.Date date = this.transactionDate;
        java.lang.String str5 = this.merchantName;
        java.lang.String str6 = this.merchantPostalCode;
        java.lang.String str7 = this.merchantCategoryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction(id=");
        sb.append(str);
        sb.append(", cardId=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(transactionStatus);
        sb.append(", type=");
        sb.append(transactionType);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", displayAmount=");
        sb.append(str4);
        sb.append(", transactionDate=");
        sb.append(date);
        sb.append(", merchantName=");
        sb.append(str5);
        sb.append(", merchantPostalCode=");
        sb.append(str6);
        sb.append(", merchantCategoryCode=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.cardId.hashCode();
        int hashCode3 = this.status.hashCode();
        int hashCode4 = this.type.hashCode();
        int hashCode5 = java.lang.Double.hashCode(this.amount);
        int hashCode6 = this.currencyCode.hashCode();
        java.lang.String str = this.displayAmount;
        int hashCode7 = str == null ? 0 : str.hashCode();
        java.util.Date date = this.transactionDate;
        int hashCode8 = date == null ? 0 : date.hashCode();
        java.lang.String str2 = this.merchantName;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.merchantPostalCode;
        int hashCode10 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.merchantCategoryCode;
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, transaction.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, transaction.cardId) && this.status == transaction.status && this.type == transaction.type && java.lang.Double.compare(this.amount, transaction.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, transaction.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAmount, transaction.displayAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionDate, transaction.transactionDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, transaction.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantPostalCode, transaction.merchantPostalCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantCategoryCode, transaction.merchantCategoryCode);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction copy(java.lang.String id, java.lang.String cardId, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus status, com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType type, double amount, java.lang.String currencyCode, java.lang.String displayAmount, java.util.Date transactionDate, java.lang.String merchantName, java.lang.String merchantPostalCode, java.lang.String merchantCategoryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(id, cardId, status, type, amount, currencyCode, displayAmount, transactionDate, merchantName, merchantPostalCode, merchantCategoryCode);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component8, reason: from getter */
    public final java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDisplayAmount() {
        return this.displayAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction[] newArray(int i) {
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction(parcel.readString(), parcel.readString(), com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionStatus.CREATOR.createFromParcel(parcel), com.paypal.oslo.feature.taptopay.domain.model.payment.TransactionType.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readString(), parcel.readString(), (java.util.Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
