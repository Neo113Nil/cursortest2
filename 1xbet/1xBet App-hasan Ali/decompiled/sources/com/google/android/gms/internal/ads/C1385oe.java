package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385oe implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f14808k = new ArrayList();

    public final boolean c(InterfaceC0677Re interfaceC0677Re) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f14808k;
        int size = arrayList2.size();
        int i = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            C1340ne c1340ne = (C1340ne) obj;
            if (c1340ne.f14661b == interfaceC0677Re) {
                arrayList.add(c1340ne);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((C1340ne) obj2).f14662c.k();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14808k.iterator();
    }
}
