package I0;

import androidx.collection.C5150t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class S0 implements InterfaceC3198n0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11369a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11370b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11371c;

    /* renamed from: d, reason: collision with root package name */
    private final C3220z f11372d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3218y f11373e;

    public S0(boolean z11, int i11, int i12, C3220z c3220z, @NotNull C3218y c3218y) {
        this.f11369a = z11;
        this.f11370b = i11;
        this.f11371c = i12;
        this.f11372d = c3220z;
        this.f11373e = c3218y;
    }

    @Override // I0.InterfaceC3198n0
    public final boolean a() {
        return this.f11369a;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y b() {
        return this.f11373e;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final EnumC3195m c() {
        int i11 = this.f11370b;
        int i12 = this.f11371c;
        return i11 < i12 ? EnumC3195m.NOT_CROSSED : i11 > i12 ? EnumC3195m.CROSSED : this.f11373e.c();
    }

    @Override // I0.InterfaceC3198n0
    public final boolean d(InterfaceC3198n0 interfaceC3198n0) {
        if (this.f11372d == null || interfaceC3198n0 == null || !(interfaceC3198n0 instanceof S0)) {
            return true;
        }
        S0 s02 = (S0) interfaceC3198n0;
        return (this.f11370b == s02.f11370b && this.f11371c == s02.f11371c && this.f11369a == s02.f11369a && !this.f11373e.j(s02.f11373e)) ? false : true;
    }

    @Override // I0.InterfaceC3198n0
    public final C3220z e() {
        return this.f11372d;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y f() {
        return this.f11373e;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y g() {
        return this.f11373e;
    }

    @Override // I0.InterfaceC3198n0
    public final int getSize() {
        return 1;
    }

    @Override // I0.InterfaceC3198n0
    public final int h() {
        return this.f11370b;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final androidx.collection.F i(@NotNull C3220z c3220z) {
        if ((!c3220z.c() && c3220z.d().c() > c3220z.b().c()) || (c3220z.c() && c3220z.d().c() <= c3220z.b().c())) {
            c3220z = C3220z.a(c3220z, null, null, !c3220z.c(), 3);
        }
        long g10 = this.f11373e.g();
        int i11 = C5150t.f38742b;
        androidx.collection.F f7 = new androidx.collection.F((Object) null);
        f7.j(g10, c3220z);
        return f7;
    }

    @Override // I0.InterfaceC3198n0
    @NotNull
    public final C3218y j() {
        return this.f11373e;
    }

    @Override // I0.InterfaceC3198n0
    public final int k() {
        return this.f11371c;
    }

    @Override // I0.InterfaceC3198n0
    public final void l(@NotNull Function1<? super C3218y, Unit> function1) {
    }

    @NotNull
    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f11369a + ", crossed=" + c() + ", info=\n\t" + this.f11373e + ')';
    }
}
