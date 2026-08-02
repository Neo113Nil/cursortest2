package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mh implements util.h.xy.dh.c {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public abstract util.h.xy.dh.mi mo26279();

    public boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 71) + (i | 71)) % 128;
        if (this == obj) {
            int i2 = ((i & 103) + (i | 103)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof util.h.xy.dh.c)) {
            int i4 = ((i | 121) << 1) - (i ^ 121);
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        boolean m26325 = mo26279().m26325(((util.h.xy.dh.c) obj).mo26279());
        int i5 = getHighSpeedVideoFpsRangesFor;
        int i6 = ((i5 | 79) << 1) - (i5 ^ 79);
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 != 0) {
            return m26325;
        }
        throw null;
    }

    public int hashCode() {
        int i = getHighSpeedVideoFpsRangesFor + 103;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            mo26279().hashCode();
            throw null;
        }
        int hashCode = mo26279().hashCode();
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 107) + (i2 | 107);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return hashCode;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] m26322(java.lang.String str) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        mo26279().mo26323(byteArrayOutputStream, str);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 97) << 1) - (i ^ 97)) % 128;
        return byteArray;
    }

    /* renamed from: ᐝ */
    public byte[] mo25969() throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        mo26279().mo26321(byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i = getHighResolutionOutputSizeshNQ4ISI + 59;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return byteArray;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void mo26323(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 111) + ((i & 111) << 1)) % 128;
        mo26279().mo26323(outputStream, str);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 ^ 49) + ((i2 & 49) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo26321(java.io.OutputStream outputStream) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 85) + (i | 85);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        mo26279().mo26321(outputStream);
        if (i3 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 109) % 128;
    }
}
