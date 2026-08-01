package sg.bigo.ads.Y0;

/* loaded from: classes3.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12645a;

    public s(x xVar) {
        this.f12645a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f12645a;
        xVar.d0 = false;
        try {
            xVar.h0.put("e_x", xVar.e0);
            x xVar2 = this.f12645a;
            xVar2.h0.put("e_y", xVar2.f0);
            this.f12645a.h0.put("e_ts", System.currentTimeMillis());
            this.f12645a.O();
        } catch (Exception unused) {
        }
    }
}
