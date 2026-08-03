package com.ironsource.sdk.utils;

/* loaded from: classes5.dex */
public class IronSourceQaProperties {

    /* renamed from: a, reason: collision with root package name */
    private static com.ironsource.sdk.utils.IronSourceQaProperties f6722a;
    private static java.util.Map<java.lang.String, java.lang.String> b = new java.util.HashMap();

    private IronSourceQaProperties() {
    }

    public static com.ironsource.sdk.utils.IronSourceQaProperties getInstance() {
        if (f6722a == null) {
            f6722a = new com.ironsource.sdk.utils.IronSourceQaProperties();
        }
        return f6722a;
    }

    public static boolean isInitialized() {
        return f6722a != null;
    }

    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
        return b;
    }

    public void setQaParameter(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        b.put(str, str2);
    }
}
