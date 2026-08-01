package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewl implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;
    private final zzcga zzc;

    public zzewl(zzhdi zzhdiVar, zzflw zzflwVar, zzcga zzcgaVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
        this.zzc = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzewl.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 9;
    }

    final /* synthetic */ zzewm zzc() {
        return new zzewm(this.zzb.zzk, this.zzc.zzl());
    }
}
