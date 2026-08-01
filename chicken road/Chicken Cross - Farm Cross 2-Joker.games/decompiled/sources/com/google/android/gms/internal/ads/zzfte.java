package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfte {
    private final Context zza;
    private final Executor zzb;
    private final zzhdj zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfsw zze;
    private final zzfrj zzf;
    private final zzcny zzg;

    zzfte(Context context, Executor executor, zzhdj zzhdjVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfsw zzfswVar, zzfrj zzfrjVar, zzcny zzcnyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzhdjVar;
        this.zzd = zzuVar;
        this.zze = zzfswVar;
        this.zzf = zzfrjVar;
        this.zzg = zzcnyVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfrg zzfrgVar, zzdge zzdgeVar) {
        ListenableFuture zzc;
        zzfqw zzfqwVar = null;
        if (zzfrj.zza() && ((Boolean) zzbla.zzd.zze()).booleanValue()) {
            zzfqwVar = zzfqw.zzn(this.zza, 14);
            zzfqwVar.zza();
        }
        if (zzvVar != null) {
            zzc = new zzfsv(zzvVar.zza(), this.zzd, this.zzc, this.zze, this.zzg).zza(str);
        } else {
            zzc = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzftd
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfte.this.zzc(str);
                }
            });
        }
        zzhcy.zzr(zzc, new zzftc(this, zzfqwVar, zzfrgVar, zzdgeVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzko)).booleanValue() || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return this.zzd.zzc(str, null);
        }
        String zzb = this.zzg.zzb();
        HashMap hashMap = new HashMap();
        if (zzb != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkp), zzb);
        }
        return this.zzd.zzc(str, hashMap);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfrj zze() {
        return this.zzf;
    }
}
