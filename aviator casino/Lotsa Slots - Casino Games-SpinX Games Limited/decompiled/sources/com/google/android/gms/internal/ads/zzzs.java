package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzs {
    public final long zza;
    public final long zzb;

    public zzzs(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzzs)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzzs zzzsVar = (com.google.android.gms.internal.ads.zzzs) obj;
        return this.zza == zzzsVar.zza && this.zzb == zzzsVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
