package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzyv implements com.google.android.gms.internal.ads.zzabk {
    public long zza;
    public long zzb;
    public com.google.android.gms.internal.ads.zzabj zzc;
    public com.google.android.gms.internal.ads.zzyv zzd;

    public zzyv(long j, int i) {
        zza(j, 65536);
    }

    public final void zza(long j, int i) {
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzc == null);
        this.zza = j;
        this.zzb = j + android.support.v4.media.session.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }

    public final int zzb(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final com.google.android.gms.internal.ads.zzyv zzc() {
        this.zzc = null;
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zzd;
        this.zzd = null;
        return zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final com.google.android.gms.internal.ads.zzabk zze() {
        com.google.android.gms.internal.ads.zzyv zzyvVar = this.zzd;
        if (zzyvVar == null || zzyvVar.zzc == null) {
            return null;
        }
        return zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabk
    public final com.google.android.gms.internal.ads.zzabj zzd() {
        com.google.android.gms.internal.ads.zzabj zzabjVar = this.zzc;
        zzabjVar.getClass();
        return zzabjVar;
    }
}
