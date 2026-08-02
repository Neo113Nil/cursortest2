package com.facetec.sdk;

/* loaded from: classes8.dex */
final class cu extends android.content.BroadcastReceiver {
    private final java.lang.ref.WeakReference<com.facetec.sdk.bf> c;

    cu(android.app.Activity activity) {
        this.c = new java.lang.ref.WeakReference<>((com.facetec.sdk.bf) activity);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (com.facetec.sdk.bj.c()) {
            com.facetec.sdk.t.c(this.c.get(), com.facetec.sdk.c.POWER_BUTTON_PRESSED, (java.lang.String) null, (java.lang.Throwable) null);
        }
    }
}
