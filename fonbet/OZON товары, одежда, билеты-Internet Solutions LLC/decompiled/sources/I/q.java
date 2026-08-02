package I;

/* loaded from: classes8.dex */
final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f11284a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.m f11285b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f11286c;

    q(r rVar, int i11, com.google.common.util.concurrent.m mVar) {
        this.f11286c = rVar;
        this.f11284a = i11;
        this.f11285b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11286c.b(this.f11284a, this.f11285b);
    }
}
