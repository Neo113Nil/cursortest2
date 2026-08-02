package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007"}, d2 = {"Lcom/zettle/sdk/ui/ZettleResult;", "Landroid/os/Parcelable;", "Cancelled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Failed", "Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "Lcom/zettle/sdk/ui/ZettleResult$Failed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ZettleResult extends android.os.Parcelable {

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003R\u0014\u0010\u0006\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/zettle/sdk/ui/ZettleResult$Completed;", "Landroid/os/Parcelable;", "T", "Lcom/zettle/sdk/ui/ZettleResult;", "getPayload", "()Landroid/os/Parcelable;", "payload"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public interface Completed<T extends android.os.Parcelable> extends com.zettle.sdk.ui.ZettleResult {
        T getPayload();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/ui/ZettleResult$Failed;", "Lcom/zettle/sdk/ui/ZettleResult;", "Lcom/zettle/sdk/ui/FailureReason;", "getReason", "()Lcom/zettle/sdk/ui/FailureReason;", "reason"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public interface Failed extends com.zettle.sdk.ui.ZettleResult {
        com.zettle.sdk.ui.FailureReason getReason();
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "Lcom/zettle/sdk/ui/ZettleResult;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public interface Cancelled extends com.zettle.sdk.ui.ZettleResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.zettle.sdk.ui.ZettleResult.Cancelled.Companion INSTANCE = com.zettle.sdk.ui.ZettleResult.Cancelled.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/ui/ZettleResult$Cancelled$Companion;", "Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion implements com.zettle.sdk.ui.ZettleResult.Cancelled {
            static final /* synthetic */ com.zettle.sdk.ui.ZettleResult.Cancelled.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.ui.ZettleResult.Cancelled.Companion();
            public static final android.os.Parcelable.Creator<com.zettle.sdk.ui.ZettleResult.Cancelled.Companion> CREATOR = new com.zettle.sdk.ui.ZettleResult.Cancelled.Companion.Creator();

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            private Companion() {
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.ui.ZettleResult.Cancelled.Companion> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.ui.ZettleResult.Cancelled.Companion[] newArray(int i) {
                    return new com.zettle.sdk.ui.ZettleResult.Cancelled.Companion[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.ui.ZettleResult.Cancelled.Companion createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return com.zettle.sdk.ui.ZettleResult.Cancelled.Companion.getHighResolutionOutputSizeshNQ4ISI;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }
        }
    }
}
