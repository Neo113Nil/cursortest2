package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzg extends com.google.android.gms.common.internal.GmsClient {
    public zzg(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof com.google.android.gms.internal.identity.zzv ? (com.google.android.gms.internal.identity.zzv) queryLocalInterface : new com.google.android.gms.internal.identity.zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.location.zzo.zzp;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("client_name", "activity_recognition");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        ((com.google.android.gms.internal.identity.zzv) getService()).zzl(pendingIntent);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }
}
