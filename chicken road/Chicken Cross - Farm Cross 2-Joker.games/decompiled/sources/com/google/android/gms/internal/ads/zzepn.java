package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzepn implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;

    private zzepn(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar4;
        this.zzd = zziofVar5;
        this.zze = zziofVar6;
        this.zzf = zziofVar7;
    }

    public static zzepn zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        return new zzepn(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzepl zzb() {
        return new zzepl(((zzcok) this.zza).zza(), (zzfrg) this.zzb.zzb(), zzfoy.zzc(), (ScheduledExecutorService) this.zzc.zzb(), (zzcyo) this.zzd.zzb(), (zzeqb) this.zze.zzb(), (zzfta) this.zzf.zzb());
    }
}
