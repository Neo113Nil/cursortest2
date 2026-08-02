package androidx.media3.common;

/* loaded from: classes7.dex */
public final class StreamKey implements java.lang.Comparable<androidx.media3.common.StreamKey>, android.os.Parcelable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final android.os.Parcelable.Creator<androidx.media3.common.StreamKey> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.StreamKey>() { // from class: androidx.media3.common.StreamKey.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.media3.common.StreamKey createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.media3.common.StreamKey[] newArray(int i) {
            return new androidx.media3.common.StreamKey[i];
        }
    };
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String Camera2StreamConfigurationMap = androidx.media3.common.util.Util.intToStringMaxRadix(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    public StreamKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.streamIndex = i3;
    }

    StreamKey(android.os.Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.periodIndex);
        sb.append(".");
        sb.append(this.groupIndex);
        sb.append(".");
        sb.append(this.streamIndex);
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.StreamKey streamKey = (androidx.media3.common.StreamKey) obj;
        return this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex;
    }

    public final int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    @Override // java.lang.Comparable
    public final int compareTo(androidx.media3.common.StreamKey streamKey) {
        int i = this.periodIndex - streamKey.periodIndex;
        if (i != 0) {
            return i;
        }
        int i2 = this.groupIndex - streamKey.groupIndex;
        return i2 == 0 ? this.streamIndex - streamKey.streamIndex : i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public final android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        int i = this.periodIndex;
        if (i != 0) {
            bundle.putInt(getHighSpeedVideoFpsRanges, i);
        }
        int i2 = this.groupIndex;
        if (i2 != 0) {
            bundle.putInt(getHighResolutionOutputSizeshNQ4ISI, i2);
        }
        int i3 = this.streamIndex;
        if (i3 != 0) {
            bundle.putInt(Camera2StreamConfigurationMap, i3);
        }
        return bundle;
    }

    public static androidx.media3.common.StreamKey fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.StreamKey(bundle.getInt(getHighSpeedVideoFpsRanges, 0), bundle.getInt(getHighResolutionOutputSizeshNQ4ISI, 0), bundle.getInt(Camera2StreamConfigurationMap, 0));
    }
}
