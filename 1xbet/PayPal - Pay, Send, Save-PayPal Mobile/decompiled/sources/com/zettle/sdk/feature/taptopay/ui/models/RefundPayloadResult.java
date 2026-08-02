package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b \u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;", "Landroid/os/Parcelable;", "", "originalAmount", "refundedAmount", "", "transactionId", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "maskedPan", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, "entryMode", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCardType", "()Ljava/lang/String;", "getEntryMode", "getMaskedPan", "J", "getOriginalAmount", "()J", "getReferenceNumber", "getRefundedAmount", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundPayloadResult implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult.Creator();
    private final java.lang.String cardType;
    private final java.lang.String entryMode;
    private final java.lang.String maskedPan;
    private final long originalAmount;
    private final java.lang.String referenceNumber;
    private final long refundedAmount;
    private final java.lang.String transactionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RefundPayloadResult(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.originalAmount = j;
        this.refundedAmount = j2;
        this.transactionId = str;
        this.cardType = str2;
        this.maskedPan = str3;
        this.referenceNumber = str4;
        this.entryMode = str5;
    }

    public final long getOriginalAmount() {
        return this.originalAmount;
    }

    public final long getRefundedAmount() {
        return this.refundedAmount;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    public final java.lang.String getCardType() {
        return this.cardType;
    }

    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    public final java.lang.String getReferenceNumber() {
        return this.referenceNumber;
    }

    public final java.lang.String getEntryMode() {
        return this.entryMode;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.originalAmount);
        parcel.writeLong(this.refundedAmount);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.cardType);
        parcel.writeString(this.maskedPan);
        parcel.writeString(this.referenceNumber);
        parcel.writeString(this.entryMode);
    }
}
