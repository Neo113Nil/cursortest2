package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zabh extends com.google.android.gms.internal.base.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabh(com.google.android.gms.common.api.internal.zabi zabiVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            ((com.google.android.gms.common.api.internal.zabg) message.obj).zab(this.zaa);
        } else {
            if (i == 2) {
                throw ((java.lang.RuntimeException) message.obj);
            }
            android.util.Log.w("GACStateManager", "Unknown message id: " + message.what);
        }
    }
}
