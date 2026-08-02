package util.h.xy.bj;

/* loaded from: classes5.dex */
public class a implements util.h.xy.bf.b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 68;
    final util.h.xy.bf.a getHighSpeedVideoFpsRangesFor;

    /* renamed from: ʾ, reason: contains not printable characters */
    public com.gemalto.mfs.mwsdk.payment.CustomApduListener f970;

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i ^ 107) + ((i & 107) << 1)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        int i3 = i2 + 119;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            return "a";
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        int i = 68 % 2;
    }

    public a(util.h.xy.bf.a aVar) {
        this.getHighSpeedVideoFpsRangesFor = aVar;
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] G_(byte[] bArr, android.os.Bundle bundle) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 29) + ((i & 29) << 1)) % 128;
        m25503(bArr);
        this.getHighSpeedVideoFpsRangesFor.m25404();
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        return null;
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] H_(byte[] bArr, android.os.Bundle bundle) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i & 11) + (i | 11)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (this.f970 == null) {
            int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f812);
        sb.append(util.h.xy.al.ra.f481);
        util.h.xy.am.ma.m25027(str, sb.toString());
        byte[] onProcessApdu = this.f970.onProcessApdu(bArr);
        int i4 = getHighResolutionOutputSizeshNQ4ISI;
        int i5 = ((i4 | 49) << 1) - (i4 ^ 49);
        getHighSpeedVideoFpsRanges = i5 % 128;
        if (i5 % 2 == 0) {
            return onProcessApdu;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bf.b
    @util.h.xy.a.a
    public byte[] I_(byte[] bArr, android.os.Bundle bundle, byte[] bArr2) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 121) + (i | 121);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            m25502(bArr2);
            return bArr2;
        }
        m25502(bArr2);
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25502(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (bArr == null) {
            return;
        }
        byte b = bArr[0];
        if (b == 16) {
            getHighResolutionOutputSizeshNQ4ISI = (((i | 19) << 1) - (i ^ 19)) % 128;
            Camera2StreamConfigurationMap(false);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 117) % 128;
        } else if (b == 17) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 61) % 128;
            Camera2StreamConfigurationMap(true);
        } else if (b == 19) {
            Camera2StreamConfigurationMap(false);
            this.getHighSpeedVideoFpsRangesFor.m25403(true);
            this.getHighSpeedVideoFpsRangesFor.m25409();
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        } else if (b == 18) {
            Camera2StreamConfigurationMap(false);
            util.h.xy.bf.c.f934.m25412();
        }
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 37) + (i3 | 37);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void Camera2StreamConfigurationMap(boolean z) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 121) + (i | 121)) % 128;
        this.getHighSpeedVideoFpsRangesFor.m25401(z);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = (i2 & 83) + (i2 | 83);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m25503(byte[] bArr) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 23) << 1) - (i ^ 23)) % 128;
        int length = bArr.length;
        int i2 = (length & (-6)) + (length | (-6));
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, 5, bArr2, 0, i2);
        java.lang.String m25074 = util.h.xy.ar.b.m25074(bArr2);
        if (!util.h.xy.bu.d.m25655().m25656()) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = (((i3 | 53) << 1) - (i3 ^ 53)) % 128;
            util.h.xy.bf.c.f934.m25414();
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        }
        this.f970 = util.h.xy.bu.d.m25655().m25658(m25074);
        int i4 = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i4 ^ 93) + ((i4 & 93) << 1)) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25501() {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = (i + 57) % 128;
        this.f970 = null;
        getHighResolutionOutputSizeshNQ4ISI = (i + 65) % 128;
    }
}
