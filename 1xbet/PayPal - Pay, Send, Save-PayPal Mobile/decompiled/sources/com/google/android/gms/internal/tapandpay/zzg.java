package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzg extends com.google.android.gms.internal.tapandpay.zza implements com.google.android.gms.internal.tapandpay.zzh {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzA(com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, hasEligibleTokenizationTargetRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(92, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzB(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(96, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzd(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(10, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zze(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(21, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzf(int i, java.lang.String str, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(22, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzg(com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest getTokenStatusRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, getTokenStatusRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(101, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzh(int i, java.lang.String str, java.lang.String str2, int i2, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(i2);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(23, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzi(com.google.android.gms.tapandpay.issuer.TokenizeRequest tokenizeRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, tokenizeRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(93, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzj(int i, java.lang.String str, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(24, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzk(com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest requestSelectTokenRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, requestSelectTokenRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(100, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzl(int i, java.lang.String str, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeString(str);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(25, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzm(com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest requestDeleteTokenRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, requestDeleteTokenRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(99, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzn(com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, pushTokenizeRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(28, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzo(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(29, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzp(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(30, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzq(com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest getStableHardwareIdRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, getStableHardwareIdRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(103, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzr(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(31, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzs(com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest getEnvironmentRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, getEnvironmentRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(104, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzt(java.lang.String str, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(61, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzu(com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest createPushProvisionSessionRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, createPushProvisionSessionRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(67, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzv(com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest serverPushProvisionRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, serverPushProvisionRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(68, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzw(com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(74, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzx(com.google.android.gms.tapandpay.issuer.ListTokensRequest listTokensRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, listTokensRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(102, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzy(com.google.android.gms.tapandpay.issuer.IsTokenizedRequest isTokenizedRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, isTokenizedRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(75, zza);
    }

    @Override // com.google.android.gms.internal.tapandpay.zzh
    public final void zzz(com.google.android.gms.tapandpay.issuer.ViewTokenRequest viewTokenRequest, com.google.android.gms.internal.tapandpay.zzj zzjVar, com.google.android.gms.common.api.ApiMetadata apiMetadata) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, viewTokenRequest);
        com.google.android.gms.internal.tapandpay.zzc.zzd(zza, zzjVar);
        com.google.android.gms.internal.tapandpay.zzc.zzc(zza, apiMetadata);
        zzb(79, zza);
    }
}
