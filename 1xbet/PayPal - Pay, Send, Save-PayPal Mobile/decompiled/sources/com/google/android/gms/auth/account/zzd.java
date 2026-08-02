package com.google.android.gms.auth.account;

/* loaded from: classes8.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zze {
    public static com.google.android.gms.auth.account.zze zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof com.google.android.gms.auth.account.zze ? (com.google.android.gms.auth.account.zze) queryLocalInterface : new com.google.android.gms.auth.account.zzc(iBinder);
    }
}
