package C;

import a7.b;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final /* synthetic */ class l0 implements b.c, b.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4206b;

    public /* synthetic */ l0(Object obj, Object obj2) {
        this.f4205a = obj;
        this.f4206b = obj2;
    }

    @Override // androidx.concurrent.futures.b.c
    public Object c(b.a aVar) {
        s0 s0Var = (s0) this.f4205a;
        s0Var.getClass();
        ((AtomicReference) this.f4206b).set(aVar);
        return "SurfaceRequest-surface-recreation(" + s0Var.hashCode() + ")";
    }

    @Override // a7.b.a
    public Object execute() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(((Y6.m) this.f4205a).f34680c.U0((S6.r) this.f4206b));
        return valueOf;
    }
}
