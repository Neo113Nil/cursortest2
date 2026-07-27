package sg.bigo.ads.h1;

import java.util.HashMap;
import sg.bigo.ads.e.AbstractC5081e;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12973a;

    public v(x xVar) {
        this.f12973a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12973a.h = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "last_stat_cb_events_time", (Object) 0, 1)).longValue();
        x xVar = this.f12973a;
        if (xVar.h == 0) {
            xVar.h = System.currentTimeMillis();
        }
        this.f12973a.g = i.a();
        x xVar2 = this.f12973a;
        i iVar = xVar2.g;
        if (iVar == null || iVar.f12964a + iVar.b + iVar.c + iVar.d == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = xVar2.h;
        if (currentTimeMillis - j >= 300000) {
            i iVar2 = xVar2.g;
            int i = iVar2.f12964a;
            int i2 = iVar2.b;
            int i3 = iVar2.c;
            int i4 = iVar2.d;
            HashMap hashMap = new HashMap();
            hashMap.put("ts", String.valueOf(j));
            AbstractC5081e.a(hashMap, "load_num", String.valueOf(i), i2, "fill_num");
            hashMap.put("imp_num", String.valueOf(i3));
            hashMap.put("click_num", String.valueOf(i4));
            sg.bigo.ads.s1.b.a("06002039", hashMap);
            xVar2.h = currentTimeMillis;
            sg.bigo.ads.F0.b.b("sp_ads", "last_stat_cb_events_time", Long.valueOf(currentTimeMillis), 1);
            i iVar3 = xVar2.g;
            iVar3.f12964a = 0;
            iVar3.b = 0;
            iVar3.c = 0;
            iVar3.d = 0;
            sg.bigo.ads.F0.b.b("sp_ads", "cb_event_count", iVar3.toString(), 3);
        }
    }
}
