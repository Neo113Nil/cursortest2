package g0;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0.p f1116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1117c;

    public m(o oVar, e eVar, C0.p pVar) {
        this.f1117c = oVar;
        this.f1115a = eVar;
        this.f1116b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (o.f1125f) {
            o.a(this.f1117c, this.f1115a);
        }
        this.f1116b.c(null);
    }
}
