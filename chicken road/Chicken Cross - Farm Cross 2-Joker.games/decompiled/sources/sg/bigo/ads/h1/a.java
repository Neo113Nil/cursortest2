package sg.bigo.ads.h1;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.d0.AbstractC5064a;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12956a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ f c;

    public a(f fVar, String str, JSONObject jSONObject) {
        this.c = fVar;
        this.f12956a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5051b c5051b = new C5051b(this.f12956a, this.b.toString());
        h hVar = this.c.c;
        synchronized (hVar) {
            hVar.b.add(c5051b);
            c5051b.f12702a = AbstractC5064a.a(c5051b);
            i iVar = hVar.e;
            if (iVar != null && iVar.f12964a + iVar.b + iVar.c + iVar.d != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = hVar.d;
                if (currentTimeMillis - j >= 300000) {
                    i iVar2 = hVar.e;
                    int i = iVar2.f12964a;
                    int i2 = iVar2.b;
                    int i3 = iVar2.c;
                    int i4 = iVar2.d;
                    HashMap hashMap = new HashMap();
                    hashMap.put("ts", String.valueOf(j));
                    hashMap.put("load_num", String.valueOf(i));
                    hashMap.put("fill_num", String.valueOf(i2));
                    hashMap.put("imp_num", String.valueOf(i3));
                    hashMap.put("click_num", String.valueOf(i4));
                    sg.bigo.ads.s1.b.a("06002039", hashMap);
                    hVar.d = currentTimeMillis;
                    sg.bigo.ads.F0.b.b("sp_ads", "last_stat_cb_events_time", Long.valueOf(currentTimeMillis), 1);
                    i iVar3 = hVar.e;
                    iVar3.f12964a = 0;
                    iVar3.b = 0;
                    iVar3.c = 0;
                    iVar3.d = 0;
                    sg.bigo.ads.F0.b.b("sp_ads", "cb_event_count", iVar3.toString(), 3);
                }
            }
            hVar.e.a(c5051b.b);
        }
        if (TextUtils.isEmpty(((sg.bigo.ads.X0.u) this.c.e).c.m)) {
            return;
        }
        if ("impression".equals(this.f12956a) || "clicked".equals(this.f12956a)) {
            c5051b.toString();
            this.c.a();
        } else {
            c5051b.toString();
            f.a(this.c);
        }
    }
}
