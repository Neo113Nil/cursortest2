package sg.bigo.ads.X0;

import android.content.ContentValues;
import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONObject;
import sg.bigo.ads.b0.AbstractC5025b;

/* renamed from: sg.bigo.ads.X0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5007b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12601a;
    public final /* synthetic */ sg.bigo.ads.P.c[] b;
    public final /* synthetic */ sg.bigo.ads.N.d c;
    public final /* synthetic */ r d;

    public RunnableC5007b(r rVar, int i, sg.bigo.ads.P.c[] cVarArr, sg.bigo.ads.N.d dVar) {
        this.d = rVar;
        this.f12601a = i;
        this.b = cVarArr;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = (o) this.d.i.get(this.f12601a);
        if (oVar != null) {
            this.d.i.remove(this.f12601a);
            if (!sg.bigo.ads.K0.A.c(this.b)) {
                sg.bigo.ads.P.j[] jVarArr = new sg.bigo.ads.P.j[this.b.length];
                int i = 0;
                while (true) {
                    sg.bigo.ads.P.c[] cVarArr = this.b;
                    if (i >= cVarArr.length) {
                        break;
                    }
                    sg.bigo.ads.P.c cVar = cVarArr[i];
                    sg.bigo.ads.T0.p d = ((sg.bigo.ads.b1.m) oVar.f12610a).d();
                    sg.bigo.ads.N.d dVar = this.c;
                    r rVar = this.d;
                    Context context = rVar.f12613a;
                    Context b = rVar.b();
                    u uVar = this.d.e;
                    sg.bigo.ads.P.j jVar = new sg.bigo.ads.P.j(cVar, d, dVar, context, b);
                    jVar.d = uVar;
                    jVarArr[i] = jVar;
                    sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
                    if (sg.bigo.ads.P.a.b(bVar.l)) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("slot", bVar.c.l);
                        contentValues.put("log_id", Long.valueOf(bVar.B));
                        long currentTimeMillis = System.currentTimeMillis();
                        contentValues.put("start_time", Long.valueOf(currentTimeMillis));
                        contentValues.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, Long.valueOf((bVar.d * 1000) + currentTimeMillis));
                        JSONObject jSONObject = bVar.f12568a;
                        contentValues.put("ad_data", jSONObject == null ? "" : jSONObject.toString());
                        contentValues.put("mtime", Long.valueOf(currentTimeMillis));
                        AbstractC5025b.b("tb_addata", contentValues);
                    }
                    i++;
                }
                oVar.b.a(this.f12601a, this.c, jVarArr);
            }
        }
        this.d.c();
    }
}
