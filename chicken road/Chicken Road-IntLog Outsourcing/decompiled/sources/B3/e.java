package B3;

import D3.h;
import K4.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import k1.n;
import y3.AbstractC1571e;
import y3.C1568b;
import y3.g;
import y3.m;
import y3.p;
import y3.q;
import y3.r;

/* loaded from: classes.dex */
public final class e extends AbstractC1571e {

    /* renamed from: d, reason: collision with root package name */
    public static final i f279d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f280e;

    /* renamed from: a, reason: collision with root package name */
    public final g f281a = new g();

    /* renamed from: b, reason: collision with root package name */
    public Map f282b;

    /* renamed from: c, reason: collision with root package name */
    public int f283c;

    static {
        AtomicInteger atomicInteger = g.f12395n;
        f279d = new i(2, false);
        f280e = new i(2, false);
    }

    @Override // y3.AbstractC1571e
    public final int a() {
        return this.f283c;
    }

    @Override // y3.AbstractC1571e
    public final void c(m mVar) {
        g gVar = this.f281a;
        gVar.f12399d = 0;
        gVar.f12402g = 0;
        mVar.q(E3.a.f651a, this.f282b, f.f284a, gVar, f280e);
    }

    public final void d(Collection collection) {
        Map map;
        boolean isEmpty = collection.isEmpty();
        g gVar = this.f281a;
        if (isEmpty) {
            map = Collections.emptyMap();
        } else {
            A3.b bVar = new A3.b(5);
            A3.b bVar2 = new A3.b(6);
            i iVar = r.f12431a;
            Map map2 = (Map) gVar.f12406k.a();
            p pVar = (p) gVar.d(r.f12431a, new h(12));
            pVar.f12423a = map2;
            pVar.f12424b = bVar;
            pVar.f12425c = bVar2;
            pVar.f12426d = gVar;
            collection.forEach(pVar);
            map = map2;
        }
        this.f282b = map;
        C1568b c1568b = E3.a.f651a;
        f fVar = f.f284a;
        i iVar2 = r.f12431a;
        int i2 = 0;
        if (!map.isEmpty()) {
            q qVar = (q) gVar.d(f279d, new h(10));
            qVar.f12427a = 0;
            qVar.f12428b = c1568b.f12384c;
            qVar.f12429c = fVar;
            qVar.f12430d = gVar;
            map.forEach(qVar);
            i2 = qVar.f12427a;
        }
        this.f283c = i2;
    }

    public final void e() {
        n nVar;
        g gVar = this.f281a;
        gVar.f12399d = 0;
        gVar.f12400e = 0;
        for (int i2 = 0; i2 < gVar.f12403h; i2++) {
            gVar.f12401f[i2] = null;
        }
        gVar.f12402g = 0;
        gVar.f12403h = 0;
        gVar.f12404i.f945a = 0;
        gVar.f12405j.f945a = 0;
        int i3 = 0;
        while (true) {
            nVar = gVar.f12406k;
            if (i3 >= nVar.f10711a) {
                break;
            }
            ((Consumer) nVar.f10714d).accept(((ArrayList) nVar.f10712b).get(i3));
            i3++;
        }
        nVar.f10711a = 0;
        int i6 = 0;
        while (true) {
            n nVar2 = gVar.f12407l;
            if (i6 >= nVar2.f10711a) {
                nVar2.f10711a = 0;
                return;
            } else {
                ((Consumer) nVar2.f10714d).accept(((ArrayList) nVar2.f10712b).get(i6));
                i6++;
            }
        }
    }
}
