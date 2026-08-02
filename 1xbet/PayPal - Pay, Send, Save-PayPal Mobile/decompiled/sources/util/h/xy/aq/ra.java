package util.h.xy.aq;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static final java.nio.charset.Charset getHighSpeedVideoSizes = java.nio.charset.Charset.forName(util.h.xy.al.ra.f673);
    private final byte[] getHighSpeedVideoFpsRanges;
    private final util.h.xy.aq.b getHighSpeedVideoFpsRangesFor;

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final java.util.List<util.h.xy.aq.ra> f862;

    public ra(util.h.xy.aq.b bVar, java.util.List<util.h.xy.aq.ra> list) {
        this.getHighSpeedVideoFpsRangesFor = bVar;
        this.f862 = list;
        this.getHighSpeedVideoFpsRanges = null;
    }

    public ra(util.h.xy.aq.b bVar, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = bVar;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.f862 = null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.aq.b m25050() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 49;
        int i2 = i % 128;
        Camera2StreamConfigurationMap = i2;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.aq.b bVar = this.getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 91;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25049() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 37) + ((i & 37) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        boolean m25040 = this.getHighSpeedVideoFpsRangesFor.m25040();
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i3 | 77) << 1) - (i3 ^ 77)) % 128;
        return m25040;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.aq.ra m25048(util.h.xy.aq.b bVar) {
        int i = Camera2StreamConfigurationMap + 89;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            bVar.equals(m25050());
            throw null;
        }
        if (bVar.equals(m25050())) {
            return this;
        }
        if (!m25049()) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 & 81) + (i2 | 81);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = ((i4 ^ 39) + ((i4 & 39) << 1)) % 128;
        java.util.Iterator<util.h.xy.aq.ra> it = this.f862.iterator();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 71) % 128;
        while (it.hasNext()) {
            int i5 = Camera2StreamConfigurationMap;
            int i6 = (i5 ^ 7) + ((i5 & 7) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                it.next().m25048(bVar);
                throw null;
            }
            util.h.xy.aq.ra m25048 = it.next().m25048(bVar);
            if (m25048 != null) {
                int i7 = getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap = ((i7 & 91) + (i7 | 91)) % 128;
                return m25048;
            }
            int i8 = getHighResolutionOutputSizeshNQ4ISI + 55;
            Camera2StreamConfigurationMap = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 2;
            }
        }
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m25051() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 39) + ((i & 39) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            m25049();
            throw new java.lang.ArithmeticException();
        }
        if (m25049()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(util.h.xy.al.ra.f610);
            sb.append(util.h.xy.aq.ma.m25045(this.getHighSpeedVideoFpsRangesFor.f861));
            throw new java.lang.IllegalStateException(sb.toString());
        }
        java.lang.String m25045 = util.h.xy.aq.ma.m25045(this.getHighSpeedVideoFpsRanges);
        int i3 = Camera2StreamConfigurationMap;
        int i4 = ((i3 | 33) << 1) - (i3 ^ 33);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 != 0) {
            return m25045;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25047() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 25) + ((i & 25) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            if (m25049()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(util.h.xy.al.ra.f621);
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr;
            }
            throw null;
        }
        m25049();
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f662);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(util.h.xy.al.ra.f652);
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRanges));
        sb.append(util.h.xy.al.ra.f664);
        sb.append(this.f862);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        java.lang.String obj = sb.toString();
        int i = getHighResolutionOutputSizeshNQ4ISI + 15;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }
}
