package util.h.xy.ce;

/* loaded from: classes5.dex */
public final class mb {
    private static char[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    static boolean getHighSpeedVideoSizes = false;
    private static int getHighSpeedVideoSizesFor = 1;
    private static util.h.xy.ce.mb getInputFormats;
    private static long getInputSizeshNQ4ISI;
    private static long getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static int getOutputSizes;
    private static int getOutputStallDuration;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDuration = util.h.xy.ce.mb.class.getName();
        getHighSpeedVideoSizes = true;
        int i = getOutputStallDuration + 59;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private mb() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ce.mb m25873() {
        int i = getHighSpeedVideoSizesFor + 7;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            if (getInputFormats == null) {
                getInputFormats = new util.h.xy.ce.mb();
                getHighSpeedVideoSizesFor = (getOutputStallDuration + 69) % 128;
            }
            return getInputFormats;
        }
        throw new java.lang.ArithmeticException();
    }

    public static final class a {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private util.h.xy.d.mg getHighSpeedVideoFpsRanges = util.h.xy.d.mg.f1144;

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.d.mg m25878() {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i ^ 41) + ((i & 41) << 1);
            int i3 = i2 % 128;
            getHighSpeedVideoFpsRangesFor = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            util.h.xy.d.mg mgVar = this.getHighSpeedVideoFpsRanges;
            int i4 = i3 + 51;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                return mgVar;
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final void m25879(util.h.xy.d.mg mgVar) {
            int i = getHighSpeedVideoFpsRangesFor + 3;
            int i2 = i % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i % 2 == 0) {
                this.getHighSpeedVideoFpsRanges = mgVar;
                int i3 = i2 + 85;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                if (i3 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                return;
            }
            this.getHighSpeedVideoFpsRanges = mgVar;
            throw null;
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
            jArr[rbVar.f2651] = (((char) (Camera2StreamConfigurationMap[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getInputSizeshNQ4ISI))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoFpsRangesFor + 53;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 >> 1;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00aa, code lost:
    
        if (r11.equals(((java.lang.String) r9[0]).intern()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0081, code lost:
    
        if (r11.equals(((java.lang.String) r9[0]).intern()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ac, code lost:
    
        r10 = java.lang.Integer.parseInt(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b0, code lost:
    
        if (r10 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b2, code lost:
    
        util.h.xy.ce.mb.getHighSpeedVideoSizesFor = (util.h.xy.ce.mb.getOutputStallDuration + 73) % 128;
        r8 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int getHighSpeedVideoFpsRanges(java.lang.String str, util.h.xy.d.c cVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(cVar.mo26151(str, util.h.xy.d.ma.f1142).getResult());
        int i = 1;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("孅\ue1eeӊ", (char) (50466 - android.view.View.getDefaultSize(0, 0)), 1122630563 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "ꌰ\ue9fb≂棅", "鞂❳趒낢", objArr);
        java.lang.String optString = jSONObject.optString(((java.lang.String) objArr[0]).intern());
        if (!optString.isEmpty()) {
            int i2 = getOutputStallDuration + 21;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u2fe9", (char) (android.graphics.ImageFormat.getBitsPerPixel(1) + 47023), android.view.View.getDefaultSize(1, 1) * 1911342266, "뫚\uecc4깱\ue7b7", "鞂❳趒낢", objArr2);
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\u2fe9", (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 47023), android.view.View.getDefaultSize(0, 0) + 1911342266, "뫚\uecc4깱\ue7b7", "鞂❳趒낢", objArr3);
            }
        }
        getOutputStallDuration = (getHighSpeedVideoSizesFor + 57) % 128;
        return i;
    }

    private boolean getHighSpeedVideoFpsRangesFor(util.h.xy.d.rc[] rcVarArr) {
        boolean z;
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getOutputStallDuration + 79) % 128;
            z = false;
            util.h.xy.d.rc rcVar = rcVarArr[0];
            if (rcVar.m26243() != null) {
                getOutputStallDuration = (getHighSpeedVideoSizesFor + 85) % 128;
                if (rcVar.m26243().length != 0) {
                    int i = getHighSpeedVideoSizesFor + 5;
                    getOutputStallDuration = i % 128;
                    int i2 = i % 2;
                    z = true;
                }
            }
            getOutputStallDuration = (getHighSpeedVideoSizesFor + 17) % 128;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x071c A[Catch: InternalComponentException -> 0x0785, JSONException -> 0x0788, all -> 0x08cb, TryCatch #29 {, blocks: (B:4:0x0005, B:9:0x0016, B:13:0x0054, B:17:0x0095, B:21:0x012a, B:25:0x014f, B:31:0x016d, B:33:0x0173, B:34:0x0174, B:35:0x0175, B:38:0x0193, B:42:0x01d5, B:45:0x0215, B:48:0x0221, B:49:0x0223, B:361:0x0233, B:56:0x024d, B:58:0x0254, B:60:0x025a, B:103:0x0260, B:105:0x0263, B:108:0x0265, B:110:0x0267, B:116:0x0714, B:118:0x071c, B:120:0x0724, B:122:0x072a, B:124:0x0748, B:127:0x0757, B:129:0x075b, B:133:0x0767, B:135:0x076b, B:139:0x0777, B:141:0x077b, B:65:0x081b, B:70:0x085b, B:345:0x078e, B:76:0x07a6, B:79:0x07b7, B:82:0x07d1, B:389:0x089c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0757 A[Catch: InternalComponentException -> 0x078f, JSONException -> 0x0797, all -> 0x08cb, TryCatch #29 {, blocks: (B:4:0x0005, B:9:0x0016, B:13:0x0054, B:17:0x0095, B:21:0x012a, B:25:0x014f, B:31:0x016d, B:33:0x0173, B:34:0x0174, B:35:0x0175, B:38:0x0193, B:42:0x01d5, B:45:0x0215, B:48:0x0221, B:49:0x0223, B:361:0x0233, B:56:0x024d, B:58:0x0254, B:60:0x025a, B:103:0x0260, B:105:0x0263, B:108:0x0265, B:110:0x0267, B:116:0x0714, B:118:0x071c, B:120:0x0724, B:122:0x072a, B:124:0x0748, B:127:0x0757, B:129:0x075b, B:133:0x0767, B:135:0x076b, B:139:0x0777, B:141:0x077b, B:65:0x081b, B:70:0x085b, B:345:0x078e, B:76:0x07a6, B:79:0x07b7, B:82:0x07d1, B:389:0x089c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0767 A[Catch: InternalComponentException -> 0x078f, JSONException -> 0x0797, all -> 0x08cb, TryCatch #29 {, blocks: (B:4:0x0005, B:9:0x0016, B:13:0x0054, B:17:0x0095, B:21:0x012a, B:25:0x014f, B:31:0x016d, B:33:0x0173, B:34:0x0174, B:35:0x0175, B:38:0x0193, B:42:0x01d5, B:45:0x0215, B:48:0x0221, B:49:0x0223, B:361:0x0233, B:56:0x024d, B:58:0x0254, B:60:0x025a, B:103:0x0260, B:105:0x0263, B:108:0x0265, B:110:0x0267, B:116:0x0714, B:118:0x071c, B:120:0x0724, B:122:0x072a, B:124:0x0748, B:127:0x0757, B:129:0x075b, B:133:0x0767, B:135:0x076b, B:139:0x0777, B:141:0x077b, B:65:0x081b, B:70:0x085b, B:345:0x078e, B:76:0x07a6, B:79:0x07b7, B:82:0x07d1, B:389:0x089c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0777 A[Catch: InternalComponentException -> 0x078f, JSONException -> 0x0797, all -> 0x08cb, TryCatch #29 {, blocks: (B:4:0x0005, B:9:0x0016, B:13:0x0054, B:17:0x0095, B:21:0x012a, B:25:0x014f, B:31:0x016d, B:33:0x0173, B:34:0x0174, B:35:0x0175, B:38:0x0193, B:42:0x01d5, B:45:0x0215, B:48:0x0221, B:49:0x0223, B:361:0x0233, B:56:0x024d, B:58:0x0254, B:60:0x025a, B:103:0x0260, B:105:0x0263, B:108:0x0265, B:110:0x0267, B:116:0x0714, B:118:0x071c, B:120:0x0724, B:122:0x072a, B:124:0x0748, B:127:0x0757, B:129:0x075b, B:133:0x0767, B:135:0x076b, B:139:0x0777, B:141:0x077b, B:65:0x081b, B:70:0x085b, B:345:0x078e, B:76:0x07a6, B:79:0x07b7, B:82:0x07d1, B:389:0x089c), top: B:3:0x0005 }] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25876(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, java.lang.String str2, util.h.xy.ce.mb.a aVar) {
        boolean z;
        int i;
        java.lang.Object obj;
        int i2;
        boolean z2;
        org.json.JSONException jSONException;
        com.gemalto.mfs.mwsdk.exception.InternalComponentException internalComponentException;
        ?? r5;
        ?? r52;
        boolean z3;
        boolean z4;
        java.lang.Object[] objArr;
        util.h.xy.d.rc[] rcVarArr;
        int i3;
        java.lang.Throwable th;
        int i4;
        util.h.xy.d.rc[] rcVarArr2;
        util.h.xy.d.rc[] rcVarArr3;
        int i5;
        int i6;
        util.h.xy.d.rc[] rcVarArr4;
        util.h.xy.d.rc[] rcVarArr5;
        util.h.xy.d.mc mcVar;
        util.h.xy.d.b bVar;
        util.h.xy.d.rc[] rcVarArr6;
        util.h.xy.an.ma maVar;
        ?? r13;
        util.h.xy.an.ma maVar2;
        int i7;
        util.h.xy.d.rc[] rcVarArr7;
        util.h.xy.d.rc[] rcVarArr8;
        util.h.xy.d.rc[] rcVarArr9;
        java.lang.String str3 = str;
        synchronized (this) {
            if (!m25875(str, digitalizedCardState).isSuccessful()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(20 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.text.TextUtils.indexOf("", "") + 324, (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 36595), objArr2);
                return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr2[0]).intern(), 583);
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ue7d2孪賊쮊\ue813\ue009ᑍ乌榱倐ㅙ萮嚶古黻揹㓹認ꗏ\ue2f6屝㞮緛", (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 1846907230 - (android.view.ViewConfiguration.getTapTimeout() >> 16), "帉ᖑὮ\uf0ae", "鞂❳趒낢", objArr3);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr3[0]).intern());
                java.lang.String m26759 = util.h.xy.f.b.f2201.m26759(str3);
                com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str);
                try {
                    if (m26759 == null) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54, 1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 7191), objArr4);
                        return new util.h.xy.an.ra(((java.lang.String) objArr4[0]).intern(), 561);
                    }
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\ueb6f탟ᄾ\u0082㚪㣣\uf418螓\ue3fb洫ꕝ⦇釓\ue6ef벎煭", (char) (43727 - android.view.View.MeasureSpec.getMode(0)), android.view.KeyEvent.normalizeMetaState(0), "鄞従콕蒪", "鞂❳趒낢", objArr5);
                    java.lang.String string = jSONObject2.getString(((java.lang.String) objArr5[0]).intern());
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("劣坞青\uef85ญƓ褚⸛뎘\ud8d6", (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "墌ꗡ붥ꟾ", "鞂❳趒낢", objArr6);
                    util.h.xy.ce.ra m25872 = new util.h.xy.ce.a().m25872(m26759, jSONObject2, new org.json.JSONArray(util.h.xy.ce.a.m25871(jSONObject2.getString(((java.lang.String) objArr6[0]).intern()), string)), highResolutionOutputSizeshNQ4ISI, str);
                    util.h.xy.d.b m25883 = m25872.m25883();
                    aVar.m25879(m25883.m26133());
                    util.h.xy.d.mc mcVar2 = new util.h.xy.d.mc();
                    util.h.xy.d.rc[] m25880 = m25872.m25880();
                    util.h.xy.d.rc[] m25888 = m25872.m25888();
                    util.h.xy.d.rc[] m25882 = m25872.m25882();
                    util.h.xy.d.rc[] m25885 = m25872.m25885();
                    if (m25880 == null && m25882 == null && m25885 == null) {
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 54, (char) (61418 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr7);
                            return new util.h.xy.an.ra(((java.lang.String) objArr7[0]).intern());
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    try {
                        getHighSpeedVideoFpsRanges((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 79, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 53793), objArr8);
                        java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("錽\uf062ㄍ츉젿嘏쪁寖멃㪓ﷀ캲칕᪾ڍ䭁䳾߶௦\ufaf6荑ꇢꑢ\uda72흡ձഁ覅왣\u2e6c\uf0ceᶿ㮺☃뀗\uf796쫜謻⥤蒊འ\ud969윊䉲䶫뀫䴟敤퉠\u0011㦔\ue02a芭烃듨∜榦刁哵\uf5a2茧깴眴쯳ئ頿\ud867", (char) (41178 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (-1113468603) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "䖄ꇑ\udabd掠", "鞂❳趒낢", objArr9);
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(m25880, m25885, intern, ((java.lang.String) objArr9[0]).intern());
                        if (Camera2StreamConfigurationMap2 != null) {
                            return Camera2StreamConfigurationMap2;
                        }
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges("篯ꗼ᭙镜隒흨\u0603\ue9f2ᐈ쁞\uaac9冕걀異山͛隔圉\ue2c7뛟\uea81쵈成滛\uebc4ⓓ欹掖䏙콋葜愙弔趚ﶴ㢛䡵眝裸\uef66섶젖\u0eda헰ⴄ鶻炼빛럕㬩\ue119꼌㷣颚䍩亳뛮㢍韐ၝ\uea1eᎬ辯", (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1666678326, "㛱坾嵣㨊", "鞂❳趒낢", objArr10);
                        java.lang.String intern2 = ((java.lang.String) objArr10[0]).intern();
                        try {
                            objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges(android.view.MotionEvent.axisFromString("") + 66, 145 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (45312 - android.text.TextUtils.getOffsetAfter("", 0)), objArr);
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                            e = e;
                            i = 1;
                            i2 = 583;
                            z2 = false;
                            obj = null;
                            internalComponentException = e;
                            r52 = z2;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr11 = new java.lang.Object[i];
                            getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr11);
                            sb.append(((java.lang.String) objArr11[r52]).intern());
                            sb.append(internalComponentException.getMessage());
                            return new util.h.xy.an.ra(obj, r52, sb.toString(), i2);
                        } catch (org.json.JSONException e2) {
                            e = e2;
                            i = 1;
                            i2 = 583;
                            z = false;
                            obj = null;
                            jSONException = e;
                            r5 = z;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr12 = new java.lang.Object[i];
                            getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr12);
                            sb2.append(((java.lang.String) objArr12[r5]).intern());
                            sb2.append(jSONException.getMessage());
                            return new util.h.xy.an.ra(obj, r5, sb2.toString(), i2);
                        }
                        try {
                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(m25880, m25882, intern2, ((java.lang.String) objArr[0]).intern());
                            if (Camera2StreamConfigurationMap3 != null) {
                                return Camera2StreamConfigurationMap3;
                            }
                            if (m25880 != null) {
                                try {
                                    mcVar2.m26195(m25880);
                                    rcVarArr = m25880;
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                                    internalComponentException = e3;
                                    i = 1;
                                    i2 = 583;
                                    r52 = 0;
                                    obj = null;
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr112 = new java.lang.Object[i];
                                    getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr112);
                                    sb3.append(((java.lang.String) objArr112[r52]).intern());
                                    sb3.append(internalComponentException.getMessage());
                                    return new util.h.xy.an.ra(obj, r52, sb3.toString(), i2);
                                } catch (org.json.JSONException e4) {
                                    jSONException = e4;
                                    i = 1;
                                    i2 = 583;
                                    r5 = 0;
                                    obj = null;
                                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr122 = new java.lang.Object[i];
                                    getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr122);
                                    sb22.append(((java.lang.String) objArr122[r5]).intern());
                                    sb22.append(jSONException.getMessage());
                                    return new util.h.xy.an.ra(obj, r5, sb22.toString(), i2);
                                }
                            } else {
                                rcVarArr = null;
                            }
                            if (m25888 != null) {
                                mcVar2.m26197(m25888);
                            } else {
                                m25888 = rcVarArr;
                            }
                            if (m25882 != null) {
                                mcVar2.m26199(m25882);
                                m25888 = m25882;
                            }
                            if (m25885 != null) {
                                mcVar2.m26201(m25885);
                                m25888 = m25885;
                            }
                            if (m25888 != null) {
                                try {
                                    if (m25888.length != 0) {
                                        int length = m25888.length;
                                        try {
                                            try {
                                                int m25077 = util.h.xy.ar.b.m25077(m25888[0].m26242());
                                                util.h.xy.an.ma maVar3 = new util.h.xy.an.ma();
                                                getHighSpeedVideoSizes = true;
                                                util.h.xy.m.mb m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
                                                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.b> mo26148 = m26975.mo26148(str3);
                                                try {
                                                    if (mo26148.isSuccessful()) {
                                                        try {
                                                            util.h.xy.d.b result = mo26148.getResult();
                                                            try {
                                                                if (result != null) {
                                                                    try {
                                                                        if (result.m26138()) {
                                                                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRanges("\uedb2켎全㊪", (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 61775), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "鏩ꂲ侺훱", "鞂❳趒낢", objArr13);
                                                                            try {
                                                                                if (((java.lang.String) objArr13[0]).intern().equals(m26759)) {
                                                                                    if (m25883.m26134() <= result.m26134()) {
                                                                                        maVar3.m25034(new util.h.xy.an.ra(null, true, null));
                                                                                        getHighSpeedVideoSizes = false;
                                                                                    }
                                                                                    if (result.m26133() == null || result.m26133() != util.h.xy.d.mg.f1145) {
                                                                                        i4 = result.m26132();
                                                                                        rcVarArr2 = m25882;
                                                                                        rcVarArr3 = m25880;
                                                                                        i5 = result.m26143();
                                                                                    } else {
                                                                                        i5 = result.m26132() + result.m26139();
                                                                                        i4 = i5;
                                                                                        rcVarArr2 = m25882;
                                                                                        rcVarArr3 = m25880;
                                                                                    }
                                                                                } else {
                                                                                    int m26132 = result.m26132() + result.m26139();
                                                                                    getHighSpeedVideoSizesFor = (getOutputStallDuration + 115) % 128;
                                                                                    util.h.xy.k.ra raVar = util.h.xy.k.ra.f2243;
                                                                                    if (m25077 >= util.h.xy.k.ra.m26934(str3, result)) {
                                                                                        try {
                                                                                            int i8 = (getOutputStallDuration + 73) % 128;
                                                                                            getHighSpeedVideoSizesFor = i8;
                                                                                            int i9 = i8 + 45;
                                                                                            getOutputStallDuration = i9 % 128;
                                                                                            if (i9 % 2 != 0) {
                                                                                                throw new java.lang.ArithmeticException();
                                                                                            }
                                                                                            i4 = m26132;
                                                                                            rcVarArr2 = m25882;
                                                                                            rcVarArr3 = m25880;
                                                                                            i5 = m25077;
                                                                                            i6 = 0;
                                                                                        } catch (java.lang.Throwable th3) {
                                                                                            th = th3;
                                                                                            th = th;
                                                                                            i3 = 0;
                                                                                            throw th;
                                                                                        }
                                                                                    } else {
                                                                                        try {
                                                                                            i4 = m26132;
                                                                                            i6 = 0;
                                                                                            try {
                                                                                                rcVarArr2 = m25882;
                                                                                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                                                                rcVarArr3 = m25880;
                                                                                                i5 = m25077;
                                                                                                getHighSpeedVideoFpsRanges((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 241 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (18554 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr14);
                                                                                                i6 = 0;
                                                                                                maVar3.m25034(new util.h.xy.an.ra(((java.lang.String) objArr14[0]).intern()));
                                                                                                getHighSpeedVideoSizes = false;
                                                                                            } catch (java.lang.Throwable th4) {
                                                                                                th = th4;
                                                                                                i3 = i6;
                                                                                                th = th;
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th5) {
                                                                                            th = th5;
                                                                                            i3 = 0;
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                                                                getHighSpeedVideoFpsRanges("\uf6d3\uf74a\ue7a6ꪁ", (char) (45866 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (android.util.TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "饬ﹷ⨝⦳", "鞂❳趒낢", objArr15);
                                                                                                i6 = 0;
                                                                                                try {
                                                                                                    if (((java.lang.String) objArr15[0]).intern().equals(m26759)) {
                                                                                                        try {
                                                                                                            if (Camera2StreamConfigurationMap(str)) {
                                                                                                                for (util.h.xy.d.rc rcVar : m25888) {
                                                                                                                    if (rcVar.m26243() != null && rcVar.m26243().length > 0) {
                                                                                                                        rcVar.m26243();
                                                                                                                    }
                                                                                                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                                                                                                    getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 62714), objArr16);
                                                                                                                    maVar3.m25034(new util.h.xy.an.ra(((java.lang.String) objArr16[0]).intern()));
                                                                                                                    getHighSpeedVideoSizes = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th6) {
                                                                                                            th = th6;
                                                                                                            th = th;
                                                                                                            i3 = 0;
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th7) {
                                                                                                    th = th7;
                                                                                                    i3 = 0;
                                                                                                    th = th;
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (java.lang.Throwable th8) {
                                                                                                th = th8;
                                                                                                i3 = 0;
                                                                                                th = th;
                                                                                                throw th;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th9) {
                                                                                            th = th9;
                                                                                            i3 = i6;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th10) {
                                                                                        th = th10;
                                                                                        i3 = i6;
                                                                                    }
                                                                                }
                                                                                if (result.m26133() != null && m25883.m26133() != result.m26133()) {
                                                                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                                                    getHighSpeedVideoFpsRanges("ｬꚃㆶ넵횞ṣ趼봌\uee6fί\uedcd駝럥ाᏠ郜찣ቊ嬨霙㵯ҍ蓄ꨶ\uec12랬䌏", (char) (android.view.View.combineMeasuredStates(0, 0) + 6050), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1227917778, "⻍콶ꊶ鸗", "鞂❳趒낢", objArr17);
                                                                                    maVar3.m25034(new util.h.xy.an.ra(((java.lang.String) objArr17[0]).intern()));
                                                                                    getHighSpeedVideoSizes = false;
                                                                                }
                                                                                if (m25883.m26144(str3)) {
                                                                                    try {
                                                                                        try {
                                                                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                                                            getHighSpeedVideoFpsRanges("삤ﻁ㪁⛧⿉럝並ꂝ誤뢭䂤駀\uef79笈任ഔ폾홭椕卿딐콃諙圎╰稔죆郧䪧", (char) (27416 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 869195366, "饙ㄡᣌ퉫", "鞂❳趒낢", objArr18);
                                                                                            maVar3.m25034(new util.h.xy.an.ra(((java.lang.String) objArr18[0]).intern()));
                                                                                            getHighSpeedVideoSizes = false;
                                                                                        } catch (java.lang.Throwable th11) {
                                                                                            java.lang.Throwable cause2 = th11.getCause();
                                                                                            if (cause2 != null) {
                                                                                                throw cause2;
                                                                                            }
                                                                                            throw th11;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th12) {
                                                                                        th = th12;
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                                if (getHighSpeedVideoSizes) {
                                                                                    try {
                                                                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                                                        getHighSpeedVideoFpsRanges("\uf6d3\uf74a\ue7a6ꪁ", (char) (45867 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), android.view.ViewConfiguration.getScrollBarSize() >> 8, "饬ﹷ⨝⦳", "鞂❳趒낢", objArr19);
                                                                                        try {
                                                                                            if (((java.lang.String) objArr19[0]).intern().equals(m26759)) {
                                                                                                try {
                                                                                                    if (Camera2StreamConfigurationMap(str) || getHighSpeedVideoFpsRangesFor(m25888)) {
                                                                                                        m25874(str, digitalizedCardState);
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th13) {
                                                                                                    throw th13;
                                                                                                }
                                                                                            }
                                                                                            rcVarArr4 = rcVarArr2;
                                                                                            rcVarArr5 = m25885;
                                                                                            mcVar = mcVar2;
                                                                                            bVar = m25883;
                                                                                            rcVarArr6 = rcVarArr3;
                                                                                            Camera2StreamConfigurationMap(str, i5, length, mcVar2, m25883.m26141(), digitalizedCardState, i4, m25883.m26142(), m25883.m26145(), m25883.m26134(), m25883.m26135(), maVar3, result);
                                                                                            str3 = str;
                                                                                            maVar = maVar3;
                                                                                            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> waitToComplete = maVar.waitToComplete();
                                                                                            if (!getHighSpeedVideoSizes && bVar.m26133() == util.h.xy.d.mg.f1144 && waitToComplete.isSuccessful()) {
                                                                                                getOutputStallDuration = (getHighSpeedVideoSizesFor + 109) % 128;
                                                                                                util.h.xy.k.ma.m26925().mo26167(str3);
                                                                                                getHighSpeedVideoSizesFor = (getOutputStallDuration + 25) % 128;
                                                                                                i7 = 0;
                                                                                                util.h.xy.f.b.f2201.m26767(str3, mcVar.m26202()[0], bVar.m26134());
                                                                                            } else {
                                                                                                i7 = 0;
                                                                                            }
                                                                                            rcVarArr7 = rcVarArr6;
                                                                                            if (rcVarArr7 != null) {
                                                                                                int length2 = rcVarArr7.length;
                                                                                                for (int i10 = i7; i10 < length2; i10++) {
                                                                                                    rcVarArr7[i10].m26245();
                                                                                                }
                                                                                            }
                                                                                            rcVarArr8 = rcVarArr4;
                                                                                            if (rcVarArr8 != null) {
                                                                                                int length3 = rcVarArr8.length;
                                                                                                for (int i11 = i7; i11 < length3; i11++) {
                                                                                                    rcVarArr8[i11].m26245();
                                                                                                }
                                                                                            }
                                                                                            rcVarArr9 = rcVarArr5;
                                                                                            if (rcVarArr9 != null) {
                                                                                                int length4 = rcVarArr9.length;
                                                                                                for (int i12 = i7; i12 < length4; i12++) {
                                                                                                    rcVarArr9[i12].m26245();
                                                                                                }
                                                                                            }
                                                                                            return waitToComplete;
                                                                                        } catch (java.lang.Throwable th14) {
                                                                                            th = th14;
                                                                                            i3 = 0;
                                                                                            th = th;
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (java.lang.Throwable th15) {
                                                                                        java.lang.Throwable cause3 = th15.getCause();
                                                                                        if (cause3 != null) {
                                                                                            throw cause3;
                                                                                        }
                                                                                        throw th15;
                                                                                    }
                                                                                }
                                                                                rcVarArr5 = m25885;
                                                                                mcVar = mcVar2;
                                                                                bVar = m25883;
                                                                                rcVarArr4 = rcVarArr2;
                                                                                rcVarArr6 = rcVarArr3;
                                                                                str3 = str;
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th = th16;
                                                                                i3 = 0;
                                                                            }
                                                                        }
                                                                    } catch (java.lang.Throwable th17) {
                                                                        th = th17;
                                                                        i3 = 0;
                                                                    }
                                                                }
                                                                rcVarArr5 = m25885;
                                                                rcVarArr4 = m25882;
                                                                rcVarArr6 = m25880;
                                                                mcVar = mcVar2;
                                                                bVar = m25883;
                                                                int i13 = m25077;
                                                                if (result != null) {
                                                                    result.m26143();
                                                                }
                                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRanges("\uedb2켎全㊪", (char) (61774 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "鏩ꂲ侺훱", "鞂❳趒낢", objArr20);
                                                                if (((java.lang.String) objArr20[0]).intern().equals(m26759)) {
                                                                    r13 = 0;
                                                                    str3 = str;
                                                                    i13 = getHighSpeedVideoFpsRanges(str3, m26975);
                                                                } else {
                                                                    r13 = 0;
                                                                    str3 = str;
                                                                }
                                                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRanges("\uf6d3\uf74a\ue7a6ꪁ", (char) (android.graphics.drawable.Drawable.resolveOpacity(r13, r13) + 45866), android.view.Gravity.getAbsoluteGravity(r13, r13), "饬ﹷ⨝⦳", "鞂❳趒낢", objArr21);
                                                                if (((java.lang.String) objArr21[r13]).intern().equals(m26759) && Camera2StreamConfigurationMap(str)) {
                                                                    int length5 = m25888.length;
                                                                    for (int i14 = r13; i14 < length5; i14++) {
                                                                        util.h.xy.d.rc rcVar2 = m25888[i14];
                                                                        if (rcVar2.m26243() != null && rcVar2.m26243().length > 0) {
                                                                            rcVar2.m26243();
                                                                        }
                                                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRanges(31 - android.text.TextUtils.indexOf("", "", (int) r13, (int) r13), 210 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (62714 - android.graphics.Color.blue((int) r13)), objArr22);
                                                                        maVar2 = maVar3;
                                                                        maVar2.m25034(new util.h.xy.an.ra(((java.lang.String) objArr22[r13]).intern()));
                                                                        getHighSpeedVideoSizes = r13;
                                                                        break;
                                                                    }
                                                                }
                                                                maVar2 = maVar3;
                                                                if (getHighSpeedVideoSizes) {
                                                                    util.h.xy.k.ra.f2243.m26966(str3.getBytes(util.h.xy.h.a.f2221), new util.h.xy.d.b(i13, 0, 0, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED, true, bVar.m26133(), bVar.m26131(), 1, 0, 1, bVar.m26134(), bVar.m26135()));
                                                                    maVar = maVar2;
                                                                    Camera2StreamConfigurationMap(str, i13, length, mcVar, bVar.m26141(), digitalizedCardState, 1, 0, 1, bVar.m26134(), bVar.m26135(), maVar, bVar);
                                                                } else {
                                                                    maVar = maVar2;
                                                                }
                                                                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> waitToComplete2 = maVar.waitToComplete();
                                                                if (!getHighSpeedVideoSizes) {
                                                                }
                                                                i7 = 0;
                                                                rcVarArr7 = rcVarArr6;
                                                                if (rcVarArr7 != null) {
                                                                }
                                                                rcVarArr8 = rcVarArr4;
                                                                if (rcVarArr8 != null) {
                                                                }
                                                                rcVarArr9 = rcVarArr5;
                                                                if (rcVarArr9 != null) {
                                                                }
                                                                return waitToComplete2;
                                                            } catch (java.lang.Throwable th18) {
                                                                th = th18;
                                                            }
                                                        } catch (java.lang.Throwable th19) {
                                                            th = th19;
                                                        }
                                                    } else {
                                                        rcVarArr5 = m25885;
                                                        rcVarArr4 = m25882;
                                                        rcVarArr6 = m25880;
                                                        mcVar = mcVar2;
                                                        bVar = m25883;
                                                    }
                                                    maVar = maVar3;
                                                    com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> waitToComplete22 = maVar.waitToComplete();
                                                    if (!getHighSpeedVideoSizes) {
                                                    }
                                                    i7 = 0;
                                                    rcVarArr7 = rcVarArr6;
                                                    if (rcVarArr7 != null) {
                                                    }
                                                    rcVarArr8 = rcVarArr4;
                                                    if (rcVarArr8 != null) {
                                                    }
                                                    rcVarArr9 = rcVarArr5;
                                                    if (rcVarArr9 != null) {
                                                    }
                                                    return waitToComplete22;
                                                } catch (java.lang.Throwable th20) {
                                                    throw th20;
                                                }
                                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e5) {
                                                e = e5;
                                                internalComponentException = e;
                                                i2 = 583;
                                                obj = null;
                                                i = 1;
                                                r52 = m25880;
                                                java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                                                java.lang.Object[] objArr1122 = new java.lang.Object[i];
                                                getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr1122);
                                                sb32.append(((java.lang.String) objArr1122[r52]).intern());
                                                sb32.append(internalComponentException.getMessage());
                                                return new util.h.xy.an.ra(obj, r52, sb32.toString(), i2);
                                            } catch (org.json.JSONException e6) {
                                                e = e6;
                                                jSONException = e;
                                                i2 = 583;
                                                obj = null;
                                                i = 1;
                                                r5 = m25880;
                                                java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
                                                java.lang.Object[] objArr1222 = new java.lang.Object[i];
                                                getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr1222);
                                                sb222.append(((java.lang.String) objArr1222[r5]).intern());
                                                sb222.append(jSONException.getMessage());
                                                return new util.h.xy.an.ra(obj, r5, sb222.toString(), i2);
                                            }
                                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e7) {
                                            e = e7;
                                            m25880 = null;
                                        } catch (org.json.JSONException e8) {
                                            e = e8;
                                            m25880 = null;
                                        }
                                    }
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e9) {
                                    e = e9;
                                    m25880 = null;
                                } catch (org.json.JSONException e10) {
                                    e = e10;
                                    m25880 = null;
                                }
                            }
                            z = false;
                            z2 = false;
                            z = false;
                            z4 = false;
                            z3 = false;
                            z2 = false;
                            try {
                                i = 1;
                                try {
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRanges(17 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr23);
                                    i2 = 583;
                                    obj = null;
                                    try {
                                        return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr23[0]).intern(), 583);
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e11) {
                                        e = e11;
                                        internalComponentException = e;
                                        r52 = z2;
                                        java.lang.StringBuilder sb322 = new java.lang.StringBuilder();
                                        java.lang.Object[] objArr11222 = new java.lang.Object[i];
                                        getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr11222);
                                        sb322.append(((java.lang.String) objArr11222[r52]).intern());
                                        sb322.append(internalComponentException.getMessage());
                                        return new util.h.xy.an.ra(obj, r52, sb322.toString(), i2);
                                    } catch (org.json.JSONException e12) {
                                        e = e12;
                                        jSONException = e;
                                        r5 = z;
                                        java.lang.StringBuilder sb2222 = new java.lang.StringBuilder();
                                        java.lang.Object[] objArr12222 = new java.lang.Object[i];
                                        getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr12222);
                                        sb2222.append(((java.lang.String) objArr12222[r5]).intern());
                                        sb2222.append(jSONException.getMessage());
                                        return new util.h.xy.an.ra(obj, r5, sb2222.toString(), i2);
                                    }
                                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e13) {
                                    e = e13;
                                    i2 = 583;
                                    z2 = z4;
                                    obj = null;
                                    internalComponentException = e;
                                    r52 = z2;
                                    java.lang.StringBuilder sb3222 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr112222 = new java.lang.Object[i];
                                    getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr112222);
                                    sb3222.append(((java.lang.String) objArr112222[r52]).intern());
                                    sb3222.append(internalComponentException.getMessage());
                                    return new util.h.xy.an.ra(obj, r52, sb3222.toString(), i2);
                                } catch (org.json.JSONException e14) {
                                    e = e14;
                                    i2 = 583;
                                    z = z3;
                                    obj = null;
                                    jSONException = e;
                                    r5 = z;
                                    java.lang.StringBuilder sb22222 = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr122222 = new java.lang.Object[i];
                                    getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr122222);
                                    sb22222.append(((java.lang.String) objArr122222[r5]).intern());
                                    sb22222.append(jSONException.getMessage());
                                    return new util.h.xy.an.ra(obj, r5, sb22222.toString(), i2);
                                }
                            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e15) {
                                e = e15;
                                i2 = 583;
                                obj = null;
                                i = 1;
                            } catch (org.json.JSONException e16) {
                                e = e16;
                                i2 = 583;
                                obj = null;
                                i = 1;
                            }
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e17) {
                            e = e17;
                            z4 = false;
                            i = 1;
                            i2 = 583;
                            z2 = z4;
                            obj = null;
                            internalComponentException = e;
                            r52 = z2;
                            java.lang.StringBuilder sb32222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr1122222 = new java.lang.Object[i];
                            getHighSpeedVideoFpsRanges(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 297 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, (int) r52, (int) r52)), objArr1122222);
                            sb32222.append(((java.lang.String) objArr1122222[r52]).intern());
                            sb32222.append(internalComponentException.getMessage());
                            return new util.h.xy.an.ra(obj, r52, sb32222.toString(), i2);
                        } catch (org.json.JSONException e18) {
                            e = e18;
                            z3 = false;
                            i = 1;
                            i2 = 583;
                            z = z3;
                            obj = null;
                            jSONException = e;
                            r5 = z;
                            java.lang.StringBuilder sb222222 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr1222222 = new java.lang.Object[i];
                            getHighSpeedVideoFpsRanges(14 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 283, (char) android.view.View.resolveSizeAndState(r5, r5, r5), objArr1222222);
                            sb222222.append(((java.lang.String) objArr1222222[r5]).intern());
                            sb222222.append(jSONException.getMessage());
                            return new util.h.xy.an.ra(obj, r5, sb222222.toString(), i2);
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e19) {
                        e = e19;
                        z4 = false;
                    } catch (org.json.JSONException e20) {
                        e = e20;
                        z3 = false;
                    }
                } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e21) {
                    internalComponentException = e21;
                    r52 = 0;
                    i = 1;
                    obj = null;
                    i2 = 583;
                } catch (org.json.JSONException e22) {
                    jSONException = e22;
                    r5 = 0;
                    i = 1;
                    obj = null;
                    i2 = 583;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e23) {
                e = e23;
                z2 = false;
                i = 1;
                obj = null;
                i2 = 583;
            } catch (org.json.JSONException e24) {
                e = e24;
                z = false;
                i = 1;
                obj = null;
                i2 = 583;
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 63;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L)) ^ ((int) (getOutputSizes ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String m26921;
        try {
            m26921 = util.h.xy.k.b.m26921(str, util.h.xy.d.ma.f1140);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException | org.json.JSONException unused) {
        }
        if (m26921 != null && !m26921.isEmpty()) {
            return new org.json.JSONObject(m26921).optBoolean(util.h.xy.s.ma.f2348);
        }
        getHighSpeedVideoSizesFor = (getOutputStallDuration + 21) % 128;
        getOutputStallDuration = (getHighSpeedVideoSizesFor + 91) % 128;
        return false;
    }

    private static com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> Camera2StreamConfigurationMap(util.h.xy.d.rc[] rcVarArr, util.h.xy.d.rc[] rcVarArr2, java.lang.String str, java.lang.String str2) {
        if (rcVarArr == null || rcVarArr2 == null) {
            return null;
        }
        if (rcVarArr.length != rcVarArr2.length) {
            return new util.h.xy.an.ra(str);
        }
        getOutputStallDuration = (getHighSpeedVideoSizesFor + 121) % 128;
        for (int i = 0; i < rcVarArr.length; i++) {
            int i2 = getOutputStallDuration + 37;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                util.h.xy.ar.b.m25074(rcVarArr[i].m26242());
                util.h.xy.ar.b.m25074(rcVarArr2[i].m26242());
                if (!util.h.xy.ar.b.m25074(rcVarArr[i].m26242()).equalsIgnoreCase(util.h.xy.ar.b.m25074(rcVarArr2[i].m26242()))) {
                    return new util.h.xy.an.ra(str2);
                }
            } else {
                util.h.xy.ar.b.m25074(rcVarArr[i].m26242());
                util.h.xy.ar.b.m25074(rcVarArr2[i].m26242());
                util.h.xy.ar.b.m25074(rcVarArr[i].m26242());
                util.h.xy.ar.b.m25074(rcVarArr2[i].m26242());
                throw new java.lang.ArithmeticException();
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25875(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        int i = getHighSpeedVideoSizesFor + 3;
        getOutputStallDuration = i % 128;
        try {
            if (i % 2 == 0) {
                com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27696 = util.h.xy.x.a.m27696(null);
                util.h.xy.k.ma.m26925().mo26168(str, digitalizedCardState);
                util.h.xy.d.b m26955 = util.h.xy.k.ra.f2243.m26955(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                if (m26955 == null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("蕟骢\uf0a9⳩㧃\u1adc䫌鍨隀順\uf52d뻒\uf86d\uf4a3ᣃ똲疇榪냛檔\uf36c쵍桊ɍ擣⢿\uabfb", (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14979), 1437014691 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), "ꎃꜚ荕먺", "鞂❳趒낢", objArr);
                    m27696 = util.h.xy.x.a.m27681(null, ((java.lang.String) objArr[0]).intern());
                } else {
                    int i2 = getOutputStallDuration + 71;
                    getHighSpeedVideoSizesFor = i2 % 128;
                    if (i2 % 2 != 0) {
                        util.h.xy.k.ra.f2243.m26966(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), util.h.xy.u.ra.m27543(m26955, digitalizedCardState));
                    } else {
                        util.h.xy.k.ra.f2243.m26966(str.getBytes(java.nio.charset.StandardCharsets.UTF_8), util.h.xy.u.ra.m27543(m26955, digitalizedCardState));
                        throw new java.lang.NullPointerException();
                    }
                }
                getHighSpeedVideoSizesFor = (getOutputStallDuration + 109) % 128;
                return m27696;
            }
            util.h.xy.x.a.m27696(null);
            util.h.xy.k.ma.m26925().mo26168(str, digitalizedCardState);
            util.h.xy.k.ra.f2243.m26955(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            throw new java.lang.ArithmeticException();
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("蕟骢\uf0a9⳩㧃\u1adc䫌鍨隀順\uf52d뻒\uf86d\uf4a3ᣃ똲疇榪냛檔\uf36c쵍桊ɍ擣⢿\uabfb", (char) (android.view.View.MeasureSpec.getMode(0) + 14979), android.view.View.getDefaultSize(0, 0) + 1437014691, "ꎃꜚ荕먺", "鞂❳趒낢", objArr2);
            return util.h.xy.x.a.m27681(null, ((java.lang.String) objArr2[0]).intern());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25877(util.h.xy.d.d dVar, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25875 = m25875(dVar.m26180(), digitalizedCardState);
        if (dVar.m26179() == null) {
            return m25875;
        }
        int i = getHighSpeedVideoSizesFor + 31;
        getOutputStallDuration = i % 128;
        if (i % 2 == 0) {
            com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m258752 = m25875(dVar.m26179(), digitalizedCardState);
            if (!m25875.isSuccessful() || !m258752.isSuccessful()) {
                if (!m258752.isSuccessful()) {
                    getHighSpeedVideoSizesFor = (getOutputStallDuration + 81) % 128;
                    m25875 = m258752;
                }
                getHighSpeedVideoSizesFor = (getOutputStallDuration + 121) % 128;
                return m25875;
            }
            int i2 = getOutputStallDuration + 107;
            int i3 = i2 % 128;
            getHighSpeedVideoSizesFor = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            getOutputStallDuration = (i3 + 125) % 128;
            return m25875;
        }
        m25875(dVar.m26179(), digitalizedCardState);
        m25875.isSuccessful();
        throw null;
    }

    @util.h.xy.a.a
    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, util.h.xy.d.mc mcVar, int i3, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, int i4, int i5, int i6, int i7, int i8, util.h.xy.an.ma<java.lang.Void> maVar, util.h.xy.d.b bVar) {
        util.h.xy.d.b bVar2 = new util.h.xy.d.b(i, i2, i3, digitalizedCardState, bVar.m26138(), bVar.m26133(), bVar.m26131(), i4, i5, i6, i7, i8);
        getOutputStallDuration = (getHighSpeedVideoSizesFor + 55) % 128;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> mo26169 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26169(str, bVar2, mcVar);
        mo26169.isSuccessful();
        maVar.m25034(mo26169);
        int i9 = (getOutputStallDuration + 85) % 128;
        getHighSpeedVideoSizesFor = i9;
        getOutputStallDuration = (i9 + 3) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25874(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        if (m25875(str, digitalizedCardState).isSuccessful()) {
            return util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26155(str, digitalizedCardState);
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(19 - android.view.MotionEvent.axisFromString(""), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 324, (char) (36596 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr);
            return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr[0]).intern(), 583);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(util.h.xy.k.ma.m26925().mo26151(str, util.h.xy.d.ma.f1140).getResult());
        com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("驭ꛓᱎ陸⎋ᓞ\ude2d\uf57b㕬\u05cf붙›穌ಕ⬄", (char) (28526 - android.view.View.resolveSizeAndState(0, 0, 0)), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 1488466804, "跭䟌溧♯", "鞂❳趒낢", objArr);
            if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("驭ꛓᱎ陸⎋ᓞ\ude2d\uf57b㕬\u05cf붙›穌ಕ⬄", (char) (28526 - android.text.TextUtils.indexOf("", "", 0, 0)), (-1488466803) - android.view.Gravity.getAbsoluteGravity(0, 0), "跭䟌溧♯", "鞂❳趒낢", objArr2);
                profileChannel = com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.get(util.h.xy.ar.b.m25076(jSONObject.getString(((java.lang.String) objArr2[0]).intern()))[0]);
                getOutputStallDuration = (getHighSpeedVideoSizesFor + 101) % 128;
            }
            getOutputStallDuration = (getHighSpeedVideoSizesFor + 93) % 128;
            return profileChannel;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = -7874272127645932344L;
        getOutputSizes = 294925130;
        getHighSpeedVideoFpsRanges = (char) 13130;
        Camera2StreamConfigurationMap = new char[]{32836, 13180, 59001, 39246, 19535, 65326, 45624, 25951, 6170, 52222, 32416, 12739, 58576, 38842, 19122, 64926, 45205, 25472, 6007, 51813, 32026, 12366, 58158, 38442, 18714, 64516, 45054, 25335, 5595, 51396, 31672, 11956, 57814, 38029, 18311, 64315, 44651, 24861, 5186, 50992, 31264, 11612, 57349, 37867, 18155, 63942, 44240, 24510, 4776, 50606, 30936, 11144, 57211, 37503, 17752, 29605, 49291, 5589, 27301, 49061, 3269, 16853, 38631, 60413, 14360, 36116, 49711, 5939, 25608, 47440, 3705, 17211, 36966, 58496, 14741, 36514, 50105, 4311, 26071, 47847, 20078, 64858, 10323, 22383, 33401, 12569, 31834, 43814, 54846, 1415, 45301, 65514, 11002, 22935, 33939, 13218, 32420, 44467, 55627, 1102, 45951, 65083, 11546, 22552, 34609, 12858, 25027, 44251, 56304, 1715, 46473, 57492, 12217, 23228, 35326, 13644, 24658, 44911, 55866, 2349, 46123, 58133, 11782, 23941, 35031, 14316, 25334, 37252, 56528, 2959, 46767, 58788, 4417, 23646, 35684, 13933, 25928, 36890, 57135, 2598, 47561, 58578, 5110, 24306, 36232, 11584, 40538, 19292, 13324, 57682, 21036, 8059, 51211, 46358, 26344, 54243, 40133, 18902, 15030, 59327, 20613, 7554, 52877, 47663, 26476, 53324, 40259, 20006, 15165, 58375, 20738, 679, 53247, 47296, 26059, 54960, 33776, 19584, 14720, 60059, 22060, 844, 52344, 47387, 27179, 55094, 32770, 19730, 16036, 60389, 21699, 458, 62125, 49076, 26800, 54683, 34524, 29286, 16255, 59474, 21835, 1641, 62267, 48142, 26887, 56040, 34803, 28887, 15827, 61097, 26806, 56221, 3734, 29093, 42158, 6110, 23238, 36274, 61670, 8964, 38429, 55607, 3133, 32577, 41481, 5502, 22634, 35696, 65424, 8902, 38321, 55471, 3011, 32386, 41438, 5317, 18223, 35406, 64780, kotlin.text.Typography.rightDoubleQuote, 37746, 54323, 26395, 45586, 52534, 6186, 43864, 58948, 12595, 19523, 40841, 10895, 26111, 45240, 50136, 7876, 43502, 58607, 14245, 17158, 40450, 10549, 25636, 46937, 49749, 7543, 43113, 40015, 12155, 64115, 34112, 20509, 58170, 44602, 30993, 1044, 55267, 25337, 11728, 63742, 35751, 22186, 57747, 40011, 12125, 64080, 34146, 20600, 58162, 44600, 30989, 1033, 55282, 25342, 11723, 63707, 35810, 40008, 12128, 64107, 34121, 20559, 58148, 44602, 30980, 1082, 55273, 25338, 11732, 63706, 35756, 22198, 57742, 44165, 32699, 2935, 54911, 24904, 11338, 65343, 35377, 21766, 57368, 45991, 4775, 41357, 29832, 3006, 57018, 28124, 8427, 63482, 35576, 22801, 60471, 41763, 30247, 1349, 55365, 28502, 8816, 61823, 34195, 22685};
        getInputSizeshNQ4ISI = 1128293825427287822L;
    }
}
