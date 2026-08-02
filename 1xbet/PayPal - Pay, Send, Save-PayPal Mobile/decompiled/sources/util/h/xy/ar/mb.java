package util.h.xy.ar;

/* loaded from: classes5.dex */
public class mb {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;
    private final byte[] Camera2StreamConfigurationMap;
    private byte getHighSpeedVideoFpsRanges;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizesFor;
    private final int getInputFormats;

    static {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i | 1) << 1) - (i ^ 1)) % 128;
    }

    public mb(byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoFpsRanges = (byte) -1;
        this.Camera2StreamConfigurationMap = util.h.xy.ar.b.m25090(bArr, util.h.xy.ar.b.m25081(bArr2.length, true), bArr2);
        this.getHighSpeedVideoSizesFor = bArr;
        int length = bArr2.length;
        this.getInputFormats = length;
        byte[] bArr3 = new byte[length];
        this.getHighSpeedVideoFpsRangesFor = bArr3;
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length);
    }

    public mb(byte b, byte[] bArr) {
        this.getHighSpeedVideoFpsRanges = (byte) -1;
        byte[] m25081 = util.h.xy.ar.b.m25081((int) b, true);
        byte[] m250812 = util.h.xy.ar.b.m25081(bArr.length, true);
        this.getHighSpeedVideoSizesFor = m25081;
        this.Camera2StreamConfigurationMap = util.h.xy.ar.b.m25090(m25081, m250812, bArr);
        this.getHighSpeedVideoFpsRanges = b;
        int length = bArr.length;
        this.getInputFormats = length;
        byte[] bArr2 = new byte[length];
        this.getHighSpeedVideoFpsRangesFor = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m25111() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 57) + ((i & 57) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int m25112() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 1) << 1) - (i ^ 1)) % 128;
        int i2 = this.getInputFormats;
        int i3 = ((i | 57) << 1) - (i ^ 57);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public byte[] m25110() {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        int i = this.getInputFormats;
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRangesFor, 0, bArr, 0, i);
        int i2 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (((i2 | 19) << 1) - (i2 ^ 19)) % 128;
        return bArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public byte[] m25108() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        byte[] bArr3 = this.Camera2StreamConfigurationMap;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, length2);
        return bArr4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25107(byte[] bArr, byte[] bArr2) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 75) % 128;
        if (bArr2 != null) {
            getHighSpeedVideoSizes = (i + 51) % 128;
            if (bArr2.length >= 0) {
                byte[] m25090 = util.h.xy.ar.b.m25090(bArr, util.h.xy.ar.b.m25081(bArr2.length, true), bArr2);
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 79;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    return m25090;
                }
                throw null;
            }
        }
        int i3 = ((i | 49) << 1) - (i ^ 49);
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte m25109() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 85;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte b = this.getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return b;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public void m25113() {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;
        util.h.xy.ar.b.m25100(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRanges = (byte) 0;
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 95) + ((i & 95) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
