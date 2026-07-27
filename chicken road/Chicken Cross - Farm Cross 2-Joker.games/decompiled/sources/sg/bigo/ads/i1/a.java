package sg.bigo.ads.i1;

import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f12993a;

    public a(Runnable runnable) {
        this.f12993a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            this.f12993a.run();
        } catch (Exception e) {
            str = "callback thread get exception:" + e.getLocalizedMessage();
            AbstractC5496a.a("Callback", str);
        } catch (Throwable th) {
            str = "callback thread get throwable:" + th.getLocalizedMessage();
            AbstractC5496a.a("Callback", str);
        }
    }
}
