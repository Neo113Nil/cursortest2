package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzs extends com.google.android.gms.common.api.Api.AbstractClientBuilder {
    zzs() {
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ com.google.android.gms.common.api.Api.Client buildClient(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, java.lang.Object obj, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((com.google.android.gms.common.api.Api.ApiOptions.NoOptions) obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConnectionFailedListener, "");
        return new com.google.android.gms.internal.p001authapiphone.zzag(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}
