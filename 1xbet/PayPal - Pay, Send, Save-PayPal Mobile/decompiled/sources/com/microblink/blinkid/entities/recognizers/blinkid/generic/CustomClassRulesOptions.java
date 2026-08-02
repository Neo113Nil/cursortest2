package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class CustomClassRulesOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRulesOptions";

    private static native com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] customClassRulesNativeGet(long j);

    private static native void customClassRulesNativeSet(long j, int[] iArr);

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] getCustomClassRules() {
        return customClassRulesNativeGet(0L);
    }

    public void setCustomClassRules(com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] customClassRulesArr) {
        customClassRulesNativeSet(0L, com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules.serializeToArray(customClassRulesArr));
    }
}
