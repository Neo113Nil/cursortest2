package util.h.xy.ct;

/* loaded from: classes5.dex */
public final class ra implements util.h.xy.ct.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor;
    private static final java.lang.String getHighSpeedVideoSizes;
    private static int getOutputMinFrameDuration;
    private final util.h.xy.co.ra getHighSpeedVideoSizesFor;

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoSizes = util.h.xy.ct.ra.class.getName();
        int i = getOutputMinFrameDuration + 39;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Camera2StreamConfigurationMap' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class ma {
        public static final util.h.xy.ct.ra.ma Camera2StreamConfigurationMap;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        public static final util.h.xy.ct.ra.ma getHighSpeedVideoFpsRanges;
        public static final util.h.xy.ct.ra.ma getHighSpeedVideoFpsRangesFor;
        public static final util.h.xy.ct.ra.ma getHighSpeedVideoSizes;
        private static int getHighSpeedVideoSizesFor = 1;
        private static long getInputFormats = 0;
        private static int getInputSizeshNQ4ISI = 1;
        private static int getOutputFormats;
        private static final /* synthetic */ util.h.xy.ct.ra.ma[] getOutputMinFrameDuration;
        private final java.lang.String getOutputSizes;

        public static util.h.xy.ct.ra.ma valueOf(java.lang.String str) {
            getHighSpeedVideoSizesFor = (getOutputFormats + 103) % 128;
            util.h.xy.ct.ra.ma maVar = (util.h.xy.ct.ra.ma) java.lang.Enum.valueOf(util.h.xy.ct.ra.ma.class, str);
            int i = getOutputFormats + 29;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                return maVar;
            }
            throw null;
        }

        public static util.h.xy.ct.ra.ma[] values() {
            getHighSpeedVideoSizesFor = (getOutputFormats + 117) % 128;
            util.h.xy.ct.ra.ma[] maVarArr = (util.h.xy.ct.ra.ma[]) getOutputMinFrameDuration.clone();
            int i = getOutputFormats + 39;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                return maVarArr;
            }
            throw null;
        }

        static {
            Camera2StreamConfigurationMap();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駦龒键諘聯蘐뾻따\uaaccꁲꘅ\udfad", android.text.TextUtils.indexOf("", "", 0) + 1637, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駩鲸鍋陶", android.text.TextUtils.getCapsMode("", 0, 0) + 1361, objArr2);
            util.h.xy.ct.ra.ma maVar = new util.h.xy.ct.ra.ma(intern, 0, ((java.lang.String) objArr2[0]).intern());
            Camera2StreamConfigurationMap = maVar;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駺\uf8ce宆멘ᴞ翴\udeb0ㅸ逬\uf2f6嗁", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24889, objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駦俐㖩᭨셒뜖鳪䋌⢓", 54828 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr4);
            util.h.xy.ct.ra.ma maVar2 = new util.h.xy.ct.ra.ma(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            getHighSpeedVideoFpsRangesFor = maVar2;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駥圾Ѩ\uf5b9ꋍ速䅙㺇", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 52937, objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駩돴췓\ue7d3", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10780, objArr6);
            util.h.xy.ct.ra.ma maVar3 = new util.h.xy.ct.ra.ma(intern3, 2, ((java.lang.String) objArr6[0]).intern());
            getHighSpeedVideoFpsRanges = maVar3;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駿얏", android.view.KeyEvent.normalizeMetaState(0) + 23663, objArr7);
            java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("駩怀樻琵", android.widget.ExpandableListView.getPackedPositionChild(0L) + 63978, objArr8);
            util.h.xy.ct.ra.ma maVar4 = new util.h.xy.ct.ra.ma(intern4, 3, ((java.lang.String) objArr8[0]).intern());
            getHighSpeedVideoSizes = maVar4;
            int i = getHighSpeedVideoSizesFor;
            getOutputFormats = (i + 55) % 128;
            getOutputFormats = (i + 45) % 128;
            getOutputMinFrameDuration = new util.h.xy.ct.ra.ma[]{maVar, maVar2, maVar3, maVar4};
            int i2 = i + 101;
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        private ma(java.lang.String str, int i, java.lang.String str2) {
            this.getOutputSizes = str2;
        }

        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            int i = (getOutputFormats + 23) % 128;
            getHighSpeedVideoSizesFor = i;
            java.lang.String str = this.getOutputSizes;
            int i2 = i + 47;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getInputSizeshNQ4ISI = (i2 + 97) % 128;
            getInputSizeshNQ4ISI = (i2 + 101) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.d dVar = new util.h.xz.b.d();
            dVar.f2628 = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getInputFormats ^ (-7508379876853140581L));
                dVar.f2629++;
            }
            char[] cArr = new char[length];
            dVar.f2629 = 0;
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 19) % 128;
            while (dVar.f2629 < charArray.length) {
                getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 29) % 128;
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                dVar.f2629++;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static void Camera2StreamConfigurationMap() {
            getInputFormats = -7810774548394431955L;
        }
    }

    ra() throws util.h.xy.ct.mc {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String highSpeedVideoFpsRangesFor = util.h.xy.ct.ra.ma.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ჵ䫶ꓢỒ碣튂\u0c91暍삫㫢鑖칙⡅舾ﱣ嘑끇\uea24䐈브᧿", 23053 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            hashMap.put(highSpeedVideoFpsRangesFor, ((java.lang.String) objArr[0]).intern());
            java.lang.String highSpeedVideoFpsRangesFor2 = util.h.xy.ct.ra.ma.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ჵꄦ獂բퟣ榨㯖취鹿值\ue240뒄䚧", 45533 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
            hashMap.put(highSpeedVideoFpsRangesFor2, ((java.lang.String) objArr2[0]).intern());
            java.lang.String highSpeedVideoFpsRangesFor3 = util.h.xy.ct.ra.ma.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ჵꄦ獂բퟣ榨㯖취鹿值\ue240뒄䚧", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45532, objArr3);
            hashMap.put(highSpeedVideoFpsRangesFor3, ((java.lang.String) objArr3[0]).intern());
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ყ\uf5c1\uda8b뽓萦櫡侩味㥝", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 58679, objArr4);
            util.h.xy.co.ra raVar = new util.h.xy.co.ra(((java.lang.String) objArr4[0]).intern(), util.h.xy.ct.ra.ma.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), hashMap);
            this.getHighSpeedVideoSizesFor = raVar;
            try {
                util.h.xy.co.ma.m25988().mo25986(raVar);
            } catch (util.h.xy.co.b unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ჲ緺쪻坥ꐹ㊬龺\uec66礦쟬咤ꄢภ鳶\ue9a0癧쌳凱뺷\u0b7d须\ue6ef玸쁽\u2d2a믢ࢴ锲\ue220烠\uddba⩤뜶\u05cf銌＄", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 27968, objArr5);
                sb.append(((java.lang.String) objArr5[0]).intern());
                throw new util.h.xy.ct.mc(sb.toString());
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 15) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoFpsRangesFor ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 81) % 128;
        while (dVar.f2629 < charArray.length) {
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // util.h.xy.ct.a
    /* renamed from: ˏ */
    public final boolean mo26030() {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 7) % 128;
        try {
            boolean mo25983 = util.h.xy.co.ma.m25988().mo25983(this.getHighSpeedVideoSizesFor, util.h.xy.ct.ra.ma.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor());
            getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 69) % 128;
            return mo25983;
        } catch (util.h.xy.co.b unused) {
            return false;
        }
    }

    @Override // util.h.xy.ct.a
    /* renamed from: ᐝ */
    public final java.util.Map<util.h.xy.ct.a.b, byte[]> mo26031() throws util.h.xy.ct.mc {
        util.h.xy.cs.mb mbVar = null;
        try {
            try {
                java.util.Map<java.lang.String, byte[]> mo25984 = util.h.xy.co.ma.m25988().mo25984(this.getHighSpeedVideoSizesFor, util.h.xy.ct.ra.ma.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor());
                byte[] bArr = mo25984.get(util.h.xy.ct.ra.ma.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor());
                byte[] bArr2 = mo25984.get(util.h.xy.ct.ra.ma.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
                byte[] bArr3 = mo25984.get(util.h.xy.ct.ra.ma.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor());
                mbVar = util.h.xy.ct.c.m26039(util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107), bArr, new util.h.xy.cp.ma(), util.h.xy.ct.mb.f1128);
                byte[] m25971 = util.h.xy.cm.rb.m25971(mbVar.getEncoded(), bArr2, bArr3);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(util.h.xy.ct.a.b.f1122, m25971);
                if (mbVar != null) {
                    getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 63) % 128;
                    mbVar.m26028();
                }
                getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 11) % 128;
                return hashMap;
            } catch (util.h.xy.cm.ma unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ტ엒뫀濴䓷㧥\ueed5쎎뢀淴䊾㞫\uec47섘뙝歳䁵㕭\uea1c\udf03됟椵帷㌹\ue99f\udec2돛棱差㊨\ue78e\udc96놸暮宠け\ue55e\uda0e", 54539 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
                throw new util.h.xy.ct.mc(((java.lang.String) objArr[0]).intern());
            } catch (util.h.xy.co.b unused2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("ტ엒뫀濴䓷㧥\ueed5쎎뢀淴䊾㞫\uec47섘뙝歳䁵㕭\uea1c\udf03됟椵帷㌹\ue99f\udec2돛棱差㊨\ue78e\udc96놸暮宠け\ue55e\uda0e", 54539 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                throw new util.h.xy.ct.mc(sb.toString());
            }
        } catch (java.lang.Throwable th) {
            if (mbVar != null) {
                mbVar.m26028();
            }
            throw th;
        }
    }

    @Override // util.h.xy.ct.a
    /* renamed from: ˎ */
    public final void mo26029() throws util.h.xy.ct.mc {
        int i = getOutputMinFrameDuration;
        getHighResolutionOutputSizeshNQ4ISI = (i + 61) % 128;
        int i2 = i + 49;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                util.h.xy.co.ma.m25988().mo25985(this.getHighSpeedVideoSizesFor);
                throw new java.lang.NullPointerException();
            }
            util.h.xy.co.ma.m25988().mo25985(this.getHighSpeedVideoSizesFor);
            int i3 = (getOutputMinFrameDuration + 45) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            int i4 = i3 + 69;
            getOutputMinFrameDuration = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } catch (util.h.xy.co.b unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoSizes);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ჲ蕴㮧퇋䘁ﳢ鋦܈뵖叢져縌ᒌ褣㽩햁䯉\ue011雥\u0ce4ꄂ址췠戽ᡊ躊⌨\ud96e俋\ue5de驨ガ꛶孈", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38321, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            throw new util.h.xy.ct.mc(sb.toString());
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRangesFor = -6807265487049120980L;
    }
}
