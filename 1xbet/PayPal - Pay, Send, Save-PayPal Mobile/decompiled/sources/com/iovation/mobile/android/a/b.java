package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class b implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED")));
        try {
            linkedHashMap.put("BATL", java.lang.String.valueOf(r1.getIntExtra("level", -1) / r1.getIntExtra("scale", -1)));
        } catch (java.lang.NullPointerException unused) {
        }
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        kotlin.jvm.internal.Intrinsics.checkNotNull(registerReceiver);
        int intExtra = registerReceiver.getIntExtra("plugged", -1);
        linkedHashMap.put("PLUG", (intExtra == 1 || intExtra == 2) ? "1" : "0");
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "cebea9";
    }
}
