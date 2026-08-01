package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdqo {
    private zzbms zza;

    public zzdqo(zzdpz zzdpzVar) {
        this.zza = zzdpzVar;
    }

    public final synchronized zzbms zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbms zzbmsVar) {
        this.zza = zzbmsVar;
    }
}
