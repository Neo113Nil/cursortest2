package K1;

import Am.C2438a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.C7459e;
import k1.C7460f;
import k1.C7465k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7786D;
import l1.C7845v;
import l1.H0;
import l1.InterfaceC7802U;
import l1.x0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* renamed from: K1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3421a implements InterfaceC3436p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S1.d f15019a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15020b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15021c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final L1.W f15022d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CharSequence f15023e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Object f15024f;

    /* renamed from: K1.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C0286a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15025a;

        static {
            int[] iArr = new int[V1.g.values().length];
            try {
                iArr[V1.g.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[V1.g.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15025a = iArr;
        }
    }

    /* renamed from: K1.a$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<RectF, RectF, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H f15026b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H h11) {
            super(2);
            this.f15026b = h11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(RectF rectF, RectF rectF2) {
            return Boolean.valueOf(this.f15026b.a(x0.e(rectF), x0.e(rectF2)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00f0, code lost:
    
        if (r8 == 4) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dd  */
    /* JADX WARN: Type inference failed for: r1v33, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3421a(S1.d dVar, int i11, boolean z11, long j11) {
        CharSequence charSequence;
        int n11;
        int i12;
        int i13;
        int n12;
        int i14;
        int i15;
        TextUtils.TruncateAt truncateAt;
        L1.W a11;
        L1.W w11;
        U1.b[] bVarArr;
        CharSequence charSequence2;
        Object obj;
        C7460f c7460f;
        float i16;
        float j12;
        int b11;
        float u11;
        float f7;
        float j13;
        long j14;
        this.f15019a = dVar;
        this.f15020b = i11;
        this.f15021c = j11;
        if (Z1.b.l(j11) != 0 || Z1.b.m(j11) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("maxLines should be greater than 0");
        }
        T i17 = dVar.i();
        if (z11 && !Z1.u.c(i17.m(), Hj0.T.d(0))) {
            long m11 = i17.m();
            j14 = Z1.u.f35334c;
            if (!Z1.u.c(m11, j14) && i17.v() != Integer.MIN_VALUE && i17.v() != 5 && i17.v() != 4) {
                CharSequence f11 = dVar.f();
                int length = f11.length();
                charSequence = f11;
                if (length != 0) {
                    SpannableString spannableString = f11 instanceof Spannable ? (Spannable) f11 : new SpannableString(f11);
                    spannableString.setSpan(new N1.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                    charSequence = spannableString;
                }
                this.f15023e = charSequence;
                int v11 = i17.v();
                int i18 = 3;
                int i19 = v11 != 1 ? 3 : v11 == 2 ? 4 : v11 == 3 ? 2 : (v11 != 5 && v11 == 6) ? 1 : 0;
                int i21 = i17.v() != 4 ? 1 : 0;
                int i22 = i17.r().b() != 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : 0;
                n11 = i17.n() & 255;
                if (n11 != 1) {
                    if (n11 == 2) {
                        i12 = i22;
                        i13 = 1;
                    } else if (n11 == 3) {
                        i12 = i22;
                        i13 = 2;
                    }
                    n12 = (i17.n() >> 8) & 255;
                    if (n12 != 1) {
                        if (n12 == 2) {
                            i18 = 1;
                        } else if (n12 == 3) {
                            i18 = 2;
                        }
                        int n13 = (i17.n() >> 16) & 255;
                        int i23 = (n13 != 1 && n13 == 2) ? 1 : 0;
                        if (z11) {
                            truncateAt = TextUtils.TruncateAt.END;
                            int i24 = i12;
                            i14 = i18;
                            i15 = i24;
                        } else {
                            int i25 = i12;
                            i14 = i18;
                            i15 = i25;
                            truncateAt = null;
                        }
                        a11 = a(i19, i21, truncateAt, i11, i15, i13, i14, i23);
                        if (z11 || a11.e() <= Z1.b.j(j11) || i11 <= 1) {
                            this.f15022d = a11;
                        } else {
                            int j15 = Z1.b.j(j11);
                            int l11 = a11.l();
                            int i26 = 0;
                            while (true) {
                                if (i26 >= l11) {
                                    i26 = a11.l();
                                    break;
                                } else if (a11.k(i26) > j15) {
                                    break;
                                } else {
                                    i26++;
                                }
                            }
                            if (i26 >= 0 && i26 != this.f15020b) {
                                a11 = a(i19, i21, truncateAt, i26 < 1 ? 1 : i26, i15, i13, i14, i23);
                            }
                            this.f15022d = a11;
                        }
                        this.f15019a.k().d(i17.e(), C7465k.a(A(), h()), i17.d());
                        w11 = this.f15022d;
                        if (w11.C() instanceof Spanned) {
                            CharSequence C11 = w11.C();
                            Intrinsics.g(C11, "null cannot be cast to non-null type android.text.Spanned");
                            Spanned spanned = (Spanned) C11;
                            if (spanned.nextSpanTransition(-1, spanned.length(), U1.b.class) != spanned.length()) {
                                CharSequence C12 = w11.C();
                                Intrinsics.g(C12, "null cannot be cast to non-null type android.text.Spanned");
                                bVarArr = (U1.b[]) ((Spanned) C12).getSpans(0, w11.C().length(), U1.b.class);
                                if (bVarArr != null) {
                                    Iterator a12 = C7721c.a(bVarArr);
                                    while (a12.hasNext()) {
                                        ((U1.b) a12.next()).c(C7465k.a(A(), h()));
                                    }
                                }
                                charSequence2 = this.f15023e;
                                if (charSequence2 instanceof Spanned) {
                                    obj = kotlin.collections.K.f71697a;
                                } else {
                                    Spanned spanned2 = (Spanned) charSequence2;
                                    Object[] spans = spanned2.getSpans(0, charSequence2.length(), N1.i.class);
                                    ArrayList arrayList = new ArrayList(spans.length);
                                    for (Object obj2 : spans) {
                                        N1.i iVar = (N1.i) obj2;
                                        int spanStart = spanned2.getSpanStart(iVar);
                                        int spanEnd = spanned2.getSpanEnd(iVar);
                                        int p11 = this.f15022d.p(spanStart);
                                        boolean z12 = p11 >= this.f15020b;
                                        boolean z13 = this.f15022d.m(p11) > 0 && spanEnd > this.f15022d.n(p11);
                                        boolean z14 = spanEnd > this.f15022d.o(p11);
                                        if (z13 || z14 || z12) {
                                            c7460f = null;
                                        } else {
                                            int i27 = C0286a.f15025a[c(spanStart).ordinal()];
                                            if (i27 == 1) {
                                                i16 = i(spanStart, true);
                                            } else {
                                                if (i27 != 2) {
                                                    throw new Sc.o();
                                                }
                                                i16 = i(spanStart, true) - iVar.d();
                                            }
                                            float d11 = iVar.d() + i16;
                                            L1.W w12 = this.f15022d;
                                            switch (iVar.c()) {
                                                case 0:
                                                    j12 = w12.j(p11);
                                                    b11 = iVar.b();
                                                    u11 = j12 - b11;
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 1:
                                                    u11 = w12.u(p11);
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 2:
                                                    j12 = w12.k(p11);
                                                    b11 = iVar.b();
                                                    u11 = j12 - b11;
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 3:
                                                    u11 = ((w12.k(p11) + w12.u(p11)) - iVar.b()) / 2;
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 4:
                                                    f7 = iVar.a().ascent;
                                                    j13 = w12.j(p11);
                                                    u11 = j13 + f7;
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 5:
                                                    u11 = (w12.j(p11) + iVar.a().descent) - iVar.b();
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                case 6:
                                                    Paint.FontMetricsInt a13 = iVar.a();
                                                    f7 = ((a13.ascent + a13.descent) - iVar.b()) / 2;
                                                    j13 = w12.j(p11);
                                                    u11 = j13 + f7;
                                                    c7460f = new C7460f(i16, u11, d11, iVar.b() + u11);
                                                    break;
                                                default:
                                                    throw new IllegalStateException("unexpected verticalAlignment");
                                            }
                                        }
                                        arrayList.add(c7460f);
                                    }
                                    obj = arrayList;
                                }
                                this.f15024f = obj;
                            }
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = this.f15023e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        this.f15024f = obj;
                    }
                    i18 = 0;
                    int n132 = (i17.n() >> 16) & 255;
                    if (n132 != 1) {
                        if (z11) {
                        }
                        a11 = a(i19, i21, truncateAt, i11, i15, i13, i14, i23);
                        if (z11) {
                        }
                        this.f15022d = a11;
                        this.f15019a.k().d(i17.e(), C7465k.a(A(), h()), i17.d());
                        w11 = this.f15022d;
                        if (w11.C() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = this.f15023e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        this.f15024f = obj;
                    }
                    if (z11) {
                    }
                    a11 = a(i19, i21, truncateAt, i11, i15, i13, i14, i23);
                    if (z11) {
                    }
                    this.f15022d = a11;
                    this.f15019a.k().d(i17.e(), C7465k.a(A(), h()), i17.d());
                    w11 = this.f15022d;
                    if (w11.C() instanceof Spanned) {
                    }
                    bVarArr = null;
                    if (bVarArr != null) {
                    }
                    charSequence2 = this.f15023e;
                    if (charSequence2 instanceof Spanned) {
                    }
                    this.f15024f = obj;
                }
                i12 = i22;
                i13 = 0;
                n12 = (i17.n() >> 8) & 255;
                if (n12 != 1) {
                }
                i18 = 0;
                int n1322 = (i17.n() >> 16) & 255;
                if (n1322 != 1) {
                }
                if (z11) {
                }
                a11 = a(i19, i21, truncateAt, i11, i15, i13, i14, i23);
                if (z11) {
                }
                this.f15022d = a11;
                this.f15019a.k().d(i17.e(), C7465k.a(A(), h()), i17.d());
                w11 = this.f15022d;
                if (w11.C() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = this.f15023e;
                if (charSequence2 instanceof Spanned) {
                }
                this.f15024f = obj;
            }
        }
        charSequence = dVar.f();
        this.f15023e = charSequence;
        int v112 = i17.v();
        int i182 = 3;
        if (v112 != 1) {
        }
        if (i17.v() != 4) {
        }
        if (i17.r().b() != 2) {
        }
        n11 = i17.n() & 255;
        if (n11 != 1) {
        }
        i12 = i22;
        i13 = 0;
        n12 = (i17.n() >> 8) & 255;
        if (n12 != 1) {
        }
        i182 = 0;
        int n13222 = (i17.n() >> 16) & 255;
        if (n13222 != 1) {
        }
        if (z11) {
        }
        a11 = a(i19, i21, truncateAt, i11, i15, i13, i14, i23);
        if (z11) {
        }
        this.f15022d = a11;
        this.f15019a.k().d(i17.e(), C7465k.a(A(), h()), i17.d());
        w11 = this.f15022d;
        if (w11.C() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = this.f15023e;
        if (charSequence2 instanceof Spanned) {
        }
        this.f15024f = obj;
    }

    private final void D(InterfaceC7802U interfaceC7802U) {
        Canvas b11 = C7845v.b(interfaceC7802U);
        L1.W w11 = this.f15022d;
        if (w11.d()) {
            b11.save();
            b11.clipRect(0.0f, 0.0f, A(), h());
        }
        w11.I(b11);
        if (w11.d()) {
            b11.restore();
        }
    }

    private final L1.W a(int i11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, int i16, int i17) {
        y a11;
        float A11 = A();
        S1.d dVar = this.f15019a;
        S1.f k11 = dVar.k();
        int j11 = dVar.j();
        L1.C h11 = dVar.h();
        T i18 = dVar.i();
        int i19 = S1.c.f25634b;
        A s11 = i18.s();
        return new L1.W(this.f15023e, A11, k11, i11, truncateAt, j11, (s11 == null || (a11 = s11.a()) == null) ? false : a11.c(), i13, i15, i16, i17, i14, i12, h11);
    }

    public final float A() {
        return Z1.b.k(this.f15021c);
    }

    public final long B(int i11) {
        M1.h E11 = this.f15022d.E();
        return S.a(M1.g.b(E11, i11), M1.g.a(E11, i11));
    }

    public final boolean C(int i11) {
        return this.f15022d.G(i11);
    }

    public final void E(@NotNull InterfaceC7802U interfaceC7802U, long j11, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        S1.d dVar = this.f15019a;
        int a11 = dVar.k().a();
        S1.f k11 = dVar.k();
        k11.e(j11);
        k11.g(h02);
        k11.h(iVar);
        k11.f(abstractC8413f);
        k11.c(3);
        D(interfaceC7802U);
        dVar.k().c(a11);
    }

    public final void F(@NotNull InterfaceC7802U interfaceC7802U, @NotNull AbstractC7799Q abstractC7799Q, float f7, H0 h02, V1.i iVar, AbstractC8413f abstractC8413f) {
        S1.d dVar = this.f15019a;
        int a11 = dVar.k().a();
        S1.f k11 = dVar.k();
        k11.d(abstractC7799Q, C7465k.a(A(), h()), f7);
        k11.g(h02);
        k11.h(iVar);
        k11.f(abstractC8413f);
        k11.c(3);
        D(interfaceC7802U);
        dVar.k().c(a11);
    }

    public final void b(long j11, @NotNull float[] fArr, int i11) {
        this.f15022d.a(Q.h(j11), Q.g(j11), fArr, i11);
    }

    @NotNull
    public final V1.g c(int i11) {
        return this.f15022d.H(i11) ? V1.g.Rtl : V1.g.Ltr;
    }

    @NotNull
    public final C7460f d(int i11) {
        CharSequence charSequence = this.f15023e;
        if (i11 >= 0 && i11 < charSequence.length()) {
            RectF c11 = this.f15022d.c(i11);
            return new C7460f(c11.left, c11.top, c11.right, c11.bottom);
        }
        StringBuilder f7 = P4.f.f(i11, "offset(", ") is out of bounds [0,");
        f7.append(charSequence.length());
        f7.append(')');
        throw new IllegalArgumentException(f7.toString().toString());
    }

    @NotNull
    public final C7460f e(int i11) {
        CharSequence charSequence = this.f15023e;
        if (i11 < 0 || i11 > charSequence.length()) {
            StringBuilder f7 = P4.f.f(i11, "offset(", ") is out of bounds [0,");
            f7.append(charSequence.length());
            f7.append(']');
            throw new IllegalArgumentException(f7.toString().toString());
        }
        L1.W w11 = this.f15022d;
        float y11 = w11.y(i11, false);
        int p11 = w11.p(i11);
        return new C7460f(y11, w11.u(p11), y11, w11.k(p11));
    }

    public final boolean f() {
        return this.f15022d.d();
    }

    public final float g() {
        return this.f15022d.j(0);
    }

    public final float h() {
        return this.f15022d.e();
    }

    public final float i(int i11, boolean z11) {
        L1.W w11 = this.f15022d;
        return z11 ? w11.y(i11, false) : w11.A(i11, false);
    }

    public final float j() {
        return this.f15022d.j(r0.l() - 1);
    }

    public final float k(int i11) {
        return this.f15022d.k(i11);
    }

    public final int l() {
        return this.f15022d.l();
    }

    public final int m(int i11, boolean z11) {
        L1.W w11 = this.f15022d;
        return z11 ? w11.v(i11) : w11.o(i11);
    }

    public final int n(int i11) {
        return this.f15022d.p(i11);
    }

    public final int o(float f7) {
        return this.f15022d.q((int) f7);
    }

    public final float p(int i11) {
        return this.f15022d.r(i11);
    }

    public final float q(int i11) {
        return this.f15022d.s(i11);
    }

    public final int r(int i11) {
        return this.f15022d.t(i11);
    }

    public final float s(int i11) {
        return this.f15022d.u(i11);
    }

    public final float t() {
        return this.f15019a.c();
    }

    public final float u() {
        return this.f15019a.b();
    }

    public final int v(long j11) {
        int h11 = (int) C7459e.h(j11);
        L1.W w11 = this.f15022d;
        return w11.w(C7459e.g(j11), w11.q(h11));
    }

    @NotNull
    public final V1.g w(int i11) {
        L1.W w11 = this.f15022d;
        return w11.x(w11.p(i11)) == 1 ? V1.g.Ltr : V1.g.Rtl;
    }

    @NotNull
    public final C7786D x(int i11, int i12) {
        CharSequence charSequence = this.f15023e;
        if (i11 >= 0 && i11 <= i12 && i12 <= charSequence.length()) {
            Path path = new Path();
            this.f15022d.B(i11, i12, path);
            return new C7786D(path);
        }
        StringBuilder a11 = C2438a.a("start(", i11, ") or end(", ") is out of range [0..", i12);
        a11.append(charSequence.length());
        a11.append("], or start > end!");
        throw new IllegalArgumentException(a11.toString().toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<k1.f>] */
    @NotNull
    public final List<C7460f> y() {
        return this.f15024f;
    }

    public final long z(@NotNull C7460f c7460f, int i11, @NotNull H h11) {
        long j11;
        int[] z11 = this.f15022d.z(x0.c(c7460f), (!F.a(i11, 0) && F.a(i11, 1)) ? 1 : 0, new b(h11));
        if (z11 != null) {
            return S.a(z11[0], z11[1]);
        }
        j11 = Q.f15009b;
        return j11;
    }
}
