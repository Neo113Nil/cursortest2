package sg.bigo.ads.Y0;

/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12643a;

    public q(x xVar) {
        this.f12643a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f12643a.i0;
        if (mVar != null) {
            mVar.onReceiveValue(Boolean.FALSE);
        }
    }
}
