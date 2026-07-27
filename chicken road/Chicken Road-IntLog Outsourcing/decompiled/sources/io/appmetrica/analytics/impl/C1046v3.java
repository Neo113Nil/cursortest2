package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046v3 implements Cdo {
    @Override // io.appmetrica.analytics.impl.Cdo, t4.InterfaceC1445p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C1148z3> invoke(List<C1148z3> list, C1148z3 c1148z3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Y7 y7 = ((C1148z3) it.next()).f9618b;
                Y7 y72 = c1148z3.f9618b;
                if (y7 == y72) {
                    if (y72 != Y7.f7730c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C1148z3) obj).f9618b != Y7.f7730c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC0465j.M0(arrayList, c1148z3);
                }
            }
        }
        return AbstractC0465j.M0(list, c1148z3);
    }
}
