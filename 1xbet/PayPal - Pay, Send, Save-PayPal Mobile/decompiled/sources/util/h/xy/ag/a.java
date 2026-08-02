package util.h.xy.ag;

/* loaded from: classes5.dex */
public final class a {
    private static android.content.Context getHighSpeedVideoFpsRanges = null;
    private static final util.h.xy.ag.a getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.ag.a();
    private static int getHighSpeedVideoSizes;
    private static int getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 9) % 128;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ag.a m24556() {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i ^ 91) + ((i & 91) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        util.h.xy.ag.a aVar = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i2 + 3;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    private a() {
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final android.content.Context m24558() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i & 3) + (i | 3)) % 128;
        getHighSpeedVideoSizes = i2;
        android.content.Context context = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 ^ 67) + ((i2 & 67) << 1)) % 128;
        return context;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24559(android.content.Context context) {
        int i = getHighSpeedVideoSizes;
        int i2 = ((i | 7) << 1) - (i ^ 7);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            if (context != null && context.getApplicationContext() != null) {
                getHighSpeedVideoFpsRanges = context.getApplicationContext();
                int i3 = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i3 | 91) << 1) - (i3 ^ 91)) % 128;
                return;
            } else {
                int i4 = getHighSpeedVideoFpsRangesFor + 95;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final boolean m24560() {
        int i = (getHighSpeedVideoSizes + 27) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        if (getHighSpeedVideoFpsRanges == null) {
            getHighSpeedVideoSizes = ((i ^ 45) + ((i & 45) << 1)) % 128;
            return false;
        }
        getHighSpeedVideoSizes = ((i ^ 75) + ((i & 75) << 1)) % 128;
        getHighSpeedVideoSizes = ((i & 47) + (i | 47)) % 128;
        return true;
    }

    public final android.os.Handler c_() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 71) << 1) - (i ^ 71);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (getHighSpeedVideoFpsRanges != null) {
            android.os.Handler handler = new android.os.Handler(m24558().getMainLooper());
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 87) % 128;
            return handler;
        }
        android.os.Handler handler2 = new android.os.Handler(android.os.Looper.getMainLooper());
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i3 & 87) + (i3 | 87)) % 128;
        return handler2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24557(java.lang.Runnable runnable) {
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRangesFor = ((i & 37) + (i | 37)) % 128;
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            c_().post(runnable);
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 73) % 128;
        } else {
            int i2 = getHighSpeedVideoSizes + 13;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                runnable.run();
                int i3 = getHighSpeedVideoSizes + 51;
                getHighSpeedVideoFpsRangesFor = i3 % 128;
                int i4 = i3 % 2;
            } else {
                runnable.run();
                throw new java.lang.ArithmeticException();
            }
        }
        int i5 = getHighSpeedVideoSizes + 93;
        getHighSpeedVideoFpsRangesFor = i5 % 128;
        if (i5 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }
}
