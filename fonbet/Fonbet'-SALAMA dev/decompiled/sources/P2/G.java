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

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5423a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5424b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Context f5425c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdqv f5426d;

    /* renamed from: e, reason: collision with root package name */
    public final zzgbn f5427e;

    public G(Context context, zzdqv zzdqvVar, zzgbn zzgbnVar) {
        this.f5425c = context;
        this.f5426d = zzdqvVar;
        this.f5427e = zzgbnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r10.f5434a == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(boolean z4, I i7) {
        try {
            HashMap hashMap = this.f5423a;
            Boolean valueOf = Boolean.valueOf(z4);
            I i8 = (I) hashMap.get(valueOf);
            boolean z7 = true;
            if (i8 != null) {
                E2.o.f1952C.j.getClass();
                if (!(i8.f5436c <= System.currentTimeMillis())) {
                    if (i8.f5434a != null) {
                    }
                }
            }
            this.f5423a.put(valueOf, i7);
            long longValue = (i7.f5434a != null ? (Long) zzbed.zze.zze() : (Long) zzbed.zzf.zze()).longValue();
            if (i7.f5434a != null) {
                z7 = false;
            }
            zzbza.zzd.schedule(new F(this, z4, z7), longValue, TimeUnit.SECONDS);
            List list = (List) this.f5424b.get(valueOf);
            this.f5424b.put(valueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    d(i7, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final synchronized void b(Object obj, R2.b bVar) {
        E2.o.f1952C.j.getClass();
        zzbza.zzf.execute(new H2.q(this, obj, new Pair(bVar, Long.valueOf(System.currentTimeMillis())), 3));
    }

    public final void c(boolean z4) {
        HashMap hashMap = this.f5424b;
        Boolean valueOf = Boolean.valueOf(z4);
        if (hashMap.containsKey(valueOf)) {
            return;
        }
        hashMap.put(valueOf, new ArrayList());
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
        HashMap hashMap = this.f5423a;
        Boolean valueOf = Boolean.valueOf(z4);
        I i7 = (I) hashMap.get(valueOf);
        int i8 = 0;
        if (z7 && i7 != null) {
            i8 = i7.f5437d + 1;
        }
        int i9 = i8;
        I i10 = (I) this.f5423a.get(valueOf);
        H h6 = new H(this, z4, i9, i10 == null ? null : Boolean.valueOf(i10.f5438e.get()), this.f5426d);
        y2.i iVar = new y2.i((y2.h) new y2.h(6).a(bundle, AdMobAdapter.class));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlc)).booleanValue()) {
            this.f5427e.submit(new CallableC0380f(this, iVar, h6, 2));
        } else {
            R2.a.a(this.f5425c, iVar, h6);
        }
    }
}
