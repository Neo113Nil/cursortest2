package util.h.xy.ew;

/* loaded from: classes18.dex */
public final class mb implements util.h.xy.ew.rd {
    private static final java.util.Map Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static long getInputFormats;
    private static char[] getInputSizeshNQ4ISI;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.ew.rd f2180;

    static {
        Camera2StreamConfigurationMap();
        f2180 = new util.h.xy.ew.mb();
        java.util.HashMap hashMap = new java.util.HashMap();
        int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        try {
            int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue();
            char resolveSizeAndState = (char) android.view.View.resolveSizeAndState(0, 0, 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            int i = indexOf + 23;
            int i2 = (intValue + 20) >> 6;
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
            while (rbVar.f2651 < i) {
                jArr[rbVar.f2651] = ((rbVar.f2651 * (getInputFormats ^ 3446303986615426049L)) ^ ((char) (getInputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L))) ^ resolveSizeAndState;
                rbVar.f2651++;
                i2 = i2;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                rbVar.f2651++;
            }
            objArr[0] = new java.lang.String(cArr);
            hashMap.put(new util.h.xy.dh.i(((java.lang.String) objArr[0]).intern()), util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.du.ra.f1735, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.du.ra.f1733, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.du.ra.f1721, util.h.xy.fb.b.m26828(64));
            hashMap.put(util.h.xy.du.ra.f1634, util.h.xy.fb.b.m26828(64));
            hashMap.put(util.h.xy.dq.mb.f1479, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dq.mb.f1516, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.dq.mb.f1492, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.dq.mb.f1507, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dq.mb.f1457, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.dq.mb.f1490, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.dq.mb.f1503, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dq.mb.f1476, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.dq.mb.f1511, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.dq.mb.f1504, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dq.mb.f1465, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.dq.mb.f1482, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.dq.mb.f1510, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dq.mb.f1475, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.dq.mb.f1496, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.ds.b.f1534, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.ds.b.f1535, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.ds.b.f1532, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.ds.b.f1536, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.ds.b.f1533, util.h.xy.fb.b.m26828(192));
            hashMap.put(util.h.xy.ds.b.f1531, util.h.xy.fb.b.m26828(256));
            hashMap.put(util.h.xy.dn.mb.f1386, util.h.xy.fb.b.m26828(128));
            hashMap.put(util.h.xy.dr.mb.f1524, util.h.xy.fb.b.m26828(64));
            hashMap.put(util.h.xy.dg.ma.f1181, util.h.xy.fb.b.m26828(256));
            Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(hashMap);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // util.h.xy.ew.rd
    /* renamed from: ˎ, reason: contains not printable characters */
    public final int mo26727(util.h.xy.dh.i iVar) {
        java.lang.Integer num = (java.lang.Integer) Camera2StreamConfigurationMap.get(iVar);
        if (num == null) {
            return -1;
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 47) % 128;
        int intValue = num.intValue();
        int i = getHighSpeedVideoSizes + 101;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return intValue;
        }
        throw null;
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = new char[]{39984, 37994, 36025, 34016, 48429, 46444, 44463, 42444, 56856, 54877, 52864, 50883, 65294, 63411, 61417, 57405, 6271, 4258, 2285, 304, 14676, 12696};
        getInputFormats = -2864416330969344956L;
    }
}
