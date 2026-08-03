package com.digitalturbine.ignite.authenticator.callbacks;

/* loaded from: classes2.dex */
public final class b extends com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3501a;

    public b(com.digitalturbine.ignite.authenticator.handlers.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f3501a = arrayList;
        arrayList.add(aVar);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        java.util.Iterator it = this.f3501a.iterator();
        while (it.hasNext()) {
            com.digitalturbine.ignite.authenticator.decorator.h hVar = ((com.digitalturbine.ignite.authenticator.handlers.a) it.next()).f3509a;
            if (hVar != null) {
                com.digitalturbine.ignite.authenticator.logger.a.a("%s : on one dt error", "OneDTAuthenticator");
                hVar.k.set(true);
                if (hVar.d != null) {
                    com.digitalturbine.ignite.authenticator.logger.a.b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(java.lang.String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(java.lang.String str) {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : property retrieved", "IgnitePropertyCallback");
        java.util.Iterator it = this.f3501a.iterator();
        while (it.hasNext()) {
            com.digitalturbine.ignite.authenticator.decorator.h hVar = ((com.digitalturbine.ignite.authenticator.handlers.a) it.next()).f3509a;
            if (hVar != null) {
                if (android.text.TextUtils.isEmpty(str)) {
                    com.digitalturbine.ignite.authenticator.logger.a.a("%s : on one dt error", "OneDTAuthenticator");
                    hVar.k.set(true);
                    if (hVar.d != null) {
                        com.digitalturbine.ignite.authenticator.logger.a.b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.RAW_ONE_DT_ERROR, com.facebook.internal.NativeProtocol.BRIDGE_ARG_ERROR_CODE, com.digitalturbine.ignite.authenticator.events.c.ONE_DT_EMPTY_ENTITY.a());
                } else {
                    hVar.e.a(str);
                    hVar.f.getClass();
                    com.digitalturbine.ignite.authenticator.b a2 = com.digitalturbine.ignite.authenticator.parsers.b.a(str);
                    hVar.g = a2;
                    com.digitalturbine.ignite.authenticator.IgniteManager igniteManager = hVar.d;
                    if (igniteManager != null) {
                        com.digitalturbine.ignite.authenticator.logger.a.a("%s : setting one dt entity", "IgniteManager");
                        igniteManager.b = a2;
                    }
                }
            }
        }
    }
}
