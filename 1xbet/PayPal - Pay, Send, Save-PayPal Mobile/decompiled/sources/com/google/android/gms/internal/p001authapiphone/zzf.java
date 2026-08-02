package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public abstract class zzf extends com.google.android.gms.internal.p001authapiphone.zzb implements com.google.android.gms.internal.p001authapiphone.zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) com.google.android.gms.internal.p001authapiphone.zzc.zza(parcel, android.app.PendingIntent.CREATOR);
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapiphone.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.internal.p001authapiphone.zzc.zzc(parcel);
        zzb(pendingIntent, status);
        return true;
    }
}
