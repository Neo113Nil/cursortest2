package sg.bigo.ads.h1;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.d0.AbstractC5064a;
import sg.bigo.ads.e.AbstractC5081e;

/* loaded from: classes3.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12974a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ x c;

    public w(x xVar, String str, JSONObject jSONObject) {
        this.c = xVar;
        this.f12974a = str;
        this.b = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5051b c5051b = new C5051b(this.f12974a, this.b.toString());
        x xVar = this.c;
        String str = this.f12974a;
        xVar.getClass();
        if ("impression".equals(str) || "clicked".equals(str)) {
            k kVar = this.c.c;
            synchronized (kVar) {
                kVar.b.add(c5051b);
                c5051b.f12702a = AbstractC5064a.a(c5051b);
            }
        } else {
            this.c.b.a(c5051b);
        }
        x xVar2 = this.c;
        i iVar = xVar2.g;
        if (iVar != null && iVar.f12964a + iVar.b + iVar.c + iVar.d != 0) {
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
        i iVar4 = this.c.g;
        if (iVar4 != null) {
            iVar4.a(this.f12974a);
        }
        if (TextUtils.isEmpty(((sg.bigo.ads.X0.u) this.c.f).c.m)) {
            return;
        }
        this.c.e.b();
        c5051b.toString();
        int d = this.c.b.d();
        x xVar3 = this.c;
        if (d >= xVar3.f12975a.f12797a) {
            xVar3.d.b();
            c5051b.toString();
        } else {
            if (xVar3.b.e()) {
                return;
            }
            this.c.d.c();
            c5051b.toString();
        }
    }
}
