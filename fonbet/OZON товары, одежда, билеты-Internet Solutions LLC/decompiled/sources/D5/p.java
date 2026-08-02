package D5;

import B5.v;
import E5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes8.dex */
public final class p implements e, m, j, a.InterfaceC0168a, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f6051a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f6052b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.g f6053c;

    /* renamed from: d, reason: collision with root package name */
    private final K5.b f6054d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6055e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6056f;

    /* renamed from: g, reason: collision with root package name */
    private final E5.d f6057g;

    /* renamed from: h, reason: collision with root package name */
    private final E5.d f6058h;

    /* renamed from: i, reason: collision with root package name */
    private final E5.p f6059i;

    /* renamed from: j, reason: collision with root package name */
    private d f6060j;

    public p(com.airbnb.lottie.g gVar, K5.b bVar, J5.m mVar) {
        this.f6053c = gVar;
        this.f6054d = bVar;
        this.f6055e = mVar.c();
        this.f6056f = mVar.f();
        E5.a<Float, Float> h11 = mVar.b().h();
        this.f6057g = (E5.d) h11;
        bVar.i(h11);
        h11.a(this);
        E5.a<Float, Float> h12 = mVar.d().h();
        this.f6058h = (E5.d) h12;
        bVar.i(h12);
        h12.a(this);
        I5.l e11 = mVar.e();
        e11.getClass();
        E5.p pVar = new E5.p(e11);
        this.f6059i = pVar;
        pVar.a(bVar);
        pVar.b(this);
    }

    @Override // D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f6060j.a(rectF, matrix, z11);
    }

    @Override // D5.j
    public final void c(ListIterator<c> listIterator) {
        if (this.f6060j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f6060j = new d(this.f6053c, this.f6054d, "Repeater", this.f6056f, arrayList, null);
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        if (this.f6059i.c(cVar, obj)) {
            return;
        }
        if (obj == v.f2800p) {
            this.f6057g.m(cVar);
        } else if (obj == v.f2801q) {
            this.f6058h.m(cVar);
        }
    }

    @Override // D5.e
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        float floatValue = this.f6057g.g().floatValue();
        float floatValue2 = this.f6058h.g().floatValue();
        E5.p pVar = this.f6059i;
        float floatValue3 = pVar.i().g().floatValue() / 100.0f;
        float floatValue4 = pVar.e().g().floatValue() / 100.0f;
        for (int i12 = ((int) floatValue) - 1; i12 >= 0; i12--) {
            Matrix matrix2 = this.f6051a;
            matrix2.set(matrix);
            float f7 = i12;
            matrix2.preConcat(pVar.g(f7 + floatValue2));
            this.f6060j.e(canvas, matrix2, (int) (O5.f.e(floatValue3, floatValue4, f7 / floatValue) * i11));
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f6053c.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        this.f6060j.g(list, list2);
    }

    @Override // D5.c
    public final String getName() {
        return this.f6055e;
    }

    @Override // D5.m
    public final Path getPath() {
        Path path = this.f6060j.getPath();
        Path path2 = this.f6052b;
        path2.reset();
        float floatValue = this.f6057g.g().floatValue();
        float floatValue2 = this.f6058h.g().floatValue();
        for (int i11 = ((int) floatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix = this.f6051a;
            matrix.set(this.f6059i.g(i11 + floatValue2));
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        O5.f.f(eVar, i11, arrayList, eVar2, this);
        for (int i12 = 0; i12 < ((ArrayList) this.f6060j.c()).size(); i12++) {
            c cVar = (c) ((ArrayList) this.f6060j.c()).get(i12);
            if (cVar instanceof k) {
                O5.f.f(eVar, i11, arrayList, eVar2, (k) cVar);
            }
        }
    }
}
