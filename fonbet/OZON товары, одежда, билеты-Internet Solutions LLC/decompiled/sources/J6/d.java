package J6;

/* loaded from: classes8.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F6.a f14159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14160b;

    d(b bVar, F6.a aVar) {
        this.f14160b = bVar;
        this.f14159a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14160b.f14134f.remove(this.f14159a);
    }
}
