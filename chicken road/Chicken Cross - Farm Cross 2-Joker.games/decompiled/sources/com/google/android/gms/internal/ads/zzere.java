package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzere implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;
    private final zziof zzi;

    private zzere(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
        this.zzg = zziofVar8;
        this.zzh = zziofVar9;
        this.zzi = zziofVar10;
    }

    public static zzere zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
        return new zzere(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzerd((Context) this.zza.zzb(), ((zzcpa) this.zzb).zza(), ((zzddg) this.zzc).zza(), (Executor) this.zzd.zzb(), (zzdwp) this.zze.zzb(), (zzdxg) this.zzf.zzb(), new zzbqk(), (zzelp) this.zzg.zzb(), (zzeae) this.zzh.zzb(), (zzeaj) this.zzi.zzb());
    }
}
