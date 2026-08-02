package util.h.xy.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 0;
    private static long getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static char[] getOutputFormats;
    private static final /* synthetic */ util.h.xy.u.a[] getOutputMinFrameDuration;
    private static long getOutputMinFrameDurationlomOqCM;
    private static final java.lang.String getOutputSizes;
    private static short[] getOutputSizeshNQ4ISI;
    private static int getOutputStallDuration;
    private static byte[] getOutputStallDurationlomOqCM;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.u.a f2431;
    private java.security.Provider getValidOutputFormatsForInputhNQ4ISI;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getInputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getInputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private a(java.lang.String str) {
    }

    public static util.h.xy.u.a valueOf(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 119;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.u.a aVar = (util.h.xy.u.a) java.lang.Enum.valueOf(util.h.xy.u.a.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = getHighSpeedVideoSizesFor + 55;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return aVar;
        }
        throw null;
    }

    public static util.h.xy.u.a[] values() {
        int i = getHighSpeedVideoSizesFor + 25;
        getInputSizeshNQ4ISI = i % 128;
        util.h.xy.u.a[] aVarArr = getOutputMinFrameDuration;
        if (i % 2 != 0) {
            return (util.h.xy.u.a[]) aVarArr.clone();
        }
        throw null;
    }

    static {
        util.h.xy.u.a[] aVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        Camera2StreamConfigurationMap();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufffb\ufff9\u0004\ufff7\n\t\u0004\uffff", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 8, 215 - (android.view.KeyEvent.getMaxKeyCode() >> 16), true, objArr);
            util.h.xy.u.a aVar = new util.h.xy.u.a(((java.lang.String) objArr[0]).intern());
            f2431 = aVar;
            int i = getInputSizeshNQ4ISI + 65;
            getHighSpeedVideoSizesFor = i % 128;
            if (i % 2 != 0) {
                aVarArr = new util.h.xy.u.a[0];
                aVarArr[0] = aVar;
            } else {
                aVarArr = new util.h.xy.u.a[]{aVar};
            }
            getOutputMinFrameDuration = aVarArr;
            getOutputSizes = util.h.xy.u.a.class.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getOutputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDurationlomOqCM))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @util.h.xy.a.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m27486(boolean z) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.security.cert.X509Certificate m27541;
        int i;
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0) + 47, 229 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            try {
                try {
                    m27484();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, 15 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, true, objArr2);
                    try {
                        java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.text.TextUtils.getOffsetBefore("", 0), objArr4);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(11 - android.widget.ExpandableListView.getPackedPositionGroup(0L), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, (char) (935 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr5);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                        try {
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.view.KeyEvent.normalizeMetaState(0), objArr6);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("軯躃ᵾᒫⰣ皮㌏ꃽ", (-1) - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr7);
                            cls2.getMethod((java.lang.String) objArr7[0], java.io.InputStream.class, char[].class).invoke(invoke, null, null);
                            byte[] mo26153 = util.h.xy.k.ma.m26925().mo26153();
                            try {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(38 - android.graphics.Color.blue(0), 11 - android.view.View.combineMeasuredStates(0, 0), (char) (51090 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr8);
                                java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) objArr8[0]).getDeclaredConstructor(byte[].class).newInstance(mo26153);
                                util.h.xy.ar.b.m25095(mo26153);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("\ufff5\u0007\u0006", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 4, android.widget.ExpandableListView.getPackedPositionChild(0L) + 4, android.graphics.ImageFormat.getBitsPerPixel(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, true, objArr9);
                                try {
                                    java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("桄栮ޭス㛾劫\udb7c䢋겢\uf224៰荁\ue1a1봝\udb24옮♥砉聎㫷笝䎹䕜綩뿘໘ઇ끻", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr11);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(11 - android.widget.ExpandableListView.getPackedPositionType(0L), android.text.TextUtils.getTrimmedLength(""), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 935), objArr12);
                                    java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(null, objArr10);
                                    try {
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        getHighSpeedVideoFpsRangesFor("桄栮ޭス㛾劫\udb7c䢋겢\uf224៰荁\ue1a1봝\udb24옮♥砉聎㫷笝䎹䕜綩뿘໘ઇ끻", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, objArr13);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 15, 48 - android.view.MotionEvent.axisFromString(""), (char) (55081 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr14);
                                        java.lang.String str2 = (java.lang.String) objArr14[0];
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", "", 0) + 26, 64 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (44001 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr15);
                                        java.lang.Object invoke3 = cls4.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr15[0])).invoke(invoke2, newInstance);
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("\ufff5\u0007\u0006", 3 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 3, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, true, objArr16);
                                        try {
                                            java.lang.Object[] objArr17 = {((java.lang.String) objArr16[0]).intern()};
                                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(29 - android.widget.ExpandableListView.getPackedPositionChild(0L), (android.os.Process.myPid() >> 22) + 90, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr18);
                                            java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr18[0]);
                                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11, android.os.Process.getGidForName("") + 1, (char) (935 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr19);
                                            java.lang.Object invoke4 = cls5.getMethod((java.lang.String) objArr19[0], java.lang.String.class).invoke(null, objArr17);
                                            try {
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 89, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr20);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr20[0]);
                                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 11, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 120, (char) (19546 - android.graphics.Color.red(0)), objArr21);
                                                java.security.KeyPair keyPair = (java.security.KeyPair) cls6.getMethod((java.lang.String) objArr21[0], null).invoke(invoke4, null);
                                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                                getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1598041780, (short) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) ((-96) - android.graphics.ImageFormat.getBitsPerPixel(0)), (-92) - android.text.TextUtils.getOffsetBefore("", 0), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1819715336, objArr22);
                                                try {
                                                    java.lang.Object[] objArr23 = {((java.lang.String) objArr22[0]).intern()};
                                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.View.MeasureSpec.getSize(0), objArr24);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(11 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.os.Process.getThreadPriority(0) + 20) >> 6, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 934), objArr25);
                                                    java.security.Signature signature = (java.security.Signature) cls7.getMethod((java.lang.String) objArr25[0], java.lang.String.class).invoke(null, objArr23);
                                                    try {
                                                        if (signature != null) {
                                                            try {
                                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.KeyEvent.keyCodeFromString(""), objArr26);
                                                                java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRangesFor("丽乚놇㗝胐埍⫐뤖誇䐒ኇ狧쟉ଠ\ude5b", android.view.MotionEvent.axisFromString("") + 1, objArr27);
                                                                ((java.security.Provider) cls8.getMethod((java.lang.String) objArr27[0], null).invoke(signature, null)).getName();
                                                                try {
                                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.text.TextUtils.indexOf("", ""), objArr28);
                                                                    java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                    getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 13, 129 - android.os.Process.getGidForName(""), (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 57577), objArr29);
                                                                    cls9.getMethod((java.lang.String) objArr29[0], null).invoke(signature, null);
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
                                                        m27541 = util.h.xy.u.mc.f2436.m27541(signature, keyPair);
                                                    } catch (java.security.InvalidKeyException | java.security.cert.CertificateException | util.h.xy.ee.ra e) {
                                                        e.getMessage();
                                                        m27541 = util.h.xy.u.mc.f2436.m27541(getHighSpeedVideoFpsRangesFor(), keyPair);
                                                    }
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    getHighSpeedVideoSizes(30 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.MeasureSpec.getSize(0) + 142, (char) (1123 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), objArr30);
                                                    java.lang.Object[] objArr31 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr30[0]), 1);
                                                    objArr31[0] = m27541;
                                                    try {
                                                        java.lang.Object[] objArr32 = {invoke3, objArr31};
                                                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                        getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, objArr33);
                                                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr33[0]);
                                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                        getHighSpeedVideoSizes(23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34495), objArr34);
                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, (char) (14429 - android.text.TextUtils.indexOf("", "", 0, 0)), objArr35);
                                                        java.lang.Object newInstance2 = cls10.getDeclaredConstructor(java.lang.Class.forName((java.lang.String) objArr34[0]), java.lang.Class.forName((java.lang.String) objArr35[0])).newInstance(objArr32);
                                                        try {
                                                            java.lang.Object newInstance3 = java.lang.Class.forName(str).getDeclaredConstructor(java.lang.Integer.TYPE).newInstance(4);
                                                            try {
                                                                java.lang.Object[] objArr36 = {java.lang.Boolean.valueOf(z)};
                                                                java.lang.Class<?> cls11 = java.lang.Class.forName(str);
                                                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                getHighSpeedVideoFpsRangesFor("鏘鎫솋꺆\uf0dc첖꼖㳕坣㐔觘\uf709ᨽ笽䔚뉕\uddee빵ṓ些肙薭\udb6b\u09cf䑞죃钯쐙༝ఀ几鼵\uf2c4", android.view.View.combineMeasuredStates(0, 0), objArr37);
                                                                cls11.getMethod((java.lang.String) objArr37[0], java.lang.Boolean.TYPE).invoke(newInstance3, objArr36);
                                                                if (z) {
                                                                    i = util.h.xy.al.d.m25005();
                                                                    if (i == 0) {
                                                                        i = 60;
                                                                    }
                                                                    if (android.os.Build.VERSION.SDK_INT <= 29) {
                                                                        try {
                                                                            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i)};
                                                                            java.lang.Class<?> cls12 = java.lang.Class.forName(str);
                                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRangesFor("\ud9d0\ud9a3讆\uf412뫑阂ퟨ䐫ᵫ縙퍌迷倵\u3130ᾎ쪫韦\uf478䓇㙥쪑쾠臿焱๖苊츿볺䔉䘀୯\ue7da룑ᥨ㞻⊔\ufff1\udc80糟湑㊶韯뤛ꤕ癯櫪\ue642铽", android.view.View.combineMeasuredStates(0, 0), objArr39);
                                                                            cls12.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE).invoke(newInstance3, objArr38);
                                                                        } catch (java.lang.Throwable th3) {
                                                                            java.lang.Throwable cause3 = th3.getCause();
                                                                            if (cause3 == null) {
                                                                                throw th3;
                                                                            }
                                                                            throw cause3;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            java.lang.Object[] objArr40 = {java.lang.Integer.valueOf(i), 3};
                                                                            java.lang.Class<?> cls13 = java.lang.Class.forName(str);
                                                                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRangesFor("䥟䤬\u1a8b\ue4d5⯜蛅蔖ᛕ跤\uef14쎋\udd09삺ꀽཉ顕ݩ敵吀撛娞庭鄸⏏黙Ꮑ\udef8\uee1a햎휄ᮤ딤⡂術❺", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, objArr41);
                                                                            cls13.getMethod((java.lang.String) objArr41[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(newInstance3, objArr40);
                                                                        } catch (java.lang.Throwable th4) {
                                                                            java.lang.Throwable cause4 = th4.getCause();
                                                                            if (cause4 == null) {
                                                                                throw th4;
                                                                            }
                                                                            throw cause4;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i = 0;
                                                                }
                                                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                getHighResolutionOutputSizeshNQ4ISI((-1598041767) - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 67), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 93, android.graphics.Color.rgb(0, 0, 0) + 1836492552, objArr42);
                                                                try {
                                                                    java.lang.Object[] objArr43 = {new java.lang.String[]{((java.lang.String) objArr42[0]).intern()}};
                                                                    java.lang.Class<?> cls14 = java.lang.Class.forName(str);
                                                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                    getHighSpeedVideoFpsRangesFor("᪽ᫎ盧땊졤흚馹੫\ude6fಮ鈃솔錪䎂", android.view.ViewConfiguration.getWindowTouchSlop() >> 8, objArr44);
                                                                    cls14.getMethod((java.lang.String) objArr44[0], java.lang.String[].class).invoke(newInstance3, objArr43);
                                                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                    Camera2StreamConfigurationMap("\uffff\u0002\u0002\u0007\f\u0005￬\r￮", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 9, 6 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.MeasureSpec.getSize(0) + 239, false, objArr45);
                                                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                                                    Camera2StreamConfigurationMap("\n\r\r\u0012\u0017\u0010\ufff9\ufff4￬￼ￚ\ufff9", 12 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 7, 228 - android.graphics.Color.alpha(0), false, objArr46);
                                                                    try {
                                                                        java.lang.Object[] objArr47 = {new java.lang.String[]{((java.lang.String) objArr45[0]).intern(), ((java.lang.String) objArr46[0]).intern()}};
                                                                        java.lang.Class<?> cls15 = java.lang.Class.forName(str);
                                                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                                                        getHighSpeedVideoFpsRangesFor("혚황䄬樹灻ࠩ鄎˝ኼ뒵䵧줩忺ﮚ膤豇頬㻶\udae4炄앞ԗΐ㟟Ɓ", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr48);
                                                                        cls15.getMethod((java.lang.String) objArr48[0], java.lang.String[].class).invoke(newInstance3, objArr47);
                                                                        java.lang.Object[] objArr49 = new java.lang.Object[1];
                                                                        Camera2StreamConfigurationMap("�\r￫\n\u0005", 5 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 3 - android.graphics.Color.red(0), 210 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), false, objArr49);
                                                                        java.lang.String[] strArr = {((java.lang.String) objArr49[0]).intern()};
                                                                        try {
                                                                            java.lang.Class<?> cls16 = java.lang.Class.forName(str);
                                                                            java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                                            getHighSpeedVideoFpsRangesFor("⑴␇µ蛧㇢\ue4f7㰁꿄\ue0d5\uf528ꆥ搾궐먂浡⅂橼罞㘿\udd8b㜽䒉\uf304髄", android.view.KeyEvent.getDeadChar(0, 0), objArr50);
                                                                            cls16.getMethod((java.lang.String) objArr50[0], java.lang.String[].class).invoke(newInstance3, strArr);
                                                                            try {
                                                                                java.lang.Object[] objArr51 = {java.lang.Boolean.FALSE};
                                                                                java.lang.Class<?> cls17 = java.lang.Class.forName(str);
                                                                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                                                getHighSpeedVideoSizes(android.graphics.Color.alpha(0) + 31, 277 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (41176 - android.widget.ExpandableListView.getPackedPositionGroup(0L)), objArr52);
                                                                                cls17.getMethod((java.lang.String) objArr52[0], java.lang.Boolean.TYPE).invoke(newInstance3, objArr51);
                                                                                try {
                                                                                    java.lang.Class<?> cls18 = java.lang.Class.forName(str);
                                                                                    java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                                                    getHighSpeedVideoSizes(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 5, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 307, (char) (47883 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr53);
                                                                                    java.lang.Object invoke5 = cls18.getMethod((java.lang.String) objArr53[0], null).invoke(newInstance3, null);
                                                                                    java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                                                    Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, android.graphics.Color.blue(0) + 3, 217 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), false, objArr54);
                                                                                    try {
                                                                                        java.lang.Object[] objArr55 = {((java.lang.String) objArr54[0]).intern(), newInstance2, invoke5};
                                                                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                                                                        getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr56);
                                                                                        java.lang.Class<?> cls19 = java.lang.Class.forName((java.lang.String) objArr56[0]);
                                                                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                                        getHighSpeedVideoFpsRangesFor("蜛蝨\ue979臒\ud82e\ue3c2\ua7e6㐵䎽᳷Ꚍ\uffc1", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr57);
                                                                                        cls19.getMethod((java.lang.String) objArr57[0], java.lang.String.class, java.security.KeyStore.Entry.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr55);
                                                                                        if (i != 0) {
                                                                                            android.content.Context m24558 = util.h.xy.ag.a.m24556().m24558();
                                                                                            java.lang.Object[] objArr58 = new java.lang.Object[1];
                                                                                            Camera2StreamConfigurationMap("\uffff\ufffe￼�\u000b\u0002\u0000", 6 - android.widget.ExpandableListView.getPackedPositionChild(0L), android.graphics.ImageFormat.getBitsPerPixel(0) + 6, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, true, objArr58);
                                                                                            util.h.xy.av.ra.m25239(m24558, ((java.lang.String) objArr58[0]).intern(), java.lang.Integer.toString(i));
                                                                                        }
                                                                                        util.h.xy.t.mb.f2417.m27412();
                                                                                        getHighSpeedVideoFpsRanges();
                                                                                    } catch (java.lang.Throwable th5) {
                                                                                        java.lang.Throwable cause5 = th5.getCause();
                                                                                        if (cause5 == null) {
                                                                                            throw th5;
                                                                                        }
                                                                                        throw cause5;
                                                                                    }
                                                                                } catch (java.lang.Throwable th6) {
                                                                                    java.lang.Throwable cause6 = th6.getCause();
                                                                                    if (cause6 == null) {
                                                                                        throw th6;
                                                                                    }
                                                                                    throw cause6;
                                                                                }
                                                                            } catch (java.lang.Throwable th7) {
                                                                                java.lang.Throwable cause7 = th7.getCause();
                                                                                if (cause7 == null) {
                                                                                    throw th7;
                                                                                }
                                                                                throw cause7;
                                                                            }
                                                                        } catch (java.lang.Throwable th8) {
                                                                            java.lang.Throwable cause8 = th8.getCause();
                                                                            if (cause8 == null) {
                                                                                throw th8;
                                                                            }
                                                                            throw cause8;
                                                                        }
                                                                    } catch (java.lang.Throwable th9) {
                                                                        java.lang.Throwable cause9 = th9.getCause();
                                                                        if (cause9 == null) {
                                                                            throw th9;
                                                                        }
                                                                        throw cause9;
                                                                    }
                                                                } catch (java.lang.Throwable th10) {
                                                                    java.lang.Throwable cause10 = th10.getCause();
                                                                    if (cause10 == null) {
                                                                        throw th10;
                                                                    }
                                                                    throw cause10;
                                                                }
                                                            } catch (java.lang.Throwable th11) {
                                                                java.lang.Throwable cause11 = th11.getCause();
                                                                if (cause11 == null) {
                                                                    throw th11;
                                                                }
                                                                throw cause11;
                                                            }
                                                        } catch (java.lang.Throwable th12) {
                                                            java.lang.Throwable cause12 = th12.getCause();
                                                            if (cause12 == null) {
                                                                throw th12;
                                                            }
                                                            throw cause12;
                                                        }
                                                    } catch (java.lang.Throwable th13) {
                                                        java.lang.Throwable cause13 = th13.getCause();
                                                        if (cause13 == null) {
                                                            throw th13;
                                                        }
                                                        throw cause13;
                                                    }
                                                } catch (java.lang.Throwable th14) {
                                                    java.lang.Throwable cause14 = th14.getCause();
                                                    if (cause14 == null) {
                                                        throw th14;
                                                    }
                                                    throw cause14;
                                                }
                                            } catch (java.lang.Throwable th15) {
                                                java.lang.Throwable cause15 = th15.getCause();
                                                if (cause15 == null) {
                                                    throw th15;
                                                }
                                                throw cause15;
                                            }
                                        } catch (java.lang.Throwable th16) {
                                            java.lang.Throwable cause16 = th16.getCause();
                                            if (cause16 == null) {
                                                throw th16;
                                            }
                                            throw cause16;
                                        }
                                    } catch (java.lang.Throwable th17) {
                                        java.lang.Throwable cause17 = th17.getCause();
                                        if (cause17 == null) {
                                            throw th17;
                                        }
                                        throw cause17;
                                    }
                                } catch (java.lang.Throwable th18) {
                                    java.lang.Throwable cause18 = th18.getCause();
                                    if (cause18 == null) {
                                        throw th18;
                                    }
                                    throw cause18;
                                }
                            } catch (java.lang.Throwable th19) {
                                java.lang.Throwable cause19 = th19.getCause();
                                if (cause19 == null) {
                                    throw th19;
                                }
                                throw cause19;
                            }
                        } catch (java.lang.Throwable th20) {
                            java.lang.Throwable cause20 = th20.getCause();
                            if (cause20 == null) {
                                throw th20;
                            }
                            throw cause20;
                        }
                    } catch (java.lang.Throwable th21) {
                        java.lang.Throwable cause21 = th21.getCause();
                        if (cause21 == null) {
                            throw th21;
                        }
                        throw cause21;
                    }
                } catch (java.lang.Exception e2) {
                    try {
                        java.lang.Object[] objArr59 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 1598041760, (short) android.view.View.MeasureSpec.getSize(0), (byte) (android.widget.ExpandableListView.getPackedPositionType(0L) + 48), android.text.TextUtils.indexOf("", "", 0, 0) - 92, android.view.MotionEvent.axisFromString("") + 1819715337, objArr59);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr59[0]).intern(), util.h.xy.al.rc.m25022(e2));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        try {
                            java.lang.Object[] objArr60 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\u0018\r\u0012\u000bￄ￥\uffef\ufff7ￄ\u000f\t\u001d\ufff4\u0016\u0013\u0006\u0010\t\u0011ￄ\u0007\u0016\t\u0005", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 24, 12 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, false, objArr60);
                            sb.append(((java.lang.String) objArr60[0]).intern());
                            sb.append(e2.getMessage());
                            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(sb.toString(), e2);
                        } catch (java.lang.Throwable th22) {
                            java.lang.Throwable cause22 = th22.getCause();
                            if (cause22 == null) {
                                throw th22;
                            }
                            throw cause22;
                        }
                    } catch (java.lang.Throwable th23) {
                        java.lang.Throwable cause23 = th23.getCause();
                        if (cause23 == null) {
                            throw th23;
                        }
                        throw cause23;
                    }
                }
            } catch (java.lang.Throwable th24) {
                getHighSpeedVideoFpsRanges();
                throw th24;
            }
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getOutputStallDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 47) % 128;
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 35) % 128;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 13) % 128;
            byte[] bArr = getOutputStallDurationlomOqCM;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i4 = (byte) (((byte) (getOutputStallDurationlomOqCM[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getOutputSizeshNQ4ISI[((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputStallDurationlomOqCM;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                loop1: while (true) {
                    int i7 = 0;
                    while (i7 < length2) {
                        int i8 = getHighSpeedVideoSizes + 17;
                        getHighSpeedVideoFpsRanges = i8 % 128;
                        if (i8 % 2 == 0) {
                            break;
                        }
                        bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                        i7++;
                    }
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                if (z) {
                    byte[] bArr5 = getOutputStallDurationlomOqCM;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        java.lang.String obj = sb.toString();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 9) % 128;
        objArr[0] = obj;
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m27485(byte[] bArr) {
        byte[] bArr2;
        synchronized (this) {
            int i = getHighSpeedVideoSizesFor + 31;
            getInputSizeshNQ4ISI = i % 128;
            bArr2 = null;
            try {
                try {
                } catch (java.lang.Throwable th) {
                    getHighSpeedVideoFpsRanges();
                    throw th;
                }
            } catch (java.lang.Exception e) {
                e.getMessage();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(((byte) android.view.KeyEvent.getModifierMetaStateMask()) - 1598041755, (short) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((-38) - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) - 92, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1819715337, objArr);
                util.h.xy.am.ma.m25029(((java.lang.String) objArr[0]).intern(), util.h.xy.al.rc.m25022(e));
                getHighSpeedVideoFpsRanges();
            }
            if (i % 2 != 0) {
                java.security.Signature inputFormats = getInputFormats();
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("牆爳捪㍚刨党庢쵕뛺雵", android.text.TextUtils.indexOf("", "", 0, 0), objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], byte[].class).invoke(inputFormats, bArr);
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 15) % 128;
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("柚枩烏뵑䆔\udf52볟⼧", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                        byte[] bArr3 = (byte[]) cls2.getMethod((java.lang.String) objArr5[0], null).invoke(inputFormats, null);
                        getHighSpeedVideoFpsRanges();
                        bArr2 = bArr3;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } else {
                getInputFormats();
                throw new java.lang.ArithmeticException();
            }
        }
        return bArr2;
    }

    @util.h.xy.a.a
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final util.h.xy.u.ma m27487(boolean z, com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType) {
        util.h.xy.u.ma maVar;
        synchronized (this) {
            maVar = new util.h.xy.u.ma();
            int i = 1;
            try {
                try {
                    try {
                        java.security.Signature inputFormats = getInputFormats();
                        maVar.m27529(inputFormats);
                        if (inputFormats == null) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI((-1598041751) - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (byte) ((-113) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 92, android.graphics.Color.rgb(0, 0, 0) + 1836492544, objArr);
                            maVar.m27527(((java.lang.String) objArr[0]).intern());
                            maVar.m27531(util.h.xy.aa.d.f63);
                        } else {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 101) % 128;
                            maVar.m27531(util.h.xy.aa.d.f65);
                            i = (getHighSpeedVideoSizesFor + 119) % 128;
                            getInputSizeshNQ4ISI = i;
                        }
                    } catch (android.security.keystore.KeyPermanentlyInvalidatedException e) {
                        maVar.m27527(e.getMessage());
                        maVar.m27531(util.h.xy.aa.d.f64);
                    } catch (java.lang.Exception e2) {
                        e2.getMessage();
                        java.lang.Object[] objArr2 = new java.lang.Object[i];
                        getHighResolutionOutputSizeshNQ4ISI((-1598041703) - android.graphics.Color.green(0), (short) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) - 90), (-92) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1819715335, objArr2);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.al.rc.m25022(e2));
                        maVar.m27527(e2.getMessage());
                        maVar.m27531(util.h.xy.aa.d.f63);
                    }
                } catch (android.security.keystore.UserNotAuthenticatedException e3) {
                    maVar.m27527(e3.getMessage());
                    maVar.m27531(util.h.xy.aa.d.f62);
                } catch (java.security.KeyStoreException e4) {
                    e = e4;
                    maVar.m27527(e.getMessage());
                    maVar.m27531(util.h.xy.aa.d.f66);
                } catch (java.security.UnrecoverableKeyException e5) {
                    e = e5;
                    maVar.m27527(e.getMessage());
                    maVar.m27531(util.h.xy.aa.d.f66);
                }
                getHighSpeedVideoFpsRanges();
                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 113) % 128;
            } catch (java.lang.Throwable th) {
                getHighSpeedVideoFpsRanges();
                throw th;
            }
        }
        return maVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m27484() {
        int i;
        synchronized (this) {
            try {
                int argb = android.graphics.Color.argb(0, 0, 0, 0);
                int i2 = getInputSizeshNQ4ISI;
                getHighSpeedVideoSizesFor = (i2 + 13) % 128;
                getHighSpeedVideoSizesFor = (i2 + 1) % 128;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ", argb + 15, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 15, android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, true, objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 101) % 128;
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.view.KeyEvent.normalizeMetaState(0), objArr2);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 935), objArr3);
                        java.lang.Object invoke = cls.getMethod((java.lang.String) objArr3[0], java.lang.String.class).invoke(null, intern);
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.text.TextUtils.getTrimmedLength(""), objArr4);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("軯躃ᵾᒫⰣ皮㌏ꃽ", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, objArr5);
                            cls2.getMethod((java.lang.String) objArr5[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                            int red = android.graphics.Color.red(0);
                            float length = android.graphics.PointF.length(0.0f, 0.0f);
                            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 51) % 128;
                            try {
                                java.lang.Object[] objArr6 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", red + 10, (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)) + 3, 216 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), false, objArr6);
                                java.lang.String intern2 = ((java.lang.String) objArr6[0]).intern();
                                getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 29) % 128;
                                try {
                                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.graphics.Color.green(0), objArr7);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(13 - android.text.TextUtils.getTrimmedLength(""), 312 - android.graphics.Color.green(0), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 44262), objArr8);
                                    if (((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class).invoke(invoke, intern2)).booleanValue()) {
                                        int i3 = getHighSpeedVideoSizesFor;
                                        int i4 = i3 + 47;
                                        getInputSizeshNQ4ISI = i4 % 128;
                                        int i5 = i4 % 2;
                                        getInputSizeshNQ4ISI = (i3 + 69) % 128;
                                        try {
                                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", 10 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, false, objArr9);
                                            try {
                                                java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, objArr11);
                                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr11[0]);
                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes(11 - android.view.View.MeasureSpec.getSize(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 326, (char) (android.os.Process.myTid() >> 22), objArr12);
                                                cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class).invoke(invoke, objArr10);
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
                                    }
                                    i = getHighSpeedVideoSizesFor + 57;
                                    getInputSizeshNQ4ISI = i % 128;
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
                    } catch (java.lang.Throwable th6) {
                        java.lang.Throwable cause6 = th6.getCause();
                        if (cause6 != null) {
                            throw cause6;
                        }
                        throw th6;
                    }
                } catch (java.lang.Throwable th7) {
                    java.lang.Throwable cause7 = th7.getCause();
                    if (cause7 != null) {
                        throw cause7;
                    }
                    throw th7;
                }
            } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
                return false;
            }
        }
        return i % 2 != 0;
    }

    private java.security.Signature getInputFormats() throws java.security.KeyStoreException, java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.io.IOException, java.security.UnrecoverableEntryException, java.security.InvalidKeyException {
        java.security.Signature signature;
        byte[] m26904;
        synchronized (this) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
            java.lang.String str = (java.lang.String) objArr[0];
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 15, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 15, 242 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), true, objArr2);
                java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", (-1) - android.graphics.ImageFormat.getBitsPerPixel(0), objArr4);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoSizes(12 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (935 - android.text.TextUtils.getOffsetAfter("", 0)), objArr5);
                java.lang.Object invoke = cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(null, objArr3);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.text.TextUtils.indexOf("", ""), objArr6);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr6[0]);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("軯躃ᵾᒫⰣ皮㌏ꃽ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr7);
                cls2.getMethod((java.lang.String) objArr7[0], java.security.KeyStore.LoadStoreParameter.class).invoke(invoke, null);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10, android.view.View.getDefaultSize(0, 0) + 3, 217 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), false, objArr8);
                java.lang.Object[] objArr9 = {((java.lang.String) objArr8[0]).intern()};
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr10);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                getHighSpeedVideoSizes(13 - (android.view.KeyEvent.getMaxKeyCode() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 313, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 44262), objArr11);
                if (!((java.lang.Boolean) cls3.getMethod((java.lang.String) objArr11[0], java.lang.String.class).invoke(invoke, objArr9)).booleanValue() && (m26904 = util.h.xy.j.ma.f2241.m26904()) != null && m26904.length > 0) {
                    com.gemalto.mfs.mwsdk.payment.CHVerificationMethod m25037 = util.h.xy.ap.mb.m25037(m26904);
                    try {
                        if (util.h.xy.t.mb.f2417.m27461() != null && util.h.xy.t.mb.f2417.m27461().length > 0) {
                            if ((m25037 != null && m25037 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS) || m25037 == com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD) {
                                m27486(true);
                            } else {
                                m27486(false);
                            }
                        } else {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("ￃ\u0017\u0012\u0011\u0011\u0004\u0006ￃ\b\u0015\u0012\u0017\u0016\u001c\b￮ￄ\u0017\b\u000f\u000f\u0004\u001aￃ\b\u000b\u0017ￃ\u000f\u000f\u0012\u0015\u0011\b\uffd0\b\u0015ￃ\b\u0016\u0004\b\u000f\ufff3ￃ\uffd1\u0007\b\u0015\b\u0019\u0012\u0006\b\u0015ￃ\b\u0005", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 57, android.graphics.Color.alpha(0) + 16, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, true, objArr12);
                            throw new android.security.keystore.KeyPermanentlyInvalidatedException(((java.lang.String) objArr12[0]).intern());
                        }
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        e.getMessage();
                        e.getMessage();
                    }
                }
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10, 3 - android.graphics.Color.red(0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, false, objArr13);
                java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern(), null};
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.view.KeyEvent.getDeadChar(0, 0), objArr15);
                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("☁♦鏊⛚ꊝ䓊覛ᩈ\ue2a7晄Ƅ톼", android.text.TextUtils.getOffsetAfter("", 0), objArr16);
                java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr16[0], java.lang.String.class, java.security.KeyStore.ProtectionParameter.class).invoke(invoke, objArr14);
                java.lang.Object[] objArr17 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr17);
                if (!java.lang.Class.forName((java.lang.String) objArr17[0]).isInstance(invoke2)) {
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0006\uffbf\n\u0004\u0018\uffef\u0011\u000e\u0001\u000b\u0004\f\uffbf\b\r\uffbf\u0011\u0004\u0013\u0011\b\u0004\u0015\b\r", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 26, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 6, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, false, objArr18);
                    throw new java.security.KeyStoreException(((java.lang.String) objArr18[0]).intern());
                }
                try {
                } catch (java.security.NoSuchAlgorithmException unused) {
                    signature = null;
                }
                try {
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.widget.ExpandableListView.getPackedPositionGroup(0L) - 1598041781, (short) (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) (android.graphics.Color.blue(0) - 95), android.widget.ExpandableListView.getPackedPositionChild(0L) - 91, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1819715336, objArr19);
                    try {
                        java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                        java.lang.Class<?> cls5 = java.lang.Class.forName(str);
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.os.Process.getGidForName("") + 12, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (935 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr21);
                        signature = (java.security.Signature) cls5.getMethod((java.lang.String) objArr21[0], java.lang.String.class).invoke(null, objArr20);
                        try {
                            if (signature != null) {
                                try {
                                    java.lang.Class<?> cls6 = java.lang.Class.forName(str);
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("丽乚놇㗝胐埍⫐뤖誇䐒ኇ狧쟉ଠ\ude5b", (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr22);
                                    cls6.getMethod((java.lang.String) objArr22[0], null).invoke(signature, null);
                                    try {
                                        java.lang.Class<?> cls7 = java.lang.Class.forName(str);
                                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                                        getHighSpeedVideoSizes(12 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 130 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (57578 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)), objArr23);
                                        cls7.getMethod((java.lang.String) objArr23[0], null).invoke(signature, null);
                                        try {
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", 1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr24);
                                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            getHighSpeedVideoSizes(13 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.graphics.Color.alpha(0) + 336, (char) (49065 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr25);
                                            try {
                                                java.lang.Object[] objArr26 = {cls8.getMethod((java.lang.String) objArr25[0], null).invoke(invoke2, null)};
                                                java.lang.Class<?> cls9 = java.lang.Class.forName(str);
                                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRangesFor("┤╍抧\uef87叻越ꕜ㚾\ue1bf霴죌ﵬ", 1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr27);
                                                java.lang.String str2 = (java.lang.String) objArr27[0];
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                getHighSpeedVideoSizes(23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 172 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (34496 - android.text.TextUtils.indexOf("", "")), objArr28);
                                                cls9.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr28[0])).invoke(signature, objArr26);
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
                            } else {
                                signature = getHighSpeedVideoFpsRangesFor();
                                if (signature == null) {
                                    throw new java.security.NoSuchAlgorithmException();
                                }
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1, objArr29);
                                java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.view.MotionEvent.axisFromString("") + 14, 336 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 49065), objArr30);
                                java.lang.Object[] objArr31 = {cls10.getMethod((java.lang.String) objArr30[0], null).invoke(invoke2, null)};
                                java.lang.Class<?> cls11 = java.lang.Class.forName(str);
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("┤╍抧\uef87叻越ꕜ㚾\ue1bf霴죌ﵬ", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr32);
                                java.lang.String str3 = (java.lang.String) objArr32[0];
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, 172 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.graphics.Color.blue(0) + 34496), objArr33);
                                cls11.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr33[0])).invoke(signature, objArr31);
                            }
                        } catch (java.security.InvalidKeyException e2) {
                            if (e2.getMessage() != null) {
                                java.lang.String message = e2.getMessage();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(android.view.KeyEvent.getDeadChar(0, 0) - 1598041697, (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-8) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), android.view.MotionEvent.axisFromString("") - 91, 1819715338 - android.graphics.Color.argb(0, 0, 0, 0), objArr34);
                                if (message.equalsIgnoreCase(((java.lang.String) objArr34[0]).intern())) {
                                    e2.getMessage();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", android.widget.ExpandableListView.getPackedPositionType(0L), objArr35);
                                    java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr35[0]);
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(13 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 336, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49065), objArr36);
                                    java.lang.Object[] objArr37 = {cls12.getMethod((java.lang.String) objArr36[0], null).invoke(invoke2, null)};
                                    java.lang.Class<?> cls13 = java.lang.Class.forName(str);
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("┤╍抧\uef87叻越ꕜ㚾\ue1bf霴죌ﵬ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr38);
                                    java.lang.String str4 = (java.lang.String) objArr38[0];
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes(25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) (34495 - android.view.MotionEvent.axisFromString("")), objArr39);
                                    cls13.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr39[0])).invoke(signature, objArr37);
                                }
                            }
                            e2.getMessage();
                            signature = getHighSpeedVideoFpsRangesFor();
                            java.lang.Object[] objArr352 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("荞茴獎尰䈝㸢㊨ꅟ䞸蛇筹檕\u0abb짾랭⿺쵿೪\uecc7팣逇㝏⧀鑱哄稱晘妆ᾜ뻅ꍒʏ\ue252\ue181龧쟃ꕧ⑹퓺謊栤漍", android.widget.ExpandableListView.getPackedPositionType(0L), objArr352);
                            java.lang.Class<?> cls122 = java.lang.Class.forName((java.lang.String) objArr352[0]);
                            java.lang.Object[] objArr362 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(13 - android.view.KeyEvent.getDeadChar(0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + 336, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 49065), objArr362);
                            java.lang.Object[] objArr372 = {cls122.getMethod((java.lang.String) objArr362[0], null).invoke(invoke2, null)};
                            java.lang.Class<?> cls132 = java.lang.Class.forName(str);
                            java.lang.Object[] objArr382 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor("┤╍抧\uef87叻越ꕜ㚾\ue1bf霴죌ﵬ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr382);
                            java.lang.String str42 = (java.lang.String) objArr382[0];
                            java.lang.Object[] objArr392 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(25 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, (char) (34495 - android.view.MotionEvent.axisFromString("")), objArr392);
                            cls132.getMethod(str42, java.lang.Class.forName((java.lang.String) objArr392[0])).invoke(signature, objArr372);
                        }
                    } catch (java.lang.Throwable th5) {
                        java.lang.Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause6 = th6.getCause();
                    if (cause6 != null) {
                        throw cause6;
                    }
                    throw th6;
                }
            } catch (java.lang.Throwable th7) {
                java.lang.Throwable cause7 = th7.getCause();
                if (cause7 != null) {
                    throw cause7;
                }
                throw th7;
            }
        }
        return signature;
    }

    private java.security.Signature getHighSpeedVideoFpsRangesFor() throws java.security.NoSuchAlgorithmException {
        java.security.Signature signature;
        synchronized (this) {
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 79) % 128;
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-1598041781) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) android.view.KeyEvent.getDeadChar(0, 0), (byte) ((-95) - android.text.TextUtils.getTrimmedLength("")), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 93, 1819715336 - android.view.View.combineMeasuredStates(0, 0), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\uffde\uffdd\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ\uffff\t\u0010\n\r￼\u0006\r\n\ufff2", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 27, 17 - android.view.View.getDefaultSize(0, 0), 243 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), true, objArr2);
                try {
                    java.lang.Object[] objArr3 = {intern, ((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.ViewConfiguration.getJumpTapTimeout() >> 16, objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 11, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1, (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 935), objArr5);
                    signature = (java.security.Signature) cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class, java.lang.String.class).invoke(null, objArr3);
                    getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 17) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (java.security.NoSuchProviderException unused) {
                if (this.getValidOutputFormatsForInputhNQ4ISI != null) {
                    getHighSpeedVideoFpsRanges();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\uffc1\u0007\u0002\n\r\u0006\u0005\uffe7\u0002\r\r\u0003\u0002\u0004\f", 15 - android.view.View.MeasureSpec.getMode(0), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 236, false, objArr6);
                    throw new java.security.NoSuchAlgorithmException(((java.lang.String) objArr6[0]).intern());
                }
                java.security.Provider[] providers = java.security.Security.getProviders();
                java.security.Provider provider = providers[0];
                this.getValidOutputFormatsForInputhNQ4ISI = provider;
                provider.getName();
                java.security.Security.removeProvider(providers[0].getName());
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1598041782, (short) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 96), (-93) - android.view.MotionEvent.axisFromString(""), android.view.KeyEvent.keyCodeFromString("") + 1819715336, objArr7);
                java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
                int i = getInputSizeshNQ4ISI;
                getHighSpeedVideoSizesFor = (i + 63) % 128;
                getHighSpeedVideoSizesFor = (i + 19) % 128;
                try {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.text.TextUtils.getCapsMode("", 0, 0), objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(';' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (935 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr9);
                    signature = (java.security.Signature) cls2.getMethod((java.lang.String) objArr9[0], java.lang.String.class).invoke(null, intern2);
                    if (signature != null) {
                        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 3) % 128;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10);
                        java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("丽乚놇㗝胐埍⫐뤖誇䐒ኇ狧쟉ଠ\ude5b", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
                        ((java.security.Provider) cls3.getMethod((java.lang.String) objArr11[0], null).invoke(signature, null)).getName();
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 111) % 128;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr12);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(12 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 129 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (57577 - android.graphics.ImageFormat.getBitsPerPixel(0)), objArr13);
                        cls4.getMethod((java.lang.String) objArr13[0], null).invoke(signature, null);
                    }
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            int i2 = getInputSizeshNQ4ISI + 59;
            getHighSpeedVideoSizesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }
        return signature;
    }

    private void getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoSizesFor;
        getInputSizeshNQ4ISI = (i + 7) % 128;
        java.security.Provider provider = this.getValidOutputFormatsForInputhNQ4ISI;
        if (provider != null) {
            getInputSizeshNQ4ISI = (i + 93) % 128;
            provider.getName();
            java.security.Security.insertProviderAt(this.getValidOutputFormatsForInputhNQ4ISI, 1);
            this.getValidOutputFormatsForInputhNQ4ISI = null;
        }
        getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 21) % 128;
    }

    @util.h.xy.a.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27483(byte[] bArr, util.h.xy.u.ma maVar, boolean z) throws util.h.xy.ab.a {
        synchronized (this) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-1598041675) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (android.text.TextUtils.getCapsMode("", 0, 0) + 110), (-91) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.view.View.MeasureSpec.getSize(0) + 1819715318, objArr);
                util.h.xy.am.ma.m25030(((java.lang.String) objArr[0]).intern(), bArr);
                java.security.Signature m27526 = maVar.m27526();
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[0]);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("牆爳捪㍚刨党庢쵕뛺雵", android.view.ViewConfiguration.getFadingEdgeLength() >> 16, objArr3);
                    cls.getMethod((java.lang.String) objArr3[0], byte[].class).invoke(m27526, bArr);
                    try {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("붳뷙\ue4d8鹛햋ﱉ機令祕ᅑ뤒㉢㑖幨痆眍\uf392魼⺴诘껴ꃤ\uebbe첝樮\uedb0ꑲ", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr4);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr4[0]);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("柚枩烏뵑䆔\udf52볟⼧", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr5);
                        byte[] bArr2 = (byte[]) cls2.getMethod((java.lang.String) objArr5[0], null).invoke(m27526, null);
                        util.h.xy.ar.b.m25074(bArr2);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("\u0000\ufff7\u0001\t", android.widget.ExpandableListView.getPackedPositionChild(0L) + 5, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 215 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), false, objArr6);
                        util.h.xy.am.ma.m25030(((java.lang.String) objArr6[0]).intern(), bArr2);
                        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 45) % 128;
                        byte[] m27054 = util.h.xy.q.b.m27054(bArr2);
                        if (z) {
                            int i = getHighSpeedVideoSizesFor + 55;
                            getInputSizeshNQ4ISI = i % 128;
                            if (i % 2 == 0) {
                                util.h.xy.v.b.f2439.m27575(m27054);
                                throw new java.lang.ArithmeticException();
                            }
                            util.h.xy.v.b.f2439.m27575(m27054);
                        } else {
                            util.h.xy.v.b.f2439.m27642(m27054);
                        }
                        util.h.xy.ar.b.m25100(bArr2, m27054);
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
            } catch (java.lang.Exception e) {
                e.getMessage();
                try {
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\b\u0007\ufffb￼\ufffe", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 5, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, true, objArr7);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr7[0]).intern(), util.h.xy.al.rc.m25022(e));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 1598041669, (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 32), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 91, android.graphics.Color.alpha(0) + 1819715322, objArr8);
                    throw new util.h.xy.ab.a(((java.lang.String) objArr8[0]).intern(), e);
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
    }

    private java.security.KeyStore getHighSpeedVideoSizes() {
        java.security.KeyStore keyStore;
        java.security.KeyStore keyStore2;
        synchronized (this) {
            int i = (getInputSizeshNQ4ISI + 35) % 128;
            getHighSpeedVideoSizesFor = i;
            getInputSizeshNQ4ISI = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            keyStore = null;
            try {
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ", 15 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), android.view.View.MeasureSpec.getMode(0) + 15, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 241, true, objArr);
                    try {
                        java.lang.Object[] objArr2 = {((java.lang.String) objArr[0]).intern()};
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", '0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr3[0]);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(11 - android.text.TextUtils.indexOf("", "", 0, 0), (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 935), objArr4);
                        keyStore2 = (java.security.KeyStore) cls.getMethod((java.lang.String) objArr4[0], java.lang.String.class).invoke(null, objArr2);
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
            } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused) {
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.view.KeyEvent.keyCodeFromString(""), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr5[0]);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("軯躃ᵾᒫⰣ皮㌏ꃽ", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, objArr6);
                cls2.getMethod((java.lang.String) objArr6[0], java.security.KeyStore.LoadStoreParameter.class).invoke(keyStore2, null);
                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 37) % 128;
                keyStore = keyStore2;
            } catch (java.lang.Throwable th3) {
                try {
                    java.lang.Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                } catch (java.io.IOException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException unused2) {
                }
            }
        }
        return keyStore;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27482(android.content.Context context) {
        getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 41) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\uffff\ufffe￼�\u000b\u0002\u0000", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, android.text.TextUtils.getOffsetBefore("", 0) + 5, 245 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr);
            java.lang.String m25230 = util.h.xy.av.ra.m25230(context, ((java.lang.String) objArr[0]).intern());
            if (m25230 != null) {
                return java.lang.Integer.parseInt(m25230);
            }
        } catch (java.lang.NumberFormatException e) {
            e.getMessage();
        }
        java.security.KeyStore highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 33) % 128;
            return -1;
        }
        try {
            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
            getHighSpeedVideoSizesFor = (getInputSizeshNQ4ISI + 25) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", packedPositionType + 10, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 3, 217 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), false, objArr2);
                try {
                    java.lang.Object[] objArr3 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(13 - android.view.View.resolveSizeAndState(0, 0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 313, (char) (44262 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), objArr5);
                    if (!((java.lang.Boolean) cls.getMethod((java.lang.String) objArr5[0], java.lang.String.class).invoke(highSpeedVideoSizes, objArr3)).booleanValue()) {
                        return -1;
                    }
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("�\ufff5\u0007\u0001\ufff5\u000b\uffff\u0013\ufff5\u0000", 10 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 4 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 217 - android.view.View.resolveSizeAndState(0, 0, 0), false, objArr6);
                    java.lang.String intern = ((java.lang.String) objArr6[0]).intern();
                    getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 31) % 128;
                    try {
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("质赂櫵䥐宦⭂齗ಠ䧎齼渙읪Ӎ큅ꋍ舅쌉ᕑ獵络鹱\u2ef4㲠㦎媲掊", android.graphics.Color.red(0), objArr7);
                        java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr7[0]);
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor("ŉĮ⍪ᔜሽ県圳쓮엤훩", android.graphics.Color.rgb(0, 0, 0) + 16777216, objArr8);
                        java.lang.Object invoke = cls2.getMethod((java.lang.String) objArr8[0], java.lang.String.class, char[].class).invoke(highSpeedVideoSizes, intern, null);
                        try {
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(24 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 173 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.text.TextUtils.getCapsMode("", 0, 0) + 34496), objArr9);
                            java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.text.TextUtils.getOffsetAfter("", 0) + 12, 129 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (57578 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr10);
                            java.lang.Object invoke2 = cls3.getMethod((java.lang.String) objArr10[0], null).invoke(invoke, null);
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("\u0000\r\n\u000f￮\u0014\u0000￦\uffff\u0004\n\r\uffff\tￜ", android.view.KeyEvent.getDeadChar(0, 0) + 15, 15 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, true, objArr11);
                            try {
                                java.lang.Object[] objArr12 = {invoke2, ((java.lang.String) objArr11[0]).intern()};
                                java.lang.Object[] objArr13 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor("桄栮ޭス㛾劫\udb7c䢋겢\uf224៰荁\ue1a1봝\udb24옮♥砉聎㫷笝䎹䕜綩뿘໘ઇ끻", android.text.TextUtils.getOffsetBefore("", 0), objArr13);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.view.KeyEvent.getDeadChar(0, 0) + 11, android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, (char) (936 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr14);
                                java.lang.Object invoke3 = cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class, java.lang.String.class).invoke(null, objArr12);
                                getInputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 9) % 128;
                                try {
                                    java.lang.Object[] objArr15 = {invoke, android.security.keystore.KeyInfo.class};
                                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("桄栮ޭス㛾劫\udb7c䢋겢\uf224៰荁\ue1a1봝\udb24옮♥砉聎㫷笝䎹䕜綩뿘໘ઇ끻", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr16);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 10, (android.os.Process.myTid() >> 22) + 349, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27199), objArr17);
                                    java.lang.String str = (java.lang.String) objArr17[0];
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    getHighSpeedVideoFpsRangesFor("䃪䂀꽠\uda77鸳롥昗\uf5e0萌嫩﴾㸪줏ᗐ\u31ea筅໋탄檀螜厳", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr18);
                                    android.security.keystore.KeyInfo keyInfo = (android.security.keystore.KeyInfo) cls5.getMethod(str, java.lang.Class.forName((java.lang.String) objArr18[0]), java.lang.Class.class).invoke(invoke3, objArr15);
                                    if (!keyInfo.isUserAuthenticationRequired()) {
                                        return -1;
                                    }
                                    int userAuthenticationValidityDurationSeconds = keyInfo.getUserAuthenticationValidityDurationSeconds();
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("\uffff\ufffe￼�\u000b\u0002\u0000", android.graphics.Color.rgb(0, 0, 0) + 16777223, 4 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 197, true, objArr19);
                                    util.h.xy.av.ra.m25239(context, ((java.lang.String) objArr19[0]).intern(), java.lang.Integer.toString(userAuthenticationValidityDurationSeconds));
                                    return userAuthenticationValidityDurationSeconds;
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
            } catch (java.lang.Throwable th6) {
                java.lang.Throwable cause6 = th6.getCause();
                if (cause6 != null) {
                    throw cause6;
                }
                throw th6;
            }
        } catch (java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.NoSuchProviderException | java.security.UnrecoverableEntryException | java.security.spec.InvalidKeySpecException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputFormats = -413831349649028838L;
        getOutputFormats = new char[]{40897, 33018, 41376, 49732, 58156, 968, 9348, 17736, 26112, 34500, 43001, 23546, 17608, 26004, 1626, 10074, 51198, 57507, 33148, 41517, 17123, 25539, 3223, 11589, 52827, 61181, 36791, 43109, 18746, 27068, 2811, 11183, 54398, 62757, 38327, 46733, 22383, 28729, 4348, 12744, 53888, 62298, 39996, 48341, 23984, 32337, 7979, 16369, 55502, 19276, 21623, 30007, 5861, 14269, 55127, 61449, 37313, 45747, 21080, 29560, 7214, 15846, 57018, 65104, 14219, 10425, 2533, 27179, 19243, 43919, 36050, 60685, 52828, 11922, 4018, 24806, 16692, 41514, 33420, 58310, 50196, 9547, 1485, 26257, 18416, 47157, 39252, 63886, 56028, 15123, 40043, 33625, 41477, 49611, 57547, 'o', 10034, 18157, 26044, 34162, 42066, 51974, 60116, 2506, 10580, 18483, 28648, 36504, 44642, 52563, 60423, 5099, 12930, 21104, 28988, 37090, 47018, 55158, 63058, 5382, 53308, 52999, 60999, 36283, 44250, 19519, 27485, 2741, 10746, 51496, 31884, 25527, 17133, 8449, 'c', 57489, 51154, 42518, 34122, 26014, 17593, 11253, 38920, 34618, 42598, 50600, 58536, 1036, 9041, 17038, 25055, 33041, 41009, 53093, 61111, 3497, 11551, 19536, 27520, 35551, 43598, 51482, 59507, 6077, 14064, 22036, 30044, 38042, 46027, 54016, 61994, 4466, 6827, 1433, 9413, 18187, 26123, 34479, 41458, 49197, 58236, 946, 8850, 19910, 27668, 36618, 44943, 52964, 59704, 2174, 10402, 19342, 27344, 38183, 46146, 54439, 41991, 47913, 39492, 63894, 55502, 14368, 7972, 32416, 24049, 48446, 39955, 62301, 53913, 12749, 4411, 28709, 22447, 46832, 38444, 62739, 54278, 11186, 2783, 27185, 18800, 43172, 36848, 61238, 52739, 11592, 3206, 25566, 17223, 40032, 33622, 41495, 49624, 57482, kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 10035, 18080, 26042, 34149, 42072, 51975, 60127, 2445, 10603, 18479, 28607, 36515, 44646, 52547, 60422, 5080, 12936, 21100, 28988, 37054, 46976, 55143, 63044, 5412, 13533, 23433, 31573, 39485, 47600, 55486, 63596, 8019, 15897, 23946, 31915, 40021, 33586, 41726, 49577, 57697, io.ktor.util.date.GMTDateParser.MONTH, 15530, 9093, 735, 24864, 16476, 41130, 34795, 58937, 50556, 9649, 1177, 27599, 18961, 43385, 35241, 59629, 53051, 11881, 3755, 28054, 19652, 45851, 37457, 62100, 53732, 12345, 5990, 30643, 22167, 46537, 37907, 10088, 14406, 6417, 31437, 23434, 12420, 12209, 3835, 27960, 19554, 44179, 35807, 59931, 51566, 10634, 2228, 26613, 17976, 40037, 33629, 41503, 49615, 57489, 'y', 10002, 18144, 26045, 34162, 42050, 9166, 15605, 7599, 32338, 24383, 49117, 39049, 63815, 55829, 15053, 7128, 29887, 21884, 63014, 59677, 51271, 43937, 35520, 27173, 19780, 11454, 4076, 61219};
        getOutputMinFrameDurationlomOqCM = 8854005315414491960L;
    }

    static void Camera2StreamConfigurationMap() {
        getOutputStallDuration = -1231763941;
        getHighSpeedVideoFpsRangesFor = -1193199251;
        getHighResolutionOutputSizeshNQ4ISI = -408873085;
        Camera2StreamConfigurationMap = 1948798611;
        getOutputStallDurationlomOqCM = new byte[]{106, -105, 120, -109, -115, 114, -117, 56, 120, 122, -120, Byte.MIN_VALUE, -116, 116, 100, 102, com.visa.cbp.getEncExpo.IResultReceiver2, -119, -100, -112, 114, 18, com.google.common.base.Ascii.FS, -2, 6, 114, -1, 0, -4, -12, 13, -91, -85, 87, 69, -91, 81, -88, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, 5, -19, -85, -94, 2, -19, -89, 69, -71, 91, -95, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -88, 17, -25, -83, 2, -19, -81, 92, 87, -91, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 99, -80, -98, 85, -85, 86, 123, 115, -19, -91, 85, -83, com.visa.cbp.getEncExpo.IResultReceiver, -116, 66, 76, 115, 123, -127, Byte.MIN_VALUE, -120, Byte.MAX_VALUE, 99, -33, -47, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -34, -38, -43, 38, 41, -35, -44, -33, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 97, -116, 37, 33, 110, -114, 45, -46, 62, 114, 74, -69, 64, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.US, -53, -59, 57, 43, -53, 63, -58, 46, com.google.common.base.Ascii.VT, -25, -42, 57, 10, -127, -63, kotlin.io.encoding.Base64.padSymbol, -51, 43, -60, -53, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 123, -125, -63, 59, 57, -55, 111, -106, 59, -59, 56, com.google.common.base.Ascii.NAK};
    }
}
