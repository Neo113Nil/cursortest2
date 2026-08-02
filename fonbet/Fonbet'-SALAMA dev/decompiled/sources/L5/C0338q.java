package L5;

import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w1.C1761y0;

/* renamed from: L5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0338q extends AbstractC0329h {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4494b;

    /* renamed from: c, reason: collision with root package name */
    public z2.c f4495c;

    public C0338q(int i7, C1759x1 c1759x1, String str, C0334m c0334m, C1761y0 c1761y0) {
        super(i7);
        this.f4494b = c1759x1;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4495c = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        z2.c cVar = this.f4495c;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        z2.c cVar = this.f4495c;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
            return;
        }
        C1759x1 c1759x1 = this.f4494b;
        if (((AbstractActivityC1559c) c1759x1.f17925b) == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            cVar.setFullScreenContentCallback(new D(this.f4481a, c1759x1));
            this.f4495c.show((AbstractActivityC1559c) c1759x1.f17925b);
        }
    }
}
