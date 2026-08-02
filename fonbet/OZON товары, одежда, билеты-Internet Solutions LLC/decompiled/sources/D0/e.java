package D0;

import E0.C2922g;
import E0.I;
import E0.r;
import K1.Q;
import K1.S;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import c1.AbstractC5715f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g f5192a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private I f5193b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f5194c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f5195d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final i f5196e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final U0.b<a> f5197f;

    public interface a {
        void a(@NotNull D0.a aVar, @NotNull D0.a aVar2, boolean z11);
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5198a;

        static {
            int[] iArr = new int[G0.c.values().length];
            try {
                iArr[G0.c.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G0.c.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[G0.c.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5198a = iArr;
        }
    }

    public e(String str) {
        C3991w0 f7;
        C3991w0 f11;
        int length = str.length();
        long a11 = S.a(length, length);
        this.f5192a = new g(0);
        this.f5193b = new I(str, S.b(str.length(), a11));
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f5194c = f7;
        f11 = n1.f(new D0.a(str, a11, (Q) null, 12), D1.f25195a);
        this.f5195d = f11;
        this.f5196e = new i(this);
        this.f5197f = new U0.b<>(new a[16]);
    }

    public static final void a(e eVar, boolean z11, G0.c cVar) {
        D0.a h11 = eVar.h();
        if (eVar.f5193b.f().c() == 0 && Q.d(h11.d(), eVar.f5193b.m())) {
            if (Intrinsics.d(h11.b(), eVar.f5193b.g()) && Intrinsics.d(h11.c(), eVar.f5193b.k())) {
                return;
            }
            eVar.j(eVar.h(), new D0.a(eVar.f5193b.toString(), eVar.f5193b.m(), eVar.f5193b.g(), eVar.f5193b.k()), z11);
            return;
        }
        D0.a aVar = new D0.a(eVar.f5193b.toString(), eVar.f5193b.m(), eVar.f5193b.g(), eVar.f5193b.k());
        eVar.j(h11, aVar, z11);
        r f7 = eVar.f5193b.f();
        eVar.getClass();
        int i11 = b.f5198a[cVar.ordinal()];
        g gVar = eVar.f5192a;
        if (i11 == 1) {
            gVar.a();
        } else if (i11 == 2) {
            h.a(gVar, h11, aVar, f7, true);
        } else {
            if (i11 != 3) {
                return;
            }
            h.a(gVar, h11, aVar, f7, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(D0.a aVar, D0.a aVar2, boolean z11) {
        this.f5195d.setValue(aVar2);
        this.f5194c.setValue(Boolean.FALSE);
        U0.b<a> bVar = this.f5197f;
        int m11 = bVar.m();
        if (m11 > 0) {
            a[] l11 = bVar.l();
            int i11 = 0;
            do {
                l11[i11].a(aVar, aVar2, z11);
                i11++;
            } while (i11 < m11);
        }
    }

    public final void c(@NotNull C2922g c2922g) {
        this.f5197f.b(c2922g);
    }

    @NotNull
    public final I d() {
        return this.f5193b;
    }

    @NotNull
    public final CharSequence e() {
        return h().e();
    }

    @NotNull
    public final g f() {
        return this.f5192a;
    }

    @NotNull
    public final i g() {
        return this.f5196e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final D0.a h() {
        return (D0.a) this.f5195d.getValue();
    }

    public final void i(@NotNull C2922g c2922g) {
        this.f5197f.s(c2922g);
    }

    @NotNull
    public final String toString() {
        AbstractC5715f a11 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a11 != null ? a11.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a11);
        try {
            return "TextFieldState(selection=" + ((Object) Q.j(h().d())) + ", text=\"" + ((Object) e()) + "\")";
        } finally {
            AbstractC5715f.a.d(a11, b11, h11);
        }
    }
}
