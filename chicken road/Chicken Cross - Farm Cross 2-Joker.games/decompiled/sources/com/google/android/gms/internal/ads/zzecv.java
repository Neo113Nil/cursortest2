package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzecv implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;
    private final zziof zzi;

    private zzecv(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar5;
        this.zze = zziofVar6;
        this.zzf = zziofVar7;
        this.zzg = zziofVar8;
        this.zzh = zziofVar9;
        this.zzi = zziofVar10;
    }

    public static zzecv zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
        return new zzecv(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzecu((Executor) this.zza.zzb(), ((zzcok) this.zzb).zza(), ((zzcol) this.zzc).zza(), zzfoy.zzc(), (zzdya) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb(), (zzeau) this.zzf.zzb(), ((zzcpa) this.zzg).zza(), ((zzdkw) this.zzh).zzb(), (zzfrj) this.zzi.zzb());
    }
}
