package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzbf extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.auth.api.proxy.ProxyResponse proxyResponse = (com.google.android.gms.auth.api.proxy.ProxyResponse) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.proxy.ProxyResponse.CREATOR);
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzb(proxyResponse);
        } else {
            if (i != 2) {
                return false;
            }
            java.lang.String readString = parcel.readString();
            com.google.android.gms.internal.auth.zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
