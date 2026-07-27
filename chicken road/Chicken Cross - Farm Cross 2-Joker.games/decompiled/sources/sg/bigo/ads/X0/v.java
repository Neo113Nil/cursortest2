package sg.bigo.ads.X0;

import android.os.SystemClock;
import android.util.Pair;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.d.C5055a;

/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12616a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ z c;

    public v(z zVar, int i, String str, boolean z) {
        this.c = zVar;
        this.f12616a = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        z zVar = this.c;
        int i2 = zVar.j;
        if (this.b) {
            i2 = 2;
        }
        try {
            boolean z = zVar.b.i != 0;
            JSONObject jSONObject = new JSONObject(this.f12616a);
            JSONObject optJSONObject = jSONObject.optJSONObject("global");
            String optString = jSONObject.optString("global_md5");
            JSONArray optJSONArray = jSONObject.optJSONArray("slots");
            String optString2 = jSONObject.optString("slots_md5");
            Pair a2 = z.a(this.c, optJSONObject, optJSONArray, optString, optString2);
            if (a2 != null) {
                if (!this.b) {
                    z zVar2 = this.c;
                    zVar2.f.set(null);
                    Iterator it = zVar2.e.iterator();
                    while (it.hasNext()) {
                        ((y) it.next()).a(zVar2.k);
                    }
                    zVar2.e.clear();
                }
                long j = this.c.b.k;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                z zVar3 = this.c;
                long j2 = elapsedRealtime - zVar3.g;
                boolean z2 = zVar3.h;
                int andSet = zVar3.i.getAndSet(0);
                ((u) this.c.f12619a).getClass();
                sg.bigo.ads.s1.b.a(j, j2, z, i2, z2, andSet, sg.bigo.ads.F0.a.e(), (String) a2.first, (String) a2.second);
                return;
            }
            if (optJSONObject != null && optJSONArray != null) {
                this.c.a(optString, optJSONObject);
                z zVar4 = this.c;
                zVar4.b.c(zVar4.l);
                this.c.c.a(optJSONArray, optString2);
                z zVar5 = this.c;
                zVar5.c.c(zVar5.l);
                z zVar6 = this.c;
                C5055a a3 = BigoAdSdk.a(zVar6.l);
                a3.e = ((u) zVar6.f12619a).f12615a.getAppKey();
                a3.c(zVar6.l);
                if (this.b) {
                    i = 0;
                } else {
                    z zVar7 = this.c;
                    zVar7.f.set(null);
                    Iterator it2 = zVar7.e.iterator();
                    while (it2.hasNext()) {
                        ((y) it2.next()).a(zVar7.k);
                    }
                    zVar7.e.clear();
                    i = this.c.i.getAndSet(0);
                }
                long j3 = this.c.b.k;
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                z zVar8 = this.c;
                sg.bigo.ads.s1.b.a(j3, elapsedRealtime2 - zVar8.g, z, i2, zVar8.h, i, zVar8.f12619a == null ? null : sg.bigo.ads.F0.a.e(), (String) null, (String) null);
                return;
            }
            if (!this.b) {
                this.c.b(1102, "Missing `global` or `slots` params.");
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            z zVar9 = this.c;
            sg.bigo.ads.s1.b.a(elapsedRealtime3 - zVar9.g, 1102, 10002, "Missing `global` or `slots` params.", i2, zVar9.h, zVar9.i.get(), this.c.f12619a == null ? null : sg.bigo.ads.F0.a.e());
        } catch (JSONException unused) {
            if (!this.b) {
                this.c.b(1103, "Failed to parse global config.");
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            z zVar10 = this.c;
            sg.bigo.ads.s1.b.a(elapsedRealtime4 - zVar10.g, 1103, 10002, "Failed to parse global config.", i2, zVar10.h, zVar10.i.get(), this.c.f12619a == null ? null : sg.bigo.ads.F0.a.e());
        }
    }
}
