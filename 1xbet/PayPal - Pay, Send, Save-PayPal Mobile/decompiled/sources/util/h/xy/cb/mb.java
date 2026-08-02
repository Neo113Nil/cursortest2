package util.h.xy.cb;

/* loaded from: classes5.dex */
public class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static java.lang.String getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static int[] getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;

    static {
        Camera2StreamConfigurationMap();
        getOutputMinFrameDuration = util.h.xy.cb.mb.class.getName();
        int i = getHighSpeedVideoFpsRangesFor + 13;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25855() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 == 0) {
            if (getHighSpeedVideoFpsRanges == null) {
                Camera2StreamConfigurationMap = (i + 79) % 128;
                try {
                    getHighSpeedVideoSizes(util.h.xy.ag.a.m24556().m24558());
                } catch (java.lang.Exception e) {
                    e.printStackTrace();
                }
            }
            return getHighSpeedVideoFpsRanges;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m25851() {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 9) % 128;
        if (getInputFormats == -1) {
            try {
                getHighSpeedVideoSizes(util.h.xy.ag.a.m24556().m24558());
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        int i = getInputFormats;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 87) % 128;
        return i;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m25856() {
        int i = Camera2StreamConfigurationMap + 5;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (getHighSpeedVideoSizesFor == -1) {
            try {
                getHighSpeedVideoSizes(util.h.xy.ag.a.m24556().m24558());
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
        int i2 = getHighSpeedVideoSizesFor;
        int i3 = Camera2StreamConfigurationMap + 121;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 63;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i4 = getHighSpeedVideoSizes + 89;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 & dVar.f2628)) % (getOutputFormats / (-7508379876853140581L));
                i2 = dVar.f2629 >>> 1;
            } else {
                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getOutputFormats) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 103) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getInputSizeshNQ4ISI;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i3 = 0;
            while (i3 < length2) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 63;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    iArr4[i3] = (int) (iArr3[i3] & (-5569649899877129369L));
                } else {
                    iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                    i3++;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getInputSizeshNQ4ISI;
        if (iArr6 != null) {
            int i5 = getHighSpeedVideoSizes + 77;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr5[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void getHighSpeedVideoSizes(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (context == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{1814673110, -235797437, -147157748, -1960110451, -1676912460, 900501507, -1967450122, -1335898145, -550573692, 1000492084, 1502556653, 1397014384, -585672313, 245404604, 118365648, -664178111}, 32 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (!util.h.xy.p.a.m27022()) {
            int i2 = getHighSpeedVideoFpsRangesFor + 65;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 == 0) {
                util.h.xy.p.mb.m27038();
                util.h.xy.p.mb.m27039();
            } else {
                util.h.xy.p.mb.m27038();
                util.h.xy.p.mb.m27039();
                throw null;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(context);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.io.IOException e;
        java.io.FileNotFoundException e2;
        java.lang.Throwable th;
        java.io.InputStream inputStream;
        java.util.Properties properties;
        try {
            try {
                android.content.res.AssetManager assets = context.getAssets();
                properties = new java.util.Properties();
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 39) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ﵑꯐ偝ﻜꝘ䷉見ꃓ䥜\uf7c2鱘䫲\uf360駥䙵\uecfe镵", 22148 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                    inputStream = assets.open(((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                inputStream = null;
            }
        } catch (java.io.FileNotFoundException e3) {
            e2 = e3;
        } catch (java.io.IOException e4) {
            e = e4;
        }
        try {
            properties.load(inputStream);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﵵゑ暋钌쪿\uf8b7⺰", 52727 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr2);
            java.lang.String trim = properties.getProperty(((java.lang.String) objArr2[0]).intern()).trim();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-873693527, 1815048061, -1336554178, -1471639421, -1649402601, -1157989624, 1890377015, 675191226, 645979829, 851717089, -711839780, 1378769311}, android.view.KeyEvent.keyCodeFromString("") + 22, objArr3);
            java.lang.String trim2 = properties.getProperty(((java.lang.String) objArr3[0]).intern()).trim();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-873693527, 1815048061, 183571686, 397697984, -1530176165, 849659031, 2089617326, 539258404}, android.view.MotionEvent.axisFromString("") + 17, objArr4);
            java.lang.String trim3 = properties.getProperty(((java.lang.String) objArr4[0]).intern()).trim();
            if (trim == null || trim.isEmpty() || trim2 == null || trim3 == null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes("ﵦ蛫ਇ蹍Ꮳ霮ᭅ鲐†ꑸ⦎귔ㄢ몦㻁숅䞰쯀伛킮咺\ud80e屓\ue1e1攸\ue948犗\uf663穢ﾄ菆ݦ袻\u0cdc遼ᖾ駘ᴎꛬ⫼긏㉟럮㬼뽖䃕쐦䡲췆儧항庇\ue2d6昭\uebb3濝\uf35e璤\uf8fd簓F藼", 31662 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr5);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr5[0]).intern());
            }
            int length = trim.length() - 1;
            if (trim.charAt(length) == '/') {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                trim = trim.substring(0, length);
            }
            int parseInt = java.lang.Integer.parseInt(trim2.trim());
            int parseInt2 = java.lang.Integer.parseInt(trim3.trim());
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (i + 75) % 128;
            getHighSpeedVideoFpsRanges = trim;
            getInputFormats = parseInt;
            getHighSpeedVideoSizesFor = parseInt2;
            getHighSpeedVideoFpsRangesFor = (i + 27) % 128;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused) {
                }
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 57;
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (java.io.FileNotFoundException e5) {
            e2 = e5;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﵵ긻察܁뀁嶈ॶ뫛枷ጔ벴榯ᔃ웣牅ὥ좏瑨↜튿縝⯣퓨耋ⷡ\ud956訪㞝\ue33a賖㦾\ue555雷䎸\uef1f飤䑖\uf134ꋘ乻\ufbd1꒿倐\ufdcc꺸", 21340 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr6[0]).intern(), e2);
        } catch (java.io.IOException e6) {
            e = e6;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-440772884, 1904076957, -2093666203, 112230080, -1866178513, -853320599, 42495957, 236466344, 1062655880, -12610084, 132089922, 1101667329, 1068000262, -220244990, 1991968449, -1377615803, -1611279168, 2033660638, 1974889267, 719964689, -365777010, 1843947190}, android.view.View.resolveSizeAndState(0, 0, 0) + 42, objArr7);
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr7[0]).intern(), e);
        } catch (java.lang.Throwable th4) {
            th = th4;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m25852() {
        int[] iArr = {-873693527, 1815048061, -1336554178, -1471639421, -1649402601, -1157989624, -1676794724, 2025142157, 1242397008, 125448688, 269907663, -1388356, -214499882, -693844539};
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(iArr, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 26, objArr);
            java.lang.Integer m25854 = m25854(((java.lang.String) objArr[0]).intern());
            if (m25854 == null) {
                return 2;
            }
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 49) % 128;
            int intValue = m25854.intValue();
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 113) % 128;
            return intValue;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static int m25858() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ﵵ헹걛蒴弚㙢ເ\ue123릇郯歇䎼ᨏ\ued64엜鰸璔俼♌ﺩ턃ꡢ胟嬰㎋૿\udd44", android.view.Gravity.getAbsoluteGravity(0, 0) + 10399, objArr);
        java.lang.Integer m25854 = m25854(((java.lang.String) objArr[0]).intern());
        if (m25854 != null) {
            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 115) % 128;
            return m25854.intValue();
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 61) % 128;
        return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m25850() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ﵵ솷蓇䬚ั쵬醞哏\u1bfb\ude2c鵈憄⒵\uebe5긇浛っ\uf483믖绬㴽Z쒎讥仫\u0d0d큚靼宦", 15569 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        java.lang.Integer m25854 = m25854(((java.lang.String) objArr[0]).intern());
        if (m25854 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            return m25854.intValue();
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 115) % 128;
        return 10000;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m25853(int i) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-873693527, 1815048061, -786946722, -11892475, 75414004, 1488843936, 902561058, 2133457776, 1170566066, -874549278}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, objArr);
        java.lang.Integer[] m25857 = m25857(((java.lang.String) objArr[0]).intern());
        if (m25857 == null) {
            return 1000;
        }
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 107) % 128;
        int[] iArr = new int[m25857.length];
        for (int i2 = 0; i2 < m25857.length; i2++) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 33) % 128;
            java.lang.Integer num = m25857[i2];
            iArr[i2] = num != null ? num.intValue() : 0;
        }
        return iArr[0];
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.Integer m25854(java.lang.String str) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 91) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("ﵑꯐ偝ﻜꝘ䷉見ꃓ䥜\uf7c2鱘䫲\uf360駥䙵\uecfe镵", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22148, objArr);
        java.lang.String m25859 = util.h.xy.cb.ra.m25859(((java.lang.String) objArr[0]).intern(), str);
        if (android.text.TextUtils.isEmpty(m25859)) {
            return null;
        }
        new java.lang.Object[]{str, java.lang.Integer.valueOf(java.lang.Integer.parseInt(m25859.trim()))};
        int parseInt = java.lang.Integer.parseInt(m25859);
        int i = Camera2StreamConfigurationMap + 87;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return java.lang.Integer.valueOf(parseInt);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        r6 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{892105265, 39973520}, 1 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), r6);
        r0 = r0.split(((java.lang.String) r6[0]).intern());
        r1 = new java.lang.Integer[r0.length];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0092, code lost:
    
        if (r4 >= r0.length) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        util.h.xy.cb.mb.Camera2StreamConfigurationMap = (util.h.xy.cb.mb.getHighSpeedVideoFpsRangesFor + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r1[r4] = java.lang.Integer.valueOf(java.lang.Integer.parseInt(r0[r4].trim()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        new java.lang.Object[]{r9, java.lang.Integer.valueOf(r4)};
        r1[r4] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        new java.lang.Object[]{r9, java.util.Arrays.toString(r1)};
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c8, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        r0 = r9.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d0, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d1, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00d2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r0 = r0.trim();
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Integer[] m25857(java.lang.String str) {
        java.lang.String m25859;
        int i = getHighSpeedVideoFpsRangesFor + 83;
        Camera2StreamConfigurationMap = i % 128;
        int i2 = 0;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﵑꯐ偝ﻜꝘ䷉見ꃓ䥜\uf7c2鱘䫲\uf360駥䙵\uecfe镵", 5673 / (android.os.SystemClock.elapsedRealtime() > 1L ? 1 : (android.os.SystemClock.elapsedRealtime() == 1L ? 0 : -1)), objArr);
            m25859 = util.h.xy.cb.ra.m25859(((java.lang.String) objArr[0]).intern(), str);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﵑꯐ偝ﻜꝘ䷉見ꃓ䥜\uf7c2鱘䫲\uf360駥䙵\uecfe镵", 22148 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            m25859 = util.h.xy.cb.ra.m25859(((java.lang.String) objArr2[0]).intern(), str);
        }
        i2++;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 21) % 128;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = new int[]{296758921, -1319294176, -222380042, -2016643673, -2051032782, -1257022435, -1078554026, -497485256, -1972501379, 284518065, -910692007, 1852457312, -1180749478, -1121397973, -719630775, 568296029, -1914691213, -1621101023};
        getOutputFormats = 8119614079747149485L;
    }
}
