package D5;

import E5.a;
import J5.t;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements m, a.InterfaceC0168a {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6065b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.g f6066c;

    /* renamed from: d, reason: collision with root package name */
    private final E5.m f6067d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6068e;

    /* renamed from: a, reason: collision with root package name */
    private final Path f6064a = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final b f6069f = new b();

    public r(com.airbnb.lottie.g gVar, K5.b bVar, J5.r rVar) {
        rVar.getClass();
        this.f6065b = rVar.c();
        this.f6066c = gVar;
        E5.m h11 = rVar.b().h();
        this.f6067d = h11;
        bVar.i(h11);
        h11.a(this);
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6068e = false;
        this.f6066c.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i11 >= arrayList2.size()) {
                this.f6067d.n(arrayList);
                return;
            }
            c cVar = (c) arrayList2.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f6069f.a(uVar);
                    uVar.c(this);
                    i11++;
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
            i11++;
        }
    }

    @Override // D5.m
    public final Path getPath() {
        boolean z11 = this.f6068e;
        Path path = this.f6064a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f6065b) {
            this.f6068e = true;
            return path;
        }
        Path g10 = this.f6067d.g();
        if (g10 == null) {
            return path;
        }
        path.set(g10);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f6069f.b(path);
        this.f6068e = true;
        return path;
    }
}
