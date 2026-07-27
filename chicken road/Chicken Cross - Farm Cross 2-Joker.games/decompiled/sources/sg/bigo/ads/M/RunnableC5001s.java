package sg.bigo.ads.M;

/* renamed from: sg.bigo.ads.M.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5001s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12453a;

    public RunnableC5001s(String str) {
        this.f12453a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.U0.a.a(this.f12453a);
        sg.bigo.ads.F0.a.a(this.f12453a);
        String str = this.f12453a;
        sg.bigo.ads.F0.b.b("sp_ads", "impression_num_" + str, Integer.valueOf(((Integer) sg.bigo.ads.F0.b.a("sp_ads", "impression_num_" + str, (Object) 0, 0)).intValue() + 1), 0);
        sg.bigo.ads.F0.b.b("sp_ads", "last_impression_ts_" + this.f12453a, Long.valueOf(System.currentTimeMillis()), 1);
    }
}
