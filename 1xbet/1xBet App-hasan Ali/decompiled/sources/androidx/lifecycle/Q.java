package androidx.lifecycle;

/* loaded from: classes.dex */
public final class Q implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final C0493w f7035k;

    /* renamed from: l, reason: collision with root package name */
    public final EnumC0486o f7036l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7037m;

    public Q(C0493w c0493w, EnumC0486o enumC0486o) {
        kotlin.jvm.internal.l.f("registry", c0493w);
        kotlin.jvm.internal.l.f("event", enumC0486o);
        this.f7035k = c0493w;
        this.f7036l = enumC0486o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7037m) {
            return;
        }
        this.f7035k.p(this.f7036l);
        this.f7037m = true;
    }
}
