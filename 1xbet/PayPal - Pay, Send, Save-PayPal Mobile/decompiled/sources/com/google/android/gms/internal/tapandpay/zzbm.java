package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbm extends com.google.android.gms.common.internal.GmsClient {
    public zzbm(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, 79, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        return queryLocalInterface instanceof com.google.android.gms.internal.tapandpay.zzh ? (com.google.android.gms.internal.tapandpay.zzh) queryLocalInterface : new com.google.android.gms.internal.tapandpay.zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.tapandpay.zza.zzaj;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("sdk_version", com.google.android.gms.tapandpay.BuildConstants.SDK_VERSION);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }
}
