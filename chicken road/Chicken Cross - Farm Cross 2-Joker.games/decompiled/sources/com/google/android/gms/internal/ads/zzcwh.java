package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwh implements zzinw {
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

    private zzcwh(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
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
    }

    public static zzcwh zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10) {
        return new zzcwh(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10);
    }

    public static zzcwg zzd(zzcyk zzcykVar, Context context, zzfle zzfleVar, View view, zzclm zzclmVar, zzcyj zzcyjVar, zzdrb zzdrbVar, zzdly zzdlyVar, zzinq zzinqVar, Executor executor) {
        return new zzcwg(zzcykVar, context, zzfleVar, view, zzclmVar, zzcyjVar, zzdrbVar, zzdlyVar, zzinqVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcwg zzb() {
        return new zzcwg(((zzdas) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwn) this.zzc).zza(), ((zzcwm) this.zzd).zza(), ((zzcxb) this.zze).zza(), ((zzcwo) this.zzf).zza(), ((zzdoy) this.zzg).zza(), (zzdly) this.zzh.zzb(), zzinv.zzc(this.zzi), (Executor) this.zzj.zzb());
    }
}
