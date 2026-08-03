package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbeh extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbej {
    zzbeh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.ads.zzbej
    public final android.os.Bundle zze(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, bundle);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, android.os.Bundle.CREATOR);
        zzcZ.recycle();
        return bundle2;
    }
}
