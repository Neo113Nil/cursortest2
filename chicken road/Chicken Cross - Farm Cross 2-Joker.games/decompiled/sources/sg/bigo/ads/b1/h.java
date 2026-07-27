package sg.bigo.ads.b1;

import android.content.Context;
import org.json.JSONObject;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.X0.u;

/* loaded from: classes3.dex */
public abstract class h {
    public static String a(sg.bigo.ads.N.d dVar, sg.bigo.ads.U.h hVar) {
        int i;
        long j;
        int i2;
        if (dVar != null) {
            i = dVar.d;
            i2 = dVar.e;
            j = dVar.f;
        } else {
            i = 0;
            j = 0;
            i2 = 0;
        }
        if (i <= 0) {
            i = ((u) hVar).f12615a.getAge();
        }
        if (i2 <= 0) {
            i2 = ((u) hVar).f12615a.getGender();
        }
        if (j <= 0) {
            j = ((u) hVar).f12615a.getActivatedTime();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ad_a", Integer.valueOf(i));
            jSONObject.putOpt("ad_g", Integer.valueOf(i2));
            jSONObject.putOpt("ad_channel", ((u) hVar).f12615a.getChannel());
            jSONObject.putOpt("ad_active", Long.valueOf(j));
            u uVar = (u) hVar;
            if (uVar.u == 0) {
                try {
                    Context context = uVar.b;
                    uVar.u = AbstractC4956m.b(context.getPackageName(), context);
                } catch (Exception unused) {
                    uVar.u = -1L;
                }
            }
            jSONObject.putOpt("ad_ins", Long.valueOf(uVar.u));
            u uVar2 = (u) hVar;
            if (uVar2.v == 0) {
                try {
                    Context context2 = uVar2.b;
                    uVar2.v = AbstractC4956m.c(context2.getPackageName(), context2);
                } catch (Exception unused2) {
                    uVar2.v = -1L;
                }
            }
            jSONObject.putOpt("ad_upd", Long.valueOf(uVar2.v));
            return jSONObject.toString();
        } catch (Exception unused3) {
            return null;
        }
    }
}
