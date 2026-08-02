package L5;

import android.util.Log;
import q5.AbstractActivityC1559c;
import w1.C1759x1;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class A extends AbstractC0329h {

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4390b;

    /* renamed from: c, reason: collision with root package name */
    public A2.b f4391c;

    public A(int i7, C1759x1 c1759x1, String str, r rVar, C0334m c0334m, C1761y0 c1761y0) {
        super(i7);
        if (!((rVar == null && c0334m == null) ? false : true)) {
            throw new IllegalStateException("One of request and adManagerAdRequest must be non-null.");
        }
        this.f4390b = c1759x1;
    }

    @Override // L5.AbstractC0331j
    public final void b() {
        this.f4391c = null;
    }

    @Override // L5.AbstractC0329h
    public final void d(boolean z4) {
        A2.b bVar = this.f4391c;
        if (bVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            bVar.setImmersiveMode(z4);
        }
    }

    @Override // L5.AbstractC0329h
    public final void e() {
        A2.b bVar = this.f4391c;
        if (bVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
            return;
        }
        C1759x1 c1759x1 = this.f4390b;
        if (((AbstractActivityC1559c) c1759x1.f17925b) == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            bVar.setFullScreenContentCallback(new D(this.f4481a, c1759x1));
            this.f4391c.show((AbstractActivityC1559c) c1759x1.f17925b);
        }
    }
}
