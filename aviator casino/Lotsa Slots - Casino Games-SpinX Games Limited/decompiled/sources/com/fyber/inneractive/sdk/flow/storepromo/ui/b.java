package com.fyber.inneractive.sdk.flow.storepromo.ui;

/* loaded from: classes3.dex */
public final class b extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f3754a;

    public b(com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar) {
        this.f3754a = new java.lang.ref.WeakReference(cVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.fyber.inneractive.sdk.flow.storepromo.ui.c cVar = (com.fyber.inneractive.sdk.flow.storepromo.ui.c) this.f3754a.get();
        if (cVar != null) {
            cVar.a();
        }
    }
}
