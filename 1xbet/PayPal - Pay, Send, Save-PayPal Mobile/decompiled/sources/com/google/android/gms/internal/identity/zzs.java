package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public abstract class zzs extends com.google.android.gms.internal.identity.zzb implements com.google.android.gms.internal.identity.zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            java.lang.String[] createStringArray = parcel.createStringArray();
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzb(readInt, createStringArray);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            java.lang.String[] createStringArray2 = parcel.createStringArray();
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzc(readInt2, createStringArray2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.identity.zzc.zza(parcel, android.app.PendingIntent.CREATOR);
            com.google.android.gms.internal.identity.zzc.zzd(parcel);
            zzd(readInt3, pendingIntent);
        }
        return true;
    }
}
