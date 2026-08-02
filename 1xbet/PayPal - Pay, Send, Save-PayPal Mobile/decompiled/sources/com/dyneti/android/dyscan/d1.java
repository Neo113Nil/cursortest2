package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class d1 extends okhttp3.WebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.WebSocket f3297a;

    public d1() {
        java.lang.String str = (java.lang.String) kotlin.text.StringsKt.split$default((java.lang.CharSequence) "https://api.dyneti.com", new java.lang.String[]{"//"}, false, 0, 6, (java.lang.Object) null).get(1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("wss:///");
        sb.append(str);
        sb.append("/ws?token=");
        sb.append(com.dyneti.android.dyscan.DyScan.f3281a);
        this.f3297a = com.dyneti.android.dyscan.DyScan.e.newWebSocket(new okhttp3.Request.Builder().url(sb.toString()).build(), this);
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(okhttp3.WebSocket webSocket, java.lang.Throwable th, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        super.onFailure(webSocket, th, response);
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(okhttp3.WebSocket webSocket, java.lang.String str) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        super.onMessage(webSocket, str);
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null || !jSONObject.has("ping")) {
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("pong", jSONObject.get("ping"));
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
        webSocket.send(jSONObject3);
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(okhttp3.WebSocket webSocket, okhttp3.Response response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        super.onOpen(webSocket, response);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("buildVersion", "1.7.23");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        webSocket.send(jSONObject2);
    }
}
