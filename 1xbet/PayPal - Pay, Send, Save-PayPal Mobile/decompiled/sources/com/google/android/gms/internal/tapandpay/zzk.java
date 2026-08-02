package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzk extends com.google.android.gms.internal.tapandpay.zza implements android.os.IInterface {
    zzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService");
    }

    public final void zzd(com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest getLinkingTokenRequest, com.google.android.gms.internal.tapandpay.zzm zzmVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, getLinkingTokenRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzmVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(1, zza);
    }

    public final void zze(com.google.android.gms.internal.tapandpay.zzm zzmVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzmVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(2, zza);
    }
}
