package S0;

import De.C2862e;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.C10740o0;

/* renamed from: S0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3946c0 implements V0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> f25361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2862e f25362b;

    /* renamed from: c, reason: collision with root package name */
    private xe.B0 f25363c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3946c0(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f25361a = function2;
        this.f25362b = xe.N.a(coroutineContext);
    }

    @Override // S0.V0
    public final void b() {
        xe.B0 b02 = this.f25363c;
        if (b02 != null) {
            ((xe.H0) b02).j(C10740o0.a("Old job was still running!", null));
        }
        this.f25363c = C10727i.c(this.f25362b, null, null, this.f25361a, 3);
    }

    @Override // S0.V0
    public final void d() {
        xe.B0 b02 = this.f25363c;
        if (b02 != null) {
            b02.j(new C3952e0());
        }
        this.f25363c = null;
    }

    @Override // S0.V0
    public final void e() {
        xe.B0 b02 = this.f25363c;
        if (b02 != null) {
            b02.j(new C3952e0());
        }
        this.f25363c = null;
    }
}
