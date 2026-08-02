package E4;

import A1.RunnableC0032m0;
import B4.InterfaceC0073q;
import java.util.concurrent.Executor;

/* renamed from: E4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0169b implements InterfaceC0073q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2166a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0073q f2167b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2168c = false;

    public C0169b(Executor executor, InterfaceC0073q interfaceC0073q) {
        this.f2166a = executor;
        this.f2167b = interfaceC0073q;
    }

    @Override // B4.InterfaceC0073q
    public final void a(Object obj, B4.I i7) {
        this.f2166a.execute(new RunnableC0032m0(this, obj, i7, 1));
    }
}
