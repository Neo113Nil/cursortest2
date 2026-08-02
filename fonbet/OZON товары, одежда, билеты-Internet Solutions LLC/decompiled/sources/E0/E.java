package E0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import k1.C7460f;
import l1.C7783A;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10711a;
import xe.C10727i;

/* loaded from: classes8.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c1 f6972a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Z0 f6973b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2945s f6974c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xe.M f6975d;

    /* renamed from: e, reason: collision with root package name */
    private xe.B0 f6976e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6977f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6978g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6979h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6980i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f6981j = new CursorAnchorInfo.Builder();

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final float[] f6982k = C7837o0.b();

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Matrix f6983l = new Matrix();

    public E(@NotNull c1 c1Var, @NotNull Z0 z02, @NotNull InterfaceC2945s interfaceC2945s, @NotNull xe.M m11) {
        this.f6972a = c1Var;
        this.f6973b = z02;
        this.f6974c = interfaceC2945s;
        this.f6975d = m11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0158, code lost:
    
        if (E0.C2919e0.a(r4, r8.o(), r8.h()) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CursorAnchorInfo c() {
        B1.B d11;
        B1.B e11;
        K1.K f7;
        int i11;
        Z0 z02 = this.f6973b;
        B1.B i12 = z02.i();
        if (i12 != null) {
            if (!i12.I()) {
                i12 = null;
            }
            if (i12 != null && (d11 = z02.d()) != null) {
                if (!d11.I()) {
                    d11 = null;
                }
                if (d11 != null && (e11 = z02.e()) != null) {
                    if (!e11.I()) {
                        e11 = null;
                    }
                    if (e11 != null && (f7 = z02.f()) != null) {
                        D0.a j11 = this.f6972a.j();
                        float[] fArr = this.f6982k;
                        C7837o0.e(fArr);
                        i12.S(fArr);
                        Matrix matrix = this.f6983l;
                        C7783A.a(matrix, fArr);
                        C7460f A11 = I0.B0.f(d11).A(i12.W(d11, 0L));
                        C7460f A12 = I0.B0.f(e11).A(i12.W(e11, 0L));
                        long d12 = j11.d();
                        K1.Q b11 = j11.b();
                        boolean z11 = this.f6977f;
                        boolean z12 = this.f6978g;
                        boolean z13 = this.f6979h;
                        boolean z14 = this.f6980i;
                        CursorAnchorInfo.Builder builder = this.f6981j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int h11 = K1.Q.h(d12);
                        builder.setSelectionRange(h11, K1.Q.g(d12));
                        if (z11 && h11 >= 0) {
                            C7460f e12 = f7.e(h11);
                            float d13 = kotlin.ranges.h.d(e12.n(), 0.0f, (int) (f7.A() >> 32));
                            boolean a11 = C2919e0.a(A11, d13, e12.q());
                            boolean a12 = C2919e0.a(A11, d13, e12.h());
                            int i13 = 1;
                            boolean z15 = f7.c(h11) == V1.g.Rtl;
                            if (!a11 && !a12) {
                                i13 = 0;
                            }
                            if (!a11 || !a12) {
                                i13 |= 2;
                            }
                            if (z15) {
                                i13 |= 4;
                            }
                            builder.setInsertionMarkerLocation(d13, e12.q(), e12.h(), e12.h(), i13);
                        }
                        if (z12) {
                            int h12 = b11 != null ? K1.Q.h(b11.k()) : -1;
                            int g10 = b11 != null ? K1.Q.g(b11.k()) : -1;
                            if (h12 >= 0 && h12 < g10) {
                                builder.setComposingText(h12, j11.subSequence(h12, g10));
                                float[] fArr2 = new float[(g10 - h12) * 4];
                                f7.v().a(K1.S.a(h12, g10), fArr2);
                                for (int i14 = h12; i14 < g10; i14++) {
                                    int i15 = (i14 - h12) * 4;
                                    C7460f c7460f = new C7460f(fArr2[i15], fArr2[i15 + 1], fArr2[i15 + 2], fArr2[i15 + 3]);
                                    boolean y11 = A11.y(c7460f);
                                    if (C2919e0.a(A11, c7460f.n(), c7460f.q())) {
                                        i11 = y11;
                                    }
                                    i11 = (y11 ? 1 : 0) | 2;
                                    if (f7.c(i14) == V1.g.Rtl) {
                                        i11 = (i11 == true ? 1 : 0) | 4;
                                    }
                                    builder.addCharacterBounds(i14, c7460f.n(), c7460f.q(), c7460f.o(), c7460f.h(), i11);
                                }
                            }
                        }
                        int i16 = Build.VERSION.SDK_INT;
                        if (i16 >= 33 && z13) {
                            A.a(builder, A12);
                        }
                        if (i16 >= 34 && z14) {
                            C.a(builder, f7, A11);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }

    public final void d(int i11) {
        boolean z11;
        boolean z12;
        boolean z13;
        CursorAnchorInfo c11;
        boolean z14 = false;
        boolean z15 = (i11 & 1) != 0;
        boolean z16 = (i11 & 2) != 0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            z11 = (i11 & 16) != 0;
            z12 = (i11 & 8) != 0;
            boolean z17 = (i11 & 4) != 0;
            if (i12 >= 34 && (i11 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z13 = z14;
                z14 = z17;
            } else if (i12 >= 34) {
                z13 = true;
                z14 = true;
                z11 = true;
                z12 = true;
            } else {
                z11 = true;
                z12 = true;
                z13 = z14;
                z14 = true;
            }
        } else {
            z11 = true;
            z12 = true;
            z13 = false;
        }
        this.f6977f = z11;
        this.f6978g = z12;
        this.f6979h = z14;
        this.f6980i = z13;
        if (z15 && (c11 = c()) != null) {
            this.f6974c.d(c11);
        }
        if (!z16) {
            xe.B0 b02 = this.f6976e;
            if (b02 != null) {
                ((xe.H0) b02).j(null);
            }
            this.f6976e = null;
            return;
        }
        xe.B0 b03 = this.f6976e;
        if (b03 == null || !((AbstractC10711a) b03).isActive()) {
            this.f6976e = C10727i.c(this.f6975d, null, xe.O.UNDISPATCHED, new D(this, null), 1);
        }
    }
}
