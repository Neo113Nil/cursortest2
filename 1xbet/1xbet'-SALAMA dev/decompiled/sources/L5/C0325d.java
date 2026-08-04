package L5;

import android.util.Log;
import android.widget.ScrollView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import p155w1.C1050x1;

/* JADX INFO: renamed from: L5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0325d extends C0336o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScrollView f4458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4459i;

    @Override // L5.C0336o, L5.InterfaceC0333l
    public final void a() {
        AdManagerAdView adManagerAdView = this.f4492g;
        if (adManagerAdView != null) {
            adManagerAdView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0324c(this, 0));
            this.f4487b.U(this.f4481a, this.f4492g.getResponseInfo());
        }
    }

    @Override // L5.C0336o, L5.AbstractC0331j
    public final void b() {
        AdManagerAdView adManagerAdView = this.f4492g;
        if (adManagerAdView != null) {
            adManagerAdView.a();
            this.f4492g = null;
        }
        ScrollView scrollView = this.f4458h;
        if (scrollView != null) {
            scrollView.removeAllViews();
            this.f4458h = null;
        }
    }

    @Override // L5.C0336o, L5.AbstractC0331j
    public final io.flutter.plugin.platform.f c() {
        ScrollView scrollView;
        if (this.f4492g == null) {
            return null;
        }
        ScrollView scrollView2 = this.f4458h;
        if (scrollView2 != null) {
            return new K(scrollView2, 0);
        }
        C1050x1 c1050x1 = this.f4487b;
        if (((p121q5.c) c1050x1.f17931b) == null) {
            Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
            scrollView = null;
        } else {
            scrollView = new ScrollView((p121q5.c) c1050x1.f17931b);
        }
        if (scrollView == null) {
            return null;
        }
        scrollView.setClipChildren(false);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setHorizontalScrollBarEnabled(false);
        this.f4458h = scrollView;
        scrollView.addView(this.f4492g);
        return new K(this.f4492g, 0);
    }
}
