package com.google.android.gms.internal.p000authapi;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes4.dex */
public final class zbe extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.zbd zba;

    public zbe(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.auth.api.zbd zbdVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        com.google.android.gms.auth.api.zbc zbcVar = new com.google.android.gms.auth.api.zbc(zbdVar == null ? com.google.android.gms.auth.api.zbd.zba : zbdVar);
        zbcVar.zba(com.google.android.gms.internal.p000authapi.zbat.zba());
        this.zba = new com.google.android.gms.auth.api.zbd(zbcVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof com.google.android.gms.internal.p000authapi.zbf ? (com.google.android.gms.internal.p000authapi.zbf) queryLocalInterface : new com.google.android.gms.internal.p000authapi.zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final android.os.Bundle getGetServiceRequestExtraArgs() {
        return this.zba.zba();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
