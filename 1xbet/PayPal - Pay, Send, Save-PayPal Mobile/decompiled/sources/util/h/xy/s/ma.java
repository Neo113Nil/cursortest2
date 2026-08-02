package util.h.xy.s;

/* loaded from: classes5.dex */
public class ma {
    private static char[] Camera2StreamConfigurationMap = null;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static long getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;

    /* renamed from: ʳ, reason: contains not printable characters */
    public static java.lang.String f2339;

    /* renamed from: ʴ, reason: contains not printable characters */
    public static java.lang.String f2340;

    /* renamed from: ʹ, reason: contains not printable characters */
    public static java.lang.String f2341;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static java.lang.String f2342;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static java.lang.String f2343;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static java.lang.String f2344;

    /* renamed from: ˇ, reason: contains not printable characters */
    public static java.lang.String f2345;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static java.lang.String f2346;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static java.lang.String f2347;

    /* renamed from: ˌ, reason: contains not printable characters */
    public static java.lang.String f2348;

    /* renamed from: ˍ, reason: contains not printable characters */
    public static java.lang.String f2349;

    /* renamed from: ˑ, reason: contains not printable characters */
    public static java.lang.String f2350;

    /* renamed from: ˡ, reason: contains not printable characters */
    public static java.lang.String f2351;

    /* renamed from: ˮ, reason: contains not printable characters */
    public static java.lang.String f2352;

    /* renamed from: ՙ, reason: contains not printable characters */
    public static java.lang.String f2353;

    /* renamed from: י, reason: contains not printable characters */
    public static java.lang.String f2354;

    /* renamed from: ـ, reason: contains not printable characters */
    public static java.lang.String f2355;

    /* renamed from: ٴ, reason: contains not printable characters */
    public static java.lang.String f2356;

    /* renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String f2357;

    /* renamed from: ᐠ, reason: contains not printable characters */
    public static java.lang.String f2358;

    /* renamed from: ᐣ, reason: contains not printable characters */
    public static java.lang.String f2359;

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static java.lang.String f2360;

    /* renamed from: ᐨ, reason: contains not printable characters */
    public static java.lang.String f2361;

    /* renamed from: ᐩ, reason: contains not printable characters */
    public static java.lang.String f2362;

    /* renamed from: ᑊ, reason: contains not printable characters */
    public static java.lang.String f2363;

    /* renamed from: ᕀ, reason: contains not printable characters */
    public static java.lang.String f2364;

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static java.lang.String f2365;

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static java.lang.String f2366;

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static java.lang.String f2367;

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static java.lang.String f2368;

    /* renamed from: ᵣ, reason: contains not printable characters */
    public static java.lang.String f2369;

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static java.lang.String f2370;

    /* renamed from: יּ, reason: contains not printable characters */
    public static java.lang.String f2371;

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static java.lang.String f2372;

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static java.lang.String f2373;

    /* renamed from: ﹺ, reason: contains not printable characters */
    public static java.lang.String f2374;

    /* renamed from: ｰ, reason: contains not printable characters */
    public static java.lang.String f2375;

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static java.lang.String f2376;

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) (33 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), "\n#\u001a\u0019\u001e\u0019", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7, objArr);
        f2347 = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("䗯䖂\ue5ea\ueb06⫩㩝羖㞑괆ᆗ惣瑕ㆳ朮ꛌ蹎", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr2);
        f2348 = ((java.lang.String) objArr2[0]).intern();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 91), "\u001f\u0010\u0001\u0019\u001d\u0006\u0019\u0006\u0004\u0011\u001e\u0019\b\u0012㙊", android.text.TextUtils.getOffsetAfter("", 0) + 15, objArr3);
        f2343 = ((java.lang.String) objArr3[0]).intern();
        byte windowTouchSlop = (byte) (52 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
        int i = (getHighSpeedVideoFpsRanges + 117) % 128;
        getInputSizeshNQ4ISI = i;
        getHighSpeedVideoFpsRanges = (i + 23) % 128;
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(windowTouchSlop, "㘞㘞\u0006\u001d\"\u0004㘧", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 7, objArr4);
            f2342 = ((java.lang.String) objArr4[0]).intern();
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (80 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0010\u0016\u001e\"\n\u001e\u0015\u0010\b\u000b\b\u0013㘸", 14 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5);
            f2346 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.getOffsetBefore("", 0) + 34), "\u0010\u0016 \u0011\u0001\u0003㘗", 6 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr6);
            f2350 = ((java.lang.String) objArr6[0]).intern();
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (18 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), "\t\u001c\u0006\u0019\u0006\u0003\u000b\b\u0019\u0018\u0011\"\f\u0002\u0000\b", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, objArr7);
            f2349 = ((java.lang.String) objArr7[0]).intern();
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            getHighSpeedVideoSizes("퍹팘㼚ㇻ\ue6de䫨\ue919ﮰ矪愎곁Ӄꜰ뷛櫃ﻐ紡莒\u3098뢣㭆즼", 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr8);
            f2355 = ((java.lang.String) objArr8[0]).intern();
            java.lang.Object[] objArr9 = new java.lang.Object[1];
            getHighSpeedVideoSizes("⾐⿱鶟鍳暉篧筇", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr9);
            f2360 = ((java.lang.String) objArr9[0]).intern();
            java.lang.Object[] objArr10 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (2 - android.view.KeyEvent.getDeadChar(0, 0)), "\u0010\u0006\u0019 \u001e\u0006\n\u0019\u0004\u0016", android.text.TextUtils.getOffsetBefore("", 0) + 10, objArr10);
            f2361 = ((java.lang.String) objArr10[0]).intern();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighSpeedVideoSizes("썠쌍帄僨휣鰯洛쩛ᛤ런鴨툶뜦\udcdd嬯⠤洵", 1 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr11);
            f2354 = ((java.lang.String) objArr11[0]).intern();
            byte intValue = (byte) (123 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22));
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 107) % 128;
            java.lang.Object[] objArr12 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(intValue, "\u0000\u0010\u0007\u0012\u001d\u0006\u0012\f\u0005\u0006㙺", 12 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr12);
            f2353 = ((java.lang.String) objArr12[0]).intern();
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (78 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6)), "\u000f\u0006\u0011\u000e\u000b\b\u001a\u001e\u0019\u001b", (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, objArr13);
            f2341 = ((java.lang.String) objArr13[0]).intern();
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes("儣兓ᐥ\u1ad2礇䠛歒摤峅揟㌻", 1 - android.text.TextUtils.getOffsetBefore("", 0), objArr14);
            f2376 = ((java.lang.String) objArr14[0]).intern();
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighSpeedVideoSizes("盳皃ⳣ∔\ud98f埸䲂쓬搃簼鎶᧯", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr15);
            f2372 = ((java.lang.String) objArr15[0]).intern();
            java.lang.Object[] objArr16 = new java.lang.Object[1];
            getHighSpeedVideoSizes("䡭䠝⯋┼\ue285\udd73爜￦挫\uf6b7ꢼ鍥", -android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr16);
            f2365 = ((java.lang.String) objArr16[0]).intern();
            java.lang.Object[] objArr17 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 17), "\u000f\u0006\u000e\"\u0019\u001b㗛", 7 - android.view.KeyEvent.normalizeMetaState(0), objArr17);
            f2366 = ((java.lang.String) objArr17[0]).intern();
            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 109) % 128;
            java.lang.Object[] objArr18 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\ue826\ue856㗍㬺켪覔퉗퉉紭ꉐ蔆", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1, objArr18);
            f2368 = ((java.lang.String) objArr18[0]).intern();
            java.lang.Object[] objArr19 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (54 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), "\u0016\u0010㘴", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, objArr19);
            f2356 = ((java.lang.String) objArr19[0]).intern();
            java.lang.Object[] objArr20 = new java.lang.Object[1];
            getHighSpeedVideoSizes("犙狺諸萋בּᱲ䣽\ue656숕㞲넡剾۟ࠦ", 1 - android.view.KeyEvent.getDeadChar(0, 0), objArr20);
            f2367 = ((java.lang.String) objArr20[0]).intern();
            java.lang.Object[] objArr21 = new java.lang.Object[1];
            getHighSpeedVideoSizes("趄跶턊\udfea\ude93\uddb5럢쏺駷\uf655钗", 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr21);
            f2373 = ((java.lang.String) objArr21[0]).intern();
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoSizes("휳흁邕鹵継⻁\ued55惰\ud868ԡ㞠惷ꍶቚ\uf1a7髤", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1, objArr22);
            f2339 = ((java.lang.String) objArr22[0]).intern();
            java.lang.Object[] objArr23 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ី់\uee8e\ue06d\udb00왣\uf849", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr23);
            f2375 = ((java.lang.String) objArr23[0]).intern();
            java.lang.Object[] objArr24 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) ((-16777141) - android.graphics.Color.rgb(0, 0, 0)), "\u0006\u001b\u001e\n\u000b!\"\u0006\u001a\u0015㙊", 11 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr24);
            f2370 = ((java.lang.String) objArr24[0]).intern();
            java.lang.Object[] objArr25 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), "#\u0007㘄", 2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr25);
            f2374 = ((java.lang.String) objArr25[0]).intern();
            java.lang.Object[] objArr26 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\uf7b5\uf7d4๖·枰缑췕竞䚦哷\u2dafㄺ菼貗\ueba8쬡姽닶", (-16777215) - android.graphics.Color.rgb(0, 0, 0), objArr26);
            f2352 = ((java.lang.String) objArr26[0]).intern();
            java.lang.Object[] objArr27 = new java.lang.Object[1];
            getHighSpeedVideoSizes("㛫㚟輺臍墟ߐಔ䗴작ⰼኯ䧮䊶\u0dfe풰돪颻㎞軜\uf583", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr27);
            f2340 = ((java.lang.String) objArr27[0]).intern();
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            getHighSpeedVideoSizes("쩜쨸⿂ℷඌじ\uf01bყ朾᮹䞈織븁괂", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr28);
            f2345 = ((java.lang.String) objArr28[0]).intern();
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            getHighSpeedVideoSizes("铓钲㽡ㆍ\uf249\uef33喼", -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr29);
            f2351 = ((java.lang.String) objArr29[0]).intern();
            java.lang.Object[] objArr30 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 54), "\u0016\u0010㘴", 3 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr30);
            f2344 = ((java.lang.String) objArr30[0]).intern();
            java.lang.Object[] objArr31 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.text.TextUtils.indexOf("", "") + 58), "\u0010\u0006㘢", 3 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr31);
            f2362 = ((java.lang.String) objArr31[0]).intern();
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoSizes("捁挴쓠쨈嘠骓夰䭎谗녛ᰵ풊ᜈ䘹\uda15⺃촓", android.view.KeyEvent.keyCodeFromString("") + 1, objArr32);
            f2358 = ((java.lang.String) objArr32[0]).intern();
            java.lang.Object[] objArr33 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 74), "\u0016 \b\u0004\u0000\u001e\n\u0006\f\n㘽", android.widget.ExpandableListView.getPackedPositionType(0L) + 11, objArr33);
            f2363 = ((java.lang.String) objArr33[0]).intern();
            java.lang.Object[] objArr34 = new java.lang.Object[1];
            getHighSpeedVideoSizes("壗墴죙옪櫞줻抬瞹耤\ue2f9\u20c2蜶", 1 - android.text.TextUtils.getCapsMode("", 0, 0), objArr34);
            f2359 = ((java.lang.String) objArr34[0]).intern();
            java.lang.Object[] objArr35 = new java.lang.Object[1];
            getHighSpeedVideoSizes("搧摆抾汋ࣞ蜐幋ᖤ⩗곚䋓줋ၶ\ue057蓷㌙쩾", 1 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr35);
            f2357 = ((java.lang.String) objArr35[0]).intern();
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u2d69ⴛ㱗㊷兙拧ᜉ䰾璫䤇᭰ⳅ夸뺗\udd69훞茡", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr36);
            f2371 = ((java.lang.String) objArr36[0]).intern();
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            getHighSpeedVideoSizes("伜併\ud8a6홍ֹ倇畺ᣇ遞篭侺ḍ㭛婦覅\ue436\ue149搆폯ꉅꜩ", -((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), objArr37);
            f2369 = ((java.lang.String) objArr37[0]).intern();
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((byte) (android.graphics.Color.blue(0) + 26), "\u001e\u0010\u0010\u0004\u001a\u0006\u0007\u001e\u000f\u0018\u0016\u0010\u0004\u001e㘙", android.graphics.Color.red(0) + 15, objArr38);
            f2364 = ((java.lang.String) objArr38[0]).intern();
            int i2 = getHighSpeedVideoFpsRanges + 87;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        getHighSpeedVideoSizes = i2;
        getHighSpeedVideoFpsRangesFor = (i2 + 93) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getInputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 99) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getInputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = (i3 + 11) % 128;
        getHighSpeedVideoFpsRangesFor = (i3 + 3) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = Camera2StreamConfigurationMap;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                cArr2[i4] = (char) (cArr[i4] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighResolutionOutputSizeshNQ4ISI);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 17) % 128;
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr3[i17] = (char) (cArr3[i17] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoSizes() {
        Camera2StreamConfigurationMap = new char[]{41906, 41031, 41914, 41868, 41915, 41864, 41907, 41896, 41887, 41902, 41917, 41903, 41900, 41898, 41877, 41871, 41909, 41030, 41918, 41870, 41897, 41028, 41911, 41916, 41913, 41908, 41893, 41904, 41882, 41885, 41866, 41905, 41879, 41872, 41919, 41912};
        getHighResolutionOutputSizeshNQ4ISI = (char) 38464;
        getInputFormats = -6573020843422779731L;
    }
}
