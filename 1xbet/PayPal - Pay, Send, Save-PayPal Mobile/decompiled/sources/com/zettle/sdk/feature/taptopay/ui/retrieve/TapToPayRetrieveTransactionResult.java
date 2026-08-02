package com.zettle.sdk.feature.taptopay.ui.retrieve;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult;", "Landroid/os/Parcelable;", "Canceled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Failed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TapToPayRetrieveTransactionResult extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult;", "Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Canceled implements com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult, com.zettle.sdk.ui.ZettleResult.Cancelled {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled INSTANCE = new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Canceled() {
        }

        public final java.lang.String toString() {
            return "Canceled";
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Canceled.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult;", "Lcom/zettle/sdk/ui/ZettleResult$Failed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;)V", "component1", "()Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "copy", "(Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Failed;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/RetrieveTransactionFailureReason;", "getReason"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Failed implements com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult, com.zettle.sdk.ui.ZettleResult.Failed {
        public static final int $stable = 8;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed.Creator();
        private final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason reason;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Failed(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason retrieveTransactionFailureReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrieveTransactionFailureReason, "");
            this.reason = retrieveTransactionFailureReason;
        }

        @Override // com.zettle.sdk.ui.ZettleResult.Failed
        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason getReason() {
            return this.reason;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.reason, flags);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason reason = getReason();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(reason=");
            sb.append(reason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getReason().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(getReason(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed) other).getReason());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed((com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason) parcel.readParcelable(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed.class.getClassLoader()));
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed copy(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed(reason);
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason component1() {
            return getReason();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed failed, com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionFailureReason retrieveTransactionFailureReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                retrieveTransactionFailureReason = failed.getReason();
            }
            return failed.copy(retrieveTransactionFailureReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult;", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayTransactionPayload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayTransactionPayload;)V", "component1", "()Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayTransactionPayload;", "copy", "(Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayTransactionPayload;)Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayRetrieveTransactionResult$Completed;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/retrieve/TapToPayTransactionPayload;", "getPayload"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Completed implements com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult, com.zettle.sdk.ui.ZettleResult.Completed<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload> {
        public static final int $stable = 8;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed.Creator();
        private final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload payload;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public Completed(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload tapToPayTransactionPayload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayTransactionPayload, "");
            this.payload = tapToPayTransactionPayload;
        }

        @Override // com.zettle.sdk.ui.ZettleResult.Completed
        public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload getPayload() {
            return this.payload;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            this.payload.writeToParcel(parcel, flags);
        }

        public final java.lang.String toString() {
            com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload payload = getPayload();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(payload=");
            sb.append(payload);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return getPayload().hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(getPayload(), ((com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed) other).getPayload());
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload.CREATOR.createFromParcel(parcel));
            }
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed copy(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload payload) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "");
            return new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed(payload);
        }

        public final com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload component1() {
            return getPayload();
        }

        public static /* synthetic */ com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed copy$default(com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed completed, com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayTransactionPayload tapToPayTransactionPayload, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tapToPayTransactionPayload = completed.getPayload();
            }
            return completed.copy(tapToPayTransactionPayload);
        }
    }
}
