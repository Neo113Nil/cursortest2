package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zacz extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(com.google.android.gms.common.api.internal.zada zadaVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        com.google.android.gms.common.api.internal.zada zadaVar;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
                android.util.Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(java.lang.String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            android.util.Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
            return;
        }
        com.google.android.gms.common.api.PendingResult pendingResult = (com.google.android.gms.common.api.PendingResult) message.obj;
        obj = this.zaa.zae;
        synchronized (obj) {
            zadaVar = this.zaa.zab;
            com.google.android.gms.common.api.internal.zada zadaVar2 = (com.google.android.gms.common.api.internal.zada) com.google.android.gms.common.internal.Preconditions.checkNotNull(zadaVar);
            if (pendingResult == null) {
                zadaVar2.zaj(new com.google.android.gms.common.api.Status(13, "Transform returned null"));
            } else if (pendingResult instanceof com.google.android.gms.common.api.internal.zacp) {
                zadaVar2.zaj(((com.google.android.gms.common.api.internal.zacp) pendingResult).zaa());
            } else {
                zadaVar2.zai(pendingResult);
            }
        }
    }
}
