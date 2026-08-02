package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class n implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("RPSP", com.iovation.mobile.android.d.a.a("android.permission.READ_PHONE_STATE", context) ? "1" : "0");
        linkedHashMap.put("AFLS", com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context) ? "1" : "0");
        linkedHashMap.put("ACLS", com.iovation.mobile.android.d.a.a("android.permission.ACCESS_COARSE_LOCATION", context) ? "1" : "0");
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "41ba69";
    }
}
