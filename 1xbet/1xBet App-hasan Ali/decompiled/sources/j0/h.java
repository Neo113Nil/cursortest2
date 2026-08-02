package j0;

import r.AbstractC2334l;
import r.C2343v;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C2343v f17444a;

    static {
        q qVar = d.f17419e;
        int i = qVar.f17414c;
        e eVar = new e(qVar, qVar, 1);
        l lVar = d.f17436x;
        int i5 = lVar.f17414c << 6;
        int i6 = qVar.f17414c;
        int i7 = i5 | i6;
        g gVar = new g(qVar, lVar, 0);
        int i8 = (i6 << 6) | lVar.f17414c;
        g gVar2 = new g(lVar, qVar, 0);
        C2343v c2343v = AbstractC2334l.f19016a;
        C2343v c2343v2 = new C2343v();
        c2343v2.g(i | (i << 6), eVar);
        c2343v2.g(i7, gVar);
        c2343v2.g(i8, gVar2);
        f17444a = c2343v2;
    }
}
