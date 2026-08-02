package B4;

import B4.S;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class T {

    /* renamed from: b, reason: collision with root package name */
    private boolean f2570b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2571c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2573e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2574f;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S.a f2569a = new S.a();

    /* renamed from: d, reason: collision with root package name */
    private int f2572d = -1;

    public final void a(@NotNull Function1<? super C2573b, Unit> animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        C2573b c2573b = new C2573b();
        animBuilder.invoke(c2573b);
        int a11 = c2573b.a();
        S.a aVar = this.f2569a;
        aVar.b(a11);
        aVar.c(c2573b.b());
        aVar.e(-1);
        aVar.f(-1);
    }

    @NotNull
    public final S b() {
        boolean z11 = this.f2570b;
        S.a aVar = this.f2569a;
        aVar.d(z11);
        aVar.h(this.f2571c);
        aVar.g(this.f2572d, this.f2573e, this.f2574f);
        return aVar.a();
    }

    public final void c(int i11, @NotNull Function1<? super f0, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        this.f2572d = i11;
        this.f2573e = false;
        f0 f0Var = new f0();
        ((C2592v) popUpToBuilder).invoke(f0Var);
        this.f2573e = false;
        this.f2574f = f0Var.a();
    }

    public final void d(boolean z11) {
        this.f2570b = z11;
    }

    public final void e(boolean z11) {
        this.f2571c = z11;
    }
}
