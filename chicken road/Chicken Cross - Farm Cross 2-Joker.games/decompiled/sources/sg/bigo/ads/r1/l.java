package sg.bigo.ads.r1;

/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f13277a;

    public l(n nVar) {
        this.f13277a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13277a.g();
        this.f13277a.a("AdVideoTooLate", new int[]{10107});
    }
}
