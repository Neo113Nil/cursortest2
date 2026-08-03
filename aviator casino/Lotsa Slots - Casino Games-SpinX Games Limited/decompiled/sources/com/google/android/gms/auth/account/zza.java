package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public abstract class zza extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zzb {
    public zza() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int i3 = com.google.android.gms.internal.auth.zzc.zza;
            int readInt = parcel.readInt();
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzc(readInt != 0);
        } else {
            android.accounts.Account account = (android.accounts.Account) com.google.android.gms.internal.auth.zzc.zza(parcel, android.accounts.Account.CREATOR);
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzb(account);
        }
        return true;
    }
}
