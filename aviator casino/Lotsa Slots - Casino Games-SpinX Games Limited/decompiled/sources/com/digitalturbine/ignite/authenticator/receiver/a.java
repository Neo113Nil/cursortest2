package com.digitalturbine.ignite.authenticator.receiver;

/* loaded from: classes2.dex */
public final class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public com.digitalturbine.ignite.authenticator.listeners.internal.b f3511a;
    public boolean b = false;

    public a(com.digitalturbine.ignite.authenticator.listeners.internal.b bVar) {
        this.f3511a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.digitalturbine.ignite.authenticator.listeners.internal.b bVar;
        if ("com.dt.ignite.service.action.PROPERTY_CHANGED".equals(intent.getAction())) {
            com.digitalturbine.ignite.authenticator.logger.a.a("%s : broadcast received", "PropertyChangeReceiver");
            java.lang.String stringExtra = intent.getStringExtra("PROPERTIES_CHANGED");
            if (stringExtra == null || (bVar = this.f3511a) == null) {
                return;
            }
            com.digitalturbine.ignite.authenticator.c cVar = (com.digitalturbine.ignite.authenticator.c) bVar;
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(stringExtra);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("DTID".equalsIgnoreCase(jSONArray.getString(i))) {
                        com.digitalturbine.ignite.authenticator.logger.a.a("%s : onPropertiesChanged", "OneDTPropertyWatchdog");
                        if (!cVar.c.c()) {
                            com.digitalturbine.ignite.authenticator.decorator.h hVar = cVar.d;
                            if (hVar != null) {
                                hVar.m();
                                return;
                            }
                            return;
                        }
                        com.digitalturbine.ignite.authenticator.logger.a.a("%s : onPropertiesChanged: will reconnect", "OneDTPropertyWatchdog");
                        com.digitalturbine.ignite.authenticator.decorator.h hVar2 = cVar.d;
                        if (hVar2 != null) {
                            com.digitalturbine.ignite.authenticator.logger.a.a("%s : one dt refresh required", "OneDTAuthenticator");
                            hVar2.k.set(true);
                        }
                        cVar.c.l();
                        return;
                    }
                }
            } catch (org.json.JSONException e) {
                com.digitalturbine.ignite.authenticator.events.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_BROADCAST_ERROR, e);
            }
        }
    }
}
