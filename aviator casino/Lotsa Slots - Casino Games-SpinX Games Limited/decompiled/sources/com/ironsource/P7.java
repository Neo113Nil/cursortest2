package com.ironsource;

/* loaded from: classes5.dex */
public final class P7 {
    public final java.lang.String a() {
        java.lang.String OMID_LIB_VERSION = com.ironsource.Fc.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    public final java.lang.String b() {
        return com.ironsource.Fc.e;
    }

    public final java.lang.String c() {
        java.lang.String sDKVersion = com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
