package util.h.xy.du;

/* loaded from: classes18.dex */
public final class a extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 24164;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static long getHighSpeedVideoSizesFor = 2457411417541981002L;
    private static int getOutputFormats = 294925130;
    private util.h.xy.dh.i getInputSizeshNQ4ISI;
    private util.h.xy.dh.rk getOutputMinFrameDuration;

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 101) % 128;
        char[] charArray = str3.toCharArray();
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
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 51) % 128;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 23) % 128;
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getHighSpeedVideoSizesFor ^ 2457411417541981002L)) ^ ((int) (getOutputFormats ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(2);
        dVar.m26290(this.getInputSizeshNQ4ISI);
        dVar.m26290(this.getOutputMinFrameDuration);
        util.h.xy.dh.aa aaVar = new util.h.xy.dh.aa(dVar);
        int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return aaVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final util.h.xy.dh.rk m26417() {
        int i = getHighSpeedVideoSizes + 1;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            return this.getOutputMinFrameDuration;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.i m26416() {
        int i = Camera2StreamConfigurationMap + 19;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.i iVar = this.getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i2 + 99) % 128;
        return iVar;
    }

    public a(util.h.xy.dh.l lVar) {
        this.getInputSizeshNQ4ISI = (util.h.xy.dh.i) lVar.mo26287(0);
        this.getOutputMinFrameDuration = (util.h.xy.dh.rk) lVar.mo26287(1);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.du.a m26415(java.lang.Object obj) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 89;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (obj == null || (obj instanceof util.h.xy.du.a)) {
            util.h.xy.du.a aVar = (util.h.xy.du.a) obj;
            Camera2StreamConfigurationMap = (i + 95) % 128;
            return aVar;
        }
        if (obj instanceof util.h.xy.dh.l) {
            return new util.h.xy.du.a((util.h.xy.dh.l) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("嗀ﵡ긩\ud8f9ꄍ㿣짋趸㛳禲\ud8b4謹ృ鋡봯\ufbcb㗝᳤ี꠴⤙Ȥ\ue431阃뻳\ue3ce熔", (char) (58709 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), android.view.MotionEvent.axisFromString("") - 1236297398, "䧋侙営\ue8e5", "\u0000\u0000\u0000\u0000", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
