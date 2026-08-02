package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class o implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Object systemService = context.getSystemService("sensor");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) systemService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorManager, "");
        linkedHashMap.put("PROX", sensorManager.getDefaultSensor(8) != null ? "1" : "0");
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "31faab";
    }
}
