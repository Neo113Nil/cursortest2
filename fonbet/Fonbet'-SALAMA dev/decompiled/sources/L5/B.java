package L5;

import com.google.android.gms.ads.AdView;
import w1.C1759x1;

/* loaded from: classes2.dex */
public final class B extends AbstractC0331j implements InterfaceC0333l {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4392b;

    /* renamed from: c, reason: collision with root package name */
    public AdView f4393c;

    public B(int i7, C1759x1 c1759x1, String str, r rVar, C0343w c0343w, u1.c cVar) {
        super(i7);
        c1759x1.getClass();
        str.getClass();
        rVar.getClass();
        c0343w.getClass();
        this.f4392b = c1759x1;
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
