package androidx.versionedparcelable;

/* loaded from: classes7.dex */
class VersionedParcelStream extends androidx.versionedparcelable.VersionedParcel {
    private static final java.nio.charset.Charset getHighSpeedVideoFpsRangesFor = java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16);
    int Camera2StreamConfigurationMap;
    private java.io.DataInputStream getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private java.io.DataOutputStream getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final java.io.DataInputStream getInputFormats;
    private final java.io.DataOutputStream getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private androidx.versionedparcelable.VersionedParcelStream.FieldBuffer getOutputMinFrameDuration;

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected java.lang.CharSequence readCharSequence() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends android.os.Parcelable> T readParcelable() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.IBinder readStrongBinder() {
        return null;
    }

    public VersionedParcelStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap(), new androidx.collection.ArrayMap());
    }

    private VersionedParcelStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap, androidx.collection.ArrayMap<java.lang.String, java.lang.reflect.Method> arrayMap2, androidx.collection.ArrayMap<java.lang.String, java.lang.Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighSpeedVideoSizesFor = -1;
        this.Camera2StreamConfigurationMap = -1;
        java.io.DataInputStream dataInputStream = inputStream != null ? new java.io.DataInputStream(new java.io.FilterInputStream(inputStream) { // from class: androidx.versionedparcelable.VersionedParcelStream.1
            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws java.io.IOException {
                if (androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap != -1 && androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges >= androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap) {
                    throw new java.io.IOException();
                }
                int read = super.read();
                androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges++;
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                if (androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap != -1 && androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges >= androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap) {
                    throw new java.io.IOException();
                }
                int read = super.read(bArr, i, i2);
                if (read > 0) {
                    androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges += read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) throws java.io.IOException {
                if (androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap != -1 && androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges >= androidx.versionedparcelable.VersionedParcelStream.this.Camera2StreamConfigurationMap) {
                    throw new java.io.IOException();
                }
                long skip = super.skip(j);
                if (skip > 0) {
                    androidx.versionedparcelable.VersionedParcelStream.this.getHighSpeedVideoFpsRanges += (int) skip;
                }
                return skip;
            }
        }) : null;
        this.getInputFormats = dataInputStream;
        java.io.DataOutputStream dataOutputStream = outputStream != null ? new java.io.DataOutputStream(outputStream) : null;
        this.getInputSizeshNQ4ISI = dataOutputStream;
        this.getHighResolutionOutputSizeshNQ4ISI = dataInputStream;
        this.getHighSpeedVideoSizes = dataOutputStream;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean z, boolean z2) {
        if (!z) {
            throw new java.lang.RuntimeException("Serialization of this object is not allowed");
        }
        this.getOutputFormats = z2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        androidx.versionedparcelable.VersionedParcelStream.FieldBuffer fieldBuffer = this.getOutputMinFrameDuration;
        if (fieldBuffer != null) {
            try {
                if (fieldBuffer.getHighSpeedVideoFpsRangesFor.size() != 0) {
                    androidx.versionedparcelable.VersionedParcelStream.FieldBuffer fieldBuffer2 = this.getOutputMinFrameDuration;
                    fieldBuffer2.getHighResolutionOutputSizeshNQ4ISI.flush();
                    int size = fieldBuffer2.getHighSpeedVideoFpsRangesFor.size();
                    fieldBuffer2.Camera2StreamConfigurationMap.writeInt((fieldBuffer2.getHighSpeedVideoFpsRanges << 16) | (size >= 65535 ? 65535 : size));
                    if (size >= 65535) {
                        fieldBuffer2.Camera2StreamConfigurationMap.writeInt(size);
                    }
                    fieldBuffer2.getHighSpeedVideoFpsRangesFor.writeTo(fieldBuffer2.Camera2StreamConfigurationMap);
                }
                this.getOutputMinFrameDuration = null;
            } catch (java.io.IOException e) {
                throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected androidx.versionedparcelable.VersionedParcel createSubParcel() {
        return new androidx.versionedparcelable.VersionedParcelStream(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (true) {
            try {
                int i2 = this.getHighSpeedVideoSizesFor;
                if (i2 == i) {
                    return true;
                }
                if (java.lang.String.valueOf(i2).compareTo(java.lang.String.valueOf(i)) > 0) {
                    return false;
                }
                if (this.getHighSpeedVideoFpsRanges < this.Camera2StreamConfigurationMap) {
                    this.getInputFormats.skip(r2 - r1);
                }
                this.Camera2StreamConfigurationMap = -1;
                int readInt = this.getInputFormats.readInt();
                this.getHighSpeedVideoFpsRanges = 0;
                int i3 = readInt & 65535;
                if (i3 == 65535) {
                    i3 = this.getInputFormats.readInt();
                }
                this.getHighSpeedVideoSizesFor = (readInt >> 16) & 65535;
                this.Camera2StreamConfigurationMap = i3;
            } catch (java.io.IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        androidx.versionedparcelable.VersionedParcelStream.FieldBuffer fieldBuffer = new androidx.versionedparcelable.VersionedParcelStream.FieldBuffer(i, this.getInputSizeshNQ4ISI);
        this.getOutputMinFrameDuration = fieldBuffer;
        this.getHighSpeedVideoSizes = fieldBuffer.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr != null) {
                this.getHighSpeedVideoSizes.writeInt(bArr.length);
                this.getHighSpeedVideoSizes.write(bArr);
            } else {
                this.getHighSpeedVideoSizes.writeInt(-1);
            }
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.getHighSpeedVideoSizes.writeInt(i2);
                this.getHighSpeedVideoSizes.write(bArr, i, i2);
            } else {
                this.getHighSpeedVideoSizes.writeInt(-1);
            }
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void writeCharSequence(java.lang.CharSequence charSequence) {
        if (!this.getOutputFormats) {
            throw new java.lang.RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        try {
            this.getHighSpeedVideoSizes.writeInt(i);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        try {
            this.getHighSpeedVideoSizes.writeLong(j);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        try {
            this.getHighSpeedVideoSizes.writeFloat(f);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        try {
            this.getHighSpeedVideoSizes.writeDouble(d);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(java.lang.String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizes.writeInt(bytes.length);
                this.getHighSpeedVideoSizes.write(bytes);
                return;
            }
            this.getHighSpeedVideoSizes.writeInt(-1);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        try {
            this.getHighSpeedVideoSizes.writeBoolean(z);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(android.os.IBinder iBinder) {
        if (!this.getOutputFormats) {
            throw new java.lang.RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(android.os.Parcelable parcelable) {
        if (!this.getOutputFormats) {
            throw new java.lang.RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(android.os.IInterface iInterface) {
        if (!this.getOutputFormats) {
            throw new java.lang.RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.readInt();
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.readLong();
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.readFloat();
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.readDouble();
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public java.lang.String readString() {
        try {
            int readInt = this.getHighResolutionOutputSizeshNQ4ISI.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.getHighResolutionOutputSizeshNQ4ISI.readFully(bArr);
            return new java.lang.String(bArr, getHighSpeedVideoFpsRangesFor);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        try {
            int readInt = this.getHighResolutionOutputSizeshNQ4ISI.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.getHighResolutionOutputSizeshNQ4ISI.readFully(bArr);
            return bArr;
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.readBoolean();
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(android.os.Bundle bundle) {
        try {
            if (bundle != null) {
                java.util.Set<java.lang.String> keySet = bundle.keySet();
                this.getHighSpeedVideoSizes.writeInt(keySet.size());
                for (java.lang.String str : keySet) {
                    writeString(str);
                    java.lang.Object obj = bundle.get(str);
                    if (obj == null) {
                        writeInt(0);
                    } else if (obj instanceof android.os.Bundle) {
                        writeInt(1);
                        writeBundle((android.os.Bundle) obj);
                    } else if (obj instanceof java.lang.String) {
                        writeInt(3);
                        writeString((java.lang.String) obj);
                    } else if (obj instanceof java.lang.String[]) {
                        writeInt(4);
                        writeArray((java.lang.String[]) obj);
                    } else if (obj instanceof java.lang.Boolean) {
                        writeInt(5);
                        writeBoolean(((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof boolean[]) {
                        writeInt(6);
                        writeBooleanArray((boolean[]) obj);
                    } else if (obj instanceof java.lang.Double) {
                        writeInt(7);
                        writeDouble(((java.lang.Double) obj).doubleValue());
                    } else if (obj instanceof double[]) {
                        writeInt(8);
                        writeDoubleArray((double[]) obj);
                    } else if (obj instanceof java.lang.Integer) {
                        writeInt(9);
                        writeInt(((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof int[]) {
                        writeInt(10);
                        writeIntArray((int[]) obj);
                    } else if (obj instanceof java.lang.Long) {
                        writeInt(11);
                        writeLong(((java.lang.Long) obj).longValue());
                    } else if (obj instanceof long[]) {
                        writeInt(12);
                        writeLongArray((long[]) obj);
                    } else if (obj instanceof java.lang.Float) {
                        writeInt(13);
                        writeFloat(((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof float[]) {
                        writeInt(14);
                        writeFloatArray((float[]) obj);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported type ");
                        sb.append(obj.getClass());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                return;
            }
            this.getHighSpeedVideoSizes.writeInt(-1);
        } catch (java.io.IOException e) {
            throw new androidx.versionedparcelable.VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public android.os.Bundle readBundle() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        for (int i = 0; i < readInt; i++) {
            java.lang.String readString = readString();
            int readInt2 = readInt();
            switch (readInt2) {
                case 0:
                    bundle.putParcelable(readString, null);
                    break;
                case 1:
                    bundle.putBundle(readString, readBundle());
                    break;
                case 2:
                    bundle.putBundle(readString, readBundle());
                    break;
                case 3:
                    bundle.putString(readString, readString());
                    break;
                case 4:
                    bundle.putStringArray(readString, (java.lang.String[]) readArray(new java.lang.String[0]));
                    break;
                case 5:
                    bundle.putBoolean(readString, readBoolean());
                    break;
                case 6:
                    bundle.putBooleanArray(readString, readBooleanArray());
                    break;
                case 7:
                    bundle.putDouble(readString, readDouble());
                    break;
                case 8:
                    bundle.putDoubleArray(readString, readDoubleArray());
                    break;
                case 9:
                    bundle.putInt(readString, readInt());
                    break;
                case 10:
                    bundle.putIntArray(readString, readIntArray());
                    break;
                case 11:
                    bundle.putLong(readString, readLong());
                    break;
                case 12:
                    bundle.putLongArray(readString, readLongArray());
                    break;
                case 13:
                    bundle.putFloat(readString, readFloat());
                    break;
                case 14:
                    bundle.putFloatArray(readString, readFloatArray());
                    break;
                default:
                    throw new java.lang.RuntimeException("Unknown type ".concat(java.lang.String.valueOf(readInt2)));
            }
        }
        return bundle;
    }

    static class FieldBuffer {
        final java.io.DataOutputStream Camera2StreamConfigurationMap;
        final java.io.DataOutputStream getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final java.io.ByteArrayOutputStream getHighSpeedVideoFpsRangesFor;

        FieldBuffer(int i, java.io.DataOutputStream dataOutputStream) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            this.getHighSpeedVideoFpsRangesFor = byteArrayOutputStream;
            this.getHighResolutionOutputSizeshNQ4ISI = new java.io.DataOutputStream(byteArrayOutputStream);
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = dataOutputStream;
        }
    }
}
