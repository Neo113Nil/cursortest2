package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zzeuy implements zzesh {
    private final zzbyq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgbn zze;
    private final int zzf;
    private final int zzg;

    public zzeuy(zzbyq zzbyqVar, boolean z4, boolean z7, zzbyf zzbyfVar, zzgbn zzgbnVar, String str, ScheduledExecutorService scheduledExecutorService, int i7, int i8) {
        this.zza = zzbyqVar;
        this.zzb = z4;
        this.zzc = z7;
        this.zze = zzgbnVar;
        this.zzd = scheduledExecutorService;
        this.zzf = i7;
        this.zzg = i8;
    }

    public static /* synthetic */ zzeuz zzc(zzeuy zzeuyVar, Exception exc) {
        zzeuyVar.zza.zzw(exc, "TrustlessTokenSignal");
        return new zzeuz(null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        boolean zContains;
        zzbbp zzbbpVar = zzbby.zzgV;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && this.zzc) {
            return zzgbc.zzh(new zzeuz(null));
        }
        if (this.zzg == 2) {
            return zzgbc.zzh(new zzeuz(null));
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgX)).booleanValue()) {
            zContains = Arrays.asList(((String) c0254t.f2726c.zzb(zzbby.zzgY)).split(",")).contains(String.valueOf(this.zzf));
        } else {
            zContains = this.zzb;
        }
        if (!zContains) {
            return zzgbc.zzh(new zzeuz(null));
        }
        return zzgbc.zze(zzgbc.zzo(zzgbc.zzm(zzgbc.zzh(null), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return new zzeuz((String) obj);
            }
        }, this.zze), ((Long) zzbem.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeux
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzeuy.zzc(this.zza, (Exception) obj);
            }
        }, this.zze);
    }
}
