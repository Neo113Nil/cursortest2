package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPayment;", "Landroid/os/Parcelable;", "", "amount", "", "transactionId", "<init>", "(JLjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPayment;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getAmount", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TapToPayPayment implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment.Creator();
    private final long amount;
    private final java.lang.String transactionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TapToPayPayment(long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = j;
        this.transactionId = str;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.amount);
        parcel.writeString(this.transactionId);
    }

    public final java.lang.String toString() {
        long j = this.amount;
        java.lang.String str = this.transactionId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TapToPayPayment(amount=");
        sb.append(j);
        sb.append(", transactionId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.amount) * 31) + this.transactionId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment tapToPayPayment = (com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment) other;
        return this.amount == tapToPayPayment.amount && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, tapToPayPayment.transactionId);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment(parcel.readLong(), parcel.readString());
        }
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment copy(long amount, java.lang.String transactionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment(amount, transactionId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment copy$default(com.zettle.sdk.feature.taptopay.ui.models.TapToPayPayment tapToPayPayment, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = tapToPayPayment.amount;
        }
        if ((i & 2) != 0) {
            str = tapToPayPayment.transactionId;
        }
        return tapToPayPayment.copy(j, str);
    }
}
