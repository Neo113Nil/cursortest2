package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes.dex */
public final class zzlt {
    private final zzij zza;

    @Deprecated
    public zzlt(Context context, zzcdh zzcdhVar) {
        this.zza = new zzij(context, zzcdhVar);
    }

    @Deprecated
    public final zzlt zza(final zzkj zzkjVar) {
        zzij zzijVar = this.zza;
        zzcv.zzf(!zzijVar.zzr);
        zzkjVar.getClass();
        zzijVar.zzf = new zzftz() { // from class: com.google.android.gms.internal.ads.zzib
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return zzkj.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlt zzb(final zzyn zzynVar) {
        zzij zzijVar = this.zza;
        zzcv.zzf(!zzijVar.zzr);
        zzynVar.getClass();
        zzijVar.zze = new zzftz() { // from class: com.google.android.gms.internal.ads.zzii
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                return zzyn.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlu zzc() {
        zzij zzijVar = this.zza;
        zzcv.zzf(!zzijVar.zzr);
        zzijVar.zzr = true;
        return new zzlu(zzijVar);
    }
}
