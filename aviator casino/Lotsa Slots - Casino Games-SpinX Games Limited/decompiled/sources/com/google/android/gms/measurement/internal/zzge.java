package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzge extends com.google.android.gms.internal.measurement.zzbl implements com.google.android.gms.measurement.internal.zzgg {
    zzge(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.zzgg
    public final void zze(com.google.android.gms.measurement.internal.zzop zzopVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbn.zzc(zza, zzopVar);
        zzd(2, zza);
    }
}
