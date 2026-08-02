package util.h.xy.au;

/* loaded from: classes5.dex */
public final class g {
    private static int Camera2StreamConfigurationMap = 0;
    static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    static int getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;
    private static char[] getHighSpeedVideoSizesFor;
    private static long getInputSizeshNQ4ISI;
    private static util.h.xy.au.g getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final java.lang.String f864;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getInputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getInputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoSizes();
        f864 = "g";
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
    }

    private g() {
    }

    static void getHighSpeedVideoFpsRangesFor(int i, int i2, char c, java.lang.Object[] objArr) {
        int i3;
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 45) % 128;
        while (rbVar.f2651 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 35) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            int i4 = getHighSpeedVideoFpsRanges + 103;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 - 1;
            } else {
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i3 = rbVar.f2651 + 1;
            }
            rbVar.f2651 = i3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.au.g m25127() {
        util.h.xy.au.g gVar;
        synchronized (util.h.xy.au.g.class) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 57;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (getOutputMinFrameDuration == null) {
                getOutputMinFrameDuration = new util.h.xy.au.g();
            }
            gVar = getOutputMinFrameDuration;
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 51;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0186, code lost:
    
        if (r4.isEmpty() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static org.json.JSONObject getHighSpeedVideoSizes(java.lang.String str) throws org.json.JSONException {
        android.content.ContentResolver contentResolver;
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.Object obj2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            contentResolver = util.h.xy.bh.ra.m25484().m25485().getContentResolver();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(110 >> android.view.View.MeasureSpec.getMode(1), 23652 / (android.media.AudioTrack.getMaxVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), (char) (1 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr);
            obj = objArr[0];
        } else {
            contentResolver = util.h.xy.bh.ra.m25484().m25485().getContentResolver();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.view.View.MeasureSpec.getMode(0), 162 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1), objArr2);
            obj = objArr2[0];
        }
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) obj).intern());
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 21) % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 8, 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (7753 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), string);
            android.content.Context m25485 = util.h.xy.bh.ra.m25484().m25485();
            if (android.os.Build.VERSION.SDK_INT > 31) {
                android.content.ContentResolver contentResolver2 = m25485.getContentResolver();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.graphics.Color.argb(0, 0, 0, 0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 171, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 60110), objArr4);
                str2 = android.provider.Settings.Global.getString(contentResolver2, ((java.lang.String) objArr4[0]).intern());
            } else if (android.os.Build.VERSION.SDK_INT <= 31) {
                android.content.ContentResolver contentResolver3 = m25485.getContentResolver();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor('>' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 183 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (28295 - android.view.KeyEvent.getDeadChar(0, 0)), objArr5);
                java.lang.String string2 = android.provider.Settings.Secure.getString(contentResolver3, ((java.lang.String) objArr5[0]).intern());
                if (string2 == null) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 107) % 128;
                    android.content.ContentResolver contentResolver4 = m25485.getContentResolver();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 11, android.text.TextUtils.getOffsetBefore("", 0) + 171, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 60110), objArr6);
                    str2 = android.provider.Settings.Global.getString(contentResolver4, ((java.lang.String) objArr6[0]).intern());
                } else {
                    str2 = string2;
                }
            } else {
                str2 = null;
            }
            if (str2 != null) {
                int i2 = getHighSpeedVideoFpsRangesFor + 33;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("➴ᯣ侗碪⟕⦭⮳\ueeb8\uef5b\ue12a挳♤뛛\ud8b0뫹很繁逪\uf23b霮", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr7);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr7[0]);
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("潁檔⎈\uec23漌壵䞆稖ꞇ遵་늗︔ꧦ획쬑", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr8);
            sb.append((java.lang.String) cls.getField((java.lang.String) objArr8[0]).get(null));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("➴ᯣ侗碪⟕⦭⮳\ueeb8\uef5b\ue12a挳♤뛛\ud8b0뫹很繁逪\uf23b霮", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ue4b6㰻ꉳ눨\ue4fb๔왷␍ⱺ", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr10);
            sb.append((java.lang.String) cls2.getField((java.lang.String) objArr10[0]).get(null));
            str2 = sb.toString();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 11, 9 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11);
            jSONObject.put(((java.lang.String) objArr11[0]).intern(), str2);
            if (str != null && !android.text.TextUtils.isEmpty(str)) {
                int i3 = getHighSpeedVideoFpsRangesFor + 115;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(55 >> android.graphics.drawable.Drawable.resolveOpacity(1, 0), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE >>> (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)), (char) android.graphics.Color.blue(0), objArr12);
                    obj2 = objArr12[0];
                } else {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 18 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.graphics.Color.blue(0), objArr13);
                    obj2 = objArr13[0];
                }
                jSONObject.put(((java.lang.String) obj2).intern(), str);
            }
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(0, 0) + 5, 30 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr14);
            java.lang.String intern = ((java.lang.String) objArr14[0]).intern();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("➴ᯣ侗碪⟕⦭⮳\ueeb8\uef5b\ue12a挳♤뛛\ud8b0뫹很繁逪\uf23b霮", android.text.TextUtils.indexOf("", ""), objArr15);
            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr15[0]);
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("潁檔⎈\uec23漌壵䞆稖ꞇ遵་늗︔ꧦ획쬑", android.text.TextUtils.indexOf("", ""), objArr16);
            jSONObject.put(intern, cls3.getField((java.lang.String) objArr16[0]).get(null));
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 35 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (41102 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr17);
            java.lang.String intern2 = ((java.lang.String) objArr17[0]).intern();
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("➴ᯣ侗碪⟕⦭⮳\ueeb8\uef5b\ue12a挳♤뛛\ud8b0뫹很繁逪\uf23b霮", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr18);
            java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr18[0]);
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ue4b6㰻ꉳ눨\ue4fb๔왷␍ⱺ", android.view.View.resolveSize(0, 0), objArr19);
            jSONObject.put(intern2, cls4.getField((java.lang.String) objArr19[0]).get(null));
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 117) % 128;
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 40, (char) android.view.KeyEvent.keyCodeFromString(""), objArr20);
            java.lang.String intern3 = ((java.lang.String) objArr20[0]).intern();
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor('7' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 46 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr21);
            jSONObject.put(intern3, ((java.lang.String) objArr21[0]).intern());
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 53 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr22);
            jSONObject.put(((java.lang.String) objArr22[0]).intern(), android.os.Build.VERSION.RELEASE);
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 62 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr23);
            java.lang.String intern4 = ((java.lang.String) objArr23[0]).intern();
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - android.text.TextUtils.getCapsMode("", 0, 0), 72 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr24);
            jSONObject.put(intern4, ((java.lang.String) objArr24[0]).intern());
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 11, 78 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr25);
            java.lang.String intern5 = ((java.lang.String) objArr25[0]).intern();
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(14 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 90 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (41103 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr26);
            jSONObject.put(intern5, ((java.lang.String) objArr26[0]).intern());
            java.lang.Boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.graphics.Color.red(0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 102, (char) (60316 - android.text.TextUtils.getTrimmedLength("")), objArr27);
            jSONObject.put(((java.lang.String) objArr27[0]).intern(), highResolutionOutputSizeshNQ4ISI.toString());
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.content.Context m254852 = util.h.xy.bh.ra.m25484().m25485();
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, android.view.View.resolveSizeAndState(0, 0, 0) + 135, (char) (android.graphics.Color.blue(0) + 53789), objArr28);
            ((android.view.WindowManager) m254852.getSystemService(((java.lang.String) objArr28[0]).intern())).getDefaultDisplay().getMetrics(displayMetrics);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 111) % 128;
            int i4 = displayMetrics.heightPixels;
            int i5 = displayMetrics.widthPixels;
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 111, (char) (23254 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), objArr29);
            jSONObject.put(((java.lang.String) objArr29[0]).intern(), i4);
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 11, android.view.Gravity.getAbsoluteGravity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, (char) android.graphics.Color.alpha(0), objArr30);
            jSONObject.put(((java.lang.String) objArr30[0]).intern(), i5);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI() {
        android.content.Context m25485 = util.h.xy.bh.ra.m25484().m25485();
        int i = getHighSpeedVideoFpsRangesFor + 105;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 5;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("颣捎\uf3b8䡘飂儀鞜\ude4a偌馇\udf1cᚖীꀁږ潌셆\ue880丌Ꞗ뫠㜁疖\uf04c牆羖봌", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("\ue038擞즟祈\ue05f嚛궫汾⣙鸝\ue534\ua4cf煟ꞛ㲒\udd4f맖\uef1f琸ᗋ쉊", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr2);
            java.lang.Object invoke = cls.getMethod((java.lang.String) objArr2[0], null).invoke(m25485, null);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 19, 141 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
            java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 15) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("颤蟞\uef3e愝飅떐謚\uf70f偋紗쎚㿓ে䒑ᨐ䘉셁ఐ劊軓뫔펓楐\ud92d牅鬝ꆕ\ue19c⯃抛\uf833⠜\ue34a⨟゙炘\udcd6", android.view.KeyEvent.getMaxKeyCode() >> 16, objArr4);
            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ᖠꃏ錙ꔰᗈ銎\uf72a㌃\udd59娜뾭﮵蓍掩昼舱䱔⬚⺫䪵", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr5);
            boolean booleanValue = ((java.lang.Boolean) cls2.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(invoke, intern)).booleanValue();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 121) % 128;
            return java.lang.Boolean.valueOf(booleanValue);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25133(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivationState pendingCardActivationState) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - android.view.View.MeasureSpec.getSize(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 197, (char) android.view.View.MeasureSpec.getMode(0), objArr);
        jSONObject2.put(((java.lang.String) objArr[0]).intern(), str);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 209 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36385), objArr2);
        java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - android.graphics.Color.red(0), 209 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (36384 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr3);
        jSONObject2.put(intern, map.get(((java.lang.String) objArr3[0]).intern()));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 222 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr4);
        java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 222 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr5);
        jSONObject2.put(intern2, map.get(((java.lang.String) objArr5[0]).intern()));
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 225, (char) android.text.TextUtils.getOffsetBefore("", 0), objArr6);
        jSONObject2.put(((java.lang.String) objArr6[0]).intern(), pendingCardActivationState.toString());
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(14 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 231, (char) (47481 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr7);
        org.json.JSONArray jSONArray = new org.json.JSONArray(map.get(((java.lang.String) objArr7[0]).intern()));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.graphics.Color.argb(0, 0, 0, 0) + 13, 231 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.normalizeMetaState(0) + 47481), objArr8);
        jSONObject2.put(((java.lang.String) objArr8[0]).intern(), jSONArray);
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, 244 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
        java.lang.String str2 = map.get(((java.lang.String) objArr9[0]).intern());
        if (str2 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(str2);
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 12, 244 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.graphics.Color.red(0), objArr10);
            jSONObject2.put(((java.lang.String) objArr10[0]).intern(), jSONObject3);
        }
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(8 - android.graphics.Color.green(0), 256 - android.text.TextUtils.indexOf("", "", 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 48762), objArr11);
        java.lang.String str3 = map.get(((java.lang.String) objArr11[0]).intern());
        if (str3 != null) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject(str3);
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 8, 257 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (48761 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr12);
            jSONObject2.put(((java.lang.String) objArr12[0]).intern(), jSONObject4);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        try {
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 264 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), objArr13);
            jSONObject.put(((java.lang.String) objArr13[0]).intern(), jSONObject2);
            return jSONObject.toString().getBytes();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m25148(java.util.Map<java.lang.String, java.lang.String> map) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(12 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, (char) android.text.TextUtils.getTrimmedLength(""), objArr);
        if (map.containsKey(((java.lang.String) objArr[0]).intern())) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 13, 244 - android.view.View.MeasureSpec.getSize(0), (char) android.text.TextUtils.indexOf("", ""), objArr2);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(map.get(((java.lang.String) objArr2[0]).intern()));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetAfter("", 0) + 12, 244 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
                jSONObject2.put(((java.lang.String) objArr3[0]).intern(), jSONObject3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(16 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 276 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 8161), objArr4);
        if (map.containsKey(((java.lang.String) objArr4[0]).intern())) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.rgb(0, 0, 0) + 16777231, 275 - android.view.View.resolveSize(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 8162), objArr5);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject(map.get(((java.lang.String) objArr5[0]).intern()));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.keyCodeFromString("") + 15, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8160), objArr6);
            jSONObject2.put(((java.lang.String) objArr6[0]).intern(), jSONObject4);
        }
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 256, (char) (48761 - android.view.KeyEvent.getDeadChar(0, 0)), objArr7);
        if (map.containsKey(((java.lang.String) objArr7[0]).intern())) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.text.TextUtils.getCapsMode("", 0, 0), 256 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (48761 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr8);
            org.json.JSONObject jSONObject5 = new org.json.JSONObject(map.get(((java.lang.String) objArr8[0]).intern()));
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 256, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 48762), objArr9);
            jSONObject2.put(((java.lang.String) objArr9[0]).intern(), jSONObject5);
        }
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "", 0) + 13, (android.view.ViewConfiguration.getTouchSlop() >> 8) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36383), objArr10);
        java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - android.graphics.Color.blue(0), 209 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (36384 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr11);
        jSONObject2.put(intern, map.get(((java.lang.String) objArr11[0]).intern()));
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr12);
        java.lang.String intern2 = ((java.lang.String) objArr12[0]).intern();
        java.lang.Object[] objArr13 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3, 222 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr13);
        jSONObject2.put(intern2, map.get(((java.lang.String) objArr13[0]).intern()));
        java.lang.Object[] objArr14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, 264 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.combineMeasuredStates(0, 0), objArr14);
        jSONObject.put(((java.lang.String) objArr14[0]).intern(), jSONObject2);
        return jSONObject.toString().getBytes();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m25149(org.json.JSONObject jSONObject) throws org.json.JSONException {
        int defaultSize = android.view.View.getDefaultSize(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - defaultSize, 196 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
        jSONObject.remove(((java.lang.String) objArr[0]).intern());
        int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(5 - (longPressTimeout >> 16), android.view.View.combineMeasuredStates(0, 0) + 226, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr2);
        jSONObject.remove(((java.lang.String) objArr2[0]).intern());
        int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
        int trimmedLength = android.text.TextUtils.getTrimmedLength("");
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - (minimumFlingVelocity >> 16), 231 - trimmedLength, (char) (47481 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr3);
        jSONObject.remove(((java.lang.String) objArr3[0]).intern());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
        int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(bitsPerPixel + 12, offsetAfter + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        jSONObject2.put(((java.lang.String) objArr4[0]).intern(), jSONObject);
        byte[] bytes = jSONObject2.toString().getBytes();
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return bytes;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m25142(util.h.xy.az.ra raVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8));
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(indexOf + 16, 290 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (36903 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(12 - (fadingEdgeLength >> 16), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 257, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr2);
        java.lang.String string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        return string;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final java.lang.String m25134(util.h.xy.az.ra raVar) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8));
        long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
        int mode = android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 14, mode + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, (char) (36903 - android.view.View.MeasureSpec.getSize(0)), objArr);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr[0]).intern());
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(11 - packedPositionChild, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 317, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36707), objArr2);
        java.lang.String string = jSONObject2.getString(((java.lang.String) objArr2[0]).intern());
        int i = getHighSpeedVideoFpsRangesFor + 3;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardMetaData m25140(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object obj2;
        util.h.xy.bb.rb rbVar = new util.h.xy.bb.rb();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 377 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (46043 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr);
            if (!jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                return null;
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 53) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, 329 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 46044), objArr2);
            rbVar.m25349(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 338, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            if (jSONObject.has(((java.lang.String) objArr3[0]).intern())) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.view.KeyEvent.normalizeMetaState(0), 338 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr4);
                rbVar.m25350(jSONObject.getString(((java.lang.String) objArr4[0]).intern()));
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.rgb(0, 0, 0) + 16777229, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 349, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr5);
            if (jSONObject.has(((java.lang.String) objArr5[0]).intern())) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((-16777203) - android.graphics.Color.rgb(0, 0, 0), 349 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr6);
                rbVar.m25345(jSONObject.getString(((java.lang.String) objArr6[0]).intern()));
            }
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12, 361 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31206), objArr7);
            if (jSONObject.has(((java.lang.String) objArr7[0]).intern())) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 1;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(72 >> android.view.View.resolveSizeAndState(1, 0, 0), 2436 >> (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 31), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) * 20140), objArr8);
                    obj2 = objArr8[0];
                } else {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 13, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 362, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 31206), objArr9);
                    obj2 = objArr9[0];
                }
                rbVar.m25354(jSONObject.getString(((java.lang.String) obj2).intern()));
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 375 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (3064 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr10);
            if (jSONObject.has(((java.lang.String) objArr10[0]).intern())) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 16, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 375, (char) (3064 - android.view.View.combineMeasuredStates(0, 0)), objArr11);
                rbVar.m25346(jSONObject.getString(((java.lang.String) objArr11[0]).intern()));
            }
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 391, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 64559), objArr12);
            if (jSONObject.has(((java.lang.String) objArr12[0]).intern())) {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor('?' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 391, (char) (64558 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr13);
                rbVar.m25340(jSONObject.getString(((java.lang.String) objArr13[0]).intern()));
            }
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getTrimmedLength("") + 16, 406 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (11705 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr14);
            if (jSONObject.has(((java.lang.String) objArr14[0]).intern())) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getMode(0) + 16, 405 - android.view.View.MeasureSpec.getMode(0), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 11705), objArr15);
                rbVar.m25357(jSONObject.getString(((java.lang.String) objArr15[0]).intern()));
            }
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, 421 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr16);
            if (jSONObject.has(((java.lang.String) objArr16[0]).intern())) {
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 16, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 421, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr17);
                rbVar.m25338(jSONObject.getString(((java.lang.String) objArr17[0]).intern()));
            }
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 436 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.View.resolveSizeAndState(0, 0, 0), objArr18);
            if (jSONObject.has(((java.lang.String) objArr18[0]).intern())) {
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(10 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 436 - android.view.View.MeasureSpec.getMode(0), (char) android.text.TextUtils.indexOf("", "", 0), objArr19);
                rbVar.m25339(jSONObject.getString(((java.lang.String) objArr19[0]).intern()));
            }
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 446, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1081), objArr20);
            if (jSONObject.has(((java.lang.String) objArr20[0]).intern())) {
                int i2 = getHighSpeedVideoFpsRangesFor + 33;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((i2 % 2 == 0 ? 109 : 17) + ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 447, (char) (1081 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr21);
                rbVar.m25352(jSONObject.getString(((java.lang.String) objArr21[0]).intern()));
            }
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", "") + 11, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 464, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr22);
            if (jSONObject.has(((java.lang.String) objArr22[0]).intern())) {
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, 463 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr23);
                rbVar.m25342(jSONObject.getString(((java.lang.String) objArr23[0]).intern()));
            }
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, 474 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr24);
            if (jSONObject.has(((java.lang.String) objArr24[0]).intern())) {
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 14, 474 - android.view.View.resolveSize(0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr25);
                rbVar.m25343(jSONObject.getString(((java.lang.String) objArr25[0]).intern()));
            }
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 21, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 487, (char) (36383 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr26);
            if (jSONObject.has(((java.lang.String) objArr26[0]).intern())) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 9) % 128;
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20, 487 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (36383 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr27);
                rbVar.m25341(jSONObject.getString(((java.lang.String) objArr27[0]).intern()));
            }
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 16, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, (char) (16145 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr28);
            if (jSONObject.has(((java.lang.String) objArr28[0]).intern())) {
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 16, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 16144), objArr29);
                rbVar.m25347(jSONObject.getString(((java.lang.String) objArr29[0]).intern()));
            }
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 525, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr30);
            if (jSONObject.has(((java.lang.String) objArr30[0]).intern())) {
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 8, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 524, (char) android.view.View.MeasureSpec.getMode(0), objArr31);
                rbVar.m25344(jSONObject.getString(((java.lang.String) objArr31[0]).intern()));
            }
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 15, android.text.TextUtils.indexOf("", "") + 531, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), objArr32);
            if (jSONObject.has(((java.lang.String) objArr32[0]).intern())) {
                java.lang.Object[] objArr33 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 15, 531 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), objArr33);
                rbVar.m25351(jSONObject.getString(((java.lang.String) objArr33[0]).intern()));
            }
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetAfter("", 0) + 5, 546 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.text.TextUtils.getTrimmedLength("") + 1197), objArr34);
            if (jSONObject.has(((java.lang.String) objArr34[0]).intern())) {
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(4 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 546 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1197), objArr35);
                rbVar.m25353(jSONObject.getString(((java.lang.String) objArr35[0]).intern()));
            }
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(23 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 35995), objArr36);
            if (jSONObject.has(((java.lang.String) objArr36[0]).intern())) {
                int i3 = getHighSpeedVideoFpsRangesFor + 101;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 == 0) {
                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.Gravity.getAbsoluteGravity(1, 1) * 68, 13434 << (android.view.KeyEvent.getMaxKeyCode() / 2), (char) (35995 - android.graphics.Color.green(1)), objArr37);
                    obj = objArr37[0];
                } else {
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(23 - android.view.Gravity.getAbsoluteGravity(0, 0), 551 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (35995 - android.graphics.Color.green(0)), objArr38);
                    obj = objArr38[0];
                }
                rbVar.m25356(jSONObject.getString(((java.lang.String) obj).intern()));
            }
            if (jSONObject2 != null) {
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, android.view.View.MeasureSpec.getMode(0) + 375, (char) (android.view.KeyEvent.keyCodeFromString("") + 3064), objArr39);
                if (jSONObject2.has(((java.lang.String) objArr39[0]).intern())) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 15, 375 - android.graphics.Color.blue(0), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 3064), objArr40);
                    rbVar.m25355(jSONObject2.getString(((java.lang.String) objArr40[0]).intern()));
                }
                java.lang.Object[] objArr41 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(16 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 390 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (64558 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr41);
                if (jSONObject2.has(((java.lang.String) objArr41[0]).intern())) {
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(16 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 390, (char) (64558 - android.view.KeyEvent.keyCodeFromString("")), objArr42);
                    rbVar.m25348(jSONObject2.getString(((java.lang.String) objArr42[0]).intern()));
                }
            }
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 574, (char) (20095 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr43);
            if (jSONObject.has(((java.lang.String) objArr43[0]).intern())) {
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(9 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 526, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 20096), objArr44);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr44[0]).intern());
                rbVar.getKeyValues().clear();
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
                    org.json.JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 583, (char) (41454 - android.text.TextUtils.indexOf("", "", 0)), objArr45);
                    if (jSONObject3.has(((java.lang.String) objArr45[0]).intern())) {
                        org.json.JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 5, 585 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 40827), objArr46);
                        if (jSONObject4.has(((java.lang.String) objArr46[0]).intern())) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                            org.json.JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, 584 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 41454), objArr47);
                            java.lang.String string = jSONObject5.getString(((java.lang.String) objArr47[0]).intern());
                            org.json.JSONObject jSONObject6 = jSONArray.getJSONObject(i4);
                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4, 586 - android.text.TextUtils.indexOf("", ""), (char) (40828 - android.graphics.Color.green(0)), objArr48);
                            rbVar.getKeyValues().put(string, jSONObject6.getString(((java.lang.String) objArr48[0]).intern()));
                        }
                    }
                }
            }
            int i5 = getHighSpeedVideoFpsRangesFor + 1;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                return rbVar;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x011a, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 17, android.text.TextUtils.getCapsMode("", 0, 0) + androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0142, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0144, code lost:
    
        r6 = util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 39;
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x014e, code lost:
    
        if ((r6 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0150, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(22 >>> (android.view.ViewConfiguration.getScrollBarSize() + 37), 26817 >>> android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.getOffsetBefore("", 0), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x017c, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01a9, code lost:
    
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = (util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(10 - android.widget.ExpandableListView.getPackedPositionGroup(0), 635 - android.view.KeyEvent.keyCodeFromString(""), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01d9, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01db, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 10, 645 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0203, code lost:
    
        if (((java.lang.String) r14[0]).intern().equalsIgnoreCase(r4.getType()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0205, code lost:
    
        util.h.xy.au.g.getHighSpeedVideoFpsRangesFor = (util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x020f, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(5 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_INVALID_REQUEST_ERROR, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 40829), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0239, code lost:
    
        if (r5.has(((java.lang.String) r14[0]).intern()) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x023b, code lost:
    
        r6 = util.h.xy.au.g.getHighSpeedVideoFpsRangesFor + 3;
        util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0248, code lost:
    
        if ((r6 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x024a, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(4 - android.text.TextUtils.indexOf("", "", 0, 1), 15158 >>> (android.view.ViewConfiguration.getKeyRepeatDelay() - 113), (char) (40828 - (android.view.ViewConfiguration.getJumpTapTimeout() % 62)), r14);
        r6 = r14[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0287, code lost:
    
        r4.m25301(r5.getString(((java.lang.String) r6).intern()));
        util.h.xy.au.g.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.au.g.getHighSpeedVideoFpsRangesFor + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x026a, code lost:
    
        r14 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(5 - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_INVALID_REQUEST_ERROR, (char) (40828 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), r14);
        r6 = r14[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017f, code lost:
    
        r15 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 7, 628 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.text.TextUtils.getOffsetBefore("", 0), r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a7, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0118, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ea, code lost:
    
        if (((java.lang.String) r15[0]).intern().equalsIgnoreCase(r4.getType()) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x039b A[SYNTHETIC] */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.bb.d[] m25163(byte[] bArr) throws org.json.JSONException {
        java.lang.Object[] objArr;
        org.json.JSONArray jSONArray = new org.json.JSONArray(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        util.h.xy.bb.d[] dVarArr = new util.h.xy.bb.d[jSONArray.length()];
        int i = 0;
        while (i < jSONArray.length()) {
            util.h.xy.bb.d dVar = new util.h.xy.bb.d();
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1, 591 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
            dVar.m25304(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 4, 592 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            dVar.m25303(jSONObject.getString(((java.lang.String) objArr3[0]).intern()));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 10, 597 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 41660), objArr4);
            if (!((java.lang.String) objArr4[0]).intern().equalsIgnoreCase(dVar.getType())) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 49;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(1) * 2, (android.view.ViewConfiguration.getEdgeSlop() << 30) + 25515, (char) ((android.media.AudioTrack.getMinVolume() > 1.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) * 46848), objArr5);
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(5 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 607, (char) (46848 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr6);
                }
                objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(10 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getTrimmedLength("") + 654, (char) android.view.View.combineMeasuredStates(0, 0), objArr);
                if (!jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 10, android.text.TextUtils.getOffsetBefore("", 0) + 645, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr7);
                    if (((java.lang.String) objArr7[0]).intern().equalsIgnoreCase(dVar.getType())) {
                        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 12, (-16776562) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr8);
                        if (jSONObject.getBoolean(((java.lang.String) objArr8[0]).intern())) {
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(43 - android.view.View.resolveSize(0, 0), 665 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr9);
                            throw new org.json.JSONException(((java.lang.String) objArr9[0]).intern());
                        }
                    }
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(10 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 655, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr10);
                    dVar.m25302(jSONObject.getBoolean(((java.lang.String) objArr10[0]).intern()));
                }
                dVar.getId();
                dVar.getType();
                dVar.getValue();
                dVar.isOtpRequired();
                dVarArr[i] = dVar;
                i++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            }
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_INVALID_REQUEST_ERROR, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40827), objArr11);
            dVar.m25301(jSONObject.getString(((java.lang.String) objArr11[0]).intern()));
            objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getTrimmedLength("") + 654, (char) android.view.View.combineMeasuredStates(0, 0), objArr);
            if (!jSONObject.has(((java.lang.String) objArr[0]).intern())) {
            }
            dVar.getId();
            dVar.getType();
            dVar.getValue();
            dVar.isOtpRequired();
            dVarArr[i] = dVar;
            i++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
        }
        return dVarArr;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AppToAppData m25128(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        util.h.xy.bb.a aVar = new util.h.xy.bb.a();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(lastIndexOf + 8, 707 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
        if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 708, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr2[0]).intern());
            int red = android.graphics.Color.red(0);
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(red + 14, 716 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr3);
                aVar.m25296(jSONObject2.getString(((java.lang.String) objArr3[0]).intern()));
                int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(6 - (maximumDrawingCacheSize >> 24), 728 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.View.MeasureSpec.getMode(0) + 41491), objArr4);
                aVar.m25297(jSONObject2.getString(((java.lang.String) objArr4[0]).intern()));
                float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(7 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), 735 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr5);
                aVar.m25298(jSONObject2.getString(((java.lang.String) objArr5[0]).intern()));
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                return aVar;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(combineMeasuredStates + 26, android.text.TextUtils.indexOf("", "", 0) + 741, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 54692), objArr6);
        throw new org.json.JSONException(((java.lang.String) objArr6[0]).intern());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ThreeDSecure m25141(java.lang.String str) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 63) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 12, android.graphics.Color.red(0) + 767, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            if (!jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", 0) + 828, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr2);
                throw new org.json.JSONException(((java.lang.String) objArr2[0]).intern());
            }
            util.h.xy.bb.re reVar = new util.h.xy.bb.re();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12, android.graphics.Color.alpha(0) + 767, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), objArr3);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr3[0]).intern());
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 10, 779 - android.text.TextUtils.getTrimmedLength(""), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr4);
            if (jSONObject2.has(((java.lang.String) objArr4[0]).intern())) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, 788 - android.view.KeyEvent.normalizeMetaState(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
                if (jSONObject2.has(((java.lang.String) objArr5[0]).intern())) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.resolveSize(0, 0) + 8, 794 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), objArr6);
                    if (jSONObject2.has(((java.lang.String) objArr6[0]).intern())) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 49) % 128;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(9 - android.text.TextUtils.indexOf("", "", 0, 0), 779 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7);
                        reVar.m25366(jSONObject2.getString(((java.lang.String) objArr7[0]).intern()));
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 788, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr8);
                        reVar.m25368(jSONObject2.getString(((java.lang.String) objArr8[0]).intern()));
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(8 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 794 - android.graphics.Color.green(0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr9);
                        reVar.m25367(jSONObject2.getString(((java.lang.String) objArr9[0]).intern()));
                        return reVar;
                    }
                }
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 26, 802 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (47501 - android.graphics.Color.green(0)), objArr10);
            throw new org.json.JSONException(((java.lang.String) objArr10[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: util.h.xy.au.g$5, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.BANK_LOGO.ordinal()] = 1;
                int i = Camera2StreamConfigurationMap;
                getHighSpeedVideoFpsRanges = ((i & 107) + (i | 107)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.SCHEME_LOGO.ordinal()] = 2;
                int i2 = Camera2StreamConfigurationMap + 33;
                getHighSpeedVideoFpsRanges = i2 % 128;
                int i3 = i2 % 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.CARD_BACKGROUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.CARD_BACKGROUND_COMBINED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.CO_BRAND_LOGO.ordinal()] = 5;
                int i4 = Camera2StreamConfigurationMap;
                int i5 = ((i4 | 13) << 1) - (i4 ^ 13);
                getHighSpeedVideoFpsRanges = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoSizes[com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType.CARD_ICON.ordinal()] = 6;
                int i7 = Camera2StreamConfigurationMap + 3;
                getHighSpeedVideoFpsRanges = i7 % 128;
                int i8 = i7 % 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int i9 = getHighSpeedVideoFpsRanges + 17;
            Camera2StreamConfigurationMap = i9 % 128;
            if (i9 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0165  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String m25150(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardArtType cardArtType, java.lang.String str) {
        java.lang.String optString;
        int i;
        if (cardArtType != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
            if (str != null) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    switch (util.h.xy.au.g.AnonymousClass5.getHighSpeedVideoSizes[cardArtType.ordinal()]) {
                        case 1:
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 859 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (51833 - android.view.KeyEvent.getDeadChar(0, 0)), objArr);
                            optString = jSONObject.optString(((java.lang.String) objArr[0]).intern(), "");
                            i = getHighResolutionOutputSizeshNQ4ISI + 47;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 != 0) {
                                return optString;
                            }
                            throw new java.lang.ArithmeticException();
                        case 2:
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(20 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 876 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17948), objArr2);
                            optString = jSONObject.optString(((java.lang.String) objArr2[0]).intern(), "");
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            i = getHighResolutionOutputSizeshNQ4ISI + 47;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 != 0) {
                            }
                            break;
                        case 3:
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionChild(0L) + 25, 897 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (42397 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr3);
                            optString = jSONObject.optString(((java.lang.String) objArr3[0]).intern(), "");
                            i = getHighResolutionOutputSizeshNQ4ISI + 47;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 != 0) {
                            }
                            break;
                        case 4:
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(32 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 920, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr4);
                            optString = jSONObject.optString(((java.lang.String) objArr4[0]).intern(), "");
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                            i = getHighResolutionOutputSizeshNQ4ISI + 47;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 != 0) {
                            }
                            break;
                        case 5:
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(20 - android.widget.ExpandableListView.getPackedPositionChild(0L), 952 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
                            optString = jSONObject.optString(((java.lang.String) objArr5[0]).intern(), "");
                            i = getHighResolutionOutputSizeshNQ4ISI + 47;
                            getHighSpeedVideoFpsRangesFor = i % 128;
                            if (i % 2 != 0) {
                            }
                            break;
                        case 6:
                            int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
                            try {
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((minimumFlingVelocity >> 16) + 18, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 974, (char) (25244 - android.view.View.getDefaultSize(0, 0)), objArr6);
                                optString = jSONObject.optString(((java.lang.String) objArr6[0]).intern(), "");
                                i = getHighResolutionOutputSizeshNQ4ISI + 47;
                                getHighSpeedVideoFpsRangesFor = i % 128;
                                if (i % 2 != 0) {
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                            break;
                        default:
                            return null;
                    }
                } catch (org.json.JSONException unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final org.json.JSONObject m25139(byte[] bArr) throws org.json.JSONException {
        java.lang.Object obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        int indexOf = 10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i = (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 263;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(indexOf, i, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() % 54), objArr);
                obj = objArr[0];
            } else {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(indexOf, i, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr2);
                obj = objArr2[0];
            }
            return jSONObject.getJSONObject(((java.lang.String) obj).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m25129(byte[] bArr) throws org.json.JSONException {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
        org.json.JSONObject m25139 = m25139(bArr);
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 12, (maxKeyCode >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr);
        java.lang.String string = m25139.getString(((java.lang.String) objArr[0]).intern());
        int i = getHighSpeedVideoFpsRangesFor + 73;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return string;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m25151(byte[] bArr) throws org.json.JSONException {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
        org.json.JSONObject m25139 = m25139(bArr);
        int scrollBarFadeDuration = android.view.ViewConfiguration.getScrollBarFadeDuration();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - (scrollBarFadeDuration >> 16), 231 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 47481), objArr);
        java.lang.String string = m25139.getString(((java.lang.String) objArr[0]).intern());
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
        return string;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m25143(byte[] bArr) throws org.json.JSONException {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
        org.json.JSONObject m25139 = m25139(bArr);
        int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(indexOf + 5, 225 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.view.View.resolveSize(0, 0), objArr);
        java.lang.String string = m25139.getString(((java.lang.String) objArr[0]).intern());
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 101) % 128;
        return string;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25155(byte[] bArr, byte[] bArr2) throws org.json.JSONException {
        int i = 0;
        if (bArr == null || bArr.length <= 0) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 50, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 992, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (bArr2 == null || bArr2.length <= 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(40 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE, (char) (android.view.View.getDefaultSize(0, 0) + 62266), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, (-16776135) - android.graphics.Color.rgb(0, 0, 0), (char) android.text.TextUtils.indexOf("", ""), objArr3);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr3[0]).intern());
        while (true) {
            if (i < jSONArray.length()) {
                if (new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8).equalsIgnoreCase(jSONArray.getString(i))) {
                    break;
                }
                i++;
            } else {
                jSONArray.put(new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
                break;
            }
        }
        return jSONObject.toString().getBytes();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25162(byte[] bArr, java.lang.String str) throws org.json.JSONException {
        int i = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(32 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), android.view.KeyEvent.getDeadChar(0, 0) + 1106, (char) (35489 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (bArr == null || bArr.length <= 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(52 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.LastFrameStart, (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 25, 1082 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr3[0]).intern());
        while (true) {
            if (i >= jSONArray.length()) {
                i = -1;
                break;
            }
            if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                break;
            }
            i++;
        }
        if (i != -1) {
            jSONArray.remove(i);
        }
        return jSONObject.toString().getBytes();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final org.json.JSONObject m25147(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.lang.Object obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - android.text.TextUtils.indexOf("", "", 0, 0), android.view.KeyEvent.normalizeMetaState(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, (char) (36384 - android.view.View.getDefaultSize(0, 0)), objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), str.trim());
        if (!android.text.TextUtils.isEmpty(str2)) {
            int i = getHighSpeedVideoFpsRangesFor + 49;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.getSize(1) * 86, 21548 >>> (android.widget.ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)), (char) (47132 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr2);
                obj = objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(17 - android.view.View.MeasureSpec.getSize(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1139, (char) (47132 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr3);
                obj = objArr3[0];
            }
            jSONObject.put(((java.lang.String) obj).intern(), str2.trim());
        }
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.view.View.resolveSizeAndState(0, 0, 0) + 26, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1107, (char) (56389 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr4);
        java.lang.String intern = ((java.lang.String) objArr4[0]).intern();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
        try {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 3, 1181 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (6456 - android.view.View.MeasureSpec.getSize(0)), objArr5);
            jSONObject.put(intern, ((java.lang.String) objArr5[0]).intern());
            long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
            int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 67) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)) + 6, 1185 - (keyRepeatTimeout >> 16), (char) (23670 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr6);
            java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(2 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1191 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr7);
            jSONObject.put(intern2, ((java.lang.String) objArr7[0]).intern());
            if (jSONArray != null) {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 24, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1193, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr8);
                jSONObject.put(((java.lang.String) objArr8[0]).intern(), jSONArray);
            }
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final org.json.JSONObject m25161(java.lang.String str, byte[] bArr, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InputMethod inputMethod, java.lang.String str2, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData, java.lang.String str3) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int mode = android.view.View.MeasureSpec.getMode(0);
        float complexToFloat = android.util.TypedValue.complexToFloat(0);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(mode + 13, (complexToFloat > 0.0f ? 1 : (complexToFloat == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 17, android.graphics.Color.red(0) + 1218, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 15262), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
            int resolveSize = android.view.View.resolveSize(0, 0);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(resolveSize + 11, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1235, (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 54309), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), inputMethod.getValue());
            int trimmedLength = android.text.TextUtils.getTrimmedLength("");
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(trimmedLength + 8, 1246 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), str2);
            if (walletAccountData != null) {
                float minVolume2 = android.media.AudioTrack.getMinVolume();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(17 - (minVolume2 > 0.0f ? 1 : (minVolume2 == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1254, (char) android.graphics.Color.alpha(0), objArr5);
                jSONObject.put(((java.lang.String) objArr5[0]).intern(), m25131(walletAccountData));
            }
            org.json.JSONObject highSpeedVideoSizes = getHighSpeedVideoSizes(str3);
            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(10 - packedPositionType, 1271 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr6);
            jSONObject.put(((java.lang.String) objArr6[0]).intern(), highSpeedVideoSizes);
            int i = getHighSpeedVideoFpsRangesFor + 73;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return jSONObject;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final org.json.JSONObject m25145(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.EligibilityData eligibilityData, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(12 - android.graphics.ImageFormat.getBitsPerPixel(0), android.widget.ExpandableListView.getPackedPositionType(0L) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(11 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1235 - android.view.KeyEvent.keyCodeFromString(""), (char) (54309 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), eligibilityData.getInputMethod().getValue());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTouchSlop() >> 8) + 8, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1247, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), eligibilityData.getLanguage());
        org.json.JSONObject m25153 = m25153(instrumentData);
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), android.view.KeyEvent.normalizeMetaState(0) + 1281, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 18865), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), m25153);
            com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData = eligibilityData.getWalletAccountData();
            if (walletAccountData != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 117) % 128;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(17 - android.view.View.MeasureSpec.getMode(0), android.text.TextUtils.getCapsMode("", 0, 0) + 1254, (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), objArr5);
                jSONObject.put(((java.lang.String) objArr5[0]).intern(), m25131(walletAccountData));
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            }
            org.json.JSONObject highSpeedVideoSizes = getHighSpeedVideoSizes(eligibilityData.getSerialNumber());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, 1271 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
            jSONObject.put(((java.lang.String) objArr6[0]).intern(), highSpeedVideoSizes);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final org.json.JSONObject m25153(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentData instrumentData) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (instrumentData.getInstrumentDataType() == com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType.CARDDATA) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1218, (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 15262), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), new java.lang.String(instrumentData.getEncryptedCardData(), java.nio.charset.StandardCharsets.UTF_8));
            if (instrumentData.getPublicKeyIdentifier() != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 19, 1295 - android.graphics.Color.blue(0), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 3063), objArr2);
                jSONObject.put(((java.lang.String) objArr2[0]).intern(), instrumentData.getPublicKeyIdentifier());
            }
            return jSONObject;
        }
        if (instrumentData.getInstrumentDataType() != com.gemalto.mfs.mwsdk.mobilegateway.enrollment.InstrumentDataType.ISSUER_PUSH_RECEIPT) {
            return jSONObject;
        }
        int i = getHighSpeedVideoFpsRangesFor + 1;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((i % 2 == 0 ? 97 : 17) + (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), android.widget.ExpandableListView.getPackedPositionType(0L) + 1314, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), m25136(instrumentData.getIssuerPushReceipt()));
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final org.json.JSONObject m25136(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerPushReceipt issuerPushReceipt) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int i = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int i2 = i % 2;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(intValue + 7, 735 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), issuerPushReceipt.getScheme());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 593, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), issuerPushReceipt.getType());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1330, (char) (50172 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), issuerPushReceipt.getPayload());
            if (issuerPushReceipt.getVersion() != null) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, 1184 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23670), objArr4);
                jSONObject.put(((java.lang.String) objArr4[0]).intern(), issuerPushReceipt.getVersion());
            }
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final org.json.JSONObject m25131(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.WalletAccountData walletAccountData) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (!android.text.TextUtils.isEmpty(walletAccountData.getAccountId())) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 47) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetAfter("", 0) + 9, 1338 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), walletAccountData.getAccountId());
        }
        if (!android.text.TextUtils.isEmpty(walletAccountData.getName())) {
            int i = getHighSpeedVideoFpsRangesFor + 79;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            int i2 = i % 2 == 0 ? 3 : 4;
            try {
                int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue();
                float minVolume = android.media.AudioTrack.getMinVolume();
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 97) % 128;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(i2 + ((intValue + 20) >> 6), (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 1347, (char) (11638 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr2);
                jSONObject.put(((java.lang.String) objArr2[0]).intern(), walletAccountData.getName());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (!android.text.TextUtils.isEmpty(walletAccountData.getEmail())) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(5 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.widget.ExpandableListView.getPackedPositionType(0L) + 607, (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46848), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), walletAccountData.getEmail());
        }
        if (walletAccountData.getAddress() != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 9) % 128;
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1351, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 62193), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), m25144(walletAccountData.getAddress()));
        }
        return jSONObject;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final org.json.JSONObject m25144(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.Address address) throws org.json.JSONException {
        java.lang.Object obj;
        java.lang.Object obj2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (!android.text.TextUtils.isEmpty(address.getLine1())) {
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((maximumDrawingCacheSize >> 24) + 5, 1358 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), address.getLine1());
        }
        if (!android.text.TextUtils.isEmpty(address.getLine2())) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 83) % 128;
            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(5 - (scrollDefaultDelay >> 16), 1364 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (10543 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), address.getLine2());
        }
        if (!android.text.TextUtils.isEmpty(address.getCity())) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 115;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(2 / (android.view.ViewConfiguration.getTapTimeout() >> 86), 4729 - android.graphics.Color.blue(1), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr3);
                obj2 = objArr3[0];
            } else {
                int tapTimeout = android.view.ViewConfiguration.getTapTimeout();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(4 - (tapTimeout >> 16), 1368 - android.graphics.Color.blue(0), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr4);
                obj2 = objArr4[0];
            }
            jSONObject.put(((java.lang.String) obj2).intern(), address.getCity());
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 109;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            int i3 = i2 % 2;
        }
        if (!android.text.TextUtils.isEmpty(address.getState())) {
            int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(deadChar + 5, android.graphics.Color.rgb(0, 0, 0) + 16777442, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr5);
            jSONObject.put(((java.lang.String) objArr5[0]).intern(), address.getState());
        }
        if (!android.text.TextUtils.isEmpty(address.getCountry())) {
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 103;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(26 >>> makeMeasureSpec, modifierMetaStateMask * 31647, (char) (43568 << (android.view.ViewConfiguration.getMaximumDrawingCacheSize() % 101)), objArr6);
                obj = objArr6[0];
            } else {
                int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                byte modifierMetaStateMask2 = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(7 - makeMeasureSpec2, modifierMetaStateMask2 + 1373, (char) (43568 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr7);
                obj = objArr7[0];
            }
            jSONObject.put(((java.lang.String) obj).intern(), address.getCountry());
        }
        if (!android.text.TextUtils.isEmpty(address.getPostalCode())) {
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((maxKeyCode >> 16) + 10, (-16775837) - android.graphics.Color.rgb(0, 0, 0), (char) android.graphics.Color.red(0), objArr8);
            jSONObject.put(((java.lang.String) objArr8[0]).intern(), address.getPostalCode());
        }
        return jSONObject;
    }

    static org.json.JSONObject Camera2StreamConfigurationMap(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.enrollment.AuthMethod authMethod) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(argb + 4, 593 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.KeyEvent.normalizeMetaState(0), objArr);
        jSONObject2.put(((java.lang.String) objArr[0]).intern(), authMethod.getType());
        int indexOf = android.text.TextUtils.indexOf("", "");
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(indexOf + 2, 591 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr2);
        jSONObject2.put(((java.lang.String) objArr2[0]).intern(), authMethod.getId());
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(14 - (uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)), (intValue >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), str);
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - (uptimeMillis2 > 0L ? 1 : (uptimeMillis2 == 0L ? 0 : -1)), 1394 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 50373), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), jSONObject2);
            int i = getHighSpeedVideoFpsRangesFor + 43;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return jSONObject;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static org.json.JSONObject getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.String str2) throws org.json.JSONException {
        java.lang.Object obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int touchSlop = android.view.ViewConfiguration.getTouchSlop();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((touchSlop >> 8) + 13, 196 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(indexOf + 11, 1405 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12915), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), i);
        if (i != 0) {
            if (android.text.TextUtils.isEmpty(str2)) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 27;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                if (i2 % 2 != 0) {
                    int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay() / 56;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(scrollDefaultDelay + 36, 11560 << android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.View.MeasureSpec.getMode(1) * 5584), objArr3);
                    obj = objArr3[0];
                } else {
                    int scrollDefaultDelay2 = android.view.ViewConfiguration.getScrollDefaultDelay();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(22 - (scrollDefaultDelay2 >> 16), android.view.KeyEvent.normalizeMetaState(0) + 1415, (char) (26082 - android.view.View.MeasureSpec.getMode(0)), objArr4);
                    obj = objArr4[0];
                }
                str2 = ((java.lang.String) obj).intern();
            }
            int maxKeyCode = android.view.KeyEvent.getMaxKeyCode();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((maxKeyCode >> 16) + 13, 1436 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
            jSONObject.put(((java.lang.String) objArr5[0]).intern(), str2);
        }
        int i3 = getHighSpeedVideoFpsRangesFor + 69;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    static org.json.JSONObject getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str4 == null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 111) % 128;
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(indexOf + 20, 1450 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 13339), objArr);
            str4 = ((java.lang.String) objArr[0]).intern();
        }
        if (str4.length() > 255) {
            str4 = str4.substring(0, 255);
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 47) % 128;
        try {
            long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
            int keyRepeatDelay = android.view.ViewConfiguration.getKeyRepeatDelay();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)) + 12, (keyRepeatDelay >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), str);
            org.json.JSONObject highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(jSONObject, str2, str3, str4);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 3) % 128;
            return highSpeedVideoFpsRangesFor;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static org.json.JSONObject getHighSpeedVideoFpsRangesFor(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.json.JSONException {
        int i;
        int makeMeasureSpec;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            i = 3 >>> (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1));
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 1) * 14414;
        } else {
            i = 5 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 593;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(i, makeMeasureSpec, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(12 - (elapsedRealtimeNanos > 0L ? 1 : (elapsedRealtimeNanos == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 1469, (char) android.view.View.MeasureSpec.getMode(0), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), str2);
            if (android.text.TextUtils.isEmpty(str3)) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(22 - (elapsedRealtime > 0L ? 1 : (elapsedRealtime == 0L ? 0 : -1)), 1480 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                str3 = ((java.lang.String) objArr3[0]).intern();
            }
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 119) % 128;
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((intValue >> 22) + 7, 1500 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), str3);
            return jSONObject;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final org.json.JSONObject m25146(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, byte[] bArr, byte[] bArr2, java.lang.String str7) throws org.json.JSONException {
        java.lang.Object obj;
        int indexOf;
        int trimmedLength;
        int i;
        java.lang.Object obj2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 196 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
        jSONObject.put(((java.lang.String) objArr[0]).intern(), str);
        if (!android.text.TextUtils.isEmpty(str2)) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 6, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1508, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), objArr2);
            jSONObject.put(((java.lang.String) objArr2[0]).intern(), str2);
        }
        if (!android.text.TextUtils.isEmpty(str3)) {
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1514, (char) (35512 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr3);
                jSONObject.put(((java.lang.String) objArr3[0]).intern(), str3);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (!android.text.TextUtils.isEmpty(str4)) {
            int i2 = getHighSpeedVideoFpsRangesFor + 63;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() / 33) + 14, android.text.TextUtils.indexOf("", "", 0) * 27821, (char) (46044 - android.view.View.getDefaultSize(1, 0)), objArr4);
                obj2 = objArr4[0];
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, android.text.TextUtils.indexOf("", "", 0) + 329, (char) (46044 - android.view.View.getDefaultSize(0, 0)), objArr5);
                obj2 = objArr5[0];
            }
            jSONObject.put(((java.lang.String) obj2).intern(), str4);
        }
        if (!android.text.TextUtils.isEmpty(str5)) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 87) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 7754), objArr6);
            jSONObject.put(((java.lang.String) objArr6[0]).intern(), str5);
        }
        if (!android.text.TextUtils.isEmpty(str6)) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 119;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            if (i3 % 2 != 0) {
                indexOf = 52 >>> android.text.TextUtils.indexOf((java.lang.CharSequence) "", (char) 0, 0, 1);
                trimmedLength = android.text.TextUtils.getTrimmedLength("") + 6603;
                i = 10540;
            } else {
                indexOf = 21 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                trimmedLength = android.text.TextUtils.getTrimmedLength("") + 1522;
                i = 2554;
            }
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(indexOf, trimmedLength, (char) (i + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr7);
            jSONObject.put(((java.lang.String) objArr7[0]).intern(), str6);
        }
        if (bArr != null && bArr.length > 0) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(18 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1543, (char) (48068 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr8);
            jSONObject.put(((java.lang.String) objArr8[0]).intern(), new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        }
        if (bArr2 != null && bArr2.length > 0) {
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(19 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1562 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr9);
            jSONObject.put(((java.lang.String) objArr9[0]).intern(), new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8));
        }
        if (!android.text.TextUtils.isEmpty(str7)) {
            int i4 = getHighSpeedVideoFpsRangesFor + 105;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.ViewConfiguration.getDoubleTapTimeout() * com.google.android.gms.tapandpay.TapAndPayStatusCodes.TAP_AND_PAY_INVALID_TOKEN_STATE, 9719 >> (android.util.TypedValue.complexToFloat(1) > 2.0f ? 1 : (android.util.TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 1.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 1.0f ? 0 : -1)) * 8507), objArr10);
                obj = objArr10[0];
            } else {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1581, (char) (10487 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr11);
                obj = objArr11[0];
            }
            jSONObject.put(((java.lang.String) obj).intern(), str7);
        }
        return jSONObject;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final org.json.JSONObject m25137(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(16 - indexOf, android.view.Gravity.getAbsoluteGravity(0, 0) + 1596, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(14 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), 196 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.graphics.Color.green(0), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), str);
        float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(17 - (complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1612, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), str2);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
        return jSONObject;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final org.json.JSONObject m25159(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list) throws org.json.JSONException {
        int i = 1;
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 17, 1596 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(12 - android.view.MotionEvent.axisFromString(""), 196 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), str);
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(5 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1630, (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 45441), objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), str2);
        if (str3 != null && !str3.isEmpty()) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - android.graphics.Color.green(0), android.graphics.Color.alpha(0) + 1514, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35511), objArr4);
            jSONObject.put(((java.lang.String) objArr4[0]).intern(), str3);
        }
        if (bArr != null && bArr.length > 0) {
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 20, 1562 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr5);
                jSONObject.put(((java.lang.String) objArr5[0]).intern(), new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (list != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            if (!list.isEmpty()) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int i2 = 0;
                while (i2 < list.size()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues keyValues = list.get(i2);
                    java.lang.Object[] objArr6 = new java.lang.Object[i];
                    getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", c) + 4, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_TOKEN, (char) (41455 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr6);
                    jSONObject2.put(((java.lang.String) objArr6[0]).intern(), keyValues.getKey());
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(4 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VISA_UNEXPECTED_ERROR, (char) (40828 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), objArr7);
                    jSONObject2.put(((java.lang.String) objArr7[0]).intern(), keyValues.getValue());
                    jSONArray.put(jSONObject2);
                    i2++;
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 57) % 128;
                    i = 1;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                }
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9, 575 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 20097), objArr8);
                jSONObject.put(((java.lang.String) objArr8[0]).intern(), jSONArray);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 99) % 128;
            }
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        return jSONObject;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final org.json.JSONObject m25160(java.lang.String str, byte[] bArr) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str) || bArr == null || bArr.length == 0) {
            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(17 - offsetAfter, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1597, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, 0);
        long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(13 - combineMeasuredStates, (packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), str);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(3 - (intValue >> 22), 1636 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (49475 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
            int i = getHighResolutionOutputSizeshNQ4ISI + 33;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return jSONObject;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final org.json.JSONObject m25154(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            int indexOf = android.text.TextUtils.indexOf("", "", 0, 0);
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(17 - indexOf, 1596 - android.graphics.Color.green(0), (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long packedPositionForChild = android.widget.ExpandableListView.getPackedPositionForChild(0, 0);
        int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((packedPositionForChild > 0L ? 1 : (packedPositionForChild == 0L ? 0 : -1)) + 9, 1514 - (keyRepeatTimeout >> 16), (char) (35511 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), str);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 8, android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.text.TextUtils.getOffsetAfter("", 0) + 7753), objArr3);
        jSONObject.put(((java.lang.String) objArr3[0]).intern(), str2);
        long globalActionKeyTimeout = android.view.ViewConfiguration.getGlobalActionKeyTimeout();
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(9 - (globalActionKeyTimeout > 0L ? 1 : (globalActionKeyTimeout == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 1246, (char) android.view.View.MeasureSpec.getSize(0), objArr4);
        jSONObject.put(((java.lang.String) objArr4[0]).intern(), str3);
        if (!android.text.TextUtils.isEmpty(str4)) {
            long zoomControlsTimeout = android.view.ViewConfiguration.getZoomControlsTimeout();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 8, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 330, (char) (46044 - android.view.KeyEvent.normalizeMetaState(0)), objArr5);
            jSONObject.put(((java.lang.String) objArr5[0]).intern(), str4);
        }
        return jSONObject;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final org.json.JSONObject m25138(org.json.JSONArray jSONArray) throws org.json.JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            int maximumDrawingCacheSize = android.view.ViewConfiguration.getMaximumDrawingCacheSize();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((maximumDrawingCacheSize >> 24) + 17, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1639, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor((uptimeMillis > 0L ? 1 : (uptimeMillis == 0L ? 0 : -1)) + 4, android.view.View.getDefaultSize(0, 0) + 1656, (char) (18936 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr2);
        jSONObject.put(((java.lang.String) objArr2[0]).intern(), jSONArray);
        return jSONObject;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m25158(util.h.xy.az.ra raVar) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8));
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (intValue >> 22), 1661 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 64127), objArr);
            java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
            int scrollDefaultDelay = android.view.ViewConfiguration.getScrollDefaultDelay();
            int normalizeMetaState = android.view.KeyEvent.normalizeMetaState(0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((scrollDefaultDelay >> 16) + 13, 1661 - normalizeMetaState, (char) (64128 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr2);
            hashMap.put(((java.lang.String) objArr2[0]).intern(), string);
            float minVolume = android.media.AudioTrack.getMinVolume();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)) + 10, 1674 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 52325), objArr3);
            if (jSONObject.has(((java.lang.String) objArr3[0]).intern())) {
                int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(9 - indexOf, 1675 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 52325), objArr4);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr4[0]).intern());
                int defaultSize = android.view.View.getDefaultSize(0, 0);
                int longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(defaultSize + 10, 1674 - (longPressTimeout >> 16), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 52324), objArr5);
                hashMap.put(((java.lang.String) objArr5[0]).intern(), jSONObject2.toString());
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 1) % 128;
            }
            int i = getHighResolutionOutputSizeshNQ4ISI + 85;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                return hashMap;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IssuerData m25157(java.lang.String str) throws org.json.JSONException {
        if (!android.text.TextUtils.isEmpty(str)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            util.h.xy.bb.rc rcVar = new util.h.xy.bb.rc();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 6, 608 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (46848 - android.view.KeyEvent.normalizeMetaState(0)), objArr);
            if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(4 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 607 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 46848), objArr2);
                rcVar.m25361(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(4 - android.graphics.Color.blue(0), 1346 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11639), objArr3);
            rcVar.m25359(jSONObject.getString(((java.lang.String) objArr3[0]).intern()));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1685, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr4);
            rcVar.m25358(jSONObject.getString(((java.lang.String) objArr4[0]).intern()));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(7 - android.view.View.resolveSizeAndState(0, 0, 0), 627 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.view.KeyEvent.keyCodeFromString(""), objArr5);
            if (!jSONObject.has(((java.lang.String) objArr5[0]).intern())) {
                return rcVar;
            }
            int indexOf = 7 - android.text.TextUtils.indexOf("", "", 0);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            try {
                int intValue = 628 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6);
                int i = getHighResolutionOutputSizeshNQ4ISI + 107;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(indexOf, intValue, (char) (1 >>> (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr6);
                    rcVar.m25360(jSONObject.getString(((java.lang.String) objArr6[0]).intern()));
                    return rcVar;
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(indexOf, intValue, (char) (1 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1))), objArr7);
                rcVar.m25360(jSONObject.getString(((java.lang.String) objArr7[0]).intern()));
                return rcVar;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
        return null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final java.util.List<util.h.xy.au.mg> m25156(byte[] bArr) throws org.json.JSONException {
        int i;
        int i2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 9, 1695 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (48143 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            util.h.xy.au.mg mgVar = new util.h.xy.au.mg();
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor('4' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.View.getDefaultSize(0, 0) + 593, (char) android.text.TextUtils.indexOf("", ""), objArr2);
            mgVar.m25193(jSONObject2.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10, 1704 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.KeyEvent.normalizeMetaState(0) + 49243), objArr3);
            java.lang.String string = jSONObject2.getString(((java.lang.String) objArr3[0]).intern());
            if (string != null) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
                mgVar.m25191(util.h.xy.fa.mb.m26811(string.getBytes()));
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((-16777210) - android.graphics.Color.rgb(0, 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1714, (char) (31667 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr4);
            if (jSONObject2.has(((java.lang.String) objArr4[0]).intern())) {
                int i4 = getHighResolutionOutputSizeshNQ4ISI + 117;
                getHighSpeedVideoFpsRangesFor = i4 % 128;
                if (i4 % 2 != 0) {
                    i = (android.view.ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1)) * 2;
                    i2 = 27374;
                } else {
                    i = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 5;
                    i2 = 1716;
                }
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 77) % 128;
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(i, i2 + ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 31619), objArr5);
                    mgVar.m25194(jSONObject2.getString(((java.lang.String) objArr5[0]).intern()));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(5 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1721, (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr6);
            if (jSONObject2.has(((java.lang.String) objArr6[0]).intern())) {
                int maximumFlingVelocity = 5 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i5 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1721;
                int i6 = getHighSpeedVideoFpsRangesFor + 13;
                getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(maximumFlingVelocity, i5, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() % 91), objArr7);
                    mgVar.m25190(jSONObject2.getString(((java.lang.String) objArr7[0]).intern()));
                } else {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(maximumFlingVelocity, i5, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr8);
                    mgVar.m25190(jSONObject2.getString(((java.lang.String) objArr8[0]).intern()));
                }
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
            }
            arrayList.add(mgVar);
        }
        return arrayList;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.String> m25152(util.h.xy.az.ra raVar) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        java.util.Map<java.lang.String, java.lang.String> m25135 = m25135(new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8));
        int i = getHighSpeedVideoFpsRangesFor + 105;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return m25135;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d0, code lost:
    
        if (((java.lang.String) r11[0]).intern().equalsIgnoreCase(r5) != false) goto L8;
     */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.Map<java.lang.String, java.lang.String> m25135(java.lang.String str) throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(3 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        java.lang.String string = jSONObject.getString(((java.lang.String) objArr[0]).intern());
        int resolveSize = android.view.View.resolveSize(0, 0);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 125) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(resolveSize + 4, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, (char) android.view.View.resolveSize(0, 0), objArr2);
            hashMap.put(((java.lang.String) objArr2[0]).intern(), string);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(6 - android.graphics.Color.blue(0), 1726 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3);
            if (!((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(string)) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1731, (char) (25669 - android.view.View.MeasureSpec.getSize(0)), objArr4);
            }
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(13 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 209 - android.graphics.Color.red(0), (char) (android.text.TextUtils.getOffsetBefore("", 0) + 36384), objArr5);
            java.lang.String string2 = jSONObject.getString(((java.lang.String) objArr5[0]).intern());
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.KeyEvent.getMaxKeyCode() >> 16) + 13, 209 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (36384 - android.view.View.resolveSize(0, 0)), objArr6);
            hashMap.put(((java.lang.String) objArr6[0]).intern(), string2);
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, 244 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0), objArr7);
            if (jSONObject.has(((java.lang.String) objArr7[0]).intern())) {
                int minimumFlingVelocity = android.view.ViewConfiguration.getMinimumFlingVelocity();
                byte modifierMetaStateMask = (byte) android.view.KeyEvent.getModifierMetaStateMask();
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((minimumFlingVelocity >> 16) + 12, modifierMetaStateMask + 245, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr8);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr8[0]).intern());
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 244 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr9);
                hashMap.put(((java.lang.String) objArr9[0]).intern(), jSONObject2.toString());
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(9 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 329 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 46044), objArr10);
                jSONObject2.getString(((java.lang.String) objArr10[0]).intern());
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.view.KeyEvent.normalizeMetaState(0), 337 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr11);
                if (jSONObject2.has(((java.lang.String) objArr11[0]).intern())) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 119) % 128;
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11, 337 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr12);
                    jSONObject2.getString(((java.lang.String) objArr12[0]).intern());
                }
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.graphics.Color.blue(0) + 13, 349 - android.text.TextUtils.indexOf("", ""), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr13);
                jSONObject2.getString(((java.lang.String) objArr13[0]).intern());
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 15, android.graphics.Color.green(0) + 375, (char) (3063 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr14);
                jSONObject2.getString(((java.lang.String) objArr14[0]).intern());
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15, 390 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (64558 - android.view.KeyEvent.getDeadChar(0, 0)), objArr15);
                jSONObject2.getString(((java.lang.String) objArr15[0]).intern());
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(8 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 329, (char) (46044 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr16);
                java.lang.String string3 = jSONObject2.getString(((java.lang.String) objArr16[0]).intern());
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8, android.widget.ExpandableListView.getPackedPositionType(0L) + 329, (char) (46043 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr17);
                hashMap.put(((java.lang.String) objArr17[0]).intern(), string3);
            }
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.getOffsetBefore("", 0) + 15, android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 8160), objArr18);
            if (jSONObject.has(((java.lang.String) objArr18[0]).intern())) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 87) % 128;
                java.lang.Object[] objArr19 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 275 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (8161 - android.text.TextUtils.indexOf("", "")), objArr19);
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(((java.lang.String) objArr19[0]).intern());
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(14 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 275 - android.graphics.Color.argb(0, 0, 0, 0), (char) (8161 - android.graphics.Color.blue(0)), objArr20);
                hashMap.put(((java.lang.String) objArr20[0]).intern(), jSONObject3.toString());
                java.lang.Object[] objArr21 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(8 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), 1514 - android.view.View.resolveSizeAndState(0, 0, 0), (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 35512), objArr21);
                if (jSONObject3.has(((java.lang.String) objArr21[0]).intern())) {
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(8 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1514 - android.graphics.Color.alpha(0), (char) (35512 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr22);
                    jSONObject3.getString(((java.lang.String) objArr22[0]).intern());
                }
                java.lang.Object[] objArr23 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 5, 547 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1197), objArr23);
                if (jSONObject3.has(((java.lang.String) objArr23[0]).intern())) {
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(5 - android.graphics.Color.green(0), 546 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1196), objArr24);
                    jSONObject3.getString(((java.lang.String) objArr24[0]).intern());
                }
                java.lang.Object[] objArr25 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - android.text.TextUtils.getOffsetAfter("", 0), android.text.TextUtils.getOffsetBefore("", 0) + 531, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr25);
                if (jSONObject3.has(((java.lang.String) objArr25[0]).intern())) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 73) % 128;
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(15 - android.text.TextUtils.getTrimmedLength(""), 531 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr26);
                    jSONObject3.getString(((java.lang.String) objArr26[0]).intern());
                }
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(7 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 524, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr27);
                jSONObject3.getString(((java.lang.String) objArr27[0]).intern());
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 375, (char) (android.view.KeyEvent.keyCodeFromString("") + 3064), objArr28);
                jSONObject3.getString(((java.lang.String) objArr28[0]).intern());
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 390, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 64558), objArr29);
                jSONObject3.getString(((java.lang.String) objArr29[0]).intern());
            }
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, 1737 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.view.KeyEvent.getDeadChar(0, 0), objArr30);
            if (jSONObject.has(((java.lang.String) objArr30[0]).intern())) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 85) % 128;
                java.lang.Object[] objArr31 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(15 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1738, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1), objArr31);
                java.lang.String string4 = jSONObject.getString(((java.lang.String) objArr31[0]).intern());
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.MotionEvent.axisFromString("") + 15, 1737 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), objArr32);
                hashMap.put(((java.lang.String) objArr32[0]).intern(), string4);
            }
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(8 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 255, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 48761), objArr33);
            if (jSONObject.has(((java.lang.String) objArr33[0]).intern())) {
                java.lang.Object[] objArr34 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 256, (char) (48762 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr34);
                org.json.JSONObject jSONObject4 = jSONObject.getJSONObject(((java.lang.String) objArr34[0]).intern());
                java.lang.Object[] objArr35 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 18, android.graphics.Color.red(0) + 858, (char) (51832 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr35);
                jSONObject4.getString(((java.lang.String) objArr35[0]).intern());
                java.lang.Object[] objArr36 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(18 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 973, (char) (25243 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr36);
                jSONObject4.getString(((java.lang.String) objArr36[0]).intern());
                java.lang.Object[] objArr37 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(22 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 953 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr37);
                if (jSONObject4.has(((java.lang.String) objArr37[0]).intern())) {
                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.getDeadChar(0, 0) + 21, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 952, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr38);
                    jSONObject4.getString(((java.lang.String) objArr38[0]).intern());
                }
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 920, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), objArr39);
                if (jSONObject4.has(((java.lang.String) objArr39[0]).intern())) {
                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, 896 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (42397 - android.graphics.Color.red(0)), objArr40);
                    if (!jSONObject4.has(((java.lang.String) objArr40[0]).intern())) {
                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31, 919 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr41);
                        jSONObject4.getString(((java.lang.String) objArr41[0]).intern());
                    }
                } else {
                    int resolveSize2 = android.view.View.resolveSize(0, 0);
                    int resolveOpacity = android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(resolveSize2 + 20, 876 - resolveOpacity, (char) ((((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 17947), objArr42);
                    jSONObject4.getString(((java.lang.String) objArr42[0]).intern());
                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.View.getDefaultSize(0, 0) + 24, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 896, (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 42397), objArr43);
                    jSONObject4.getString(((java.lang.String) objArr43[0]).intern());
                }
                java.lang.Object[] objArr44 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 9, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 256, (char) (48809 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr44);
                hashMap.put(((java.lang.String) objArr44[0]).intern(), jSONObject4.toString());
            }
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 5, android.view.View.MeasureSpec.getSize(0) + 1726, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr45);
            if (((java.lang.String) objArr45[0]).intern().equalsIgnoreCase(string)) {
                java.lang.Object[] objArr46 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 13, android.view.View.MeasureSpec.getMode(0) + 231, (char) (47482 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr46);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr46[0]).intern());
                java.lang.Object[] objArr47 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(13 - android.text.TextUtils.indexOf("", "", 0, 0), 231 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (android.graphics.Color.rgb(0, 0, 0) + 16824697), objArr47);
                hashMap.put(((java.lang.String) objArr47[0]).intern(), jSONArray.toString());
            }
            return hashMap;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.CardProduct> m25130(util.h.xy.az.ra raVar) throws org.json.JSONException, com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        char c;
        char c2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(raVar.m25280(), java.nio.charset.StandardCharsets.UTF_8));
        int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
        char c3 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(14 - packedPositionChild, 1799 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25267), objArr);
        org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr[0]).intern());
        int i = 0;
        while (i < jSONArray.length()) {
            util.h.xy.bb.mc mcVar = new util.h.xy.bb.mc();
            org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 9, 329 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 46044), objArr2);
            mcVar.m25321(jSONObject2.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 338 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.getOffsetBefore("", 0), objArr3);
            mcVar.m25314(jSONObject2.getString(((java.lang.String) objArr3[0]).intern()));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 1766 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (15103 - android.text.TextUtils.getTrimmedLength("")), objArr4);
            if (jSONObject2.has(((java.lang.String) objArr4[0]).intern())) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(9 - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 1766, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 15103), objArr5);
                mcVar.m25315(jSONObject2.getString(((java.lang.String) objArr5[0]).intern()));
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getTapTimeout() >> 16) + 10, 1776 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.text.TextUtils.lastIndexOf("", c3, 0, 0) + 1), objArr6);
            if (jSONObject2.has(((java.lang.String) objArr6[0]).intern())) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, 1777 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0), objArr7);
                mcVar.m25320(jSONObject2.getString(((java.lang.String) objArr7[0]).intern()));
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 75) % 128;
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            } else {
                c = c3;
            }
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.AndroidCharacter.getMirror(c) - '(', 1785 - android.text.TextUtils.lastIndexOf("", c), (char) (63106 - android.widget.ExpandableListView.getPackedPositionChild(0L)), objArr8);
            if (jSONObject2.has(((java.lang.String) objArr8[0]).intern())) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(android.view.View.combineMeasuredStates(0, 0) + 8, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1785, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 63107), objArr9);
                mcVar.m25323(jSONObject2.getString(((java.lang.String) objArr9[0]).intern()));
            }
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(11 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 1794 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr10);
            if (jSONObject2.has(((java.lang.String) objArr10[0]).intern())) {
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(11 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.ImageFormat.getBitsPerPixel(0) + 1795, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), objArr11);
                org.json.JSONArray jSONArray2 = jSONObject2.getJSONArray(((java.lang.String) objArr11[0]).intern());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(java.lang.Integer.valueOf(jSONArray2.getInt(i2)));
                }
                mcVar.m25317(arrayList2);
            }
            float complexToFraction = android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f);
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 43;
            getHighSpeedVideoFpsRangesFor = i3 % 128;
            int i4 = i3 % 2;
            try {
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((complexToFraction > 0.0f ? 1 : (complexToFraction == 0.0f ? 0 : -1)) + 17, 1806 - makeMeasureSpec, (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr12);
                if (jSONObject2.has(((java.lang.String) objArr12[0]).intern())) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.view.KeyEvent.normalizeMetaState(0) + 17, android.graphics.Color.green(0) + 1806, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr13);
                    mcVar.m25318(jSONObject2.getDouble(((java.lang.String) objArr13[0]).intern()));
                }
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(8 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 256 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (48761 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr14);
                if (jSONObject2.has(((java.lang.String) objArr14[0]).intern())) {
                    util.h.xy.bb.ra raVar2 = new util.h.xy.bb.ra();
                    raVar2.m25335(mcVar.getProductName());
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.widget.ExpandableListView.getPackedPositionType(0L) + 8, android.text.TextUtils.getOffsetBefore("", 0) + 256, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48761), objArr15);
                    raVar2.m25336(jSONObject2.getString(((java.lang.String) objArr15[0]).intern()));
                    mcVar.m25319(raVar2);
                }
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(13 - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.getOffsetAfter("", 0) + 1661, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 64127), objArr16);
                if (jSONObject2.has(((java.lang.String) objArr16[0]).intern())) {
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(13 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1662 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 64128), objArr17);
                    mcVar.m25313(jSONObject2.getString(((java.lang.String) objArr17[0]).intern()));
                }
                java.lang.Object[] objArr18 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1823, (char) (20450 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr18);
                if (jSONObject2.has(((java.lang.String) objArr18[0]).intern())) {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(android.graphics.ImageFormat.getBitsPerPixel(0) + 13, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1824, (char) (20450 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr19);
                    mcVar.m25324(jSONObject2.getString(((java.lang.String) objArr19[0]).intern()));
                }
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 13, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1835, (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 44457), objArr20);
                if (jSONObject2.has(((java.lang.String) objArr20[0]).intern())) {
                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 1836 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.graphics.Color.red(0) + 44457), objArr21);
                    mcVar.m25312(jSONObject2.getString(((java.lang.String) objArr21[0]).intern()));
                }
                int keyRepeatTimeout = android.view.ViewConfiguration.getKeyRepeatTimeout();
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(14 - (keyRepeatTimeout >> 16), (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 1847, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr22);
                if (jSONObject2.has(((java.lang.String) objArr22[0]).intern())) {
                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(14 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1848, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr23);
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(((java.lang.String) objArr23[0]).intern());
                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(9 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1862, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr24);
                    java.lang.String string = jSONObject3.getString(((java.lang.String) objArr24[0]).intern());
                    int keyRepeatTimeout2 = android.view.ViewConfiguration.getKeyRepeatTimeout();
                    int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
                    c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((keyRepeatTimeout2 >> 16) + 7, 1871 - deadChar, (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr25);
                    mcVar.m25316(string, jSONObject3.getString(((java.lang.String) objArr25[0]).intern()));
                } else {
                    c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                }
                arrayList.add(mcVar);
                i++;
                c3 = c2;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final boolean m25132(byte[] bArr, java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29, android.graphics.Color.alpha(0) + 1878, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 39201), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        if (bArr != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(android.graphics.Color.green(0) + 25, 1081 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), objArr2);
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(((java.lang.String) objArr2[0]).intern());
            for (int i = 0; i < jSONArray.length(); i++) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 13) % 128;
                if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                    int i2 = getHighResolutionOutputSizeshNQ4ISI + 21;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    return i2 % 2 == 0;
                }
            }
        }
        return false;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = 3369329053748087304L;
    }

    static void getHighSpeedVideoSizes() {
        char[] cArr = new char[1906];
        java.nio.ByteBuffer.wrap("\u0082,Â>\u0002\u0018B\u0018\u0082gÂr\u0002sB©\u009ceÜw\u001cQ\\Q\u009c.Ü;\u001c=\\å\u009côÜÏ\u009crÜw\u001cU\\Q\u009c,Ü2\u001c=\\ñ\u009côÜÈ\u001cÚ\\¢\u009ccÜ`\u001cF\\V\u009c)<â|ó¼ÍüÓ<¯\u009cnÜa\u001ci\\Y\u009c Ü;\u009c@Ü\\\u001cc\\j\u009c\u0002Ü\u0017\u001c7\u009cnÜa\u001cq\\]\u009c?Ü-\u001c\u001a\\ë\u009c÷\u009ceÜw\u001cQ\\Q\u009c.Ü;\u001c'\\ý\u009céÜÏ\u009cLÜ]\u001ce\\q\u009c\u0001Ü\u001b\u009crÜf\u001cH\\J\u009c,Ü9\u001c\u0016\\Ð\u009càÜÚ\u001cÚ<Ë|Ù¼ÿüÿ<\u0080|\u0095¼¢üG<R|i¼~ü\f<2wó7è÷Ø·çw°7²÷\u008e·zwi7SÆ¤\u0086§F\u0083\u0006\u008bÆþ\u0086æFí\u00067Æ&\u0086\u001bF\u0001\u0006r\u009crÜq\u001cU\\]\u009c(Ü0\u001c$\\í\u009cýÜÞ\u001c×Nk\u000efÎT\u008eAN?\u000e4\u009c`Ü|\u001cC\\J\u009c\"Ü7\u001c\u0017\\ª\u009cñÜË\u001cÍ\\´\u009c\u0092Ü\u0097\u001dy]y\u009d\u001fÝ,\u001d1]\u000b\u009c`Ü|\u001cC\\J\u009c\"Ü7\u001c\u0017\\Û\u009cðÜÎv«6¹ö\u009f¶\u009fvà6õöâ¶$v66\tö\u0014òä²ùrÕ2Úò¾²¶r\u009b2wòv²rrV26ò\u000f²\u0014\u009cbÜ}\u001cU\\J\u009c(Ü2\u001c\u0012\\ð\u009cðÜÅ\u001cÑ\\\u0099\u009c\u0081\u0012ER[\u0092`Òq\u0012\u0019R\u001f\u0092?Òç\u0012ØRø\u0092ûÒ¹\u0012¡\u009cgÜ~\u001cH\\O\u009crÜf\u001cF\\L\u009c(%\u0011e\u000f¥(å\f%QeS¥bå\u0092%\u0084e\u009f¥¯åÚ%è\u009cbÜs\u001cU\\\\\u009c\u0000Ü;\u001c\u0007\\å\u009cýÜË\u001cË\\±\"\u001bb\n¢,â%\"ubU¢~â\u008e\u009cbÜs\u001cU\\\\\u009c\tÜ;\u001c\u0007\\å\u009cðÜÆ\u001cÌ\u0083\u0081Ã\u0086\u0003¾C\u009a\u0083ÍÃÍ\u0003öC(\u0083\u001dÃ?\u0003?CU\u0083eÃc\u0002\u008b\fTLP\u008csÌo\f\u0005L\u0017\u008c'ÌÆ\fýLâ\u008cöÌ\u0083\f§L©\u008dX\u009csÜw\u001cT\\H\u009c\"Ü0\u001c\u0000\\á\u009cÚÜÅ\u001cÛ\\µ\u0013\u0000S\u0004\u00931Ó3\u0013[Sw\u0093rÓ\u0093\u0013\u008eS¯\u0093¼ÓÑ/\u00ado¼¯\u0094ï\u0080/äoá¯Ûï\u0011/!\u009cqÜ`\u001cH\\\\\u009c8Ü=\u001c\u0007\\Ê\u009cøÜÇ\u001cÚ\u009cqÜs\u001cI\\t\u009c,Ü-\u001c\u0007\\À\u009cðÜÍ\u001cÖ\\¤\u009c\u0096å\u0094¥\u0096e¬%\u0098åÐ¥Ëeÿ%\u0013å\u0005¥\u000be;%Aåe\u0097\u008d×\u0085\u0017´W¥\u0097Û×ê\u0017êW\u000f\u0097\u0015×\u0016\u0017.WO\u0097t×z\u0016\u0080`[ Sàb s`\r 5à% Ú`Þ öàè º`ª ¬á@±ËñÃ1ñqó±\u0080ñ£1¯qN±Cña1oq\u0019±(ñ&0ÝpË\u009cmÜ}\u001cI\\_\u009c\tÜ;\u001c\u0000\\ç\u009cëÜÃ\u001cÏ\\¤\u009c\u008cÜ\u0099\u001de\u009chÜa\u001cT\\M\u009c(Ü,\u001c=\\å\u009côÜÏ\u0098QØX\u0018mXt\u0098\u0011Ø\u0015\u0018\u001aXÕ\u0098ÏØý\u0018ãX§\u0098©Ø¢\u0019PY@\u0099z\u009chÜa\u001cT\\M\u009c(Ü,\u001c6\\é\u009cøÜÃ\u001cÓ\u009chÜa\u001cT\\M\u009c(Ü,\u001c$\\á\u009cûÜÙ\u001cÖ\\¤\u009c\u0080\u0012URW\u0092uÒu\u0012\u001eR?\u0092=ÒÀ\u0012úRå\u0092ñÒ\u0094\u0012¬R¢\u0093BÓS\u0013\u007fS\u0011\u0093\"Ó:\u00131£aãp#^c^£<ã-#\u001acÄ£æãÖ#Æc££\u008cã³\"ib`\u009cuÜ}\u001cL\\]\u009c#Ü\u0017\u001c\u0017\u009cbÜs\u001cU\\\\\u009c\u001fÜ;\u001c\u0015\\á\u009cëÜÏ\u001cÑ\\³\u009c\u0080Ü¿\u001do\u0098ØØÌ\u0018úXÜ\u0098\u0084\u0010êPè\u0090ÅÐÎ\u0010³P«\u0090\u009cÐ^\u0010aPR\u0090KÐ>\u0010\u0010P\u0019\u0091ÂÑâ\u0011ÌQ¼\u0091¾Ñ\u0096\u0011\u0088Qv\u0091]Òê\u0092÷RÞ\u0012îÒ¬\u0092²R\u0086\u0012aÒj=\u0084}\u0099½°\u0003\u000bC\u000f\u00837Ã1\u0003T\u009chÜv\u009cuÜk\u001cW\\]>Þ~Ë¾÷þè>®~\u0092¾§þW>K~s+dk\u007f«FëQ+!\u009cbÜg\u001cT\\L\u009c\"Ü3\u001c\u0016\\ö\u009cÆÜÙ\u001cÚ\\¢\u009c\u0093Ü\u009f\u001dh]y\u009cvÜw\u001cE\\K\u009c$Ü*\u001c\u0016\u009c`Üb\u001cW\\g\u009c9Ü1\u001c,\\å\u009céÜÚ\u009c2ÜV\u001cx\\K\u009c(Ü=\u001c\u0006\\ö\u009cü\u009cnÜf\u001cW\\j\u009c(Ü/\u001c\u0006\\í\u009cëÜÏ\u001cÛ\u009cKÜA\u001ch\\v\u009cmÜ1\u001c\u0011\\î\u009cüÜÉ\u001cË\\ð\u009c\u008dÜ\u0097\u001dx]<\u009dFÝ0\u001d8]\u0006\u009d\u001aÝ®\u001dÌ]À\u009d¹Ý\u0088\u001d\u008a^q\u009e`ÞO\u001eI^)\u009e\u0005ÞR\u001eñ^ù\u009eÁÞË\u001e¶^Å\u009e×ß$\u001f1\u009c`Üb\u001cW\\\n\u009c,Ü.\u001c\u0003\u009csÜw\u001cV\\M\u009c(Ü-\u001c\u0007\\Ô\u009cøÜÓ\u001cÓ\\¿\u009c\u0084Ü\u0092>a~n¾AþY>=~(\u009crÜq\u001cO\\]\u009c Ü;Iï\tØÉ÷\u0089èI\u0087\t\u0093É·\u0089\u0007I[\tyÉl\u0089AI'\t%ÈØ\u0088\u009fHØ\b²È»\u0088\u0085Hþ\b[Èa\u0088{H\u001f\b\u001c\u009cuÜz\u001cU\\]\u009c(Ü\u001a\u001c \\á\u009cúÜß\u001cÍ\\µ\u009c`Üq\u001cT\\u\u009c(Ü*\u001c\u001b\\ë\u009cý\u009c`Üq\u001cT\\m\u009c?Ü2\u009c`Üq\u001cT\\i\u009c8Ü;\u001c\u0001\\ý%ÆeÌ¥ååû%àe¼¥\u009cåc%qeD¥Få}%\u0001e\b¤¦äø$Òd¹¤»ä\u0089$\u0099dg¤\u000fä\u0017$jdy\u009cKÜA\u001ch\\v\u009cmÜ1\u001c\u0011\\î\u009cüÜÉ\u001cË\\ð\u009c\u008cÜ\u0085\u001d+]r\u009d^Ý6\u001dw]\u0018\u009d\u000fÝë\u001dÐ]Ñ\u009d§Ý®\u001dÎ^.\u009e;Þ\bV\u001a\u0016\nÖ0\u0096*Vx\u0016HÖm\u0096\u0092V²\u0016¶Öµ\u0096ÆVé\u0016ý×\u0011\u0097\u0000W\u0001\u0017_Ún\u009amZS\u001aAÚ<\u009a'Z#\u001a÷Úâ\u009aÙZñ\u001a©Ú\u008a\u009a\u0085[b\u001brÛN\u009b;[\u0002\u001b\u00109ÿyî¹ÈùÁ9\u0092y¢¹\u008dùr9cyE¹Mù89\u0016y\u000f¸Äøä8ßx°¸¿ø\u00878\u0083xv¸wøM\u009cbÜs\u001cU\\\\\u009c\u000fÜ?\u001c\u0010\\ï\u009cþÜØ\u001cÐ\\¥\u009c\u008bÜ\u0092\u001dH]s\u009d\\Ý \u001d>]\u0006\u009d\u0018Ýê\u001dñ]Ñ\u009dºÝµ\u001d\u009a^r\u009evÞC\u001er^(\u009cbÜ}\u001ce\\J\u009c,Ü0\u001c\u0017\\È\u009cöÜÍ\u001cÐ\\\u0082\u009c\u0080Ü\u0085\u001dd]i\u009dCÝ!\u001d2]!\u009d\u0019þþ¾ï~É>Àþ\u0098¾¡~\u0080>vþW¾S~P>#þ\f¾\u0018\u007fô?åÿä¿º\u009cQÜw\u001cI\\\\\u009c$Ü0\u001c\u0014\\Ç\u009cøÜØ\u001cÛ\\ð\u009c¤Ü\u0095\u001d\u007f]u\u009dGÝ#\u001d#]\u0001\u009d\u0012Ýà\u001d\u0083]Ø\u009d Ý©\u001d\u009b^ \u009evÞG\u001eU^\"\u009e\u000eÞ\u0006\u001e§^ú\u009eÈÞ\u009e\u001e½^\u0091\u009e\u0095ßf\u001f?__\u009f7ßv\u001f\u000e_\u0011\u009fáßÖ\u001fÎo\u007f/Aïz¯ko\u0003/\u0005ï%¯\u009eoà/ñï÷¯\u008eoÿ/\u0085îU®\u0006nh.\u0019î\u0003®<n(.Àî¹®ìn\u0096.Àî»\u00adOmC-pí!\u00ad\u0019m)-híØ\u00adÏmç-ðí\u0090\u009cqÜw\u001cI\\\\\u009c$Ü0\u001c\u0014\\Ç\u009cøÜØ\u001cÛ\\\u0091\u009c\u0086Ü\u0082\u001db]j\u009dPÝ6\u001d>]\u0007\u009d\u0013ÝÂ\u001dÊ]Ç\u009d½\u0016äVÚ\u0096áÖð\u0016\u0098V\u009e\u0096¾Ö\u0005\u0016{Vj\u0096lÖ\u0015\u0016dV>\u0097Î×\u009d\u0017óW\u0082\u0097\u0098×§\u0017³W[\u0097\"×w\u0017\rW[\u0097+ÔÌ\u0014ÄTó\u0094ãÔÃ$qdo¤HäP$\u0012d#¤\u0003äô$Ñdß¤Îä©$\u008ad\u009e¥våm%]@4\u0000!À\u0011\u0080\u000e@d\u0000jÀA\u0080\u008c@º\u0000\u009bÀ\u00ad\u0080ä@Â\u0000ÞÁ>\u0081;A\u0014\u0001pÁx\u0081AAU\u0001\u009cÁ\u009c\u0081\u0082Aê\u0001ï\u0085MÅX\u0005jEeÀ\u0000\u0080\u0000@\"\u0000<ÀS\u0080F@j\u009cwÜ#\u009cgÜ{\u001cK\\L\u009c(Ü,\u001c'\\ö\u009cøÜÄ\u001cÌ\\±\u009c\u0086Ü\u0082\u001db]s\u009d_Ý\u0010\u001d2]\u000b\u009d\u0012Ýü\u001dÇ]Ç§úçâ'ÚgÔ§ªç°'\u0099g\u007f§cçw'@g<§\u001fç,&ôfö¦ÎHM\bYÈr\u0088hH\u001c\b6È3\u0088ÕHÔ\bàÈþ\u009cmÜs\u001cI\\_\u009c8Ü?\u001c\u0014\\á\u009cvÜs\u001cK\\T\u009c(Ü*\u001c2\\ç\u009cúÜÅ\u001cÊ\\¾\u009c\u0091Ü²\u001dj]h\u009dP\u009ceÜw\u001cQ\\Q\u009c.Ü;\u001c7\\å\u009cíÜËÕØ\u0095ÌUä\u0015üÕ\u008f\u0095\u009bU®\u0015QÕG\u0095nUK\u0015\u0001Õ!\u0095'\u0097\u0086×\u0090\u0017²W£\u0097Ó×Ê\u0017ÏW\u0016\u0097\u0017×\u0014\u0017,WB\u0097|×u\u0016\u0095V\u008d\u0096¯ÖÐ\u0016Ò\u009chÜa\u001cT\\M\u009c(Ü,\u001c#\\ñ\u009cêÜÂ\u001cí\\µ\u009c\u0086Ü\u0093\u001db]l\u009dE_\u008d\u001f\u008fß¢\u009f¨_Þ\u001fÃßë\u009c`Üq\u001cD\\W\u009c8Ü0\u001c\u0007\\Í\u009cý±\u0018ñ\u00041=q*n\u0091.\u0087î²®»nÙ.Üîñ\u009cmÜ{\u001cI\\]\u009c|µCõU5gusµQ\u009cbÜ{\u001cS\\A6RvM¶böf6\tv\u001c¶:\u009cqÜ}\u001cT\\L\u009c,Ü2\u001c0\\ë\u009cýÜÏÌ\u000b\u008c\nL?\f6ÌR\u008cFX¦\u0018¡Ø\u0095\u0098\u0096XÆ\u0018ýØÁ\u0098*X0\u0018\b®ÐîÔ.÷nî®\u0082î\u0089.\u0093nH®^îlù¶¹\u009ey®9´ùÀ¹Ëyÿ9Fù\t¹-y.9Gùk¹`xÉ8³ø¶¸ÓxÆ8ëøø¸\t\u009csÜw\u001cT\\M\u009c!Ü*\u001c>\\á\u009cêÜÙ\u001cÞ\\·\u009c\u0080¨_èd(LhW¨/èe(-hí¨ðèÞ(Öhë¨³è\u0088)cit©Ké>))\u009cbÜ`\u001cN\\L\u009c$Ü=\u001c\u0012\\è\u009cðÜÞ\u001cÆ\u009cTÜ|\u001cL\\V\u009c\"Ü)\u001c\u001d\\¤\u009cüÜÜ\u001cÚ\\¾\u009c\u0091ÜÖ\u001dF]y\u009dBÝ1\u001d6]\u000f\u009d\u0018\u009clÜw\u001cT\\K\u009c,Ü9\u001c\u0016\u009cbÜs\u001cU\\\\\u009c\u0004Ü:\u0016ÐVÙ\u0096ìÖõ\u0016\u0090V\u0094\u0096\u0082ÖX\u0095\u008cÕ\u0085\u0015½U\u0080\u0095×ÕÄ\u0015ïU\r\u0095\u0014Õ2\u0015(UJ\u0095yÕ[\u0014\u009bT\u0088\u0094\u00adÔÈ\u0014ÚTð\u0094éÔ\u0007'¤g£§\u0097ç\u0094'ìgô§Ãç)'>g\u000f§\u000fç}'Ng\\¦\u008cæ·&\u0091fã\u009c`Üg\u001cS\\P\u009c(Ü0\u001c\u0007\\í\u009cúÜË\u001cË\\¹\u009c\u008aÜ\u0098\u001d_]s\u009dZÝ'\u001d9´\u0090ô\u008c4¢t¼´Îôì4êt\u0001´\u0001ô14$tJ´wôo5\u0088\u009cHÜ|\u001cQ\\Y\u009c!Ü7\u001c\u0017\\¤\u009cøÜØ\u001cØ\\¥\u009c\u0088Ü\u0093\u001de]h\u009dB\u009crÜw\u001cK\\]\u009c.Ü*\u001c\u0016\\à\u009cÐÜÎ\u001cÉ\\\u009d\u009c\u0080Ü\u0082\u001dc]s\u009dU-ámð\u00adÒíÐ-£m±]-\u001d%Ý\u0014\u009cHÜ|\u001cQ\\Y\u009c!Ü7\u001c\u0017\\¤\u009cØÜØ\u001cØ\\¥\u009c\u0088Ü\u0093\u001de]h\u009dBÕ\u009a\u0095\u008bU\u00ad\u0015¤ÕÆf\n&\u0003æ;¦\u0015fW&Ræc¦\u008ef\u0094&¶æ¥¦æfþP\r\u0010\u0004Ð1\u0090(PM\u0010IÐR\u0090\u0080P\u0088\u0010®\u009cqÜz\u001cH\\V\u009c(Ü\u0010\u001c\u0006\\é\u009cûÜÏ\u001cÍ |`x [àX 7`# \u001fàî å\\?\u001c'Ü\u001f\u009c\f\\r\u001c`ÜL\u009c\u009b\\£\u001c\u0085Ü\u0085çê§ôgÍ'Üç¦§©\u009cvÜ{\u001cC\\L\u009c%\u009cXÜw\u001cK\\T\u009c\"Ü)ø\u0003¸%x\u00078\u0018øf\u009c`Üq\u001cS\\Q\u009c;Ü?\u001c\u0007\\í\u009cöÜÄ\u001cü\\¿\u009c\u0081Ü\u0093þÑ¾À~æ>ïþ®¾\u009f~¯>Sþ_¾z~x>/þ?¾6\u007fÌ¦\u008dæ\u0085&·fµ¦Ææå&éf\b¦\u0005æd\u009crÜz\u001cH\\J\u009c9Ü\u001a\u001c\u0016\\÷\u009cúÜ\u0098jî*þêÊªÜj\u008a*¸ê\u0083ªd\u009cuÜ}\u001cW\\M\u009c=Ü\u001f\u001c\u001e\\ë\u009cìÜÄ\u001cË\\£\u009csÜw\u001cA\\M\u009c#Ü:\u001c\u0012\\æ\u009cõÜÏ\u001cû\\µ\u009c\u0095Ü\u0099\u001dx]u\u009dEÓ\u0080\u0093\u0083S\u0092\u0013¿ÓÍ\u0093ÏSø\u0013\u0012Ó\u001e\u0093\u001dS/\u0013^1ËqÈ±Þñù1\u008bq\u0099±¿ñc1Eqn±tñ\u001c1>\u009cwÜs\u001cK\\Q\u009c)Ü7\u001c\u0007\\ý\u009cÉÜÏ\u001cÍ\\¹\u009c\u008aÜ\u0092\u009crÜf\u001cF\\J\u009c9Ü\u001a\u001c\u0012\\ð\u009cü\u009cdÜ|\u001cC\\|\u009c,Ü*\u001c\u0016\u0005dEZ\u0085aÅp\u0005\u0018E\u001e\u0085>Åæ\u0005ÙEù\u0085úÅ¸\u0005 E÷\u0084IÄ\\\u0004~D\r\u0084\u0019Ä=\u0004|DÍ\u0084çÄµ\u0004\u0086D\u008e\u0084¢ÇM".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1906);
        getHighSpeedVideoSizesFor = cArr;
        getHighSpeedVideoSizes = 8151503866239900690L;
    }
}
