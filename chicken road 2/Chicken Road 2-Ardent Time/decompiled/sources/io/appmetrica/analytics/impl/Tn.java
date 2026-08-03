package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Tn {
    public static final io.appmetrica.analytics.impl.Qn a(java.lang.Throwable th, io.appmetrica.analytics.impl.V v2, java.util.List list, java.lang.String str, java.lang.Boolean bool) {
        java.util.ArrayList arrayList = null;
        io.appmetrica.analytics.impl.Gn a2 = th != null ? io.appmetrica.analytics.impl.Hn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new io.appmetrica.analytics.impl.Dl((java.lang.StackTraceElement) it.next()));
            }
        }
        return new io.appmetrica.analytics.impl.Qn(a2, v2, arrayList, null, null, null, str, bool);
    }
}
