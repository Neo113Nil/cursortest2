package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzn extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {
    zzn(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(com.google.android.gms.internal.fido.zzg zzgVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(com.google.android.gms.internal.fido.zzm zzmVar, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzmVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, browserPublicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(com.google.android.gms.internal.fido.zzm zzmVar, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzmVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, browserPublicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(com.google.android.gms.internal.fido.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
