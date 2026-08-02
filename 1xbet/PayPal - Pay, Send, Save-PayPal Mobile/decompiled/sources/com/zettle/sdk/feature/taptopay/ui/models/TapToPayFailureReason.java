package com.zettle.sdk.feature.taptopay.ui.models;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0011\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0001\u0011\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "Landroid/os/Parcelable;", "Lcom/zettle/sdk/ui/FailureReason;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "AboveMaximum", "AttestationError", "BelowMinimum", "CanceledByNetworkTimeout", "CanceledByTimeout", "CanceledByUser", "GratuityAmountTooHigh", "GratuityAmountTooLow", "IllegalArguments", "NetworkError", "NotAuthorized", "PaymentDeclined", "PinEntranceCanceled", "RunningOnMultiWindow", "RunningOnSeparateDisplay", "SignatureCanceled", "TechnicalError", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$BelowMinimum;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByNetworkTimeout;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByTimeout;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByUser;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$GratuityAmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$GratuityAmountTooLow;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$IllegalArguments;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$PaymentDeclined;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$PinEntranceCanceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$RunningOnMultiWindow;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$RunningOnSeparateDisplay;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$SignatureCanceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$TechnicalError;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayFailureReason implements android.os.Parcelable, com.zettle.sdk.ui.FailureReason {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    private TapToPayFailureReason(java.lang.String str) {
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

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByUser;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByUser extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CanceledByUser() {
            super("CanceledByUser", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByUser();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByTimeout;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByTimeout extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CanceledByTimeout() {
            super("CanceledByTimeout", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByTimeout();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$CanceledByNetworkTimeout;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CanceledByNetworkTimeout extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public CanceledByNetworkTimeout() {
            super("CanceledByNetworkTimeout", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.CanceledByNetworkTimeout();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$SignatureCanceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SignatureCanceled extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SignatureCanceled() {
            super("SignatureCanceled", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.SignatureCanceled();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$PinEntranceCanceled;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PinEntranceCanceled extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public PinEntranceCanceled() {
            super("PinEntranceCanceled", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PinEntranceCanceled();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$PaymentDeclined;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "", "reason", "transactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaymentDeclined extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined.Creator();
        private final java.lang.String reason;
        private final java.lang.String transactionId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ PaymentDeclined(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PaymentDeclined(java.lang.String str, java.lang.String str2) {
            super(r0.toString(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("]");
            this.reason = str;
            this.transactionId = str2;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.PaymentDeclined(parcel.readString(), parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.reason);
            parcel.writeString(this.transactionId);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$TechnicalError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TechnicalError extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError.Creator();
        private final java.lang.String reason;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TechnicalError(java.lang.String str) {
            super(r0.toString(), null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TechnicalError[");
            sb.append(str);
            sb.append("]");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.TechnicalError(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.reason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$RunningOnSeparateDisplay;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RunningOnSeparateDisplay extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public RunningOnSeparateDisplay() {
            super("RunningOnSeparateDisplay", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnSeparateDisplay();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$RunningOnMultiWindow;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RunningOnMultiWindow extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public RunningOnMultiWindow() {
            super("RunningOnMultiWindow", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.RunningOnMultiWindow();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$IllegalArguments;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IllegalArguments extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public IllegalArguments() {
            super("IllegalArguments", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.IllegalArguments();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$NotAuthorized;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotAuthorized extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NotAuthorized() {
            super("NotAuthorized", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NotAuthorized();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AboveMaximum extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public AboveMaximum() {
            super("AboveMaximum", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$BelowMinimum;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BelowMinimum extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public BelowMinimum() {
            super("BelowMinimum", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.BelowMinimum();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$NetworkError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public NetworkError() {
            super("NetworkError", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.NetworkError();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "DeveloperOptionsDetected", "Other", "TimeMismatchDetected", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$Other;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$TimeMismatchDetected;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AttestationError extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        private AttestationError(java.lang.String str) {
            super("", null);
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "recoverableAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "getRecoverableAction", "()Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DeveloperOptionsDetected extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError {
            public static final int $stable = 0;
            public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected.Creator();
            private final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeveloperOptionsDetected(com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction) {
                super("DeveloperOptionsDetected", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoverableAction, "");
                this.recoverableAction = recoverableAction;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction getRecoverableAction() {
                return this.recoverableAction;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected[] newArray(int i) {
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.DeveloperOptionsDetected(com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction.CREATOR.createFromParcel(parcel));
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                this.recoverableAction.writeToParcel(parcel, flags);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$TimeMismatchDetected;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError;", "Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "recoverableAction", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;", "getRecoverableAction", "()Lcom/zettle/sdk/feature/taptopay/ui/models/RecoverableAction;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class TimeMismatchDetected extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError {
            public static final int $stable = 0;
            public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected.Creator();
            private final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TimeMismatchDetected(com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction recoverableAction) {
                super("TimeMismatchDetected", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recoverableAction, "");
                this.recoverableAction = recoverableAction;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction getRecoverableAction() {
                return this.recoverableAction;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected[] newArray(int i) {
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.TimeMismatchDetected(com.zettle.sdk.feature.taptopay.ui.models.RecoverableAction.CREATOR.createFromParcel(parcel));
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                this.recoverableAction.writeToParcel(parcel, flags);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError$Other;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AttestationError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Other extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError {
            public static final int $stable = 0;
            public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other.Creator();
            private final java.lang.String description;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Other(java.lang.String str) {
                super(str, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.description = str;
            }

            public final java.lang.String getDescription() {
                return this.description;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other[] newArray(int i) {
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other[i];
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other createFromParcel(android.os.Parcel parcel) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                    return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AttestationError.Other(parcel.readString());
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(android.os.Parcel parcel, int flags) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.description);
            }
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason
        /* renamed from: toString, reason: from getter */
        public java.lang.String getCamera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ AttestationError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$GratuityAmountTooLow;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GratuityAmountTooLow extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public GratuityAmountTooLow() {
            super("GratuityAmountTooLow", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooLow();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$GratuityAmountTooHigh;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GratuityAmountTooHigh extends com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh> CREATOR = new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public GratuityAmountTooHigh() {
            super("GratuityAmountTooHigh", null);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh[] newArray(int i) {
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.GratuityAmountTooHigh();
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ TapToPayFailureReason(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
