package util.h.xy.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ util.h.xy.o.b[] Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static long getOutputFormats;
    private static int getOutputMinFrameDuration;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2275;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2276;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2277;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2278;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2279;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2280;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2281;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2282;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2283;

    /* renamed from: ˌ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2284;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2285;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2286;

    /* renamed from: ͺ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2287;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.o.b f2288;

    /* renamed from: ι, reason: contains not printable characters */
    public static final util.h.xy.o.b f2289;

    private b(java.lang.String str, int i) {
    }

    public static util.h.xy.o.b valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 59;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.o.b bVar = (util.h.xy.o.b) java.lang.Enum.valueOf(util.h.xy.o.b.class, str);
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 125) % 128;
        return bVar;
    }

    public static util.h.xy.o.b[] values() {
        int i = getOutputMinFrameDuration + 3;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.o.b[] bVarArr = (util.h.xy.o.b[]) Camera2StreamConfigurationMap.clone();
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 7) % 128;
        return bVarArr;
    }

    static {
        getHighSpeedVideoSizes();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 16, 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (3881 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr);
        util.h.xy.o.b bVar = new util.h.xy.o.b(((java.lang.String) objArr[0]).intern(), 0);
        f2286 = bVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("쓘\uf538쒌\ueb4b⪇䚝ᚴᱬ뱦扝ꎆ쾍㕼\ue57b㢯傹깚籰놣\ud9a1❜\uf497", android.graphics.Color.red(0), objArr2);
        util.h.xy.o.b bVar2 = new util.h.xy.o.b(((java.lang.String) objArr2[0]).intern(), 1);
        f2285 = bVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.text.TextUtils.getTrimmedLength("") + 19, 17 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (25184 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr3);
        util.h.xy.o.b bVar3 = new util.h.xy.o.b(((java.lang.String) objArr3[0]).intern(), 2);
        f2283 = bVar3;
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("慵級愴捲춝\uf1a6⭕", android.text.TextUtils.getOffsetBefore("", 0), objArr4);
        util.h.xy.o.b bVar4 = new util.h.xy.o.b(((java.lang.String) objArr4[0]).intern(), 3);
        f2282 = bVar4;
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoSizes(15 - android.widget.ExpandableListView.getPackedPositionGroup(0L), 35 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
        util.h.xy.o.b bVar5 = new util.h.xy.o.b(((java.lang.String) objArr5[0]).intern(), 4);
        f2288 = bVar5;
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("ᘧ튣ᙴ쳔ψ伣㿯ᗔ溘䗁諓옱\ue784싫ᇻ夅粤导", android.graphics.Color.green(0), objArr6);
        util.h.xy.o.b bVar6 = new util.h.xy.o.b(((java.lang.String) objArr6[0]).intern(), 5);
        f2289 = bVar6;
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, 50 - android.view.View.MeasureSpec.getMode(0), (char) (11232 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr7);
        util.h.xy.o.b bVar7 = new util.h.xy.o.b(((java.lang.String) objArr7[0]).intern(), 6);
        f2276 = bVar7;
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 16, android.view.KeyEvent.normalizeMetaState(0) + 74, (char) (android.text.TextUtils.getOffsetBefore("", 0) + 55876), objArr8);
        util.h.xy.o.b bVar8 = new util.h.xy.o.b(((java.lang.String) objArr8[0]).intern(), 7);
        f2275 = bVar8;
        java.lang.Object[] objArr9 = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) + 28, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 90, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 11196), objArr9);
        util.h.xy.o.b bVar9 = new util.h.xy.o.b(((java.lang.String) objArr9[0]).intern(), 8);
        f2277 = bVar9;
        java.lang.Object[] objArr10 = new java.lang.Object[1];
        getHighSpeedVideoSizes((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 118 - android.view.View.MeasureSpec.getSize(0), (char) (41289 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr10);
        util.h.xy.o.b bVar10 = new util.h.xy.o.b(((java.lang.String) objArr10[0]).intern(), 9);
        f2287 = bVar10;
        java.lang.Object[] objArr11 = new java.lang.Object[1];
        getHighSpeedVideoSizes(10 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 130 - android.text.TextUtils.indexOf("", ""), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
        util.h.xy.o.b bVar11 = new util.h.xy.o.b(((java.lang.String) objArr11[0]).intern(), 10);
        f2280 = bVar11;
        java.lang.Object[] objArr12 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("밌椒뱁睭࣐㮤㓷慓쒽\ufe6c臛늤䶳祍\u1ae0ⶒ횒\ue04a", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr12);
        util.h.xy.o.b bVar12 = new util.h.xy.o.b(((java.lang.String) objArr12[0]).intern(), 11);
        f2278 = bVar12;
        try {
            java.lang.Object[] objArr13 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("诰瞧讣\ue4ea\ue884샮풣騋\uf352淲憄䧫穕", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6, objArr13);
            util.h.xy.o.b bVar13 = new util.h.xy.o.b(((java.lang.String) objArr13[0]).intern(), 12);
            f2279 = bVar13;
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            getHighSpeedVideoSizes(7 - android.graphics.Color.red(0), 140 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.View.MeasureSpec.getSize(0) + 16062), objArr14);
            util.h.xy.o.b bVar14 = new util.h.xy.o.b(((java.lang.String) objArr14[0]).intern(), 13);
            f2284 = bVar14;
            java.lang.Object[] objArr15 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("冁쀲凗\ude47큥飹\uec4e숌⤮坝奧ᇺꀥ큽쉉軏㬘䥪䭎ߗ눔솀찣ﰫ൴몚甹甤葴㎥", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr15);
            util.h.xy.o.b bVar15 = new util.h.xy.o.b(((java.lang.String) objArr15[0]).intern(), 14);
            f2281 = bVar15;
            int i = (getOutputMinFrameDuration + 71) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            getOutputMinFrameDuration = (i + 117) % 128;
            Camera2StreamConfigurationMap = new util.h.xy.o.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getOutputFormats ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 57) % 128;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getOutputFormats ^ 7817488252581312552L)));
            aVar.f2623++;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    private static void getHighSpeedVideoSizes(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoSizesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoFpsRanges))) ^ c;
            rbVar.f2651++;
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        java.lang.String str = new java.lang.String(cArr);
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        objArr[0] = str;
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = new char[]{37755, 58076, 28681, 50798, 21950, 43796, 14682, 34982, 7935, 27719, 58247, 29153, 50999, 22172, 42185, 14905, 65058, 36753, 7505, 43830, 14586, 50768, 21506, 58850, 29608, 273, 36551, 7333, 43645, 15310, 51584, 22392, 58680, 29420, 'V', 40017, 60913, 32570, 51551, 23168, 42042, 13939, 34697, 4569, 25450, 60580, 32476, 51204, 22960, 44010, 47013, 50709, 21701, 58035, 29040, 36824, 7571, 44137, 14890, 18585, 51033, 21822, 58354, 29279, 32768, 7920, 44197, 15201, 18896, 51094, 22137, 58401, 29316, 33109, 17937, 14246, 42342, 4888, 32978, 32369, 60448, 24006, 52100, 47411, 14049, 42113, 4677, 33783, 29100, 61257, 47086, 50756, 21651, 58092, 28976, 36742, 7640, 44082, 14949, 18634, 50948, 21865, 58281, 29187, 32861, 7842, 44259, 15151, 18825, 51157, 22065, 58492, 29389, 33039, 8038, 44460, 15369, 19029, 15625, 19642, 56937, 26654, 64479, 1390, 38705, 9931, 45199, 49722, 19943, 57245, 40002, 60913, 32561, 51542, 23194, 42023, 13939, 34711, 4573, 25469, 41708, 54085, 16770, 63464, 25640, 39576, 2249};
        getHighSpeedVideoFpsRanges = 8589171784855776688L;
        getOutputFormats = 3698252813521511956L;
    }
}
