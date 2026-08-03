package androidx.media3.container;

/* loaded from: classes2.dex */
public final class Mp4OrientationData implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.container.Mp4OrientationData> CREATOR = new android.os.Parcelable.Creator<androidx.media3.container.Mp4OrientationData>() { // from class: androidx.media3.container.Mp4OrientationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4OrientationData createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.container.Mp4OrientationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.Mp4OrientationData[] newArray(int i) {
            return new androidx.media3.container.Mp4OrientationData[i];
        }
    };
    public final int orientation;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ androidx.media3.common.Format getWrappedMetadataFormat() {
        return androidx.media3.common.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        androidx.media3.common.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public Mp4OrientationData(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i == 0 || i == 90 || i == 180 || i == 270, "Unsupported orientation");
        this.orientation = i;
    }

    private Mp4OrientationData(android.os.Parcel parcel) {
        this.orientation = parcel.readInt();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.media3.container.Mp4OrientationData) && this.orientation == ((androidx.media3.container.Mp4OrientationData) obj).orientation;
    }

    public int hashCode() {
        return com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.orientation;
    }

    public java.lang.String toString() {
        return "Orientation= " + this.orientation;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.orientation);
    }
}
