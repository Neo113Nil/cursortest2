package com.paypal.oslo.feature.taptopay.domain.model.payment;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/DigitizedCardStatus;", "Landroid/os/Parcelable;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "", "paymentsLeft", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "status", "", "needsReplenishment", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;Z)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "component4", "()Z", "copy", "(Ljava/lang/String;ILcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;Z)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/DigitizedCardStatus;", "describeContents", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getExpiryDate", com.visa.cbp.getEncExpo.warmup, "getPaymentsLeft", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/DigitizedCard$Status;", "getStatus", "Z", "getNeedsReplenishment"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DigitizedCardStatus implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus> CREATOR = new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus.Creator();
    private final java.lang.String expiryDate;
    private final boolean needsReplenishment;
    private final int paymentsLeft;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DigitizedCardStatus(java.lang.String str, int i, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.expiryDate = str;
        this.paymentsLeft = i;
        this.status = status;
        this.needsReplenishment = z;
    }

    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    public final int getPaymentsLeft() {
        return this.paymentsLeft;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status getStatus() {
        return this.status;
    }

    public final boolean getNeedsReplenishment() {
        return this.needsReplenishment;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.expiryDate);
        dest.writeInt(this.paymentsLeft);
        dest.writeString(this.status.name());
        dest.writeInt(this.needsReplenishment ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.expiryDate;
        int i = this.paymentsLeft;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status = this.status;
        boolean z = this.needsReplenishment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DigitizedCardStatus(expiryDate=");
        sb.append(str);
        sb.append(", paymentsLeft=");
        sb.append(i);
        sb.append(", status=");
        sb.append(status);
        sb.append(", needsReplenishment=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.expiryDate;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.paymentsLeft)) * 31) + this.status.hashCode()) * 31) + java.lang.Boolean.hashCode(this.needsReplenishment);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus = (com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, digitizedCardStatus.expiryDate) && this.paymentsLeft == digitizedCardStatus.paymentsLeft && this.status == digitizedCardStatus.status && this.needsReplenishment == digitizedCardStatus.needsReplenishment;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus copy(java.lang.String expiryDate, int paymentsLeft, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, boolean needsReplenishment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus(expiryDate, paymentsLeft, status, needsReplenishment);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getNeedsReplenishment() {
        return this.needsReplenishment;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus[] newArray(int i) {
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus(parcel.readString(), parcel.readInt(), com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status.valueOf(parcel.readString()), parcel.readInt() != 0);
        }
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPaymentsLeft() {
        return this.paymentsLeft;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getExpiryDate() {
        return this.expiryDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus copy$default(com.paypal.oslo.feature.taptopay.domain.model.payment.DigitizedCardStatus digitizedCardStatus, java.lang.String str, int i, com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard.Status status, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = digitizedCardStatus.expiryDate;
        }
        if ((i2 & 2) != 0) {
            i = digitizedCardStatus.paymentsLeft;
        }
        if ((i2 & 4) != 0) {
            status = digitizedCardStatus.status;
        }
        if ((i2 & 8) != 0) {
            z = digitizedCardStatus.needsReplenishment;
        }
        return digitizedCardStatus.copy(str, i, status, z);
    }
}
