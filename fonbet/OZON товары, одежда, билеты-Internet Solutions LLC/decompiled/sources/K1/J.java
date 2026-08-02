package K1;

import B0.C2454a;
import B90.C2616s;
import K1.C3422b;
import Kk.C3532b;
import P1.AbstractC3809p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f14985a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T f14986b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<C3422b.C0288b<C3442w>> f14987c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14988d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14989e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14990f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Z1.d f14991g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Z1.s f14992h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AbstractC3809p.a f14993i;

    /* renamed from: j, reason: collision with root package name */
    private final long f14994j;

    private J() {
        throw null;
    }

    public J(C3422b c3422b, T t2, List list, int i11, boolean z11, int i12, Z1.d dVar, Z1.s sVar, AbstractC3809p.a aVar, long j11) {
        this.f14985a = c3422b;
        this.f14986b = t2;
        this.f14987c = list;
        this.f14988d = i11;
        this.f14989e = z11;
        this.f14990f = i12;
        this.f14991g = dVar;
        this.f14992h = sVar;
        this.f14993i = aVar;
        this.f14994j = j11;
    }

    public final long a() {
        return this.f14994j;
    }

    @NotNull
    public final Z1.d b() {
        return this.f14991g;
    }

    @NotNull
    public final AbstractC3809p.a c() {
        return this.f14993i;
    }

    @NotNull
    public final Z1.s d() {
        return this.f14992h;
    }

    public final int e() {
        return this.f14988d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j11 = (J) obj;
        return Intrinsics.d(this.f14985a, j11.f14985a) && Intrinsics.d(this.f14986b, j11.f14986b) && Intrinsics.d(this.f14987c, j11.f14987c) && this.f14988d == j11.f14988d && this.f14989e == j11.f14989e && this.f14990f == j11.f14990f && Intrinsics.d(this.f14991g, j11.f14991g) && this.f14992h == j11.f14992h && Intrinsics.d(this.f14993i, j11.f14993i) && Z1.b.e(this.f14994j, j11.f14994j);
    }

    public final int f() {
        return this.f14990f;
    }

    @NotNull
    public final List<C3422b.C0288b<C3442w>> g() {
        return this.f14987c;
    }

    public final boolean h() {
        return this.f14989e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14994j) + ((this.f14993i.hashCode() + ((this.f14992h.hashCode() + ((this.f14991g.hashCode() + C2454a.a(this.f14990f, C3532b.a((G.g.b(C2616s.a(this.f14985a.hashCode() * 31, 31, this.f14986b), 31, this.f14987c) + this.f14988d) * 31, 31, this.f14989e), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final T i() {
        return this.f14986b;
    }

    @NotNull
    public final C3422b j() {
        return this.f14985a;
    }

    @NotNull
    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f14985a) + ", style=" + this.f14986b + ", placeholders=" + this.f14987c + ", maxLines=" + this.f14988d + ", softWrap=" + this.f14989e + ", overflow=" + ((Object) V1.r.a(this.f14990f)) + ", density=" + this.f14991g + ", layoutDirection=" + this.f14992h + ", fontFamilyResolver=" + this.f14993i + ", constraints=" + ((Object) Z1.b.o(this.f14994j)) + ')';
    }
}
