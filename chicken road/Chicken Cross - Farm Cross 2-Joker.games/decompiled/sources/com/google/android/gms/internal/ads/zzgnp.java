package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgnp implements zzgni {
    private final Context zza;
    private final zzinq zzb;
    private final zzgnz zzc;
    private final zzgrh zzd;
    private final ExecutorService zze;
    private final zzgme zzf;
    private final zzfyi zzg;

    zzgnp(Context context, zzinq zzinqVar, zzgnz zzgnzVar, zzgrh zzgrhVar, ExecutorService executorService, zzgme zzgmeVar, zzfyi zzfyiVar) {
        this.zza = context;
        this.zzb = zzinqVar;
        this.zzc = zzgnzVar;
        this.zzd = zzgrhVar;
        this.zze = executorService;
        this.zzf = zzgmeVar;
        this.zzg = zzfyiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzggr zzf(int i) {
        zzggq zzd = zzggr.zzd();
        zzd.zzd(i);
        return (zzggr) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    public final ListenableFuture zza() {
        final zzinq zzinqVar = this.zzb;
        Objects.requireNonNull(zzinqVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgnk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzinq.this.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzg((zzhcq) zzhcy.zzk((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzk(zzhcq.zzw(zzhcy.zzd(callable, executorService)), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgno
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                zzgnp.this.zzb((zzbei) obj);
                return new Integer(0);
            }
        }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgnl
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgnp.this.zzc((Integer) obj);
            }
        }, zzhdp.zza()), new zzgub() { // from class: com.google.android.gms.internal.ads.zzgnm
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzgnp.this.zzd((zzggt) obj);
            }
        }, executorService), zzgnj.class, zzgnn.zza, zzhdp.zza());
        this.zzd.zze(15202, zzhcqVar);
        return zzhcqVar;
    }

    final /* synthetic */ int zzb(zzbei zzbeiVar) {
        if (zzfzf.zza(zzbeiVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbeiVar.name());
        throw new zzgnj(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ zzggr zzd(zzggt zzggtVar) {
        String zza = zzggtVar.zza().zza();
        String zzb = zzggtVar.zza().zzb();
        zzgrf zza2 = this.zzd.zza(15203);
        try {
            zza2.zza();
            zzfzw zza3 = zzfyr.zza(this.zza, 1, (zzbei) this.zzb.zzb(), zza, zzb, "1", this.zzg);
            zza2.zzc();
            int i = 2;
            if (zza3.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zza3.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                zzbek zze = zzbek.zze(bArr, zziew.zzc());
                if (zze.zza().zza().isEmpty() || zze.zza().zzb().isEmpty() || zze.zzc().zzA().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzggtVar.equals(zzggt.zzh()) || !TextUtils.equals(zzggtVar.zza().zza(), zze.zza().zza()) || !TextUtils.equals(zzggtVar.zza().zzb(), zze.zza().zzb())) {
                        int i2 = zza3.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zze.zzb().zzA())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzggq zzd = zzggr.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            i = i2 != 4 ? i2 != 6 ? 1 : 5 : 3;
                        }
                        zzd.zzd(i);
                        zzggs zzg = zzggt.zzg();
                        zzg.zza(zze.zza());
                        zzg.zzc((zzbei) this.zzb.zzb());
                        zzd.zza((zzggt) zzg.zzbu());
                        zzd.zzc(zze.zzb());
                        zzd.zzb(zze.zzc());
                        return (zzggr) zzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzige e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th) {
            try {
                zza2.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zza2.zzc();
                throw th2;
            }
        }
    }
}
