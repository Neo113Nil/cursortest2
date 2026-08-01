package com.fyber.inneractive.sdk.flow.storepromo.controller.webview.handler;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a f5389a;

    public b(com.fyber.inneractive.sdk.flow.storepromo.controller.webview.bridge.a aVar) {
        this.f5389a = aVar;
    }

    public final void a(String str, HashMap hashMap, g1 g1Var) {
        str.getClass();
        str.hashCode();
        switch (str) {
            case "onClick":
                String str2 = (String) hashMap.get("clickAction");
                if (str2 != null && !str2.isEmpty()) {
                    try {
                        this.f5389a.a(Integer.parseInt(str2), g1Var);
                        break;
                    } catch (NumberFormatException e) {
                        IAlog.b("WebviewCommandHandlerBase: handleClick: exception: %s" + e, new Object[0]);
                        break;
                    }
                } else {
                    IAlog.a("WebviewCommandHandlerBase: handleClick: no click action in params for click cmd", new Object[0]);
                    break;
                }
                break;
            case "onError":
                this.f5389a.a(hashMap);
                break;
            case "DOMLoaded":
                this.f5389a.a();
                break;
            default:
                IAlog.f("Sent unknown command: %s", str);
                break;
        }
        this.f5389a.b();
    }
}
