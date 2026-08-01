package sg.bigo.ads.b1;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.b1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5031d extends sg.bigo.ads.B0.b {
    public final long r;

    public C5031d(Context context, int i, sg.bigo.ads.Q0.q qVar, long j) {
        super(i, qVar, context);
        this.r = j;
    }

    @Override // sg.bigo.ads.B0.c
    public final void g() {
        sg.bigo.ads.Q0.q qVar = (sg.bigo.ads.Q0.q) this.b;
        HashMap hashMap = new HashMap();
        hashMap.put("pre_host", qVar.e());
        hashMap.put("host_cfg_clear", Integer.valueOf(qVar.j ? 1 : 0));
        hashMap.put("host_src", qVar.k);
        sg.bigo.ads.R0.g gVar = qVar.g;
        if (gVar != null) {
            hashMap.put("host_type", Integer.valueOf(gVar.c));
        }
        if (this.h != null && !A.a(hashMap)) {
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    this.h.putOpt((String) entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            this.i = null;
        }
        long j = this.r;
        if (j <= 0 || !qVar.o.compareAndSet(false, true)) {
            return;
        }
        AbstractC5446j.a(3, null, qVar.p, j);
    }
}
