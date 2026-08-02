package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public abstract class zzl extends com.google.android.gms.internal.tapandpay.zzb implements com.google.android.gms.internal.tapandpay.zzm {
    public zzl() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            zza(status, readString);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
            java.lang.String readString2 = parcel.readString();
            com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
            zzb(status2, readString2);
        }
        return true;
    }
}
