package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbo extends com.google.android.gms.common.internal.GmsClient {
    public zzbo(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, 434, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService");
        return queryLocalInterface instanceof com.google.android.gms.internal.tapandpay.zzk ? (com.google.android.gms.internal.tapandpay.zzk) queryLocalInterface : new com.google.android.gms.internal.tapandpay.zzk(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.tapandpay.zza.zzaj;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 251600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.tapandpay.service.singleuser.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPaySingleUserService";
    }
}
