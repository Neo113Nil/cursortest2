package util.h.xy.bv;

/* loaded from: classes5.dex */
public class rc extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int[] getHighResolutionOutputSizeshNQ4ISI = {1268688698, -926475415, 207498365, 1928940181, -546183178, -2096279948, 982156332, 86169034, 796661941, -319758824, 311163839, -1112235251, 127450242, 1392841821, 2043512376, -1487040566, -1893397641, 894710392};
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rc(java.lang.String str) {
        super(((java.lang.String) r2[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-1886682958, 469117027, 833639351, 1160496741, -2008864602, -2087101844, -919430323, 1136146136, -1693653312, 147989319, -1313699551, 1567656028, 724026178, -1337792921}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 26, objArr);
        this.getInputFormats = util.h.xy.bv.rc.class.getName();
        this.getHighSpeedVideoSizesFor = str;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{786530058, 1639005193, -1311033604, -2078318912, -1917642945, 2135579927}, 10 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        hashMap.put(((java.lang.String) objArr[0]).intern(), this.getHighSpeedVideoSizesFor);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 113) % 128;
        return hashMap;
    }

    @Override // util.h.xy.bv.mb
    @util.h.xy.a.a
    /* renamed from: ˏ */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        util.h.xy.bv.c cVar = new util.h.xy.bv.c(rbVar.m25751());
        rbVar.m25751();
        rbVar.m25742();
        rbVar.m25745();
        cVar.m25744(rbVar.m25745());
        cVar.m25743(rbVar.m25749());
        cVar.m25748(rbVar.m25742());
        cVar.m25746(rbVar.m25750());
        if (rbVar.m25745() == util.h.xy.bv.rb.ra.f1062) {
            int i = Camera2StreamConfigurationMap + 9;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
                if (m25747 != null) {
                    int i2 = (getHighSpeedVideoFpsRanges + 31) % 128;
                    Camera2StreamConfigurationMap = i2;
                    int[] iArr = {-2097858564, 502703567, -2126504570, 1922320790, 791224256, 2011500471};
                    getHighSpeedVideoFpsRanges = (i2 + 103) % 128;
                    int i3 = i2 + 105;
                    getHighSpeedVideoFpsRanges = i3 % 128;
                    try {
                        if (i3 % 2 != 0) {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(iArr, 12 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 1L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 1L ? 0 : -1)), objArr);
                            m25747.containsKey(((java.lang.String) objArr[0]).intern());
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(iArr, 12 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr2);
                            m25747.containsKey(((java.lang.String) objArr2[0]).intern());
                        }
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{-2097858564, 502703567, -2126504570, 1922320790, 791224256, 2011500471}, 12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr3);
                if (m25747.containsKey(((java.lang.String) objArr3[0]).intern())) {
                    java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-2097858564, 502703567, -2126504570, 1922320790, 791224256, 2011500471}, 11 - android.view.KeyEvent.normalizeMetaState(0), objArr4);
                    cVar.m25683(m257472.get(((java.lang.String) objArr4[0]).intern()));
                    return new util.h.xy.an.ra(cVar, true, null);
                }
                int i4 = getHighSpeedVideoFpsRanges + 71;
                Camera2StreamConfigurationMap = i4 % 128;
                if (i4 % 2 != 0) {
                    return getHighSpeedVideoFpsRangesFor(cVar);
                }
                getHighSpeedVideoFpsRangesFor(cVar);
                throw new java.lang.ArithmeticException();
            }
            rbVar.m25747();
            throw null;
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{1105134725, -819030754, -1313627350, 1743258896, 58636232, 701917454, -840108062, 1162831890, 1931471607, 1279441202}, 20 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
        return new util.h.xy.an.ra(cVar, false, ((java.lang.String) objArr5[0]).intern());
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getHighResolutionOutputSizeshNQ4ISI;
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
        int[] iArr5 = getHighResolutionOutputSizeshNQ4ISI;
        if (iArr5 != null) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 125) % 128;
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static util.h.xy.an.ra<util.h.xy.bv.rb> getHighSpeedVideoFpsRangesFor(util.h.xy.bv.c cVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-981416567, 2000385849, -915375162, -1116587725, -1730702356, 559820848, -2097858564, 502703567, -1818282156, 1872154305, -1311033604, -2078318912, -1204652893, -1779187936, 1904774095, -721989259, -1585825323, 645245975}, 35 - android.view.KeyEvent.normalizeMetaState(0), objArr);
        util.h.xy.an.ra<util.h.xy.bv.rb> raVar = new util.h.xy.an.ra<>(cVar, false, ((java.lang.String) objArr[0]).intern());
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 15) % 128;
        return raVar;
    }
}
