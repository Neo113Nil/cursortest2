package util.h.xy.bi;

/* loaded from: classes5.dex */
public class a extends util.h.xy.bi.ra {
    private static final java.lang.String Camera2StreamConfigurationMap = "a";
    private static int getHighSpeedVideoFpsRangesFor = 29;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.g.rc getHighResolutionOutputSizeshNQ4ISI;

    static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 83;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = Camera2StreamConfigurationMap;
        int i3 = i + 57;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public a(util.h.xy.g.b bVar, util.h.xy.bf.a aVar) {
        super(bVar, aVar);
        if (bVar == null || !(bVar instanceof util.h.xy.g.rc)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.g.rc) bVar;
    }

    @Override // util.h.xy.bf.b
    /* renamed from: ˋ */
    public java.lang.String mo25411() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 39) + (i | 39);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            return Camera2StreamConfigurationMap;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0133 A[Catch: Exception -> 0x0238, TRY_LEAVE, TryCatch #1 {Exception -> 0x0238, blocks: (B:3:0x0006, B:5:0x001b, B:11:0x002a, B:15:0x003e, B:17:0x0044, B:20:0x0066, B:22:0x0095, B:24:0x00a6, B:28:0x00c6, B:29:0x00cd, B:31:0x00d2, B:32:0x00d7, B:36:0x00da, B:37:0x0125, B:39:0x0133, B:43:0x0147, B:45:0x014d, B:47:0x0186, B:49:0x01a4, B:50:0x0209, B:57:0x0162, B:59:0x017a, B:61:0x0052, B:65:0x0063), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4 A[Catch: Exception -> 0x0238, TryCatch #1 {Exception -> 0x0238, blocks: (B:3:0x0006, B:5:0x001b, B:11:0x002a, B:15:0x003e, B:17:0x0044, B:20:0x0066, B:22:0x0095, B:24:0x00a6, B:28:0x00c6, B:29:0x00cd, B:31:0x00d2, B:32:0x00d7, B:36:0x00da, B:37:0x0125, B:39:0x0133, B:43:0x0147, B:45:0x014d, B:47:0x0186, B:49:0x01a4, B:50:0x0209, B:57:0x0162, B:59:0x017a, B:61:0x0052, B:65:0x0063), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a A[Catch: Exception -> 0x0238, TRY_ENTER, TryCatch #1 {Exception -> 0x0238, blocks: (B:3:0x0006, B:5:0x001b, B:11:0x002a, B:15:0x003e, B:17:0x0044, B:20:0x0066, B:22:0x0095, B:24:0x00a6, B:28:0x00c6, B:29:0x00cd, B:31:0x00d2, B:32:0x00d7, B:36:0x00da, B:37:0x0125, B:39:0x0133, B:43:0x0147, B:45:0x014d, B:47:0x0186, B:49:0x01a4, B:50:0x0209, B:57:0x0162, B:59:0x017a, B:61:0x0052, B:65:0x0063), top: B:2:0x0006 }] */
    @Override // util.h.xy.bi.ra
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected byte[] mo25490(byte[] bArr) {
        byte[] bArr2;
        int i;
        byte[] m26897;
        byte[] bArr3;
        byte[] copyOfRange;
        byte[] bArr4;
        byte[] m26895;
        byte[] m26888;
        byte[] bArr5;
        try {
            m26897 = this.getHighResolutionOutputSizeshNQ4ISI.m26897();
            bArr3 = new byte[0];
            copyOfRange = java.util.Arrays.copyOfRange(bArr, 5, bArr.length - 1);
        } catch (java.lang.Exception unused) {
            bArr2 = this.f961;
        }
        if (this.f967 == null) {
            byte[] bArr6 = this.f963;
            int i2 = getHighSpeedVideoFpsRangesFor + 115;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                return bArr6;
            }
            throw null;
        }
        if ((m26897[1] & 64) == 64) {
            int i3 = getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 65) + ((i3 & 65) << 1)) % 128;
            if (bArr[4] != 19) {
                byte[] bArr7 = this.f960;
                int i4 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = ((i4 & 77) + (i4 | 77)) % 128;
                return bArr7;
            }
        } else if (bArr[4] != 14) {
            int i5 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i5 & 99) + (i5 | 99)) % 128;
            return this.f960;
        }
        byte[] bArr8 = {com.visa.cbp.getEncExpo.IResultReceiver};
        byte[] bArr9 = {10};
        byte[] bArr10 = {-126};
        byte[] bArr11 = {2};
        byte[] bArr12 = {-108};
        byte[] bArr13 = {4};
        byte[] bArr14 = {-59};
        byte[] bArr15 = {1};
        byte[] bArr16 = {0, 0, 0, 0, 0};
        util.h.xy.ar.mb m25053 = util.h.xy.ar.a.m25053(copyOfRange, new byte[]{-125});
        if ((m26897[1] & 64) == 64) {
            byte[] copyOfRange2 = java.util.Arrays.copyOfRange(m25053.m25110(), 0, 5);
            if (!java.util.Arrays.equals(copyOfRange2, bArr16)) {
                int length = copyOfRange2.length;
                int identityHashCode = java.lang.System.identityHashCode(this);
                int i6 = length * (-756);
                int i7 = ~identityHashCode;
                int i8 = (((i6 ^ (-758)) + ((i6 & (-758)) << 1)) - (~(((i7 ^ (-1)) | i7) * (-757)))) - 1;
                int i9 = ~length;
                int i10 = ~i9;
                int i11 = i10 | i9;
                bArr4 = bArr8;
                int i12 = -(-((~((i11 ^ identityHashCode) | (i11 & identityHashCode))) * 1514));
                int i13 = ~(i9 | i7);
                int i14 = (i13 ^ i10) | (i13 & i10);
                int i15 = ~(identityHashCode | (identityHashCode ^ (-1)));
                bArr3 = java.util.Arrays.copyOfRange(copyOfRange2, 0, (i8 ^ i12) + ((i12 & i8) << 1) + (((i14 & i15) | (i14 ^ i15)) * 757));
                util.h.xy.ar.b.m25074(bArr3);
                util.h.xy.ar.b.m25074(m26897);
                if ((m26897[1] & 64) != 64) {
                    if ((m26897[0] & 2) == 2) {
                        int i16 = getHighSpeedVideoSizes;
                        getHighSpeedVideoFpsRangesFor = ((i16 ^ 121) + ((i16 & 121) << 1)) % 128;
                        if ((bArr3[1] & 4) == 4) {
                            m26895 = this.getHighResolutionOutputSizeshNQ4ISI.m26890();
                            m26888 = this.getHighResolutionOutputSizeshNQ4ISI.m26889();
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 113) % 128;
                        }
                    }
                    m26895 = this.getHighResolutionOutputSizeshNQ4ISI.m26895();
                    m26888 = this.getHighResolutionOutputSizeshNQ4ISI.m26888();
                    int i17 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor = ((i17 & 75) + (i17 | 75)) % 128;
                } else {
                    m26895 = this.getHighResolutionOutputSizeshNQ4ISI.m26895();
                    m26888 = this.getHighResolutionOutputSizeshNQ4ISI.m26888();
                }
                byte[] bArr17 = {0};
                byte[] m25090 = util.h.xy.ar.b.m25090(bArr10, bArr11, m26895);
                byte[] m250902 = util.h.xy.ar.b.m25090(bArr12, bArr13, m26888);
                if ((m26897[1] & 64) != 64) {
                    bArr5 = util.h.xy.ar.b.m25090(bArr14, bArr15, bArr17);
                    byte b = bArr9[0];
                    int identityHashCode2 = java.lang.System.identityHashCode(this);
                    int i18 = ~((b ^ (-4)) | (b & (-4)));
                    int i19 = ~((identityHashCode2 ^ (-4)) | (identityHashCode2 & (-4)));
                    int i20 = ((422 - (~(-(-(b * (-139)))))) - (~(((i18 ^ i19) | (i18 & i19)) * (-280)))) - 1;
                    int i21 = ~b;
                    int i22 = ~((i21 & identityHashCode2) | (i21 ^ identityHashCode2));
                    int i23 = ((i19 ^ i22) | (i19 & i22)) * 140;
                    int i24 = ~(i21 | (-4) | identityHashCode2);
                    int i25 = ~identityHashCode2;
                    int i26 = ~(b | (i25 & (-4)) | (i25 ^ (-4)));
                    int i27 = (i26 ^ i24) | (i26 & i24);
                    int i28 = i25 | i21;
                    int i29 = ~((i28 ^ 3) | (i28 & 3));
                    bArr9[0] = (byte) (((((i20 | i23) << 1) - (i20 ^ i23)) - (~(((i29 ^ i27) | (i27 & i29)) * 140))) - 1);
                } else {
                    bArr5 = null;
                }
                byte[] m250903 = util.h.xy.ar.b.m25090(bArr4, bArr9, util.h.xy.ar.b.m25090(m25090, m250902, bArr5));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(util.h.xy.ar.b.m25074(m250903));
                sb.append(util.h.xy.al.ra.f431);
                bArr2 = util.h.xy.ar.b.m25076(sb.toString());
                util.h.xy.ar.b.m25074(m250903);
                int i30 = getHighSpeedVideoSizes;
                i = ((i30 | 37) << 1) - (i30 ^ 37);
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    return bArr2;
                }
                throw new java.lang.ArithmeticException();
            }
            int i31 = getHighSpeedVideoFpsRangesFor;
            int i32 = ((i31 | 41) << 1) - (i31 ^ 41);
            getHighSpeedVideoSizes = i32 % 128;
            if (i32 % 2 != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.m26893();
                throw new java.lang.NullPointerException();
            }
            bArr3 = this.getHighResolutionOutputSizeshNQ4ISI.m26893();
        }
        bArr4 = bArr8;
        util.h.xy.ar.b.m25074(bArr3);
        util.h.xy.ar.b.m25074(m26897);
        if ((m26897[1] & 64) != 64) {
        }
        byte[] bArr172 = {0};
        byte[] m250904 = util.h.xy.ar.b.m25090(bArr10, bArr11, m26895);
        byte[] m2509022 = util.h.xy.ar.b.m25090(bArr12, bArr13, m26888);
        if ((m26897[1] & 64) != 64) {
        }
        byte[] m2509032 = util.h.xy.ar.b.m25090(bArr4, bArr9, util.h.xy.ar.b.m25090(m250904, m2509022, bArr5));
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(util.h.xy.ar.b.m25074(m2509032));
        sb2.append(util.h.xy.al.ra.f431);
        bArr2 = util.h.xy.ar.b.m25076(sb2.toString());
        util.h.xy.ar.b.m25074(m2509032);
        int i302 = getHighSpeedVideoSizes;
        i = ((i302 | 37) << 1) - (i302 ^ 37);
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
        }
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˊ, reason: contains not printable characters */
    protected byte[] mo25488(final byte[] bArr) {
        int i = getHighSpeedVideoFpsRangesFor + 3;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr);
            if (Camera2StreamConfigurationMap2 != null) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                int i3 = (i2 & 5) + (i2 | 5);
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    return Camera2StreamConfigurationMap2;
                }
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 19) % 128;
            byte[] m25076 = util.h.xy.ar.b.m25076(util.h.xy.al.ra.f551);
            int i4 = getHighSpeedVideoFpsRangesFor + 19;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.ar.b.m25074(m25076);
                this.f942.m25403(true);
                this.f942.m25409();
                util.h.xy.bf.ma.m25424(util.h.xy.bf.c.f934.m25413());
                new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bi.a.1
                    private static int getHighSpeedVideoFpsRangesFor = 0;
                    private static int getHighSpeedVideoSizes = 1;

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = getHighSpeedVideoSizes;
                        int i6 = ((i5 | 73) << 1) - (i5 ^ 73);
                        getHighSpeedVideoFpsRangesFor = i6 % 128;
                        try {
                        } catch (java.lang.Throwable th) {
                            util.h.xy.bi.a.getHighResolutionOutputSizeshNQ4ISI();
                            th.getMessage();
                            util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, util.h.xy.al.ra.f379);
                        }
                        if (i6 % 2 == 0) {
                            util.h.xy.bi.a.this.m25499(bArr);
                            int i7 = getHighSpeedVideoSizes;
                            getHighSpeedVideoFpsRangesFor = ((i7 ^ 15) + ((i7 & 15) << 1)) % 128;
                            return;
                        }
                        util.h.xy.bi.a.this.m25499(bArr);
                        throw new java.lang.NullPointerException();
                    }
                }).start();
                int i5 = getHighSpeedVideoSizes;
                int i6 = (i5 & 5) + (i5 | 5);
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 != 0) {
                    return m25076;
                }
                throw null;
            }
            throw null;
        }
        Camera2StreamConfigurationMap(bArr);
        throw null;
    }

    private byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 23) << 1) - (i ^ 23)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (bArr.length < 5) {
            int i3 = i2 + 17;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                return new byte[]{106, Byte.MIN_VALUE};
            }
            int length2 = bArr.length;
            throw new java.lang.ArithmeticException();
        }
        if (bArr[2] == 0) {
            int i4 = i + 5;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0 ? bArr[3] == 0 : bArr[5] == 0) {
                if (bArr[4] != 27) {
                    int i5 = (i + 103) % 128;
                    getHighSpeedVideoFpsRangesFor = i5;
                    byte[] bArr2 = {103, 0};
                    getHighSpeedVideoSizes = (i5 + 73) % 128;
                    return bArr2;
                }
                if (bArr.length != 33) {
                    int i6 = (i ^ 75) + ((i & 75) << 1);
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        return new byte[]{106, Byte.MIN_VALUE};
                    }
                    throw null;
                }
                try {
                    util.h.xy.bi.mb.f959.m25495(this.getHighSpeedVideoFpsRanges, bArr);
                    int i7 = getHighSpeedVideoFpsRangesFor;
                    int i8 = (i7 ^ 49) + ((i7 & 49) << 1);
                    getHighSpeedVideoSizes = i8 % 128;
                    if (i8 % 2 == 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Exception e) {
                    e.getMessage();
                    return new byte[]{105, -123};
                }
            }
        }
        return new byte[]{106, -122};
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    protected byte[] mo25491(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 117) + (i | 117)) % 128;
        if (this.f967 == null) {
            return this.f963;
        }
        try {
            byte b = bArr[2];
            byte b2 = bArr[3];
            java.lang.Byte.valueOf(b);
            java.lang.Byte.valueOf(b2);
            byte b3 = bArr[2];
            byte b4 = bArr[3];
            if ((b4 & 7) != 4) {
                int i2 = getHighSpeedVideoSizes;
                int i3 = (i2 & 85) + (i2 | 85);
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    new java.lang.Object[1][1] = java.lang.Byte.valueOf(b4);
                } else {
                    java.lang.Byte.valueOf(b4);
                }
                bArr2 = this.f965;
            } else {
                byte b5 = (byte) (b4 >> 3);
                util.h.xy.s.f[] m26896 = this.getHighResolutionOutputSizeshNQ4ISI.m26896();
                int length = m26896.length;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                boolean z = false;
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    if (i4 >= length) {
                        bArr3 = null;
                        break;
                    }
                    int i5 = getHighSpeedVideoSizes;
                    getHighSpeedVideoFpsRangesFor = (((i5 | 3) << 1) - (i5 ^ 3)) % 128;
                    util.h.xy.s.f fVar = m26896[i4];
                    byte m27208 = fVar.m27208();
                    byte m27207 = fVar.m27207();
                    java.lang.Byte.valueOf(m27208);
                    java.lang.Byte.valueOf(m27207);
                    if (fVar.m27208() == b5) {
                        if (fVar.m27207() == b3) {
                            java.lang.String m25074 = util.h.xy.ar.b.m25074(fVar.m27210());
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(m25074);
                            sb.append(util.h.xy.al.ra.f431);
                            bArr3 = util.h.xy.ar.b.m25076(sb.toString());
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    i4++;
                }
                if (z2 && !z) {
                    int i6 = getHighSpeedVideoFpsRangesFor;
                    int i7 = ((i6 | 21) << 1) - (i6 ^ 21);
                    getHighSpeedVideoSizes = i7 % 128;
                    if (i7 % 2 == 0) {
                        java.lang.Byte.valueOf(b3);
                        java.lang.Byte.valueOf(b5);
                    }
                    bArr2 = this.f969;
                } else if (z2) {
                    bArr2 = bArr3;
                } else {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 75) % 128;
                    java.lang.Byte.valueOf(b5);
                    bArr2 = this.f964;
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                }
            }
        } catch (java.lang.Exception unused) {
            bArr2 = this.f961;
        }
        int i8 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i8 & 1) + (i8 | 1)) % 128;
        return bArr2;
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ᐝ, reason: contains not printable characters */
    protected byte[] mo25492(final byte[] bArr) {
        byte[] bArr2;
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i ^ 113) + ((i & 113) << 1)) % 128;
        if (this.f967 == null) {
            int i2 = getHighSpeedVideoSizes;
            int i3 = (i2 & 75) + (i2 | 75);
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 == 0) {
                byte[] bArr3 = this.f963;
                throw new java.lang.ArithmeticException();
            }
            byte[] bArr4 = this.f963;
            int i4 = getHighSpeedVideoFpsRangesFor + 61;
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                return bArr4;
            }
            throw null;
        }
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.m26894();
            this.f967.m26878();
            byte[] m25090 = util.h.xy.ar.b.m25090(new byte[]{com.visa.cbp.getEncExpo.IResultReceiver}, new byte[]{kotlin.io.encoding.Base64.padSymbol}, util.h.xy.ar.b.m25090(new byte[]{-97, 39}, new byte[]{1}, new byte[]{0}));
            new java.lang.Object[]{util.h.xy.ar.b.m25074(m25090)};
            byte[] m250902 = util.h.xy.ar.b.m25090(new byte[]{-97, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE}, new byte[]{2}, new byte[]{0, 1});
            new java.lang.Object[]{m250902};
            byte[] m250903 = util.h.xy.ar.b.m25090(new byte[]{-97, 38}, new byte[]{8}, new byte[8]);
            new java.lang.Object[]{m250903};
            byte[] m250904 = util.h.xy.ar.b.m25090(new byte[]{-97, 16}, new byte[]{32}, this.getHighResolutionOutputSizeshNQ4ISI.m26894());
            new java.lang.Object[]{util.h.xy.ar.b.m25074(m250904)};
            byte[] m250905 = util.h.xy.ar.b.m25090(m250902, m250903, m250904);
            new java.lang.Object[]{util.h.xy.ar.b.m25074(m250905)};
            byte[] m250906 = util.h.xy.ar.b.m25090(new byte[]{-33, 75}, new byte[]{3}, new byte[]{0, 1, 0});
            new java.lang.Object[]{util.h.xy.ar.b.m25074(m250906)};
            bArr2 = util.h.xy.ar.b.m25090(m25090, m250905, m250906, this.f962);
            new java.lang.Object[]{util.h.xy.ar.b.m25074(bArr2)};
            this.f942.m25403(true);
            this.f942.m25409();
            util.h.xy.bf.ma.m25424(util.h.xy.bf.c.f934.m25413());
            new java.lang.Thread(new java.lang.Runnable() { // from class: util.h.xy.bi.a.4
                private static int getHighResolutionOutputSizeshNQ4ISI = 1;
                private static int getHighSpeedVideoFpsRangesFor;

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = getHighResolutionOutputSizeshNQ4ISI;
                    int i6 = (i5 ^ 1) + ((i5 & 1) << 1);
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    try {
                    } catch (java.lang.Throwable th) {
                        util.h.xy.bi.a.getHighResolutionOutputSizeshNQ4ISI();
                        th.getMessage();
                        util.h.xy.bf.ma.m25415(util.h.xy.bf.c.f934.m25413(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.PAYMENT_WRONG_STATE, util.h.xy.al.ra.f379);
                    }
                    if (i6 % 2 == 0) {
                        util.h.xy.bi.a.this.m25499(bArr);
                        int i7 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = (((i7 | 37) << 1) - (i7 ^ 37)) % 128;
                        return;
                    }
                    util.h.xy.bi.a.this.m25499(bArr);
                    throw new java.lang.NullPointerException();
                }
            }).start();
        } catch (java.lang.Exception unused) {
            bArr2 = this.f961;
        }
        int i5 = getHighSpeedVideoSizes;
        int i6 = (i5 & 19) + (i5 | 19);
        getHighSpeedVideoFpsRangesFor = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr2;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.bi.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    protected com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25489(byte[] bArr, byte[] bArr2) {
        int i = getHighSpeedVideoFpsRangesFor;
        boolean z = true;
        int i2 = ((i ^ 25) + ((i & 25) << 1)) % 128;
        getHighSpeedVideoSizes = i2;
        util.h.xy.g.rc rcVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!(rcVar instanceof util.h.xy.g.mb)) {
            if ((rcVar.m26897()[0] & 64) == 64) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            } else {
                z = false;
            }
            return util.h.xy.bi.mb.f959.m25498(bArr, bArr2, z);
        }
        int i3 = i2 + 125;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return util.h.xy.bi.mb.f959.m25495(bArr, bArr2);
        }
        util.h.xy.bi.mb.f959.m25495(bArr, bArr2);
        throw null;
    }
}
