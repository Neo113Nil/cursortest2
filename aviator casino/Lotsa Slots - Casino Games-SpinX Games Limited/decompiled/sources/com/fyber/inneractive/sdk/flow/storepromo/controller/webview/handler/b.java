package com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a f3736a;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a aVar) {
        this.f3736a = aVar;
    }

    public final void a(java.lang.String str, java.util.HashMap hashMap, com.fyber.inneractive.sdk.util.g1 g1Var) {
        str.getClass();
        str.hashCode();
        switch (str) {
            case "onClick":
                java.lang.String str2 = (java.lang.String) hashMap.get("clickAction");
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        this.f3736a.a(java.lang.Integer.parseInt(str2), g1Var);
                        break;
                    } catch (java.lang.NumberFormatException e) {
                        com.fyber.inneractive.sdk.util.IAlog.b("WebviewCommandHandlerBase: handleClick: exception: %s" + e, new java.lang.Object[0]);
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.util.IAlog.a("WebviewCommandHandlerBase: handleClick: no click action in params for click cmd", new java.lang.Object[0]);
                    break;
                }
                break;
            case "onError":
                this.f3736a.a(hashMap);
                break;
            case "DOMLoaded":
                this.f3736a.a();
                break;
            default:
                com.fyber.inneractive.sdk.util.IAlog.f("Sent unknown command: %s", str);
                break;
        }
        this.f3736a.b();
    }
}
