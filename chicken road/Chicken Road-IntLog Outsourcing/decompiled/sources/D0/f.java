package D0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final k f419a;

    /* renamed from: b, reason: collision with root package name */
    public final J1.a f420b;

    public f(k kVar, J1.a aVar) {
        this.f419a = kVar;
        this.f420b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f419a.f428a != this) {
            return;
        }
        if (i.f426f.G(this.f419a, this, i.g(this.f420b))) {
            i.d(this.f419a);
        }
    }
}
