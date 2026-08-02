package util.h.xy.ec;

/* loaded from: classes18.dex */
public final class ma implements util.h.xy.fb.mc {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private byte[] Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private util.h.xy.dw.b getHighSpeedVideoFpsRangesFor;

    public final java.lang.Object clone() {
        util.h.xy.ec.ma maVar = new util.h.xy.ec.ma(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 63) << 1) - (i ^ 63);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return maVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.Object obj2) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i & 81) + (i | 81)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (obj != null) {
            int i3 = (i2 ^ 71) + ((i2 & 71) << 1);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return obj.equals(obj2);
            }
            obj.equals(obj2);
            throw null;
        }
        if (obj2 != null) {
            getHighSpeedVideoSizes = (((i2 | 125) << 1) - (i2 ^ 125)) % 128;
            return false;
        }
        getHighResolutionOutputSizeshNQ4ISI = (((i | 99) << 1) - (i ^ 99)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 5) + ((i & 5) << 1)) % 128;
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 111) + ((i & 111) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (!(obj instanceof util.h.xy.ec.ma)) {
            int i3 = ((i2 | 39) << 1) - (i2 ^ 39);
            int i4 = i3 % 128;
            getHighSpeedVideoSizes = i4;
            boolean z = i3 % 2 == 0;
            int i5 = (i4 & 23) + (i4 | 23);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }
        util.h.xy.ec.ma maVar = (util.h.xy.ec.ma) obj;
        if (util.h.xy.fb.a.m26820(this.Camera2StreamConfigurationMap, maVar.Camera2StreamConfigurationMap)) {
            int i6 = getHighSpeedVideoSizes + 73;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, maVar.getHighSpeedVideoFpsRanges);
                throw null;
            }
            if (Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, maVar.getHighSpeedVideoFpsRanges) && Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, maVar.getHighSpeedVideoFpsRangesFor)) {
                int i7 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoSizes = (((i7 | 99) << 1) - (i7 ^ 99)) % 128;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int m26817 = util.h.xy.fb.a.m26817(this.Camera2StreamConfigurationMap);
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRanges;
        if (bigInteger != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            m26817 ^= bigInteger.hashCode();
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i & 37) + (i | 37)) % 128;
        }
        util.h.xy.dw.b bVar = this.getHighSpeedVideoFpsRangesFor;
        if (bVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 85) % 128;
            int hashCode = bVar.hashCode();
            m26817 = (m26817 & (~hashCode)) | ((~m26817) & hashCode);
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 113) % 128;
        return m26817;
    }

    public ma(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bVar;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.Camera2StreamConfigurationMap = bArr;
    }
}
