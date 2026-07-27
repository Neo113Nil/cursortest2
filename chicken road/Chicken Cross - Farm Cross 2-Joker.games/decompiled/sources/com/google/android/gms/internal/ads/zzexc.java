package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexc implements zzfdi {
    private final zzhdi zza;
    private final VersionInfoParcel zzb;

    zzexc(VersionInfoParcel versionInfoParcel, zzhdi zzhdiVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzexc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 54;
    }

    final /* synthetic */ zzexd zzc() {
        return zzexd.zzb(this.zzb);
    }
}
