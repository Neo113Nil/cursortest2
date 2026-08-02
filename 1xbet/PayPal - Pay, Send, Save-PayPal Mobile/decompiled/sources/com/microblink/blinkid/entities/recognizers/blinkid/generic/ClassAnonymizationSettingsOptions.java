package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class ClassAnonymizationSettingsOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettingsOptions";

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] additionalAnonymizationNativeGet(long j);

    private static native void additionalAnonymizationNativeSet(long j, int[] iArr);

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] getAdditionalAnonymization() {
        return additionalAnonymizationNativeGet(0L);
    }

    public void setAdditionalAnonymization(com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] classAnonymizationSettingsArr) {
        additionalAnonymizationNativeSet(0L, com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.serializeToArray(classAnonymizationSettingsArr));
    }
}
