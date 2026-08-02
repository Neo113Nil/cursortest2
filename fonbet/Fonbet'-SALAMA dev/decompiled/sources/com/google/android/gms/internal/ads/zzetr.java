package com.google.android.gms.internal.ads;

import F2.C0254t;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzetr implements zzesh {
    private final zzbyq zza;
    private final ScheduledExecutorService zzb;
    private final zzgbn zzc;

    public zzetr(String str, zzazz zzazzVar, zzbyq zzbyqVar, ScheduledExecutorService scheduledExecutorService, zzgbn zzgbnVar) {
        this.zza = zzbyqVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgbnVar;
    }

    public static /* synthetic */ zzets zzc(zzetr zzetrVar, Exception exc) {
        zzetrVar.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzets(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzbbp zzbbpVar = zzbby.zzdc;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzdh)).booleanValue()) {
                I3.b zzn = zzgbc.zzn(zzfqd.zza(Tasks.forResult(null), null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzetp
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        U2.b bVar = (U2.b) obj;
                        return bVar == null ? zzgbc.zzh(new zzets(null, -1)) : zzgbc.zzh(new zzets(bVar.f6399a, bVar.f6400b));
                    }
                }, this.zzc);
                if (((Boolean) zzbdl.zza.zze()).booleanValue()) {
                    zzn = zzgbc.zzo(zzn, ((Long) zzbdl.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgbc.zze(zzn, Exception.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzetq
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        return zzetr.zzc(zzetr.this, (Exception) obj);
                    }
                }, this.zzc);
            }
        }
        return zzgbc.zzh(new zzets(null, -1));
    }
}
