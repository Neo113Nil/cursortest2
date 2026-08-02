package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public abstract class zzl extends com.google.android.gms.internal.fido.zzb implements com.google.android.gms.internal.fido.zzm {
    public zzl() {
        super("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedCallbacks");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.fido.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.fido.zzc.zza(parcel, android.app.PendingIntent.CREATOR);
        com.google.android.gms.internal.fido.zzc.zzc(parcel);
        zzb(status, pendingIntent);
        return true;
    }
}
