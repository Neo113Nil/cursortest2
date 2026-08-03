package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f4287a = null;
    public final /* synthetic */ com.fyber.inneractive.sdk.web.e b;

    public d(com.fyber.inneractive.sdk.web.e eVar) {
        this.b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.e eVar = this.b;
        java.lang.Object[] objArr = this.f4287a;
        eVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = eVar.g;
        if (eVar.h) {
            com.fyber.inneractive.sdk.web.i iVar = eVar.l;
            java.lang.String str2 = eVar.i;
            java.lang.String str3 = eVar.j;
            com.fyber.inneractive.sdk.web.i1 i1Var = (com.fyber.inneractive.sdk.web.i1) iVar;
            i1Var.getClass();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<html><title>DigitalTurbine Ad</title><head><link rel=\"icon\" href=\"data:,\">");
            if (android.text.TextUtils.isEmpty(str)) {
                com.fyber.inneractive.sdk.util.IAlog.a("loadHtml called with an empty HTML!", new java.lang.Object[0]);
            } else {
                if (i1Var.F) {
                    java.lang.String b = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
                    if (!android.text.TextUtils.isEmpty(b)) {
                        sb.append(b);
                    }
                }
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
                boolean a2 = iAConfigManager.t.b.a(false, "use_js_inline");
                if (!a2 || iAConfigManager.E.b == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/dt-mraid-video-controller.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.E.b);
                    sb.append("</script>");
                }
                if (!android.text.TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script></head><style>body{text-align:center !important;margin:0;padding:0;}");
                if (!android.text.TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                }
                sb.append("</style><body id=\"iaBody\">");
                if (i1Var.B && i1Var.m()) {
                    if (!a2 || iAConfigManager.E.c == null) {
                        sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                    } else {
                        sb.append("<style type=\"text/css\">");
                        sb.append(iAConfigManager.E.c);
                        sb.append("</style>");
                    }
                    if (!a2 || iAConfigManager.E.d == null) {
                        sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                    } else {
                        sb.append("<script type=\"text/javascript\">");
                        sb.append(iAConfigManager.E.d);
                        sb.append("</script>");
                    }
                }
                java.lang.String b2 = com.fyber.inneractive.sdk.util.o.b("ia_mraid_bridge.txt");
                if (!android.text.TextUtils.isEmpty(b2)) {
                    sb.append("<div id='iaScriptBr' style='display:none;'>");
                    sb.append(b2);
                    sb.append("</div>");
                    if (com.fyber.inneractive.sdk.util.IAlog.f4283a >= 2) {
                        sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb.append(str);
                sb.append("</body></html>");
                com.fyber.inneractive.sdk.measurement.e eVar2 = i1Var.H;
                if (eVar2 != null) {
                    com.fyber.inneractive.sdk.flow.x xVar = i1Var.s;
                    if (xVar != null) {
                        com.fyber.inneractive.sdk.response.e eVar3 = xVar.b;
                        boolean z = eVar3 != null && eVar3.G;
                        java.lang.String sb2 = sb.toString();
                        if (z) {
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                            if (!android.text.TextUtils.isEmpty(eVar2.c)) {
                                sb3.append(eVar2.c);
                            }
                            if (!android.text.TextUtils.isEmpty(eVar2.d)) {
                                sb3.append(eVar2.d);
                            }
                            sb2 = com.iab.omid.library.fyber.ScriptInjector.injectScriptContentIntoHtml(sb3.toString(), sb2);
                        }
                        str = !android.text.TextUtils.isEmpty(eVar2.b) ? com.iab.omid.library.fyber.ScriptInjector.injectScriptContentIntoHtml(eVar2.b, sb2) : sb2;
                    }
                } else {
                    str = sb.toString();
                }
            }
            str = null;
        }
        com.fyber.inneractive.sdk.web.i iVar2 = eVar.l;
        iVar2.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sbuild html string took %d msec", com.fyber.inneractive.sdk.util.IAlog.a(iVar2), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.fyber.inneractive.sdk.web.e eVar4 = this.b;
        if (eVar4.f) {
            return;
        }
        eVar4.c = new com.fyber.inneractive.sdk.util.e(eVar4, str);
        eVar4.a().post(this.b.c);
    }
}
