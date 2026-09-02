package m1;

import i1.C0071b;
import i1.p;
import i1.u;
import i1.w;
import i1.y;
import java.util.ArrayList;
import l1.g;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6130a;

    /* renamed from: b, reason: collision with root package name */
    public final g f6131b;

    /* renamed from: c, reason: collision with root package name */
    public final b f6132c;

    /* renamed from: d, reason: collision with root package name */
    public final l1.c f6133d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6134e;

    /* renamed from: f, reason: collision with root package name */
    public final w f6135f;

    /* renamed from: g, reason: collision with root package name */
    public final u f6136g;

    /* renamed from: h, reason: collision with root package name */
    public final C0071b f6137h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6138i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6139j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6140k;

    /* renamed from: l, reason: collision with root package name */
    public int f6141l;

    public e(ArrayList arrayList, g gVar, b bVar, l1.c cVar, int i2, w wVar, u uVar, C0071b c0071b, int i3, int i4, int i5) {
        this.f6130a = arrayList;
        this.f6133d = cVar;
        this.f6131b = gVar;
        this.f6132c = bVar;
        this.f6134e = i2;
        this.f6135f = wVar;
        this.f6136g = uVar;
        this.f6137h = c0071b;
        this.f6138i = i3;
        this.f6139j = i4;
        this.f6140k = i5;
    }

    public final y a(w wVar) {
        return b(wVar, this.f6131b, this.f6132c, this.f6133d);
    }

    public final y b(w wVar, g gVar, b bVar, l1.c cVar) {
        ArrayList arrayList = this.f6130a;
        int size = arrayList.size();
        int i2 = this.f6134e;
        if (i2 >= size) {
            throw new AssertionError();
        }
        this.f6141l++;
        b bVar2 = this.f6132c;
        if (bVar2 != null) {
            if (!this.f6133d.j(wVar.f1430a)) {
                throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port");
            }
        }
        if (bVar2 != null && this.f6141l > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once");
        }
        int i3 = i2 + 1;
        e eVar = new e(arrayList, gVar, bVar, cVar, i3, wVar, this.f6136g, this.f6137h, this.f6138i, this.f6139j, this.f6140k);
        p pVar = (p) arrayList.get(i2);
        y a2 = pVar.a(eVar);
        if (bVar != null && i3 < arrayList.size() && eVar.f6141l != 1) {
            throw new IllegalStateException("network interceptor " + pVar + " must call proceed() exactly once");
        }
        if (a2 == null) {
            throw new NullPointerException("interceptor " + pVar + " returned null");
        }
        if (a2.f1454g != null) {
            return a2;
        }
        throw new IllegalStateException("interceptor " + pVar + " returned a response with no body");
    }
}
