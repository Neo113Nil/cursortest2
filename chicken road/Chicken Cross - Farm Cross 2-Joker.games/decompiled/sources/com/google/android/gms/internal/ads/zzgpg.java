package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgpg implements zzgoa {
    private final zzgmd zza;
    private final ExecutorService zzb;
    private final zzgrh zzc;

    zzgpg(zzgmd zzgmdVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzgmdVar;
        this.zzb = executorService;
        this.zzc = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zza() {
        return zzhcy.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzb() {
        ListenableFuture zzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgpg.this.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzc(final zzggt zzggtVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture zzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgpg.this.zzi(zzggtVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnz
    public final ListenableFuture zzd(final zzggt zzggtVar, final byte[] bArr) {
        ListenableFuture zzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgpg.this.zzh(zzggtVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgoa
    public final ListenableFuture zze() {
        ListenableFuture zzd = zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgpc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgpg.this.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    final /* synthetic */ zzggt zzf() {
        zzggt zzc = this.zza.zzc(1);
        return zzc == null ? zzggt.zzh() : zzc;
    }

    final /* synthetic */ zzfzr zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ Void zzh(zzggt zzggtVar, byte[] bArr) {
        this.zza.zza(zzggtVar, null, bArr);
        return null;
    }

    final /* synthetic */ Void zzi(zzggt zzggtVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzggtVar, bArr, bArr2);
        return null;
    }
}
