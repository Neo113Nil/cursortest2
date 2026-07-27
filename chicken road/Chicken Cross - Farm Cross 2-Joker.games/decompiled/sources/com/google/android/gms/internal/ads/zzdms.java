package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdms extends zzdjn {
    private boolean zzb;

    protected zzdms(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdmr.zza);
    }

    public final void zzb() {
        zzs(zzdmn.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdmo.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        if (!this.zzb) {
            zzs(zzdmq.zza);
            this.zzb = true;
        }
        zzs(zzdmp.zza);
    }
}
