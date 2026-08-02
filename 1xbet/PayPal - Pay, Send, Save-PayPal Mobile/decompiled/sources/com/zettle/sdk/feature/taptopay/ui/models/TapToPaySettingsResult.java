package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00072\u00020\u0001:\u0003\b\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult;", "Landroid/os/Parcelable;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Companion", "Canceled", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Completed;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPaySettingsResult implements android.os.Parcelable {
    public static final int $stable = 0;

    private TapToPaySettingsResult() {
    }

    public java.lang.String toString() {
        return "TapToPaySettingsResult";
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult;", "Lcom/zettle/sdk/ui/ZettleResult$Completed;", "Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;)V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/ui/models/ResultSettingsPayload;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Completed extends com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult implements com.zettle.sdk.ui.ZettleResult.Completed<com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload> {
        public static final int $stable = 8;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed.Creator();
        private final com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload payload;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Completed(com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload resultSettingsPayload) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultSettingsPayload, "");
            this.payload = resultSettingsPayload;
        }

        @Override // com.zettle.sdk.ui.ZettleResult.Completed
        public final com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload getPayload() {
            return this.payload;
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult
        public final java.lang.String toString() {
            java.lang.String tapToPaySettingsResult = super.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(tapToPaySettingsResult);
            sb.append("#Completed");
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Completed(com.zettle.sdk.feature.taptopay.ui.models.ResultSettingsPayload.CREATOR.createFromParcel(parcel));
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            this.payload.writeToParcel(parcel, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPaySettingsResult;", "Lcom/zettle/sdk/ui/ZettleResult$Cancelled;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Canceled extends com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult implements com.zettle.sdk.ui.ZettleResult.Cancelled {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled INSTANCE = new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Canceled() {
            super(null);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult
        public final java.lang.String toString() {
            java.lang.String tapToPaySettingsResult = super.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(tapToPaySettingsResult);
            sb.append("#Cancelled");
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.feature.taptopay.ui.models.TapToPaySettingsResult.Canceled.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ TapToPaySettingsResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
