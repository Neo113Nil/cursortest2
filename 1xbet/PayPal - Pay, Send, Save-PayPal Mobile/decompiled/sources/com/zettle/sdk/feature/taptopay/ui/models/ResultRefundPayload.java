package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/ResultRefundPayload;", "Landroid/os/Parcelable;", "", "minAmountAllowed", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/ui/models/ResultRefundPayload;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMinAmountAllowed"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ResultRefundPayload implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload.Creator();
    private final java.lang.String minAmountAllowed;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ResultRefundPayload(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.minAmountAllowed = str;
    }

    public final java.lang.String getMinAmountAllowed() {
        return this.minAmountAllowed;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minAmountAllowed);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.minAmountAllowed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResultRefundPayload(minAmountAllowed=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.minAmountAllowed.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.minAmountAllowed, ((com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload) other).minAmountAllowed);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload[] newArray(int i) {
            return new com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload(parcel.readString());
        }
    }

    public final com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload copy(java.lang.String minAmountAllowed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minAmountAllowed, "");
        return new com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload(minAmountAllowed);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMinAmountAllowed() {
        return this.minAmountAllowed;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload copy$default(com.zettle.sdk.feature.taptopay.ui.models.ResultRefundPayload resultRefundPayload, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resultRefundPayload.minAmountAllowed;
        }
        return resultRefundPayload.copy(str);
    }
}
