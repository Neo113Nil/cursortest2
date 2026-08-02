package E0;

import K1.C3422b;
import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class c1 {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final a f7170e = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D0.e f7171a;

    /* renamed from: b, reason: collision with root package name */
    private final C2950u0 f7172b;

    /* renamed from: c, reason: collision with root package name */
    private final A1<b> f7173c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f7174d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: E0.c1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0156a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7175a;

            static {
                int[] iArr = new int[g1.values().length];
                try {
                    iArr[g1.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g1.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f7175a = iArr;
            }
        }

        public static final b a(a aVar, D0.a aVar2, C2950u0 c2950u0, C2948t0 c2948t0) {
            C2941p0 c2941p0 = new C2941p0();
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < aVar2.length()) {
                int codePointAt = Character.codePointAt(aVar2, i11);
                c2950u0.getClass();
                int i12 = codePointAt == 10 ? 32 : codePointAt == 13 ? 65279 : codePointAt;
                int charCount = Character.charCount(codePointAt);
                if (i12 != codePointAt) {
                    c2941p0.e(sb2.length(), sb2.length() + charCount, Character.charCount(i12));
                    z11 = true;
                }
                sb2.appendCodePoint(i12);
                i11 += charCount;
            }
            CharSequence sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            CharSequence charSequence = z11 ? sb3 : aVar2;
            if (charSequence == aVar2) {
                return null;
            }
            long c11 = c(aVar2.d(), c2941p0, c2948t0);
            K1.Q b11 = aVar2.b();
            return new b(new D0.a(charSequence, c11, b11 != null ? K1.Q.b(c(b11.k(), c2941p0, c2948t0)) : null, 8), c2941p0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static long c(long j11, C2941p0 c2941p0, C2948t0 c2948t0) {
            int i11 = K1.Q.f15010c;
            long c11 = c2941p0.c((int) (j11 >> 32));
            long c12 = K1.Q.e(j11) ? c11 : c2941p0.c((int) (j11 & 4294967295L));
            int min = Math.min(K1.Q.h(c11), K1.Q.h(c12));
            int max = Math.max(K1.Q.g(c11), K1.Q.g(c12));
            long a11 = K1.Q.i(j11) ? K1.S.a(max, min) : K1.S.a(min, max);
            if (K1.Q.e(j11) && !K1.Q.e(a11)) {
                g1 a12 = c2948t0 != null ? c2948t0.a() : null;
                int i12 = a12 == null ? -1 : C0156a.f7175a[a12.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        int i13 = (int) (a11 >> 32);
                        return K1.S.a(i13, i13);
                    }
                    if (i12 != 2) {
                        throw new Sc.o();
                    }
                    int i14 = (int) (a11 & 4294967295L);
                    return K1.S.a(i14, i14);
                }
            }
            return a11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final D0.a f7176a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C2941p0 f7177b;

        public b(@NotNull D0.a aVar, @NotNull C2941p0 c2941p0) {
            this.f7176a = aVar;
            this.f7177b = c2941p0;
        }

        @NotNull
        public final C2941p0 a() {
            return this.f7177b;
        }

        @NotNull
        public final D0.a b() {
            return this.f7176a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f7176a, bVar.f7176a) && Intrinsics.d(this.f7177b, bVar.f7177b);
        }

        public final int hashCode() {
            return this.f7177b.hashCode() + (this.f7176a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "TransformedText(text=" + ((Object) this.f7176a) + ", offsetMapping=" + this.f7177b + ')';
        }
    }

    public c1(@NotNull D0.e eVar, C2950u0 c2950u0) {
        C3991w0 f7;
        this.f7171a = eVar;
        this.f7172b = c2950u0;
        this.f7173c = c2950u0 != null ? n1.e(new d1(this, c2950u0)) : null;
        f7 = n1.f(new C2948t0(g1.Start), D1.f25195a);
        this.f7174d = f7;
    }

    public static void q(c1 c1Var, CharSequence charSequence, G0.c cVar, int i11) {
        boolean z11 = (i11 & 2) == 0;
        if ((i11 & 4) != 0) {
            cVar = G0.c.MergeIfPossible;
        }
        D0.e eVar = c1Var.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        if (z11) {
            d11.c();
        }
        long m11 = d11.m();
        d11.q(K1.Q.h(m11), K1.Q.g(m11), charSequence);
        int length = charSequence.length() + K1.Q.h(m11);
        d11.t(length, length);
        D0.e.a(eVar, true, cVar);
    }

    public static void r(c1 c1Var, String str, long j11, boolean z11, int i11) {
        G0.c cVar = G0.c.MergeIfPossible;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        D0.e eVar = c1Var.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        long m11 = c1Var.m(j11);
        d11.q(K1.Q.h(m11), K1.Q.g(m11), str);
        int length = str.length() + K1.Q.h(m11);
        d11.t(length, length);
        D0.e.a(eVar, z11, cVar);
    }

    public final void c() {
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        long m11 = d11.m();
        int i11 = K1.Q.f15010c;
        d11.t((int) (m11 & 4294967295L), (int) (d11.m() & 4294967295L));
        D0.e.a(eVar, true, cVar);
    }

    public final void d() {
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        d11.t(K1.Q.g(d11.m()), K1.Q.g(d11.m()));
        D0.e.a(eVar, true, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Wc.a e(@NotNull C2922g c2922g, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e1 frame;
        int i11;
        if (cVar instanceof e1) {
            frame = (e1) cVar;
            int i12 = frame.f7191g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f7191g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f7189e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f7191g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    frame.f7188d = c2922g;
                    frame.f7191g = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    this.f7171a.c(c2922g);
                    c10737n.q(new f1(this, c2922g));
                    Object n11 = c10737n.n();
                    if (n11 == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (n11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        frame = new e1(this, cVar);
        Object obj2 = frame.f7189e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f7191g;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (!Intrinsics.d(this.f7171a, c1Var.f7171a) || !Intrinsics.d(this.f7172b, c1Var.f7172b)) {
            return false;
        }
        c1Var.getClass();
        return true;
    }

    public final void f() {
        G0.c cVar = G0.c.NeverMerge;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        d11.d(K1.Q.h(d11.m()), K1.Q.g(d11.m()));
        d11.t(K1.Q.h(d11.m()), K1.Q.h(d11.m()));
        D0.e.a(eVar, true, cVar);
    }

    @NotNull
    public final D0.a g() {
        return this.f7171a.h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C2948t0 h() {
        return (C2948t0) this.f7174d.getValue();
    }

    public final int hashCode() {
        int hashCode = this.f7171a.hashCode() * 31;
        C2950u0 c2950u0 = this.f7172b;
        return (hashCode + (c2950u0 != null ? c2950u0.hashCode() : 0)) * 31;
    }

    @NotNull
    public final D0.a i() {
        return this.f7171a.h();
    }

    @NotNull
    public final D0.a j() {
        b value;
        D0.a b11;
        A1<b> a12 = this.f7173c;
        return (a12 == null || (value = a12.getValue()) == null || (b11 = value.b()) == null) ? this.f7171a.h() : b11;
    }

    public final void k(int i11, long j11) {
        long m11 = m(j11);
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        int i12 = K1.Q.f15010c;
        d11.s(i11, (int) (m11 >> 32), (int) (m11 & 4294967295L));
        D0.e.a(eVar, true, cVar);
    }

    public final long l(int i11) {
        b value;
        A1<b> a12 = this.f7173c;
        C2941p0 a11 = (a12 == null || (value = a12.getValue()) == null) ? null : value.a();
        return a11 != null ? a11.b(i11) : K1.S.a(i11, i11);
    }

    public final long m(long j11) {
        b value;
        A1<b> a12 = this.f7173c;
        C2941p0 a11 = (a12 == null || (value = a12.getValue()) == null) ? null : value.a();
        if (a11 == null) {
            return j11;
        }
        int i11 = K1.Q.f15010c;
        long b11 = a11.b((int) (j11 >> 32));
        long b12 = K1.Q.e(j11) ? b11 : a11.b((int) (4294967295L & j11));
        int min = Math.min(K1.Q.h(b11), K1.Q.h(b12));
        int max = Math.max(K1.Q.g(b11), K1.Q.g(b12));
        return K1.Q.i(j11) ? K1.S.a(max, min) : K1.S.a(min, max);
    }

    public final long n(long j11) {
        b value;
        A1<b> a12 = this.f7173c;
        C2941p0 a11 = (a12 == null || (value = a12.getValue()) == null) ? null : value.a();
        return a11 != null ? a.c(j11, a11, h()) : j11;
    }

    public final void o() {
        this.f7171a.g().a();
    }

    public final void p(@NotNull C3422b c3422b) {
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        d11.q(0, d11.l(), "");
        H.a(d11, c3422b.toString(), 1);
        D0.e.a(eVar, true, cVar);
    }

    public final void s() {
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        d11.t(0, d11.l());
        D0.e.a(eVar, true, cVar);
    }

    public final void t(long j11) {
        u(m(j11));
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformedTextFieldState(textFieldState=");
        D0.e eVar = this.f7171a;
        sb2.append(eVar);
        sb2.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb2.append(this.f7172b);
        sb2.append(", codepointTransformedText=");
        sb2.append(this.f7173c);
        sb2.append(", outputText=\"");
        sb2.append((Object) eVar.h());
        sb2.append("\", visualText=\"");
        sb2.append((Object) j());
        sb2.append("\")");
        return sb2.toString();
    }

    public final void u(long j11) {
        G0.c cVar = G0.c.MergeIfPossible;
        D0.e eVar = this.f7171a;
        eVar.d().f().b();
        I d11 = eVar.d();
        int i11 = K1.Q.f15010c;
        d11.t((int) (j11 >> 32), (int) (j11 & 4294967295L));
        D0.e.a(eVar, true, cVar);
    }

    public final void v(@NotNull C2948t0 c2948t0) {
        this.f7174d.setValue(c2948t0);
    }

    public final void w() {
        this.f7171a.g().b();
    }
}
