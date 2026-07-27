package a3;

import java.util.logging.Level;

/* renamed from: a3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193l implements InterfaceC0187f {

    /* renamed from: a, reason: collision with root package name */
    public final C0182a f3876a;

    /* renamed from: b, reason: collision with root package name */
    public final C0182a f3877b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3878c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC0194m f3879d;

    public C0193l(EnumC0194m enumC0194m, C0182a c0182a, C0182a c0182a2) {
        this.f3879d = enumC0194m;
        this.f3876a = c0182a;
        this.f3877b = c0182a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f3878c || this.f3879d.a() != this.f3877b) {
            EnumC0194m.f3881b.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f3878c = true;
            EnumC0194m.f3882c.set(this.f3876a);
        }
    }
}
