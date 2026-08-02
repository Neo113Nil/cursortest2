package G;

import K0.L;
import K0.N;
import a.AbstractC0444a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import h0.C1989c;
import r0.AbstractC2346c;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0126c f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final v f1759b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1762e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1763g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1764h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public P0.w f1765j;

    /* renamed from: k, reason: collision with root package name */
    public L f1766k;

    /* renamed from: l, reason: collision with root package name */
    public P0.q f1767l;

    /* renamed from: m, reason: collision with root package name */
    public C1989c f1768m;

    /* renamed from: n, reason: collision with root package name */
    public C1989c f1769n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1760c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f1770o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f1771p = i0.z.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f1772q = new Matrix();

    public y(C0126c c0126c, v vVar) {
        this.f1758a = c0126c;
        this.f1759b = vVar;
    }

    public final void a() {
        boolean z3;
        boolean z5;
        V0.j jVar;
        v vVar = this.f1759b;
        InputMethodManager g5 = vVar.g();
        View view = (View) vVar.f1749l;
        if (g5.isActive(view)) {
            float[] fArr = this.f1771p;
            i0.z.d(fArr);
            InterfaceC2637x interfaceC2637x = (InterfaceC2637x) this.f1758a.f1716k.f1755B.getValue();
            if (interfaceC2637x != null) {
                if (!interfaceC2637x.F()) {
                    interfaceC2637x = null;
                }
                if (interfaceC2637x != null) {
                    interfaceC2637x.G(fArr);
                }
            }
            C1989c c1989c = this.f1769n;
            kotlin.jvm.internal.l.c(c1989c);
            float f = -c1989c.f17193a;
            C1989c c1989c2 = this.f1769n;
            kotlin.jvm.internal.l.c(c1989c2);
            i0.z.f(fArr, f, -c1989c2.f17194b);
            Matrix matrix = this.f1772q;
            i0.F.n(matrix, fArr);
            P0.w wVar = this.f1765j;
            kotlin.jvm.internal.l.c(wVar);
            P0.q qVar = this.f1767l;
            kotlin.jvm.internal.l.c(qVar);
            L l5 = this.f1766k;
            kotlin.jvm.internal.l.c(l5);
            C1989c c1989c3 = this.f1768m;
            kotlin.jvm.internal.l.c(c1989c3);
            C1989c c1989c4 = this.f1769n;
            kotlin.jvm.internal.l.c(c1989c4);
            boolean z6 = this.f;
            boolean z7 = this.f1763g;
            boolean z8 = this.f1764h;
            boolean z9 = this.i;
            CursorAnchorInfo.Builder builder = this.f1770o;
            builder.reset();
            builder.setMatrix(matrix);
            long j5 = wVar.f4680b;
            int e3 = N.e(j5);
            builder.setSelectionRange(e3, N.d(j5));
            V0.j jVar2 = V0.j.f5941l;
            if (!z6 || e3 < 0) {
                z3 = z7;
                z5 = z8;
                jVar = jVar2;
            } else {
                int b3 = qVar.b(e3);
                C1989c c5 = l5.c(b3);
                z3 = z7;
                z5 = z8;
                float s2 = AbstractC0444a.s(c5.f17193a, 0.0f, (int) (l5.f2794c >> 32));
                boolean i = AbstractC2346c.i(c1989c3, s2, c5.f17194b);
                boolean i5 = AbstractC2346c.i(c1989c3, s2, c5.f17196d);
                boolean z10 = l5.a(b3) == jVar2;
                int i6 = (i || i5) ? 1 : 0;
                if (!i || !i5) {
                    i6 |= 2;
                }
                if (z10) {
                    i6 |= 4;
                }
                float f5 = c5.f17194b;
                float f6 = c5.f17196d;
                jVar = jVar2;
                builder.setInsertionMarkerLocation(s2, f5, f6, f6, i6);
            }
            if (z3) {
                N n5 = wVar.f4681c;
                int e5 = n5 != null ? N.e(n5.f2803a) : -1;
                int d5 = n5 != null ? N.d(n5.f2803a) : -1;
                if (e5 >= 0 && e5 < d5) {
                    builder.setComposingText(e5, wVar.f4679a.f2829l.subSequence(e5, d5));
                    int b5 = qVar.b(e5);
                    int b6 = qVar.b(d5);
                    float[] fArr2 = new float[(b6 - b5) * 4];
                    P0.q qVar2 = qVar;
                    l5.f2793b.a(K0.F.b(b5, b6), fArr2);
                    while (e5 < d5) {
                        P0.q qVar3 = qVar2;
                        int b7 = qVar3.b(e5);
                        int i7 = (b7 - b5) * 4;
                        float[] fArr3 = fArr2;
                        float f7 = fArr3[i7];
                        v vVar2 = vVar;
                        float f8 = fArr3[i7 + 1];
                        int i8 = b5;
                        float f9 = fArr3[i7 + 2];
                        float f10 = fArr3[i7 + 3];
                        int i9 = (c1989c3.f17193a < f9 ? 1 : 0) & (f7 < c1989c3.f17195c ? 1 : 0) & (c1989c3.f17194b < f10 ? 1 : 0) & (f8 < c1989c3.f17196d ? 1 : 0);
                        if (!AbstractC2346c.i(c1989c3, f7, f8) || !AbstractC2346c.i(c1989c3, f9, f10)) {
                            i9 |= 2;
                        }
                        if (l5.a(b7) == jVar) {
                            i9 |= 4;
                        }
                        builder.addCharacterBounds(e5, f7, f8, f9, f10, i9);
                        e5++;
                        fArr2 = fArr3;
                        vVar = vVar2;
                        b5 = i8;
                        qVar2 = qVar3;
                    }
                }
            }
            v vVar3 = vVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33 && z5) {
                k.a(builder, c1989c4);
            }
            if (i10 >= 34 && z9) {
                l.a(builder, l5, c1989c3);
            }
            vVar3.g().updateCursorAnchorInfo(view, builder.build());
            this.f1762e = false;
        }
    }
}
