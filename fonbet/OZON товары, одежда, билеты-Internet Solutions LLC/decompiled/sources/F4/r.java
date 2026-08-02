package F4;

import F4.AbstractC3028h;
import Sc.InterfaceC4003e;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final /* synthetic */ class r implements AbstractC3028h.c, InterfaceC7732n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3037q<Object, Object> f8949a;

    r(C3037q<Object, Object> c3037q) {
        this.f8949a = c3037q;
    }

    @Override // F4.AbstractC3028h.c
    public final void a() {
        this.f8949a.c();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AbstractC3028h.c) && (obj instanceof InterfaceC7732n)) {
            return getFunctionDelegate().equals(((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    @NotNull
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(0, this.f8949a, C3037q.class, "invalidate", "invalidate()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
