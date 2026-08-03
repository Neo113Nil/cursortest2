package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbae implements com.google.android.gms.internal.ads.zzfye {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfxg zza;

    zzbae(com.google.android.gms.internal.ads.zzfxg zzfxgVar) {
        this.zza = zzfxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(int i, long j) {
        this.zza.zzb(i, java.lang.System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zzb(int i, long j, java.lang.String str) {
        this.zza.zzf(i, java.lang.System.currentTimeMillis() - j, str);
    }
}
