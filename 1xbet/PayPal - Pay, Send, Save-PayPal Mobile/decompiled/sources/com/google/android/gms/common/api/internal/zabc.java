package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zabc extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabc(com.google.android.gms.common.api.internal.zabe zabeVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            com.google.android.gms.common.api.internal.zabe.zaj(this.zaa);
            return;
        }
        if (i == 2) {
            com.google.android.gms.common.api.internal.zabe.zai(this.zaa);
            return;
        }
        android.util.Log.w("GoogleApiClientImpl", "Unknown message id: " + message.what);
    }
}
