package o1;

import s1.C1202i;
import v1.AbstractC1217a;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149a {

    /* renamed from: a, reason: collision with root package name */
    public final i f10143a;

    public C1149a(i iVar) {
        this.f10143a = iVar;
    }

    public static C1149a a(AbstractC1150b abstractC1150b) {
        i iVar = (i) abstractC1150b;
        if (iVar.f10172e.f10408c != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
        X0.a.h(iVar);
        C1149a c1149a = new C1149a(iVar);
        iVar.f10172e.f10408c = c1149a;
        return c1149a;
    }

    public final void b() {
        i iVar = this.f10143a;
        X0.a.c(iVar);
        iVar.f10169b.getClass();
        if (iVar.f10176j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        AbstractC1217a abstractC1217a = iVar.f10172e;
        C1202i.f10332a.a(abstractC1217a.g(), "publishLoadedEvent", null, abstractC1217a.f10406a);
        iVar.f10176j = true;
    }
}
