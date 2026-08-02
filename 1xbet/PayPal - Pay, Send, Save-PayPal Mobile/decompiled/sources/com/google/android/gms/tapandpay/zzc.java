package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
final class zzc extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zzc() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        return new com.google.android.gms.internal.tapandpay.zzbo(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
