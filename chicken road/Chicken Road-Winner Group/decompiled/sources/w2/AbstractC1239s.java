package w2;

import g2.AbstractC0317a;
import g2.C0320d;
import g2.InterfaceC0321e;
import g2.InterfaceC0322f;

/* renamed from: w2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1239s extends AbstractC0317a implements InterfaceC0321e {

    /* renamed from: b, reason: collision with root package name */
    public static final r f10523b = new r(C0320d.f4980a, C1238q.f10520e);

    public AbstractC1239s() {
        super(C0320d.f4980a);
    }

    public abstract void c(g2.h hVar, Runnable runnable);

    public boolean d() {
        return !(this instanceof i0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.internal.k, o2.l] */
    @Override // g2.AbstractC0317a, g2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2.h g(g2.g key) {
        kotlin.jvm.internal.j.e(key, "key");
        boolean z3 = key instanceof r;
        g2.i iVar = g2.i.f4981a;
        if (z3) {
            r rVar = (r) key;
            g2.g gVar = this.f4977a;
            return (gVar == rVar || rVar.f10522b == gVar) ? ((InterfaceC0322f) rVar.f10521a.invoke(this)) != null ? iVar : this : this;
        }
        if (C0320d.f4980a == key) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.k, o2.l] */
    @Override // g2.AbstractC0317a, g2.h
    public final InterfaceC0322f k(g2.g key) {
        InterfaceC0322f interfaceC0322f;
        kotlin.jvm.internal.j.e(key, "key");
        if (!(key instanceof r)) {
            if (C0320d.f4980a == key) {
                return this;
            }
            return null;
        }
        r rVar = (r) key;
        g2.g gVar = this.f4977a;
        if ((gVar == rVar || rVar.f10522b == gVar) && (interfaceC0322f = (InterfaceC0322f) rVar.f10521a.invoke(this)) != null) {
            return interfaceC0322f;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1242v.c(this);
    }
}
