package S1;

import K1.C3422b;
import K1.C3442w;
import K1.D;
import K1.InterfaceC3438s;
import K1.T;
import L1.C;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import P1.Z;
import Z1.u;
import Z1.v;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.H0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements InterfaceC3438s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f25635a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f25636b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C3422b.C0288b<D>> f25637c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<C3422b.C0288b<C3442w>> f25638d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f25639e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Z1.d f25640f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final f f25641g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final CharSequence f25642h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C f25643i;

    /* renamed from: j, reason: collision with root package name */
    private q f25644j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f25645k;

    /* renamed from: l, reason: collision with root package name */
    private final int f25646l;

    static final class a extends AbstractC7737t implements InterfaceC6512o<AbstractC3809p, F, A, B, Typeface> {
        a() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public final Typeface invoke(AbstractC3809p abstractC3809p, F f7, A a11, B b11) {
            int b12 = a11.b();
            int b13 = b11.b();
            d dVar = d.this;
            Z a12 = dVar.g().a(abstractC3809p, f7, b12, b13);
            if (a12 instanceof Z.b) {
                Object value = ((Z.b) a12).getValue();
                Intrinsics.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            q qVar = new q(a12, dVar.f25644j);
            dVar.f25644j = qVar;
            return qVar.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x007d, code lost:
    
        if (r6 == 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(@NotNull String str, @NotNull T t2, @NotNull List<C3422b.C0288b<D>> list, @NotNull List<C3422b.C0288b<C3442w>> list2, @NotNull AbstractC3809p.a aVar, @NotNull Z1.d dVar) {
        Locale a11;
        int i11;
        int b11;
        D H11;
        long d11;
        boolean z11;
        long c11;
        V1.a d12;
        boolean z12;
        long j11;
        boolean z13;
        boolean z14;
        D d13;
        List<C3422b.C0288b<D>> list3;
        long j12;
        V1.m mVar;
        int i12;
        this.f25635a = str;
        this.f25636b = t2;
        this.f25637c = list;
        this.f25638d = list2;
        this.f25639e = aVar;
        this.f25640f = dVar;
        f fVar = new f(dVar.g());
        this.f25641g = fVar;
        this.f25645k = !e.a(t2) ? false : l.f25664a.a().getValue().booleanValue();
        int x11 = t2.x();
        R1.c q11 = t2.q();
        if (x11 != 4) {
            if (x11 != 5) {
                if (x11 == 1) {
                    i11 = 0;
                } else if (x11 == 2) {
                    i11 = 1;
                } else {
                    if (x11 != 3 && x11 != Integer.MIN_VALUE) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((q11 == null || (a11 = q11.c().a()) == null) ? Locale.getDefault() : a11);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.f25646l = i11;
                a aVar2 = new a();
                V1.q z15 = t2.z();
                z15 = z15 == null ? V1.q.f27930c : z15;
                fVar.setFlags(z15.c() ? fVar.getFlags() | UserVerificationMethods.USER_VERIFY_PATTERN : fVar.getFlags() & (-129));
                b11 = z15.b();
                if (b11 == 1) {
                    fVar.setFlags(fVar.getFlags() | 64);
                    fVar.setHinting(0);
                } else if (b11 == 2) {
                    fVar.getFlags();
                    fVar.setHinting(1);
                } else if (b11 == 3) {
                    fVar.getFlags();
                    fVar.setHinting(0);
                } else {
                    fVar.getFlags();
                }
                H11 = t2.H();
                boolean isEmpty = list.isEmpty();
                d11 = u.d(H11.j());
                if (v.b(d11, 4294967296L)) {
                    fVar.setTextSize(dVar.Z0(H11.j()));
                } else if (v.b(d11, 8589934592L)) {
                    fVar.setTextSize(u.e(H11.j()) * fVar.getTextSize());
                }
                if (T1.d.a(H11)) {
                    AbstractC3809p h11 = H11.h();
                    F m11 = H11.m();
                    m11 = m11 == null ? F.f21509g : m11;
                    A k11 = H11.k();
                    A a12 = A.a(k11 != null ? k11.b() : 0);
                    B l11 = H11.l();
                    if (l11 != null) {
                        i12 = l11.b();
                        z11 = true;
                    } else {
                        i12 = 1;
                        z11 = true;
                    }
                    fVar.setTypeface((Typeface) aVar2.invoke(h11, m11, a12, B.a(i12)));
                } else {
                    z11 = true;
                }
                if (H11.o() != null) {
                    R1.c o11 = H11.o();
                    int i13 = R1.c.f24234d;
                    if (!Intrinsics.d(o11, R1.d.a().a())) {
                        T1.a.f26504a.b(fVar, H11.o());
                    }
                }
                if (H11.i() != null && !Intrinsics.d(H11.i(), "")) {
                    fVar.setFontFeatureSettings(H11.i());
                }
                if (H11.t() != null) {
                    V1.m t11 = H11.t();
                    mVar = V1.m.f27923c;
                    if (!Intrinsics.d(t11, mVar)) {
                        fVar.setTextScaleX(H11.t().b() * fVar.getTextScaleX());
                        fVar.setTextSkewX(H11.t().c() + fVar.getTextSkewX());
                    }
                }
                fVar.e(H11.f());
                fVar.d(H11.e(), 9205357640488583168L, H11.b());
                fVar.g(H11.q());
                fVar.h(H11.r());
                fVar.f(H11.g());
                if (!v.b(u.d(H11.n()), 4294967296L) && u.e(H11.n()) != 0.0f) {
                    float textScaleX = fVar.getTextScaleX() * fVar.getTextSize();
                    float Z02 = dVar.Z0(H11.n());
                    if (textScaleX != 0.0f) {
                        fVar.setLetterSpacing(Z02 / textScaleX);
                    }
                } else if (v.b(u.d(H11.n()), 8589934592L)) {
                    fVar.setLetterSpacing(u.e(H11.n()));
                }
                long n11 = H11.n();
                c11 = H11.c();
                d12 = H11.d();
                z12 = (isEmpty && v.b(u.d(n11), 4294967296L) && u.e(n11) != 0.0f) ? z11 : false;
                j11 = C7807Z.f72259m;
                if (!C7807Z.p(c11, j11)) {
                    j12 = C7807Z.f72258l;
                    if (!C7807Z.p(c11, j12)) {
                        z13 = z11;
                        z14 = (d12 != null || Float.compare(d12.b(), 0.0f) == 0) ? false : z11;
                        d13 = null;
                        if (!z12 || z13 || z14) {
                            d13 = new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, z12 ? n11 : u.f35334c, !z14 ? d12 : null, (V1.m) null, (R1.c) null, z13 ? c11 : C7807Z.f72259m, (V1.i) null, (H0) null, 63103);
                        }
                        if (d13 == null) {
                            int size = list.size() + 1;
                            ArrayList arrayList = new ArrayList(size);
                            int i14 = 0;
                            while (i14 < size) {
                                arrayList.add(i14 == 0 ? new C3422b.C0288b<>(0, this.f25635a.length(), d13) : this.f25637c.get(i14 - 1));
                                i14++;
                            }
                            list3 = arrayList;
                        } else {
                            list3 = list;
                        }
                        CharSequence a13 = c.a(this.f25635a, this.f25641g.getTextSize(), this.f25636b, list3, this.f25638d, this.f25640f, aVar2, this.f25645k);
                        this.f25642h = a13;
                        this.f25643i = new C(a13, this.f25641g, this.f25646l);
                    }
                }
                z13 = false;
                if (d12 != null) {
                }
                d13 = null;
                if (!z12) {
                }
                d13 = new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, z12 ? n11 : u.f35334c, !z14 ? d12 : null, (V1.m) null, (R1.c) null, z13 ? c11 : C7807Z.f72259m, (V1.i) null, (H0) null, 63103);
                if (d13 == null) {
                }
                CharSequence a132 = c.a(this.f25635a, this.f25641g.getTextSize(), this.f25636b, list3, this.f25638d, this.f25640f, aVar2, this.f25645k);
                this.f25642h = a132;
                this.f25643i = new C(a132, this.f25641g, this.f25646l);
            }
            i11 = 3;
            this.f25646l = i11;
            a aVar22 = new a();
            V1.q z152 = t2.z();
            if (z152 == null) {
            }
            fVar.setFlags(z152.c() ? fVar.getFlags() | UserVerificationMethods.USER_VERIFY_PATTERN : fVar.getFlags() & (-129));
            b11 = z152.b();
            if (b11 == 1) {
            }
            H11 = t2.H();
            boolean isEmpty2 = list.isEmpty();
            d11 = u.d(H11.j());
            if (v.b(d11, 4294967296L)) {
            }
            if (T1.d.a(H11)) {
            }
            if (H11.o() != null) {
            }
            if (H11.i() != null) {
                fVar.setFontFeatureSettings(H11.i());
            }
            if (H11.t() != null) {
            }
            fVar.e(H11.f());
            fVar.d(H11.e(), 9205357640488583168L, H11.b());
            fVar.g(H11.q());
            fVar.h(H11.r());
            fVar.f(H11.g());
            if (!v.b(u.d(H11.n()), 4294967296L)) {
            }
            if (v.b(u.d(H11.n()), 8589934592L)) {
            }
            long n112 = H11.n();
            c11 = H11.c();
            d12 = H11.d();
            if (isEmpty2) {
            }
            j11 = C7807Z.f72259m;
            if (!C7807Z.p(c11, j11)) {
            }
            z13 = false;
            if (d12 != null) {
            }
            d13 = null;
            if (!z12) {
            }
            d13 = new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, z12 ? n112 : u.f35334c, !z14 ? d12 : null, (V1.m) null, (R1.c) null, z13 ? c11 : C7807Z.f72259m, (V1.i) null, (H0) null, 63103);
            if (d13 == null) {
            }
            CharSequence a1322 = c.a(this.f25635a, this.f25641g.getTextSize(), this.f25636b, list3, this.f25638d, this.f25640f, aVar22, this.f25645k);
            this.f25642h = a1322;
            this.f25643i = new C(a1322, this.f25641g, this.f25646l);
        }
        i11 = 2;
        this.f25646l = i11;
        a aVar222 = new a();
        V1.q z1522 = t2.z();
        if (z1522 == null) {
        }
        fVar.setFlags(z1522.c() ? fVar.getFlags() | UserVerificationMethods.USER_VERIFY_PATTERN : fVar.getFlags() & (-129));
        b11 = z1522.b();
        if (b11 == 1) {
        }
        H11 = t2.H();
        boolean isEmpty22 = list.isEmpty();
        d11 = u.d(H11.j());
        if (v.b(d11, 4294967296L)) {
        }
        if (T1.d.a(H11)) {
        }
        if (H11.o() != null) {
        }
        if (H11.i() != null) {
        }
        if (H11.t() != null) {
        }
        fVar.e(H11.f());
        fVar.d(H11.e(), 9205357640488583168L, H11.b());
        fVar.g(H11.q());
        fVar.h(H11.r());
        fVar.f(H11.g());
        if (!v.b(u.d(H11.n()), 4294967296L)) {
        }
        if (v.b(u.d(H11.n()), 8589934592L)) {
        }
        long n1122 = H11.n();
        c11 = H11.c();
        d12 = H11.d();
        if (isEmpty22) {
        }
        j11 = C7807Z.f72259m;
        if (!C7807Z.p(c11, j11)) {
        }
        z13 = false;
        if (d12 != null) {
        }
        d13 = null;
        if (!z12) {
        }
        d13 = new D(0L, 0L, (F) null, (A) null, (B) null, (AbstractC3809p) null, (String) null, z12 ? n1122 : u.f35334c, !z14 ? d12 : null, (V1.m) null, (R1.c) null, z13 ? c11 : C7807Z.f72259m, (V1.i) null, (H0) null, 63103);
        if (d13 == null) {
        }
        CharSequence a13222 = c.a(this.f25635a, this.f25641g.getTextSize(), this.f25636b, list3, this.f25638d, this.f25640f, aVar222, this.f25645k);
        this.f25642h = a13222;
        this.f25643i = new C(a13222, this.f25641g, this.f25646l);
    }

    @Override // K1.InterfaceC3438s
    public final boolean a() {
        q qVar = this.f25644j;
        if (qVar != null ? qVar.b() : false) {
            return true;
        }
        return !this.f25645k && e.a(this.f25636b) && l.f25664a.a().getValue().booleanValue();
    }

    @Override // K1.InterfaceC3438s
    public final float b() {
        return this.f25643i.c();
    }

    @Override // K1.InterfaceC3438s
    public final float c() {
        return this.f25643i.b();
    }

    @NotNull
    public final CharSequence f() {
        return this.f25642h;
    }

    @NotNull
    public final AbstractC3809p.a g() {
        return this.f25639e;
    }

    @NotNull
    public final C h() {
        return this.f25643i;
    }

    @NotNull
    public final T i() {
        return this.f25636b;
    }

    public final int j() {
        return this.f25646l;
    }

    @NotNull
    public final f k() {
        return this.f25641g;
    }
}
