package io.appmetrica.analytics.impl;

import e2.AbstractC0292g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897v3 implements Cdo {
    @Override // io.appmetrica.analytics.impl.Cdo, o2.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0999z3> invoke(List<C0999z3> list, C0999z3 c0999z3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Y7 y7 = ((C0999z3) it.next()).f8658b;
                Y7 y72 = c0999z3.f8658b;
                if (y7 == y72) {
                    if (y72 != Y7.f6854c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0999z3) obj).f8658b != Y7.f6854c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC0292g.b0(arrayList, c0999z3);
                }
            }
        }
        return AbstractC0292g.b0(list, c0999z3);
    }
}
