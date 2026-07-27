package sg.bigo.ads.f0;

import android.os.SystemClock;
import java.util.HashMap;
import sg.bigo.ads.h0.C5228a;
import sg.bigo.ads.n1.n;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12785a;
    public final /* synthetic */ h b;

    public e(h hVar, String str) {
        this.b = hVar;
        this.f12785a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f12785a;
        HashMap hashMap = sg.bigo.ads.h0.g.f12955a;
        C5228a c5228a = hashMap.containsKey(str) ? (C5228a) hashMap.get(str) : null;
        C5115b c5115b = c5228a != null ? c5228a.b : null;
        if (c5115b == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c5115b.toString();
        c5115b.j = 3;
        this.b.f12787a.remove(c5115b);
        this.b.b.add(c5115b);
        ((n) this.b.f).a(c5115b, 1, elapsedRealtime - c5115b.n);
        c5115b.toString();
        sg.bigo.ads.h0.b.a(c5115b.f12782a);
        this.b.a();
    }
}
