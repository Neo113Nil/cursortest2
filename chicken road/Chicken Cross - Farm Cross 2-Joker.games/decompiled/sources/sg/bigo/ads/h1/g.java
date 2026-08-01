package sg.bigo.ads.h1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.e.AbstractC5081e;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f12962a;

    public g(h hVar) {
        this.f12962a = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = this.f12962a;
        hVar.getClass();
        AbstractC5025b.a("tb_event", "ctime < " + (System.currentTimeMillis() - hVar.f12963a.c), null);
        Set set = hVar.b;
        Cursor a2 = AbstractC5025b.a("tb_event", null, null, "mtime DESC", Math.round(hVar.f12963a.f12797a * 0.8f));
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            a2.getCount();
            while (a2.moveToNext()) {
                arrayList.add(new C5051b(a2));
            }
            a2.close();
        }
        set.addAll(arrayList);
        long longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "last_stat_cb_events_time", (Object) 0, 1)).longValue();
        hVar.d = longValue;
        if (longValue == 0) {
            hVar.d = System.currentTimeMillis();
        }
        i a3 = i.a();
        hVar.e = a3;
        if (a3.f12964a + a3.b + a3.c + a3.d == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = hVar.d;
        if (currentTimeMillis - j >= 300000) {
            i iVar = hVar.e;
            int i = iVar.f12964a;
            int i2 = iVar.b;
            int i3 = iVar.c;
            int i4 = iVar.d;
            HashMap hashMap = new HashMap();
            hashMap.put("ts", String.valueOf(j));
            AbstractC5081e.a(hashMap, "load_num", String.valueOf(i), i2, "fill_num");
            hashMap.put("imp_num", String.valueOf(i3));
            hashMap.put("click_num", String.valueOf(i4));
            sg.bigo.ads.s1.b.a("06002039", hashMap);
            hVar.d = currentTimeMillis;
            sg.bigo.ads.F0.b.b("sp_ads", "last_stat_cb_events_time", Long.valueOf(currentTimeMillis), 1);
            i iVar2 = hVar.e;
            iVar2.f12964a = 0;
            iVar2.b = 0;
            iVar2.c = 0;
            iVar2.d = 0;
            sg.bigo.ads.F0.b.b("sp_ads", "cb_event_count", iVar2.toString(), 3);
        }
    }
}
