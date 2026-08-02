package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public abstract class HitQueuing {
    public abstract void beginProcessing();

    public abstract void clear();

    public abstract void close();

    public abstract int count();

    public abstract boolean queue(com.adobe.marketing.mobile.services.DataEntity dataEntity);

    public abstract void suspend();

    /* renamed from: com.adobe.marketing.mobile.services.HitQueuing$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.MobilePrivacyStatus.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.adobe.marketing.mobile.MobilePrivacyStatus.OPT_IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.adobe.marketing.mobile.MobilePrivacyStatus.OPT_OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public void handlePrivacyChange(com.adobe.marketing.mobile.MobilePrivacyStatus mobilePrivacyStatus) {
        int i = com.adobe.marketing.mobile.services.HitQueuing.AnonymousClass1.Camera2StreamConfigurationMap[mobilePrivacyStatus.ordinal()];
        if (i == 1) {
            beginProcessing();
        } else if (i == 2) {
            suspend();
            clear();
        } else {
            suspend();
        }
    }
}
