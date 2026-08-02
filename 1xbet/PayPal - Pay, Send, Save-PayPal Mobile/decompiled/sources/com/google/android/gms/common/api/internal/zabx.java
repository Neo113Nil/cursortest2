package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class zabx extends android.content.BroadcastReceiver {
    android.content.Context zaa;
    private final com.google.android.gms.common.api.internal.zabw zab;

    public zabx(com.google.android.gms.common.api.internal.zabw zabwVar) {
        this.zab = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.zab.zaa();
            zab();
        }
    }

    public final void zab() {
        synchronized (this) {
            android.content.Context context = this.zaa;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.zaa = null;
        }
    }

    public final void zaa(android.content.Context context) {
        this.zaa = context;
    }
}
