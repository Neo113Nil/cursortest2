package sg.bigo.ads.S0;

import android.text.TextUtils;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import sg.bigo.ads.Q0.n;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.C5447k;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f12538a;
    public final sg.bigo.ads.U.h b;
    public final sg.bigo.ads.T0.g c;
    public final sg.bigo.ads.T0.n d;
    public C5447k e = null;
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicBoolean g = new AtomicBoolean(false);
    public long h = 0;
    public final e i = new e(this);

    public f(n nVar, sg.bigo.ads.U.h hVar, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar2) {
        this.f12538a = nVar;
        this.b = hVar;
        this.c = gVar;
        this.d = nVar2;
    }

    public abstract sg.bigo.ads.R0.h a();

    public abstract void a(Pair pair);

    public final void a(String str, int i, String str2) {
        String str3 = this instanceof d ? "1" : this instanceof b ? "2" : "0";
        HashMap hashMap = new HashMap();
        hashMap.put("type", str3);
        hashMap.put("host", str);
        hashMap.put("retry_times", String.valueOf(sg.bigo.ads.O.g.f12472a.R));
        hashMap.put("retry_interval", String.valueOf(sg.bigo.ads.O.g.f12472a.S));
        hashMap.put("next_retry_interval", String.valueOf(sg.bigo.ads.O.g.f12472a.T));
        hashMap.put("cur_retry_time", String.valueOf(i));
        ((u) this.b).getClass();
        hashMap.put("uuid", sg.bigo.ads.F0.a.e());
        hashMap.put("action", str2);
        sg.bigo.ads.s1.b.a("06002067", hashMap);
    }

    public abstract C5447k b();

    public final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        int round = Math.round((sg.bigo.ads.O.g.f12472a.S / 2.0f) * 60000.0f);
        long abs = Math.abs(currentTimeMillis - this.h);
        if (this.h == 0 || abs > round) {
            this.h = currentTimeMillis;
            this.f.set(0);
            if (this.f.getAndAdd(1) >= 3 || this.g.get()) {
                return;
            }
            AbstractC5446j.a(this.i);
            AbstractC5446j.a(1, null, this.i, 5000L);
        }
    }

    public final void a(Pair pair, boolean z) {
        boolean z2;
        HashMap hashMap;
        sg.bigo.ads.R0.g gVar;
        if (this.f12538a == null || this.b == null || this.c == null || pair == null) {
            return;
        }
        sg.bigo.ads.R0.h a2 = a();
        String str = (String) pair.first;
        String e = ((u) this.b).e();
        int i = this.c.M;
        sg.bigo.ads.T0.g gVar2 = sg.bigo.ads.O.g.f12472a;
        synchronized (a2) {
            z2 = false;
            if (!TextUtils.isEmpty(str) && (hashMap = a2.c) != null && gVar2 != null) {
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    gVar = (sg.bigo.ads.R0.g) ((Map.Entry) it.next()).getValue();
                    if (TextUtils.equals(gVar.f12519a, str)) {
                        if (z) {
                            gVar.g = 0;
                            gVar.e = 0;
                            break;
                        } else {
                            int i2 = gVar.g + 1;
                            gVar.g = i2;
                            if (i2 != 0 && i2 % gVar2.R == 0) {
                                break;
                            }
                        }
                    }
                }
                gVar = null;
                if (gVar != null) {
                    gVar.g = 0;
                    gVar.e = 0;
                    sg.bigo.ads.R0.g a3 = sg.bigo.ads.R0.h.a(a2.c, new sg.bigo.ads.R0.e(e, i, "all"));
                    if (a3 != null) {
                        gVar = a3;
                    }
                    a2.b(a2.i);
                    a2.h = a2.i;
                    a2.i = gVar;
                    a2.j = 0;
                    z2 = true;
                }
            }
        }
        this.f12538a.f12510a.a(0L);
        if (z2) {
            a((String) pair.first, ((Integer) pair.second).intValue(), "1");
        }
    }
}
