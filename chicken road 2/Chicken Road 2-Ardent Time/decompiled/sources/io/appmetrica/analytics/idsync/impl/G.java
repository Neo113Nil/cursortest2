package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences f3898a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.F f3899b = new io.appmetrica.analytics.idsync.impl.F();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f3900c = "request_state";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f3901d = i1.AbstractC0202u.L(a());

    public G(io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences) {
        this.f3898a = modulePreferences;
    }

    public final java.util.LinkedHashMap a() {
        java.util.List<io.appmetrica.analytics.idsync.impl.E> model = this.f3899b.toModel(this.f3898a.getString(this.f3900c, null));
        int E2 = i1.AbstractC0203v.E(i1.AbstractC0192k.K(model));
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (java.lang.Object obj : model) {
            linkedHashMap.put(((io.appmetrica.analytics.idsync.impl.E) obj).f3891a, obj);
        }
        return linkedHashMap;
    }
}
