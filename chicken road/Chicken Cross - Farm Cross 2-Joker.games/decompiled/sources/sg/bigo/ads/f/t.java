package sg.bigo.ads.f;

import android.os.SystemClock;
import java.util.HashMap;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class t implements sg.bigo.ads.Q.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.U0.c f12776a;
    public final /* synthetic */ long b;

    public t(sg.bigo.ads.U0.c cVar, long j) {
        this.f12776a = cVar;
        this.b = j;
    }

    @Override // sg.bigo.ads.Q.a
    public final void a(sg.bigo.ads.P.d dVar) {
        sg.bigo.ads.s1.b.a(this.f12776a, "banner_load_cost", SystemClock.elapsedRealtime() - this.b, 0, (HashMap) null);
        AbstractC5496a.a(1, 5, "BannerAd", "Failed to load banner media.");
    }

    @Override // sg.bigo.ads.Q.a
    public final void a() {
        sg.bigo.ads.s1.b.a(this.f12776a, "banner_load_cost", SystemClock.elapsedRealtime() - this.b, 1, (HashMap) null);
    }
}
