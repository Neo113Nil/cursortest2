package L5;

import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class G extends AbstractC0329h {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4399b;

    /* renamed from: c, reason: collision with root package name */
    public K2.a f4400c;

    public G(int i7, C1759x1 c1759x1, String str, r rVar, C1761y0 c1761y0) {
        super(i7);
        this.f4399b = c1759x1;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4400c = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        K2.a aVar = this.f4400c;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        K2.a aVar = this.f4400c;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
            return;
        }
        C1759x1 c1759x1 = this.f4399b;
        if (((AbstractActivityC1559c) c1759x1.f17925b) == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            aVar.setFullScreenContentCallback(new D(this.f4481a, c1759x1));
            this.f4400c.show((AbstractActivityC1559c) c1759x1.f17925b);
        }
    }
}
