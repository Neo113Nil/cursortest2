package io.appmetrica.analytics.impl;

import g4.AbstractC0476u;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539bd {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7927a = new LinkedHashMap();

    public final LinkedHashMap a(String str) {
        LinkedHashMap linkedHashMap = this.f7927a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC0476u.W(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
