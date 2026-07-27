package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeao;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzj {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzeao zzd;
    private final ExecutorService zze;

    zzj(Context context, zzeao zzeaoVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzeaoVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        Map map = this.zzb;
        Boolean valueOf = Boolean.valueOf(z);
        if (map.containsKey(valueOf)) {
            return;
        }
        map.put(valueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zzf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        bundle.putBoolean("accept_3p_cookie", z);
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzl zzlVar = (zzl) map.get(valueOf);
        int i = 0;
        if (z2 && zzlVar != null) {
            i = zzlVar.zzd() + 1;
        }
        zzl zzlVar2 = (zzl) map.get(valueOf);
        final zzk zzkVar = new zzk(this, z, i, zzlVar2 == null ? null : Boolean.valueOf(zzlVar2.zze()), this.zzd);
        final AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmJ)).booleanValue()) {
            this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzj.this.zzg(build, zzkVar);
                }
            });
        } else {
            QueryInfo.generate(this.zzc, AdFormat.BANNER, build, zzkVar);
        }
    }

    private final void zzj(zzl zzlVar, Pair pair, boolean z) {
        zzlVar.zzf();
        QueryInfo zza = zzlVar.zza();
        if (zza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(zza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzlVar.zzb());
        }
        zzeao zzeaoVar = this.zzd;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z));
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(zzlVar.zza() != null));
        zzv.zze(zzeaoVar, null, "sgpcr", pairArr);
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zzd(obj, pair);
            }
        });
    }

    final synchronized void zzc(final boolean z, zzl zzlVar) {
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzl zzlVar2 = (zzl) map.get(valueOf);
        if (zzlVar2 == null || zzlVar2.zzc() || zzlVar2.zza() == null || zzlVar.zza() != null) {
            map.put(valueOf, zzlVar);
        }
        long longValue = (zzlVar.zza() != null ? (Long) zzblm.zzf.zze() : (Long) zzblm.zzg.zze()).longValue();
        final boolean z2 = zzlVar.zza() == null;
        zzcgj.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzj.this.zze(z, z2);
            }
        }, longValue, TimeUnit.SECONDS);
        Map map2 = this.zzb;
        List list = (List) map2.get(valueOf);
        map2.put(valueOf, new ArrayList());
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzj(zzlVar, (Pair) it.next(), false);
            }
        }
    }

    final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean z = false;
        if (obj instanceof WebView) {
            CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (zza != null) {
                z = zza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean valueOf = Boolean.valueOf(z);
        zzl zzlVar = (zzl) map.get(valueOf);
        if (zzlVar != null && !zzlVar.zzc()) {
            zzj(zzlVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List list = (List) map2.get(valueOf);
        if (list == null) {
            list = new ArrayList();
            map2.put(valueOf, list);
        }
        list.add(pair);
    }

    final /* synthetic */ void zzf(boolean z) {
        zze(z, false);
    }

    final /* synthetic */ Object zzg(AdRequest adRequest, zzk zzkVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzkVar);
        return true;
    }
}
