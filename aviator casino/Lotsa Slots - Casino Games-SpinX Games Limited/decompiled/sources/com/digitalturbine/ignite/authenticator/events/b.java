package com.digitalturbine.ignite.authenticator.events;

/* loaded from: classes2.dex */
public final class b {
    public static final com.digitalturbine.ignite.authenticator.events.b b = new com.digitalturbine.ignite.authenticator.events.b();

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.events.a f3508a;

    public static void a(com.digitalturbine.ignite.authenticator.events.d dVar, java.lang.Exception exc) {
        a(dVar, com.digitalturbine.ignite.authenticator.utils.events.a.a(exc, null));
    }

    public static void a(com.digitalturbine.ignite.authenticator.events.d dVar, java.lang.Object... objArr) {
        com.digitalturbine.ignite.authenticator.logger.a.a("%s : dispatching event", "IgniteEventDispatcher");
        if (b.f3508a != null) {
            com.fyber.inneractive.sdk.network.t a2 = com.fyber.inneractive.sdk.network.t.a(dVar);
            if (a2 == null) {
                com.fyber.inneractive.sdk.util.IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", dVar);
            } else {
                new com.fyber.inneractive.sdk.network.w(a2).a(objArr).a((java.lang.String) null);
            }
        }
    }
}
