package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382gd extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f5985b;

    public C0382gd(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
        java.lang.String b2 = x4.b().b();
        b2 = b2 == null ? "empty" : b2;
        java.lang.String.format("[ModulesEventHandler-%s]", java.util.Arrays.copyOf(new java.lang.Object[]{b2}, 1));
        java.util.LinkedHashMap a2 = io.appmetrica.analytics.impl.C0560na.k().o().a(b2);
        java.util.ArrayList arrayList = new java.util.ArrayList(a2.size());
        for (java.util.Map.Entry entry : a2.entrySet()) {
            arrayList.add(new h1.C0172d(entry.getValue(), new io.appmetrica.analytics.impl.Tc(x4, (java.lang.String) entry.getKey())));
        }
        this.f5985b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        if (!this.f4907a.t.c()) {
            return false;
        }
        java.util.ArrayList arrayList = this.f5985b;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h1.C0172d c0172d = (h1.C0172d) it.next();
            io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler moduleServiceEventHandler = (io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler) c0172d.f3295a;
            io.appmetrica.analytics.impl.Tc tc = (io.appmetrica.analytics.impl.Tc) c0172d.f3296b;
            if (moduleServiceEventHandler.handle(new io.appmetrica.analytics.impl.Wc(tc.f5013b, tc.f5012a, new io.appmetrica.analytics.impl.Vc(tc.f5015d, tc.f5014c, p5)), p5)) {
                return true;
            }
        }
        return false;
    }
}
