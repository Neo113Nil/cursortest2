package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zacl extends com.google.android.gms.common.api.internal.UnregisterListenerMethod {
    final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zacl(com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException {
        com.google.android.gms.common.api.internal.RemoteCall remoteCall;
        remoteCall = this.zaa.zab;
        remoteCall.accept(anyClient, taskCompletionSource);
    }
}
