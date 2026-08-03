package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgcg {
    private final java.lang.String zza;
    private final long zzb;

    public zzgcg() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzgcg(java.lang.String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }
}
