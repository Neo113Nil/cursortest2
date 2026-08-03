package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public final class zzw extends com.google.android.gms.internal.fido.zza implements android.os.IInterface {
    zzw(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(com.google.android.gms.internal.fido.zzv zzvVar, com.google.android.gms.fido.u2f.api.common.RegisterRequestParams registerRequestParams) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzvVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, registerRequestParams);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(com.google.android.gms.internal.fido.zzv zzvVar, com.google.android.gms.fido.u2f.api.common.SignRequestParams signRequestParams) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.fido.zzc.zza;
        zza.writeStrongBinder(zzvVar);
        com.google.android.gms.internal.fido.zzc.zzd(zza, signRequestParams);
        zzb(2, zza);
    }
}
