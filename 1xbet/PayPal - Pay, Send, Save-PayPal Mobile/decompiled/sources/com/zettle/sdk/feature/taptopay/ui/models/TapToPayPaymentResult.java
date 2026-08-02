package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Canceled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Failed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayPaymentResult implements android.os.Parcelable {
    public static final int $stable = 0;

    private TapToPayPaymentResult() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "Lcom/zettle/sdk/ui/ZettleResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;)V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Failed extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult implements com.zettle.sdk.ui.ZettleResult.Failed {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed.Creator();
        private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason reason;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason tapToPayFailureReason) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayFailureReason, "");
            this.reason = tapToPayFailureReason;
        }

        @Override // com.zettle.sdk.ui.ZettleResult.Failed
        public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason reason = getReason();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(");
            sb.append(reason);
            sb.append(")");
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed((com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason) parcel.readParcelable(com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.reason, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/ui/models/ResultPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Completed extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult implements com.zettle.sdk.ui.ZettleResult.Completed<com.zettle.sdk.feature.taptopay.ui.models.ResultPayload> {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed.Creator();
        private final com.zettle.sdk.feature.taptopay.ui.models.ResultPayload payload;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(com.zettle.sdk.feature.taptopay.ui.models.ResultPayload resultPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultPayload, "");
            this.payload = resultPayload;
        }

        @Override // com.zettle.sdk.ui.ZettleResult.Completed
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultPayload getPayload() {
            return this.payload;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Completed(com.zettle.sdk.feature.taptopay.ui.models.ResultPayload.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            this.payload.writeToParcel(parcel, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayPaymentResult;", "Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Canceled extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult implements com.zettle.sdk.ui.ZettleResult.Cancelled {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled INSTANCE = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Canceled() {
            super(null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Canceled.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ TapToPayPaymentResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
