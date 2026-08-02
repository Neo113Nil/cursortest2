package D5;

import E5.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements e, m, a.InterfaceC0168a, H5.f {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f5956a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f5957b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f5958c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5959d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5960e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f5961f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.g f5962g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f5963h;

    /* renamed from: i, reason: collision with root package name */
    private E5.p f5964i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(com.airbnb.lottie.g gVar, K5.b bVar, J5.q qVar, B5.g gVar2) {
        this(gVar, bVar, r3, r4, r5, r11);
        I5.l lVar;
        String c11 = qVar.c();
        boolean d11 = qVar.d();
        List<J5.c> b11 = qVar.b();
        ArrayList arrayList = new ArrayList(b11.size());
        int i11 = 0;
        for (int i12 = 0; i12 < b11.size(); i12++) {
            c a11 = b11.get(i12).a(gVar, gVar2, bVar);
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        List<J5.c> b12 = qVar.b();
        while (true) {
            if (i11 >= b12.size()) {
                lVar = null;
                break;
            }
            J5.c cVar = b12.get(i11);
            if (cVar instanceof I5.l) {
                lVar = (I5.l) cVar;
                break;
            }
            i11++;
        }
    }

    @Override // D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        Matrix matrix2 = this.f5956a;
        matrix2.set(matrix);
        E5.p pVar = this.f5964i;
        if (pVar != null) {
            matrix2.preConcat(pVar.f());
        }
        RectF rectF2 = this.f5958c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f5961f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(rectF2, matrix2, z11);
                rectF.union(rectF2);
            }
        }
    }

    public final List<c> c() {
        return this.f5961f;
    }

    @Override // H5.f
    public final void d(P5.c cVar, Object obj) {
        E5.p pVar = this.f5964i;
        if (pVar != null) {
            pVar.c(cVar, obj);
        }
    }

    @Override // D5.e
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        if (this.f5960e) {
            return;
        }
        Matrix matrix2 = this.f5956a;
        matrix2.set(matrix);
        E5.p pVar = this.f5964i;
        if (pVar != null) {
            matrix2.preConcat(pVar.f());
            i11 = (int) (((((pVar.h() == null ? 100 : pVar.h().g().intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        this.f5962g.getClass();
        ArrayList arrayList = this.f5961f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).e(canvas, matrix2, i11);
            }
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f5962g.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        int size = list.size();
        ArrayList arrayList = this.f5961f;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.g(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // D5.c
    public final String getName() {
        throw null;
    }

    @Override // D5.m
    public final Path getPath() {
        Matrix matrix = this.f5956a;
        matrix.reset();
        E5.p pVar = this.f5964i;
        if (pVar != null) {
            matrix.set(pVar.f());
        }
        Path path = this.f5957b;
        path.reset();
        if (!this.f5960e) {
            ArrayList arrayList = this.f5961f;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof m) {
                    path.addPath(((m) cVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        String str = this.f5959d;
        if (!eVar.e(i11, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2 = eVar2.a(str);
            if (eVar.b(i11, str)) {
                arrayList.add(eVar2.g(this));
            }
        }
        if (!eVar.f(i11, str)) {
            return;
        }
        int d11 = eVar.d(i11, str) + i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f5961f;
            if (i12 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i12);
            if (cVar instanceof H5.f) {
                ((H5.f) cVar).h(eVar, d11, arrayList, eVar2);
            }
            i12++;
        }
    }

    final List<m> i() {
        if (this.f5963h == null) {
            this.f5963h = new ArrayList();
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f5961f;
                if (i11 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i11);
                if (cVar instanceof m) {
                    this.f5963h.add((m) cVar);
                }
                i11++;
            }
        }
        return this.f5963h;
    }

    final Matrix j() {
        E5.p pVar = this.f5964i;
        if (pVar != null) {
            return pVar.f();
        }
        Matrix matrix = this.f5956a;
        matrix.reset();
        return matrix;
    }

    d(com.airbnb.lottie.g gVar, K5.b bVar, String str, boolean z11, ArrayList arrayList, I5.l lVar) {
        new C5.a();
        new RectF();
        this.f5956a = new Matrix();
        this.f5957b = new Path();
        this.f5958c = new RectF();
        this.f5959d = str;
        this.f5962g = gVar;
        this.f5960e = z11;
        this.f5961f = arrayList;
        if (lVar != null) {
            E5.p pVar = new E5.p(lVar);
            this.f5964i = pVar;
            pVar.a(bVar);
            pVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof j) {
                arrayList2.add((j) cVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).c(arrayList.listIterator(arrayList.size()));
        }
    }
}
