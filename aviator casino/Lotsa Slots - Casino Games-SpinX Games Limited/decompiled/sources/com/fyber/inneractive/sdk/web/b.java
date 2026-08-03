package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class b extends com.fyber.inneractive.sdk.web.i1 {
    public final com.fyber.inneractive.sdk.flow.endcard.q N;

    public b(com.fyber.inneractive.sdk.flow.endcard.q qVar, boolean z) {
        super(z, com.fyber.inneractive.sdk.web.c0.INTERSTITIAL, null);
        this.N = qVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x007c, code lost:
    
        if (r5.equals("success") == false) goto L21;
     */
    @Override // com.fyber.inneractive.sdk.web.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(java.lang.String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        java.lang.String str2;
        char c = 0;
        if (str != null) {
            java.util.Locale locale = java.util.Locale.US;
            if (str.toLowerCase(locale).startsWith("fmpendcard://".toLowerCase(locale))) {
                com.fyber.inneractive.sdk.flow.endcard.q qVar = this.N;
                if (qVar != null) {
                    com.fyber.inneractive.sdk.web.g gVar = this.f;
                    com.fyber.inneractive.sdk.web.j1 j1Var = this.g;
                    android.net.Uri parse = android.net.Uri.parse(str);
                    java.lang.String authority = parse != null ? parse.getAuthority() : null;
                    if (!android.text.TextUtils.isEmpty(authority)) {
                        authority.getClass();
                        authority.hashCode();
                        switch (authority.hashCode()) {
                            case -1867169789:
                                break;
                            case -1086574198:
                                if (authority.equals(com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 94750088:
                                if (authority.equals(com.ironsource.Y3.d)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                java.lang.String queryParameter = parse.getQueryParameter("version");
                                if (!android.text.TextUtils.isEmpty(queryParameter)) {
                                    qVar.c = queryParameter;
                                }
                                com.fyber.inneractive.sdk.web.g gVar2 = this.f;
                                if (gVar2 != null) {
                                    gVar2.a(this);
                                    break;
                                }
                                break;
                            case 1:
                                java.lang.String queryParameter2 = parse.getQueryParameter("version");
                                if (!android.text.TextUtils.isEmpty(queryParameter2)) {
                                    qVar.c = queryParameter2;
                                }
                                java.lang.String queryParameter3 = parse.getQueryParameter("error");
                                if (gVar != null) {
                                    com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                                    if (!android.text.TextUtils.isEmpty(queryParameter3)) {
                                        inneractiveInfrastructureError.setCause(new java.lang.Exception(queryParameter3));
                                    }
                                    gVar.a(this, inneractiveInfrastructureError);
                                    break;
                                }
                                break;
                            case 2:
                                if (j1Var != null) {
                                    com.fyber.inneractive.sdk.model.vast.b bVar = qVar.b;
                                    com.fyber.inneractive.sdk.flow.endcard.k kVar = bVar.o;
                                    if (kVar != null) {
                                        com.fyber.inneractive.sdk.flow.endcard.b a2 = kVar.b.a();
                                        str2 = kVar.f3688a.e.b;
                                        com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                                        if (cVar == null && (cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Html)) == null && (cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe)) == null) {
                                            cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                                        }
                                        if (a2 != null && a2.j() && cVar != null) {
                                            java.lang.String str3 = cVar.g.g;
                                            if (!android.text.TextUtils.isEmpty(str3)) {
                                                str2 = str3;
                                            }
                                        }
                                    } else {
                                        str2 = bVar.b;
                                    }
                                    j1Var.a(str2, g1Var);
                                    break;
                                }
                                break;
                        }
                    } else if (gVar != null) {
                        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError2 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.COULD_NOT_LOAD_FMP_ENDCARD_TO_WEBVIEW);
                        if (!android.text.TextUtils.isEmpty("empty type")) {
                            inneractiveInfrastructureError2.setCause(new java.lang.Exception("empty type"));
                        }
                        gVar.a(this, inneractiveInfrastructureError2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void d() {
        if (this.N == null || this.f == null) {
            return;
        }
        this.f.a(this, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR));
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.measurement.tracker.e f() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a(android.webkit.WebView webView) {
        java.lang.String str;
        if (webView == null || this.N == null) {
            return;
        }
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        com.fyber.inneractive.sdk.flow.endcard.q qVar = this.N;
        com.fyber.inneractive.sdk.flow.endcard.p pVar = (com.fyber.inneractive.sdk.flow.endcard.p) qVar.d.f();
        pVar.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, "name", pVar.j);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.lang.String str2 = pVar.k;
            if (!android.text.TextUtils.isEmpty(str2)) {
                jSONArray.put(str2);
            }
            com.fyber.inneractive.sdk.util.c1.a(jSONObject, "icons", jSONArray);
            str = jSONObject.toString();
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s FMP End-Card JSON error: %s", e, pVar.f3682a, e.getMessage());
            str = null;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.util.IAlog.f("%s FMP End-Card JSON required", qVar.f3698a);
            return;
        }
        com.fyber.inneractive.sdk.util.q0.a(webView, "loadAssets(" + str + ");");
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public final void a() {
        super.a();
        if (this.f != null) {
            this.f.a(this, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.WEBVIEW_FMP_ENDCARD_ERROR, new com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError()));
        }
    }
}
