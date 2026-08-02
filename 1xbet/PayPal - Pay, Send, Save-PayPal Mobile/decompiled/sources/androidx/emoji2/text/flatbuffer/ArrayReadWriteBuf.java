package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class ArrayReadWriteBuf implements androidx.emoji2.text.flatbuffer.ReadWriteBuf {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;

    public ArrayReadWriteBuf() {
        this(10);
    }

    public ArrayReadWriteBuf(int i) {
        this(new byte[i]);
    }

    public ArrayReadWriteBuf(byte[] bArr) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoSizes = 0;
    }

    public ArrayReadWriteBuf(byte[] bArr, int i) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighSpeedVideoSizes = i;
    }

    public boolean getBoolean(int i) {
        return this.Camera2StreamConfigurationMap[i] != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i) {
        return this.Camera2StreamConfigurationMap[i];
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        return (short) ((bArr[i] & 255) | (bArr[i + 1] << 8));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        return (bArr[i] & 255) | (bArr[i + 3] << com.google.common.base.Ascii.CAN) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((255 & bArr[i + 6]) << 48) | (bArr[i + 7] << 56);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i) {
        return java.lang.Float.intBitsToFloat(getInt(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i) {
        return java.lang.Double.longBitsToDouble(getLong(i));
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public java.lang.String getString(int i, int i2) {
        return androidx.emoji2.text.flatbuffer.Utf8Safe.decodeUtf8Array(this.Camera2StreamConfigurationMap, i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.Camera2StreamConfigurationMap;
    }

    public void putBoolean(boolean z) {
        setBoolean(this.getHighSpeedVideoSizes, z);
        this.getHighSpeedVideoSizes++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i, int i2) {
        set(this.getHighSpeedVideoSizes, bArr, i, i2);
        this.getHighSpeedVideoSizes += i2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b) {
        set(this.getHighSpeedVideoSizes, b);
        this.getHighSpeedVideoSizes++;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s) {
        setShort(this.getHighSpeedVideoSizes, s);
        this.getHighSpeedVideoSizes += 2;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i) {
        setInt(this.getHighSpeedVideoSizes, i);
        this.getHighSpeedVideoSizes += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j) {
        setLong(this.getHighSpeedVideoSizes, j);
        this.getHighSpeedVideoSizes += 8;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f) {
        setFloat(this.getHighSpeedVideoSizes, f);
        this.getHighSpeedVideoSizes += 4;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d) {
        setDouble(this.getHighSpeedVideoSizes, d);
        this.getHighSpeedVideoSizes += 8;
    }

    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.Camera2StreamConfigurationMap[i] = b;
    }

    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        java.lang.System.arraycopy(bArr, i2, this.Camera2StreamConfigurationMap, i, i3);
    }

    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        int i2 = (int) j;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (j >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[i] = (byte) (floatToRawIntBits & 255);
        bArr[i + 1] = (byte) ((floatToRawIntBits >> 8) & 255);
        bArr[i + 2] = (byte) ((floatToRawIntBits >> 16) & 255);
        bArr[i + 3] = (byte) ((floatToRawIntBits >> 24) & 255);
    }

    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        long doubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d);
        int i2 = (int) doubleToRawLongBits;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
        int i3 = (int) (doubleToRawLongBits >> 32);
        bArr[i + 4] = (byte) (i3 & 255);
        bArr[i + 5] = (byte) ((i3 >> 8) & 255);
        bArr[i + 6] = (byte) ((i3 >> 16) & 255);
        bArr[i + 7] = (byte) ((i3 >> 24) & 255);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean requestCapacity(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr.length > i) {
            return true;
        }
        int length = bArr.length;
        this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(bArr, length + (length >> 1));
        return true;
    }
}
