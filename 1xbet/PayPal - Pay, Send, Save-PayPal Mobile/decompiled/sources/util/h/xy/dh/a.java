package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class a extends util.h.xy.dh.mi implements util.h.xy.dh.m {
    static final util.h.xy.dh.p Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 1;
    final char[] getHighSpeedVideoFpsRangesFor;

    private static void getHighSpeedVideoFpsRangesFor(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
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
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i6, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 95) % 128;
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 7) % 128;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 21) % 128;
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 43) % 128;
        objArr[0] = str2;
    }

    static {
        getHighSpeedVideoSizes();
        Camera2StreamConfigurationMap = new util.h.xy.dh.p(util.h.xy.dh.a.class) { // from class: util.h.xy.dh.a.1
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 93) % 128;
                util.h.xy.dh.a highSpeedVideoFpsRangesFor = util.h.xy.dh.a.getHighSpeedVideoFpsRangesFor(mzVar.m26337());
                int i = Camera2StreamConfigurationMap;
                int i2 = (i ^ 7) + ((i & 7) << 1);
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    return highSpeedVideoFpsRangesFor;
                }
                throw null;
            }
        };
        int i = getInputFormats + 15;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static util.h.xy.dh.a getHighSpeedVideoFpsRanges(char[] cArr) {
        util.h.xy.dh.x xVar = new util.h.xy.dh.x(cArr);
        getHighSpeedVideoSizesFor = (getInputFormats + 75) % 128;
        return xVar;
    }

    static util.h.xy.dh.a getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        util.h.xy.dh.x xVar = new util.h.xy.dh.x(bArr);
        getHighSpeedVideoSizesFor = (getInputFormats + 119) % 128;
        return xVar;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int length;
        byte[] bArr;
        int i;
        int i2;
        int i3 = getInputFormats + 57;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            length = this.getHighSpeedVideoFpsRangesFor.length;
            rjVar.getHighSpeedVideoSizes(z, 102);
            rjVar.getHighSpeedVideoFpsRanges(length >> 3);
            bArr = new byte[16];
            i = length & 52;
        } else {
            length = this.getHighSpeedVideoFpsRangesFor.length;
            rjVar.getHighSpeedVideoSizes(z, 30);
            rjVar.getHighSpeedVideoFpsRanges(length * 2);
            bArr = new byte[8];
            i = length & (-4);
        }
        int i4 = 0;
        while (i4 < i) {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            char c = cArr[i4];
            char c2 = cArr[i4 + 1];
            char c3 = cArr[i4 + 2];
            char c4 = cArr[i4 + 3];
            i4 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            rjVar.Camera2StreamConfigurationMap(bArr, 0, 8);
        }
        if (i4 < length) {
            getHighSpeedVideoSizesFor = (getInputFormats + 9) % 128;
            int i5 = 0;
            while (true) {
                char c5 = this.getHighSpeedVideoFpsRangesFor[i4];
                i4++;
                bArr[i5] = (byte) (c5 >> '\b');
                i2 = i5 + 2;
                bArr[i5 + 1] = (byte) c5;
                if (i4 >= length) {
                    break;
                } else {
                    i5 = i2;
                }
            }
            rjVar.Camera2StreamConfigurationMap(bArr, 0, i2);
        }
        getInputFormats = (getHighSpeedVideoSizesFor + 3) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        getHighSpeedVideoSizesFor = (getInputFormats + 87) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.getHighSpeedVideoFpsRangesFor.length * 2);
        int i = getHighSpeedVideoSizesFor + 21;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = (getHighSpeedVideoSizesFor + 97) % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public final int hashCode() {
        getHighSpeedVideoSizesFor = (getInputFormats + 23) % 128;
        int m26825 = util.h.xy.fb.a.m26825(this.getHighSpeedVideoFpsRangesFor);
        getHighSpeedVideoSizesFor = (getInputFormats + 73) % 128;
        return m26825;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getInputFormats + 23;
        int i2 = i % 128;
        getHighSpeedVideoSizesFor = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (miVar instanceof util.h.xy.dh.a) {
            return util.h.xy.fb.a.m26818(this.getHighSpeedVideoFpsRangesFor, ((util.h.xy.dh.a) miVar).getHighSpeedVideoFpsRangesFor);
        }
        int i3 = i2 + 25;
        getInputFormats = i3 % 128;
        return i3 % 2 == 0;
    }

    public java.lang.String toString() {
        getInputFormats = (getHighSpeedVideoSizesFor + 27) % 128;
        java.lang.String mo26276 = mo26276();
        getInputFormats = (getHighSpeedVideoSizesFor + 19) % 128;
        return mo26276;
    }

    @Override // util.h.xy.dh.m
    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String mo26276() {
        java.lang.String str = new java.lang.String(this.getHighSpeedVideoFpsRangesFor);
        int i = getHighSpeedVideoSizesFor + 7;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    a(char[] cArr) {
        if (cArr != null) {
            this.getHighSpeedVideoFpsRangesFor = cArr;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 23, 66, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
    }

    a(byte[] bArr) {
        if (bArr == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(true, new int[]{0, 23, 66, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(false, new int[]{23, 40, 68, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.getHighSpeedVideoFpsRangesFor = cArr;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes = new char[]{42250, 42483, 42479, 42478, 42452, 42457, 42488, 42462, 42449, 42478, 42477, 42477, 42484, 42489, 42462, 42296, 42452, 42481, 42480, 42482, 42472, 42472, 42450, 42245, 42486, 42487, 42480, 42483, 42473, 42478, 42480, 42485, 42459, 42280, 42454, 42447, 42440, 42490, 42474, 42476, 42482, 42483, 42458, 42459, 42480, 42481, 42480, 42480, 42487, 42482, 42483, 42458, 42459, 42480, 42481, 42480, 42475, 42472, 42472, 42477, 42482, 42482, 42485};
    }
}
