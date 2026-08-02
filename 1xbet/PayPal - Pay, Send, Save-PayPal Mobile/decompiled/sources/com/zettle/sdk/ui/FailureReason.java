package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/ui/FailureReason;", "Landroid/os/Parcelable;", "", "getId", "()Ljava/lang/String;", "id", "Unknown"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FailureReason extends android.os.Parcelable {
    java.lang.String getId();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.lang.String getId(com.zettle.sdk.ui.FailureReason failureReason) {
            return "Not implemented";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/zettle/sdk/ui/FailureReason$Unknown;", "Lcom/zettle/sdk/ui/FailureReason;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Unknown implements com.zettle.sdk.ui.FailureReason {
        public static final com.zettle.sdk.ui.FailureReason.Unknown INSTANCE = new com.zettle.sdk.ui.FailureReason.Unknown();
        public static final android.os.Parcelable.Creator<com.zettle.sdk.ui.FailureReason.Unknown> CREATOR = new com.zettle.sdk.ui.FailureReason.Unknown.Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        private Unknown() {
        }

        @Override // com.zettle.sdk.ui.FailureReason
        public final java.lang.String getId() {
            return com.zettle.sdk.ui.FailureReason.DefaultImpls.getId(this);
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.zettle.sdk.ui.FailureReason.Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.ui.FailureReason.Unknown[] newArray(int i) {
                return new com.zettle.sdk.ui.FailureReason.Unknown[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.zettle.sdk.ui.FailureReason.Unknown createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return com.zettle.sdk.ui.FailureReason.Unknown.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
    }
}
