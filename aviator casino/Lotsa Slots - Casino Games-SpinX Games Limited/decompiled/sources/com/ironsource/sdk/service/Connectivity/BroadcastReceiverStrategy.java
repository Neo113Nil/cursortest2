package com.ironsource.sdk.service.Connectivity;

/* loaded from: classes5.dex */
public class BroadcastReceiverStrategy implements com.ironsource.InterfaceC3254r7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3272s7 f6720a;
    private android.content.BroadcastReceiver b = new android.content.BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            java.lang.String b = com.ironsource.U3.b(context);
            if (b.equals("none")) {
                com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.this.f6720a.a();
            } else {
                com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.this.f6720a.a(b, new org.json.JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(com.ironsource.InterfaceC3272s7 interfaceC3272s7) {
        this.f6720a = interfaceC3272s7;
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void a(android.content.Context context) {
        try {
            context.unregisterReceiver(this.b);
        } catch (java.lang.IllegalArgumentException e) {
            com.ironsource.C3180n4.d().a(e);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            android.util.Log.e("ContentValues", "unregisterConnectionReceiver - " + e2);
        }
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void b(android.content.Context context) {
        try {
            context.registerReceiver(this.b, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3254r7
    public org.json.JSONObject c(android.content.Context context) {
        return new org.json.JSONObject();
    }

    @Override // com.ironsource.InterfaceC3254r7
    public void a() {
        this.b = null;
    }
}
