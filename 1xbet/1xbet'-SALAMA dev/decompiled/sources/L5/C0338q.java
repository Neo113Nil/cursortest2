package L5;

import android.util.Log;
import p155w1.C1050x1;
import p155w1.C1052y0;

/* JADX INFO: renamed from: L5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0338q extends AbstractC0329h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p172z2.c f4495c;

    public C0338q(int i7, C1050x1 c1050x1, String str, C0334m c0334m, C1052y0 c1052y0) {
        super(i7);
        this.f4494b = c1050x1;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4495c = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        p172z2.c cVar = this.f4495c;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        p172z2.c cVar = this.f4495c;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
            return;
        }
        C1050x1 c1050x1 = this.f4494b;
        if (((p121q5.c) c1050x1.f17931b) == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            cVar.setFullScreenContentCallback(new D(this.f4481a, c1050x1));
            this.f4495c.show((p121q5.c) c1050x1.f17931b);
        }
    }
}
