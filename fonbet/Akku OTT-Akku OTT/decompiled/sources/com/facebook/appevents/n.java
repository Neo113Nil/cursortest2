package com.facebook.appevents;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet = new HashSet();
        String str = j.a;
        Set<C0689a> set = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
            try {
                set = j.c.e();
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, j.class);
            }
        }
        Iterator<C0689a> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().a);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            com.facebook.internal.p.k((String) it2.next(), true);
        }
    }
}
