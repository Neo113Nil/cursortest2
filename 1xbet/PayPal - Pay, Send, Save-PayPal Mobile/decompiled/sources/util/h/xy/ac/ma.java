package util.h.xy.ac;

/* loaded from: classes5.dex */
public class ma implements util.h.xy.ac.rc {
    private static int Camera2StreamConfigurationMap = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.ac.ra getHighSpeedVideoFpsRanges;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = util.h.xy.ac.ma.class.getName();
        int i = getHighSpeedVideoSizes + 37;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public byte[] m24545(byte[] bArr) throws util.h.xy.ac.b {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 105) % 128;
        getHighResolutionOutputSizeshNQ4ISI();
        byte[] mo24546 = this.getHighSpeedVideoFpsRanges.mo24546();
        byte[] bArr2 = new byte[12];
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = ((i ^ 67) + ((i & 67) << 1)) % 128;
        try {
            int[] iArr = {0, 26, 91, 0};
            byte[] bytes = "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001".getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                    i6++;
                    length = length;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bytes != null) {
                char[] cArr4 = new char[i3];
                maVar.f2631 = 0;
                char c = 0;
                while (maVar.f2631 < i3) {
                    if (bytes[maVar.f2631] == 1) {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    } else {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i7 = i3 - i5;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
            }
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            if (i4 > 0) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                    maVar.f2631++;
                }
            }
            java.lang.String str = new java.lang.String(cArr6);
            java.lang.String str2 = str;
            ((java.security.SecureRandom) java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
            util.h.xy.ar.b.m25098(mo24546);
            try {
                try {
                    util.h.xy.ep.ra raVar = new util.h.xy.ep.ra(new util.h.xy.ep.mc(mo24546), 128, bArr2, null);
                    util.h.xy.eo.ra raVar2 = new util.h.xy.eo.ra(new util.h.xy.ej.ma());
                    raVar2.mo26637(true, raVar);
                    int mo26638 = raVar2.mo26638(bArr.length);
                    byte[] bArr3 = new byte[mo26638];
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i8 = mo26638 * 860;
                    int i9 = (i8 ^ (-10296)) + ((i8 & (-10296)) << 1) + (((mo26638 ^ identityHashCode) | (mo26638 & identityHashCode)) * (-859));
                    int i10 = ~identityHashCode;
                    int i11 = ~((i10 ^ mo26638) | (i10 & mo26638));
                    int i12 = ~mo26638;
                    int i13 = (i12 & (-13)) | (i12 ^ (-13));
                    int i14 = ~((identityHashCode & i13) | (i13 ^ identityHashCode));
                    int i15 = ((i14 ^ i11) | (i14 & i11)) * 859;
                    int i16 = ~((i10 & (-13)) | (i10 ^ (-13)));
                    int i17 = ~((mo26638 ^ (-13)) | (mo26638 & (-13)));
                    byte[] bArr4 = new byte[(((i9 ^ i15) + ((i15 & i9) << 1)) - (~(-(-(((i16 & i17) | (i16 ^ i17)) * 859))))) - 1];
                    java.lang.System.arraycopy(bArr2, 0, bArr4, 0, 12);
                    int mo26643 = raVar2.mo26643(bArr, 0, bArr.length, bArr3, 0);
                    raVar2.mo26638(bArr.length);
                    raVar2.mo26642(bArr3, mo26643);
                    java.lang.System.arraycopy(bArr3, 0, bArr4, 12, mo26638);
                    getHighSpeedVideoFpsRangesFor(mo24546);
                    getHighSpeedVideoFpsRangesFor(bArr2);
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 47) % 128;
                    return bArr4;
                } catch (util.h.xy.ef.md e) {
                    throw new util.h.xy.ac.b(e.getMessage());
                }
            } catch (java.lang.Throwable th) {
                getHighSpeedVideoFpsRangesFor(mo24546);
                getHighSpeedVideoFpsRangesFor(bArr2);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            java.lang.Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public byte[] m24544(byte[] bArr) throws util.h.xy.ac.b {
        getHighResolutionOutputSizeshNQ4ISI();
        byte[] mo24546 = this.getHighSpeedVideoFpsRanges.mo24546();
        byte[] bArr2 = new byte[12];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 12);
        int length = bArr.length;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = (-3063) - (~(-(-(length * 306))));
        int i2 = -(-(((~(length | (-12))) | (~((identityHashCode ^ (-12)) | (identityHashCode & (-12))))) * 305));
        int i3 = ((i | i2) << 1) - (i ^ i2);
        int i4 = ~length;
        int i5 = ~identityHashCode;
        int i6 = ~((i5 ^ (-12)) | (i5 & (-12)));
        int i7 = ((i4 ^ i6) | (i4 & i6)) * 305;
        int i8 = (i3 ^ i7) + ((i7 & i3) << 1);
        byte[] bArr3 = new byte[i8];
        java.lang.System.arraycopy(bArr, 12, bArr3, 0, i8);
        util.h.xy.ar.b.m25098(mo24546);
        try {
            try {
                util.h.xy.ep.ra raVar = new util.h.xy.ep.ra(new util.h.xy.ep.mc(mo24546), 128, bArr2, null);
                util.h.xy.eo.ra raVar2 = new util.h.xy.eo.ra(new util.h.xy.ej.ma());
                raVar2.mo26637(false, raVar);
                byte[] bArr4 = new byte[raVar2.mo26638(i8)];
                int mo26643 = raVar2.mo26643(bArr3, 0, i8, bArr4, 0);
                raVar2.mo26638(i8);
                raVar2.mo26642(bArr4, mo26643);
                getHighSpeedVideoFpsRangesFor(mo24546);
                getHighSpeedVideoFpsRangesFor(bArr3);
                getHighSpeedVideoFpsRangesFor(bArr2);
                int i9 = getHighSpeedVideoSizes + 7;
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % 2 != 0) {
                    return bArr4;
                }
                throw null;
            } catch (util.h.xy.ef.md e) {
                throw new util.h.xy.ac.b(e.getMessage());
            }
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoFpsRangesFor(mo24546);
            getHighSpeedVideoFpsRangesFor(bArr3);
            getHighSpeedVideoFpsRangesFor(bArr2);
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m24543(util.h.xy.ac.ra raVar) throws util.h.xy.ac.b {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 63) + (i | 63)) % 128;
        getHighSpeedVideoSizes = i2;
        if (raVar == null) {
            throw new util.h.xy.ac.b(util.h.xy.al.ra.f714);
        }
        util.h.xy.ac.ra raVar2 = this.getHighSpeedVideoFpsRanges;
        if (raVar2 != null) {
            int i3 = (i2 & 121) + (i2 | 121);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                raVar2.mo24542();
            } else {
                raVar2.mo24542();
                throw new java.lang.ArithmeticException();
            }
        }
        this.getHighSpeedVideoFpsRanges = raVar;
        int i4 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (((i4 | 7) << 1) - (i4 ^ 7)) % 128;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.ac.b {
        int i = Camera2StreamConfigurationMap + 17;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new util.h.xy.ac.b(util.h.xy.al.ra.f679);
        }
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.ac.e
    /* renamed from: ˋ */
    public void mo24542() {
        int i = Camera2StreamConfigurationMap + 7;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ac.ra raVar = this.getHighSpeedVideoFpsRanges;
        if (raVar != null) {
            Camera2StreamConfigurationMap = (i2 + 9) % 128;
            raVar.mo24542();
        }
        this.getHighSpeedVideoFpsRanges = null;
        int i3 = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = ((i3 ^ 69) + ((i3 & 69) << 1)) % 128;
    }

    private static byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 55;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            if (bArr != null && bArr.length > 0) {
                int i3 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                Camera2StreamConfigurationMap = i3 % 128;
                int i4 = i3 % 2;
                java.util.Arrays.fill(bArr, bArr[0]);
            }
            int i5 = getHighSpeedVideoSizes;
            int i6 = ((i5 | 99) << 1) - (i5 ^ 99);
            Camera2StreamConfigurationMap = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw new java.lang.ArithmeticException();
        }
        throw null;
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighResolutionOutputSizeshNQ4ISI = new char[]{42297, 42388, 42393, 42393, 42399, 42473, 42475, 42395, 42387, 42394, 42466, 42474, 42438, 42483, 42380, 42388, 42389, 42387, 42394, 42466, 42394, 42486, 42495, 42395, 42395, 42397};
    }
}
