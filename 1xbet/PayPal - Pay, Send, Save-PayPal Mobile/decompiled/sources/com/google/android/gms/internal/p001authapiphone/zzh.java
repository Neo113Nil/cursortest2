package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzh extends com.google.android.gms.internal.p001authapiphone.zza implements android.os.IInterface {
    zzh(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
    }

    public final void zzc(com.google.android.gms.internal.p001authapiphone.zzg zzgVar, com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest incomingCallRetrieverRequest) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzgVar);
        if (incomingCallRetrieverRequest == null) {
            zza.writeInt(0);
        } else {
            zza.writeInt(1);
            incomingCallRetrieverRequest.writeToParcel(zza, 0);
        }
        zzb(1, zza);
    }

    public final void zzd(com.google.android.gms.internal.p001authapiphone.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.p001authapiphone.zzc.zzb(zza, zzgVar);
        zzb(2, zza);
    }
}
