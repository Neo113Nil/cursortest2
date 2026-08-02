package util.h.xy.u;

/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static util.h.xy.d.b m27544(com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        util.h.xy.d.b bVar = new util.h.xy.d.b(1, 0, 0, digitalizedCardState, false, null, -1, 1, 0, 1, 0, 0);
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
        return bVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.d.b m27542(util.h.xy.d.b bVar) {
        util.h.xy.d.b bVar2 = new util.h.xy.d.b(bVar.m26143(), bVar.m26139(), bVar.m26141(), bVar.m26136(), true, bVar.m26133(), bVar.m26131(), bVar.m26132(), bVar.m26142(), bVar.m26145(), bVar.m26134(), bVar.m26135());
        int i = Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 41) << 1) - (i ^ 41)) % 128;
        return bVar2;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.d.b m27545(int i, int i2, util.h.xy.d.mg mgVar, int i3, int i4, int i5) {
        util.h.xy.d.b bVar = new util.h.xy.d.b(0, i, i2, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState.SUSPENDED, true, mgVar, i3, 1, 0, 1, i4, i5);
        int i6 = Camera2StreamConfigurationMap;
        int i7 = (i6 ^ 19) + ((i6 & 19) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        if (i7 % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.d.b m27543(util.h.xy.d.b bVar, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState) {
        util.h.xy.d.b bVar2 = new util.h.xy.d.b(bVar.m26143(), bVar.m26139(), bVar.m26141(), digitalizedCardState, bVar.m26138(), bVar.m26133(), bVar.m26131(), bVar.m26132(), bVar.m26142(), bVar.m26145(), bVar.m26134(), bVar.m26135());
        Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 95) % 128;
        return bVar2;
    }
}
