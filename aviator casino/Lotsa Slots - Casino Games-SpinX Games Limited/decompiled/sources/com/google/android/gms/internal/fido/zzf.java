package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public abstract class zzf extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzg {
    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            java.util.ArrayList zzb = com.google.android.gms.internal.fido.zzc.zzb(parcel);
            com.google.android.gms.internal.fido.zzc.zzc(parcel);
            zzb(zzb);
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
