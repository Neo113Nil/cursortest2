package util.h.xy.q;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizes ^ (-7508379876853140581L));
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

    static {
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.q.b.class.getName();
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 27) + ((i & 27) << 1)) % 128;
    }

    private b() {
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRanges;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getHighSpeedVideoFpsRanges;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr4);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @util.h.xy.a.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m27054(byte[] bArr) throws util.h.xy.ab.ma {
        int i = Camera2StreamConfigurationMap;
        int i2 = (((i | 13) << 1) - (i ^ 13)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (bArr != null) {
            int i3 = (i2 ^ 105) + ((i2 & 105) << 1);
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
            if (bArr.length != 0) {
                util.h.xy.aw.b bVar = new util.h.xy.aw.b();
                util.h.xy.aw.ra.m25249(bArr, bVar, bArr.length);
                byte[] m25241 = bVar.m25241();
                byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                byte[] m24550 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI, m25241);
                byte[] m25090 = util.h.xy.ar.b.m25090(m25241, m24550);
                byte[] bArr2 = new byte[m25090.length];
                java.lang.System.arraycopy(m25090, 0, bArr2, 0, m25090.length);
                util.h.xy.ar.b.m25098(bArr);
                util.h.xy.ar.b.m25074(m25241);
                util.h.xy.ar.b.m25074(m24550);
                util.h.xy.ar.b.m25074(bArr2);
                util.h.xy.ar.b.m25100(m25241, highResolutionOutputSizeshNQ4ISI, m24550, m25090);
                int i4 = getHighSpeedVideoFpsRangesFor + 57;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    return bArr2;
                }
                throw null;
            }
        }
        throw new util.h.xy.ab.ma(util.h.xy.al.ra.f811);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27056(byte[] bArr) throws util.h.xy.ab.ma {
        int i = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = ((i ^ 33) + ((i & 33) << 1)) % 128;
        if (bArr != null) {
            Camera2StreamConfigurationMap = ((i ^ 95) + ((i & 95) << 1)) % 128;
            if (bArr.length != 0) {
                byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                byte[] m24550 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI, bArr);
                byte[] m25090 = util.h.xy.ar.b.m25090(bArr, m24550);
                byte[] bArr2 = new byte[m25090.length];
                java.lang.System.arraycopy(m25090, 0, bArr2, 0, m25090.length);
                util.h.xy.ar.b.m25098(bArr);
                util.h.xy.ar.b.m25074(bArr);
                util.h.xy.ar.b.m25074(m24550);
                util.h.xy.ar.b.m25074(bArr2);
                util.h.xy.ar.b.m25100(bArr, highResolutionOutputSizeshNQ4ISI, m24550, m25090);
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
                return bArr2;
            }
        }
        throw new util.h.xy.ab.ma(util.h.xy.al.ra.f811);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0434 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0437  */
    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m27053(boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, int i2, byte[] bArr6, byte[] bArr7, byte[] bArr8, boolean z2, byte[] bArr9, byte[] bArr10) throws util.h.xy.ab.ma, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        boolean z3;
        byte[] m25089;
        byte[] bArr11;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte[] bArr12;
        byte[] bArr13;
        byte[] bArr14;
        byte[] m25090;
        int i9;
        byte[] bArr15;
        byte[] bArr16;
        byte[] bArr17;
        byte[] bArr18;
        byte[] bArr19;
        byte[] m25024;
        int i10;
        int i11;
        int i12;
        int length;
        int i13 = (Camera2StreamConfigurationMap + 81) % 128;
        getHighSpeedVideoFpsRangesFor = i13;
        if (bArr != null) {
            Camera2StreamConfigurationMap = (i13 + 85) % 128;
            z3 = true;
        } else {
            z3 = false;
        }
        if (bArr6 != null) {
            int i14 = Camera2StreamConfigurationMap;
            int i15 = ((i14 | 3) << 1) - (i14 ^ 3);
            getHighSpeedVideoFpsRangesFor = i15 % 128;
            if (i15 % 2 != 0) {
                int length2 = bArr6.length;
                throw null;
            }
            if (bArr6.length != 0) {
                m25089 = new byte[bArr6.length];
                java.lang.System.arraycopy(bArr6, 0, m25089, 0, bArr6.length);
                byte[] bArr20 = m25089;
                int i16 = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRangesFor = ((i16 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i16 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                bArr11 = new byte[24];
                java.lang.System.arraycopy(bArr7, 0, bArr11, 0, bArr7.length);
                int length3 = bArr7.length;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                int i17 = length3 * 1773;
                int i18 = ~length3;
                int i19 = (~((~i18) | i18)) | (~((currentTimeMillis ^ (-1)) | currentTimeMillis));
                int i20 = ~currentTimeMillis;
                int i21 = ~(i20 | length3);
                int i22 = -(-(((i19 & i21) | (i19 ^ i21)) * 886));
                int i23 = ((i17 | i22) << 1) - (i22 ^ i17);
                int i24 = -(-(((~i20) | length3) * (-1772)));
                int i25 = (i23 & i24) + (i24 | i23);
                int i26 = -(-((~((length3 & i20) | (length3 ^ i20))) * 886));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                java.lang.System.arraycopy(bArr20, 0, bArr11, i27, bArr20.length);
                int length4 = bArr20.length;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i28 = (length4 * 450) + (i27 * (-448));
                int i29 = ~length4;
                int i30 = ~((i29 & i27) | (i29 ^ i27));
                int i31 = ~i27;
                int i32 = (i31 ^ length4) | (i31 & length4);
                int i33 = ~((i32 & currentTimeMillis2) | (i32 ^ currentTimeMillis2));
                int i34 = -(-(((i30 & i33) | (i33 ^ i30)) * 449));
                int i35 = (((i28 & i34) + (i28 | i34)) - (~(i30 * (-1347)))) - 1;
                int i36 = ~currentTimeMillis2;
                int i37 = (i31 ^ i36) | (i36 & i31);
                int i38 = ~((length4 ^ i37) | (length4 & i37));
                int i39 = ((i38 ^ i30) | (i38 & i30)) * 449;
                i3 = 1;
                i4 = (i35 | i39) << 1;
                i5 = i39 ^ i35;
                loop0: while (true) {
                    i6 = i4 - i5;
                    while (i6 < 22) {
                        int i40 = Camera2StreamConfigurationMap;
                        int i41 = ((i40 | 13) << i3) - (i40 ^ 13);
                        getHighSpeedVideoFpsRangesFor = i41 % 128;
                        int i42 = i41 % 2;
                        length = bArr7.length;
                        if (i42 != 0) {
                            byte b = bArr7[i6 - length];
                            bArr11[i6] = (byte) (((~b) & 78) | (b & (-79)));
                            int i43 = (i6 ^ (-18)) + ((i6 & (-18)) << 1);
                            i6 = (i43 & 126) + (i43 | 126);
                            i3 = 1;
                        }
                    }
                    byte b2 = bArr7[i6 % length];
                    bArr11[i6] = (byte) (((~b2) & 47) | (b2 & (-48)));
                    int i44 = (i6 & (-79)) + (i6 | (-79));
                    i4 = (i44 | 80) << 1;
                    i5 = i44 ^ 80;
                    i3 = 1;
                }
                int i45 = getHighSpeedVideoFpsRangesFor;
                i7 = (i45 & 53) + (i45 | 53);
                Camera2StreamConfigurationMap = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                util.h.xy.aw.b bVar = new util.h.xy.aw.b();
                util.h.xy.aw.ra.m25249(bArr11, bVar, 42);
                byte[] m25241 = bVar.m25241();
                byte[] bArr21 = {(byte) ((i & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (i & 255)};
                byte[] m250902 = util.h.xy.ar.b.m25090(bArr21, m25241);
                byte[] bArr22 = {(byte) ((i2 & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8), (byte) (i2 & 255)};
                byte[] bArr23 = new byte[bArr2.length];
                byte[] bArr24 = new byte[16];
                if (z2) {
                    int i46 = Camera2StreamConfigurationMap;
                    int i47 = ((i46 ^ 77) + ((i46 & 77) << 1)) % 128;
                    getHighSpeedVideoFpsRangesFor = i47;
                    Camera2StreamConfigurationMap = (((i47 | 25) << 1) - (i47 ^ 25)) % 128;
                    bArr12 = new byte[]{32};
                    i8 = 0;
                } else {
                    i8 = 0;
                    bArr12 = new byte[]{16};
                }
                if (z) {
                    bArr13 = bArr;
                    if (z2 && z3) {
                        java.lang.System.arraycopy(bArr13, i8, bArr23, i8, bArr13.length);
                    }
                } else {
                    bArr13 = bArr;
                    java.lang.System.arraycopy(bArr13, i8, bArr23, i8, bArr13.length);
                    if (bArr3 != null) {
                        java.lang.System.arraycopy(bArr3, i8, bArr24, i8, 16);
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 51) % 128;
                    } else {
                        bArr14 = null;
                        if (z) {
                            m25090 = util.h.xy.ar.b.m25090(bArr13, bArr2, bArr8, bArr3, m250902);
                            int i48 = getHighSpeedVideoFpsRangesFor;
                            Camera2StreamConfigurationMap = ((i48 ^ 115) + ((i48 & 115) << 1)) % 128;
                        } else if (z2 && z3) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 37) % 128;
                            m25090 = util.h.xy.ar.b.m25090(bArr2, bArr13, bArr8, bArr4, m250902);
                        } else {
                            m25090 = util.h.xy.ar.b.m25090(bArr2, bArr8, bArr4, m250902);
                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 5) % 128;
                        }
                        byte[] bArr25 = m25090;
                        util.h.xy.ar.b.m25098(bArr25);
                        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                        byte[] m24550 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI, bArr25);
                        i9 = getHighSpeedVideoFpsRangesFor + 105;
                        int i49 = i9 % 128;
                        Camera2StreamConfigurationMap = i49;
                        if (i9 % 2 != 0) {
                            throw null;
                        }
                        if (!z) {
                            bArr15 = m24550;
                            bArr16 = bArr22;
                            bArr17 = highResolutionOutputSizeshNQ4ISI;
                            bArr18 = bArr20;
                            bArr19 = bArr25;
                            byte[][] bArr26 = {new byte[]{2}, new byte[]{3}, new byte[]{4}, new byte[]{19}, new byte[]{1}, new byte[]{5}, new byte[]{com.google.common.base.Ascii.SYN}};
                            byte[][] bArr27 = {bArr, bArr2, bArr8, bArr14, m250902, bArr12, bArr10};
                            m25024 = util.h.xy.al.rd.m25024(bArr26, bArr27);
                            getHighSpeedVideoFpsRangesFor(bArr27, m25024, bArr26);
                            int i50 = getHighSpeedVideoFpsRangesFor;
                            i10 = i50 ^ 73;
                            i11 = (i50 & 73) << 1;
                        } else {
                            if (bArr13 != null) {
                                getHighSpeedVideoFpsRangesFor = ((i49 ^ 59) + ((i49 & 59) << 1)) % 128;
                                byte[][] bArr28 = {new byte[]{3}, new byte[]{2}, new byte[]{4}, new byte[]{17}, new byte[]{18}, new byte[]{1}, new byte[]{5}, new byte[]{16}, new byte[]{com.google.common.base.Ascii.DC4}, new byte[]{com.google.common.base.Ascii.SYN}};
                                bArr16 = bArr22;
                                bArr17 = highResolutionOutputSizeshNQ4ISI;
                                bArr18 = bArr20;
                                bArr15 = m24550;
                                bArr19 = bArr25;
                                byte[][] bArr29 = {bArr2, bArr, bArr8, bArr5, bArr4, m250902, bArr12, bArr9, bArr16, bArr10};
                                m25024 = util.h.xy.al.rd.m25024(bArr28, bArr29);
                                getHighSpeedVideoFpsRangesFor(bArr29, m25024, bArr28);
                                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 85) % 128;
                                int i51 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = ((i51 & 75) + (i51 | 75)) % 128;
                                byte[] m250903 = util.h.xy.ar.b.m25090(bArr15, m25024);
                                util.h.xy.ar.b.m25098(bArr);
                                util.h.xy.ar.b.m25098(bArr2);
                                util.h.xy.ar.b.m25098(bArr8);
                                util.h.xy.ar.b.m25074(bArr5);
                                util.h.xy.ar.b.m25074(bArr4);
                                util.h.xy.ar.b.m25074(bArr14);
                                util.h.xy.ar.b.m25074(bArr21);
                                util.h.xy.ar.b.m25098(bArr18);
                                util.h.xy.ar.b.m25098(bArr7);
                                util.h.xy.ar.b.m25074(bVar.m25241());
                                util.h.xy.ar.b.m25074(bArr12);
                                util.h.xy.ar.b.m25074(bArr9);
                                util.h.xy.ar.b.m25074(bArr16);
                                util.h.xy.ar.b.m25074(bArr10);
                                util.h.xy.ar.b.m25098(bArr19);
                                util.h.xy.ar.b.m25074(bArr17);
                                util.h.xy.ar.b.m25074(bArr15);
                                util.h.xy.ar.b.m25074(m250903);
                                int i52 = getHighSpeedVideoFpsRangesFor;
                                i12 = (i52 ^ 15) + ((i52 & 15) << 1);
                                Camera2StreamConfigurationMap = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return m250903;
                                }
                                throw null;
                            }
                            bArr15 = m24550;
                            bArr16 = bArr22;
                            bArr17 = highResolutionOutputSizeshNQ4ISI;
                            bArr18 = bArr20;
                            bArr19 = bArr25;
                            byte[][] bArr30 = {new byte[]{3}, new byte[]{4}, new byte[]{17}, new byte[]{18}, new byte[]{1}, new byte[]{5}, new byte[]{16}, new byte[]{com.google.common.base.Ascii.DC4}, new byte[]{com.google.common.base.Ascii.SYN}};
                            byte[][] bArr31 = {bArr2, bArr8, bArr5, bArr4, m250902, bArr12, bArr9, bArr16, bArr10};
                            m25024 = util.h.xy.al.rd.m25024(bArr30, bArr31);
                            getHighSpeedVideoFpsRangesFor(bArr31, m25024, bArr30);
                            int i53 = getHighSpeedVideoFpsRangesFor;
                            i10 = i53 & 43;
                            i11 = i53 | 43;
                        }
                        Camera2StreamConfigurationMap = (i10 + i11) % 128;
                        int i512 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = ((i512 & 75) + (i512 | 75)) % 128;
                        byte[] m2509032 = util.h.xy.ar.b.m25090(bArr15, m25024);
                        util.h.xy.ar.b.m25098(bArr);
                        util.h.xy.ar.b.m25098(bArr2);
                        util.h.xy.ar.b.m25098(bArr8);
                        util.h.xy.ar.b.m25074(bArr5);
                        util.h.xy.ar.b.m25074(bArr4);
                        util.h.xy.ar.b.m25074(bArr14);
                        util.h.xy.ar.b.m25074(bArr21);
                        util.h.xy.ar.b.m25098(bArr18);
                        util.h.xy.ar.b.m25098(bArr7);
                        util.h.xy.ar.b.m25074(bVar.m25241());
                        util.h.xy.ar.b.m25074(bArr12);
                        util.h.xy.ar.b.m25074(bArr9);
                        util.h.xy.ar.b.m25074(bArr16);
                        util.h.xy.ar.b.m25074(bArr10);
                        util.h.xy.ar.b.m25098(bArr19);
                        util.h.xy.ar.b.m25074(bArr17);
                        util.h.xy.ar.b.m25074(bArr15);
                        util.h.xy.ar.b.m25074(m2509032);
                        int i522 = getHighSpeedVideoFpsRangesFor;
                        i12 = (i522 ^ 15) + ((i522 & 15) << 1);
                        Camera2StreamConfigurationMap = i12 % 128;
                        if (i12 % 2 == 0) {
                        }
                    }
                }
                bArr14 = bArr24;
                if (z) {
                }
                byte[] bArr252 = m25090;
                util.h.xy.ar.b.m25098(bArr252);
                byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
                byte[] m245502 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI2, bArr252);
                i9 = getHighSpeedVideoFpsRangesFor + 105;
                int i492 = i9 % 128;
                Camera2StreamConfigurationMap = i492;
                if (i9 % 2 != 0) {
                }
            }
        }
        byte[] bArr32 = new byte[4];
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        for (int i54 = 0; i54 < 4; i54 = (i54 ^ 1) + ((i54 & 1) << 1)) {
            bArr32[i54] = 48;
        }
        m25089 = util.h.xy.ar.b.m25089(bArr32, bArr7);
        byte[] bArr202 = m25089;
        int i162 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i162 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + (i162 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
        bArr11 = new byte[24];
        java.lang.System.arraycopy(bArr7, 0, bArr11, 0, bArr7.length);
        int length32 = bArr7.length;
        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
        int i172 = length32 * 1773;
        int i182 = ~length32;
        int i192 = (~((~i182) | i182)) | (~((currentTimeMillis3 ^ (-1)) | currentTimeMillis3));
        int i202 = ~currentTimeMillis3;
        int i212 = ~(i202 | length32);
        int i222 = -(-(((i192 & i212) | (i192 ^ i212)) * 886));
        int i232 = ((i172 | i222) << 1) - (i222 ^ i172);
        int i242 = -(-(((~i202) | length32) * (-1772)));
        int i252 = (i232 & i242) + (i242 | i232);
        int i262 = -(-((~((length32 & i202) | (length32 ^ i202))) * 886));
        int i272 = (i252 ^ i262) + ((i262 & i252) << 1);
        java.lang.System.arraycopy(bArr202, 0, bArr11, i272, bArr202.length);
        int length42 = bArr202.length;
        int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
        int i282 = (length42 * 450) + (i272 * (-448));
        int i292 = ~length42;
        int i302 = ~((i292 & i272) | (i292 ^ i272));
        int i312 = ~i272;
        int i322 = (i312 ^ length42) | (i312 & length42);
        int i332 = ~((i322 & currentTimeMillis22) | (i322 ^ currentTimeMillis22));
        int i342 = -(-(((i302 & i332) | (i332 ^ i302)) * 449));
        int i352 = (((i282 & i342) + (i282 | i342)) - (~(i302 * (-1347)))) - 1;
        int i362 = ~currentTimeMillis22;
        int i372 = (i312 ^ i362) | (i362 & i312);
        int i382 = ~((length42 ^ i372) | (length42 & i372));
        int i392 = ((i382 ^ i302) | (i382 & i302)) * 449;
        i3 = 1;
        i4 = (i352 | i392) << 1;
        i5 = i392 ^ i352;
        loop0: while (true) {
            i6 = i4 - i5;
            while (i6 < 22) {
            }
            byte b22 = bArr7[i6 % length];
            bArr11[i6] = (byte) (((~b22) & 47) | (b22 & (-48)));
            int i442 = (i6 & (-79)) + (i6 | (-79));
            i4 = (i442 | 80) << 1;
            i5 = i442 ^ 80;
            i3 = 1;
        }
        int i452 = getHighSpeedVideoFpsRangesFor;
        i7 = (i452 & 53) + (i452 | 53);
        Camera2StreamConfigurationMap = i7 % 128;
        if (i7 % 2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0163  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m27057(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10, byte[] bArr11, byte[] bArr12) throws util.h.xy.ab.ma {
        byte[] m25089;
        int i2;
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = i3 + 121;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (bArr7 != null) {
            int i5 = i3 + 71;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                int length = bArr7.length;
                throw new java.lang.ArithmeticException();
            }
            if (bArr7.length != 0) {
                m25089 = new byte[bArr7.length];
                java.lang.System.arraycopy(bArr7, 0, m25089, 0, bArr7.length);
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 1) % 128;
                byte[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr8, m25089);
                util.h.xy.ar.b.m25098(Camera2StreamConfigurationMap2);
                util.h.xy.aw.b bVar = new util.h.xy.aw.b();
                util.h.xy.aw.ra.m25249(Camera2StreamConfigurationMap2, bVar, 42);
                byte[] bArr13 = {(byte) ((65280 & i) >> 8), (byte) (i & 255)};
                byte[] m25090 = util.h.xy.ar.b.m25090(bArr13, bVar.m25241());
                byte[] m250902 = util.h.xy.ar.b.m25090(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr9, m25090);
                util.h.xy.ar.b.m25098(m25090);
                util.h.xy.ar.b.m25098(bArr2);
                util.h.xy.ar.b.m25098(bArr);
                util.h.xy.ar.b.m25098(bArr3);
                util.h.xy.ar.b.m25098(bArr4);
                util.h.xy.ar.b.m25098(bArr5);
                util.h.xy.ar.b.m25098(bArr6);
                util.h.xy.ar.b.m25098(m250902);
                byte[] m250903 = util.h.xy.ar.b.m25090(m25090, bArr11);
                byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                byte[] m24550 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI, m250902);
                util.h.xy.ar.b.m25074(highResolutionOutputSizeshNQ4ISI);
                util.h.xy.ar.b.m25074(m24550);
                byte[] m250904 = util.h.xy.ar.b.m25090(m24550, getHighSpeedVideoSizes(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr9, m250903, bArr10, bArr12));
                util.h.xy.ar.b.m25098(bArr);
                util.h.xy.ar.b.m25098(bArr2);
                util.h.xy.ar.b.m25098(bArr9);
                util.h.xy.ar.b.m25074(bArr13);
                if (m25089 != null) {
                    int i6 = Camera2StreamConfigurationMap + 37;
                    getHighSpeedVideoFpsRangesFor = i6 % 128;
                    if (i6 % 2 != 0) {
                        util.h.xy.ar.b.m25098(m25089);
                        throw new java.lang.ArithmeticException();
                    }
                    util.h.xy.ar.b.m25098(m25089);
                    int i7 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRangesFor = (((i7 | 59) << 1) - (i7 ^ 59)) % 128;
                }
                if (bArr8 != null) {
                    int i8 = getHighSpeedVideoFpsRangesFor;
                    int i9 = ((i8 | 95) << 1) - (i8 ^ 95);
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 == 0) {
                        util.h.xy.ar.b.m25098(bArr8);
                        throw null;
                    }
                    util.h.xy.ar.b.m25098(bArr8);
                }
                int i10 = getHighSpeedVideoFpsRangesFor;
                i2 = (i10 ^ 111) + ((i10 & 111) << 1);
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ar.b.m25074(bVar.m25241());
                    throw null;
                }
                util.h.xy.ar.b.m25074(bVar.m25241());
                util.h.xy.ar.b.m25074(m250903);
                util.h.xy.ar.b.m25098(m250902);
                util.h.xy.ar.b.m25074(highResolutionOutputSizeshNQ4ISI);
                util.h.xy.ar.b.m25074(m24550);
                util.h.xy.ar.b.m25074(m250904);
                int i11 = getHighSpeedVideoFpsRangesFor;
                int i12 = ((i11 | 23) << 1) - (i11 ^ 23);
                Camera2StreamConfigurationMap = i12 % 128;
                if (i12 % 2 != 0) {
                    return m250904;
                }
                throw null;
            }
        }
        byte[] bArr14 = new byte[4];
        int i13 = 0;
        while (i13 < 4) {
            bArr14[i13] = 48;
            int i14 = (i13 ^ 87) + ((i13 & 87) << 1);
            i13 = ((i14 | (-86)) << 1) - (i14 ^ (-86));
        }
        m25089 = util.h.xy.ar.b.m25089(bArr14, bArr8);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 1) % 128;
        byte[] Camera2StreamConfigurationMap22 = Camera2StreamConfigurationMap(bArr8, m25089);
        util.h.xy.ar.b.m25098(Camera2StreamConfigurationMap22);
        util.h.xy.aw.b bVar2 = new util.h.xy.aw.b();
        util.h.xy.aw.ra.m25249(Camera2StreamConfigurationMap22, bVar2, 42);
        byte[] bArr132 = {(byte) ((65280 & i) >> 8), (byte) (i & 255)};
        byte[] m250905 = util.h.xy.ar.b.m25090(bArr132, bVar2.m25241());
        byte[] m2509022 = util.h.xy.ar.b.m25090(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr9, m250905);
        util.h.xy.ar.b.m25098(m250905);
        util.h.xy.ar.b.m25098(bArr2);
        util.h.xy.ar.b.m25098(bArr);
        util.h.xy.ar.b.m25098(bArr3);
        util.h.xy.ar.b.m25098(bArr4);
        util.h.xy.ar.b.m25098(bArr5);
        util.h.xy.ar.b.m25098(bArr6);
        util.h.xy.ar.b.m25098(m2509022);
        byte[] m2509032 = util.h.xy.ar.b.m25090(m250905, bArr11);
        byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
        byte[] m245502 = util.h.xy.ad.a.m24550(highResolutionOutputSizeshNQ4ISI2, m2509022);
        util.h.xy.ar.b.m25074(highResolutionOutputSizeshNQ4ISI2);
        util.h.xy.ar.b.m25074(m245502);
        byte[] m2509042 = util.h.xy.ar.b.m25090(m245502, getHighSpeedVideoSizes(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr9, m2509032, bArr10, bArr12));
        util.h.xy.ar.b.m25098(bArr);
        util.h.xy.ar.b.m25098(bArr2);
        util.h.xy.ar.b.m25098(bArr9);
        util.h.xy.ar.b.m25074(bArr132);
        if (m25089 != null) {
        }
        if (bArr8 != null) {
        }
        int i102 = getHighSpeedVideoFpsRangesFor;
        i2 = (i102 ^ 111) + ((i102 & 111) << 1);
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2) {
        byte b;
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 53) % 128;
        int i = 8;
        byte[] bArr3 = {47, -1, -1, -1, -1, -1, -1, -1};
        int length = bArr.length;
        int length2 = bArr2.length;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i2 = length2 * (-391);
        int i3 = (i2 ^ (-6240)) + ((i2 & (-6240)) << 1);
        int i4 = ~((length2 ^ (-33)) | (length2 & (-33)));
        int i5 = ~((currentTimeMillis & 32) | (currentTimeMillis ^ 32));
        int i6 = -(-(((i4 & i5) | (i4 ^ i5)) * (-196)));
        int i7 = (((i3 | i6) << 1) - (i6 ^ i3)) + (((length2 ^ 32) | (length2 & 32)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
        int i8 = ~length2;
        int i9 = ~((i8 ^ (-33)) | (i8 & (-33)));
        int i10 = ((i5 ^ i9) | (i5 & i9)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE;
        int i11 = (i7 & i10) + (i10 | i7);
        int i12 = 0;
        byte b2 = bArr[0];
        bArr3[0] = (byte) ((i11 & (~b2)) | ((~i11) & b2));
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        int i13 = 1;
        while (i12 < length2) {
            int i14 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = (((i14 | 35) << 1) - (i14 ^ 35)) % 128;
            byte b3 = bArr2[i12 % length2];
            byte b4 = bArr[i12 % length];
            int i15 = (~(b3 & b4)) & (b3 | b4);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i16 = -(-(i15 * (-167)));
            int i17 = (i16 & 8016) + (i16 | 8016);
            int i18 = ~i15;
            int i19 = (i18 ^ 47) | (i18 & 47);
            int i20 = ~currentTimeMillis2;
            int i21 = -(-(((~((i18 ^ i20) | (i20 & i18))) | (~i19)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            int i22 = ((i17 | i21) << 1) - (i21 ^ i17);
            int i23 = -(-((~((i19 & currentTimeMillis2) | (i19 ^ currentTimeMillis2))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            int i25 = (i18 ^ (-48)) | (i18 & (-48));
            int i26 = -(-(((~((i25 ^ currentTimeMillis2) | (i25 & currentTimeMillis2))) | (~(i15 | 47)) | (~((i20 & 47) | (i20 ^ 47)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
            byte b5 = (byte) ((i24 & i26) + (i26 | i24));
            int i27 = i12 + 1;
            if (i27 < length2) {
                byte b6 = bArr2[i27 % length2];
                byte b7 = bArr[i27 % length];
                int i28 = (b6 & (~b7)) | ((~b6) & b7);
                b = (byte) ((i28 & (-48)) + (i28 | (-48)));
            } else {
                b = com.google.common.base.Ascii.SI;
            }
            int i29 = b5 << 4;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i30 = b * 303;
            int i31 = -(-(i29 * (-301)));
            int i32 = ~b;
            int i33 = (~currentTimeMillis3) | i32;
            int i34 = ~((i33 & i29) | (i33 ^ i29));
            int i35 = (b ^ i29) | (b & i29);
            int i36 = ~((i35 ^ currentTimeMillis3) | (i35 & currentTimeMillis3));
            int i37 = (i30 & i31) + (i30 | i31) + (((i34 ^ i36) | (i36 & i34)) * (-302));
            int i38 = (i32 ^ i29) | (i32 & i29);
            int i39 = (~((i38 ^ currentTimeMillis3) | (i38 & currentTimeMillis3))) * (-604);
            int i40 = (i37 & i39) + (i39 | i37);
            int i41 = ~i29;
            int i42 = ~((b ^ i41) | (b & i41));
            int i43 = ~(i29 | currentTimeMillis3);
            int i44 = ((i43 ^ i42) | (i43 & i42)) * 302;
            bArr3[i13] = (byte) (bArr[i13 % length] ^ (((i40 | i44) << 1) - (i44 ^ i40)));
            i12 = (i27 ^ 1) + ((i27 & 1) << 1);
            i13++;
            i = 8;
        }
        int i45 = i;
        while (i13 < i45) {
            bArr3[i13] = (byte) (bArr3[i13] ^ bArr[i13 % length]);
            i13++;
            int i46 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i46 | 109) << 1) - (i46 ^ 109)) % 128;
        }
        byte[] m25090 = util.h.xy.ar.b.m25090(bArr, bArr3);
        int i47 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i47 | 3) << 1) - (i47 ^ 3)) % 128;
        return m25090;
    }

    private static byte[] getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9, byte[] bArr10) {
        int i = Camera2StreamConfigurationMap + 69;
        int i2 = i % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        if (i % 2 == 0) {
            if (bArr10 == null || bArr10.length <= 0) {
                byte[][] bArr11 = {new byte[]{2}, new byte[]{3}, new byte[]{6}, new byte[]{7}, new byte[]{8}, new byte[]{9}, new byte[]{4}, new byte[]{1}, new byte[]{com.google.common.base.Ascii.NAK}};
                byte[][] bArr12 = {bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9};
                byte[] m25024 = util.h.xy.al.rd.m25024(bArr11, bArr12);
                getHighSpeedVideoFpsRangesFor(bArr12, m25024, bArr11);
                return m25024;
            }
            getHighSpeedVideoFpsRangesFor = i2;
            byte[][] bArr13 = {new byte[]{2}, new byte[]{3}, new byte[]{6}, new byte[]{7}, new byte[]{8}, new byte[]{9}, new byte[]{4}, new byte[]{1}, new byte[]{com.google.common.base.Ascii.NAK}, new byte[]{17}};
            byte[][] bArr14 = {bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9, bArr10};
            byte[] m250242 = util.h.xy.al.rd.m25024(bArr13, bArr14);
            getHighSpeedVideoFpsRangesFor(bArr14, m250242, bArr13);
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = (i3 & 67) + (i3 | 67);
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                return m250242;
            }
            throw null;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[][] bArr, byte[] bArr2, byte[][] bArr3) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 67) % 128;
        for (int i = 0; i < bArr.length; i = (i ^ 1) + ((i & 1) << 1)) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;
            util.h.xy.ar.b.m25074(bArr[i]);
            util.h.xy.ar.b.m25074(bArr3[i]);
        }
        util.h.xy.ar.b.m25074(bArr2);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 69) % 128;
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.ab.ma {
        int i = getHighSpeedVideoFpsRangesFor + 45;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ag.a.m24556().m24558();
            throw new java.lang.ArithmeticException();
        }
        android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
        try {
            int i2 = -(android.view.ViewConfiguration.getTapTimeout() >> 16);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("く튓\uf5ec頥묍幘悸υ⛕줪\uec7e轋醯듷埐穝ᵝ⁂슖\ue5f3蠷\uab19乸", (i2 ^ 58067) + ((i2 & 58067) << 1), objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ぉ騖擠콩餻掜칫飄抡촎韁憰찜零慟쬸閌", 43614 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m24558, null);
            java.lang.String packageName = m24558.getPackageName();
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 | 67) << 1) - (i3 ^ 67);
            Camera2StreamConfigurationMap = i4 % 128;
            int i5 = i4 % 2;
            try {
                try {
                    java.lang.Object[] objArr3 = {packageName, 64};
                    int i6 = -android.view.View.resolveSize(0, 0);
                    int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                    int i7 = currentTimeMillis | 41849;
                    int i8 = ~i6;
                    int i9 = ~(((-41850) ^ i8) | (i8 & (-41850)));
                    int i10 = ~currentTimeMillis;
                    int i11 = ~((i10 ^ 41849) | (i10 & 41849));
                    int i12 = ((((i6 * (-380)) + 15986318) + (((i7 ^ i8) | (i7 & i8)) * (-381))) - (~(-(-(((~(i6 | 41849)) | ((i11 ^ i9) | (i11 & i9))) * 381))))) - 1;
                    int i13 = (~((i8 ^ 41849) | (i8 & 41849))) * 381;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("く錹皸\uda37붥Ě\ue49c䡏⮅輀勺㙩駧絥샄ꐗߎ\ueb4a亂ᆅ\uf53b墠㰣龐挑욚ꨩඌ텼듺ᡧﯬ彼", (i12 & i13) + (i13 | i12), objArr4);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    int i14 = -(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ぉ樆蓀㺙奻\uf3ccⶋ䡔\ue221\u1cfe띥턏\u0bd4ꖨ", (i14 & 23117) + (i14 | 23117), objArr5);
                    java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(((android.content.pm.PackageInfo) cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr3)).signatures[0].toByteArray());
                    java.lang.String str = util.h.xy.al.ra.f542;
                    int i15 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoFpsRangesFor = ((i15 ^ 51) + ((i15 & 51) << 1)) % 128;
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("い䙮\udc1a刬\ue884绸\uf48dપ腓\u1775괍⌱맛쾭䖃\udba4剌\ue86b繒\uf41e\u0adf胩ᚌ결⍐륾켗䔴\udbc6凶\ue7b6綰\uf46dਛ耣ᛟ곳", 30240 - (~(-android.view.KeyEvent.getDeadChar(0, 0))), objArr6);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                        int i16 = -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                        int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                        int i17 = (i16 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE) - 11386336;
                        int i18 = ~i16;
                        int i19 = ((-42017) ^ i18) | ((-42017) & i18);
                        int i20 = ~currentTimeMillis2;
                        int i21 = ~((i19 & i20) | (i19 ^ i20));
                        int i22 = (i16 ^ 42016) | (i16 & 42016);
                        int i23 = ~((i22 & currentTimeMillis2) | (i22 ^ currentTimeMillis2));
                        int i24 = ((i21 & i23) | (i21 ^ i23)) * (-272);
                        int i25 = (((i17 & i24) + (i17 | i24)) - (~(((~((i18 & 42016) | (i18 ^ 42016))) | (~((i18 & currentTimeMillis2) | (i18 ^ currentTimeMillis2)))) * (-272)))) - 1;
                        int i26 = -(-(((~(i16 | currentTimeMillis2)) | 42016) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("ぉ鑪砘\udc04ꃄӸ\ue89c䲨ᅈ\uf564夁", ((i25 | i26) << 1) - (i26 ^ i25), objArr7);
                        java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.String.class).invoke(null, str);
                        int i27 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = ((i27 ^ 21) + ((i27 & 21) << 1)) % 128;
                        Camera2StreamConfigurationMap = (i27 + 39) % 128;
                        try {
                            int i28 = -android.graphics.Color.blue(0);
                            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                            int i29 = ~i28;
                            int i30 = ~currentTimeMillis3;
                            int i31 = ~((i30 & (-30242)) | (i30 ^ (-30242)));
                            int i32 = ~((i29 & currentTimeMillis3) | (i29 ^ currentTimeMillis3));
                            int i33 = ((((i28 * (-209)) - 6320369) + ((~((i29 ^ (-30242)) | (i29 & (-30242)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)) - (~(((i31 ^ i32) | (i32 & i31)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) - 1;
                            int i34 = i29 | i30;
                            int i35 = ~((i34 ^ 30241) | (i34 & 30241));
                            int i36 = (i28 ^ (-30242)) | (i28 & (-30242));
                            int i37 = ~((i36 ^ currentTimeMillis3) | (i36 & currentTimeMillis3));
                            int i38 = ((i37 ^ i35) | (i37 & i35)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("い䙮\udc1a刬\ue884绸\uf48dપ腓\u1775괍⌱맛쾭䖃\udba4剌\ue86b繒\uf41e\u0adf胩ᚌ결⍐륾켗䔴\udbc6凶\ue7b6綰\uf46dਛ耣ᛟ곳", ((i33 | i38) << 1) - (i38 ^ i33), objArr8);
                            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                            int touchSlop = android.view.ViewConfiguration.getTouchSlop() >> 8;
                            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                            int i39 = (touchSlop * 371) + 7049;
                            int i40 = ~currentTimeMillis4;
                            int i41 = ~((i40 ^ (-20)) | (i40 & (-20)));
                            int i42 = ~touchSlop;
                            int i43 = ~((i42 & currentTimeMillis4) | (i42 ^ currentTimeMillis4));
                            int i44 = -(-(((i41 ^ i43) | (i41 & i43)) * (-370)));
                            int i45 = ~(i40 | i42);
                            int i46 = ~((currentTimeMillis4 ^ (-20)) | (currentTimeMillis4 & (-20)));
                            int i47 = ((((i39 | i44) << 1) - (i39 ^ i44)) - (~((((i46 ^ i45) | (i46 & i45)) | (~(touchSlop | 19))) * (-370)))) - 1;
                            int i48 = (~((touchSlop ^ 19) | (touchSlop & 19))) * com.knotapi.knot.utilities.Constants.ID_KROGER;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-258679107, 1190644184, 1716541502, -1098191586, 678060609, 1854227025, 143821664, 1091296898, 90469262, -1726953228}, (i47 & i48) + (i48 | i47), objArr9);
                            java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr9[0], java.io.InputStream.class).invoke(invoke2, byteArrayInputStream);
                            int i49 = Camera2StreamConfigurationMap;
                            int i50 = ((i49 ^ 121) + ((i49 & 121) << 1)) % 128;
                            getHighSpeedVideoFpsRangesFor = i50;
                            Camera2StreamConfigurationMap = ((i50 & 9) + (i50 | 9)) % 128;
                            try {
                                int i51 = -android.graphics.Color.blue(0);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("い⻆ൊ比䨤꣰蝽\ue5f2쐓⊍ĝ羹帻복鬳社\ud8cc㝃ᖢ瑝劯넣꿑踢\uec93쬽⦰࠴暴䗂ꑃ苘\ue17a\udfe2", ((i51 | 7817) << 1) - (i51 ^ 7817), objArr10);
                                java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                                int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                int i52 = indexOf * (-445);
                                int i53 = ((i52 | (-5785)) << 1) - (i52 ^ (-5785));
                                int i54 = ~indexOf;
                                int i55 = ~((i54 & (-14)) | (i54 ^ (-14)));
                                int i56 = ~currentTimeMillis5;
                                int i57 = -(-(((~((i56 ^ (-14)) | (i56 & (-14)))) | i55) * 446));
                                int i58 = ~((i54 ^ 13) | (i54 & 13));
                                int i59 = (indexOf ^ (-14)) | (indexOf & (-14));
                                int i60 = ~((i59 ^ currentTimeMillis5) | (i59 & currentTimeMillis5));
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{203411894, 134083648, -846444159, 441543087, 330941808, -1270933012}, (i53 ^ i57) + ((i53 & i57) << 1) + (((i60 ^ i58) | (i60 & i58)) * 446) + (i55 * 446), objArr11);
                                java.lang.Object invoke4 = cls5.getMethod((java.lang.String) objArr11[0], null).invoke(invoke3, null);
                                int i61 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoFpsRangesFor = ((i61 ^ 49) + ((i61 & 49) << 1)) % 128;
                                try {
                                    int myTid = android.os.Process.myTid() >> 22;
                                    int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                                    int i62 = (myTid * 465) - 10367033;
                                    int i63 = ~currentTimeMillis6;
                                    int i64 = ~((i63 & (-22392)) | (i63 ^ (-22392)));
                                    int i65 = ~(myTid | (-22392));
                                    int i66 = ((~((i63 ^ myTid) | (i63 & myTid))) | (i64 ^ i65) | (i64 & i65)) * 464;
                                    int i67 = (i62 ^ i66) + ((i62 & i66) << 1);
                                    int i68 = ~myTid;
                                    int i69 = (i68 ^ currentTimeMillis6) | (i68 & currentTimeMillis6);
                                    int i70 = -(-(((i69 ^ (-22392)) | (i69 & (-22392))) * (-464)));
                                    int i71 = ~((myTid ^ (-22392)) | (myTid & (-22392)));
                                    int i72 = ~(myTid | currentTimeMillis6);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("い朸麶㘪淜蔎㲁同诣⍳嫡\uf247⧃䄋\uf8fc⾢䜼ﺥᘙ䶘\ue529ᲈ둭", (((i67 & i70) + (i70 | i67)) - (~(-(-(((i72 ^ i71) | (i72 & i71)) * 464))))) - 1, objArr12);
                                    java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("ぉ沖觠⛼䌴\ue01cᵯ멁횣玏", 23773 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
                                    byte[] bArr = (byte[]) cls6.getMethod((java.lang.String) objArr13[0], null).invoke(invoke4, null);
                                    int i73 = getHighSpeedVideoFpsRangesFor;
                                    int i74 = (i73 ^ 97) + ((i73 & 97) << 1);
                                    Camera2StreamConfigurationMap = i74 % 128;
                                    if (i74 % 2 != 0) {
                                        return util.h.xy.ad.a.m24548(bArr);
                                    }
                                    util.h.xy.ad.a.m24548(bArr);
                                    throw null;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause4 = th4.getCause();
                        if (cause4 != null) {
                            throw cause4;
                        }
                        throw th4;
                    }
                } catch (java.lang.Throwable th5) {
                    java.lang.Throwable cause5 = th5.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th5;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                throw new util.h.xy.ab.ma(util.h.xy.al.ra.f821);
            } catch (java.security.cert.CertificateException unused2) {
                throw new util.h.xy.ab.ma(util.h.xy.al.ra.f821);
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.q.b.mb> m27060(java.lang.String str, boolean z) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((i ^ 17) + ((i & 17) << 1)) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.s.re> m27289 = util.h.xy.s.rb.m27289(str);
        if (!m27289.isSuccessful()) {
            util.h.xy.an.ra raVar = new util.h.xy.an.ra(m27289.getErrorMessage(), m27289.getErrorCode());
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = ((i2 & 85) + (i2 | 85)) % 128;
            return raVar;
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i3 | 67) << 1) - (i3 ^ 67)) % 128;
        util.h.xy.s.re result = m27289.getResult();
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(result.m27367())) {
            if (result.m27376().m27066() == util.h.xy.s.a.b.f2297) {
                m27058(result, result.m27380().m27349(), true, false, z);
            } else if (result.m27376().m27066() == util.h.xy.s.a.b.f2298) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 5) % 128;
                util.h.xy.s.rf m27365 = result.m27365();
                m27365.m27395(str.getBytes(util.h.xy.h.a.f2221));
                m27058(result, m27365.m27399(), true, false, z);
            }
        }
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isClSupported(result.m27367())) {
            util.h.xy.s.c m27371 = result.m27371();
            m27371.m27152(str.getBytes(util.h.xy.h.a.f2221));
            m27058(result, m27371.m27163(), false, false, z);
            if (!z) {
                try {
                    util.h.xy.g.c.m26867(result);
                    int i4 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = ((i4 ^ 3) + ((i4 & 3) << 1)) % 128;
                } catch (com.gemalto.mfs.mwsdk.exception.CPSKeyStoreException unused) {
                }
            }
        }
        if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isDsrpSupported(result.m27367())) {
            int i5 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i5 | 3) << 1) - (i5 ^ 3)) % 128;
            util.h.xy.s.e m27368 = result.m27368();
            m27368.m27188(str.getBytes(util.h.xy.h.a.f2221));
            m27058(result, m27368.m27200(), false, true, z);
        }
        result.m27364();
        return new util.h.xy.an.ra(new util.h.xy.q.b.mb(result), true, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e6 A[LOOP:0: B:21:0x01e4->B:22:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27055(byte[] bArr, java.lang.String str, com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        util.h.xy.s.re result;
        byte[] bArr2;
        byte b;
        byte[] m26786;
        int i = Camera2StreamConfigurationMap + 121;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            util.h.xy.s.rb.m27289(str).isSuccessful();
            throw new java.lang.ArithmeticException();
        }
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.s.re> m27289 = util.h.xy.s.rb.m27289(str);
        if (!m27289.isSuccessful()) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(m27289.getErrorMessage());
        }
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 63) + (i2 | 63);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            result = m27289.getResult();
            bArr2 = new byte[1];
            if (!result.m27383().equalsIgnoreCase(util.h.xy.al.ra.f509)) {
                b = com.google.common.base.Ascii.SUB;
            }
            b = 32;
        } else {
            result = m27289.getResult();
            bArr2 = new byte[0];
            if (!result.m27383().equalsIgnoreCase(util.h.xy.al.ra.f509)) {
                b = 16;
            }
            b = 32;
        }
        byte m27068 = result.m27376().m27066().m27068();
        if (result.m27376().m27066() != util.h.xy.s.a.b.f2297) {
            int i4 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i4 & 109) + (i4 | 109)) % 128;
            if (result.m27376().m27066() != util.h.xy.s.a.b.f2296) {
                m26786 = m27056(util.h.xy.f.b.f2201.m26780(str, util.h.xy.al.ra.f541, com.gemalto.mfs.mwsdk.dcm.PaymentType.QR));
                if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP) {
                    int i5 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = ((i5 ^ 89) + ((i5 & 89) << 1)) % 128;
                    if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isDsrpSupported(result.m27367())) {
                        int i6 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = (((i6 | 61) << 1) - (i6 ^ 61)) % 128;
                        util.h.xy.s.e m27368 = result.m27368();
                        m27368.m27188(str.getBytes(util.h.xy.h.a.f2221));
                        int length = m27368.m27200().length;
                        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                        int i7 = (-575) - (~(-(-(length * (-574)))));
                        int i8 = ~currentTimeMillis;
                        int i9 = ~((i8 ^ (-2)) | (i8 & (-2)));
                        int i10 = ~length;
                        int i11 = ~((i10 ^ currentTimeMillis) | (i10 & currentTimeMillis));
                        int i12 = -(-(((i9 ^ i11) | (i9 & i11)) * 1150));
                        int i13 = (i7 & i12) + (i7 | i12);
                        int i14 = ~((length ^ i8) | (length & i8));
                        int i15 = -(-(((i14 ^ i11) | (i14 & i11)) * (-575)));
                        bArr2 = new byte[(i13 & i15) + (i15 | i13) + (((~((currentTimeMillis ^ (-2)) | (currentTimeMillis & (-2)))) | (~(i8 | 1))) * 575)];
                        java.lang.System.arraycopy(m27368.m27200(), 0, bArr2, 1, m27368.m27200().length);
                        int i16 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = ((i16 & 85) + (i16 | 85)) % 128;
                        byte b2 = bArr2[0];
                        byte b3 = (byte) ((b2 ^ b) | (b2 & b));
                        bArr2[0] = b3;
                        bArr2[0] = (byte) ((b3 ^ m27068) | (b3 & m27068));
                        util.h.xy.al.rb.m25016(bArr2);
                        byte[] m27716 = util.h.xy.z.mb.m27716();
                        byte[] bArr3 = new byte[bArr2.length];
                        int i17 = 0;
                        for (byte b4 : bArr2) {
                            int i18 = getHighSpeedVideoFpsRangesFor;
                            Camera2StreamConfigurationMap = ((i18 & 113) + (i18 | 113)) % 128;
                            byte b5 = m27716[i17 % m27716.length];
                            bArr3[i17] = (byte) ((~(b4 & b5)) & (b4 | b5));
                            i17++;
                        }
                        util.h.xy.ar.b.m25074(bArr3);
                        util.h.xy.v.b.f2439.m27589(bArr, m26786, bArr3);
                        int i19 = getHighSpeedVideoFpsRangesFor;
                        int i20 = ((i19 & 101) + (i19 | 101)) % 128;
                        Camera2StreamConfigurationMap = i20;
                        getHighSpeedVideoFpsRangesFor = (((i20 | 33) << 1) - (i20 ^ 33)) % 128;
                    }
                }
                if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR) {
                    int i21 = getHighSpeedVideoFpsRangesFor + 55;
                    Camera2StreamConfigurationMap = i21 % 128;
                    if (i21 % 2 == 0) {
                        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(result.m27367());
                        throw null;
                    }
                    if (com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.isQrSupported(result.m27367())) {
                        if (result.m27376().m27066() == util.h.xy.s.a.b.f2297) {
                            int i22 = getHighSpeedVideoFpsRangesFor;
                            Camera2StreamConfigurationMap = (((i22 | 93) << 1) - (i22 ^ 93)) % 128;
                            util.h.xy.s.rd m27380 = result.m27380();
                            int length2 = m27380.m27349().length;
                            bArr2 = new byte[(length2 ^ 1) + ((length2 & 1) << 1)];
                            java.lang.System.arraycopy(m27380.m27349(), 0, bArr2, 1, m27380.m27349().length);
                        } else if (result.m27376().m27066() == util.h.xy.s.a.b.f2298) {
                            int i23 = Camera2StreamConfigurationMap;
                            getHighSpeedVideoFpsRangesFor = ((i23 ^ 87) + ((i23 & 87) << 1)) % 128;
                            util.h.xy.s.rf m27365 = result.m27365();
                            m27365.m27395(str.getBytes(util.h.xy.h.a.f2221));
                            int length3 = m27365.m27399().length;
                            bArr2 = new byte[(length3 ^ 1) + ((length3 & 1) << 1)];
                            java.lang.System.arraycopy(m27365.m27399(), 0, bArr2, 1, m27365.m27399().length);
                            m27068 = 4;
                        }
                    }
                }
                byte b22 = bArr2[0];
                byte b32 = (byte) ((b22 ^ b) | (b22 & b));
                bArr2[0] = b32;
                bArr2[0] = (byte) ((b32 ^ m27068) | (b32 & m27068));
                util.h.xy.al.rb.m25016(bArr2);
                byte[] m277162 = util.h.xy.z.mb.m27716();
                byte[] bArr32 = new byte[bArr2.length];
                int i172 = 0;
                while (r1 < r0) {
                }
                util.h.xy.ar.b.m25074(bArr32);
                util.h.xy.v.b.f2439.m27589(bArr, m26786, bArr32);
                int i192 = getHighSpeedVideoFpsRangesFor;
                int i202 = ((i192 & 101) + (i192 | 101)) % 128;
                Camera2StreamConfigurationMap = i202;
                getHighSpeedVideoFpsRangesFor = (((i202 | 33) << 1) - (i202 ^ 33)) % 128;
            }
        }
        m26786 = util.h.xy.f.b.f2201.m26786(str);
        if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP) {
        }
        if (profileChannel == com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR) {
        }
        byte b222 = bArr2[0];
        byte b322 = (byte) ((b222 ^ b) | (b222 & b));
        bArr2[0] = b322;
        bArr2[0] = (byte) ((b322 ^ m27068) | (b322 & m27068));
        util.h.xy.al.rb.m25016(bArr2);
        byte[] m2771622 = util.h.xy.z.mb.m27716();
        byte[] bArr322 = new byte[bArr2.length];
        int i1722 = 0;
        while (r1 < r0) {
        }
        util.h.xy.ar.b.m25074(bArr322);
        util.h.xy.v.b.f2439.m27589(bArr, m26786, bArr322);
        int i1922 = getHighSpeedVideoFpsRangesFor;
        int i2022 = ((i1922 & 101) + (i1922 | 101)) % 128;
        Camera2StreamConfigurationMap = i2022;
        getHighSpeedVideoFpsRangesFor = (((i2022 | 33) << 1) - (i2022 ^ 33)) % 128;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m27059(byte[] bArr) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 27) % 128;
        byte[] m27056 = m27056(bArr);
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 117) % 128;
        return m27056;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1 A[LOOP:0: B:11:0x00af->B:12:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m27058(util.h.xy.s.re reVar, byte[] bArr, boolean z, boolean z2, boolean z3) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i;
        int length = bArr.length;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        int i2 = ~length;
        int i3 = ~((i2 & currentTimeMillis) | (i2 ^ currentTimeMillis));
        int i4 = (((length * 965) - 1927) - (~(-(-(((i3 ^ (-2)) | (i3 & (-2))) * (-964)))))) - 1;
        int i5 = ~currentTimeMillis;
        int i6 = ((~((i5 ^ i2) | (i5 & i2))) | (~((i2 & 1) | (i2 ^ 1)))) * (-964);
        int i7 = ((i4 | i6) << 1) - (i4 ^ i6);
        byte[] bArr2 = new byte[i7];
        util.h.xy.s.a m27376 = reVar.m27376();
        reVar.m27383();
        byte[] m25076 = util.h.xy.ar.b.m25076(reVar.m27383().replace(util.h.xy.al.ra.f533, util.h.xy.al.ra.f733));
        int i8 = 0;
        if (m27376.m27066() != util.h.xy.s.a.b.f2297) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 85) % 128;
            if (m27376.m27066() != util.h.xy.s.a.b.f2296 && (m27376.m27066() != util.h.xy.s.a.b.f2298 || z)) {
                if (!z) {
                    bArr2[0] = 0;
                    throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.al.ra.f835);
                }
                bArr2[0] = 4;
                int i9 = getHighSpeedVideoFpsRangesFor;
                Camera2StreamConfigurationMap = (((i9 | 89) << 1) - (i9 ^ 89)) % 128;
                bArr2[0] = (byte) (m25076[0] | bArr2[0]);
                java.lang.System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
                byte[] m27716 = util.h.xy.z.mb.m27716();
                byte[] bArr3 = new byte[i7];
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 25) % 128;
                int i10 = 0;
                while (i8 < i7) {
                    byte b = bArr2[i8];
                    byte b2 = m27716[i10 % m27716.length];
                    bArr3[i10] = (byte) ((b & (~b2)) | ((~b) & b2));
                    i10++;
                    int i11 = ((i8 | 12) << 1) - (i8 ^ 12);
                    i8 = (i11 & (-11)) + (i11 | (-11));
                }
                util.h.xy.ar.b.m25074(bArr3);
                if (!z) {
                    int i12 = Camera2StreamConfigurationMap;
                    int i13 = (i12 & 43) + (i12 | 43);
                    getHighSpeedVideoFpsRangesFor = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    if (z3) {
                        util.h.xy.v.b.f2439.m27636(bArr3);
                        int i14 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = (((i14 | 59) << 1) - (i14 ^ 59)) % 128;
                    } else {
                        util.h.xy.v.b.f2439.m27577(bArr3);
                    }
                } else if (z2) {
                    int i15 = Camera2StreamConfigurationMap;
                    int i16 = (i15 ^ 21) + ((i15 & 21) << 1);
                    int i17 = i16 % 128;
                    getHighSpeedVideoFpsRangesFor = i17;
                    if (i16 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    if (z3) {
                        Camera2StreamConfigurationMap = (((i17 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i17 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
                        util.h.xy.v.b.f2439.m27602(bArr3);
                    } else {
                        util.h.xy.v.b.f2439.m27578(bArr3);
                    }
                } else if (z3) {
                    int i18 = getHighSpeedVideoFpsRangesFor + 109;
                    Camera2StreamConfigurationMap = i18 % 128;
                    if (i18 % 2 == 0) {
                        util.h.xy.v.b.f2439.m27579(bArr3);
                        throw null;
                    }
                    util.h.xy.v.b.f2439.m27579(bArr3);
                } else {
                    util.h.xy.v.b.f2439.m27588(bArr3);
                }
                i = Camera2StreamConfigurationMap + 63;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
        }
        bArr2[0] = m27376.m27066().m27068();
        bArr2[0] = (byte) (m25076[0] | bArr2[0]);
        java.lang.System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        byte[] m277162 = util.h.xy.z.mb.m27716();
        byte[] bArr32 = new byte[i7];
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 25) % 128;
        int i102 = 0;
        while (i8 < i7) {
        }
        util.h.xy.ar.b.m25074(bArr32);
        if (!z) {
        }
        i = Camera2StreamConfigurationMap + 63;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
        }
    }

    public static final class mb {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoSizes;
        private final long Camera2StreamConfigurationMap;
        private final com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel getHighResolutionOutputSizeshNQ4ISI;
        private final util.h.xy.s.re getHighSpeedVideoFpsRangesFor;

        public mb(util.h.xy.s.re reVar) {
            this.Camera2StreamConfigurationMap = reVar.m27364() * 1000;
            this.getHighResolutionOutputSizeshNQ4ISI = reVar.m27367();
            this.getHighSpeedVideoFpsRangesFor = reVar;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel m27062() {
            int i = getHighSpeedVideoSizes;
            int i2 = (i ^ 67) + ((i & 67) << 1);
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRanges = i3;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 ^ 105) + ((i3 & 105) << 1);
            getHighSpeedVideoSizes = i4 % 128;
            if (i4 % 2 == 0) {
                return profileChannel;
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.s.re m27061() {
            int i = (getHighSpeedVideoSizes + 65) % 128;
            getHighSpeedVideoFpsRanges = i;
            util.h.xy.s.re reVar = this.getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoSizes = ((i & 81) + (i | 81)) % 128;
            return reVar;
        }
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizes = -333938953177201739L;
        getHighSpeedVideoFpsRanges = new int[]{2025045624, 416320594, 310019779, -74422375, -1952163062, -1943314511, -645410991, -193314101, 1765668344, -1479515259, -388262707, 60813726, -1882389045, -1281946531, -1851462832, 633221559, 1940317548, 1441986969};
    }
}
