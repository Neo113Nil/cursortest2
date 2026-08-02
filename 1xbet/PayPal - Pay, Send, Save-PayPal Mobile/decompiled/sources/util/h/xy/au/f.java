package util.h.xy.au;

/* loaded from: classes5.dex */
public final class f {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.mobilegateway.MGCardEnrollmentService m25126() {
        util.h.xy.au.a aVar = new util.h.xy.au.a();
        int i = getHighSpeedVideoFpsRangesFor + 19;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return aVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.mobilegateway.MGCardLifeCycleManager m25125() {
        util.h.xy.au.ma maVar = new util.h.xy.au.ma();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 111) % 128;
        return maVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.gemalto.mfs.mwsdk.mobilegateway.MGCardManager m25124() {
        util.h.xy.au.b bVar = new util.h.xy.au.b();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 91) % 128;
        return bVar;
    }
}
