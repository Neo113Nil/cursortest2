package J6;

/* loaded from: classes8.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F6.a f14157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14158b;

    c(b bVar, F6.a aVar) {
        this.f14158b = bVar;
        this.f14157a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14158b.f14134f.add(this.f14157a);
    }
}
