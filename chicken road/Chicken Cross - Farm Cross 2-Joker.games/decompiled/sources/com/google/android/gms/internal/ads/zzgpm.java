package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgpm implements zzgpi {
    private final zzgfw zza;
    private final zzgfw zzb;
    private final zzinq zzc;
    private final zzgrh zzd;
    private final ExecutorService zze;

    zzgpm(zzgfw zzgfwVar, zzgfw zzgfwVar2, zzinq zzinqVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgfwVar;
        this.zzb = zzgfwVar2;
        this.zzc = zzinqVar;
        this.zzd = zzgrhVar;
        this.zze = executorService;
    }

    private final ListenableFuture zzi(zzggt zzggtVar) {
        ListenableFuture zzc = this.zza.zzc(zzggtVar);
        this.zzd.zze(20303, zzc);
        return zzc;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture zzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzd.zze(20302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgfw) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, zzc);
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzl(zzc, zzj(bArr2))), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgpk
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgpm.this.zzh(zzggtVar, (List) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, byte[] bArr) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzj(bArr)), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgpj
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgpm.this.zzg(zzggtVar, (Void) obj);
            }
        }, zzhdp.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final ListenableFuture zze() {
        ListenableFuture zzb = this.zzb.zzb();
        this.zzd.zze(20304, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final ListenableFuture zzf() {
        ListenableFuture zzd = zzhcy.zzd(zzgpl.zza, this.zze);
        this.zzd.zze(20312, zzd);
        return zzd;
    }

    final /* synthetic */ ListenableFuture zzg(zzggt zzggtVar, Void r2) {
        return zzi(zzggtVar);
    }

    final /* synthetic */ ListenableFuture zzh(zzggt zzggtVar, List list) {
        return zzi(zzggtVar);
    }
}
