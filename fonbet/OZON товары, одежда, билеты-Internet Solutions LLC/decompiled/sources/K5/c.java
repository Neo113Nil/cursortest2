package K5;

import B5.v;
import E5.q;
import K5.b;
import K5.e;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C5153w;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: A, reason: collision with root package name */
    private E5.a<Float, Float> f15214A;

    /* renamed from: B, reason: collision with root package name */
    private final ArrayList f15215B;

    /* renamed from: C, reason: collision with root package name */
    private final RectF f15216C;

    /* renamed from: D, reason: collision with root package name */
    private final RectF f15217D;

    /* renamed from: E, reason: collision with root package name */
    private float f15218E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f15219F;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15220a;

        static {
            int[] iArr = new int[e.b.values().length];
            f15220a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15220a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(com.airbnb.lottie.g gVar, e eVar, List<e> list, B5.g gVar2) {
        super(gVar, eVar);
        b bVar;
        b gVar3;
        this.f15215B = new ArrayList();
        this.f15216C = new RectF();
        this.f15217D = new RectF();
        new Paint();
        this.f15219F = true;
        I5.b v11 = eVar.v();
        if (v11 != null) {
            E5.a<Float, Float> h11 = v11.h();
            this.f15214A = h11;
            i(h11);
            this.f15214A.a(this);
        } else {
            this.f15214A = null;
        }
        C5153w c5153w = new C5153w(((ArrayList) gVar2.k()).size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i11 = 0; i11 < c5153w.h(); i11++) {
                    b bVar3 = (b) c5153w.b(c5153w.e(i11));
                    if (bVar3 != null && (bVar = (b) c5153w.b(bVar3.f15201p.k())) != null) {
                        bVar3.u(bVar);
                    }
                }
                return;
            }
            e eVar2 = list.get(size);
            switch (b.a.f15212a[eVar2.g().ordinal()]) {
                case 1:
                    gVar3 = new g(gVar, eVar2, this, gVar2);
                    break;
                case 2:
                    gVar3 = new c(gVar, eVar2, gVar2.n(eVar2.n()), gVar2);
                    break;
                case 3:
                    gVar3 = new h(gVar, eVar2);
                    break;
                case 4:
                    gVar3 = new d(gVar, eVar2);
                    break;
                case 5:
                    gVar3 = new f(gVar, eVar2);
                    break;
                case 6:
                    gVar3 = new i(gVar, eVar2);
                    break;
                default:
                    O5.c.c("Unknown layer type " + eVar2.g());
                    gVar3 = null;
                    break;
            }
            if (gVar3 != null) {
                c5153w.f(gVar3.f15201p.e(), gVar3);
                if (bVar2 != null) {
                    bVar2.t(gVar3);
                    bVar2 = null;
                } else {
                    this.f15215B.add(0, gVar3);
                    int i12 = a.f15220a[eVar2.i().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        bVar2 = gVar3;
                    }
                }
            }
            size--;
        }
    }

    @Override // K5.b, D5.e
    public final void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        ArrayList arrayList = this.f15215B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f15216C;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) arrayList.get(size)).a(rectF2, this.f15199n, true);
            rectF.union(rectF2);
        }
    }

    @Override // K5.b, H5.f
    public final void d(P5.c cVar, Object obj) {
        super.d(cVar, obj);
        if (obj == v.f2810z) {
            if (cVar == null) {
                E5.a<Float, Float> aVar = this.f15214A;
                if (aVar != null) {
                    aVar.m(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.f15214A = qVar;
            qVar.a(this);
            i(this.f15214A);
        }
    }

    @Override // K5.b
    final void l(Canvas canvas, Matrix matrix, int i11) {
        int i12 = B5.c.f2729d;
        RectF rectF = this.f15217D;
        e eVar = this.f15201p;
        rectF.set(0.0f, 0.0f, eVar.m(), eVar.l());
        matrix.mapRect(rectF);
        this.f15200o.getClass();
        ArrayList arrayList = this.f15215B;
        canvas.save();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((this.f15219F || !"__container".equals(eVar.j())) && !rectF.isEmpty()) ? canvas.clipRect(rectF) : true) {
                ((b) arrayList.get(size)).e(canvas, matrix, i11);
            }
        }
        canvas.restore();
        int i13 = B5.c.f2729d;
    }

    @Override // K5.b
    protected final void s(H5.e eVar, int i11, ArrayList arrayList, H5.e eVar2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15215B;
            if (i12 >= arrayList2.size()) {
                return;
            }
            ((b) arrayList2.get(i12)).h(eVar, i11, arrayList, eVar2);
            i12++;
        }
    }

    @Override // K5.b
    public final void v(float f7) {
        int i11 = B5.c.f2729d;
        this.f15218E = f7;
        super.v(f7);
        E5.a<Float, Float> aVar = this.f15214A;
        e eVar = this.f15201p;
        if (aVar != null) {
            f7 = ((eVar.c().i() * this.f15214A.g().floatValue()) - eVar.c().o()) / (this.f15200o.p().e() + 0.01f);
        }
        if (this.f15214A == null) {
            f7 -= eVar.s();
        }
        if (eVar.w() != 0.0f && !"__container".equals(eVar.j())) {
            f7 /= eVar.w();
        }
        ArrayList arrayList = this.f15215B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).v(f7);
        }
        int i12 = B5.c.f2729d;
    }

    public final float w() {
        return this.f15218E;
    }

    public final void x(boolean z11) {
        this.f15219F = z11;
    }
}
