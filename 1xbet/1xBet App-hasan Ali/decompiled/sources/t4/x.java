package t4;

import c4.InterfaceC0543d;

/* loaded from: classes.dex */
public final class x implements a4.c, InterfaceC0543d {

    /* renamed from: k, reason: collision with root package name */
    public final a4.c f19638k;

    /* renamed from: l, reason: collision with root package name */
    public final a4.h f19639l;

    public x(a4.c cVar, a4.h hVar) {
        this.f19638k = cVar;
        this.f19639l = hVar;
    }

    @Override // c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        a4.c cVar = this.f19638k;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f19639l;
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        this.f19638k.resumeWith(obj);
    }
}
