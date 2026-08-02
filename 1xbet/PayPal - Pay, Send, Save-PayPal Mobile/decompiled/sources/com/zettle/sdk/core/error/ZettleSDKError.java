package com.zettle.sdk.core.error;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKError;", "Landroid/os/Parcelable;", "Lcom/zettle/sdk/ui/ZettleResult$Failed;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;)V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "getReason", "()Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ZettleSDKError implements android.os.Parcelable, com.zettle.sdk.ui.ZettleResult.Failed {
    public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKError> CREATOR = new com.zettle.sdk.core.error.ZettleSDKError.Creator();
    private final com.zettle.sdk.core.error.ZettleSDKFailureReason reason;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ZettleSDKError(com.zettle.sdk.core.error.ZettleSDKFailureReason zettleSDKFailureReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleSDKFailureReason, "");
        this.reason = zettleSDKFailureReason;
    }

    @Override // com.zettle.sdk.ui.ZettleResult.Failed
    public final com.zettle.sdk.core.error.ZettleSDKFailureReason getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        com.zettle.sdk.core.error.ZettleSDKFailureReason reason = getReason();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ZettleSDKError[");
        sb.append(reason);
        sb.append("]");
        return sb.toString();
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.core.error.ZettleSDKError[] newArray(int i) {
            return new com.zettle.sdk.core.error.ZettleSDKError[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.core.error.ZettleSDKError createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.core.error.ZettleSDKError((com.zettle.sdk.core.error.ZettleSDKFailureReason) parcel.readParcelable(com.zettle.sdk.core.error.ZettleSDKError.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.reason, flags);
    }
}
