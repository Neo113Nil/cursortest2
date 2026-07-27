package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzese implements zzemq {
    private final zzbkb zza;
    private final zzhdi zzb;
    private final zzfqi zzc;
    private final zzesn zzd;

    public zzese(zzfqi zzfqiVar, zzhdi zzhdiVar, zzbkb zzbkbVar, zzesn zzesnVar) {
        this.zzc = zzfqiVar;
        this.zzb = zzhdiVar;
        this.zza = zzbkbVar;
        this.zzd = zzesnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.zza == null || (zzfliVar = zzfldVar.zzs) == null || zzfliVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        zzcgo zzcgoVar = new zzcgo();
        zzesj zzesjVar = new zzesj();
        zzesjVar.zzd(new zzesc(this, zzcgoVar, zzfloVar, zzfldVar, zzesjVar));
        zzfli zzfliVar = zzfldVar.zzs;
        final zzbjw zzbjwVar = new zzbjw(zzesjVar, zzfliVar.zzb, zzfliVar.zza);
        zzfqc zzfqcVar = zzfqc.CUSTOM_RENDER_SYN;
        zzfqi zzfqiVar = this.zzc;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() {
                zzese.this.zzc(zzbjwVar);
            }
        }, this.zzb, zzfqcVar, zzfqiVar).zzj(zzfqc.CUSTOM_RENDER_ACK).zze(zzcgoVar).zzi();
    }

    final /* synthetic */ void zzc(zzbjw zzbjwVar) {
        this.zza.zze(zzbjwVar);
    }

    final /* synthetic */ zzesn zzd() {
        return this.zzd;
    }
}
