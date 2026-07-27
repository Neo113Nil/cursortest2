package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzduu implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;
    private final zziof zzi;
    private final zziof zzj;
    private final zziof zzk;

    private zzduu(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
        this.zzg = zziofVar7;
        this.zzh = zziofVar8;
        this.zzi = zziofVar9;
        this.zzj = zziofVar10;
        this.zzk = zziofVar11;
    }

    public static zzduu zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11) {
        return new zzduu(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10, zziofVar11);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdus(((zzddg) this.zza).zza(), (Executor) this.zzb.zzb(), (zzdxg) this.zzc.zzb(), (Context) this.zzd.zzb(), (zzeaj) this.zze.zzb(), (zzfte) this.zzf.zzb(), (zzele) this.zzg.zzb(), (zzdwb) this.zzh.zzb(), (zzeae) this.zzi.zzb(), (zzebm) this.zzj.zzb(), (zzdcg) this.zzk.zzb());
    }
}
