package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzghb {
    private final zzinq zza;
    private final zzinq zzb;
    private final zzinq zzc;
    private final ExecutorService zzd;
    private final zzgrh zze;
    private final int zzf;

    zzghb(zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, zzgei zzgeiVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.zza = zzinqVar;
        this.zzb = zzinqVar2;
        this.zzc = zzinqVar3;
        this.zzd = executorService;
        this.zze = zzgrhVar;
        this.zzf = zzgeiVar.zzL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture zzd(final int i) {
        return (zzhcq) zzhcy.zzj(zzhcq.zzw(zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzghb.this.zzc(i);
            }
        }, this.zzd)), zzggy.zza, zzhdp.zza());
    }

    final /* synthetic */ zzgrh zza() {
        return this.zze;
    }

    final ListenableFuture zzb(int i, boolean z) {
        ListenableFuture zzd = zzd(i);
        return (!z || i == this.zzf) ? zzd : (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzhcq.zzw(zzd), Throwable.class, zzgha.zza, zzhdp.zza()), new zzggw(this), zzhdp.zza());
    }

    final /* synthetic */ int zze() {
        return this.zzf;
    }

    final /* synthetic */ zzggu zzc(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return (zzggu) this.zza.zzb();
        }
        if (i2 == 2) {
            return (zzggu) this.zzb.zzb();
        }
        if (i2 == 3) {
            return (zzggu) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }
}
