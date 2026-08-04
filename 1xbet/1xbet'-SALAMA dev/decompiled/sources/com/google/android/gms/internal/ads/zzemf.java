package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzemf implements zzesh {
    private final zzgbn zza;
    private final VersionInfoParcel zzb;

    public zzemf(VersionInfoParcel versionInfoParcel, zzgbn zzgbnVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 54;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemg.zzc(this.zza.zzb);
            }
        });
    }
}
