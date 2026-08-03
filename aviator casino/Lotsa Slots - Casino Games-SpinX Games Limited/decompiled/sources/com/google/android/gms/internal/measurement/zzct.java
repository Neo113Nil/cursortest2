package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzct extends com.google.android.gms.internal.measurement.zzbm implements com.google.android.gms.internal.measurement.zzcu {
    public zzct() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.measurement.zzbn.zzb(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.measurement.zzbn.zzf(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }
}
