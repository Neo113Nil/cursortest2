package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbg extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zba;

    public zbg(android.content.Context context, android.os.Looper looper, com.google.android.gms.auth.api.identity.zbi zbiVar, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zba = new android.os.Bundle();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof com.google.android.gms.internal.p000authapi.zbm ? (com.google.android.gms.internal.p000authapi.zbm) queryLocalInterface : new com.google.android.gms.internal.p000authapi.zbm(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        return com.google.android.gms.internal.p000authapi.zbav.zbx;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final android.os.Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }
}
