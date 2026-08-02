package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason;", "Landroid/os/Parcelable;", "Lcom/zettle/sdk/ui/FailureReason;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "FailedDoRefund", "FailedRetrieveRefund", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayRefundFailureReason implements android.os.Parcelable, com.zettle.sdk.ui.FailureReason {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    private TapToPayRefundFailureReason(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.zettle.sdk.ui.FailureReason
    public java.lang.String getId() {
        return com.zettle.sdk.ui.FailureReason.DefaultImpls.getId(this);
    }

    /* renamed from: toString, reason: from getter */
    public java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FailedRetrieveRefund extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public FailedRetrieveRefund() {
            super("FailedToRetrieveRefund", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FailedDoRefund extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund.Creator();
        private final java.lang.String reason;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedDoRefund(java.lang.String str) {
            super("FailedToDoRefund:".concat(java.lang.String.valueOf(str)), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.reason);
        }
    }

    public /* synthetic */ TapToPayRefundFailureReason(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
