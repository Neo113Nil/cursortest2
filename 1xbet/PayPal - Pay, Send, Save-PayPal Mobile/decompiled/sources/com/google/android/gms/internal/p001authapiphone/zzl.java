package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public abstract class zzl extends com.google.android.gms.internal.p001authapiphone.zzb implements com.google.android.gms.internal.p001authapiphone.zzm {
    public zzl() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.p001authapiphone.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR);
        com.google.android.gms.internal.p001authapiphone.zzc.zzc(parcel);
        zzb(status);
        return true;
    }
}
