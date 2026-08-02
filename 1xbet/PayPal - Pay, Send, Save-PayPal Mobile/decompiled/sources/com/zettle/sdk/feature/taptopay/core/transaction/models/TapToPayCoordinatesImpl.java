package com.zettle.sdk.feature.taptopay.core.transaction.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinates;", "Landroid/os/Parcel;", "parcel", "<init>", "(Landroid/os/Parcel;)V", "", "latitude", "longitude", "(DD)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLatitude", "()D", "getLongitude", "CREATOR"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayCoordinatesImpl implements com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl.Companion(null);
    private final double latitude;
    private final double longitude;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public TapToPayCoordinatesImpl(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates
    public final double getLatitude() {
        return this.latitude;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinates
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TapToPayCoordinatesImpl(android.os.Parcel parcel) {
        this(r2, r5.doubleValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        java.lang.Double access$readOptDouble = com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesKt.access$readOptDouble(parcel);
        if (access$readOptDouble == null) {
            throw new java.lang.IllegalStateException("Broken parcel");
        }
        double doubleValue = access$readOptDouble.doubleValue();
        java.lang.Double access$readOptDouble2 = com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesKt.access$readOptDouble(parcel);
        if (access$readOptDouble2 != null) {
            return;
        }
        throw new java.lang.IllegalStateException("Broken parcel");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeDouble(getLatitude());
        dest.writeDouble(getLongitude());
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesImpl$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesImpl;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesImpl;", "", io.ktor.http.ContentDisposition.Parameters.Size, "", "newArray", "(I)[Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayCoordinatesImpl;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl$CREATOR, reason: from kotlin metadata */
    public static final class Companion implements android.os.Parcelable.Creator<com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl[] newArray(int size) {
            return new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayCoordinatesImpl[size];
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
