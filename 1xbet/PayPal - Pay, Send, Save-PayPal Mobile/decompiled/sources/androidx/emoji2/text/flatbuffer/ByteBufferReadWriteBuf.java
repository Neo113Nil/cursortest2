package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public class ByteBufferReadWriteBuf implements androidx.emoji2.text.flatbuffer.ReadWriteBuf {
    private final java.nio.ByteBuffer Camera2StreamConfigurationMap;

    public ByteBufferReadWriteBuf(java.nio.ByteBuffer byteBuffer) {
        this.Camera2StreamConfigurationMap = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    public boolean getBoolean(int i) {
        return get(i) != 0;
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte get(int i) {
        return this.Camera2StreamConfigurationMap.get(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public short getShort(int i) {
        return this.Camera2StreamConfigurationMap.getShort(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int getInt(int i) {
        return this.Camera2StreamConfigurationMap.getInt(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public long getLong(int i) {
        return this.Camera2StreamConfigurationMap.getLong(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public float getFloat(int i) {
        return this.Camera2StreamConfigurationMap.getFloat(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public double getDouble(int i) {
        return this.Camera2StreamConfigurationMap.getDouble(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public java.lang.String getString(int i, int i2) {
        return androidx.emoji2.text.flatbuffer.Utf8Safe.decodeUtf8Buffer(this.Camera2StreamConfigurationMap, i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public byte[] data() {
        return this.Camera2StreamConfigurationMap.array();
    }

    public void putBoolean(boolean z) {
        this.Camera2StreamConfigurationMap.put(z ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.put(bArr, i, i2);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void put(byte b) {
        this.Camera2StreamConfigurationMap.put(b);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putShort(short s) {
        this.Camera2StreamConfigurationMap.putShort(s);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putInt(int i) {
        this.Camera2StreamConfigurationMap.putInt(i);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putLong(long j) {
        this.Camera2StreamConfigurationMap.putLong(j);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putFloat(float f) {
        this.Camera2StreamConfigurationMap.putFloat(f);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public void putDouble(double d) {
        this.Camera2StreamConfigurationMap.putDouble(d);
    }

    public void setBoolean(int i, boolean z) {
        set(i, z ? (byte) 1 : (byte) 0);
    }

    public void set(int i, byte b) {
        requestCapacity(i + 1);
        this.Camera2StreamConfigurationMap.put(i, b);
    }

    public void set(int i, byte[] bArr, int i2, int i3) {
        requestCapacity((i3 - i2) + i);
        int position = this.Camera2StreamConfigurationMap.position();
        this.Camera2StreamConfigurationMap.position(i);
        this.Camera2StreamConfigurationMap.put(bArr, i2, i3);
        this.Camera2StreamConfigurationMap.position(position);
    }

    public void setShort(int i, short s) {
        requestCapacity(i + 2);
        this.Camera2StreamConfigurationMap.putShort(i, s);
    }

    public void setInt(int i, int i2) {
        requestCapacity(i + 4);
        this.Camera2StreamConfigurationMap.putInt(i, i2);
    }

    public void setLong(int i, long j) {
        requestCapacity(i + 8);
        this.Camera2StreamConfigurationMap.putLong(i, j);
    }

    public void setFloat(int i, float f) {
        requestCapacity(i + 4);
        this.Camera2StreamConfigurationMap.putFloat(i, f);
    }

    public void setDouble(int i, double d) {
        requestCapacity(i + 8);
        this.Camera2StreamConfigurationMap.putDouble(i, d);
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadWriteBuf
    public int writePosition() {
        return this.Camera2StreamConfigurationMap.position();
    }

    @Override // androidx.emoji2.text.flatbuffer.ReadBuf
    public int limit() {
        return this.Camera2StreamConfigurationMap.limit();
    }

    public boolean requestCapacity(int i) {
        return i <= this.Camera2StreamConfigurationMap.limit();
    }
}
