package com.zettle.sdk.core.error;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u00012\u00020\u0002:\b\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "Landroid/os/Parcelable;", "Lcom/zettle/sdk/ui/FailureReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ActionInvalid", "ActionNotFound", "FeatureNotFound", "HeadlessNotImplemented", "NotAuthorized", "ProcessKilled", "RequirementsNotFulfilled", "SDKNotInitialized", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ActionInvalid;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ActionNotFound;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$FeatureNotFound;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$HeadlessNotImplemented;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$NotAuthorized;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ProcessKilled;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$RequirementsNotFulfilled;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$SDKNotInitialized;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ZettleSDKFailureReason implements android.os.Parcelable, com.zettle.sdk.ui.FailureReason {
    private ZettleSDKFailureReason() {
    }

    @Override // com.zettle.sdk.ui.FailureReason
    public java.lang.String getId() {
        return com.zettle.sdk.ui.FailureReason.DefaultImpls.getId(this);
    }

    public java.lang.String toString() {
        return "ZettleSDKFailureReason";
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$SDKNotInitialized;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SDKNotInitialized extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized INSTANCE = new com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private SDKNotInitialized() {
            super(null);
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return com.paypal.android.threeds.utils.ConstantUtil.SDK_NOT_INITIALIZED;
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.core.error.ZettleSDKFailureReason.SDKNotInitialized.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$FeatureNotFound;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "", "featureId", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FeatureNotFound extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound.Creator();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final java.lang.String Camera2StreamConfigurationMap;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureNotFound(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.Camera2StreamConfigurationMap = str;
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return "No feature found for id: ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap));
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.FeatureNotFound(parcel.readString());
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$RequirementsNotFulfilled;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "Lcom/zettle/sdk/features/Action;", "action", "<init>", "(Lcom/zettle/sdk/features/Action;)V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/features/Action;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequirementsNotFulfilled extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled.Creator();
        private final com.zettle.sdk.features.Action getHighSpeedVideoFpsRangesFor;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequirementsNotFulfilled(com.zettle.sdk.features.Action action) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            this.getHighSpeedVideoFpsRangesFor = action;
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            com.zettle.sdk.features.Action action = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requirements for action ");
            sb.append(action);
            sb.append(" is not fulfilled");
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled((com.zettle.sdk.features.Action) parcel.readParcelable(com.zettle.sdk.core.error.ZettleSDKFailureReason.RequirementsNotFulfilled.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.getHighSpeedVideoFpsRangesFor, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$HeadlessNotImplemented;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "Lcom/zettle/sdk/features/Action;", "action", "<init>", "(Lcom/zettle/sdk/features/Action;)V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/features/Action;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HeadlessNotImplemented extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented.Creator();

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final com.zettle.sdk.features.Action getHighSpeedVideoFpsRangesFor;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeadlessNotImplemented(com.zettle.sdk.features.Action action) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            this.getHighSpeedVideoFpsRangesFor = action;
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            com.zettle.sdk.features.Action action = this.getHighSpeedVideoFpsRangesFor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Headless version for action ");
            sb.append(action);
            sb.append(" is not implemented");
            return sb.toString();
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented((com.zettle.sdk.features.Action) parcel.readParcelable(com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented.class.getClassLoader()));
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.getHighSpeedVideoFpsRangesFor, flags);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ProcessKilled;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ProcessKilled extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled INSTANCE = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private ProcessKilled() {
            super(null);
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return "The SDK is relaunched by OS because of a process kill.";
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.core.error.ZettleSDKFailureReason.ProcessKilled.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ActionNotFound;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActionNotFound extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound INSTANCE = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private ActionNotFound() {
            super(null);
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return "Action is not found";
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionNotFound.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$ActionInvalid;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ActionInvalid extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid INSTANCE = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private ActionInvalid() {
            super(null);
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return "Action is invalid";
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.core.error.ZettleSDKFailureReason.ActionInvalid.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/core/error/ZettleSDKFailureReason$NotAuthorized;", "Lcom/zettle/sdk/core/error/ZettleSDKFailureReason;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotAuthorized extends com.zettle.sdk.core.error.ZettleSDKFailureReason {
        public static final com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized INSTANCE = new com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized> CREATOR = new com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private NotAuthorized() {
            super(null);
        }

        @Override // com.zettle.sdk.core.error.ZettleSDKFailureReason
        public final java.lang.String toString() {
            return "Not Authorized";
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized[] newArray(int i) {
                return new com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.core.error.ZettleSDKFailureReason.NotAuthorized.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ZettleSDKFailureReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
