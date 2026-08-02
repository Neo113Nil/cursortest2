package com.sun.jna;

/* loaded from: classes5.dex */
public class Memory extends com.sun.jna.Pointer implements java.io.Closeable {
    private static final java.util.Map<java.lang.Long, java.lang.ref.Reference<com.sun.jna.Memory>> Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();
    private static final com.sun.jna.WeakMemoryHolder getHighSpeedVideoSizes = new com.sun.jna.WeakMemoryHolder();
    private final com.sun.jna.internal.Cleaner.Cleanable getHighSpeedVideoFpsRangesFor;
    protected long size;

    public static void purge() {
        getHighSpeedVideoSizes.clean();
    }

    public static void disposeAll() {
        java.util.Iterator it = new java.util.ArrayList(Camera2StreamConfigurationMap.values()).iterator();
        while (it.hasNext()) {
            com.sun.jna.Memory memory = (com.sun.jna.Memory) ((java.lang.ref.Reference) it.next()).get();
            if (memory != null) {
                memory.close();
            }
        }
    }

    class SharedMemory extends com.sun.jna.Memory {
        public SharedMemory(long j, long j2) {
            this.size = j2;
            this.peer = com.sun.jna.Memory.this.peer + j;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.sun.jna.Memory
        public void dispose() {
            synchronized (this) {
                this.peer = 0L;
            }
        }

        @Override // com.sun.jna.Memory
        protected void boundsCheck(long j, long j2) {
            com.sun.jna.Memory.this.boundsCheck((this.peer - com.sun.jna.Memory.this.peer) + j, j2);
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(super.toString());
            sb.append(" (shared from ");
            sb.append(com.sun.jna.Memory.this.toString());
            sb.append(")");
            return sb.toString();
        }
    }

    public Memory(long j) {
        this.size = j;
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Allocation size must be greater than zero");
        }
        this.peer = malloc(j);
        if (this.peer == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot allocate ");
            sb.append(j);
            sb.append(" bytes");
            throw new java.lang.OutOfMemoryError(sb.toString());
        }
        Camera2StreamConfigurationMap.put(java.lang.Long.valueOf(this.peer), new java.lang.ref.WeakReference(this));
        this.getHighSpeedVideoFpsRangesFor = com.sun.jna.internal.Cleaner.getCleaner().register(this, new com.sun.jna.Memory.MemoryDisposer(this.peer));
    }

    protected Memory() {
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @Override // com.sun.jna.Pointer
    public com.sun.jna.Pointer share(long j) {
        return share(j, size() - j);
    }

    @Override // com.sun.jna.Pointer
    public com.sun.jna.Pointer share(long j, long j2) {
        boundsCheck(j, j2);
        return new com.sun.jna.Memory.SharedMemory(j, j2);
    }

    public com.sun.jna.Memory align(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Byte boundary must be positive: ".concat(java.lang.String.valueOf(i)));
        }
        for (int i2 = 0; i2 < 32; i2++) {
            if (i == (1 << i2)) {
                long j = i;
                long j2 = ~(j - 1);
                if ((this.peer & j2) == this.peer) {
                    return this;
                }
                long j3 = ((this.peer + j) - 1) & j2;
                long j4 = (this.peer + this.size) - j3;
                if (j4 <= 0) {
                    throw new java.lang.IllegalArgumentException("Insufficient memory to align to the requested boundary");
                }
                return (com.sun.jna.Memory) share(j3 - this.peer, j4);
            }
        }
        throw new java.lang.IllegalArgumentException("Byte boundary must be a power of two");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peer = 0L;
        com.sun.jna.internal.Cleaner.Cleanable cleanable = this.getHighSpeedVideoFpsRangesFor;
        if (cleanable != null) {
            cleanable.clean();
        }
    }

    @java.lang.Deprecated
    public void dispose() {
        close();
    }

    public void clear() {
        clear(this.size);
    }

    public boolean valid() {
        return this.peer != 0;
    }

    public long size() {
        return this.size;
    }

    protected void boundsCheck(long j, long j2) {
        if (j < 0) {
            throw new java.lang.IndexOutOfBoundsException("Invalid offset: ".concat(java.lang.String.valueOf(j)));
        }
        long j3 = j + j2;
        if (j3 <= this.size) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bounds exceeds available space : size=");
        sb.append(this.size);
        sb.append(", offset=");
        sb.append(j3);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, i2);
        super.read(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, i2 * 2);
        super.read(j, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, com.sun.jna.Native.WCHAR_SIZE * i2);
        super.read(j, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.read(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.read(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.read(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.read(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, com.sun.jna.Native.POINTER_SIZE * i2);
        super.read(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, byte[] bArr, int i, int i2) {
        boundsCheck(j, i2);
        super.write(j, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, short[] sArr, int i, int i2) {
        boundsCheck(j, i2 * 2);
        super.write(j, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, char[] cArr, int i, int i2) {
        boundsCheck(j, com.sun.jna.Native.WCHAR_SIZE * i2);
        super.write(j, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, int[] iArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.write(j, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, long[] jArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.write(j, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, float[] fArr, int i, int i2) {
        boundsCheck(j, i2 * 4);
        super.write(j, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, double[] dArr, int i, int i2) {
        boundsCheck(j, i2 * 8);
        super.write(j, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j, com.sun.jna.Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j, com.sun.jna.Native.POINTER_SIZE * i2);
        super.write(j, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public byte getByte(long j) {
        boundsCheck(j, 1L);
        return super.getByte(j);
    }

    @Override // com.sun.jna.Pointer
    public char getChar(long j) {
        boundsCheck(j, com.sun.jna.Native.WCHAR_SIZE);
        return super.getChar(j);
    }

    @Override // com.sun.jna.Pointer
    public short getShort(long j) {
        boundsCheck(j, 2L);
        return super.getShort(j);
    }

    @Override // com.sun.jna.Pointer
    public int getInt(long j) {
        boundsCheck(j, 4L);
        return super.getInt(j);
    }

    @Override // com.sun.jna.Pointer
    public long getLong(long j) {
        boundsCheck(j, 8L);
        return super.getLong(j);
    }

    @Override // com.sun.jna.Pointer
    public float getFloat(long j) {
        boundsCheck(j, 4L);
        return super.getFloat(j);
    }

    @Override // com.sun.jna.Pointer
    public double getDouble(long j) {
        boundsCheck(j, 8L);
        return super.getDouble(j);
    }

    @Override // com.sun.jna.Pointer
    public com.sun.jna.Pointer getPointer(long j) {
        boundsCheck(j, com.sun.jna.Native.POINTER_SIZE);
        com.sun.jna.Pointer pointer = super.getPointer(j);
        if (pointer == null) {
            return null;
        }
        long j2 = pointer.peer - this.peer;
        return (j2 < 0 || j2 >= this.size) ? pointer : share(j2);
    }

    @Override // com.sun.jna.Pointer
    public java.nio.ByteBuffer getByteBuffer(long j, long j2) {
        boundsCheck(j, j2);
        java.nio.ByteBuffer byteBuffer = super.getByteBuffer(j, j2);
        getHighSpeedVideoSizes.put(byteBuffer, this);
        return byteBuffer;
    }

    @Override // com.sun.jna.Pointer
    public java.lang.String getString(long j, java.lang.String str) {
        boundsCheck(j, 0L);
        return super.getString(j, str);
    }

    @Override // com.sun.jna.Pointer
    public java.lang.String getWideString(long j) {
        boundsCheck(j, 0L);
        return super.getWideString(j);
    }

    @Override // com.sun.jna.Pointer
    public void setByte(long j, byte b) {
        boundsCheck(j, 1L);
        super.setByte(j, b);
    }

    @Override // com.sun.jna.Pointer
    public void setChar(long j, char c) {
        boundsCheck(j, com.sun.jna.Native.WCHAR_SIZE);
        super.setChar(j, c);
    }

    @Override // com.sun.jna.Pointer
    public void setShort(long j, short s) {
        boundsCheck(j, 2L);
        super.setShort(j, s);
    }

    @Override // com.sun.jna.Pointer
    public void setInt(long j, int i) {
        boundsCheck(j, 4L);
        super.setInt(j, i);
    }

    @Override // com.sun.jna.Pointer
    public void setLong(long j, long j2) {
        boundsCheck(j, 8L);
        super.setLong(j, j2);
    }

    @Override // com.sun.jna.Pointer
    public void setFloat(long j, float f) {
        boundsCheck(j, 4L);
        super.setFloat(j, f);
    }

    @Override // com.sun.jna.Pointer
    public void setDouble(long j, double d) {
        boundsCheck(j, 8L);
        super.setDouble(j, d);
    }

    @Override // com.sun.jna.Pointer
    public void setPointer(long j, com.sun.jna.Pointer pointer) {
        boundsCheck(j, com.sun.jna.Native.POINTER_SIZE);
        super.setPointer(j, pointer);
    }

    @Override // com.sun.jna.Pointer
    public void setString(long j, java.lang.String str, java.lang.String str2) {
        boundsCheck(j, com.sun.jna.Native.getHighSpeedVideoSizes(str, str2).length + 1);
        super.setString(j, str, str2);
    }

    @Override // com.sun.jna.Pointer
    public void setWideString(long j, java.lang.String str) {
        boundsCheck(j, (str.length() + 1) * com.sun.jna.Native.WCHAR_SIZE);
        super.setWideString(j, str);
    }

    @Override // com.sun.jna.Pointer
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("allocated@0x");
        sb.append(java.lang.Long.toHexString(this.peer));
        sb.append(" (");
        sb.append(this.size);
        sb.append(" bytes)");
        return sb.toString();
    }

    protected static void free(long j) {
        if (j != 0) {
            com.sun.jna.Native.free(j);
        }
    }

    protected static long malloc(long j) {
        return com.sun.jna.Native.malloc(j);
    }

    public java.lang.String dump() {
        return dump(0L, (int) size());
    }

    static final class MemoryDisposer implements java.lang.Runnable {
        private long getHighSpeedVideoFpsRanges;

        public MemoryDisposer(long j) {
            this.getHighSpeedVideoFpsRanges = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                try {
                    com.sun.jna.Memory.free(this.getHighSpeedVideoFpsRanges);
                } finally {
                    com.sun.jna.Memory.Camera2StreamConfigurationMap.remove(java.lang.Long.valueOf(this.getHighSpeedVideoFpsRanges));
                    this.getHighSpeedVideoFpsRanges = 0L;
                }
            }
        }
    }
}
