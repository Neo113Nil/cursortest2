package B0;

import P1.AbstractC3809p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class N1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Z1.s f1455a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Z1.d f1456b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC3809p.a f1457c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private K1.T f1458d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Object f1459e;

    /* renamed from: f, reason: collision with root package name */
    private long f1460f;

    public N1(@NotNull Z1.s sVar, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar, @NotNull K1.T t2, @NotNull Object obj) {
        long a11;
        this.f1455a = sVar;
        this.f1456b = dVar;
        this.f1457c = aVar;
        this.f1458d = t2;
        this.f1459e = obj;
        a11 = C2501p1.a(t2, dVar, aVar, C2501p1.f1895a, 1);
        this.f1460f = a11;
    }

    public final long a() {
        return this.f1460f;
    }

    public final void b(@NotNull Z1.s sVar, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar, @NotNull K1.T t2, @NotNull Object obj) {
        long a11;
        if (sVar == this.f1455a && Intrinsics.d(dVar, this.f1456b) && Intrinsics.d(aVar, this.f1457c) && Intrinsics.d(t2, this.f1458d) && Intrinsics.d(obj, this.f1459e)) {
            return;
        }
        this.f1455a = sVar;
        this.f1456b = dVar;
        this.f1457c = aVar;
        this.f1458d = t2;
        this.f1459e = obj;
        a11 = C2501p1.a(t2, dVar, aVar, C2501p1.f1895a, 1);
        this.f1460f = a11;
    }
}
