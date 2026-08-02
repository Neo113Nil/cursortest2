package util.h.xy.bi;

/* loaded from: classes5.dex */
public class ma extends util.h.xy.bi.ra {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static char[] getHighSpeedVideoSizes = null;
    private static boolean getHighSpeedVideoSizesFor = false;
    private static int getInputFormats = 1;
    private static boolean getInputSizeshNQ4ISI;
    private util.h.xy.g.ma getOutputMinFrameDuration;

    static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges() {
        int i = getInputFormats;
        Camera2StreamConfigurationMap = ((i ^ 69) + ((i & 69) << 1)) % 128;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 13;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor = "ma";
        getInputFormats = (Camera2StreamConfigurationMap + 61) % 128;
    }

    ma(util.h.xy.g.b bVar, util.h.xy.bf.a aVar) {
        super(bVar, aVar);
        if (bVar == null || !(bVar instanceof util.h.xy.g.ma)) {
            return;
        }
        this.getOutputMinFrameDuration = (util.h.xy.g.ma) bVar;
    }

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        int i = Camera2StreamConfigurationMap;
        getInputFormats = ((i ^ 33) + ((i & 33) << 1)) % 128;
        java.lang.String simpleName = getClass().getSimpleName();
        int i2 = getInputFormats + 29;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            return simpleName;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˎ */
    protected byte[] mo25490(byte[] bArr) {
        int i = getInputFormats;
        Camera2StreamConfigurationMap = (((i | 31) << 1) - (i ^ 31)) % 128;
        if (this.f967 == null) {
            int i2 = Camera2StreamConfigurationMap;
            getInputFormats = (((i2 | 69) << 1) - (i2 ^ 69)) % 128;
            byte[] bArr2 = this.f963;
            int i3 = Camera2StreamConfigurationMap + 1;
            getInputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr2;
            }
            throw null;
        }
        this.f967.m26877();
        this.f967.m26875();
        this.f967.m26874();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f967.m26874());
        sb.append(util.h.xy.al.ra.f431);
        byte[] m25076 = util.h.xy.ar.b.m25076(sb.toString());
        int i4 = Camera2StreamConfigurationMap + 51;
        getInputFormats = i4 % 128;
        if (i4 % 2 != 0) {
            return m25076;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˏ */
    protected byte[] mo25491(byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        boolean z = true;
        getInputFormats = ((i ^ 49) + ((i & 49) << 1)) % 128;
        byte[] bArr2 = null;
        if (this.f967 == null) {
            int i2 = getInputFormats;
            int i3 = (i2 ^ 103) + ((i2 & 103) << 1);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 != 0) {
                byte[] bArr3 = this.f963;
                throw null;
            }
            byte[] bArr4 = this.f963;
            int i4 = Camera2StreamConfigurationMap;
            int i5 = ((i4 | 29) << 1) - (i4 ^ 29);
            getInputFormats = i5 % 128;
            if (i5 % 2 != 0) {
                return bArr4;
            }
            throw null;
        }
        try {
            byte b = bArr[2];
            byte b2 = bArr[3];
            java.lang.Byte.valueOf(b);
            java.lang.Byte.valueOf(b2);
            byte b3 = bArr[2];
            byte b4 = bArr[3];
            boolean z2 = false;
            if ((b4 & 7) != 4) {
                int i6 = Camera2StreamConfigurationMap;
                int i7 = (i6 & 27) + (i6 | 27);
                getInputFormats = i7 % 128;
                if (i7 % 2 == 0) {
                    new java.lang.Object[0][1] = java.lang.Byte.valueOf(b4);
                } else {
                    java.lang.Byte.valueOf(b4);
                }
                return this.f965;
            }
            byte b5 = (byte) (b4 >> 3);
            util.h.xy.s.f[] m26871 = this.getOutputMinFrameDuration.m26871();
            int length = m26871.length;
            Camera2StreamConfigurationMap = (getInputFormats + 73) % 128;
            int i8 = 0;
            boolean z3 = false;
            while (true) {
                if (i8 >= length) {
                    z = z3;
                    break;
                }
                util.h.xy.s.f fVar = m26871[i8];
                byte m27208 = fVar.m27208();
                byte m27207 = fVar.m27207();
                java.lang.Byte.valueOf(m27208);
                java.lang.Byte.valueOf(m27207);
                if (fVar.m27208() == b5) {
                    getInputFormats = (Camera2StreamConfigurationMap + 25) % 128;
                    if (fVar.m27207() == b3) {
                        java.lang.String m25074 = util.h.xy.ar.b.m25074(fVar.m27210());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(m25074);
                        sb.append(util.h.xy.al.ra.f431);
                        bArr2 = util.h.xy.ar.b.m25076(sb.toString());
                        int i9 = getInputFormats;
                        Camera2StreamConfigurationMap = ((i9 & 75) + (i9 | 75)) % 128;
                        z2 = true;
                        break;
                    }
                    z3 = true;
                }
                i8++;
            }
            if (!z || z2) {
                if (z) {
                    return bArr2;
                }
                getInputFormats = (Camera2StreamConfigurationMap + 73) % 128;
                java.lang.Byte.valueOf(b5);
                return this.f964;
            }
            int i10 = getInputFormats;
            Camera2StreamConfigurationMap = ((i10 & 5) + (i10 | 5)) % 128;
            java.lang.Byte.valueOf(b3);
            java.lang.Byte.valueOf(b5);
            return this.f969;
        } catch (java.lang.Exception unused) {
            return this.f961;
        }
    }

    private static void getHighSpeedVideoSizes(int i, java.lang.String str, java.lang.Object[] objArr) {
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr = getHighSpeedVideoSizes;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr2[i2] = (char) (cArr[i2] ^ (-3299939579226817547L));
            }
            cArr = cArr2;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getHighResolutionOutputSizeshNQ4ISI);
        if (getInputSizeshNQ4ISI) {
            mdVar.f2642 = bytes.length;
            char[] cArr3 = new char[mdVar.f2642];
            mdVar.f2643 = 0;
            while (mdVar.f2643 < mdVar.f2642) {
                cArr3[mdVar.f2643] = (char) (cArr[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
                mdVar.f2643++;
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (getHighSpeedVideoSizesFor) {
            throw null;
        }
        throw null;
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ᐝ */
    protected byte[] mo25492(final byte[] bArr) {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 87) + ((i & 87) << 1);
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.f967 == null) {
                return this.f963;
            }
            new java.lang.Object[]{java.lang.Byte.valueOf(bArr[2])};
            try {
                byte[] m26872 = this.getOutputMinFrameDuration.m26872();
                byte[] m26878 = this.f967.m26878();
                byte[] m25090 = util.h.xy.ar.b.m25090(new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}, new byte[]{47}, util.h.xy.ar.b.m25090(new byte[]{-97, 39}, new byte[]{1}, new byte[]{0}));
                new java.lang.Object[]{util.h.xy.ar.b.m25074(m25090)};
                byte[] m250902 = util.h.xy.ar.b.m25090(new byte[]{-97, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE}, new byte[]{2}, new byte[]{0, 1});
                new java.lang.Object[]{m250902};
                byte[] bArr2 = {-97, 38};
                byte[] bArr3 = {8};
                byte[] bArr4 = new byte[8];
                int i3 = Camera2StreamConfigurationMap;
                getInputFormats = ((i3 & 91) + (i3 | 91)) % 128;
                try {
                    int i4 = -(android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    int identityHashCode = java.lang.System.identityHashCode(this);
                    int i5 = i4 * 46;
                    int i6 = (i5 ^ 5888) + ((i5 & 5888) << 1);
                    int i7 = ~identityHashCode;
                    int i8 = -(-(((~(i7 | (-129))) | i4) * (-90)));
                    int i9 = ~((identityHashCode & (-129)) | (identityHashCode ^ (-129)));
                    int i10 = ~(i4 | 128);
                    int i11 = (((i6 ^ i8) + ((i6 & i8) << 1)) - (~(-(-(((i9 ^ i10) | (i9 & i10)) * (-45)))))) - 1;
                    int i12 = ~((~i4) | identityHashCode);
                    int i13 = -(-(((i12 ^ (-129)) | (i12 & (-129)) | (~((i4 & i7) | (i7 ^ i4)))) * 45));
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((i11 & i13) + (i11 | i13), "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
                    ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr4);
                    byte[] m250903 = util.h.xy.ar.b.m25090(bArr2, bArr3, bArr4);
                    new java.lang.Object[]{m250903};
                    byte[] m250904 = util.h.xy.ar.b.m25090(new byte[]{-97, 16}, new byte[]{18}, getHighSpeedVideoSizes(bArr, m26872, m26878));
                    new java.lang.Object[]{util.h.xy.ar.b.m25074(m250904)};
                    byte[] m250905 = util.h.xy.ar.b.m25090(m250902, m250903, m250904);
                    new java.lang.Object[]{util.h.xy.ar.b.m25074(m250905)};
                    byte[] m250906 = util.h.xy.ar.b.m25090(new byte[]{-33, 75}, new byte[]{3}, new byte[]{0, 1, 0});
                    new java.lang.Object[]{util.h.xy.ar.b.m25074(m250906)};
                    byte[] m250907 = util.h.xy.ar.b.m25090(m25090, m250905, m250906, this.f962);
                    new java.lang.Object[]{util.h.xy.ar.b.m25074(m250907)};
                    this.f942.m25403(true);
                    this.f942.m25409();
                    util.h.xy.bf.ma.m25424(util.h.xy.bf.c.f934.m25413());
                    new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bi.ma.3
                        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                        private static int getHighSpeedVideoFpsRanges = 1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i14 = getHighResolutionOutputSizeshNQ4ISI + 83;
                            getHighSpeedVideoFpsRanges = i14 % 128;
                            try {
                            } catch (java.lang.Throwable th) {
                                util.h.xy.bi.ma.getHighSpeedVideoFpsRanges();
                                th.getMessage();
                                util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, util.h.xy.al.ra.f379);
                            }
                            if (i14 % 2 != 0) {
                                util.h.xy.bi.ma.this.m25499(bArr);
                                int i15 = getHighSpeedVideoFpsRanges;
                                getHighResolutionOutputSizeshNQ4ISI = ((i15 & 79) + (i15 | 79)) % 128;
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
                                return;
                            }
                            util.h.xy.bi.ma.this.m25499(bArr);
                            throw null;
                        }
                    }).start();
                    return m250907;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.lang.Exception unused) {
                return this.f961;
            }
        }
        util.h.xy.g.ra raVar = this.f967;
        throw null;
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˋ */
    protected com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25489(byte[] bArr, byte[] bArr2) {
        Camera2StreamConfigurationMap = (getInputFormats + 21) % 128;
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25496 = util.h.xy.bi.mb.f959.m25496(bArr, bArr2, this.getOutputMinFrameDuration.m26870().equalsIgnoreCase(util.h.xy.al.ra.f509));
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 91) + ((i & 91) << 1);
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return m25496;
        }
        throw null;
    }

    private byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        byte[] bArr4;
        byte[] bArr5;
        Camera2StreamConfigurationMap = (getInputFormats + 25) % 128;
        byte[] bArr6 = {bArr2[0], bArr2[1]};
        new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr6)};
        getInputFormats = (Camera2StreamConfigurationMap + 61) % 128;
        util.h.xy.ar.b.m25074(bArr2);
        util.h.xy.ar.b.m25074(bArr3);
        byte[] bArr7 = new byte[6];
        java.lang.System.arraycopy(bArr2, 2, bArr7, 0, 6);
        bArr7[0] = Byte.MIN_VALUE;
        bArr7[3] = 32;
        int i = 0;
        while (i < bArr3.length) {
            int i2 = Camera2StreamConfigurationMap;
            int i3 = (i2 & 111) + (i2 | 111);
            getInputFormats = i3 % 128;
            if (i3 % 2 == 0) {
                bArr7[i] = (byte) (bArr7[i] & bArr3[i]);
                i += 20;
            } else {
                bArr7[i] = (byte) (bArr7[i] & bArr3[i]);
                i++;
            }
        }
        int i4 = getInputFormats;
        Camera2StreamConfigurationMap = ((i4 ^ 21) + ((i4 & 21) << 1)) % 128;
        new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr7)};
        byte[] bArr8 = new byte[2];
        if (this.getOutputMinFrameDuration.m26870().equalsIgnoreCase(util.h.xy.al.ra.f509)) {
            int i5 = Camera2StreamConfigurationMap + 67;
            getInputFormats = i5 % 128;
            if (i5 % 2 == 0) {
                java.lang.System.arraycopy(bArr2, 105, bArr8, 0, 4);
            } else {
                java.lang.System.arraycopy(bArr2, 8, bArr8, 0, 2);
            }
            int i6 = getInputFormats;
            Camera2StreamConfigurationMap = (((i6 | 55) << 1) - (i6 ^ 55)) % 128;
            bArr5 = bArr8;
        } else {
            int i7 = getInputFormats;
            Camera2StreamConfigurationMap = ((i7 & 83) + (i7 | 83)) % 128;
            int i8 = (i7 ^ 29) + ((i7 & 29) << 1);
            Camera2StreamConfigurationMap = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = bArr[5];
                bArr4 = new byte[i9];
                java.lang.System.arraycopy(bArr, 2, bArr4, 0, i9);
            } else {
                int i10 = bArr[4];
                bArr4 = new byte[i10];
                java.lang.System.arraycopy(bArr, 5, bArr4, 0, i10);
            }
            int i11 = Camera2StreamConfigurationMap;
            getInputFormats = ((i11 & 43) + (i11 | 43)) % 128;
            byte[] bArr9 = new byte[8];
            java.lang.System.arraycopy(bArr4, 32, bArr9, 0, 8);
            bArr5 = new byte[2];
            java.lang.System.arraycopy(bArr4, 30, bArr5, 0, 2);
            byte[] bArr10 = new byte[2];
            java.lang.System.arraycopy(bArr4, 32, bArr10, 0, 2);
            if (java.util.Arrays.equals(bArr9, new byte[]{0, 0, 0, 0, 0, 0, 0, 0})) {
                int i12 = Camera2StreamConfigurationMap;
                getInputFormats = (i12 + 105) % 128;
                int i13 = i12 + 85;
                getInputFormats = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            } else {
                int i14 = Camera2StreamConfigurationMap;
                getInputFormats = (((i14 | 103) << 1) - (i14 ^ 103)) % 128;
                bArr5 = bArr10;
            }
        }
        new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr5)};
        byte[] bArr11 = {bArr2[10]};
        byte[] bArr12 = new byte[5];
        int i15 = (getInputFormats + 1) % 128;
        Camera2StreamConfigurationMap = i15;
        getInputFormats = (((i15 | 111) << 1) - (i15 ^ 111)) % 128;
        try {
            int i16 = -android.view.View.MeasureSpec.getSize(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((i16 ^ 127) + ((i16 & 127) << 1), "\u0092\u0091\u0090\u008f\u0082\u008e\u0086\u0089\u0088\u0087\u0086\u008d\u0084\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
            ((java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr12);
            new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr12)};
            byte[] bArr13 = {bArr2[16], bArr2[17]};
            new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr13)};
            return util.h.xy.ar.b.m25090(bArr6, bArr7, bArr5, bArr11, bArr12, bArr13);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizes = new char[]{64282, 64275, 64270, 64326, 64269, 64287, 64285, 64271, 64258, 64283, 64268, 64267, 64301, 64290, 64262, 64284, 64257, 64263};
        getHighResolutionOutputSizeshNQ4ISI = -1074857104;
        getHighSpeedVideoSizesFor = true;
        getInputSizeshNQ4ISI = true;
    }
}
