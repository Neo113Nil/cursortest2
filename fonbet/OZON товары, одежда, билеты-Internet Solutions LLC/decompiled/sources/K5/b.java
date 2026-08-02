package K5;

import B5.z;
import E5.a;
import E5.p;
import I5.l;
import J5.i;
import K5.e;
import M5.C3614j;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements D5.e, a.InterfaceC0168a, H5.f {

    /* renamed from: a, reason: collision with root package name */
    private final Path f15186a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f15187b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f15188c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final C5.a f15189d = new C5.a(1);

    /* renamed from: e, reason: collision with root package name */
    private final C5.a f15190e;

    /* renamed from: f, reason: collision with root package name */
    private final C5.a f15191f;

    /* renamed from: g, reason: collision with root package name */
    private final C5.a f15192g;

    /* renamed from: h, reason: collision with root package name */
    private final C5.a f15193h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f15194i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f15195j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f15196k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f15197l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f15198m;

    /* renamed from: n, reason: collision with root package name */
    final Matrix f15199n;

    /* renamed from: o, reason: collision with root package name */
    final com.airbnb.lottie.g f15200o;

    /* renamed from: p, reason: collision with root package name */
    final e f15201p;

    /* renamed from: q, reason: collision with root package name */
    private E5.h f15202q;

    /* renamed from: r, reason: collision with root package name */
    private E5.d f15203r;

    /* renamed from: s, reason: collision with root package name */
    private b f15204s;

    /* renamed from: t, reason: collision with root package name */
    private b f15205t;

    /* renamed from: u, reason: collision with root package name */
    private List<b> f15206u;

    /* renamed from: v, reason: collision with root package name */
    private final ArrayList f15207v;

    /* renamed from: w, reason: collision with root package name */
    final p f15208w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15209x;

    /* renamed from: y, reason: collision with root package name */
    float f15210y;

    /* renamed from: z, reason: collision with root package name */
    BlurMaskFilter f15211z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15212a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f15213b;

        static {
            int[] iArr = new int[i.a.values().length];
            f15213b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15213b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15213b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15213b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f15212a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15212a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15212a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15212a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15212a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15212a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15212a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(com.airbnb.lottie.g gVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f15190e = new C5.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f15191f = new C5.a(mode2);
        C5.a aVar = new C5.a(1);
        this.f15192g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        C5.a aVar2 = new C5.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f15193h = aVar2;
        this.f15194i = new RectF();
        this.f15195j = new RectF();
        this.f15196k = new RectF();
        this.f15197l = new RectF();
        this.f15198m = new RectF();
        this.f15199n = new Matrix();
        this.f15207v = new ArrayList();
        this.f15209x = true;
        this.f15210y = 0.0f;
        this.f15200o = gVar;
        this.f15201p = eVar;
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        l x11 = eVar.x();
        x11.getClass();
        p pVar = new p(x11);
        this.f15208w = pVar;
        pVar.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            E5.h hVar = new E5.h(eVar.h());
            this.f15202q = hVar;
            Iterator it = hVar.a().iterator();
            while (it.hasNext()) {
                ((E5.a) it.next()).a(this);
            }
            Iterator it2 = this.f15202q.c().iterator();
            while (it2.hasNext()) {
                E5.a<?, ?> aVar3 = (E5.a) it2.next();
                i(aVar3);
                aVar3.a(this);
            }
        }
        e eVar2 = this.f15201p;
        if (eVar2.f().isEmpty()) {
            if (true != this.f15209x) {
                this.f15209x = true;
                this.f15200o.invalidateSelf();
                return;
            }
            return;
        }
        E5.d dVar = new E5.d(eVar2.f());
        this.f15203r = dVar;
        dVar.k();
        this.f15203r.a(new a.InterfaceC0168a() { // from class: K5.a
            @Override // E5.a.InterfaceC0168a
            public final void f() {
                b.c(b.this);
            }
        });
        boolean z11 = this.f15203r.g().floatValue() == 1.0f;
        if (z11 != this.f15209x) {
            this.f15209x = z11;
            this.f15200o.invalidateSelf();
        }
        i(this.f15203r);
    }

    public static void c(b bVar) {
        boolean z11 = bVar.f15203r.n() == 1.0f;
        if (z11 != bVar.f15209x) {
            bVar.f15209x = z11;
            bVar.f15200o.invalidateSelf();
        }
    }

    private void j() {
        if (this.f15206u != null) {
            return;
        }
        if (this.f15205t == null) {
            this.f15206u = Collections.EMPTY_LIST;
            return;
        }
        this.f15206u = new ArrayList();
        for (b bVar = this.f15205t; bVar != null; bVar = bVar.f15205t) {
            this.f15206u.add(bVar);
        }
    }

    private void k(Canvas canvas) {
        int i11 = B5.c.f2729d;
        RectF rectF = this.f15194i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f15193h);
    }

    @Override // D5.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f15194i.set(0.0f, 0.0f, 0.0f, 0.0f);
        j();
        Matrix matrix2 = this.f15199n;
        matrix2.set(matrix);
        if (z11) {
            List<b> list = this.f15206u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(this.f15206u.get(size).f15208w.f());
                }
            } else {
                b bVar = this.f15205t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f15208w.f());
                }
            }
        }
        matrix2.preConcat(this.f15208w.f());
    }

    @Override // H5.f
    public void d(P5.c cVar, Object obj) {
        this.f15208w.c(cVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0370  */
    @Override // D5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, Matrix matrix, int i11) {
        int i12;
        e eVar;
        com.airbnb.lottie.g gVar;
        float f7;
        e eVar2;
        com.airbnb.lottie.g gVar2;
        RectF rectF;
        Matrix matrix2;
        int i13;
        char c11;
        Integer g10;
        int i14 = 1;
        int i15 = B5.c.f2729d;
        if (this.f15209x) {
            e eVar3 = this.f15201p;
            if (eVar3.y()) {
                return;
            }
            j();
            Matrix matrix3 = this.f15187b;
            matrix3.reset();
            matrix3.set(matrix);
            for (int size = this.f15206u.size() - 1; size >= 0; size--) {
                matrix3.preConcat(this.f15206u.get(size).f15208w.f());
            }
            int i16 = B5.c.f2729d;
            p pVar = this.f15208w;
            E5.a<?, Integer> h11 = pVar.h();
            int intValue = (int) ((((i11 / 255.0f) * ((h11 == null || (g10 = h11.g()) == null) ? 100 : g10.intValue())) / 100.0f) * 255.0f);
            boolean z11 = this.f15204s != null;
            com.airbnb.lottie.g gVar3 = this.f15200o;
            if (!z11 && !q()) {
                matrix3.preConcat(pVar.f());
                l(canvas, matrix3, intValue);
                z m11 = gVar3.p().m();
                eVar3.getClass();
                m11.getClass();
                return;
            }
            RectF rectF2 = this.f15194i;
            a(rectF2, matrix3, false);
            if (this.f15204s != null && eVar3.i() != e.b.INVERT) {
                RectF rectF3 = this.f15197l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f15204s.a(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix3.preConcat(pVar.f());
            RectF rectF4 = this.f15196k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean q11 = q();
            Path path = this.f15186a;
            E5.h hVar = this.f15202q;
            if (q11) {
                int size2 = hVar.b().size();
                int i17 = 0;
                while (i17 < size2) {
                    J5.i iVar = hVar.b().get(i17);
                    Path path2 = (Path) ((E5.a) hVar.a().get(i17)).g();
                    if (path2 != null) {
                        path.set(path2);
                        path.transform(matrix3);
                        int i18 = a.f15213b[iVar.a().ordinal()];
                        if (i18 != i14) {
                            i12 = i14;
                            if (i18 != 2 && ((i18 != 3 && i18 != 4) || !iVar.d())) {
                                RectF rectF5 = this.f15198m;
                                path.computeBounds(rectF5, false);
                                if (i17 == 0) {
                                    rectF4.set(rectF5);
                                } else {
                                    eVar2 = eVar3;
                                    gVar2 = gVar3;
                                    rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                    i17++;
                                    i14 = i12;
                                    eVar3 = eVar2;
                                    gVar3 = gVar2;
                                }
                            }
                            eVar = eVar3;
                            gVar = gVar3;
                            break;
                        }
                    } else {
                        i12 = i14;
                    }
                    eVar2 = eVar3;
                    gVar2 = gVar3;
                    i17++;
                    i14 = i12;
                    eVar3 = eVar2;
                    gVar3 = gVar2;
                }
                i12 = i14;
                eVar = eVar3;
                gVar = gVar3;
                if (!rectF2.intersect(rectF4)) {
                    f7 = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    rectF = this.f15195j;
                    rectF.set(f7, f7, canvas.getWidth(), canvas.getHeight());
                    matrix2 = this.f15188c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                        matrix2.invert(matrix2);
                        matrix2.mapRect(rectF);
                    }
                    if (!rectF2.intersect(rectF)) {
                        rectF2.set(f7, f7, f7, f7);
                    }
                    int i19 = B5.c.f2729d;
                    if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                        C5.a aVar = this.f15189d;
                        aVar.setAlpha(255);
                        O5.g.g(canvas, aVar, rectF2);
                        k(canvas);
                        l(canvas, matrix3, intValue);
                        if (q()) {
                            C5.a aVar2 = this.f15190e;
                            canvas.saveLayer(rectF2, aVar2);
                            if (Build.VERSION.SDK_INT < 28) {
                                k(canvas);
                            }
                            int i21 = 0;
                            while (i21 < hVar.b().size()) {
                                J5.i iVar2 = hVar.b().get(i21);
                                E5.a aVar3 = (E5.a) hVar.a().get(i21);
                                E5.a aVar4 = (E5.a) hVar.c().get(i21);
                                int i22 = a.f15213b[iVar2.a().ordinal()];
                                if (i22 != i12) {
                                    C5.a aVar5 = this.f15191f;
                                    i13 = i21;
                                    if (i22 == 2) {
                                        if (i13 == 0) {
                                            aVar.setColor(-16777216);
                                            aVar.setAlpha(255);
                                            canvas.drawRect(rectF2, aVar);
                                        }
                                        if (iVar2.d()) {
                                            O5.g.g(canvas, aVar5, rectF2);
                                            canvas.drawRect(rectF2, aVar);
                                            aVar5.setAlpha((int) (((Integer) aVar4.g()).intValue() * 2.55f));
                                            path.set((Path) aVar3.g());
                                            path.transform(matrix3);
                                            canvas.drawPath(path, aVar5);
                                            canvas.restore();
                                        } else {
                                            path.set((Path) aVar3.g());
                                            path.transform(matrix3);
                                            canvas.drawPath(path, aVar5);
                                        }
                                    } else if (i22 != 3) {
                                        if (i22 == 4) {
                                            if (iVar2.d()) {
                                                O5.g.g(canvas, aVar, rectF2);
                                                canvas.drawRect(rectF2, aVar);
                                                path.set((Path) aVar3.g());
                                                path.transform(matrix3);
                                                aVar.setAlpha((int) (((Integer) aVar4.g()).intValue() * 2.55f));
                                                canvas.drawPath(path, aVar5);
                                                canvas.restore();
                                            } else {
                                                path.set((Path) aVar3.g());
                                                path.transform(matrix3);
                                                aVar.setAlpha((int) (((Integer) aVar4.g()).intValue() * 2.55f));
                                                canvas.drawPath(path, aVar);
                                            }
                                        }
                                    } else if (iVar2.d()) {
                                        O5.g.g(canvas, aVar2, rectF2);
                                        canvas.drawRect(rectF2, aVar);
                                        aVar5.setAlpha((int) (((Integer) aVar4.g()).intValue() * 2.55f));
                                        path.set((Path) aVar3.g());
                                        path.transform(matrix3);
                                        canvas.drawPath(path, aVar5);
                                        canvas.restore();
                                    } else {
                                        O5.g.g(canvas, aVar2, rectF2);
                                        path.set((Path) aVar3.g());
                                        path.transform(matrix3);
                                        aVar.setAlpha((int) (((Integer) aVar4.g()).intValue() * 2.55f));
                                        canvas.drawPath(path, aVar);
                                        canvas.restore();
                                    }
                                } else {
                                    i13 = i21;
                                    if (!hVar.a().isEmpty()) {
                                        for (int i23 = 0; i23 < hVar.b().size(); i23++) {
                                            if (hVar.b().get(i23).a() == i.a.MASK_MODE_NONE) {
                                            }
                                        }
                                        c11 = 255;
                                        i12 = 1;
                                        aVar.setAlpha(255);
                                        canvas.drawRect(rectF2, aVar);
                                        i21 = i13 + 1;
                                    }
                                }
                                c11 = 255;
                                i12 = 1;
                                i21 = i13 + 1;
                            }
                            int i24 = B5.c.f2729d;
                            canvas.restore();
                        }
                        if (this.f15204s != null) {
                            canvas.saveLayer(rectF2, this.f15192g);
                            k(canvas);
                            this.f15204s.e(canvas, matrix, intValue);
                            canvas.restore();
                        }
                        canvas.restore();
                    }
                    z m12 = gVar.p().m();
                    eVar.getClass();
                    m12.getClass();
                }
                f7 = 0.0f;
                rectF = this.f15195j;
                rectF.set(f7, f7, canvas.getWidth(), canvas.getHeight());
                matrix2 = this.f15188c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                int i192 = B5.c.f2729d;
                if (rectF2.width() >= 1.0f) {
                    C5.a aVar6 = this.f15189d;
                    aVar6.setAlpha(255);
                    O5.g.g(canvas, aVar6, rectF2);
                    k(canvas);
                    l(canvas, matrix3, intValue);
                    if (q()) {
                    }
                    if (this.f15204s != null) {
                    }
                    canvas.restore();
                }
                z m122 = gVar.p().m();
                eVar.getClass();
                m122.getClass();
            }
            i12 = i14;
            eVar = eVar3;
            gVar = gVar3;
            f7 = 0.0f;
            rectF = this.f15195j;
            rectF.set(f7, f7, canvas.getWidth(), canvas.getHeight());
            matrix2 = this.f15188c;
            canvas.getMatrix(matrix2);
            if (!matrix2.isIdentity()) {
            }
            if (!rectF2.intersect(rectF)) {
            }
            int i1922 = B5.c.f2729d;
            if (rectF2.width() >= 1.0f) {
            }
            z m1222 = gVar.p().m();
            eVar.getClass();
            m1222.getClass();
        }
    }

    @Override // E5.a.InterfaceC0168a
    public final void f() {
        this.f15200o.invalidateSelf();
    }

    @Override // D5.c
    public final void g(List<D5.c> list, List<D5.c> list2) {
    }

    @Override // H5.f
    public final void h(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        b bVar = this.f15204s;
        e eVar3 = this.f15201p;
        if (bVar != null) {
            H5.e a11 = eVar2.a(bVar.f15201p.j());
            if (eVar.b(i11, this.f15204s.f15201p.j())) {
                arrayList.add(a11.g(this.f15204s));
            }
            if (eVar.f(i11, eVar3.j())) {
                this.f15204s.s(eVar, eVar.d(i11, this.f15204s.f15201p.j()) + i11, arrayList, a11);
            }
        }
        if (eVar.e(i11, eVar3.j())) {
            if (!"__container".equals(eVar3.j())) {
                eVar2 = eVar2.a(eVar3.j());
                if (eVar.b(i11, eVar3.j())) {
                    arrayList.add(eVar2.g(this));
                }
            }
            if (eVar.f(i11, eVar3.j())) {
                s(eVar, eVar.d(i11, eVar3.j()) + i11, arrayList, eVar2);
            }
        }
    }

    public final void i(E5.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f15207v.add(aVar);
    }

    abstract void l(Canvas canvas, Matrix matrix, int i11);

    public final J5.h m() {
        return this.f15201p.a();
    }

    public J5.a n() {
        return this.f15201p.b();
    }

    public final BlurMaskFilter o(float f7) {
        if (this.f15210y == f7) {
            return this.f15211z;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f7 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f15211z = blurMaskFilter;
        this.f15210y = f7;
        return blurMaskFilter;
    }

    public C3614j p() {
        return this.f15201p.d();
    }

    final boolean q() {
        E5.h hVar = this.f15202q;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    public final void r(E5.a<?, ?> aVar) {
        this.f15207v.remove(aVar);
    }

    void s(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
    }

    final void t(b bVar) {
        this.f15204s = bVar;
    }

    final void u(b bVar) {
        this.f15205t = bVar;
    }

    void v(float f7) {
        int i11 = B5.c.f2729d;
        this.f15208w.j(f7);
        E5.h hVar = this.f15202q;
        if (hVar != null) {
            for (int i12 = 0; i12 < hVar.a().size(); i12++) {
                ((E5.a) hVar.a().get(i12)).l(f7);
            }
            int i13 = B5.c.f2729d;
        }
        E5.d dVar = this.f15203r;
        if (dVar != null) {
            dVar.l(f7);
        }
        b bVar = this.f15204s;
        if (bVar != null) {
            bVar.v(f7);
        }
        ArrayList arrayList = this.f15207v;
        arrayList.size();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ((E5.a) arrayList.get(i14)).l(f7);
        }
        arrayList.size();
        int i15 = B5.c.f2729d;
    }
}
