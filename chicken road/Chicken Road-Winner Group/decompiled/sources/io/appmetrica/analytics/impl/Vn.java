package io.appmetrica.analytics.impl;

import e2.AbstractC0294i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Vn {
    public static final Sn a(Throwable th, V v3, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        In a3 = th != null ? Jn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(AbstractC0294i.U(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Hl((StackTraceElement) it.next()));
            }
        }
        return new Sn(a3, v3, arrayList, null, null, null, str, bool);
    }
}
