package com.zettle.sdk.feature.taptopay.core.refunds.models;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BI\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\"\u0010\u001a"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "originalAmount", "refundedAmount", "", "transactionId", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "maskedPan", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_REFERENCE_NUMBER, com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCardPaymentEntryMode", "()Ljava/lang/String;", "getCardType", "getMaskedPan", "J", "getOriginalAmount", "()J", "getReferenceNumber", "getRefundedAmount", "getTransactionId", "CREATOR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RefundPayload implements android.os.Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload.Companion(null);
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardType;
    private final java.lang.String maskedPan;
    private final long originalAmount;
    private final java.lang.String referenceNumber;
    private final long refundedAmount;
    private final java.lang.String transactionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RefundPayload(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.originalAmount = j;
        this.refundedAmount = j2;
        this.transactionId = str;
        this.cardType = str2;
        this.maskedPan = str3;
        this.referenceNumber = str4;
        this.cardPaymentEntryMode = str5;
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

    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RefundPayload(android.os.Parcel parcel) {
        this(r2, r4, r6, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Broken parcel");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeLong(this.originalAmount);
        dest.writeLong(this.refundedAmount);
        dest.writeString(this.transactionId);
        dest.writeString(this.cardType);
        dest.writeString(this.maskedPan);
        dest.writeString(this.referenceNumber);
        dest.writeString(this.cardPaymentEntryMode);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/zettle/sdk/feature/taptopay/core/refunds/models/RefundPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload[] newArray(int size) {
            return new com.zettle.sdk.feature.taptopay.core.refunds.models.RefundPayload[size];
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
