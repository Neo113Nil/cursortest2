package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgep implements java.lang.Comparable {
    final java.lang.Runnable zza;
    final long zzb;

    zzgep(java.lang.Runnable runnable, long j) {
        this.zza = runnable;
        this.zzb = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.zzb, ((com.google.android.gms.internal.ads.zzgep) obj).zzb);
    }
}
