package io.appmetrica.analytics.impl;

import e2.AbstractC0294i;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009zd {
    public static ArrayList a() {
        C0571id c0571id;
        List<String> a3 = C0587j4.l().f7581m.a();
        ArrayList arrayList = new ArrayList(AbstractC0294i.U(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0571id = new C0571id(str, false);
            } else {
                C0587j4.l().m().f7326b.add((ModuleClientEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
                c0571id = new C0571id(str, true);
            }
            arrayList.add(c0571id);
        }
        return arrayList;
    }
}
