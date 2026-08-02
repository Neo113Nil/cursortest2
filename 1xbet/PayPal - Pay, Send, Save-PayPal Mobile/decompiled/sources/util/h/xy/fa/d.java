package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class d {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static final util.h.xy.fa.c getInputFormats;

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        int i;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = Camera2StreamConfigurationMap;
        if (cArr2 != null) {
            int i6 = getHighResolutionOutputSizeshNQ4ISI + 91;
            getHighSpeedVideoSizes = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                cArr[i] = (char) (cArr2[i] ^ (-8125198844289309347L));
                i++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bytes != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                int i7 = getHighResolutionOutputSizeshNQ4ISI + 113;
                getHighSpeedVideoSizes = i7 % 128;
                if (i7 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 0) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i8 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i8);
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 71) % 128;
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 13) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 89) % 128;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = new util.h.xy.fa.c();
        int i = getHighSpeedVideoFpsRangesFor + 95;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m26804(java.lang.String str, int i, int i2) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 99) % 128;
        try {
            byte[] highSpeedVideoSizes = getInputFormats.getHighSpeedVideoSizes(str, i, i2);
            int i3 = getHighSpeedVideoFpsRangesFor + 53;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0) {
                return highSpeedVideoSizes;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{31, 31, 0, 23}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.a(sb.toString(), e);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m26803(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 9) % 128;
        try {
            byte[] highSpeedVideoSizes = getInputFormats.getHighSpeedVideoSizes(str, 0, str.length());
            int i = getHighSpeedVideoFpsRangesFor + 17;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                return highSpeedVideoSizes;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{31, 31, 0, 23}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.a(sb.toString(), e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26801(byte[] bArr, int i, int i2) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            getInputFormats.mo26796(bArr, i, i2, byteArrayOutputStream);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 85) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i3 = getHighSpeedVideoFpsRanges + 25;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                return byteArray;
            }
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{0, 31, 94, 25}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.ma(sb.toString(), e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26800(byte[] bArr) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        byte[] m26801 = m26801(bArr, 0, bArr.length);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 73) % 128;
        return m26801;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m26802(byte[] bArr, int i, int i2) {
        int i3 = getHighSpeedVideoFpsRangesFor + 83;
        getHighSpeedVideoFpsRanges = i3 % 128;
        byte[] m26801 = m26801(bArr, i, i2);
        if (i3 % 2 == 0) {
            util.h.xy.fb.rd.m26855(m26801);
            throw new java.lang.ArithmeticException();
        }
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(m26801);
        int i4 = getHighSpeedVideoFpsRanges + 31;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            return m26855;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m26805(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 63) % 128;
        java.lang.String m26802 = m26802(bArr, 0, bArr.length);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 11) % 128;
        return m26802;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = new char[]{42302, 42391, 42385, 42488, 42493, 42394, 42395, 42394, 42394, 42393, 42388, 42389, 42492, 42447, 42473, 42385, 42487, 42490, 42380, 42380, 42390, 42388, 42389, 42483, 42454, 42493, 42385, 42390, 42399, 42389, 42381, 42317, 42257, 42291, 42251, 42345, 42270, 42295, 42294, 42299, 42292, 42292, 42297, 42297, 42271, 42266, 42291, 42289, 42291, 42287, 42295, 42297, 42288, 42291, 42271, 42352, 42253, 42295, 42294, 42288, 42286, 42286};
    }
}
