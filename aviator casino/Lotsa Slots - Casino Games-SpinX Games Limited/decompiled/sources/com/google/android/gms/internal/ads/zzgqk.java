package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgqk extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzgqm {
    zzgqk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zze(java.lang.String str, android.os.Bundle bundle, com.google.android.gms.internal.ads.zzgqo zzgqoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzgqoVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zzf(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzgqo zzgqoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzgqoVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final void zzg(android.os.Bundle bundle, com.google.android.gms.internal.ads.zzgqo zzgqoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzgqoVar);
        zzdb(3, zza);
    }
}
