package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzag extends com.google.android.gms.common.internal.GmsClient {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 411, clientSettings, connectionCallbacks, onConnectionFailedListener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConnectionFailedListener, "");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        com.google.android.gms.internal.p001authapiphone.zzh zzhVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iBinder, "");
        if (iBinder == null) {
            zzhVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
            zzhVar = queryLocalInterface instanceof com.google.android.gms.internal.p001authapiphone.zzh ? (com.google.android.gms.internal.p001authapiphone.zzh) queryLocalInterface : new com.google.android.gms.internal.p001authapiphone.zzh(iBinder);
        }
        return zzhVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.internal.p001authapiphone.zzan.zzg;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureArr, "");
        return featureArr;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 244000000;
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
        return "com.google.android.gms.auth.api.phone.service.MissedCallRetrieverService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService";
    }
}
