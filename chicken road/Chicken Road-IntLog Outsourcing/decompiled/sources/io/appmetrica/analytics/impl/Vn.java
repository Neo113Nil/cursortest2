package io.appmetrica.analytics.impl;

import g4.AbstractC0467l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Vn {
    public static final Sn a(Throwable th, V v4, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        In a6 = th != null ? Jn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Hl((StackTraceElement) it.next()));
            }
        }
        return new Sn(a6, v4, arrayList, null, null, null, str, bool);
    }
}
