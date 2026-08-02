package L5;

import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class O extends AbstractC0329h {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4423c;

    /* renamed from: d, reason: collision with root package name */
    public final C1761y0 f4424d;

    /* renamed from: e, reason: collision with root package name */
    public final r f4425e;

    /* renamed from: f, reason: collision with root package name */
    public final C0334m f4426f;

    /* renamed from: g, reason: collision with root package name */
    public S2.c f4427g;

    public O(int i7, C1759x1 c1759x1, String str, C0334m c0334m, C1761y0 c1761y0) {
        super(i7);
        this.f4422b = c1759x1;
        this.f4423c = str;
        this.f4426f = c0334m;
        this.f4425e = null;
        this.f4424d = c1761y0;
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
        C1759x1 c1759x1 = this.f4422b;
        if (((AbstractActivityC1559c) c1759x1.f17925b) == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
            return;
        }
        cVar.setFullScreenContentCallback(new D(this.f4481a, c1759x1));
        this.f4427g.setOnAdMetadataChangedListener(new M(this));
        this.f4427g.show((AbstractActivityC1559c) c1759x1.f17925b, new M(this));
    }

    public O(int i7, C1759x1 c1759x1, String str, r rVar, C1761y0 c1761y0) {
        super(i7);
        this.f4422b = c1759x1;
        this.f4423c = str;
        this.f4425e = rVar;
        this.f4426f = null;
        this.f4424d = c1761y0;
    }
}
