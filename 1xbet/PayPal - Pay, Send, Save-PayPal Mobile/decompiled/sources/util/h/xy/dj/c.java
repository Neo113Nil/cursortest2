package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class c extends util.h.xy.dh.mh implements util.h.xy.dh.mc {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static long getHighSpeedVideoFpsRangesFor = -8301447008676652324L;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dj.rc getInputSizeshNQ4ISI;
    private util.h.xy.dj.i getOutputFormats;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 79;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.dj.rc rcVar = this.getInputSizeshNQ4ISI;
        if (rcVar == null) {
            return new util.h.xy.dh.ag(false, 0, this.getOutputFormats);
        }
        util.h.xy.dh.mi mo26279 = rcVar.mo26279();
        int i2 = getHighSpeedVideoSizes + 25;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return mo26279;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dj.i m26360() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 41;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return this.getOutputFormats;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.dj.rc m26359() {
        int i = (getHighSpeedVideoSizes + 93) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.dj.rc rcVar = this.getInputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 5) % 128;
        return rcVar;
    }

    public c(util.h.xy.dj.i iVar) {
        this.getInputSizeshNQ4ISI = null;
        this.getOutputFormats = iVar;
    }

    public c(util.h.xy.dj.rc rcVar) {
        this.getInputSizeshNQ4ISI = rcVar;
        this.getOutputFormats = null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.c m26358(java.lang.Object obj) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (obj == null || (obj instanceof util.h.xy.dj.c)) {
            return (util.h.xy.dj.c) obj;
        }
        if (obj instanceof util.h.xy.dh.l) {
            return new util.h.xy.dj.c(util.h.xy.dj.rc.m26400(obj));
        }
        if (obj instanceof util.h.xy.dh.mm) {
            util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) obj;
            if (mmVar.m26330() == 0) {
                util.h.xy.dj.c cVar = new util.h.xy.dj.c(util.h.xy.dj.i.m26380(mmVar, false));
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 27) % 128;
                return cVar;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        int lastIndexOf = (-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
        int i2 = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        char[] charArray = "뮏嘯믆\uf19b\uf4b5됅ᛦ〳﹛碂⁇諗걤\uecde걪﹦ᢘ္ᢦ牲钝葾蓐\ue62eïࡂ\uf106巙ﴛ뾲紷톂楑⏿\ue96a䖱\ue566圾喁뤽凿".toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, lastIndexOf);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 49) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
