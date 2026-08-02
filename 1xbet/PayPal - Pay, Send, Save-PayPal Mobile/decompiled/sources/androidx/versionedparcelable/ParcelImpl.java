package androidx.versionedparcelable;

/* loaded from: classes7.dex */
public class ParcelImpl implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl> CREATOR = new android.os.Parcelable.Creator<androidx.versionedparcelable.ParcelImpl>() { // from class: androidx.versionedparcelable.ParcelImpl.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ androidx.versionedparcelable.ParcelImpl createFromParcel(android.os.Parcel parcel) {
            return new androidx.versionedparcelable.ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ androidx.versionedparcelable.ParcelImpl[] newArray(int i) {
            return new androidx.versionedparcelable.ParcelImpl[i];
        }
    };
    private final androidx.versionedparcelable.VersionedParcelable getHighSpeedVideoSizes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelImpl(androidx.versionedparcelable.VersionedParcelable versionedParcelable) {
        this.getHighSpeedVideoSizes = versionedParcelable;
    }

    protected ParcelImpl(android.os.Parcel parcel) {
        this.getHighSpeedVideoSizes = new androidx.versionedparcelable.VersionedParcelParcel(parcel).readVersionedParcelable();
    }

    public <T extends androidx.versionedparcelable.VersionedParcelable> T getVersionedParcel() {
        return (T) this.getHighSpeedVideoSizes;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        new androidx.versionedparcelable.VersionedParcelParcel(parcel).writeVersionedParcelable(this.getHighSpeedVideoSizes);
    }
}
