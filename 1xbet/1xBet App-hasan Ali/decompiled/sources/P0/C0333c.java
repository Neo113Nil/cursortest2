package P0;

import A0.F;
import K0.L;
import K0.N;
import a.AbstractC0444a;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.InputMethodManager;
import h0.C1989c;

/* renamed from: P0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333c {

    /* renamed from: a, reason: collision with root package name */
    public final F f4630a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.e f4631b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4633d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4634e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4635g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4636h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public w f4637j;

    /* renamed from: k, reason: collision with root package name */
    public L f4638k;

    /* renamed from: l, reason: collision with root package name */
    public q f4639l;

    /* renamed from: n, reason: collision with root package name */
    public C1989c f4641n;

    /* renamed from: o, reason: collision with root package name */
    public C1989c f4642o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4632c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.m f4640m = C0332b.f4624n;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f4643p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f4644q = i0.z.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f4645r = new Matrix();

    public C0333c(F f, v3.e eVar) {
        this.f4630a = f;
        this.f4631b = eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [W3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [i4.c, kotlin.jvm.internal.m] */
    public final void a() {
        boolean z3;
        boolean z5;
        V0.j jVar;
        W3.e eVar;
        boolean z6;
        float f;
        int c5;
        int c6;
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        v3.e eVar2 = this.f4631b;
        ?? r22 = eVar2.f20433m;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view = (View) eVar2.f20432l;
        if (inputMethodManager.isActive(view)) {
            ?? r32 = this.f4640m;
            float[] fArr = this.f4644q;
            r32.c(new i0.z(fArr));
            this.f4630a.v(fArr);
            Matrix matrix = this.f4645r;
            i0.F.n(matrix, fArr);
            w wVar = this.f4637j;
            kotlin.jvm.internal.l.c(wVar);
            q qVar = this.f4639l;
            kotlin.jvm.internal.l.c(qVar);
            L l5 = this.f4638k;
            kotlin.jvm.internal.l.c(l5);
            C1989c c1989c = this.f4641n;
            kotlin.jvm.internal.l.c(c1989c);
            C1989c c1989c2 = this.f4642o;
            kotlin.jvm.internal.l.c(c1989c2);
            boolean z7 = this.f;
            boolean z8 = this.f4635g;
            boolean z9 = this.f4636h;
            boolean z10 = this.i;
            CursorAnchorInfo.Builder builder = this.f4643p;
            builder.reset();
            builder.setMatrix(matrix);
            long j5 = wVar.f4680b;
            int e3 = N.e(j5);
            builder.setSelectionRange(e3, N.d(j5));
            V0.j jVar2 = V0.j.f5941l;
            if (!z7 || e3 < 0) {
                z3 = z8;
                z5 = z9;
                jVar = jVar2;
            } else {
                int b3 = qVar.b(e3);
                C1989c c7 = l5.c(b3);
                z3 = z8;
                z5 = z9;
                float s2 = AbstractC0444a.s(c7.f17193a, 0.0f, (int) (l5.f2794c >> 32));
                boolean w5 = AbstractC0444a.w(c1989c, s2, c7.f17194b);
                boolean w6 = AbstractC0444a.w(c1989c, s2, c7.f17196d);
                boolean z11 = l5.a(b3) == jVar2;
                int i = (w5 || w6) ? 1 : 0;
                if (!w5 || !w6) {
                    i |= 2;
                }
                if (z11) {
                    i |= 4;
                }
                float f5 = c7.f17194b;
                float f6 = c7.f17196d;
                jVar = jVar2;
                builder.setInsertionMarkerLocation(s2, f5, f6, f6, i);
            }
            K0.r rVar = l5.f2793b;
            float f7 = c1989c.f17196d;
            float f8 = c1989c.f17194b;
            if (z3) {
                N n5 = wVar.f4681c;
                int e5 = n5 != null ? N.e(n5.f2803a) : -1;
                f = f8;
                int d5 = n5 != null ? N.d(n5.f2803a) : -1;
                if (e5 < 0 || e5 >= d5) {
                    eVar = r22;
                    z6 = z10;
                } else {
                    builder.setComposingText(e5, wVar.f4679a.f2829l.subSequence(e5, d5));
                    int b5 = qVar.b(e5);
                    eVar = r22;
                    int b6 = qVar.b(d5);
                    int i5 = e5;
                    float[] fArr2 = new float[(b6 - b5) * 4];
                    z6 = z10;
                    CursorAnchorInfo.Builder builder2 = builder;
                    rVar.a(K0.F.b(b5, b6), fArr2);
                    int i6 = i5;
                    while (i6 < d5) {
                        int b7 = qVar.b(i6);
                        int i7 = (b7 - b5) * 4;
                        int i8 = b5;
                        float f9 = fArr2[i7];
                        int i9 = i6;
                        float f10 = fArr2[i7 + 1];
                        float[] fArr3 = fArr2;
                        float f11 = fArr3[i7 + 2];
                        float f12 = fArr3[i7 + 3];
                        float f13 = f;
                        int i10 = (c1989c.f17193a < f11 ? 1 : 0) & (f9 < c1989c.f17195c ? 1 : 0) & (f13 < f12 ? 1 : 0) & (f10 < f7 ? 1 : 0);
                        if (!AbstractC0444a.w(c1989c, f9, f10) || !AbstractC0444a.w(c1989c, f11, f12)) {
                            i10 |= 2;
                        }
                        if (l5.a(b7) == jVar) {
                            i10 |= 4;
                        }
                        CursorAnchorInfo.Builder builder3 = builder2;
                        int i11 = i10;
                        f = f13;
                        builder3.addCharacterBounds(i9, f9, f10, f11, f12, i11);
                        d5 = d5;
                        b5 = i8;
                        i6 = i9 + 1;
                        builder2 = builder3;
                        fArr2 = fArr3;
                    }
                    builder = builder2;
                }
            } else {
                eVar = r22;
                z6 = z10;
                f = f8;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 33 && z5) {
                editorBounds = G.i.h().setEditorBounds(i0.F.t(c1989c2));
                handwritingBounds = editorBounds.setHandwritingBounds(i0.F.t(c1989c2));
                build = handwritingBounds.build();
                builder.setEditorBoundsInfo(build);
            }
            if (i12 >= 34 && z6 && !c1989c.d() && (c5 = rVar.c(f)) <= (c6 = rVar.c(f7))) {
                while (true) {
                    builder.addVisibleLineBounds(l5.f(c5), rVar.d(c5), l5.g(c5), rVar.b(c5));
                    if (c5 == c6) {
                        break;
                    } else {
                        c5++;
                    }
                }
            }
            ((InputMethodManager) eVar.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f4634e = false;
        }
    }
}
