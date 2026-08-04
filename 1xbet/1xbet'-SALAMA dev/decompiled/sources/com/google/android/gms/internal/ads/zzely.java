package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzely implements zzesh {
    final zzbyq zza;
    U2.a zzb;
    private final ScheduledExecutorService zzc;
    private final zzgbn zzd;
    private final Context zze;

    public zzely(Context context, zzbyq zzbyqVar, ScheduledExecutorService scheduledExecutorService, zzgbn zzgbnVar) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdg)).booleanValue()) {
            this.zzb = new com.google.android.gms.internal.appset.zzr(context);
        }
        this.zze = context;
        this.zza = zzbyqVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzbbp zzbbpVar = zzbby.zzdc;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzdh)).booleanValue()) {
                if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzdd)).booleanValue()) {
                    return zzgbc.zzm(zzfqd.zza(this.zzb.getAppSetIdInfo(), null), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzelv
                        @Override // com.google.android.gms.internal.ads.zzfsw
                        public final Object apply(Object obj) {
                            U2.b bVar = (U2.b) obj;
                            return new zzelz(bVar.f6399a, bVar.f6400b);
                        }
                    }, zzbza.zzg);
                }
                Task taskZza = ((Boolean) c0254t.f2726c.zzb(zzbby.zzdg)).booleanValue() ? zzfce.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgbc.zzh(new zzelz(null, -1));
                }
                I3.b bVarZzn = zzgbc.zzn(zzfqd.zza(taskZza, null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzelw
                    @Override // com.google.android.gms.internal.ads.zzgaj
                    public final I3.b zza(Object obj) {
                        U2.b bVar = (U2.b) obj;
                        return bVar == null ? zzgbc.zzh(new zzelz(null, -1)) : zzgbc.zzh(new zzelz(bVar.f6399a, bVar.f6400b));
                    }
                }, zzbza.zzg);
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzde)).booleanValue()) {
                    bVarZzn = zzgbc.zzo(bVarZzn, ((Long) c0254t.f2726c.zzb(zzbby.zzdf)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgbc.zze(bVarZzn, Exception.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzelx
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzelz(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgbc.zzh(new zzelz(null, -1));
    }
}
