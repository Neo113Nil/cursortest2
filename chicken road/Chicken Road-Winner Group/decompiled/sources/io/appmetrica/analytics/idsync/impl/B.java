package io.appmetrica.analytics.idsync.impl;

import e2.AbstractC0294i;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final ModulePreferences f5565a;

    /* renamed from: b, reason: collision with root package name */
    public final A f5566b = new A();

    /* renamed from: c, reason: collision with root package name */
    public final String f5567c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final Map f5568d = e2.r.q0(a());

    public B(ModulePreferences modulePreferences) {
        this.f5565a = modulePreferences;
    }

    public final LinkedHashMap a() {
        List<z> model = this.f5566b.toModel(this.f5565a.getString(this.f5567c, null));
        int j02 = e2.s.j0(AbstractC0294i.U(model));
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        for (Object obj : model) {
            linkedHashMap.put(((z) obj).f5632a, obj);
        }
        return linkedHashMap;
    }
}
