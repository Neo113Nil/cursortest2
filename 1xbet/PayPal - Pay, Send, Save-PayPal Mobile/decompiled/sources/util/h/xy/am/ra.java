package util.h.xy.am;

/* loaded from: classes18.dex */
public final class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoSizes;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static com.thalesgroup.gemalto.securelog.SecureLog m25033(com.thalesgroup.gemalto.securelog.SecureLogConfig secureLogConfig) {
        util.h.xy.aj.b bVar = new util.h.xy.aj.b(secureLogConfig);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 107) % 128;
        return bVar;
    }
}
