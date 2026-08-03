package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzake implements java.lang.Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    /* synthetic */ zzake(long j, long j2, long j3, byte[] bArr) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.zza, ((com.google.android.gms.internal.ads.zzake) obj).zza);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzake)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzake zzakeVar = (com.google.android.gms.internal.ads.zzake) obj;
        return this.zza == zzakeVar.zza && this.zzb == zzakeVar.zzb && this.zzc == zzakeVar.zzc;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc));
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    final /* synthetic */ long zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
