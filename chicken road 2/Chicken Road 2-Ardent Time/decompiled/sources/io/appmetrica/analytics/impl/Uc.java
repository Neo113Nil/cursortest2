package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Uc {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f5071a = new java.util.LinkedHashMap();

    public final java.util.LinkedHashMap a(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = this.f5071a;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(i1.AbstractC0203v.E(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
