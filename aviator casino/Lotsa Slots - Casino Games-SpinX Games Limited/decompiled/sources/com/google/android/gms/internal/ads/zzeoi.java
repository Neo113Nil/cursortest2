package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeoi extends com.google.android.gms.internal.ads.zzbwu {
    final /* synthetic */ com.google.android.gms.internal.ads.zzeoj zza;
    private final com.google.android.gms.internal.ads.zzelv zzb;

    /* synthetic */ zzeoi(com.google.android.gms.internal.ads.zzeoj zzeojVar, com.google.android.gms.internal.ads.zzelv zzelvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzeojVar);
        this.zza = zzeojVar;
        this.zzb = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zze(com.google.android.gms.internal.ads.zzbvr zzbvrVar) throws android.os.RemoteException {
        this.zza.zzc(zzbvrVar);
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzx(zzeVar);
    }
}
