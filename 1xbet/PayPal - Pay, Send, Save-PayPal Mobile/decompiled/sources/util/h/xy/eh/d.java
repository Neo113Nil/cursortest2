package util.h.xy.eh;

/* loaded from: classes5.dex */
public final class d extends util.h.xy.eh.a {
    private static char[] Camera2StreamConfigurationMap = {42311, 42347, 42344, 42349, 42346, 42265, 42256};
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizesFor;

    private static void getHighSpeedVideoFpsRanges(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRanges + 69;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 117) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = getHighSpeedVideoFpsRanges + 61;
                getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr2[i6] = (char) (cArr[i6] + 8125198844289309347L);
                } else {
                    cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                    i6++;
                }
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
            int i8 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i8);
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
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 89) % 128;
            }
        }
        objArr[0] = new java.lang.String(cArr6);
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ᐝ */
    public final void mo26585(util.h.xy.fb.c cVar) {
        int i = getHighSpeedVideoFpsRangesFor + 105;
        getHighSpeedVideoSizesFor = i % 128;
        super.m26578((util.h.xy.eh.d) cVar);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 57) % 128;
    }

    @Override // util.h.xy.fb.c
    /* renamed from: ʻ */
    public final util.h.xy.fb.c mo26581() {
        util.h.xy.eh.d dVar = new util.h.xy.eh.d(this);
        int i = getHighSpeedVideoFpsRangesFor + 69;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return dVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.eh.a, util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final void mo26564() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 125) % 128;
        super.mo26564();
        this.f2160 = -3766243637369397544L;
        this.f2158 = 7105036623409894663L;
        this.f2157 = -7973340178411365097L;
        this.f2161 = 1526699215303891257L;
        this.f2159 = 7436329637833083697L;
        this.f2155 = -8163818279084223215L;
        this.f2162 = -2662702644619276377L;
        this.f2156 = 5167115440072839076L;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizesFor + 31) % 128;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˏ */
    public final int mo26563(byte[] bArr, int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoFpsRangesFor + 45) % 128;
        m26576();
        util.h.xy.fb.rb.m26848(this.f2160, bArr, i);
        util.h.xy.fb.rb.m26848(this.f2158, bArr, i + 8);
        util.h.xy.fb.rb.m26848(this.f2157, bArr, i + 16);
        util.h.xy.fb.rb.m26848(this.f2161, bArr, i + 24);
        util.h.xy.fb.rb.m26848(this.f2159, bArr, i + 32);
        util.h.xy.fb.rb.m26848(this.f2155, bArr, i + 40);
        mo26564();
        int i2 = getHighSpeedVideoFpsRangesFor + 35;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return 48;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ᐝ */
    public final int mo26565() {
        int i = (getHighSpeedVideoSizesFor + 83) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        getHighSpeedVideoSizesFor = (i + 49) % 128;
        return 48;
    }

    @Override // util.h.xy.ef.rd
    /* renamed from: ˎ */
    public final java.lang.String mo26561() {
        java.lang.Object obj;
        int i = getHighSpeedVideoFpsRangesFor + 105;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{0, 7, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(new int[]{0, 7, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001", objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    public d(util.h.xy.eh.d dVar) {
        super(dVar);
    }

    public d() {
    }
}
