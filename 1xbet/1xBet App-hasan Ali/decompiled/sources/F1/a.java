package F1;

import a4.h;
import kotlin.jvm.internal.l;
import p4.InterfaceC2280u;
import p4.U;
import p4.r;

/* loaded from: classes.dex */
public final class a implements AutoCloseable, InterfaceC2280u {

    /* renamed from: k, reason: collision with root package name */
    public final h f1521k;

    public a(h hVar) {
        l.f("coroutineContext", hVar);
        this.f1521k = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        U u5 = (U) this.f1521k.l(r.f18819l);
        if (u5 != null) {
            u5.d(null);
        }
    }

    @Override // p4.InterfaceC2280u
    public final h i() {
        return this.f1521k;
    }
}
