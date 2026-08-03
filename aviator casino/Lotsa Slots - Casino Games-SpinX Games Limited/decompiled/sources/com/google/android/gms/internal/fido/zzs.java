package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public final class zzs extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {
    zzs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(com.google.android.gms.internal.fido.zzr zzrVar, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzrVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, publicKeyCredentialCreationOptions);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(com.google.android.gms.internal.fido.zzr zzrVar, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzrVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, publicKeyCredentialRequestOptions);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(com.google.android.gms.internal.fido.zze zzeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
