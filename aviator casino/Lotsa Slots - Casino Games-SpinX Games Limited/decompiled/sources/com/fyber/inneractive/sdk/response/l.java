package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public final class l extends com.fyber.inneractive.sdk.response.b {
    public com.fyber.inneractive.sdk.response.nativead.j e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(java.lang.String str, com.fyber.inneractive.sdk.config.r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f4250a == null || (jVar = this.e) == null) {
            throw new java.lang.Exception("Missing response ".concat(this.f4250a == null ? "data" : "data native"));
        }
        if (r0Var == null) {
            jVar.i = "ErrorConfigurationMismatch";
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.e.i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i a2 = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.e.Q;
            kVar.K = a2;
            if (kVar.d()) {
                a(this.e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e) {
            if (e.getCause() != null) {
                this.e.i = e.getCause().getMessage();
            }
            this.e.j = e.getMessage();
            throw e;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e2) {
            if (e2.getCause() != null) {
                this.e.i = e2.getCause().getMessage();
            }
            this.e.j = e2.getMessage();
            com.fyber.inneractive.sdk.util.IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e2.getMessage());
            throw e2;
        } catch (java.lang.Exception e3) {
            this.e.j = e3.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.e;
            jVar2.i = "ErrorInvalidNativeOrtbObject";
            jVar2.w = e3;
            com.fyber.inneractive.sdk.util.IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e3.getMessage());
            if (com.fyber.inneractive.sdk.util.IAlog.f4283a == 2) {
                e3.printStackTrace();
            }
            throw e3;
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.config.r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e c = jVar.Q.c();
        java.lang.String str = c != null ? c.f4257a : null;
        if (str != null && !str.isEmpty()) {
            com.fyber.inneractive.sdk.response.d dVar = new com.fyber.inneractive.sdk.response.d(false);
            dVar.f4250a = new com.fyber.inneractive.sdk.response.g();
            dVar.e = this.e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    public static com.fyber.inneractive.sdk.response.nativead.i a(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("assets") && !jSONObject.isNull("assets")) {
                if (jSONObject.has("link") && !jSONObject.isNull("link")) {
                    org.json.JSONArray optJSONArray = jSONObject.optJSONArray("assets");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (optJSONArray != null) {
                        boolean z = false;
                        boolean z2 = false;
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                com.fyber.inneractive.sdk.response.nativead.f fVar = new com.fyber.inneractive.sdk.response.nativead.f();
                                fVar.f4258a = optJSONObject.optInt("id");
                                optJSONObject.optInt("required");
                                fVar.f = com.fyber.inneractive.sdk.response.nativead.parser.c.a(optJSONObject.optJSONObject("link"));
                                if (optJSONObject.has("title")) {
                                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("title");
                                    com.fyber.inneractive.sdk.response.nativead.d dVar = new com.fyber.inneractive.sdk.response.nativead.d();
                                    if (optJSONObject2 != null) {
                                        dVar.f4256a = com.fyber.inneractive.sdk.util.v.a(optJSONObject2, "text");
                                        optJSONObject2.optInt("len");
                                    }
                                    fVar.b = dVar;
                                } else if (optJSONObject.has("video")) {
                                    if (!z) {
                                        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("video");
                                        com.fyber.inneractive.sdk.response.nativead.e eVar = new com.fyber.inneractive.sdk.response.nativead.e();
                                        if (optJSONObject3 != null) {
                                            eVar.f4257a = com.fyber.inneractive.sdk.util.v.a(optJSONObject3, "vasttag");
                                        }
                                        fVar.c = eVar;
                                        z = !android.text.TextUtils.isEmpty(eVar.f4257a);
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("img")) {
                                    int i2 = fVar.f4258a;
                                    boolean z3 = i2 == 2;
                                    if ((!z3 || !z) && (z3 || !z2)) {
                                        org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("img");
                                        com.fyber.inneractive.sdk.response.nativead.c cVar = new com.fyber.inneractive.sdk.response.nativead.c();
                                        if (optJSONObject4 != null) {
                                            optJSONObject4.optInt("width");
                                            optJSONObject4.optInt("height");
                                            cVar.f4255a = com.fyber.inneractive.sdk.util.v.a(optJSONObject4, "url");
                                        }
                                        if (i2 == 2) {
                                            z = !android.text.TextUtils.isEmpty(cVar.f4255a);
                                        } else if (i2 == 4) {
                                            z2 = !android.text.TextUtils.isEmpty(cVar.f4255a);
                                        }
                                        fVar.d = cVar;
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("data")) {
                                    org.json.JSONObject optJSONObject5 = optJSONObject.optJSONObject("data");
                                    com.fyber.inneractive.sdk.response.nativead.b bVar = new com.fyber.inneractive.sdk.response.nativead.b();
                                    if (optJSONObject5 != null) {
                                        bVar.f4254a = com.fyber.inneractive.sdk.util.v.a(optJSONObject5, "value");
                                    }
                                    fVar.e = bVar;
                                }
                                if (fVar != null) {
                                    arrayList.add(fVar);
                                }
                            }
                        }
                        if (!z) {
                            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing valid main asset (video/image)", "ErrorNoMainAsset");
                        }
                    }
                    com.fyber.inneractive.sdk.response.nativead.h a2 = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObject.optJSONObject("link"));
                    if (!android.text.TextUtils.isEmpty(a2.f4260a)) {
                        java.lang.String a3 = com.fyber.inneractive.sdk.util.v.a(jSONObject, "jstracker");
                        com.fyber.inneractive.sdk.util.v.a(jSONObject, com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
                        java.util.ArrayList a4 = com.fyber.inneractive.sdk.response.nativead.parser.b.a(jSONObject.optJSONArray("imptrackers"));
                        java.util.ArrayList a5 = com.fyber.inneractive.sdk.response.nativead.parser.a.a(jSONObject.optJSONArray("eventtrackers"));
                        com.fyber.inneractive.sdk.response.nativead.i iVar = new com.fyber.inneractive.sdk.response.nativead.i();
                        iVar.f4261a = arrayList;
                        iVar.b = a2;
                        iVar.d = a3;
                        iVar.c = a4;
                        iVar.e = a5;
                        return iVar;
                    }
                    throw new com.fyber.inneractive.sdk.response.nativead.a("Missing url in main link object", "ErrorNoMainLink");
                }
                throw new com.fyber.inneractive.sdk.response.nativead.a("Missing main link object", "ErrorNoMainLink");
            }
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing assets", "ErrorNoAssets");
        }
        throw new com.fyber.inneractive.sdk.response.nativead.a("Empty native body", "ErrorNoNativeBody");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final com.fyber.inneractive.sdk.response.e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f4250a = jVar;
        this.e = jVar;
        return jVar;
    }
}
