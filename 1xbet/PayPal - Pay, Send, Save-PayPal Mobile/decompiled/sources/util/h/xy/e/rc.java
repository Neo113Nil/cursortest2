package util.h.xy.e;

/* loaded from: classes5.dex */
public final class rc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    private static char[] getOutputFormats;
    private static long getOutputMinFrameDuration;
    private final android.content.pm.PackageManager getOutputSizeshNQ4ISI;
    private final byte[] getOutputStallDuration = {97, -19, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 126, -123, -45, -122, -88, -33, -18, 107, -122, 75, -40, 91, com.google.common.base.Ascii.VT, -6, -91, -81, -127};
    private final java.util.List<util.h.xy.e.rc.ma> getOutputSizes = new java.util.ArrayList();

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        int i4 = getHighSpeedVideoSizes + 21;
        while (true) {
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (rbVar.f2651 >= i) {
                break;
            }
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
            i4 = getHighSpeedVideoSizes + 101;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
        while (rbVar.f2651 < i) {
            int i5 = getHighSpeedVideoSizes + 23;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static final class ma {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 9;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;
        private java.util.List<java.lang.String> getHighSpeedVideoSizes;
        private final java.lang.String getInputSizeshNQ4ISI;

        static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(util.h.xy.e.rc.ma maVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i | 91) << 1) - (i ^ 91)) % 128;
            getHighSpeedVideoFpsRangesFor = (i + 93) % 128;
            int i2 = getHighSpeedVideoFpsRanges;
            int i3 = i2 ^ 125;
            int i4 = i2 & 125;
            int i5 = ((i3 ^ i4) | (i3 & i4)) << 1;
            int i6 = -((~i4) & (i3 | i4));
            int i7 = i5 & i6;
            int i8 = ((i5 ^ i6) | i7) << 1;
            int i9 = -((i6 | i5) & (~i7));
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i10 = i9 * 530;
            int i11 = (i10 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO) + (i10 | org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO);
            int i12 = i8 * 530;
            int i13 = ~currentTimeMillis;
            int i14 = (((i11 ^ i12) + ((i12 & i11) << 1)) - (~(((~((i13 & i9) | (i13 ^ i9))) | (~((i9 ^ i8) | (i9 & i8)))) * 529))) - 1;
            int i15 = ~i8;
            int i16 = ~((i9 ^ currentTimeMillis) | (i9 & currentTimeMillis));
            int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * 529));
            int i18 = (i14 & i17) + (i17 | i14);
            Camera2StreamConfigurationMap = i18 % 128;
            int i19 = getHighSpeedVideoFpsRangesFor;
            if (i18 % 2 == 0) {
                int i20 = (i19 & 77) + (i19 | 77);
                int i21 = i20 % 128;
                getHighResolutionOutputSizeshNQ4ISI = i21;
                int i22 = i20 % 2;
                getHighSpeedVideoFpsRangesFor = ((i21 ^ 113) + ((i21 & 113) << 1)) % 128;
                return maVar.getInputSizeshNQ4ISI;
            }
            getHighResolutionOutputSizeshNQ4ISI = ((i19 & 41) + (i19 | 41)) % 128;
            int i23 = ((i19 ^ 59) + ((i19 & 59) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i23;
            getHighSpeedVideoFpsRangesFor = ((i23 ^ 105) + ((i23 & 105) << 1)) % 128;
            java.lang.String str = maVar.getInputSizeshNQ4ISI;
            throw new java.lang.ArithmeticException();
        }

        static /* synthetic */ java.util.List getHighSpeedVideoSizes(util.h.xy.e.rc.ma maVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            if (i2 % 2 != 0) {
                int i4 = 5 / 3;
            }
            int i5 = i3 + 93;
            int i6 = i5 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i6;
            if (i5 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i7 = getHighSpeedVideoFpsRanges;
            int i8 = i7 & 13;
            int i9 = ((~i7) & 13) | (i7 & (-14));
            int i10 = -(-((i9 ^ i8) | (i9 & i8)));
            int i11 = i8 & i10;
            int i12 = (((i8 | i10) & (~i11)) - (~(i11 << 1))) - 1;
            Camera2StreamConfigurationMap = i12 % 128;
            if (i12 % 2 != 0) {
                getHighSpeedVideoFpsRangesFor = ((i6 ^ 17) + ((i6 & 17) << 1)) % 128;
            }
            java.util.List<java.lang.String> list = maVar.getHighSpeedVideoSizes;
            int i13 = (i6 + 73) % 128;
            getHighSpeedVideoFpsRangesFor = i13;
            int i14 = i7 & 79;
            int i15 = (i7 & (-80)) | ((~i7) & 79);
            int i16 = (i14 - (~(-(-((i15 ^ i14) | (i15 & i14)))))) - 1;
            Camera2StreamConfigurationMap = i16 % 128;
            if (i16 % 2 != 0) {
                getHighResolutionOutputSizeshNQ4ISI = ((i13 & 105) + (i13 | 105)) % 128;
                throw new java.lang.ArithmeticException();
            }
            int i17 = i13 + 55;
            int i18 = i17 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i18;
            if (i17 % 2 == 0) {
                int i19 = 4 / 3;
            }
            getHighSpeedVideoFpsRangesFor = ((i18 & 103) + (i18 | 103)) % 128;
            return list;
        }

        public ma(java.lang.String str, java.lang.String str2) {
            this.getInputSizeshNQ4ISI = str;
            getHighResolutionOutputSizeshNQ4ISI(str2);
        }

        public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            int i;
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (i2 + 101) % 128;
            getHighSpeedVideoFpsRangesFor = (i2 + 107) % 128;
            getHighSpeedVideoFpsRangesFor = ((i2 & 7) + (i2 | 7)) % 128;
            int i3 = Camera2StreamConfigurationMap;
            int i4 = i3 ^ 59;
            int i5 = i3 & 59;
            int i6 = ((i4 ^ i5) | (i4 & i5)) << 1;
            int i7 = -((i3 & (-60)) ^ ((~i3) & 59));
            int i8 = i6 & i7;
            int i9 = (i7 ^ i6) | i8;
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i10 = ~i9;
            int i11 = ~identityHashCode;
            int i12 = ~(i10 | i11);
            int i13 = ~i8;
            int i14 = ~((i13 & identityHashCode) | (i13 ^ identityHashCode));
            int i15 = ~(i13 | identityHashCode);
            int i16 = ~((i8 & i11) | (i11 ^ i8));
            int i17 = (((((i9 * (-574)) + (i8 * (-574))) + (((i12 & i14) | (i12 ^ i14)) * 1150)) - (~(-(-(((i15 ^ i16) | (i16 & i15)) * (-575)))))) - 1) + (((~((i9 ^ i11) | (i9 & i11))) | (~((identityHashCode ^ i10) | (identityHashCode & i10)))) * 575);
            getHighSpeedVideoFpsRanges = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i18 ^ 9) + ((i18 & 9) << 1)) % 128;
                throw null;
            }
            if (this.getHighSpeedVideoSizes == null) {
                this.getHighSpeedVideoSizes = new java.util.ArrayList();
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
                int i19 = Camera2StreamConfigurationMap;
                int i20 = i19 ^ 80;
                int i21 = -(-((i19 & 80) << 1));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = ~i22;
                int i24 = i22 << 1;
                int identityHashCode2 = java.lang.System.identityHashCode(this);
                int i25 = i24 * (-391);
                int i26 = -(-(i23 * (-195)));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                int i28 = ~i23;
                int i29 = ~((i28 ^ i24) | (i28 & i24));
                int i30 = ~(identityHashCode2 | i23);
                int i31 = -(-(((i29 ^ i30) | (i29 & i30)) * (-196)));
                int i32 = (i27 ^ i31) + ((i31 & i27) << 1) + (((i23 ^ i24) | (i23 & i24)) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
                int i33 = ~i24;
                int i34 = ~((i33 ^ i28) | (i33 & i28));
                int i35 = -(-(((i34 ^ i30) | (i34 & i30)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE));
                int i36 = ((i32 | i35) << 1) - (i35 ^ i32);
                getHighSpeedVideoFpsRanges = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = getHighResolutionOutputSizeshNQ4ISI;
                    getHighSpeedVideoFpsRangesFor = ((i37 & 11) + (i37 | 11)) % 128;
                    getHighSpeedVideoFpsRangesFor = (((i37 | 25) << 1) - (i37 ^ 25)) % 128;
                }
            } else {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 99) % 128;
            }
            if (!this.getHighSpeedVideoSizes.contains(str)) {
                int i38 = getHighSpeedVideoFpsRangesFor;
                int i39 = ((i38 | 77) << 1) - (i38 ^ 77);
                getHighResolutionOutputSizeshNQ4ISI = i39 % 128;
                if (i39 % 2 != 0) {
                    int i40 = Camera2StreamConfigurationMap;
                    int i41 = (i40 & (-6)) | ((~i40) & 5);
                    int i42 = -(-((i40 & 5) << 1));
                    int i43 = i41 & i42;
                    int i44 = (i42 ^ i41) | i43;
                    int identityHashCode3 = java.lang.System.identityHashCode(this);
                    int i45 = i44 * 55;
                    int i46 = i43 * (-107);
                    int i47 = ~i44;
                    int i48 = ~(i47 | i43);
                    int i49 = ~identityHashCode3;
                    int i50 = ~((i49 ^ i43) | (i49 & i43));
                    int i51 = (i45 & i46) + (i45 | i46) + (((i48 & i50) | (i48 ^ i50)) * (-108));
                    int i52 = ~i43;
                    int i53 = ~(i47 | identityHashCode3);
                    int i54 = ~((i52 & i44) | (i52 ^ i44));
                    int i55 = i53 | i54;
                    int i56 = ~((i44 & i49) | (i49 ^ i44));
                    int i57 = ((i56 ^ i55) | (i55 & i56)) * 54;
                    int i58 = (i51 ^ i57) + ((i57 & i51) << 1);
                    int i59 = ((i54 & identityHashCode3) | (identityHashCode3 ^ i54)) * 54;
                    int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                    getHighSpeedVideoFpsRanges = i60 % 128;
                    if (i60 % 2 == 0) {
                        int i61 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = ((i61 & 87) + (i61 | 87)) % 128;
                        getHighSpeedVideoFpsRangesFor = (((i61 | 21) << 1) - (i61 ^ 21)) % 128;
                        this.getHighSpeedVideoSizes.add(str);
                        throw new java.lang.ArithmeticException();
                    }
                    int i62 = getHighSpeedVideoFpsRangesFor;
                    getHighResolutionOutputSizeshNQ4ISI = (((i62 | 19) << 1) - (i62 ^ 19)) % 128;
                    this.getHighSpeedVideoSizes.add(str);
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
                }
            }
            int i63 = getHighSpeedVideoFpsRangesFor;
            int i64 = ((i63 | 59) << 1) - (i63 ^ 59);
            getHighResolutionOutputSizeshNQ4ISI = i64 % 128;
            int i65 = getHighSpeedVideoFpsRanges;
            if (i64 % 2 == 0) {
                int i66 = i65 & 12;
                i = (i66 / ((i65 ^ 12) | i66)) * 25863;
            } else {
                int i67 = i65 & 23;
                i = (i67 + ((i65 ^ 23) | i67)) % 128;
            }
            Camera2StreamConfigurationMap = i;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(int i, int i2, char c) {
        int i3 = getInputSizeshNQ4ISI + 3;
        getInputFormats = i3 % 128;
        getHighSpeedVideoFpsRangesFor = i3 % 2 == 0 ? (Camera2StreamConfigurationMap / 4) - 6040 : (Camera2StreamConfigurationMap + 95) % 128;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (getInputFormats + 41) % 128;
            getInputSizeshNQ4ISI = i5;
            cArr[i4] = (char) ((getHighSpeedVideoSizesFor[i + i4] ^ (i4 * getOutputMinFrameDuration)) ^ c);
            i4++;
            getInputFormats = (i5 + 91) % 128;
        }
        getInputFormats = (getInputSizeshNQ4ISI + 37) % 128;
        java.lang.String str = new java.lang.String(cArr);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 5) % 128;
        return str;
    }

    public rc(android.content.Context context) {
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        try {
            android.content.pm.PackageManager packageManager = (android.content.pm.PackageManager) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(0, 23, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(23, 17, (char) 0).intern(), null).invoke(context, null);
            this.getOutputSizeshNQ4ISI = packageManager;
            if (packageManager == null) {
                throw new util.h.xy.c.ma(101, null);
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009e, code lost:
    
        if ((((-262145) & r10) | ((~r10) & 262144)) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0073, code lost:
    
        if ((r2 % 2) != 0) goto L21;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.a<util.h.xy.c.mb> m26478(android.content.Context context, int i, util.h.xy.e.rb.a aVar) throws util.h.xy.c.ma {
        int i2 = Camera2StreamConfigurationMap;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.c.a<util.h.xy.c.mb> aVar2 = null;
        if (context == null) {
            throw new util.h.xy.c.ma(103, null);
        }
        util.h.xy.e.mc.m26470(i);
        boolean z = false;
        if ((2031616 & i) == 0) {
            int i6 = Camera2StreamConfigurationMap;
            int i7 = i6 & 45;
            int i8 = ((((i6 ^ 45) | i7) << 1) - (~(-((~i7) & (i6 | 45))))) - 1;
            getHighSpeedVideoFpsRangesFor = i8 % 128;
            boolean z2 = i8 % 2 != 0;
            int i9 = i6 & 85;
            int i10 = -(-((i6 ^ 85) | i9));
            int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
            getHighSpeedVideoFpsRangesFor = i11 % 128;
            if (i11 % 2 != 0) {
                getInputFormats = (getInputSizeshNQ4ISI + 47) % 128;
            }
        } else {
            int i12 = getHighSpeedVideoFpsRangesFor + 67;
            Camera2StreamConfigurationMap = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = getInputFormats + 93;
                getInputSizeshNQ4ISI = i13 % 128;
            }
            int i14 = 3 / 5;
        }
        int i15 = (getInputSizeshNQ4ISI + 45) % 128;
        getInputFormats = i15;
        int i16 = Camera2StreamConfigurationMap;
        int i17 = (-2) - (~((i16 ^ 110) + ((i16 & 110) << 1)));
        int i18 = i17 % 128;
        getHighSpeedVideoFpsRangesFor = i18;
        if (i17 % 2 != 0) {
            if ((i & 262144) == 0) {
                getInputSizeshNQ4ISI = (i15 + 117) % 128;
                int i19 = i18 & 113;
                Camera2StreamConfigurationMap = (i19 + ((i18 ^ 113) | i19)) % 128;
                throw new util.h.xy.c.ma(117, null);
            }
            int i20 = Camera2StreamConfigurationMap;
            int i21 = ((i20 ^ 111) | (i20 & 111)) << 1;
            int i22 = -(((~i20) & 111) | (i20 & (-112)));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            getHighSpeedVideoFpsRangesFor = i23 % 128;
            if (i23 % 2 == 0) {
                getInputSizeshNQ4ISI = (getInputFormats + 115) % 128;
            } else {
                getInputFormats = (getInputSizeshNQ4ISI + 109) % 128;
            }
            if (aVar == null) {
                throw new util.h.xy.c.ma(126, null);
            }
            if ((i & 256) != 0) {
                int i24 = i20 & 97;
                getHighSpeedVideoFpsRangesFor = (((((i20 ^ 97) | i24) << 1) - (~(-((~i24) & (i20 | 97))))) - 1) % 128;
                z = true;
            } else {
                getHighSpeedVideoFpsRangesFor = (i20 + 19) % 128;
            }
            java.util.Map<java.lang.String, java.lang.String> m26476 = aVar.m26476(util.h.xy.e.rb.b.f1879);
            if (m26476 != null) {
                int i25 = getHighSpeedVideoFpsRangesFor;
                int i26 = (i25 & 37) + (i25 | 37);
                Camera2StreamConfigurationMap = i26 % 128;
                if (i26 % 2 != 0) {
                    m26476.isEmpty();
                    throw null;
                }
                if (!m26476.isEmpty()) {
                    int i27 = getHighSpeedVideoFpsRangesFor;
                    int i28 = i27 ^ 7;
                    Camera2StreamConfigurationMap = (((((i27 & 7) | i28) << 1) - (~(-i28))) - 1) % 128;
                    int i29 = getHighSpeedVideoFpsRangesFor;
                    int i30 = i29 & 91;
                    int i31 = ((i29 ^ 91) | i30) << 1;
                    int i32 = -((i29 | 91) & (~i30));
                    Camera2StreamConfigurationMap = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
                    util.h.xy.c.a<util.h.xy.c.mb> aVar3 = null;
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : m26476.entrySet()) {
                        int i33 = Camera2StreamConfigurationMap;
                        int i34 = i33 ^ 35;
                        int i35 = (i33 & 35) << 1;
                        getHighSpeedVideoFpsRangesFor = ((i34 & i35) + (i35 | i34)) % 128;
                        if (entry != null) {
                            int i36 = getInputFormats;
                            getInputSizeshNQ4ISI = (i36 + 11) % 128;
                            int i37 = Camera2StreamConfigurationMap + 71;
                            getHighSpeedVideoFpsRangesFor = i37 % 128;
                            if (i37 % 2 != 0) {
                                int i38 = i36 + 95;
                                getInputSizeshNQ4ISI = i38 % 128;
                                if (i38 % 2 == 0) {
                                    if (util.h.xy.e.mc.m26471(context, entry.getValue())) {
                                        int i39 = Camera2StreamConfigurationMap + 95;
                                        getHighSpeedVideoFpsRangesFor = i39 % 128;
                                        if (i39 % 2 == 0) {
                                            throw null;
                                        }
                                        int i40 = getInputSizeshNQ4ISI + 7;
                                        getInputFormats = i40 % 128;
                                        if (i40 % 2 == 0) {
                                            throw null;
                                        }
                                        if (aVar3 == null) {
                                            aVar3 = new util.h.xy.c.a<>();
                                            int i41 = Camera2StreamConfigurationMap;
                                            int i42 = i41 & 65;
                                            int i43 = -(-((i41 ^ 65) | i42));
                                            getHighSpeedVideoFpsRangesFor = ((i42 & i43) + (i43 | i42)) % 128;
                                        }
                                        aVar3.m25826(new util.h.xy.c.mb(entry.getKey(), entry.getValue()));
                                        if (z) {
                                            int i44 = ((-2) - (~(getHighSpeedVideoFpsRangesFor + 16))) % 128;
                                            Camera2StreamConfigurationMap = i44;
                                            int i45 = i44 + 73;
                                            getHighSpeedVideoFpsRangesFor = i45 % 128;
                                            if (i45 % 2 != 0) {
                                                return aVar3;
                                            }
                                            throw null;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                getInputSizeshNQ4ISI = (i36 + 51) % 128;
                            }
                            util.h.xy.e.mc.m26471(context, entry.getValue());
                            throw null;
                        }
                        int i46 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = (((((i46 ^ 113) | (i46 & 113)) << 1) - (~(-((i46 & (-114)) | ((~i46) & 113))))) - 1) % 128;
                    }
                    aVar2 = aVar3;
                }
            }
            int i47 = Camera2StreamConfigurationMap;
            int i48 = (i47 & 86) + (i47 | 86);
            getHighSpeedVideoFpsRangesFor = ((~i48) + (i48 << 1)) % 128;
            return aVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if ((r3 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if ((r3 * 5) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0040, code lost:
    
        r1 = r1 + 55;
        util.h.xy.e.rc.getInputFormats = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        r0 = 2 / 5;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.c.a<util.h.xy.c.mb> m26479() {
        util.h.xy.c.a<util.h.xy.c.mb> aVar;
        int i = getInputFormats + 35;
        int i2 = i % 128;
        getInputSizeshNQ4ISI = i2;
        if (i % 2 != 0) {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = i3 & 95;
            int i5 = ((i3 ^ 95) | i4) + 1;
            int i6 = -((i3 | 95) & (~i4));
            int i7 = (i5 & i6) * (i6 | i5);
            getHighSpeedVideoFpsRangesFor = i7 / 16730;
        } else {
            int i8 = Camera2StreamConfigurationMap;
            int i9 = i8 & 45;
            int i10 = ((i8 ^ 45) | i9) << 1;
            int i11 = -((i8 | 45) & (~i9));
            int i12 = (i10 & i11) + (i11 | i10);
            getHighSpeedVideoFpsRangesFor = i12 % 128;
        }
        if (getHighSpeedVideoFpsRanges()) {
            aVar = new util.h.xy.c.a<>();
            aVar.m25826(new util.h.xy.c.mb(getHighSpeedVideoFpsRangesFor(40, 14, (char) 0).intern(), getHighSpeedVideoFpsRangesFor(54, 20, (char) 0).intern()));
            int i13 = Camera2StreamConfigurationMap;
            int i14 = i13 & 29;
            int i15 = -(-((i13 ^ 29) | i14));
            getHighSpeedVideoFpsRangesFor = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
        } else {
            aVar = null;
        }
        int i16 = (getInputFormats + 85) % 128;
        getInputSizeshNQ4ISI = i16;
        int i17 = getHighSpeedVideoFpsRangesFor;
        int i18 = ((i17 ^ 90) + ((i17 & 90) << 1)) - 1;
        Camera2StreamConfigurationMap = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        getInputFormats = (i16 + 79) % 128;
        return aVar;
    }

    private boolean getHighSpeedVideoFpsRanges() {
        boolean z = false;
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(getHighSpeedVideoFpsRangesFor(74, 43, (char) 32662).intern(), getHighSpeedVideoFpsRangesFor(117, 38, (char) 0).intern());
        java.util.List<java.lang.String> asList2 = java.util.Arrays.asList(getHighSpeedVideoFpsRangesFor(155, 36, (char) 57839).intern(), getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 36, (char) 8928).intern());
        Camera2StreamConfigurationMap(asList, true);
        Camera2StreamConfigurationMap(asList2, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = getInputSizeshNQ4ISI + 31;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (((i2 ^ 33) % (~(-(-(i2 & 33))))) - 1) / 14618;
        } else {
            int i3 = Camera2StreamConfigurationMap;
            int i4 = ((i3 ^ 39) - (~(-(-((i3 & 39) << 1))))) - 1;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            int i5 = i4 % 2;
        }
        for (util.h.xy.e.rc.ma maVar : this.getOutputSizes) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 75) % 128;
            if (Camera2StreamConfigurationMap(util.h.xy.e.rc.ma.getHighSpeedVideoFpsRanges(maVar))) {
                int i6 = getHighSpeedVideoFpsRangesFor;
                int i7 = ((i6 | 77) << 1) - (i6 ^ 77);
                Camera2StreamConfigurationMap = i7 % 128;
                if (i7 % 2 != 0) {
                    arrayList.add(maVar);
                    throw null;
                }
                arrayList.add(maVar);
                int i8 = Camera2StreamConfigurationMap;
                int i9 = i8 & 15;
                getHighSpeedVideoFpsRangesFor = (((((i8 ^ 15) | i9) << 1) - (~(-((i8 | 15) & (~i9))))) - 1) % 128;
            }
            int i10 = getInputFormats + 31;
            getInputSizeshNQ4ISI = i10 % 128;
            Camera2StreamConfigurationMap = i10 % 2 != 0 ? -24637 : ((-2) - (~(getHighSpeedVideoFpsRangesFor + 34))) % 128;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(asList);
        arrayList2.addAll(asList2);
        java.util.Collections.sort(arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i11 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (((i11 & (-52)) | ((~i11) & 51)) + ((i11 & 51) << 1)) % 128;
        while (it.hasNext()) {
            int i12 = Camera2StreamConfigurationMap;
            int i13 = ((i12 | 57) << 1) - (i12 ^ 57);
            getHighSpeedVideoFpsRangesFor = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = getInputSizeshNQ4ISI + 41;
                getInputFormats = i14 % 128;
                if (i14 % 2 != 0) {
                    util.h.xy.e.rc.ma maVar2 = (util.h.xy.e.rc.ma) it.next();
                    java.util.List highSpeedVideoSizes = util.h.xy.e.rc.ma.getHighSpeedVideoSizes(maVar2);
                    if (highSpeedVideoSizes != null) {
                        getInputSizeshNQ4ISI = (getInputFormats + 115) % 128;
                        java.util.Collections.sort(highSpeedVideoSizes);
                        if (highSpeedVideoSizes.size() == arrayList2.size()) {
                            int i15 = Camera2StreamConfigurationMap;
                            int i16 = i15 & 21;
                            int i17 = ((i15 ^ 21) | i16) << 1;
                            int i18 = -((i15 | 21) & (~i16));
                            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                            getHighSpeedVideoFpsRangesFor = i19 % 128;
                            if (i19 % 2 == 0) {
                                getInputSizeshNQ4ISI = (getInputFormats + 111) % 128;
                                arrayList2.equals(highSpeedVideoSizes);
                                throw null;
                            }
                            if (arrayList2.equals(highSpeedVideoSizes)) {
                                int i20 = Camera2StreamConfigurationMap;
                                int i21 = i20 & 109;
                                getHighSpeedVideoFpsRangesFor = (((i20 | 109) & (~i21)) + (i21 << 1)) % 128;
                                arrayList3.add(maVar2);
                                int i22 = getHighSpeedVideoFpsRangesFor;
                                int i23 = i22 & 103;
                                int i24 = i22 | 103;
                                Camera2StreamConfigurationMap = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                            }
                        } else {
                            continue;
                        }
                    }
                    int i25 = getHighSpeedVideoFpsRangesFor;
                    Camera2StreamConfigurationMap = ((((i25 ^ 103) | (i25 & 103)) << 1) - ((i25 & (-104)) | ((~i25) & 103))) % 128;
                }
            }
            util.h.xy.e.rc.ma.getHighSpeedVideoSizes((util.h.xy.e.rc.ma) it.next());
            throw null;
        }
        getInputFormats = (getInputSizeshNQ4ISI + 83) % 128;
        java.util.Iterator it2 = arrayList3.iterator();
        int i26 = getHighSpeedVideoFpsRangesFor + 73;
        Camera2StreamConfigurationMap = i26 % 128;
        if (i26 % 2 == 0) {
            getInputFormats = (getInputSizeshNQ4ISI + 45) % 128;
        }
        while (it2.hasNext()) {
            int i27 = getInputFormats + 97;
            getInputSizeshNQ4ISI = i27 % 128;
            if (i27 % 2 != 0) {
                break;
            }
            int i28 = getHighSpeedVideoFpsRangesFor;
            int i29 = i28 & 41;
            int i30 = (i28 ^ 41) | i29;
            Camera2StreamConfigurationMap = ((i29 ^ i30) + ((i30 & i29) << 1)) % 128;
            if (getHighResolutionOutputSizeshNQ4ISI(util.h.xy.e.rc.ma.getHighSpeedVideoFpsRanges((util.h.xy.e.rc.ma) it2.next()))) {
                int i31 = getHighSpeedVideoFpsRangesFor;
                int i32 = i31 & 85;
                int i33 = -(-((i31 ^ 85) | i32));
                int i34 = ((i32 & i33) + (i33 | i32)) % 128;
                Camera2StreamConfigurationMap = i34;
                int i35 = i34 & 101;
                int i36 = -(-((i34 ^ 101) | i35));
                getHighSpeedVideoFpsRangesFor = (((i35 | i36) << 1) - (i35 ^ i36)) % 128;
                z = true;
            }
            int i37 = Camera2StreamConfigurationMap;
            int i38 = i37 & 87;
            int i39 = i37 | 87;
            getHighSpeedVideoFpsRangesFor = ((i38 ^ i39) + ((i39 & i38) << 1)) % 128;
        }
        this.getOutputSizes.clear();
        arrayList2.clear();
        arrayList.clear();
        arrayList3.clear();
        int i40 = getInputSizeshNQ4ISI + 21;
        getInputFormats = i40 % 128;
        if (i40 % 2 == 0) {
            int i41 = getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap = ((i41 | 125) / (i41 ^ 125)) << 3311;
            return z;
        }
        int i42 = getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (((i42 | 105) << 1) - (i42 ^ 105)) % 128;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.Object[] objArr;
        java.util.List asList;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i ^ 57) | (i & 57)) << 1;
        int i3 = -((i & (-58)) | ((~i) & 57));
        Camera2StreamConfigurationMap = (((i2 | i3) << 1) - (i2 ^ i3)) % 128;
        if (str != null) {
            int i4 = i & 31;
            int i5 = ((i ^ 31) | i4) << 1;
            int i6 = -((i | 31) & (~i4));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            Camera2StreamConfigurationMap = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            getInputFormats = (getInputSizeshNQ4ISI + 63) % 128;
            if (str.trim().length() != 0) {
                try {
                    android.content.pm.PackageManager packageManager = this.getOutputSizeshNQ4ISI;
                    int i8 = getHighSpeedVideoFpsRangesFor;
                    int i9 = i8 & 91;
                    int i10 = (i8 ^ 91) | i9;
                    int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                    Camera2StreamConfigurationMap = i11;
                    int i12 = getInputSizeshNQ4ISI + 61;
                    getInputFormats = i12 % 128;
                    if (i12 % 2 == 0) {
                        getHighSpeedVideoFpsRangesFor = ((i11 ^ 86) % ((i11 & 86) - 1)) * 2576;
                    } else {
                        int i13 = (i11 ^ 108) + ((i11 & 108) << 1);
                        getHighSpeedVideoFpsRangesFor = ((~i13) + (i13 << 1)) % 128;
                    }
                    try {
                        java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(227, 33, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 14, (char) 0).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(packageManager, str, 4096);
                        if (invoke != null) {
                            int i14 = Camera2StreamConfigurationMap;
                            int i15 = (i14 & (-12)) | ((~i14) & 11);
                            int i16 = (i14 & 11) << 1;
                            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                            getHighSpeedVideoFpsRangesFor = i17 % 128;
                            if (i17 % 2 != 0) {
                                objArr = (java.lang.Object[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(304, 20, (char) 0).intern()).get(invoke);
                                if (objArr != null) {
                                    getInputFormats = (getInputSizeshNQ4ISI + 17) % 128;
                                    asList = java.util.Arrays.asList(objArr);
                                    if (asList == null) {
                                    }
                                }
                                int i18 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = ((i18 ^ 101) + ((i18 & 101) << 1)) % 128;
                                Camera2StreamConfigurationMap = ((-2) - (~((i18 ^ 52) + ((i18 & 52) << 1)))) % 128;
                                return false;
                            }
                            objArr = (java.lang.Object[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(20007, 15, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(15761, 20, (char) 0).intern()).get(invoke);
                            if (objArr == null) {
                                int i182 = getHighSpeedVideoFpsRangesFor;
                                Camera2StreamConfigurationMap = ((i182 ^ 101) + ((i182 & 101) << 1)) % 128;
                                Camera2StreamConfigurationMap = ((-2) - (~((i182 ^ 52) + ((i182 & 52) << 1)))) % 128;
                                return false;
                            }
                            asList = java.util.Arrays.asList(objArr);
                            if (asList == null) {
                                int i19 = getInputSizeshNQ4ISI + 47;
                                getInputFormats = i19 % 128;
                                if (i19 % 2 != 0) {
                                    int i20 = Camera2StreamConfigurationMap;
                                    int i21 = (i20 | 103) << 1;
                                    int i22 = -(i20 ^ 103);
                                    int i23 = (i21 & i22) + (i22 | i21);
                                    getHighSpeedVideoFpsRangesFor = i23 % 128;
                                    if (i23 % 2 == 0) {
                                        asList.size();
                                        throw null;
                                    }
                                    if (asList.size() > 0) {
                                        getInputSizeshNQ4ISI = (getInputFormats + 91) % 128;
                                        java.util.Iterator it = java.util.Arrays.asList(getHighSpeedVideoFpsRangesFor(324, 26, (char) 51454).intern(), getHighSpeedVideoFpsRangesFor(350, 41, (char) 7711).intern(), getHighSpeedVideoFpsRangesFor(391, 37, (char) 57414).intern(), getHighSpeedVideoFpsRangesFor(428, 34, (char) 43832).intern(), getHighSpeedVideoFpsRangesFor(462, 27, (char) 1077).intern(), getHighSpeedVideoFpsRangesFor(489, 39, (char) 34639).intern(), getHighSpeedVideoFpsRangesFor(528, 43, (char) 55239).intern(), getHighSpeedVideoFpsRangesFor(571, 41, (char) 59679).intern(), getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, 28, (char) 0).intern(), getHighSpeedVideoFpsRangesFor(640, 40, (char) 45990).intern()).iterator();
                                        int i24 = getInputSizeshNQ4ISI + 55;
                                        getInputFormats = i24 % 128;
                                        if (i24 % 2 == 0) {
                                            throw new java.lang.ArithmeticException();
                                        }
                                        int i25 = getHighSpeedVideoFpsRangesFor;
                                        int i26 = ((i25 ^ 93) | (i25 & 93)) << 1;
                                        int i27 = -((i25 & (-94)) | ((~i25) & 93));
                                        Camera2StreamConfigurationMap = ((i26 ^ i27) + ((i27 & i26) << 1)) % 128;
                                        while (it.hasNext()) {
                                            int i28 = getHighSpeedVideoFpsRangesFor;
                                            int i29 = i28 | 67;
                                            int i30 = i29 << 1;
                                            int i31 = -((~(i28 & 67)) & i29);
                                            Camera2StreamConfigurationMap = ((i30 ^ i31) + ((i31 & i30) << 1)) % 128;
                                            if (!asList.contains((java.lang.String) it.next())) {
                                                int i32 = Camera2StreamConfigurationMap;
                                                int i33 = i32 & 7;
                                                int i34 = ((i32 ^ 7) | i33) << 1;
                                                int i35 = -((i32 | 7) & (~i33));
                                                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                                                getHighSpeedVideoFpsRangesFor = i36 % 128;
                                                if (i36 % 2 == 0) {
                                                    getInputSizeshNQ4ISI = (getInputFormats + 103) % 128;
                                                }
                                                return false;
                                            }
                                            getInputSizeshNQ4ISI = (getInputFormats + 91) % 128;
                                            int i37 = getHighSpeedVideoFpsRangesFor;
                                            Camera2StreamConfigurationMap = (((i37 | 51) << 1) - (i37 ^ 51)) % 128;
                                        }
                                        getInputFormats = (getInputSizeshNQ4ISI + 111) % 128;
                                    }
                                }
                            } else {
                                getInputSizeshNQ4ISI = (getInputFormats + 21) % 128;
                            }
                        }
                        int i38 = getHighSpeedVideoFpsRangesFor;
                        int i39 = (i38 & (-54)) | ((~i38) & 53);
                        int i40 = -(-((i38 & 53) << 1));
                        Camera2StreamConfigurationMap = ((i39 ^ i40) + ((i39 & i40) << 1)) % 128;
                        Camera2StreamConfigurationMap = ((i38 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i38 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
                        return true;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return false;
                }
            }
        }
        throw new util.h.xy.c.ma(104, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a7, code lost:
    
        r0 = (android.content.pm.Signature[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(691, 30, 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(739, 28, 52589).intern(), null).invoke(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ca, code lost:
    
        r2 = util.h.xy.e.rc.Camera2StreamConfigurationMap;
        util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor = ((r2 & 17) + (r2 | 17)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d8, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dc, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01de, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01df, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e0, code lost:
    
        r2 = util.h.xy.e.rc.Camera2StreamConfigurationMap;
        r11 = r2 ^ 105;
        r2 = ((r2 & 105) | r11) << 1;
        r11 = -r11;
        r12 = ((r2 ^ r11) + ((r2 & r11) << 1)) % 128;
        util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor = r12;
        util.h.xy.e.rc.Camera2StreamConfigurationMap = (((r12 & 90) + (r12 | 90)) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fc, code lost:
    
        r0 = (android.content.pm.Signature[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(691, 30, 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(767, 21, 0).intern(), null).invoke(r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021e, code lost:
    
        r2 = util.h.xy.e.rc.getInputSizeshNQ4ISI + 7;
        util.h.xy.e.rc.getInputFormats = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0227, code lost:
    
        if ((r2 % 2) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0229, code lost:
    
        r2 = util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor;
        util.h.xy.e.rc.Camera2StreamConfigurationMap = (((((r2 ^ 115) | (r2 & 115)) << 1) - (~(-((r2 & (-116)) | ((~r2) & 115))))) - 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0245, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0246, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0247, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024b, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x024e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x024f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0250, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0254, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0256, code lost:
    
        r0 = util.h.xy.e.rc.getInputSizeshNQ4ISI + 1;
        util.h.xy.e.rc.getInputFormats = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x025e, code lost:
    
        if ((r0 % 2) == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0268, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0265, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0269, code lost:
    
        util.h.xy.e.rc.getInputSizeshNQ4ISI = (util.h.xy.e.rc.getInputFormats + 57) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0271, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x012c, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0101, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0272, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012e, code lost:
    
        r9 = util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor;
        util.h.xy.e.rc.Camera2StreamConfigurationMap = ((((r9 | 75) << 1) - (~(-((r9 & (-76)) | ((~r9) & 75))))) - 1) % 128;
        r11 = r9 ^ 23;
        r9 = r9 & 23;
        util.h.xy.e.rc.Camera2StreamConfigurationMap = ((r9 << 1) + r11) % 128;
        util.h.xy.e.rc.Camera2StreamConfigurationMap = (r9 + (r11 | r9)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017a, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(691, 30, 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(721, 18, 0).intern(), null).invoke(r0, null)).booleanValue() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017c, code lost:
    
        r11 = util.h.xy.e.rc.Camera2StreamConfigurationMap;
        util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor = (r11 + 115) % 128;
        r12 = r11 ^ 49;
        r13 = (r11 & 49) << 1;
        util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor = ((r12 ^ r13) + ((r12 & r13) << 1)) % 128;
        r12 = ((r11 | 47) << 1) - (r11 ^ 47);
        util.h.xy.e.rc.getHighSpeedVideoFpsRangesFor = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019d, code lost:
    
        if ((r12 % 2) == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019f, code lost:
    
        util.h.xy.e.rc.getInputSizeshNQ4ISI = (util.h.xy.e.rc.getInputFormats + 69) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i;
        android.content.pm.Signature[] signatureArr;
        java.lang.Object obj;
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 & 17;
        int i4 = i3 + ((i2 ^ 17) | i3);
        int i5 = i4 % 128;
        Camera2StreamConfigurationMap = i5;
        if (i4 % 2 != 0) {
            getInputFormats = (getInputSizeshNQ4ISI + 117) % 128;
            throw null;
        }
        if (str != null) {
            int i6 = i5 | 9;
            int i7 = i6 << 1;
            int i8 = -((~(i5 & 9)) & i6);
            int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
            getHighSpeedVideoFpsRangesFor = i9 % 128;
            if (i9 % 2 == 0) {
                throw null;
            }
            if (str.trim().length() != 0) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    getInputSizeshNQ4ISI = (getInputFormats + 1) % 128;
                    int i10 = Camera2StreamConfigurationMap;
                    int i11 = (i10 & (-104)) | ((~i10) & 103);
                    int i12 = -(-((i10 & 103) << 1));
                    int i13 = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                    getHighSpeedVideoFpsRangesFor = i13;
                    int i14 = i13 & 37;
                    int i15 = -(-((i13 ^ 37) | i14));
                    Camera2StreamConfigurationMap = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
                    i = 134217792;
                } else {
                    i = 64;
                }
                try {
                    android.content.pm.PackageManager packageManager = this.getOutputSizeshNQ4ISI;
                    int i16 = getHighSpeedVideoFpsRangesFor;
                    int i17 = i16 ^ 39;
                    int i18 = ((i16 & 39) | i17) << 1;
                    int i19 = -i17;
                    int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                    Camera2StreamConfigurationMap = i20 % 128;
                    int i21 = i20 % 2;
                    try {
                        java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(227, 33, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 14, (char) 0).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(packageManager, str, java.lang.Integer.valueOf(i));
                        if (invoke != null) {
                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                            if (android.os.Build.VERSION.SDK_INT >= 28) {
                                int i22 = (-2) - (~(getHighSpeedVideoFpsRangesFor + 84));
                                Camera2StreamConfigurationMap = i22 % 128;
                                if (i22 % 2 != 0) {
                                    obj = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(9950, 111, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(16091, 22, (char) 0).intern()).get(invoke);
                                } else {
                                    getInputSizeshNQ4ISI = (getInputFormats + 21) % 128;
                                    obj = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(680, 11, (char) 0).intern()).get(invoke);
                                }
                                int i23 = getHighSpeedVideoFpsRangesFor + 6;
                                Camera2StreamConfigurationMap = ((~i23) + (i23 << 1)) % 128;
                            } else {
                                signatureArr = (android.content.pm.Signature[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(788, 10, (char) 60214).intern()).get(invoke);
                                int i24 = Camera2StreamConfigurationMap;
                                int i25 = i24 ^ 71;
                                getHighSpeedVideoFpsRangesFor = ((((i24 & 71) | i25) << 1) - i25) % 128;
                            }
                        } else {
                            signatureArr = null;
                        }
                        if (signatureArr != null) {
                            int i26 = Camera2StreamConfigurationMap;
                            int i27 = i26 & 37;
                            int i28 = (~i27) & (i26 | 37);
                            int i29 = -(-(i27 << 1));
                            getHighSpeedVideoFpsRangesFor = (((i28 | i29) << 1) - (i29 ^ i28)) % 128;
                            int length = signatureArr.length;
                            int i30 = i26 & 61;
                            getHighSpeedVideoFpsRangesFor = (((i26 | 61) & (~i30)) + (i30 << 1)) % 128;
                            int i31 = 0;
                            while (i31 < length) {
                                int i32 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoFpsRangesFor = ((i32 ^ 37) + ((i32 & 37) << 1)) % 128;
                                android.content.pm.Signature signature = signatureArr[i31];
                                java.lang.String intern = getHighSpeedVideoFpsRangesFor(798, 4, (char) 12555).intern();
                                int i33 = Camera2StreamConfigurationMap + 11;
                                getHighSpeedVideoFpsRangesFor = i33 % 128;
                                if (i33 % 2 == 0) {
                                    int i34 = 4 / 3;
                                } else {
                                    getInputSizeshNQ4ISI = (getInputFormats + 25) % 128;
                                }
                                try {
                                    java.lang.Object invoke2 = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(802, 27, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(829, 11, (char) 18199).intern(), java.lang.String.class).invoke(null, intern);
                                    int i35 = Camera2StreamConfigurationMap;
                                    int i36 = (i35 & 37) + (i35 | 37);
                                    getHighSpeedVideoFpsRangesFor = i36 % 128;
                                    if (i36 % 2 == 0) {
                                        int i37 = 2 / 2;
                                    }
                                    try {
                                        java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(802, 27, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, 5, (char) 0).intern(), null).invoke(invoke2, null);
                                        byte[] byteArray = signature.toByteArray();
                                        int i38 = Camera2StreamConfigurationMap;
                                        int i39 = (i38 & (-70)) | ((~i38) & 69);
                                        int i40 = -(-((i38 & 69) << 1));
                                        int i41 = ((i39 ^ i40) + ((i40 & i39) << 1)) % 128;
                                        getHighSpeedVideoFpsRangesFor = i41;
                                        Camera2StreamConfigurationMap = (i41 + 107) % 128;
                                        try {
                                            java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(802, 27, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(845, 6, (char) 0).intern(), byte[].class).invoke(invoke2, byteArray);
                                            int i42 = getHighSpeedVideoFpsRangesFor;
                                            int i43 = ((i42 ^ 43) | (i42 & 43)) << 1;
                                            int i44 = -((i42 & (-44)) | ((~i42) & 43));
                                            Camera2StreamConfigurationMap = (((i43 | i44) << 1) - (i43 ^ i44)) % 128;
                                            Camera2StreamConfigurationMap = (((i42 & 36) + (i42 | 36)) - 1) % 128;
                                            try {
                                                if (java.util.Arrays.equals((byte[]) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(802, 27, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(851, 6, (char) 26585).intern(), null).invoke(invoke2, null), this.getOutputStallDuration)) {
                                                    int i45 = getHighSpeedVideoFpsRangesFor;
                                                    int i46 = (i45 & (-122)) | ((~i45) & 121);
                                                    int i47 = -(-((i45 & 121) << 1));
                                                    int i48 = (i46 & i47) + (i46 | i47);
                                                    Camera2StreamConfigurationMap = i48 % 128;
                                                    boolean z = i48 % 2 == 0;
                                                    int i49 = i45 ^ 47;
                                                    int i50 = ((i45 & 47) | i49) << 1;
                                                    int i51 = -i49;
                                                    Camera2StreamConfigurationMap = (((i50 | i51) << 1) - (i50 ^ i51)) % 128;
                                                    return z;
                                                }
                                                i31 = (i31 ^ 1) + ((i31 & 1) << 1);
                                                int i52 = getHighSpeedVideoFpsRangesFor;
                                                int i53 = i52 & 95;
                                                int i54 = ((i52 ^ 95) | i53) << 1;
                                                int i55 = -((i52 | 95) & (~i53));
                                                Camera2StreamConfigurationMap = ((i54 ^ i55) + ((i55 & i54) << 1)) % 128;
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
                            }
                        } else {
                            getInputFormats = (getInputSizeshNQ4ISI + 15) % 128;
                        }
                        int i56 = getHighSpeedVideoFpsRangesFor;
                        int i57 = i56 & 1;
                        int i58 = (~i57) & (i56 | 1);
                        int i59 = i57 << 1;
                        Camera2StreamConfigurationMap = (((i58 | i59) << 1) - (i59 ^ i58)) % 128;
                        Camera2StreamConfigurationMap = ((((i56 | 112) << 1) - (i56 ^ 112)) - 1) % 128;
                        return false;
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
                    return false;
                }
            }
        } else {
            getInputFormats = (getInputSizeshNQ4ISI + 115) % 128;
        }
        throw new util.h.xy.c.ma(104, null);
    }

    private void Camera2StreamConfigurationMap(java.util.List<java.lang.String> list, boolean z) {
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3 = getInputSizeshNQ4ISI;
        getInputFormats = (i3 + 105) % 128;
        int i4 = i3 + 73;
        getInputFormats = i4 % 128;
        int i5 = 2;
        int i6 = 90;
        if (i4 % 2 == 0) {
            int i7 = Camera2StreamConfigurationMap;
            int i8 = i7 & 90;
            int i9 = (i7 | 90) & (~i8);
            int i10 = -(-i8);
            getHighSpeedVideoFpsRangesFor = ((i9 ^ i10) >>> ((i9 & i10) << 1)) >>> 14907;
        } else {
            int i11 = Camera2StreamConfigurationMap;
            int i12 = i11 & 109;
            int i13 = (i11 | 109) & (~i12);
            int i14 = -(-(i12 << 1));
            getHighSpeedVideoFpsRangesFor = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
        }
        java.util.Iterator<java.lang.String> it = list.iterator();
        int i15 = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = ((((i15 | 71) << 1) - (~(-(i15 ^ 71)))) - 1) % 128;
        while (it.hasNext()) {
            int i16 = getHighSpeedVideoFpsRangesFor;
            int i17 = i16 & 79;
            int i18 = -(-((i16 ^ 79) | i17));
            int i19 = (i17 & i18) + (i18 | i17);
            Camera2StreamConfigurationMap = i19 % 128;
            if (i19 % i5 != 0) {
                getInputSizeshNQ4ISI = (getInputFormats + 45) % 128;
                it.next();
                throw null;
            }
            java.lang.String next = it.next();
            int i20 = getHighSpeedVideoFpsRangesFor;
            int i21 = i20 & 7;
            Camera2StreamConfigurationMap = ((((i20 ^ 7) | i21) << 1) - ((i20 | 7) & (~i21))) % 128;
            try {
                java.lang.Object newInstance = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(857, 22, (char) 27758).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(next);
                int i22 = 15;
                if (z) {
                    int i23 = getHighSpeedVideoFpsRangesFor;
                    int i24 = i23 & 73;
                    int i25 = i24 + ((i23 ^ 73) | i24);
                    Camera2StreamConfigurationMap = i25 % 128;
                    java.lang.String intern = (i25 % i5 != 0 ? getHighSpeedVideoFpsRangesFor(31214, i6, (char) 41400) : getHighSpeedVideoFpsRangesFor(879, 10, (char) 41400)).intern();
                    int i26 = Camera2StreamConfigurationMap;
                    int i27 = i26 & 79;
                    int i28 = ((i26 ^ 79) | i27) << 1;
                    int i29 = -((i26 | 79) & (~i27));
                    int i30 = ((i28 & i29) + (i29 | i28)) % 128;
                    getHighSpeedVideoFpsRangesFor = i30;
                    Camera2StreamConfigurationMap = ((i30 & 35) + (i30 | 35)) % 128;
                    try {
                        java.lang.Object invoke = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(889, 15, (char) 0).intern()).getMethod(getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN, 5, (char) 0).intern(), java.lang.String.class).invoke(null, intern);
                        int i31 = getHighSpeedVideoFpsRangesFor;
                        int i32 = (i31 ^ 48) + ((i31 & 48) << 1);
                        int i33 = ((~i32) + (i32 << 1)) % 128;
                        Camera2StreamConfigurationMap = i33;
                        int i34 = i33 | 117;
                        int i35 = i34 << 1;
                        int i36 = -((~(i33 & 117)) & i34);
                        getHighSpeedVideoFpsRangesFor = (((i35 | i36) << 1) - (i36 ^ i35)) % 128;
                        try {
                            java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(857, 22, (char) 27758).intern()).getMethod(getHighSpeedVideoFpsRangesFor(909, 7, (char) 21909).intern(), java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(889, 15, (char) 0).intern())).invoke(newInstance, invoke);
                            int i37 = getHighSpeedVideoFpsRangesFor;
                            Camera2StreamConfigurationMap = (((i37 | 31) << 1) - (i37 ^ 31)) % 128;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                android.content.pm.PackageManager packageManager = this.getOutputSizeshNQ4ISI;
                int i38 = Camera2StreamConfigurationMap;
                int i39 = i38 & 3;
                int i40 = (i39 + ((i38 ^ 3) | i39)) % 128;
                getHighSpeedVideoFpsRangesFor = i40;
                int i41 = i40 & 83;
                Camera2StreamConfigurationMap = (i41 + ((i40 ^ 83) | i41)) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[i5];
                    objArr[1] = 524288;
                    objArr[0] = newInstance;
                    java.lang.Class<?> cls = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(227, 33, (char) 0).intern());
                    java.lang.String intern2 = getHighSpeedVideoFpsRangesFor(916, 23, (char) 48492).intern();
                    java.lang.Class<?>[] clsArr = new java.lang.Class[i5];
                    clsArr[0] = java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(857, 22, (char) 27758).intern());
                    clsArr[1] = java.lang.Integer.TYPE;
                    java.util.List list2 = (java.util.List) cls.getMethod(intern2, clsArr).invoke(packageManager, objArr);
                    if (list2 != null) {
                        int i42 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = (((i42 ^ 64) + ((i42 & 64) << 1)) - 1) % 128;
                        int i43 = Camera2StreamConfigurationMap;
                        getHighSpeedVideoFpsRangesFor = ((-2) - (~((i43 ^ 98) + ((i43 & 98) << 1)))) % 128;
                        for (java.lang.Object obj : list2) {
                            int i44 = Camera2StreamConfigurationMap;
                            int i45 = i44 ^ 17;
                            int i46 = ((i44 & 17) | i45) << 1;
                            int i47 = -i45;
                            getHighSpeedVideoFpsRangesFor = (((i46 | i47) << 1) - (i46 ^ i47)) % 128;
                            if (java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(939, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(969, 12, (char) 0).intern()).get(obj) != null) {
                                int i48 = Camera2StreamConfigurationMap;
                                getHighSpeedVideoFpsRangesFor = ((i48 & 115) + (i48 | 115)) % 128;
                                if (java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(981, 31, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(1012, i22, (char) 55269).intern()).get(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(939, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(969, 12, (char) 0).intern()).get(obj)) != null) {
                                    getInputFormats = (getInputSizeshNQ4ISI + 105) % 128;
                                    int i49 = getHighSpeedVideoFpsRangesFor;
                                    int i50 = i49 & 5;
                                    int i51 = (i49 ^ 5) | i50;
                                    Camera2StreamConfigurationMap = ((i50 & i51) + (i51 | i50)) % 128;
                                    if ((java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3, 34, (char) 14227).intern()).getField(getHighSpeedVideoFpsRangesFor(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST, 5, (char) 45966).intern()).getInt(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(981, 31, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(1012, i22, (char) 55269).intern()).get(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(939, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(969, 12, (char) 0).intern()).get(obj))) & 1) != 0) {
                                        int i52 = getHighSpeedVideoFpsRangesFor;
                                        Camera2StreamConfigurationMap = ((((i52 | 68) << 1) - (i52 ^ 68)) - 1) % 128;
                                        int i53 = i52 ^ 79;
                                        int i54 = (i52 & 79) << 1;
                                        Camera2StreamConfigurationMap = ((i53 ^ i54) + ((i54 & i53) << 1)) % 128;
                                        z2 = true;
                                    } else {
                                        int i55 = getHighSpeedVideoFpsRangesFor;
                                        int i56 = ((i55 | 102) << 1) - (i55 ^ 102);
                                        Camera2StreamConfigurationMap = ((~i56) + (i56 << 1)) % 128;
                                        z2 = false;
                                    }
                                    i = 15;
                                    java.lang.String str = (java.lang.String) java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3, 34, (char) 14227).intern()).getField(getHighSpeedVideoFpsRangesFor(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_ALTERNATE_DUOTONE_COLORS, 11, (char) 39769).intern()).get(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(981, 31, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(1012, 15, (char) 55269).intern()).get(java.lang.Class.forName(getHighSpeedVideoFpsRangesFor(939, 30, (char) 0).intern()).getField(getHighSpeedVideoFpsRangesFor(969, 12, (char) 0).intern()).get(obj)));
                                    if (!z2) {
                                        int i57 = Camera2StreamConfigurationMap;
                                        int i58 = i57 & 81;
                                        getHighSpeedVideoFpsRangesFor = ((((i57 ^ 81) | i58) << 1) - ((i57 | 81) & (~i58))) % 128;
                                        if (this.getOutputSizes.size() > 0) {
                                            int i59 = getHighSpeedVideoFpsRangesFor;
                                            int i60 = (-2) - (~(((i59 | 46) << 1) - (i59 ^ 46)));
                                            Camera2StreamConfigurationMap = i60 % 128;
                                            if (i60 % 2 != 0) {
                                                this.getOutputSizes.iterator();
                                                throw null;
                                            }
                                            java.util.Iterator<util.h.xy.e.rc.ma> it2 = this.getOutputSizes.iterator();
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                                            i2 = 0;
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    z3 = false;
                                                    break;
                                                }
                                                int i61 = Camera2StreamConfigurationMap;
                                                int i62 = i61 & 7;
                                                int i63 = (i61 ^ 7) | i62;
                                                int i64 = (i62 & i63) + (i63 | i62);
                                                getHighSpeedVideoFpsRangesFor = i64 % 128;
                                                if (i64 % 2 == 0) {
                                                    getInputSizeshNQ4ISI = (getInputFormats + 79) % 128;
                                                }
                                                if (util.h.xy.e.rc.ma.getHighSpeedVideoFpsRanges(it2.next()).equals(str)) {
                                                    int i65 = Camera2StreamConfigurationMap;
                                                    int i66 = (i65 & 41) + (i65 | 41);
                                                    int i67 = i66 % 128;
                                                    getHighSpeedVideoFpsRangesFor = i67;
                                                    z3 = i66 % 2 != 0;
                                                    Camera2StreamConfigurationMap = ((i67 ^ 43) + ((i67 & 43) << 1)) % 128;
                                                } else {
                                                    getInputFormats = (getInputSizeshNQ4ISI + 87) % 128;
                                                    int i68 = i2 & (-56);
                                                    int i69 = ((i2 ^ (-56)) | i68) << 1;
                                                    int i70 = -((i2 | (-56)) & (~i68));
                                                    i2 = (i69 ^ i70) + ((i70 & i69) << 1) + 57;
                                                    int i71 = getHighSpeedVideoFpsRangesFor;
                                                    Camera2StreamConfigurationMap = (((i71 & (-36)) | ((~i71) & 35)) + ((i71 & 35) << 1)) % 128;
                                                }
                                            }
                                        } else {
                                            i2 = 0;
                                            z3 = false;
                                        }
                                        if (z3) {
                                            int i72 = Camera2StreamConfigurationMap;
                                            int i73 = i72 ^ 89;
                                            getHighSpeedVideoFpsRangesFor = ((((i72 & 89) | i73) << 1) - i73) % 128;
                                            this.getOutputSizes.get(i2).getHighResolutionOutputSizeshNQ4ISI(next);
                                            int i74 = Camera2StreamConfigurationMap;
                                            int i75 = i74 & 105;
                                            getHighSpeedVideoFpsRangesFor = (((((i74 ^ 105) | i75) << 1) - (~(-((i74 | 105) & (~i75))))) - 1) % 128;
                                        } else {
                                            this.getOutputSizes.add(new util.h.xy.e.rc.ma(str, next));
                                            int i76 = getHighSpeedVideoFpsRangesFor;
                                            Camera2StreamConfigurationMap = (((i76 | 87) << 1) - ((i76 & (-88)) | ((~i76) & 87))) % 128;
                                        }
                                    }
                                    int i77 = getHighSpeedVideoFpsRangesFor;
                                    int i78 = i77 & 49;
                                    int i79 = -(-((i77 ^ 49) | i78));
                                    Camera2StreamConfigurationMap = ((i78 ^ i79) + ((i79 & i78) << 1)) % 128;
                                    i22 = i;
                                }
                            }
                            i = i22;
                            int i772 = getHighSpeedVideoFpsRangesFor;
                            int i782 = i772 & 49;
                            int i792 = -(-((i772 ^ 49) | i782));
                            Camera2StreamConfigurationMap = ((i782 ^ i792) + ((i792 & i782) << 1)) % 128;
                            i22 = i;
                        }
                        getInputFormats = (getInputSizeshNQ4ISI + 119) % 128;
                    } else {
                        getInputSizeshNQ4ISI = (getInputFormats + 3) % 128;
                    }
                    int i80 = getInputFormats + 37;
                    getInputSizeshNQ4ISI = i80 % 128;
                    if (i80 % 2 != 0) {
                        int i81 = Camera2StreamConfigurationMap << (-60);
                        getHighSpeedVideoFpsRangesFor = i81 * 5668;
                        int i82 = i81 / 2;
                        i5 = 2;
                    } else {
                        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 19) % 128;
                        i5 = 2;
                    }
                    i6 = 90;
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        int i83 = getHighSpeedVideoFpsRangesFor;
        int i84 = (((i83 & (-46)) | ((~i83) & 45)) - (~((i83 & 45) << 1))) - 1;
        Camera2StreamConfigurationMap = i84 % 128;
        if (i84 % 2 == 0) {
            return;
        }
        getInputFormats = (getInputSizeshNQ4ISI + 77) % 128;
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        Camera2StreamConfigurationMap = 0;
        getHighSpeedVideoFpsRangesFor = 1;
        char[] cArr = new char[1077];
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2154, android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int green = android.graphics.Color.green(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(green + 10, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 2155, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 1077);
        getHighSpeedVideoSizesFor = cArr;
        getOutputMinFrameDuration = 3662546697399605236L;
        int i = getInputFormats + 125;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        char[] cArr = new char[2164];
        java.nio.ByteBuffer.wrap("\u009c\u0001}V^ú?9\u0018öú\u0083Û\u0082´Õ\u0095îvXPê1þ\u0012\u0006ócÌÒ®©\u008fÞhTI\u009a+ø\u0004Öå\u0089Æ\"§Ó\u0081\u000ebRCÊ\\¹=¦\u001f3ø²Ùéº¾\u009bôu:V876\u0010\u0089òBÓS¬®\u008dÒnªHo)G\nóëµÄ\u008c¦¶\u0087Æ`¢A_\"><£\u001d:þ*ß&¹ \u009a²{ T\u008e5\u0012\u0017ªð\u008cÑÖ²F\u0093\u0002mæNÞ/\u0092\bÚéåË\u0086¤b\u0085Òfì@î!\u0016\u0002\nã\u0099üáÞZ¿Ú\u0098\u0016y\u0096Z`4â\u0015îöÎ×d°\n\u0092\u009csæL\u0007-ò\u000fêèþÉ¶ªú\u008b\u0019eöF¦'\u0002\u0000 áîÃ2Üê½\u0085\u009eÉ\u007f\u009cY¢:ð\u001b\u008eôRÖÊ·±\u0090&q\u000bR\u0012,°\rÞîOÏ\u009a¨5\u008a\u0096k\u0090DÂ%7\u0007îàÑÁê¢¨\u0083Æ\u009d\n~ò_18þ\u0019ÒûúÔ~µö\u0096\u0098wâQv2Î\u0013Ìì\u008aÎt¯F\u0088\u0098iMJ×$A\u0005]æÅÇ\u008b É\u00826cÝ|°]1>½\u0018uùwÚY»\u0090\u0095-vWWá0Í\u0011%ó\u009cÌ)\u00ad÷\u008e}omI\u0011*·\u000b\u0015äxÅù§\u009a\u0080\raMB\u0001\\Ð=\u0005\u001e\u0096ÿ\tØ7º\u001d\u009b÷tðU\u008964\u0010\u0018ñ\u0018Òº³l\u008còn Ox(ä\t¾ëèÄ\\¥<\u0086ÆgPA_\"T\u0003Ì\u001c8ýµßÌ¸õ\u0099Àz`[D5¦\u0016H÷\u000bÐ\\²\u009c\u0093°l\u0094Mô.\u0016\bØé¯Ê¬«|\u0084`fýG] ò\u0001^âeü\u001aÝç¾f\u009fyyRZü;\u008e\u0014\u0002õj×Ç°v\u0091\u0005r\u0002S:-~\u000e¥ïzÈ7ª\u0086\u008b.drE½&n\u0000\u001fá\nÂ\r£V¼Ê\u009eb\u007fpX\u009e9ÿ\u001aZôjÕ&¶ä\u0097\u0012q}RN3E\f«ísÏ·¨ê\u0089Cj\u0010K?%\u0080\u0006;ç\u0002ÀÇ¡\f\u0083³\u009c\u0096}¯^48Ë\u0019ñú\u0017Ûn´#\u0096ÃwßPG1\u009b\u0012ÂìçÍH®Ó\u008fÖh\u000fJ/+\u0084\u0004\u0015å§Çr ó\u0081\u0010b\u008fC\u009e]«>\u001b\u001f\u0097øõÙ\u0083»\u0010\u0094\u009fuâV\u009b7Ý\u0011\u0087òrÓ\u0093¬À\u008eooÉH\u008b)Z\n·äèÅã¦\u001a\u0087¿`-B»#\u0097<g\u001dhþ³Ø\u009d¹Ï\u009a\u0003{ëU\u009a6×\u0017²ðBÑ¶³^\u008c\u0003mZNû/Æ\tHêÒËë¤.\u0085ïgJ@{!v\u0002Ñ\u001c\"ýdÞþ¿\u0080\u0098úz1[&4H\u0015rö1Ð\u000e±¨\u0092·sJM´.M\u000f`èÏÉ<«A\u00848e$Fd'ª\u0001°âoÃ\u008cÜÝ½h\u009f\u0002x\u0014Y\u008d:\u0000\u0014\u001fõ\u009cÖ\u0096·\u0098\u0090%r\u0084S·,\u0010\r%î,ÈÒ©\b\u008aHkôDW& \u0007ÂàüÁ\\£ø¼¥\u009d$~m_ñ9G\u001aÍû<Ô©µ¨\u0097Õp\"QÁ2§\u0013Ýí6ÎÙ¯\u0094\u0088Åj\u0000KÑ$C\u0005íæòÀÉ¡e\u00825cd|á^î?½\u0018wùÅÚ\u009a´¦\u0095ýv²W_1Î\u0012\u0091ó*Ì\u0014\u00ad\u0016\u008fºhÂI_*\u009e\u000bmå\u009aÆ\u0098§Æ\u0080<a\u0012CÕ\\î=\u0097\u001eÊø\u001eÙöº}\u009bâtÏVþ7-\u0010úñ\u008bÒæ¬~\u008dòn\u0095O\u008e(³\nêë\u001aÄÖ¥°\u0087\u0003`ÐAß\"\"\u0003Û\u001d\u009cþ\u0087ß6¸Ó\u0099v{/T\u00825\u000b\u0016\u0015ð7Ñò²£\u0093\\l¿Næ/»\b\u0089é±Ê\u0080¤\u008a\u0085Âf¦G# 2\u0002§ã>ü&Ý:¿¤\u0098¶y¼Z\u0082;\u0016\u0015®ö\u0080×*°B\u0091\u0006sÞLÒ-\u0099\u000eÞïáÉ\u009aªh\u008b\u0099d®F\u0092'¡\u0000^á+Â\u001aÜ½½\u0016\u009eÀ\u007fBXF:®\u001b\u008bôªÕA¶F\u0090ìq2R`3>\ráîºÏ{¨¶\u0089Êk¢DA%Î\u0006\u009bç\nÁA¢&\u0083¿\u009cÒ}¢_\u009e8a\u0019Úú\u009fÔÖµN\u0096\u0002wÌPï2\u0084\u0013ëì\u000eÍ\u0087®h\u0088óiêJÿ+F\u0004ûæáÇ÷ I\u0081ãcÀ|A]\u0005>:\u001frù6ÚÖ»B\u0094\u0012u®W\u00920ª\u0011$òFÓ3\u00ad\u0012\u008e¢o\u001eH\u0013*Z\u000b\u0087ä\u0096ÅB¦b\u0080\u0015aNB\u009a#\n<þ\u001efÿtØr¹ô\u009b~t\u001eUz6ø\u0017vñIÒ\u0002³\u0014\u008cymxOB(7\tnêÍËú¥{\u0086ögÖ@ò\"P\u0003~\u001cMýJÞ§¸f\u0099izâ[¼4Î\u0016\u001b÷\u001aÐd±\u0016\u0092\u0010lRM\u008a.\u001e\u000f\u001aé*Êà«Æ\u0084ve\u0002G· .\u0001\u0087â:Ã_Ý6¾ð\u009f2x{Y?;{\u0014\u000bõÈÖ'°M\u0091#r\u001cS·,¡\u000e\u009cïÎÈ°©$\u008a4d\u0092E\u0018&/\u0007,àIÂ £¤¼¤\u009dN\u007f¨Xð9<\u001aEû\u0010Õò¶Ô\u0097\u008dp¸Qé3\u008c\fSíÀÎó¯\u0004\u0089\tj\bK¯$Ü\u0006NçðÀn¡ô\u0082²\u009cØ}\u0005^ì?ã\u0018áú\u0085Ûå´)\u0095évVPý1å\u0012Ñó_Í\u0015®¢\u008fùhOIÍ+ï\u0004\u0081åTÆÅ§?\u0081Éb\u0083C\u001d\\ï>1\u001f\røµÙ°º\u0099\u0094\fu\u00adVe7!\u0010\u0094ò%Ó%¬)\u008dÄn\u0015H\f)\u0016\nKë\u0002ÅÉ¦\u001e\u0087\u0087`\u001aA\"#\u0006<¬\u001d\u0012þ)ß.¹Û\u009a\n{\u001dTv5@\u0017\"ðßÑþ²\u0098\u008cúmdN&/ö\brê~ËN¤\u001c\u0085*f\u0082@Ö!K\u0002Âã\u0083ü^Þ3¿Z\u0098\u0082yF[\u00174Ó\u0015\u0088öï×2±Ë\u0092¿s·Lj-c\u000føè¿É;ª»\u008bIeçFÚ'³\u0000^â\u008fÃ°Ük½?\u009e\u0097xsY\u0083:ä\u001b\u009fô¶Ö\u009b·\b\u0090:q\u009eRÁ,\u0091\ríî+Ï¹©\u009d\u008aµkðDñ%v\u0007=à«Á\t¢\u0001\u0083å\u009dÏ~¡_Z8\u008d\u0019=û\u0019ÔBµ\u0015\u0096öp\u0011Ql2\u009d\u0013¼ì©Î\u0006¯\u0085\u0088\u0090i\u0001J\u0091$-\u0005aæyÇº¡u\u0082Lc±|Ú]|?\u0090\u0018HùéÚ$»v\u0095`vñWL0\b\u0011XóêÌT\u00adM\u008ePhÏI\\*\u009d\u000bhä&ÆD§±\u0080@a«Bí\\K=Æ\u001e$ÿêØNºî\u009bøtÂUE7ö\u0010£ñúÒN³þ\u008d¤nòO\u009a(æ\t/ëÊÄ\u0098¥\u000e\u0086çgâA\u0003\"Ö\u0003¹\u001c\u009aþ\u0019ßÞ¸c\u0099ÒzÅT\u00065$\u0016*÷\u0084Ð®²C\u0093\u0082läM¶.\u009e\b;éïÊ?«X\u00853f¤G§ \u000f\u0001\u008bã¾üÊÝ\u00ad¾©\u009f:y\u008dZ\u0098;Ñ\u0014&õ%×Ã°\u0019\u0091}rÝL\u0098-á\u000eºï\u0095È|ªÉ\u008bñdíE\u000e&ñ\u0000yáÅÂÅ£ù¼§\u009eý\u007f\u000fXÁ9½\u001bõô#Õé¶º\u0097ÍqRR\u00913\u0095\fåíïÏÙ¨W\u0089\u001cj9D %Ç\u0006Ôç_À\u0088¢Ë\u0083¬\u009c²}0^Q8\u0004\u0019øú8Û\u0003´¼\u0096³w\u0080P\u00061´\u0013\u0087ì(Í\u000b®\f\u008f¯iPJ\u0000+¤\u0004íå\u0098Ç@ \\\u0081¹b\u0016CQ]m>>\u001faø\u0084Ú\u0015»R\u0094ùußVý0y\u0011\u0011òdÓE¬®\u008eIo@H\r)õ\nÁä\u0012Å5¦M\u0087\u0019aÙB]#£<1\u001d3ÿ%Ø©¹)\u009a_{-U¾6!\u0017NðUÑr³9\u008cõm=NA(Ð\tUê\u0004ËÅ¤\b\u0086cgL@Ä!\u0000\u0002¿\u001côýiÞØ¿þ\u0098\u001cz\u0003[p4\u0094\u0015d÷\u0001Ðh±|\u0092ìs\u001cMà.¿\u000f\u0094èpÉx«ñ\u0084|eSF\u0090'K\u0001ÄâÁÃÈÜw¾\u008c\u009fÕx@Y3:\f\u0014eõ/Ö\u0002·{\u0090`r\u0007Sî,#\rkï\u001fÈ\u0085©\u000b\u008a`k\u0017E\u0092&\u0013\u0007´à\u000fÁ\t£\u001b¼¶\u009dç~±_\u00039-\u001a?û\u009fÔk¶7\u00977pUQ32ë\fïí\u0002Î;¯ª\u0088GjKKc$Ö\u0005_æ¥ÀÊ¡Ð\u0082Öcy}Ò^\u009b?N\u0018)ùZÛ\u009c´¦\u0095\u0088vÂW\u00011þ\u0012¾óªÌ\n\u00adv\u008fýhrIH*®\u00043åúÆW§\u0086\u0080Èb¢CK\\\u009e=¾\u001e\u008aøEÙ\u0096ºû\u009b\u0092t\u0081V17\u0006\u0010\nñIÓ&¬³\u008d²n\u0005O¾)¨\nºë.Ä6¥3\u0087\u0002`ÙA.\"\u0017\u0003ª\u001dÂþ\u0086ße¸R\u009a\u001a{^Tn5\u001a\u0016ôðVÑd²b\u0093\u009el\u008eN\b/J\bÉéfÊù¤r\u0085 f~G\u0086!z\u0002\fãwü\u0012ÝC¿¨\u0098oy+Zk;h\u0015GöÔ×\u0093°<\u0092²sðLI-\u009f\u000eEè%É1ªs\u008b]dþFY'X\u0000µáÅÂaÜ\u000f½m\u009eá\u007f)YT:e\u001b3ô\u0091Õl·½\u0090øqyR\u00023\u0015\r\u0092î\u0001Ï\b¨\r\u0089~k\u0089D\u009f%\u0085\u0006oàñÁÓ¢\u001d\u0083T\u009c\u0019~ð_ô8e\u0019 úþÔ¬µT\u0096èwéP$2\u0015\u0013ÐìÄÍü¯C\u0088¸i?JÔ+ \u0005Àæ-ÇÌ Î\u0081Èc¢|Ä]\u0015>°\u001fNùÜÚÃ»Ø\u0094pv4Wæ0à\u0011dòáÌd\u00adÚ\u008e\u001eo\u0096H`*â\u000béäÎÅ~¦\n\u0080\u0099aæB@#ò=î\u001eþÿ¹Øú¹\u0011\u009böt¨U\u00856Ú\u0017fñ½Òr³\u001f\u008c\u000emQOj(Ô\tVêzÄ\u0082¥\u009f\u0086^g-@Z\"Ø\u0003\u0006\u001c|ýRÞ\u0015¸®\u0099Wz\u008a[Þ5¶\u0016=÷\"Ð\u008f±>\u0093ml:MK.¦\u000f¾é²ÊU«Î\u0084ðe*GR \u0016\u0001ôâÃü\u0095Ý\u009f¾ê\u009f\u009bxUZÇ;ô\u0014\u0013õ2Öï°Í\u0091Ër]S÷,<\u000e-ï\u000bÈ\u000e©Z\u008b*d E¶&6\u0007\u0082á¶Â¾£×¼:\u009d'\u007f\u0006X\u009292\u001a\u0013û®Õ×¶\u008a\u0097vpVR(3\"\fjí\u001eÎÜ¨Z\u0089}jfK\u009e$\u0092\u0006\u0011çNÀÈ¡\b\u0082ñ\u009ck}\u009b^\u007f?\"\u0019\u0003úÝÛç´\u007f\u0095ÛwÙP\u000f18\u0012SóGÍW®ø\u008f\u000bhYIß+\u0095\u0004#åëÆ\u0007 d\u0081;b\nC/\\¿>3\u001f\bø7Ùÿº+\u0094\u001du?V·7C\u0010úò'Ós¬\u001b\u008döoÎH¿)\u0012\n]ë\u0016Åâ¦J\u0087Q`\u001eA$#â<÷\u001d\u0095þ¬Ø\u0096¹¦\u009aB{?T\u001e6\u0092\u0017\u001aðÛÑF²H\u008c\u0092m¨N®/|\bJêåË6¤w\u0085\"gî@¾!}\u0002ºãßý¦ÞP¿2\u0098¸y\u000e[:4*\u0015¬öÖ×\u00ad±\u0082\u0092.sÞL¡.Ú\u000fXè\u009aÉâª¡\u0084¸e\u008dFÆ'\u0099\u0000oâ\u0095ÃÐÜ\u0091½E\u009e\u009dxÔY©:s\u001b\u0085õôÖ\u0081·¢\u0090\u0098q\u0087S³,ü\r\u009fî\u0015Ï\u001b©Å\u008aYkåDR%n\u0007\u001eàùÁZ¢n¼V\u009dÁ~\u0082_\u001c8n\u001aÊûjÔLµ\u0006\u0096:prQ½2~\u0013&ìzÎ;¯v\u0088\u0096ibKA$\u000e\u0005bæJÇÊ¡f\u0082|c\u0092|ü]^?n\u0018\u001aùèÚ\u0016»\u008a\u0095Bv+W¯0F\u0012«óÈÌG\u00ad*\u008e3h¼I?*;\u000búä\u0083Æù§Ù\u0080ýa@C\u0081\\µ=u\u001e\nÿiÙ¯º\u008d\u009b tÑU=7å\u0010\u008añ\u0099Ò_³]\u008dÑnaOå(Z\n\u0092ë\u0016Äô¥b\u0086b`NAã\"}\u0003Æ\u001c~þ\u009bßz¸\u0007\u0099\u0006zJTr5Ç\u0016n÷nÑb²\u0086\u0093\u0081lãM\u0095/E\béé\u001fÊ\u008d«\u0091\u0085±f>Gá Ì\u0001\u0002ãÛü&Ýy¾z\u0098Çy\u000eZ¢;2\u0014\u001cöö×ù°Ê\u0091[r>L\u008e-b\u000e\u001aïFÈsªÚ\u008b\u0001dîE¨'Ò\u0000[áVÂé£j½\u001b\u009e^\u007fäXÂ9Û\u001bæôiÕº¶Ð\u0097Nq#Rr3\u0081\ftîÃÏw¨Z\u0089#jÐD\u007f%@\u0006{ç²À§¢<\u0083s\u009cö}O^Ñ8+\u0019\\úWÛÔµ\r\u0096\"wîP51Ê\u0013\u0097ì\u0096Í)®â\u008fLiÞJò+\u001a\u0004\u0017æ&Çµ Ò\u0081mb\u008e|þ]ª>\u0087\u001f6øµÚ\u0002»v\u0094>u©Vº0\u001a\u0011aòçÓZ\u00ad\u0096\u008e\u0016oõHb)t\u000bNäòÅ(¦U\u0087+a\u001bB/#\u0082<S\u001dúÿ'ØG¹;\u009aêtßUw6Ì\u0017ºð÷Òþ³Û\u008c\u009emÏN)(Ã\t\u0092êÇË)¤Ë\u0086\u0089gÿ@4!Ó\u0003ª\u001c×ýïÞû¿X\u0099/z:[#4Ø\u0015ç÷_Ð«±é\u0092\u009fs¾Mó.(\u000f7èîÊ\u001b«\u0012\u0084\u008fe\u00adF\u0083 \u000e\u0001\u0087â\u0099Ã\nÜ\b¾%\u009f:x\u0006Y]:Ò\u0014¿õ®Ö1·\u008a\u0091´r¶SÚ,\"\r?ï>ÈÍ©:\u008axk¦EÜ&²\u0007uàNÁ÷£*¼~\u009d\u0016~ÝXB9o\u001a\u009eûÍÔ\u009a¶+\u0097FpÞQ\u00122õ\fní\u0011ÎJ¯¾\u0089vj@Kc$4\u0005\u007fç\u008fÀ{¡í\u0082gcV}s^Ò?\u008f\u0018mùkÛý´W\u0095\\vÍPb1®\u0012øó\u008aÌG®Ö\u008fòh\"I\u0015*\u001e\u0004²åÚÆG§æ\u0080\"b\u0092C\u008a\\Î=5\u001fêøÕÙöº´\u009bÝurVÞ7å\u0010\u009añgÓæ¬ù\u008dÒn|O\u000e)\u0082\nêëGÄö¦\u0085\u0087\u0082`°Aþ\"$<ú\u001d\u00adþ\u0006ß¿¸ò\u009a6{îT\u00855\u008a\u0016×ðÖÑ\u0005²â\u0093ãm\u001eNf/Ú\b\u00adé¦ËJ¤\u0092\u0085ðfÎG\u009f!+\u0002Êã7ü]ÝÃ¿º\u0098¿y?Z»4º\u0015Gö\u0082×3°=\u0092/s\u008dLK-L\u000e&è£É\u001dªò\u008b1d\u0082F%'>\u0000)á\u008bÃ-Ü\u0001½!\u009e\u0093\u007f\u0015Y&:9\u001b«ô=Õí·\u0011\u0090\\qÅR\u001b,É\rÌî\rÏD¨A\u008aÝkrD\u0089%\u0011\u0006îà\u0005ÁL¢y\u0083\u0082\u009c\u009d~\u0007_¡8©\u0019uûLÔ)µ~\u0096-w\u008bQq2/\u0013¥ìÆÍY¯\u0084\u0088}i\rJA+n\u0005UæÜÇI >\u0082Mc\u0098|Q]m>E\u0018\u0086ù9Ú±»]\u0094\u0018vaW°0´\u0011ÄòhÌ9\u00adl\u008e\u008bo0I!*d\u000b\\ä\u0098Å\u0099§¼\u0080\u0007a\u0080Bî#\u0014=a\u001e\bÿþØ\f¹\u008e\u009b\u0090tïU.6;\u0010-ñ)Òé³¬\u008c\u0095n\"O¡(®\t\"êÆÄ)¥\u0097\u0086%g\u0015@¡\"Ý\u0003\u00ad\u001cwý¹ßñ¸U\u0099óz\u0011[X5=\u0016×÷IÐ\u001b±\u0085\u0093\u0093\u009cH}d^\"?\u008e\u0018áú7Ûp´B\u0095\u009cvÖ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2164);
        getOutputFormats = cArr;
        getHighSpeedVideoFpsRanges = 4158029904740384055L;
    }
}
