package com.inmobi.media;

/* renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2540kh {
    public static final void a(com.inmobi.media.AbstractC2514jh telemetryType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryType, "telemetryType");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (telemetryType instanceof com.inmobi.media.C2437gh) {
            linkedHashMap.put("trigger", ((com.inmobi.media.C2437gh) telemetryType).f5221a);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("BillingClientConnectionError", linkedHashMap, com.inmobi.media.EnumC2728rk.f5431a);
        } else if (telemetryType instanceof com.inmobi.media.C2463hh) {
            linkedHashMap.put("errorCode", java.lang.Short.valueOf(((com.inmobi.media.C2463hh) telemetryType).f5243a));
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("IAPFetchFailed", linkedHashMap, com.inmobi.media.EnumC2728rk.f5431a);
        } else {
            if (!(telemetryType instanceof com.inmobi.media.C2488ih)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.inmobi.media.C2624nk c2624nk3 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("IAPFetchSuccess", linkedHashMap, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }
}
