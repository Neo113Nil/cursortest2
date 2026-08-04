package P2;

import F2.C0254t;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzdqv;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f5447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f5448f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5449g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzdqv f5450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f5451i;

    public L(zzdqv zzdqvVar) {
        this.f5450h = zzdqvVar;
        zzbbp zzbbpVar = zzbby.zzgP;
        C0254t c0254t = C0254t.f2723d;
        this.f5443a = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        zzbbp zzbbpVar2 = zzbby.zzgQ;
        zzbbw zzbbwVar = c0254t.f2726c;
        this.f5444b = ((Long) zzbbwVar.zzb(zzbbpVar2)).longValue();
        this.f5445c = ((Boolean) zzbbwVar.zzb(zzbby.zzgU)).booleanValue();
        this.f5446d = ((Boolean) zzbbwVar.zzb(zzbby.zzgT)).booleanValue();
        this.f5447e = Collections.synchronizedMap(new J(this));
    }

    public final synchronized String a(String str, zzdqk zzdqkVar) {
        K k7 = (K) this.f5447e.get(str);
        zzdqkVar.zzb().put("request_id", str);
        if (k7 == null) {
            zzdqkVar.zzb().put("mhit", "false");
            return null;
        }
        zzdqkVar.zzb().put("mhit", "true");
        return k7.f5441b;
    }

    public final synchronized void b(String str, String str2, zzdqk zzdqkVar) {
        E2.o.f1952C.j.getClass();
        this.f5447e.put(str, new K(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        e();
        c(zzdqkVar);
    }

    public final synchronized void c(zzdqk zzdqkVar) {
        if (this.f5445c) {
            ArrayDeque arrayDeque = this.f5449g;
            ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f5448f;
            ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzbza.zza.execute(new A2.c(this, zzdqkVar, arrayDequeClone, arrayDequeClone2, 3));
        }
    }

    public final void d(zzdqk zzdqkVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdqkVar.zzb());
            this.f5451i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f5451i.put("e_r", str);
            this.f5451i.put("e_id", (String) pair2.first);
            if (this.f5446d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(Q0.a.i0(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f5451i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f5451i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f5450h.zzg(this.f5451i);
        }
    }

    public final synchronized void e() {
        E2.o.f1952C.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f5447e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((K) entry.getValue()).f5440a.longValue() <= this.f5444b) {
                    break;
                }
                this.f5449g.add(new Pair((String) entry.getKey(), ((K) entry.getValue()).f5441b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e7) {
            E2.o.f1952C.f1961g.zzw(e7, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
