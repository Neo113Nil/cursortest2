package util.h.xy.cq;

/* loaded from: classes5.dex */
public final class mc implements util.h.xy.ck.ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 0;
    private static long getHighSpeedVideoSizesFor = 0;
    private static int getInputFormats = 0;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static int getOutputFormats = 1;
    private final util.h.xy.cq.me getOutputMinFrameDuration;
    private byte[] getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = util.h.xy.cq.mc.class.getName();
        int i = getOutputFormats + 111;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public mc(util.h.xy.cq.me meVar) {
        this.getOutputMinFrameDuration = meVar;
    }

    @Override // util.h.xy.ck.ma
    /* renamed from: ᐝ */
    public final util.h.xy.cj.mb mo25942(byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        getInputFormats = (getOutputFormats + 103) % 128;
        util.h.xy.cj.mb highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2);
        int i = getOutputFormats + 81;
        getInputFormats = i % 128;
        if (i % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    private util.h.xy.cj.mb getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        if (util.h.xy.ck.ra.f1116.m25946()) {
            util.h.xy.ck.d dVar = util.h.xy.ck.d.f1114;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("蟷ퟯ塻涃ꇧ㔽¥瘅\ua4cd㬶訐믵訷η䳏ऋ䋑ⳕ뒄㗽翍ϛ⧌淕蔻껻摩㐹꺅術䎲ꆪⷸ堘䧕ᵞꆻ猹큁歜枳\ufe6f쉕⦺퐌\u0b84霮\ue130⩾\uec46", (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, "ꢉ睪퍂ᡸ", "⊠썞뮶ጻ", objArr);
                throw new util.h.xy.ck.rc(dVar, ((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (util.h.xy.cv.ra.m26070(bArr) || util.h.xy.cv.ra.m26070(bArr2)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u1ccf띋왙ཊ槷졫嬏䑋鐶뢲艐쪰\uf758湛硁퐑\u05cd젦䵋븋꾮ꇫ菴ﵐ䟊룗ꐩ\ueaed㕹븩뢑ඤ뮞险蘾鍬诵쩯⍛㭢珠⚻\ude3e", (char) (21360 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), android.text.TextUtils.getCapsMode("", 0, 0) - 1587577852, "Һ彼炡ᡓ", "⊠썞뮶ጻ", objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.cj.mb m26003 = new util.h.xy.cq.e(this.getOutputMinFrameDuration).m26003();
        return m26003.m25938() / 100 != 2 ? m26003 : getHighSpeedVideoFpsRangesFor(bArr, bArr2);
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighSpeedVideoFpsRangesFor;
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
        int[] iArr5 = getHighSpeedVideoFpsRangesFor;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 49) % 128;
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
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 79) % 128;
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
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 47) % 128;
        objArr[0] = str;
    }

    private util.h.xy.cj.mb getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        util.h.xy.cn.ma m25980;
        try {
            try {
                try {
                    this.getOutputMinFrameDurationlomOqCM = util.h.xy.cm.mb.m25967(bArr);
                    this.getOutputStallDurationlomOqCM = util.h.xy.cm.mb.m25967(bArr2);
                    util.h.xy.cv.ra.m26066(bArr2);
                    util.h.xy.cm.b m25962 = util.h.xy.cm.c.m25962();
                    this.getOutputStallDuration = m25962.m25960();
                    byte[] highSpeedVideoFpsRanges = util.h.xy.cq.ma.getHighSpeedVideoFpsRanges(m25962);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, this.getOutputStallDurationlomOqCM);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{-135143097, -1727510584, 917706064, 2069019857, -1033658950, 427180158, 809018759, -540884692}, 13 - android.view.View.MeasureSpec.getMode(0), objArr);
                    hashMap.put(((java.lang.String) objArr[0]).intern(), highSpeedVideoSizes);
                    util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
                    byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1105);
                    util.h.xy.cn.mb mbVar = new util.h.xy.cn.mb();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("崁끅൞栿奜", (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 48039), 369398817 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr2);
                    sb.append(new java.lang.String(m25933, ((java.lang.String) objArr2[0]).intern()));
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("䪁\uf758攏ᕽ㷿獘蔒뿇璯с\uee79㴐稢뜸죳ᛄ묯䅮闡闆\uf260섡槖ꉵ旮䀲㎻䀘蝗\ue7e9뜩ꕹ놄筤膁涝䱺", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1353524476 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "﵃괤\uda50ꂦ", "⊠썞뮶ጻ", objArr3);
                        sb.append(((java.lang.String) objArr3[0]).intern());
                        java.lang.String obj = sb.toString();
                        byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1106);
                        if (util.h.xy.cv.ra.m26070(m259332)) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("⧦蠢ഖ㚚", (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 21189), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "蟀犏어ꍒ", "⊠썞뮶ጻ", objArr4);
                            m25980 = mbVar.m25981(obj, null, highSpeedVideoFpsRanges, ((java.lang.String) objArr4[0]).intern(), hashMap);
                        } else {
                            try {
                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("崁끅൞栿奜", (char) (48038 - android.widget.ExpandableListView.getPackedPositionType(0L)), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 369398817, "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr5);
                                java.lang.String str = new java.lang.String(m259332, ((java.lang.String) objArr5[0]).intern());
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoSizes("⧦蠢ഖ㚚", (char) (21190 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "蟀犏어ꍒ", "⊠썞뮶ጻ", objArr6);
                                m25980 = mbVar.m25980(obj, null, highSpeedVideoFpsRanges, ((java.lang.String) objArr6[0]).intern(), hashMap, java.lang.Integer.parseInt(str));
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        }
                        int i = getOutputFormats + 49;
                        getInputFormats = i % 128;
                        if (i % 2 != 0) {
                            util.h.xy.cq.ma.getHighResolutionOutputSizeshNQ4ISI(m25980, this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDurationlomOqCM, this.getOutputStallDuration);
                            throw new java.lang.NullPointerException();
                        }
                        util.h.xy.cj.mb highResolutionOutputSizeshNQ4ISI = util.h.xy.cq.ma.getHighResolutionOutputSizeshNQ4ISI(m25980, this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDurationlomOqCM, this.getOutputStallDuration);
                        getOutputFormats = (getInputFormats + 15) % 128;
                        return highResolutionOutputSizeshNQ4ISI;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } finally {
                    util.h.xy.cv.ra.m26066(this.getOutputStallDuration);
                }
            } catch (util.h.xy.cn.b e) {
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e.getMessage(), e);
            }
        } catch (java.io.IOException e2) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1115, e2.getMessage(), e2);
        } catch (util.h.xy.cm.ma e3) {
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, e3.getMessage(), e3);
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 19) % 128;
        char[] cArr = charArray;
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr2, 0, length);
        java.lang.System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i2]) % 65535);
            cArr3[i3] = (char) (((cArr2[i3] * 32718) + cArr3[i2]) / 65535);
            cArr2[i3] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizes ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 35) % 128;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0392: MOVE (r2 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:105:0x0391 */
    private java.lang.String getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) throws util.h.xy.ck.rc {
        java.lang.Throwable th;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        util.h.xy.cm.ma maVar;
        java.io.UnsupportedEncodingException unsupportedEncodingException;
        byte[] bArr6;
        byte[] bArr7;
        java.lang.String str;
        byte[] bArr8;
        java.lang.String str2;
        java.util.HashMap hashMap;
        byte[] highSpeedVideoFpsRanges;
        byte[] m26072;
        byte[] bArr9;
        byte[] bArr10;
        util.h.xy.ci.ra m25931 = util.h.xy.ci.ra.m25931();
        try {
            try {
                try {
                    byte[] m25933 = m25931.m25933(util.h.xy.ci.mb.f1107);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes("崁끅൞栿奜", (char) (android.graphics.Color.red(0) + 48038), 37969 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr);
                    java.lang.String str3 = new java.lang.String(m25933, ((java.lang.String) objArr[0]).intern());
                    byte[] m259332 = m25931.m25933(util.h.xy.ci.mb.f1104);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("崁끅൞栿奜", (char) (48038 - android.text.TextUtils.indexOf("", "")), 352621601 - android.graphics.Color.rgb(0, 0, 0), "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr2);
                    java.lang.String str4 = new java.lang.String(m259332, ((java.lang.String) objArr2[0]).intern());
                    hashMap = new java.util.HashMap();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("⽗ꬻ綆㾅忆", (char) (28246 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1468713782, "쪿甴垨杮", "⊠썞뮶ጻ", objArr3);
                    hashMap.put(((java.lang.String) objArr3[0]).intern(), str3);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("ⴀ鰭Ԉ輧勜\uf05fṰ䔼빰\ud998\ued43\uedbf㹱ࡅ䈽\uf804覓穧", (char) (26805 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\ud80c礪뗼奨", "⊠썞뮶ጻ", objArr4);
                    hashMap.put(((java.lang.String) objArr4[0]).intern(), str4);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{209955166, 1361985227, -1561569700, 517008103, -1947700799, 303793400, -1497210049, 37825261}, 14 - android.view.View.resolveSize(0, 0), objArr5);
                    java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                    try {
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("崁끅൞栿奜", (char) (48037 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), 369398817 - android.widget.ExpandableListView.getPackedPositionGroup(0L), "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr6);
                            hashMap.put(intern, new java.lang.String(bArr, ((java.lang.String) objArr6[0]).intern()));
                            highSpeedVideoFpsRanges = util.h.xy.cq.b.getHighSpeedVideoFpsRanges();
                            this.getOutputMinFrameDuration.m26011(highSpeedVideoFpsRanges);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("箇\uf285塬軤\u2435퍍㹓䆔묕彚懝泎䖾\uf658ٮ袘⤗벦", (char) (28056 - android.graphics.Color.red(0)), android.widget.ExpandableListView.getPackedPositionGroup(0L), "捳\uddc3飒捭", "⊠썞뮶ጻ", objArr7);
                            java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            getHighSpeedVideoSizes("崁끅൞栿奜", (char) (48038 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), android.view.View.MeasureSpec.getSize(0) + 369398817, "ↈҔꘖ\ueabb", "⊠썞뮶ጻ", objArr8);
                            hashMap.put(intern2, new java.lang.String(highSpeedVideoFpsRanges, ((java.lang.String) objArr8[0]).intern()));
                            try {
                                try {
                                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("詨붕圃騵蝽꧂ⴧ鋡촱ᵶᆖش♺⧧\udbb7ጸ쯙\ue4fe狼캖柕쵌贚ⳋ̩", (char) ((-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), android.view.KeyEvent.keyCodeFromString("") + 2142030904, "㠺곌\ue97fᇗ", "⊠썞뮶ጻ", objArr9);
                                    java.lang.String intern3 = ((java.lang.String) objArr9[0]).intern();
                                    try {
                                        bArr5 = null;
                                        try {
                                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes("驣\u0c91ᇈᡇ⺰푽鱵鞯們趢쮓ۦ홛", (char) (9491 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), android.graphics.ImageFormat.getBitsPerPixel(0) - 1881849133, "툂핂ᎏ혥", "⊠썞뮶ጻ", objArr10);
                                            hashMap.put(intern3, ((java.lang.String) objArr10[0]).intern());
                                            bArr7 = util.h.xy.cm.mb.m25967(bArr);
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            java.lang.Throwable th3 = th;
                                            java.lang.Throwable cause = th3.getCause();
                                            if (cause != null) {
                                                throw cause;
                                            }
                                            throw th3;
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    java.lang.Throwable th6 = th;
                                    java.lang.Throwable cause2 = th6.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            java.lang.Throwable th9 = th;
                            java.lang.Throwable cause3 = th9.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th9;
                        }
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    bArr7 = bArr6;
                    str = "android.os.Process";
                }
            } catch (java.io.UnsupportedEncodingException e) {
                e = e;
                unsupportedEncodingException = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, unsupportedEncodingException.getMessage(), unsupportedEncodingException);
            } catch (util.h.xy.cm.ma e2) {
                e = e2;
                maVar = e;
                throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, maVar.getMessage(), maVar);
            } catch (java.lang.Throwable th12) {
                th = th12;
                bArr5 = null;
                th = th;
                bArr3 = 0;
                bArr4 = null;
                util.h.xy.cv.ra.m26068(bArr4, bArr3, bArr5);
                throw th;
            }
            try {
                m26072 = util.h.xy.cv.ra.m26072(bArr7, bArr2, highSpeedVideoFpsRanges);
            } catch (java.io.UnsupportedEncodingException e3) {
                unsupportedEncodingException = e3;
            } catch (util.h.xy.cm.ma e4) {
                maVar = e4;
            } catch (java.lang.Throwable th13) {
                th = th13;
                bArr4 = bArr7;
                bArr3 = 0;
                util.h.xy.cv.ra.m26068(bArr4, bArr3, bArr5);
                throw th;
            }
            try {
                byte[] bArr11 = util.h.xy.cq.b.getHighSpeedVideoFpsRanges(util.h.xy.cq.b.ra.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(), m26072, highSpeedVideoFpsRanges, this.getOutputMinFrameDuration.m26008()).get(util.h.xy.cq.b.ra.getHighSpeedVideoSizes);
                try {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{209955166, 1361985227, 1511457424, -599063729, -1226499275, -1753297749, 364287578, 1718151308}, 14 - android.view.MotionEvent.axisFromString(""), objArr11);
                    hashMap.put(((java.lang.String) objArr11[0]).intern(), util.h.xy.cv.ma.m26064(bArr11));
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("垣ж䅜쐃C奴퉢ℏⴕ꒑ꃔ짢⻉", (char) (41302 - android.text.TextUtils.getCapsMode("", 0, 0)), android.widget.ExpandableListView.getPackedPositionType(0L) - 868955911, "塞㓈囌랡", "⊠썞뮶ጻ", objArr12);
                    java.lang.String intern4 = ((java.lang.String) objArr12[0]).intern();
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{445188407, -1585829522}, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '-', objArr13);
                    hashMap.put(intern4, ((java.lang.String) objArr13[0]).intern());
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    getHighSpeedVideoSizes("\ue241綶\uab6e᠃簼ᳯ", (char) (android.text.TextUtils.getOffsetBefore("", 0) + 13468), android.view.Gravity.getAbsoluteGravity(0, 0), "\uf0f0念鳯䤴", "⊠썞뮶ጻ", objArr14);
                    sb.append(((java.lang.String) objArr14[0]).intern());
                    sb.append(util.h.xy.cq.b.getHighSpeedVideoFpsRanges(new java.util.HashMap(hashMap)));
                    java.lang.String obj = sb.toString();
                    util.h.xy.cv.ra.m26068(bArr7, m26072, bArr11);
                    return obj;
                } catch (java.io.UnsupportedEncodingException e5) {
                    unsupportedEncodingException = e5;
                    bArr10 = bArr11;
                    throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, unsupportedEncodingException.getMessage(), unsupportedEncodingException);
                } catch (util.h.xy.cm.ma e6) {
                    maVar = e6;
                    bArr9 = bArr11;
                    throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, maVar.getMessage(), maVar);
                } catch (java.lang.Throwable th14) {
                    th = th14;
                    bArr8 = bArr11;
                    str2 = m26072;
                    bArr5 = bArr8;
                    bArr4 = bArr7;
                    bArr3 = str2;
                    util.h.xy.cv.ra.m26068(bArr4, bArr3, bArr5);
                    throw th;
                }
            } catch (java.io.UnsupportedEncodingException e7) {
                unsupportedEncodingException = e7;
                bArr10 = null;
            } catch (util.h.xy.cm.ma e8) {
                maVar = e8;
                bArr9 = null;
            } catch (java.lang.Throwable th15) {
                th = th15;
                str = m26072;
                bArr8 = null;
                str2 = str;
                bArr5 = bArr8;
                bArr4 = bArr7;
                bArr3 = str2;
                util.h.xy.cv.ra.m26068(bArr4, bArr3, bArr5);
                throw th;
            }
        } catch (java.io.UnsupportedEncodingException e9) {
            e = e9;
            unsupportedEncodingException = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1114, unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        } catch (util.h.xy.cm.ma e10) {
            e = e10;
            maVar = e;
            throw new util.h.xy.ck.rc(util.h.xy.ck.d.f1110, maVar.getMessage(), maVar);
        } catch (java.lang.Throwable th16) {
            th = th16;
            th = th;
            bArr3 = 0;
            bArr4 = null;
            util.h.xy.cv.ra.m26068(bArr4, bArr3, bArr5);
            throw th;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() throws util.h.xy.ck.rc {
        byte[] bArr = this.getOutputMinFrameDurationlomOqCM;
        if (bArr != null) {
            util.h.xy.cv.ra.m26066(bArr);
        }
        byte[] bArr2 = this.getOutputStallDurationlomOqCM;
        if (bArr2 != null) {
            int i = getInputFormats + 1;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                util.h.xy.cv.ra.m26066(bArr2);
            } else {
                util.h.xy.cv.ra.m26066(bArr2);
                throw new java.lang.ArithmeticException();
            }
        }
        byte[] bArr3 = this.getOutputStallDuration;
        if (bArr3 != null) {
            util.h.xy.cv.ra.m26066(bArr3);
        }
        util.h.xy.cq.me meVar = this.getOutputMinFrameDuration;
        if (meVar != null) {
            getInputFormats = (getOutputFormats + 63) % 128;
            meVar.m26015();
            getInputFormats = (getOutputFormats + 119) % 128;
        }
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = 3540323111629623786L;
        getHighSpeedVideoSizes = 294925130;
        getHighSpeedVideoFpsRanges = (char) 13130;
        getHighSpeedVideoFpsRangesFor = new int[]{290777861, 68088568, 1885567431, 139221430, -1520208456, -2129197655, -1177702066, 1586887528, 2035365993, 43340518, -1381695528, -797568549, -1567746518, 1950341761, 906794942, -1219967466, -1386588980, 247335225};
    }
}
