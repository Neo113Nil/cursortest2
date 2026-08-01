package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdma {
    private final List zza;
    private final zzfte zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private boolean zzd;

    public zzdma(zzfld zzfldVar, zzfte zzfteVar) {
        this.zza = zzfldVar.zzp;
        this.zzb = zzfteVar;
        this.zzc = zzfldVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
