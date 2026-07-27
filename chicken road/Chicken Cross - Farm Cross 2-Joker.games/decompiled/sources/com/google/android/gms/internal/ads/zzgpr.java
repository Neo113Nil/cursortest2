package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgpr implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzgpr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzgpr zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzgpr(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzggf zzggfVar = (zzggf) this.zzb.zzb();
        final zzgrh zzgrhVar = (zzgrh) this.zzc.zzb();
        return zzggfVar.zza(file, zzggt.zzh(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgpq
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgrh.this.zzd(20308, (Throwable) obj);
                return zzggt.zzh();
            }
        });
    }
}
