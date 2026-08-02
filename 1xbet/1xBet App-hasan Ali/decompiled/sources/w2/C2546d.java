package w2;

import L4.G;
import L4.I;
import L4.n;
import L4.o;
import L4.u;
import L4.v;
import L4.z;
import X3.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2546d extends o {

    /* renamed from: b, reason: collision with root package name */
    public final v f20505b;

    public C2546d(v vVar) {
        l.f("delegate", vVar);
        this.f20505b = vVar;
    }

    @Override // L4.o
    public final void a(z zVar) {
        l.f("path", zVar);
        this.f20505b.a(zVar);
    }

    @Override // L4.o
    public final List d(z zVar) {
        l.f("dir", zVar);
        List d5 = this.f20505b.d(zVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) d5;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            z zVar2 = (z) obj;
            l.f("path", zVar2);
            arrayList.add(zVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // L4.o
    public final n f(z zVar) {
        l.f("path", zVar);
        n f = this.f20505b.f(zVar);
        if (f == null) {
            return null;
        }
        z zVar2 = (z) f.f3102d;
        if (zVar2 == null) {
            return f;
        }
        Map map = (Map) f.i;
        l.f("extras", map);
        return new n(f.f3100b, f.f3101c, zVar2, (Long) f.f3103e, (Long) f.f, (Long) f.f3104g, (Long) f.f3105h, map);
    }

    @Override // L4.o
    public final u g(z zVar) {
        return this.f20505b.g(zVar);
    }

    @Override // L4.o
    public final G h(z zVar) {
        n f;
        z b3 = zVar.b();
        if (b3 != null) {
            k kVar = new k();
            while (b3 != null && !c(b3)) {
                kVar.addFirst(b3);
                b3 = b3.b();
            }
            Iterator<E> it = kVar.iterator();
            while (it.hasNext()) {
                z zVar2 = (z) it.next();
                l.f("dir", zVar2);
                v vVar = this.f20505b;
                vVar.getClass();
                if (!zVar2.e().mkdir() && ((f = vVar.f(zVar2)) == null || !f.f3101c)) {
                    throw new IOException("failed to create directory: " + zVar2);
                }
            }
        }
        return this.f20505b.h(zVar);
    }

    @Override // L4.o
    public final I i(z zVar) {
        l.f("file", zVar);
        return this.f20505b.i(zVar);
    }

    public final void j(z zVar, z zVar2) {
        l.f("source", zVar);
        l.f("target", zVar2);
        this.f20505b.j(zVar, zVar2);
    }

    public final String toString() {
        return x.a(C2546d.class).b() + '(' + this.f20505b + ')';
    }
}
