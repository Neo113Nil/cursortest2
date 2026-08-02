package com.sun.jna;

/* loaded from: classes5.dex */
public abstract class IntegerType extends java.lang.Number implements com.sun.jna.NativeMapped {
    private static final long serialVersionUID = 1;
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Number getHighSpeedVideoSizes;
    private long value;

    public static final int compare(long j, long j2) {
        if (j == j2) {
            return 0;
        }
        return j < j2 ? -1 : 1;
    }

    public IntegerType(int i) {
        this(i, 0L, false);
    }

    public IntegerType(int i, boolean z) {
        this(i, 0L, z);
    }

    public IntegerType(int i, long j) {
        this(i, j, false);
    }

    public IntegerType(int i, long j, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
        setValue(j);
    }

    public void setValue(long j) {
        long j2;
        this.value = j;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 1) {
            if (this.Camera2StreamConfigurationMap) {
                this.value = 255 & j;
            }
            byte b = (byte) j;
            j2 = b;
            this.getHighSpeedVideoSizes = java.lang.Byte.valueOf(b);
        } else if (i == 2) {
            if (this.Camera2StreamConfigurationMap) {
                this.value = okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX & j;
            }
            short s = (short) j;
            j2 = s;
            this.getHighSpeedVideoSizes = java.lang.Short.valueOf(s);
        } else if (i == 4) {
            if (this.Camera2StreamConfigurationMap) {
                this.value = 4294967295L & j;
            }
            int i2 = (int) j;
            j2 = i2;
            this.getHighSpeedVideoSizes = java.lang.Integer.valueOf(i2);
        } else if (i == 8) {
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(j);
            j2 = j;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported size: ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i3 < 8) {
            long j3 = ~((1 << (i3 * 8)) - 1);
            if ((j >= 0 || j2 == j) && (j < 0 || (j3 & j) == 0)) {
                return;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Argument value 0x");
            sb2.append(java.lang.Long.toHexString(j));
            sb2.append(" exceeds native capacity (");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(" bytes) mask=0x");
            sb2.append(java.lang.Long.toHexString(j3));
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Object toNative() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Object fromNative(java.lang.Object obj, com.sun.jna.FromNativeContext fromNativeContext) {
        long longValue = obj == null ? 0L : ((java.lang.Number) obj).longValue();
        com.sun.jna.IntegerType integerType = (com.sun.jna.IntegerType) com.sun.jna.Klass.getHighSpeedVideoFpsRangesFor(getClass());
        integerType.setValue(longValue);
        return integerType;
    }

    @Override // com.sun.jna.NativeMapped
    public java.lang.Class<?> nativeType() {
        return this.getHighSpeedVideoSizes.getClass();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.getHighSpeedVideoSizes.floatValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.getHighSpeedVideoSizes.doubleValue();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.sun.jna.IntegerType) && this.getHighSpeedVideoSizes.equals(((com.sun.jna.IntegerType) obj).getHighSpeedVideoSizes);
    }

    public java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public static <T extends com.sun.jna.IntegerType> int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return compare(t.longValue(), t2.longValue());
    }

    public static int compare(com.sun.jna.IntegerType integerType, long j) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j);
    }
}
