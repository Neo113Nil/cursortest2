package L5;

import android.util.Log;
import p155w1.C1050x1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC0329h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K2.a f4400c;

    public G(int i7, C1050x1 c1050x1, String str, r rVar, C1052y0 c1052y0) {
        super(i7);
        this.f4399b = c1050x1;
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
        C1050x1 c1050x1 = this.f4399b;
        if (((p121q5.c) c1050x1.f17931b) == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            aVar.setFullScreenContentCallback(new D(this.f4481a, c1050x1));
            this.f4400c.show((p121q5.c) c1050x1.f17931b);
        }
    }
}
