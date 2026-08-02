package androidx.versionedparcelable;

/* loaded from: classes7.dex */
class VersionedParcelParcel extends androidx.versionedparcelable.VersionedParcel {
    private final int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final android.os.Parcel getInputSizeshNQ4ISI;
    private final android.util.SparseIntArray getOutputFormats;

    VersionedParcelParcel(android.os.Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap());
    }

    private VersionedParcelParcel(android.os.Parcel parcel, int i, int i2, java.lang.String str, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.getOutputFormats = new android.util.SparseIntArray();
        this.getHighSpeedVideoSizes = -1;
        this.getHighSpeedVideoFpsRanges = -1;
        this.getInputSizeshNQ4ISI = parcel;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizesFor = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoFpsRangesFor) {
            int i2 = this.getHighSpeedVideoFpsRanges;
            if (i2 == i) {
                return true;
            }
            if (java.lang.String.valueOf(i2).compareTo(java.lang.String.valueOf(i)) > 0) {
                return false;
            }
            this.getInputSizeshNQ4ISI.setDataPosition(this.getHighResolutionOutputSizeshNQ4ISI);
            int readInt = this.getInputSizeshNQ4ISI.readInt();
            this.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.readInt();
            this.getHighResolutionOutputSizeshNQ4ISI += readInt;
        }
        return this.getHighSpeedVideoFpsRanges == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        this.getHighSpeedVideoSizes = i;
        this.getOutputFormats.put(i, this.getInputSizeshNQ4ISI.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i = this.getHighSpeedVideoSizes;
        if (i >= 0) {
            int i2 = this.getOutputFormats.get(i);
            int dataPosition = this.getInputSizeshNQ4ISI.dataPosition();
            this.getInputSizeshNQ4ISI.setDataPosition(i2);
            this.getInputSizeshNQ4ISI.writeInt(dataPosition - i2);
            this.getInputSizeshNQ4ISI.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected androidx.versionedparcelable.VersionedParcel createSubParcel() {
        android.os.Parcel parcel = this.getInputSizeshNQ4ISI;
        int dataPosition = parcel.dataPosition();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == this.Camera2StreamConfigurationMap) {
            i = this.getHighSpeedVideoFpsRangesFor;
        }
        int i2 = i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append("  ");
        return new androidx.versionedparcelable.VersionedParcelParcel(parcel, dataPosition, i2, sb.toString(), this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.getInputSizeshNQ4ISI.writeInt(bArr.length);
            this.getInputSizeshNQ4ISI.writeByteArray(bArr);
        } else {
            this.getInputSizeshNQ4ISI.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.getInputSizeshNQ4ISI.writeInt(bArr.length);
            this.getInputSizeshNQ4ISI.writeByteArray(bArr, i, i2);
        } else {
            this.getInputSizeshNQ4ISI.writeInt(-1);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        this.getInputSizeshNQ4ISI.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        this.getInputSizeshNQ4ISI.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        this.getInputSizeshNQ4ISI.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        this.getInputSizeshNQ4ISI.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(java.lang.String str) {
        this.getInputSizeshNQ4ISI.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(android.os.IBinder iBinder) {
        this.getInputSizeshNQ4ISI.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(android.os.Parcelable parcelable) {
        this.getInputSizeshNQ4ISI.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        this.getInputSizeshNQ4ISI.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(android.os.IInterface iInterface) {
        this.getInputSizeshNQ4ISI.writeStrongInterface(iInterface);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(android.os.Bundle bundle) {
        this.getInputSizeshNQ4ISI.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(java.lang.CharSequence charSequence) {
        android.text.TextUtils.writeToParcel(charSequence, this.getInputSizeshNQ4ISI, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected java.lang.CharSequence readCharSequence() {
        return (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.getInputSizeshNQ4ISI);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.getInputSizeshNQ4ISI.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.getInputSizeshNQ4ISI.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.getInputSizeshNQ4ISI.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.getInputSizeshNQ4ISI.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public java.lang.String readString() {
        return this.getInputSizeshNQ4ISI.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.IBinder readStrongBinder() {
        return this.getInputSizeshNQ4ISI.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int readInt = this.getInputSizeshNQ4ISI.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.getInputSizeshNQ4ISI.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends android.os.Parcelable> T readParcelable() {
        return (T) this.getInputSizeshNQ4ISI.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.Bundle readBundle() {
        return this.getInputSizeshNQ4ISI.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        return this.getInputSizeshNQ4ISI.readInt() != 0;
    }
}
