package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzd extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            int i3 = com.google.android.gms.internal.fido.zzc.zza;
            boolean z = parcel.readInt() != 0;
            com.google.android.gms.internal.fido.zzc.zzc(parcel);
            zzb(z);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.fido.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.fido.zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
