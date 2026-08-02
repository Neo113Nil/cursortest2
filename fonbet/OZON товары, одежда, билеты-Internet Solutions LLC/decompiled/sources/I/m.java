package I;

/* loaded from: classes8.dex */
final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.m f11278a;

    m(com.google.common.util.concurrent.m mVar) {
        this.f11278a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11278a.cancel(true);
    }
}
