package sg.bigo.ads.v1;

import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f13359a;

    public a(Runnable runnable) {
        this.f13359a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            this.f13359a.run();
        } catch (Exception e) {
            str = "stat thread get exception:" + e.getLocalizedMessage();
            AbstractC5496a.a("Stats", str);
        } catch (Throwable th) {
            str = "stat thread get throwable:" + th.getLocalizedMessage();
            AbstractC5496a.a("Stats", str);
        }
    }
}
