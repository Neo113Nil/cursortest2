package sg.bigo.ads.e;

import android.content.Context;
import java.util.HashMap;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.e.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5077a implements AdBid {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.P.j f12741a;
    public final sg.bigo.ads.P.c b;
    public final sg.bigo.ads.x1.f c;
    public boolean d = false;
    public boolean e = false;

    public C5077a(sg.bigo.ads.P.j jVar, sg.bigo.ads.P.c cVar, sg.bigo.ads.x1.f fVar) {
        this.f12741a = jVar;
        this.b = cVar;
        this.c = fVar;
    }

    @Override // sg.bigo.ads.api.AdBid
    public final double getPrice() {
        return ((sg.bigo.ads.U0.b) this.b).Q;
    }

    @Override // sg.bigo.ads.api.AdBid
    public final void notifyLoss(Double d, String str, int i) {
        if (this.e) {
            return;
        }
        this.e = true;
        if (d != null) {
            this.c.a("first_price", String.valueOf(d));
        }
        if (str != null) {
            this.c.a("first_bidder", str);
        }
        this.c.a("loss_reason", String.valueOf(i));
        sg.bigo.ads.x1.f fVar = this.c;
        Context context = this.f12741a.e;
        fVar.getClass();
        AbstractC5446j.a(1, null, new sg.bigo.ads.x1.e(fVar, context), 0L);
        sg.bigo.ads.P.c cVar = this.b;
        int i2 = ((sg.bigo.ads.U0.b) cVar).c.v;
        HashMap a2 = sg.bigo.ads.s1.b.a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("auc_mode", String.valueOf(i2));
        a2.put("bid_rslt", "0");
        if (d != null) {
            a2.put("first_price", String.valueOf(d));
        }
        if (str != null) {
            a2.put("first_bidder", str);
        }
        a2.put("loss_reason", String.valueOf(i));
        sg.bigo.ads.s1.b.a("06002045", a2);
    }

    @Override // sg.bigo.ads.api.AdBid
    public final void notifyWin(Double d, String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        if (d != null) {
            this.c.a("sec_price", String.valueOf(d));
        }
        if (str != null) {
            this.c.a("sec_bidder", str);
        }
        sg.bigo.ads.x1.f fVar = this.c;
        Context context = this.f12741a.e;
        fVar.getClass();
        AbstractC5446j.a(1, null, new sg.bigo.ads.x1.d(fVar, context), 0L);
        sg.bigo.ads.P.c cVar = this.b;
        int i = ((sg.bigo.ads.U0.b) cVar).c.v;
        HashMap a2 = sg.bigo.ads.s1.b.a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("auc_mode", String.valueOf(i));
        a2.put("bid_rslt", "1");
        if (d != null) {
            a2.put("sec_price", String.valueOf(d));
        }
        if (str != null) {
            a2.put("sec_bidder", str);
        }
        sg.bigo.ads.s1.b.a("06002045", a2);
        sg.bigo.ads.P.j jVar = this.f12741a;
        sg.bigo.ads.f1.b.i.a("win", sg.bigo.ads.f1.a.a("win", jVar.b, jVar.c, jVar.f12482a, Integer.valueOf(((sg.bigo.ads.U0.b) this.b).c.v), d == null ? null : String.valueOf(d), str, null));
    }
}
