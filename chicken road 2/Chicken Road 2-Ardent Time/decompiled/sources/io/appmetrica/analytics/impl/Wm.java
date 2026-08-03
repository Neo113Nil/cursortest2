package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wm implements io.appmetrica.analytics.impl.InterfaceC0341eo {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f5245a;

    public Wm(java.lang.String str, java.util.List<java.lang.String> list, int i2, io.appmetrica.analytics.impl.Ln ln, io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so, io.appmetrica.analytics.impl.J2 j2) {
        java.util.List U2 = i1.AbstractC0190i.U(i2, i1.AbstractC0190i.X(i1.AbstractC0190i.b0(list)));
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(U2));
        int i3 = 0;
        for (java.lang.Object obj : U2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            arrayList.add(new io.appmetrica.analytics.impl.Ym(str + '_' + i3, (java.lang.String) obj, ln, interfaceC0703so, j2));
            i3 = i4;
        }
        this.f5245a = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0341eo
    public final void a(io.appmetrica.analytics.impl.Cdo cdo) {
        java.util.Iterator it = this.f5245a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Ym) it.next()).a(cdo);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0341eo
    public final void a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        java.util.Iterator it = this.f5245a.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Ym) it.next()).f4056e = publicLogger;
        }
    }
}
