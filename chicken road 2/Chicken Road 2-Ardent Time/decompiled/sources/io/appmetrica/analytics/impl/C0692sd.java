package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692sd {
    public static java.util.ArrayList a() {
        io.appmetrica.analytics.impl.C0253bd c0253bd;
        java.util.List<java.lang.String> a2 = io.appmetrica.analytics.impl.C0244b4.l().f5503m.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(a2));
        for (java.lang.String str : a2) {
            java.lang.Object loadAndInstantiateClassWithDefaultConstructor = io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0253bd = new io.appmetrica.analytics.impl.C0253bd(str, false);
            } else {
                io.appmetrica.analytics.impl.C0244b4.l().m().f5321b.add((io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0253bd = new io.appmetrica.analytics.impl.C0253bd(str, true);
            }
            arrayList.add(c0253bd);
        }
        return arrayList;
    }
}
