package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class t implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object systemService = context.getSystemService("user");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        if (((android.os.UserManager) systemService).isUserAGoat()) {
            linkedHashMap.put("AGOAT", "1");
        }
        if (android.app.ActivityManager.isUserAMonkey()) {
            linkedHashMap.put("AMONK", "1");
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "65dcaa";
    }
}
