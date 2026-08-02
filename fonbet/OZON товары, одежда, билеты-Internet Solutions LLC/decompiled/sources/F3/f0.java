package F3;

import F3.InterfaceC3018x;
import j3.AbstractC7252H;
import j3.C7275q;

/* loaded from: classes.dex */
public abstract class f0 extends AbstractC3002g<Void> {

    /* renamed from: d, reason: collision with root package name */
    protected final InterfaceC3018x f8673d;

    protected f0(InterfaceC3018x interfaceC3018x) {
        this.f8673d = interfaceC3018x;
    }

    @Override // F3.InterfaceC3018x
    public final AbstractC7252H a() {
        return this.f8673d.a();
    }

    @Override // F3.InterfaceC3018x
    public final boolean b() {
        return this.f8673d.b();
    }

    @Override // F3.AbstractC3002g
    protected final InterfaceC3018x.b c(Void r12, InterfaceC3018x.b bVar) {
        return h(bVar);
    }

    @Override // F3.AbstractC3002g
    protected final long d(long j11, Object obj) {
        return j11;
    }

    @Override // F3.AbstractC3002g
    protected final int e(int i11, Object obj) {
        return i11;
    }

    @Override // F3.AbstractC3002g
    protected final void f(Object obj, AbstractC2996a abstractC2996a, AbstractC7252H abstractC7252H) {
        i(abstractC7252H);
    }

    @Override // F3.InterfaceC3018x
    public final C7275q getMediaItem() {
        return this.f8673d.getMediaItem();
    }

    protected InterfaceC3018x.b h(InterfaceC3018x.b bVar) {
        return bVar;
    }

    protected abstract void i(AbstractC7252H abstractC7252H);

    protected void j() {
        g(null, this.f8673d);
    }

    @Override // F3.AbstractC3002g, F3.AbstractC2996a
    protected final void prepareSourceInternal(p3.z zVar) {
        super.prepareSourceInternal(zVar);
        j();
    }

    @Override // F3.InterfaceC3018x
    public void updateMediaItem(C7275q c7275q) {
        this.f8673d.updateMediaItem(c7275q);
    }
}
