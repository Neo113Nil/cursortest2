package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfiw implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzfiw(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzfiw zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfiw(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfiu zzb() {
        zzfiu zzfikVar;
        Context context = (Context) this.zza.zzb();
        zzfnh zzfnhVar = (zzfnh) this.zzb.zzb();
        zzfnz zzfnzVar = (zzfnz) this.zzc.zzb();
        zzcfq zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhs)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzp().zzj();
        boolean z = false;
        if (zzi != null && zzi.zzi()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhI)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhr)).booleanValue() || z) {
                zzfny zza = zzfnzVar.zza(zzfnp.AppOpen, context, zzfnhVar, new zzfhx(new zzfhw()));
                zzfil zzfilVar = new zzfil(new zzfik());
                zzfnl zzfnlVar = zza.zza;
                zzhdi zzhdiVar = zzcgj.zza;
                zzfikVar = new zzfib(zzfilVar, new zzfih(zzfnlVar, zzhdiVar), zza.zzb, zzfnlVar.zze().zzf, zzhdiVar);
                return zzfikVar;
            }
        }
        zzfikVar = new zzfik();
        return zzfikVar;
    }
}
