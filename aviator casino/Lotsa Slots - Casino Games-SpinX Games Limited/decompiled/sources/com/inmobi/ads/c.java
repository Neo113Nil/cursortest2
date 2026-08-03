package com.inmobi.ads;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4586a;

    static {
        int[] iArr = new int[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.values().length];
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 8;
        } catch (java.lang.NoSuchFieldError unused8) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 9;
        } catch (java.lang.NoSuchFieldError unused9) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 10;
        } catch (java.lang.NoSuchFieldError unused10) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 11;
        } catch (java.lang.NoSuchFieldError unused11) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 12;
        } catch (java.lang.NoSuchFieldError unused12) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 13;
        } catch (java.lang.NoSuchFieldError unused13) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 14;
        } catch (java.lang.NoSuchFieldError unused14) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 15;
        } catch (java.lang.NoSuchFieldError unused15) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 16;
        } catch (java.lang.NoSuchFieldError unused16) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 17;
        } catch (java.lang.NoSuchFieldError unused17) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 18;
        } catch (java.lang.NoSuchFieldError unused18) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 19;
        } catch (java.lang.NoSuchFieldError unused19) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 20;
        } catch (java.lang.NoSuchFieldError unused20) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED.ordinal()] = 21;
        } catch (java.lang.NoSuchFieldError unused21) {
        }
        try {
            iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW.ordinal()] = 22;
        } catch (java.lang.NoSuchFieldError unused22) {
        }
        f4586a = iArr;
    }
}
