package L5;

import android.util.Log;
import p155w1.C1050x1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class Q extends AbstractC0329h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1052y0 f4431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f4432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0334m f4433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public T2.a f4434g;

    public Q(int i7, C1050x1 c1050x1, String str, C0334m c0334m, C1052y0 c1052y0) {
        super(i7);
        this.f4429b = c1050x1;
        this.f4430c = str;
        this.f4433f = c0334m;
        this.f4432e = null;
        this.f4431d = c1052y0;
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
        C1050x1 c1050x1 = this.f4429b;
        if (((p121q5.c) c1050x1.f17931b) == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
            return;
        }
        aVar.setFullScreenContentCallback(new D(this.f4481a, c1050x1));
        this.f4434g.setOnAdMetadataChangedListener(new P(this));
        this.f4434g.show((p121q5.c) c1050x1.f17931b, new P(this));
    }

    public Q(int i7, C1050x1 c1050x1, String str, r rVar, C1052y0 c1052y0) {
        super(i7);
        this.f4429b = c1050x1;
        this.f4430c = str;
        this.f4432e = rVar;
        this.f4433f = null;
        this.f4431d = c1052y0;
    }
}
