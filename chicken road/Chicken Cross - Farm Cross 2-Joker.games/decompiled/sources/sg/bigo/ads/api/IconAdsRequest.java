package sg.bigo.ads.api;

import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.N.d;
import sg.bigo.ads.N.f;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.q.h;

/* loaded from: classes3.dex */
public class IconAdsRequest extends d {
    public final p i;
    public final sg.bigo.ads.P.c j;
    public final int k;
    public final int l;
    public final int m;
    public final h n;

    public IconAdsRequest(f fVar) {
        super(fVar.mSlotId, null);
        this.i = fVar.f12466a;
        this.j = fVar.b;
        this.k = fVar.c;
        this.l = fVar.d;
        this.m = fVar.e;
        this.n = fVar.f;
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return this.i.b;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sg.bigo.ads.P.c cVar = this.j;
        if (cVar != null) {
            linkedHashMap.put("host_slot", ((sg.bigo.ads.U0.b) cVar).c.l);
            linkedHashMap.put("host_placement", ((sg.bigo.ads.U0.b) this.j).c.n);
            linkedHashMap.put("host_ad_type", Integer.valueOf(((sg.bigo.ads.U0.b) this.j).l));
            linkedHashMap.put("host_adx_type", Integer.valueOf(((sg.bigo.ads.U0.b) this.j).k));
            linkedHashMap.put("dsp_source", ((sg.bigo.ads.U0.b) this.j).j);
            linkedHashMap.put("main_domain", ((sg.bigo.ads.U0.b) this.j).L);
            linkedHashMap.put("main_bundle", ((sg.bigo.ads.U0.b) this.j).U);
            linkedHashMap.put("main_adx_sid", Long.valueOf(((sg.bigo.ads.U0.b) this.j).m));
            linkedHashMap.put("main_ad_id", ((sg.bigo.ads.U0.b) this.j).f);
            linkedHashMap.put("dsp_extra", ((sg.bigo.ads.U0.b) this.j).k0);
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(this.i.b));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.l));
        linkedHashMap.put("scene_page", Integer.valueOf(this.k));
        linkedHashMap.put("icon_num", Integer.valueOf(this.m));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.N.d
    public final p c() {
        return this.i;
    }
}
