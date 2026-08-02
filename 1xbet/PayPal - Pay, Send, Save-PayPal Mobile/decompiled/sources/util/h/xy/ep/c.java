package util.h.xy.ep;

/* loaded from: classes18.dex */
public class c implements util.h.xy.ef.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private util.h.xy.ep.d getOutputMinFrameDuration;

    public int hashCode() {
        int i = Camera2StreamConfigurationMap + 63;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            m26654().hashCode();
            m26653().hashCode();
            m26652().hashCode();
            throw new java.lang.ArithmeticException();
        }
        int hashCode = m26654().hashCode();
        int hashCode2 = m26653().hashCode();
        int i2 = (~(hashCode & hashCode2)) & (hashCode | hashCode2);
        int hashCode3 = m26652().hashCode();
        int i3 = (i2 & (~hashCode3)) | ((~i2) & hashCode3);
        int i4 = Camera2StreamConfigurationMap;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(java.lang.Object obj) {
        int i;
        int i2 = Camera2StreamConfigurationMap;
        boolean z = true;
        int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
        int i4 = i3 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!(obj instanceof util.h.xy.ep.c)) {
            Camera2StreamConfigurationMap = ((i4 & 99) + (i4 | 99)) % 128;
            return false;
        }
        util.h.xy.ep.c cVar = (util.h.xy.ep.c) obj;
        if (cVar.m26654().equals(this.getHighSpeedVideoFpsRanges)) {
            int i5 = Camera2StreamConfigurationMap;
            int i6 = ((i5 | 109) << 1) - (i5 ^ 109);
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            java.math.BigInteger m26653 = cVar.m26653();
            if (i6 % 2 != 0) {
                m26653.equals(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.ArithmeticException();
            }
            if (m26653.equals(this.getHighSpeedVideoFpsRangesFor) && cVar.m26652().equals(this.getHighSpeedVideoSizes)) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
                i = Camera2StreamConfigurationMap + 113;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    return z;
                }
                throw null;
            }
        }
        z = false;
        i = Camera2StreamConfigurationMap + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public util.h.xy.ep.d m26655() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i & 75) + (i | 75);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.ep.d dVar = this.getOutputMinFrameDuration;
        int i4 = ((i3 | 99) << 1) - (i3 ^ 99);
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return dVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public java.math.BigInteger m26652() {
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (i + 95) % 128;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 109) + (i | 109)) % 128;
        return bigInteger;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.math.BigInteger m26653() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 63) + (i | 63)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i2 | 55) << 1) - (i2 ^ 55)) % 128;
        return bigInteger;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public java.math.BigInteger m26654() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i & 85) + (i | 85)) % 128;
        java.math.BigInteger bigInteger = this.getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 61) % 128;
        return bigInteger;
    }

    public c(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, util.h.xy.ep.d dVar) {
        this.getHighSpeedVideoSizes = bigInteger3;
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = bigInteger2;
        this.getOutputMinFrameDuration = dVar;
    }
}
