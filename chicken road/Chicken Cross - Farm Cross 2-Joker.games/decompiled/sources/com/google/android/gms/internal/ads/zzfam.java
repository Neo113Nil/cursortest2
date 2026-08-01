package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfam implements zzfdi {
    private final zzhdi zza;
    private final zzflw zzb;

    zzfam(zzhdi zzhdiVar, zzflw zzflwVar) {
        this.zza = zzhdiVar;
        this.zzb = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfam.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzfan zzc() {
        return new zzfan("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
