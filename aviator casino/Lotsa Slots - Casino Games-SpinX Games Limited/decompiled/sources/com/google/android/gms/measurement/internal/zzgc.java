package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzgc extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.measurement.internal.zzgd {
    public zzgc() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 2) {
            return false;
        }
        java.util.ArrayList createTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.measurement.internal.zzog.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zze(createTypedArrayList);
        return true;
    }
}
