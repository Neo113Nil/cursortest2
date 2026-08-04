package P2;

import F2.C0254t;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5423a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5424b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzdqv f5426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzgbn f5427e;

    public G(Context context, zzdqv zzdqvVar, zzgbn zzgbnVar) {
        this.f5425c = context;
        this.f5426d = zzdqvVar;
        this.f5427e = zzgbnVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0011, B:10:0x0027, B:12:0x002b, B:15:0x0034, B:17:0x0038, B:21:0x004b, B:25:0x0055, B:28:0x0076, B:29:0x007a, B:31:0x0080, B:20:0x0043, B:14:0x002f), top: B:37:0x0001 }] */
    public final synchronized void a(boolean z4, I i7) {
        try {
            HashMap map = this.f5423a;
            Boolean boolValueOf = Boolean.valueOf(z4);
            I i8 = (I) map.get(boolValueOf);
            boolean z7 = true;
            if (i8 != null) {
                E2.o.f1952C.j.getClass();
                if ((i8.f5436c <= System.currentTimeMillis()) || i8.f5434a == null || i7.f5434a != null) {
                    this.f5423a.put(boolValueOf, i7);
                }
            } else {
                this.f5423a.put(boolValueOf, i7);
            }
            long jLongValue = (i7.f5434a != null ? (Long) zzbed.zze.zze() : (Long) zzbed.zzf.zze()).longValue();
            if (i7.f5434a != null) {
                z7 = false;
            }
            zzbza.zzd.schedule(new F(this, z4, z7), jLongValue, TimeUnit.SECONDS);
            List list = (List) this.f5424b.get(boolValueOf);
            this.f5424b.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d(i7, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Object obj, R2.b bVar) {
        E2.o.f1952C.j.getClass();
        zzbza.zzf.execute(new H2.q(this, obj, new Pair(bVar, Long.valueOf(System.currentTimeMillis())), 3));
    }

    public final void c(boolean z4) {
        HashMap map = this.f5424b;
        Boolean boolValueOf = Boolean.valueOf(z4);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f5427e.submit(new E2.g(this, z4, 1));
    }

    public final void d(I i7, Pair pair, boolean z4) {
        i7.f5438e.set(true);
        R2.a aVar = i7.f5434a;
        if (aVar != null) {
            ((R2.b) pair.first).onSuccess(aVar);
        } else {
            ((R2.b) pair.first).onFailure(i7.f5435b);
        }
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        E2.o.f1952C.j.getClass();
        Q0.a.n0(this.f5426d, "sgpcr", pair2, pair3, pair4, pair5, new Pair("lat_ms", Long.toString(System.currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z4)), new Pair("sgpc_rs", Boolean.toString(aVar != null)));
    }

    public final synchronized void e(boolean z4, boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z4);
        HashMap map = this.f5423a;
        Boolean boolValueOf = Boolean.valueOf(z4);
        I i7 = (I) map.get(boolValueOf);
        int i8 = 0;
        if (z7 && i7 != null) {
            i8 = i7.f5437d + 1;
        }
        int i9 = i8;
        I i10 = (I) this.f5423a.get(boolValueOf);
        H h6 = new H(this, z4, i9, i10 == null ? null : Boolean.valueOf(i10.f5438e.get()), this.f5426d);
        p167y2.i iVar = new p167y2.i((p167y2.h) new p167y2.h(6).a(bundle, AdMobAdapter.class));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlc)).booleanValue()) {
            this.f5427e.submit(new CallableC0380f(this, iVar, h6, 2));
        } else {
            R2.a.a(this.f5425c, iVar, h6);
        }
    }
}
