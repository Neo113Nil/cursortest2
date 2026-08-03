package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzh implements com.google.android.gms.internal.ads.zzfye {
    final /* synthetic */ com.google.android.gms.ads.internal.zzk zza;

    zzh(com.google.android.gms.ads.internal.zzk zzkVar) {
        java.util.Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(int i, long j) {
        this.zza.zzo().zzb(i, java.lang.System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zzb(int i, long j, java.lang.String str) {
        this.zza.zzo().zzf(i, java.lang.System.currentTimeMillis() - j, str);
    }
}
