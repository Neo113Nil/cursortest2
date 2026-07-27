package p1;

import o1.AbstractC1150b;
import o1.g;
import o1.i;
import v1.AbstractC1217a;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166b {

    /* renamed from: a, reason: collision with root package name */
    public final i f10235a;

    public C1166b(i iVar) {
        this.f10235a = iVar;
    }

    public static C1166b a(AbstractC1150b abstractC1150b) {
        i iVar = (i) abstractC1150b;
        if (g.NATIVE != ((g) iVar.f10169b.f1614b)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
        if (iVar.f) {
            throw new IllegalStateException("AdSession is started");
        }
        X0.a.h(iVar);
        AbstractC1217a abstractC1217a = iVar.f10172e;
        if (abstractC1217a.f10409d != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
        C1166b c1166b = new C1166b(iVar);
        abstractC1217a.f10409d = c1166b;
        return c1166b;
    }
}
