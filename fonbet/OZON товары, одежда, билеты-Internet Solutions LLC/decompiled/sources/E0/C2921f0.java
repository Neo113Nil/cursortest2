package E0;

import E0.C2912b;
import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7783A;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.f0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2921f0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<C7837o0, Unit> f7200a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2913b0 f7201b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7203d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7204e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7205f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7206g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7207h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7208i;

    /* renamed from: j, reason: collision with root package name */
    private Q1.K f7209j;

    /* renamed from: k, reason: collision with root package name */
    private K1.K f7210k;

    /* renamed from: l, reason: collision with root package name */
    private Q1.D f7211l;

    /* renamed from: m, reason: collision with root package name */
    private C7460f f7212m;

    /* renamed from: n, reason: collision with root package name */
    private C7460f f7213n;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f7202c = new Object();

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final CursorAnchorInfo.Builder f7214o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final float[] f7215p = C7837o0.b();

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final Matrix f7216q = new Matrix();

    public C2921f0(@NotNull Function1 function1, @NotNull C2913b0 c2913b0) {
        this.f7200a = function1;
        this.f7201b = c2913b0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0183, code lost:
    
        if (E0.C2919e0.a(r6, r15.o(), r15.h()) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        Q1.K k11;
        int i11;
        C2913b0 c2913b0 = this.f7201b;
        if (!c2913b0.c() || this.f7209j == null || this.f7211l == null || this.f7210k == null || this.f7212m == null || this.f7213n == null) {
            return;
        }
        float[] fArr = this.f7215p;
        C7837o0.e(fArr);
        ((C2912b.a.C0155b) this.f7200a).invoke(C7837o0.a(fArr));
        C7460f c7460f = this.f7213n;
        Intrinsics.f(c7460f);
        float f7 = -c7460f.n();
        C7460f c7460f2 = this.f7213n;
        Intrinsics.f(c7460f2);
        C7837o0.i(f7, -c7460f2.q(), fArr);
        Matrix matrix = this.f7216q;
        C7783A.a(matrix, fArr);
        Q1.K k12 = this.f7209j;
        Intrinsics.f(k12);
        Q1.D d11 = this.f7211l;
        Intrinsics.f(d11);
        K1.K k13 = this.f7210k;
        Intrinsics.f(k13);
        C7460f c7460f3 = this.f7212m;
        Intrinsics.f(c7460f3);
        C7460f c7460f4 = this.f7213n;
        Intrinsics.f(c7460f4);
        boolean z11 = this.f7205f;
        boolean z12 = this.f7206g;
        boolean z13 = this.f7207h;
        boolean z14 = this.f7208i;
        CursorAnchorInfo.Builder builder = this.f7214o;
        builder.reset();
        builder.setMatrix(matrix);
        int h11 = K1.Q.h(k12.e());
        builder.setSelectionRange(h11, K1.Q.g(k12.e()));
        if (!z11 || h11 < 0) {
            k11 = k12;
        } else {
            int originalToTransformed = d11.originalToTransformed(h11);
            C7460f e11 = k13.e(originalToTransformed);
            float d12 = kotlin.ranges.h.d(e11.n(), 0.0f, (int) (k13.A() >> 32));
            boolean a11 = C2919e0.a(c7460f3, d12, e11.q());
            boolean a12 = C2919e0.a(c7460f3, d12, e11.h());
            k11 = k12;
            int i12 = 1;
            boolean z15 = k13.c(originalToTransformed) == V1.g.Rtl;
            if (!a11 && !a12) {
                i12 = 0;
            }
            if (!a11 || !a12) {
                i12 |= 2;
            }
            if (z15) {
                i12 |= 4;
            }
            builder.setInsertionMarkerLocation(d12, e11.q(), e11.h(), e11.h(), i12);
        }
        if (z12) {
            K1.Q d13 = k11.d();
            int h12 = d13 != null ? K1.Q.h(d13.k()) : -1;
            K1.Q d14 = k11.d();
            int g10 = d14 != null ? K1.Q.g(d14.k()) : -1;
            if (h12 >= 0 && h12 < g10) {
                builder.setComposingText(h12, k11.f().subSequence(h12, g10));
                int originalToTransformed2 = d11.originalToTransformed(h12);
                int originalToTransformed3 = d11.originalToTransformed(g10);
                float[] fArr2 = new float[(originalToTransformed3 - originalToTransformed2) * 4];
                k13.v().a(K1.S.a(originalToTransformed2, originalToTransformed3), fArr2);
                int i13 = h12;
                while (i13 < g10) {
                    int originalToTransformed4 = d11.originalToTransformed(i13);
                    int i14 = (originalToTransformed4 - originalToTransformed2) * 4;
                    Q1.D d15 = d11;
                    int i15 = g10;
                    int i16 = originalToTransformed2;
                    C7460f c7460f5 = new C7460f(fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3]);
                    boolean y11 = c7460f3.y(c7460f5);
                    if (C2919e0.a(c7460f3, c7460f5.n(), c7460f5.q())) {
                        i11 = y11;
                    }
                    i11 = (y11 ? 1 : 0) | 2;
                    if (k13.c(originalToTransformed4) == V1.g.Rtl) {
                        i11 = (i11 == true ? 1 : 0) | 4;
                    }
                    builder.addCharacterBounds(i13, c7460f5.n(), c7460f5.q(), c7460f5.o(), c7460f5.h(), i11);
                    i13++;
                    fArr2 = fArr2;
                    d11 = d15;
                    g10 = i15;
                    originalToTransformed2 = i16;
                }
            }
        }
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 33 && z13) {
            A.a(builder, c7460f4);
        }
        if (i17 >= 34 && z14) {
            C.a(builder, k13, c7460f3);
        }
        c2913b0.f(builder.build());
        this.f7204e = false;
    }

    public final void a() {
        synchronized (this.f7202c) {
            this.f7209j = null;
            this.f7211l = null;
            this.f7210k = null;
            this.f7212m = null;
            this.f7213n = null;
            Unit unit = Unit.f71690a;
        }
    }

    public final void b(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        synchronized (this.f7202c) {
            try {
                this.f7205f = z13;
                this.f7206g = z14;
                this.f7207h = z15;
                this.f7208i = z16;
                if (z11) {
                    this.f7204e = true;
                    if (this.f7209j != null) {
                        c();
                    }
                }
                this.f7203d = z12;
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(@NotNull Q1.K k11, @NotNull Q1.D d11, @NotNull K1.K k12, @NotNull C7460f c7460f, @NotNull C7460f c7460f2) {
        synchronized (this.f7202c) {
            try {
                this.f7209j = k11;
                this.f7211l = d11;
                this.f7210k = k12;
                this.f7212m = c7460f;
                this.f7213n = c7460f2;
                if (!this.f7204e) {
                    if (this.f7203d) {
                    }
                    Unit unit = Unit.f71690a;
                }
                c();
                Unit unit2 = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
