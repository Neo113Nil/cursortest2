package L5;

import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class Q extends AbstractC0329h {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4429b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4430c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761y0 f4431d;

    /* renamed from: e, reason: collision with root package name */
    public final r f4432e;

    /* renamed from: f, reason: collision with root package name */
    public final C0334m f4433f;

    /* renamed from: g, reason: collision with root package name */
    public T2.a f4434g;

    public Q(int i7, C1759x1 c1759x1, String str, C0334m c0334m, C1761y0 c1761y0) {
        super(i7);
        this.f4429b = c1759x1;
        this.f4430c = str;
        this.f4433f = c0334m;
        this.f4432e = null;
        this.f4431d = c1761y0;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4434g = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        T2.a aVar = this.f4434g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        T2.a aVar = this.f4434g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
            return;
        }
        C1759x1 c1759x1 = this.f4429b;
        if (((AbstractActivityC1559c) c1759x1.f17925b) == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
            return;
        }
        aVar.setFullScreenContentCallback(new D(this.f4481a, c1759x1));
        this.f4434g.setOnAdMetadataChangedListener(new P(this));
        this.f4434g.show((AbstractActivityC1559c) c1759x1.f17925b, new P(this));
    }

    public Q(int i7, C1759x1 c1759x1, String str, r rVar, C1761y0 c1761y0) {
        super(i7);
        this.f4429b = c1759x1;
        this.f4430c = str;
        this.f4432e = rVar;
        this.f4433f = null;
        this.f4431d = c1761y0;
    }
}
