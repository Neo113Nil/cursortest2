package io.appmetrica.analytics.impl;

import e2.AbstractC0292g;
import e2.AbstractC0294i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class Zc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6902a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f6902a;
            ArrayList arrayList3 = new ArrayList(AbstractC0294i.U(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Yc) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC0292g.f0(new LinkedHashSet(arrayList));
    }

    public final synchronized void a(Yc... ycArr) {
        e2.m.W(this.f6902a, ycArr);
    }
}
