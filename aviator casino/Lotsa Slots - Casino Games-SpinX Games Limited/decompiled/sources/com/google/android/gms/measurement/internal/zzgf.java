package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzgf extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgg {
    public zzgf() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        com.google.android.gms.measurement.internal.zzop zzopVar = (com.google.android.gms.measurement.internal.zzop) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, com.google.android.gms.measurement.internal.zzop.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(zzopVar);
        return true;
    }
}
