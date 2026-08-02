package util.h.xy.ac;

/* loaded from: classes5.dex */
public final class c {
    private static long Camera2StreamConfigurationMap = 0;
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getOutputFormats;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRanges = util.h.xy.ac.c.class.getName();
        int i = getHighSpeedVideoSizes + 53;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public c(byte[] bArr) {
        util.h.xy.ar.b.m25098(bArr);
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 89) << 1) - (i ^ 89);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[bArr.length];
            getHighSpeedVideoSizes = (i + 83) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("倒ﯬߤ叆ﾂூ垣\ue3a8ྥ宗\ue783㎋彽\ueb27㝍䍆\uef4b㭈䜰録㼎䬀霘⌟仯髸", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 44021, objArr);
                ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(this.getHighResolutionOutputSizeshNQ4ISI);
                byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, bArr);
                this.getOutputFormats = highSpeedVideoSizes;
                util.h.xy.ar.b.m25098(highSpeedVideoSizes);
                return;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[bArr.length];
        throw new java.lang.ArithmeticException();
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        int i = (getHighSpeedVideoFpsRangesFor + 35) % 128;
        getHighSpeedVideoSizes = i;
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        getHighSpeedVideoFpsRangesFor = (((i | 33) << 1) - (i ^ 33)) % 128;
        int i2 = 0;
        while (i2 < length) {
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (i3 + 117) % 128;
            byte b = bArr[i2];
            byte b2 = bArr2[i2];
            bArr3[i2] = (byte) ((~(b & b2)) & (b | b2));
            i2++;
            getHighSpeedVideoFpsRangesFor = (i3 + 61) % 128;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 55) % 128;
        return bArr3;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m24540() {
        int i = getHighSpeedVideoFpsRangesFor + 115;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI);
            util.h.xy.ar.b.m25098(highSpeedVideoSizes);
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = (((i2 | 85) << 1) - (i2 ^ 85)) % 128;
            return highSpeedVideoSizes;
        }
        util.h.xy.ar.b.m25098(getHighSpeedVideoSizes(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI));
        throw null;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (Camera2StreamConfigurationMap ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        Camera2StreamConfigurationMap = -5983443805771242525L;
    }
}
