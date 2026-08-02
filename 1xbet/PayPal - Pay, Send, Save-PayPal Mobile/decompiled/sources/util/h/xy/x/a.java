package util.h.xy.x;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27696(T t) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, true, null);
        int i = getHighSpeedVideoFpsRanges + 93;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27689(java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, str, 1010);
        int i = getHighResolutionOutputSizeshNQ4ISI + 51;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27695() {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_DIGITAL_CARD_ID_NULL, 2001);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i | 91) << 1) - (i ^ 91);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27690(int i) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(util.h.xy.al.b.f183, util.h.xy.ar.b.m25093(i));
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, com.gemalto.mfs.mwsdk.dcm.DCMErrorMessage.ERROR_MSG_DEVICE_SUSPICIOUS, i, hashMap);
        int i2 = getHighSpeedVideoFpsRanges + 115;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27692(java.lang.Exception exc) {
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 83) + (i | 83)) % 128;
        if (exc instanceof com.gemalto.mfs.mwsdk.exception.InternalComponentException) {
            return new util.h.xy.an.ra(exc.getMessage(), ((com.gemalto.mfs.mwsdk.exception.InternalComponentException) exc).getmErrorCode());
        }
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(exc.getMessage(), 1009);
        int i2 = getHighSpeedVideoFpsRanges + 7;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27687(java.lang.Exception exc) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(exc.getMessage(), 1011);
        int i = getHighResolutionOutputSizeshNQ4ISI + 115;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27688(T t, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, 1011);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 47) + (i | 47);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27694(T t, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, 1013);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 51) % 128;
        return raVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27697(T t, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, -1);
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 39) + (i | 39)) % 128;
        return raVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27684(T t, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, 1012);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 25) + ((i & 25) << 1);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27686(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes dCMErrorCodes, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, str, dCMErrorCodes.getIntValue());
        int i = getHighSpeedVideoFpsRanges;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 17) + ((i & 17) << 1)) % 128;
        return raVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27691(com.gemalto.mfs.mwsdk.dcm.DCMErrorCodes dCMErrorCodes, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, str, dCMErrorCodes.getIntValue());
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i ^ 105) + ((i & 105) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27693(T t) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, util.h.xy.al.ra.f675, 1016);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 87) << 1) - (i ^ 87);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27683(T t) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, util.h.xy.al.ra.f729, 1017);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 99) << 1) - (i ^ 99);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27682(T t, java.lang.String str, int i) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
        if (i != 2001) {
            util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, i);
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i2 & 121) + (i2 | 121)) % 128;
            return raVar;
        }
        util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(t, false, str, 1018);
        int i3 = getHighSpeedVideoFpsRanges + 73;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            return raVar2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27685(java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(null, false, str, 1018);
        int i = getHighResolutionOutputSizeshNQ4ISI + 81;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static <T> com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> m27681(T t, java.lang.String str) {
        util.h.xy.an.ra raVar = new util.h.xy.an.ra(t, false, str, 1009);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
        return raVar;
    }
}
