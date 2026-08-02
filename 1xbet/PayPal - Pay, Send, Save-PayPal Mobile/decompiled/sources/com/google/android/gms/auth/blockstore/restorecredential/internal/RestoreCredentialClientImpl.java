package com.google.android.gms.auth.blockstore.restorecredential.internal;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 "}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/internal/RestoreCredentialClientImpl;", "Lcom/google/android/gms/common/internal/GmsClient;", "Lcom/google/android/gms/auth/blockstore/restorecredential/internal/IRestoreCredentialService;", "Landroid/content/Context;", "context", "Landroid/os/Looper;", "looper", "Lcom/google/android/gms/common/internal/ClientSettings;", "clientSettings", "Lcom/google/android/gms/common/api/internal/ConnectionCallbacks;", "connectionCallbacks", "Lcom/google/android/gms/common/api/internal/OnConnectionFailedListener;", "connectionFailedListener", "<init>", "(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/ClientSettings;Lcom/google/android/gms/common/api/internal/ConnectionCallbacks;Lcom/google/android/gms/common/api/internal/OnConnectionFailedListener;)V", "", "getStartServiceAction", "()Ljava/lang/String;", "getServiceDescriptor", "Landroid/os/IBinder;", "binder", "createServiceInterface", "(Landroid/os/IBinder;)Lcom/google/android/gms/auth/blockstore/restorecredential/internal/IRestoreCredentialService;", "", "Lcom/google/android/gms/common/Feature;", "getApiFeatures", "()[Lcom/google/android/gms/common/Feature;", "", "getMinApkVersion", "()I", "", "getUseDynamicLookup", "()Z", "usesClientTelemetry", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RestoreCredentialClientImpl extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestoreCredentialClientImpl(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.internal.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 381, clientSettings, connectionCallbacks, onConnectionFailedListener);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConnectionFailedListener, "");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.common.Feature[] getApiFeatures() {
        com.google.android.gms.common.Feature[] featureArr = com.google.android.gms.internal.auth_blockstore.zzab.zzl;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(featureArr, "");
        return featureArr;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService createServiceInterface(android.os.IBinder binder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binder, "");
        com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService asInterface = com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService.Stub.asInterface(binder);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInterface, "");
        return asInterface;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }
}
