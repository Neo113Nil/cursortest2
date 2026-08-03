package com.ironsource;

/* loaded from: classes5.dex */
public abstract class E5 implements com.ironsource.E0 {
    public final java.util.Map<java.lang.String, java.lang.Object> a(com.ironsource.C3069h0 adProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        java.lang.String aVar = adProperties.a().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "adProperties.adFormat.toString()");
        hashMap.put(com.ironsource.Va.f, aVar);
        hashMap.put("adf", java.lang.Integer.valueOf(com.ironsource.Ff.c(adProperties.a())));
        java.lang.String uuid = adProperties.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        hashMap.put(com.ironsource.Va.i, uuid);
        hashMap.put("mediationAdUnitId", adProperties.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
