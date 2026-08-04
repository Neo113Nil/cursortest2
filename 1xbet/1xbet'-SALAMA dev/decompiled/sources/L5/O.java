package L5;

import android.util.Log;
import p155w1.C1050x1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC0329h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1052y0 f4424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f4425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0334m f4426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S2.c f4427g;

    public O(int i7, C1050x1 c1050x1, String str, C0334m c0334m, C1052y0 c1052y0) {
        super(i7);
        this.f4422b = c1050x1;
        this.f4423c = str;
        this.f4426f = c0334m;
        this.f4425e = null;
        this.f4424d = c1052y0;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4427g = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        S2.c cVar = this.f4427g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        S2.c cVar = this.f4427g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
            return;
        }
        C1050x1 c1050x1 = this.f4422b;
        if (((p121q5.c) c1050x1.f17931b) == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
            return;
        }
        cVar.setFullScreenContentCallback(new D(this.f4481a, c1050x1));
        this.f4427g.setOnAdMetadataChangedListener(new M(this));
        this.f4427g.show((p121q5.c) c1050x1.f17931b, new M(this));
    }

    public O(int i7, C1050x1 c1050x1, String str, r rVar, C1052y0 c1052y0) {
        super(i7);
        this.f4422b = c1050x1;
        this.f4423c = str;
        this.f4425e = rVar;
        this.f4426f = null;
        this.f4424d = c1052y0;
    }
}
