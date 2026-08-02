package util.h.xy.cq;

/* loaded from: classes5.dex */
final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    private static char[] getOutputMinFrameDuration;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.cq.b.class.getName();
        getInputSizeshNQ4ISI = new byte[]{97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 113, 114, 115, 116, 117, 118, com.visa.cbp.getEncExpo.IResultReceiver, 120, 121, 122, 48, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 56, 57};
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 97) % 128;
    }

    private b() {
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'getHighResolutionOutputSizeshNQ4ISI' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class ra {
        private static int Camera2StreamConfigurationMap = 0;
        public static final util.h.xy.cq.b.ra getHighResolutionOutputSizeshNQ4ISI;
        private static int getHighSpeedVideoFpsRanges = 1;
        public static final util.h.xy.cq.b.ra getHighSpeedVideoFpsRangesFor;
        public static final util.h.xy.cq.b.ra getHighSpeedVideoSizes;
        private static final /* synthetic */ util.h.xy.cq.b.ra[] getHighSpeedVideoSizesFor;
        private static short[] getInputFormats = null;
        private static int getInputSizeshNQ4ISI = 0;
        private static byte[] getOutputFormats = null;
        private static int getOutputMinFrameDuration = 0;
        private static int getOutputSizeshNQ4ISI = 0;
        private static int getOutputStallDuration = 0;
        private static int getOutputStallDurationlomOqCM = 1;
        private final int getOutputMinFrameDurationlomOqCM;

        public static util.h.xy.cq.b.ra valueOf(java.lang.String str) {
            getOutputMinFrameDuration = (getOutputStallDurationlomOqCM + 91) % 128;
            util.h.xy.cq.b.ra raVar = (util.h.xy.cq.b.ra) java.lang.Enum.valueOf(util.h.xy.cq.b.ra.class, str);
            getOutputMinFrameDuration = (getOutputStallDurationlomOqCM + 73) % 128;
            return raVar;
        }

        public static util.h.xy.cq.b.ra[] values() {
            int i = getOutputMinFrameDuration + 125;
            getOutputStallDurationlomOqCM = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            util.h.xy.cq.b.ra[] raVarArr = (util.h.xy.cq.b.ra[]) getHighSpeedVideoSizesFor.clone();
            int i2 = getOutputStallDurationlomOqCM + 31;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                return raVarArr;
            }
            throw null;
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) - 988921196, (short) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 67), android.view.View.combineMeasuredStates(0, 0) - 53, 843144959 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            util.h.xy.cq.b.ra raVar = new util.h.xy.cq.b.ra(((java.lang.String) objArr[0]).intern(), 0, 1);
            getHighResolutionOutputSizeshNQ4ISI = raVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 988921194, (short) android.view.KeyEvent.keyCodeFromString(""), (byte) ((-41) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (-54) - android.widget.ExpandableListView.getPackedPositionChild(0L), 843144959 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr2);
            util.h.xy.cq.b.ra raVar2 = new util.h.xy.cq.b.ra(((java.lang.String) objArr2[0]).intern(), 1, 16);
            getHighSpeedVideoFpsRangesFor = raVar2;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.graphics.ImageFormat.getBitsPerPixel(0) - 988921191, (short) android.view.Gravity.getAbsoluteGravity(0, 0), (byte) (android.view.KeyEvent.normalizeMetaState(0) + 3), (-53) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 843144952 - android.graphics.Color.red(0), objArr3);
            util.h.xy.cq.b.ra raVar3 = new util.h.xy.cq.b.ra(((java.lang.String) objArr3[0]).intern(), 2, 256);
            getHighSpeedVideoSizes = raVar3;
            int i = getOutputStallDurationlomOqCM;
            getOutputMinFrameDuration = (i + 1) % 128;
            int i2 = (i + 37) % 128;
            getOutputMinFrameDuration = i2;
            getHighSpeedVideoSizesFor = new util.h.xy.cq.b.ra[]{raVar, raVar2, raVar3};
            int i3 = i2 + 59;
            getOutputStallDurationlomOqCM = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        private ra(java.lang.String str, int i, int i2) {
            this.getOutputMinFrameDurationlomOqCM = i2;
        }

        public final int getHighSpeedVideoFpsRanges() {
            int i = getOutputStallDurationlomOqCM + 11;
            int i2 = i % 128;
            getOutputMinFrameDuration = i2;
            if (i % 2 != 0) {
                throw null;
            }
            int i3 = this.getOutputMinFrameDurationlomOqCM;
            int i4 = i2 + 31;
            getOutputStallDurationlomOqCM = i4 % 128;
            if (i4 % 2 != 0) {
                return i3;
            }
            throw null;
        }

        private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
            int i4;
            boolean z;
            int length;
            byte[] bArr;
            int i5;
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i6 = i2 + ((int) (getOutputStallDuration ^ (-2689713159175858216L)));
            if (i6 == -1) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 13) % 128;
                i4 = 1;
            } else {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 9) % 128;
                i4 = 0;
            }
            if (i4 != 0) {
                int i7 = Camera2StreamConfigurationMap;
                int i8 = i7 + 49;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
                byte[] bArr2 = getOutputFormats;
                if (bArr2 != null) {
                    int i9 = i7 + 103;
                    getHighSpeedVideoFpsRanges = i9 % 128;
                    if (i9 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 17) % 128;
                        bArr[i5] = (byte) (bArr2[i5] ^ (-2689713159175858216L));
                        i5++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    i6 = (byte) (((byte) (getOutputFormats[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 45) % 128;
                } else {
                    i6 = (short) (((short) (getInputFormats[((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputStallDuration ^ (-2689713159175858216L))));
                }
            }
            if (i6 > 0) {
                meVar.f2647 = ((i + i6) - 2) + ((int) (getOutputSizeshNQ4ISI ^ (-2689713159175858216L))) + i4;
                meVar.f2644 = (char) (i3 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getOutputFormats;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = Camera2StreamConfigurationMap + 69;
                        getHighSpeedVideoFpsRanges = i11 % 128;
                        if (i11 % 2 == 0) {
                            bArr4[i10] = (byte) (bArr3[i10] | (-2689713159175858216L));
                            i10 >>>= 1;
                        } else {
                            bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                            i10++;
                        }
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 121) % 128;
                    z = true;
                } else {
                    getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 21) % 128;
                    z = false;
                }
                meVar.f2645 = 1;
                while (meVar.f2645 < i6) {
                    if (z) {
                        byte[] bArr5 = getOutputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 115) % 128;
                    } else {
                        short[] sArr = getInputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    }
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    meVar.f2645++;
                }
            }
            objArr[0] = sb.toString();
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getOutputSizeshNQ4ISI = -581915980;
            getOutputStallDuration = -408872980;
            getInputSizeshNQ4ISI = 706721428;
            getOutputFormats = new byte[]{com.google.common.base.Ascii.SYN, 124, com.google.common.base.Ascii.SYN, -23, 3, 37, 34, -46, 34, -37, -48, 34, -34, 63, -52, 47, 36, com.visa.cbp.getEncExpo.kernelVersion, 38};
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 51) % 128;
        char[] cArr = charArray;
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            int i4 = getHighSpeedVideoFpsRangesFor + 27;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                jArr[dVar.f2629] = (cArr[dVar.f2629] | (dVar.f2629 % dVar.f2628)) + (getOutputFormats - 7508379876853140581L);
                i3 = dVar.f2629;
            } else {
                jArr[dVar.f2629] = (cArr[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ ((-7508379876853140581L) ^ getOutputFormats);
                i3 = dVar.f2629 + 1;
            }
            dVar.f2629 = i3;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        }
        char[] cArr2 = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < cArr.length) {
            int i5 = getHighSpeedVideoFpsRangesFor + 53;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 != 0) {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629;
            } else {
                cArr2[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    static java.util.Map<util.h.xy.cq.b.ra, byte[]> getHighSpeedVideoFpsRanges(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws util.h.xy.cm.ma {
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        java.util.HashMap hashMap = new java.util.HashMap();
        byte[] bArr8 = null;
        try {
            byte[] m25967 = util.h.xy.cm.mb.m25967(bArr);
            try {
                if ((util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges() & i) == util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges()) {
                    bArr6 = util.h.xy.fb.a.m26824(m25967, 0, 16);
                    try {
                        hashMap.put(util.h.xy.cq.b.ra.getHighResolutionOutputSizeshNQ4ISI, (byte[]) bArr6.clone());
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr4 = null;
                        bArr5 = null;
                        bArr7 = null;
                        bArr8 = m25967;
                        util.h.xy.cv.ra.m26068(bArr8, bArr6, bArr7, bArr5, bArr4);
                        throw th;
                    }
                } else {
                    bArr6 = null;
                }
                bArr7 = util.h.xy.fb.a.m26824(m25967, 16, 32);
                try {
                    if ((util.h.xy.cq.b.ra.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges() & i) == util.h.xy.cq.b.ra.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges()) {
                        int i2 = getHighSpeedVideoSizes + 103;
                        getHighSpeedVideoFpsRanges = i2 % 128;
                        if (i2 % 2 == 0) {
                            hashMap.put(util.h.xy.cq.b.ra.getHighSpeedVideoFpsRangesFor, (byte[]) bArr7.clone());
                        } else {
                            hashMap.put(util.h.xy.cq.b.ra.getHighSpeedVideoFpsRangesFor, (byte[]) bArr7.clone());
                            throw new java.lang.NullPointerException();
                        }
                    }
                    if ((i & util.h.xy.cq.b.ra.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges()) == util.h.xy.cq.b.ra.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges()) {
                        if (bArr3 != null) {
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 15) % 128;
                            if (bArr2 != null) {
                                bArr4 = util.h.xy.cv.ra.m26072(bArr3, bArr2);
                                try {
                                    bArr5 = util.h.xy.cm.mb.m25968(bArr7, bArr4);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    bArr5 = null;
                                }
                                try {
                                    hashMap.put(util.h.xy.cq.b.ra.getHighSpeedVideoSizes, (byte[]) bArr5.clone());
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    bArr8 = m25967;
                                    util.h.xy.cv.ra.m26068(bArr8, bArr6, bArr7, bArr5, bArr4);
                                    throw th;
                                }
                            }
                        }
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("絘♟쬽泷ᇂ몸幰͘ꐤ䦸\uf2d3鞭㭭\udc14脥⫿쿞炴ᑵ륩戯߽ꣅ䶪\uf176驆㼢\ue0f7薏⺶퉴睟\u180e뷹曟ட꽤倌\uf51b黹䏗\ue490蠵ⵑ혚篦᳗솛敹\u0e00댜哤遼ꋜ䙪\ueb4a谚\u31ed\udacb羆⌯쑊椞ዠ랸墕", 23339 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                    bArr4 = null;
                    bArr5 = null;
                    util.h.xy.cv.ra.m26068(m25967, bArr6, bArr7, bArr5, bArr4);
                    int i3 = getHighSpeedVideoFpsRanges + 49;
                    getHighSpeedVideoSizes = i3 % 128;
                    if (i3 % 2 != 0) {
                        return hashMap;
                    }
                    throw null;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    bArr4 = null;
                    bArr5 = null;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                bArr6 = null;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            bArr4 = null;
            bArr5 = null;
            bArr6 = null;
            bArr7 = null;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getInputFormats ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        char[] cArr3 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
            raVar.f2649++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.ck.rc {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr);
            java.lang.String str = new java.lang.String(bArr, ((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr2);
            java.lang.String[] split = str.split(((java.lang.String) objArr2[0]).intern());
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str2 : split) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 101) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{6, 1, 0, 0}, "\u0001", objArr3);
                java.lang.String[] split2 = str2.split(((java.lang.String) objArr3[0]).intern());
                java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(split2[0].trim());
                if (split2.length == 2) {
                    hashMap.put(Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap(split2[1].trim()));
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 75) % 128;
                } else {
                    hashMap.put(Camera2StreamConfigurationMap2, "");
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 83) % 128;
                }
            }
            return hashMap;
        } catch (java.io.UnsupportedEncodingException unused) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{7, 46, 0, 28}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr4);
            throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr4[0]).intern());
        }
    }

    private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighSpeedVideoFpsRangesFor + 71;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getOutputMinFrameDuration;
        if (cArr != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
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
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 15) % 128;
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i7 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRangesFor = i7 % 128;
            if (i7 % 2 == 0) {
                char[] cArr5 = new char[i3];
                java.lang.System.arraycopy(cArr3, 1, cArr5, 0, i3);
                java.lang.System.arraycopy(cArr5, 1, cArr3, i3 % i5, i5);
                java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i3 >>> i5);
            } else {
                char[] cArr6 = new char[i3];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                int i8 = i3 - i5;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i8, i5);
                java.lang.System.arraycopy(cArr6, i5, cArr3, 0, i8);
            }
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 97) % 128;
            char[] cArr7 = new char[i3];
            loop2: while (true) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    int i9 = getHighSpeedVideoFpsRangesFor + 55;
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 != 0) {
                        break;
                    }
                    cArr7[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                    maVar.f2631++;
                }
                cArr7[maVar.f2631] = cArr3[i3 >> maVar.f2631];
                int i10 = maVar.f2631;
            }
            cArr3 = cArr7;
        }
        if (i4 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRanges + 3;
        getHighSpeedVideoSizes = i % 128;
        try {
            if (i % 2 == 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr);
                return getHighResolutionOutputSizeshNQ4ISI(str.getBytes(((java.lang.String) objArr[0]).intern()));
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr2);
            return getHighResolutionOutputSizeshNQ4ISI(str.getBytes(((java.lang.String) objArr2[0]).intern()));
        } catch (java.io.UnsupportedEncodingException unused) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{7, 46, 0, 28}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr3);
            throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr3[0]).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x021f, code lost:
    
        if (r2 != 80) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03af A[Catch: IOException -> 0x03b5, TryCatch #0 {IOException -> 0x03b5, blocks: (B:45:0x02f3, B:48:0x03af, B:49:0x03b4), top: B:44:0x02f3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String getHighSpeedVideoSizes(java.net.URL url, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str, byte[] bArr) throws java.io.UnsupportedEncodingException, util.h.xy.cm.ma, util.h.xy.ck.rc {
        java.lang.String obj;
        int i;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        java.lang.String query = url.getQuery();
        if (query != null && !query.isEmpty()) {
            hashMap.putAll(getHighResolutionOutputSizeshNQ4ISI(query));
        }
        if (map2 != null) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 113) % 128;
            hashMap.putAll(map2);
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 71) % 128;
        }
        byte[] m25933 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1104);
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("絋؈诤ཏ逩ᖔ饤⋚ꞷ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31583, objArr);
        if (str.equals(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr2);
            java.lang.String str2 = new java.lang.String(m25933, ((java.lang.String) objArr2[0]).intern());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(str2);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("紽Ȫ", 32531 - android.view.View.MeasureSpec.getSize(0), objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            return sb.toString();
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("絓颙뛄찵\uea0aCᾉ㗳卑楩蜻", 58830 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr5);
        if (!str.equals(((java.lang.String) objArr5[0]).intern())) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{87, 28, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001", objArr6);
            throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr6[0]).intern());
        }
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(hashMap.keySet());
        java.util.Collections.sort(arrayList);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        for (java.lang.String str3 : arrayList) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{115, 5, 0, 1}, "\u0000\u0001\u0001\u0001\u0000", objArr7);
            if (!str3.equals(((java.lang.String) objArr7[0]).intern())) {
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str3);
                java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str4);
                if (sb2.length() == 0) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(highSpeedVideoFpsRanges);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{6, 1, 0, 0}, "\u0001", objArr8);
                    sb3.append(((java.lang.String) objArr8[0]).intern());
                    sb3.append(highSpeedVideoFpsRanges2);
                    sb2.append(sb3.toString());
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 85) % 128;
                } else {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr9);
                    sb4.append(((java.lang.String) objArr9[0]).intern());
                    sb4.append(highSpeedVideoFpsRanges);
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{6, 1, 0, 0}, "\u0001", objArr10);
                    sb4.append(((java.lang.String) objArr10[0]).intern());
                    sb4.append(highSpeedVideoFpsRanges2);
                    sb2.append(sb4.toString());
                }
            }
        }
        java.lang.String obj2 = sb2.toString();
        int i2 = getHighSpeedVideoSizes + 49;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            url.getPort();
            throw null;
        }
        int port = url.getPort();
        try {
            if (port != -1) {
                java.lang.String protocol = url.getProtocol();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("絳쎊¥䇄蛼", 48869 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr11);
                if (protocol.equals(((java.lang.String) objArr11[0]).intern())) {
                    int i3 = getHighSpeedVideoSizes + 69;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    if (i3 % 2 == 0) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(url.getProtocol());
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("紡窿爢", android.view.View.MeasureSpec.getMode(0) + 1931, objArr12);
                        sb5.append(((java.lang.String) objArr12[0]).intern());
                        sb5.append(url.getHost());
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("紡", android.graphics.Color.alpha(0) + 58099, objArr13);
                        sb5.append(((java.lang.String) objArr13[0]).intern());
                        sb5.append(port);
                        sb5.append(url.getPath());
                        obj = sb5.toString();
                    } else {
                        java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
                        sb52.append(url.getProtocol());
                        java.lang.Object[] objArr122 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("紡窿爢", android.view.View.MeasureSpec.getMode(0) + 1931, objArr122);
                        sb52.append(((java.lang.String) objArr122[0]).intern());
                        sb52.append(url.getHost());
                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("紡", android.graphics.Color.alpha(0) + 58099, objArr132);
                        sb52.append(((java.lang.String) objArr132[0]).intern());
                        sb52.append(port);
                        sb52.append(url.getPath());
                        obj = sb52.toString();
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{54, 5, 0, 0}, "\u0000\u0001\u0000\u0001\u0000", objArr14);
                    sb6.append(((java.lang.String) objArr14[0]).intern());
                    sb6.append(getHighSpeedVideoFpsRanges(obj));
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr15);
                    sb6.append(((java.lang.String) objArr15[0]).intern());
                    sb6.append(getHighSpeedVideoFpsRanges(obj2));
                    java.lang.String obj3 = sb6.toString();
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr16);
                    java.lang.String intern = ((java.lang.String) objArr16[0]).intern();
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr17);
                    byte[] m26072 = util.h.xy.cv.ra.m26072(m25933, intern.getBytes(((java.lang.String) objArr17[0]).intern()), util.h.xy.cv.ma.m26064(bArr).getBytes());
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr18);
                    byte[] m26059 = util.h.xy.cv.a.m26059(util.h.xy.cm.mb.m25968(m26072, obj3.getBytes(((java.lang.String) objArr18[0]).intern())));
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr19);
                    sb7.append(((java.lang.String) objArr19[0]).intern());
                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr20);
                    sb7.append(getHighSpeedVideoFpsRanges(new java.lang.String(m26059, ((java.lang.String) objArr20[0]).intern())));
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr21);
                    sb7.append(((java.lang.String) objArr21[0]).intern());
                    java.lang.String obj4 = sb7.toString();
                    i = getHighSpeedVideoFpsRanges + 39;
                    getHighSpeedVideoSizes = i % 128;
                    if (i % 2 == 0) {
                        return obj4;
                    }
                    throw new java.lang.ArithmeticException();
                }
                java.lang.String protocol2 = url.getProtocol();
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("絳\ue24c䌩ꀂ", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + my.com.softspace.reader.internal.kernelconfig.EmvTags.TAG_9F23_UPP_CONSEC_OFFLINE_LIMIT, objArr22);
                if (protocol2.equals(((java.lang.String) objArr22[0]).intern())) {
                }
            }
            java.lang.Object[] objArr162 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr162);
            java.lang.String intern2 = ((java.lang.String) objArr162[0]).intern();
            java.lang.Object[] objArr172 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr172);
            byte[] m260722 = util.h.xy.cv.ra.m26072(m25933, intern2.getBytes(((java.lang.String) objArr172[0]).intern()), util.h.xy.cv.ma.m26064(bArr).getBytes());
            java.lang.Object[] objArr182 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr182);
            byte[] m260592 = util.h.xy.cv.a.m26059(util.h.xy.cm.mb.m25968(m260722, obj3.getBytes(((java.lang.String) objArr182[0]).intern())));
            java.lang.StringBuilder sb72 = new java.lang.StringBuilder();
            java.lang.Object[] objArr192 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr192);
            sb72.append(((java.lang.String) objArr192[0]).intern());
            java.lang.Object[] objArr202 = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{0, 5, 36, 0}, "\u0000\u0001\u0001\u0000\u0001", objArr202);
            sb72.append(getHighSpeedVideoFpsRanges(new java.lang.String(m260592, ((java.lang.String) objArr202[0]).intern())));
            java.lang.Object[] objArr212 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr212);
            sb72.append(((java.lang.String) objArr212[0]).intern());
            java.lang.String obj42 = sb72.toString();
            i = getHighSpeedVideoFpsRanges + 39;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
            }
        } catch (java.io.IOException unused) {
            util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1114;
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{59, 28, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr23);
            throw new util.h.xy.ck.rc(dVar2, ((java.lang.String) objArr23[0]).intern());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(url.getProtocol());
        java.lang.Object[] objArr24 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("紡窿爢", 1930 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr24);
        sb8.append(((java.lang.String) objArr24[0]).intern());
        sb8.append(url.getHost());
        sb8.append(url.getPath());
        obj = sb8.toString();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 45) % 128;
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
        java.lang.Object[] objArr142 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{54, 5, 0, 0}, "\u0000\u0001\u0000\u0001\u0000", objArr142);
        sb62.append(((java.lang.String) objArr142[0]).intern());
        sb62.append(getHighSpeedVideoFpsRanges(obj));
        java.lang.Object[] objArr152 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{5, 1, 68, 0}, "\u0000", objArr152);
        sb62.append(((java.lang.String) objArr152[0]).intern());
        sb62.append(getHighSpeedVideoFpsRanges(obj2));
        java.lang.String obj32 = sb62.toString();
    }

    static java.lang.String getHighSpeedVideoFpsRanges(java.util.Map<java.lang.String, java.lang.String> map) throws java.io.UnsupportedEncodingException {
        java.util.Iterator it = new java.util.ArrayList(map.keySet()).iterator();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (it.hasNext()) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((java.lang.String) it.next());
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(map.get(highSpeedVideoFpsRanges));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(highSpeedVideoFpsRanges);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(true, new int[]{120, 2, 112, 0}, "\u0000\u0001", objArr);
            sb2.append(((java.lang.String) objArr[0]).intern());
            sb2.append(highSpeedVideoFpsRanges2);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb.append(sb2.toString());
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String str2 = map.get(str);
                java.lang.String highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(str);
                java.lang.String highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(str2);
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("紷", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62652, objArr3);
                sb3.append(((java.lang.String) objArr3[0]).intern());
                sb3.append(highSpeedVideoFpsRanges3);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{120, 2, 112, 0}, "\u0000\u0001", objArr4);
                sb3.append(((java.lang.String) objArr4[0]).intern());
                sb3.append(highSpeedVideoFpsRanges4);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes(false, new int[]{53, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 1}, "\u0001", objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                sb.append(sb3.toString());
            }
        }
        java.lang.String obj = sb.toString();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 81) % 128;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006b, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
    
        util.h.xy.cq.b.getHighSpeedVideoFpsRanges = (util.h.xy.cq.b.getHighSpeedVideoSizes + 13) % 128;
        r9 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r1 = new org.json.JSONArray(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        r8 = util.h.xy.ck.d.f1113;
        r1 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("絒䘄ஏ켩邳呇᧙\udd2cꛙ殱⼾\uf08e둷秀㵚۶쩦迻傝ᑘ\ud9a9鴱曟⨜\uefe7덳琔㦄ﴯ욉詗俑ፚ퓹顶崆⚠\uea23꾲獞㓖\uf85d뷸蚎䨑ྩ", android.view.View.resolveSizeAndState(0, 0, 0) + 15217, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        throw new util.h.xy.ck.rc(r8, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r9 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static util.h.xy.cj.mb Camera2StreamConfigurationMap(int i, byte[] bArr) throws util.h.xy.ck.rc {
        org.json.JSONArray jSONArray;
        java.lang.String str;
        java.lang.String str2 = null;
        r1 = null;
        org.json.JSONArray jSONArray2 = null;
        if (util.h.xy.cv.ra.m26070(bArr) || i != 401) {
            jSONArray = null;
        } else {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 73) % 128;
            java.util.Map<java.lang.String, java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr);
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("絿䪯ዄ\uda10ꈧ橭㎗ﮭ쏒謕匦᭒", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 14293, objArr);
            java.lang.String str3 = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr[0]).intern());
            if (str3 == null || str3.equals("")) {
                util.h.xy.ck.d dVar = util.h.xy.ck.d.f1112;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("絈侗ᢻ\ue5d6뛚菤䱍ᤶ\uea36띙聱䵷ᾙ\ue8bd뗀蚜叢ᰑ\ue959먥蝁偧ᵨ\uef80뢫薵囃⏡\uec1d뤛許圌⁙\ued67뾝裠喱⛙\uf3f9뱄褃娸❎\uf04e뵾辊墬▲\uf6cc쎢賸夞⨶\uf706쁏赱徂⢉\uf5be웆鎩", android.view.MotionEvent.axisFromString("") + 13034, objArr2);
                throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr2[0]).intern());
            }
            int i2 = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("絿ⅿ앤楠൧녝啷諾鵒䅅\ue546襂\u2d78턷甲ᤢ봮愑Ԩꤪ䴙\uf11d", 17309 >>> (android.view.ViewConfiguration.getScrollBarSize() / 54), objArr3);
                str = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr3[0]).intern());
            } else {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("絿ⅿ앤楠൧녝啷諾鵒䅅\ue546襂\u2d78턷甲ᤢ봮愑Ԩꤪ䴙\uf11d", 23557 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr4);
                str = highResolutionOutputSizeshNQ4ISI.get(((java.lang.String) objArr4[0]).intern());
            }
        }
        return new util.h.xy.cj.mb(i, str2, jSONArray);
    }

    static byte[] getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoSizes + 39;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = new byte[16];
        try {
            int i2 = 0;
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0001\uffefￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\t\u000b\u0000\n�￮\u0001\u000e\u0011\uffff", 26 - android.widget.ExpandableListView.getPackedPositionType(0L), 16 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, objArr);
            java.security.SecureRandom secureRandom = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
            while (i2 < 16) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 63) % 128;
                byte[] bArr2 = getInputSizeshNQ4ISI;
                bArr[i2] = bArr2[secureRandom.nextInt(bArr2.length)];
                i2++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 83) % 128;
            }
            return bArr;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) throws java.io.UnsupportedEncodingException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 121) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("絎湨嬓䑃ㆿ", android.graphics.Color.rgb(0, 0, 0) + 16782119, objArr);
        java.lang.String encode = java.net.URLEncoder.encode(str, ((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 1, 44, 0}, "\u0001", objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 3, 0, 1}, "\u0001\u0001\u0000", objArr3);
        java.lang.String replace = encode.replace(intern, ((java.lang.String) objArr3[0]).intern());
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("紱", android.view.View.resolveSize(0, 0) + 57427, objArr4);
        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{126, 3, 0, 1}, "\u0001\u0000\u0001", objArr5);
        java.lang.String replace2 = replace.replace(intern2, ((java.lang.String) objArr5[0]).intern());
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("紾햅Ⰼ", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 43178, objArr6);
        java.lang.String intern3 = ((java.lang.String) objArr6[0]).intern();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("絥", 54601 - android.view.KeyEvent.getDeadChar(0, 0), objArr7);
        java.lang.String replace3 = replace2.replace(intern3, ((java.lang.String) objArr7[0]).intern());
        int i = getHighSpeedVideoSizes + 115;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return replace3;
        }
        throw null;
    }

    static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) throws java.io.UnsupportedEncodingException {
        int i = getHighSpeedVideoFpsRanges + 115;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            android.net.Uri.decode(str);
            throw null;
        }
        java.lang.String decode = android.net.Uri.decode(str);
        int i2 = getHighSpeedVideoFpsRanges + 5;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return decode;
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.ck.rc {
        int i = getHighSpeedVideoFpsRanges + 89;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            ((util.h.xy.cq.rb) util.h.xy.ck.ra.f1116.m25952()).getHighResolutionOutputSizeshNQ4ISI();
            ((util.h.xy.cq.mc) util.h.xy.ck.ra.f1116.m25955()).getHighResolutionOutputSizeshNQ4ISI();
            ((util.h.xy.cq.md) util.h.xy.ck.ra.f1116.m25954()).Camera2StreamConfigurationMap();
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 125) % 128;
            return;
        }
        ((util.h.xy.cq.rb) util.h.xy.ck.ra.f1116.m25952()).getHighResolutionOutputSizeshNQ4ISI();
        ((util.h.xy.cq.mc) util.h.xy.ck.ra.f1116.m25955()).getHighResolutionOutputSizeshNQ4ISI();
        ((util.h.xy.cq.md) util.h.xy.ck.ra.f1116.m25954()).Camera2StreamConfigurationMap();
        throw null;
    }

    static void Camera2StreamConfigurationMap() {
        getInputFormats = -1231763771;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputFormats = -1464999901690245504L;
        getOutputMinFrameDuration = new char[]{42355, 42251, 42288, 42444, 42437, 42344, 42307, 42346, 42298, 42300, 42298, 42293, 42271, 42263, 42284, 42266, 42260, 42294, 42289, 42286, 42288, 42298, 42288, 42288, 42271, 42264, 42293, 42290, 42257, 42261, 42293, 42296, 42288, 42287, 42253, 42343, 42254, 42296, 42295, 42293, 42297, 42271, 42263, 42284, 42266, 42261, 42293, 42292, 42287, 42289, 42260, 42362, 42343, 42259, 42357, 42258, 42252, 42254, 42336, 42366, 42254, 42296, 42295, 42293, 42297, 42271, 42263, 42284, 42266, 42270, 42299, 42292, 42292, 42294, 42292, 42295, 42289, 42271, 42260, 42291, 42293, 42295, 42298, 42295, 42281, 42286, 42294, 42359, 42300, 42285, 42281, 42287, 42285, 42290, 42285, 42286, 42289, 42297, 42271, 42260, 42291, 42293, 42295, 42298, 42295, 42281, 42286, 42294, 42271, 42267, 42292, 42289, 42291, 42294, 42292, 42340, 42290, 42289, 42299, 42302, 42260, 42434, 42358, 42319, 42359, 42348, 42365, 42350, 42358};
    }
}
