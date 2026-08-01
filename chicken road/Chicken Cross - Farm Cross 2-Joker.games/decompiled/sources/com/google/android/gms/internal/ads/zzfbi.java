package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfbi implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzfbi(zzhdi zzhdiVar, zzflw zzflwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbi.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 26;
    }

    final /* synthetic */ zzfbj zzc() {
        return new zzfbj(this.zzb, this.zzc, this.zzd);
    }
}
