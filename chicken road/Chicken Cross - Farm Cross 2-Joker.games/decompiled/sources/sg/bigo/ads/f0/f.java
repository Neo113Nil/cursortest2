package sg.bigo.ads.f0;

import android.os.SystemClock;
import java.util.HashMap;
import sg.bigo.ads.h0.C5228a;
import sg.bigo.ads.n1.n;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12786a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ h d;

    public f(h hVar, String str, String str2, long j) {
        this.d = hVar;
        this.f12786a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = this.f12786a;
        HashMap hashMap = sg.bigo.ads.h0.g.f12955a;
        C5228a c5228a = hashMap.containsKey(str) ? (C5228a) hashMap.get(str) : null;
        C5115b c5115b = c5228a != null ? c5228a.b : null;
        if (c5115b == null) {
            return;
        }
        c5115b.toString();
        c5115b.j = 4;
        if (!c5115b.o) {
            c5115b.k++;
        }
        c5115b.l = System.currentTimeMillis();
        this.d.f12787a.remove(c5115b);
        this.d.d.remove(c5115b);
        this.d.d.add(c5115b);
        sg.bigo.ads.h0.b.a(c5115b.f12782a);
        ((n) this.d.f).a(c5115b, this.b, elapsedRealtime - c5115b.n, this.c);
        c5115b.toString();
        this.d.a();
    }
}
