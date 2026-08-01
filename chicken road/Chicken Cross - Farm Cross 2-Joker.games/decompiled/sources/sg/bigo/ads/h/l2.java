package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class l2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f12904a;

    public l2(H2 h2) {
        this.f12904a = h2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12904a.f12687a.isFinishing()) {
            return;
        }
        this.f12904a.R();
    }
}
