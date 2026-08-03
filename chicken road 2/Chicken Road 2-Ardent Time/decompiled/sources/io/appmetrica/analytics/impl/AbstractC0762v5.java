package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0762v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f6948a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("google", io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider.GOOGLE);
        hashMap.put("huawei", io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo.Provider.YANDEX);
        f6948a = java.util.Collections.unmodifiableMap(hashMap);
    }
}
