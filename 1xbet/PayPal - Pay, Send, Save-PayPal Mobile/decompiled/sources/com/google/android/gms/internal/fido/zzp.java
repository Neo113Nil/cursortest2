package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzp extends com.google.android.gms.common.internal.GmsClient {
    public zzp(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 148, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof com.google.android.gms.internal.fido.zzs ? (com.google.android.gms.internal.fido.zzs) queryLocalInterface : new com.google.android.gms.internal.fido.zzs(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return new com.google.android.gms.common.Feature[]{com.google.android.gms.fido.zza.zzh, com.google.android.gms.fido.zza.zzg};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }
}
