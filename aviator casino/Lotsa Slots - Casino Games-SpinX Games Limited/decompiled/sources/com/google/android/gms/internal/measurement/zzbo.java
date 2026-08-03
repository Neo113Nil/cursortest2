package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzbo extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.internal.measurement.zzbq {
    zzbo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbq
    public final android.os.Bundle zze(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, bundle);
        android.os.Parcel zzP = zzP(1, zza);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(zzP, android.os.Bundle.CREATOR);
        zzP.recycle();
        return bundle2;
    }
}
