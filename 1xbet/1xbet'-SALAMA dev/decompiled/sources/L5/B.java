package L5;

import com.google.android.gms.ads.AdView;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC0331j implements InterfaceC0333l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdView f4393c;

    public B(int i7, C1050x1 c1050x1, String str, r rVar, C0343w c0343w, p145u1.c cVar) {
        super(i7);
        c1050x1.getClass();
        str.getClass();
        rVar.getClass();
        c0343w.getClass();
        this.f4392b = c1050x1;
    }

    @Override // L5.InterfaceC0333l
    public final void a() {
        AdView adView = this.f4393c;
        if (adView != null) {
            this.f4392b.U(this.f4481a, adView.getResponseInfo());
        }
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        AdView adView = this.f4393c;
        if (adView != null) {
            adView.a();
            this.f4393c = null;
        }
    }

    @Override // L5.AbstractC0331j
    public final io.flutter.plugin.platform.f c() {
        AdView adView = this.f4393c;
        if (adView == null) {
            return null;
        }
        return new K(adView, 0);
    }
}
