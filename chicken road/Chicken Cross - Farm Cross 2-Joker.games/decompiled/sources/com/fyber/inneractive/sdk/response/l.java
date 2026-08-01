package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l extends b {
    public com.fyber.inneractive.sdk.response.nativead.j e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, w0 w0Var) {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f5907a == null || (jVar = this.e) == null) {
            throw new Exception("Missing response ".concat(this.f5907a == null ? "data" : "data native"));
        }
        if (w0Var == null) {
            jVar.i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.e.i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i a2 = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.e.S;
            kVar.M = a2;
            if (kVar.d()) {
                a(this.e, w0Var);
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
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e2.getMessage());
            throw e2;
        } catch (Exception e3) {
            this.e.j = e3.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.e;
            jVar2.i = "ErrorInvalidNativeOrtbObject";
            jVar2.w = e3;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e3.getMessage());
            if (IAlog.f5940a == 2) {
                e3.printStackTrace();
            }
            throw e3;
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, w0 w0Var) {
        com.fyber.inneractive.sdk.response.nativead.e c = jVar.S.c();
        String str = c != null ? c.f5914a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.f5907a = new g();
            dVar.e = this.e;
            dVar.a(str, w0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    public static com.fyber.inneractive.sdk.response.nativead.i a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("assets") && !jSONObject.isNull("assets")) {
                if (jSONObject.has("link") && !jSONObject.isNull("link")) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("assets");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        boolean z = false;
                        boolean z2 = false;
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                com.fyber.inneractive.sdk.response.nativead.f fVar = new com.fyber.inneractive.sdk.response.nativead.f();
                                fVar.f5915a = optJSONObject.optInt("id");
                                optJSONObject.optInt("required");
                                fVar.f = com.fyber.inneractive.sdk.response.nativead.parser.c.a(optJSONObject.optJSONObject("link"));
                                if (optJSONObject.has("title")) {
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("title");
                                    com.fyber.inneractive.sdk.response.nativead.d dVar = new com.fyber.inneractive.sdk.response.nativead.d();
                                    if (optJSONObject2 != null) {
                                        dVar.f5913a = v.a(optJSONObject2, "text");
                                        optJSONObject2.optInt("len");
                                    }
                                    fVar.b = dVar;
                                } else if (optJSONObject.has("video")) {
                                    if (!z) {
                                        JSONObject optJSONObject3 = optJSONObject.optJSONObject("video");
                                        com.fyber.inneractive.sdk.response.nativead.e eVar = new com.fyber.inneractive.sdk.response.nativead.e();
                                        if (optJSONObject3 != null) {
                                            eVar.f5914a = v.a(optJSONObject3, "vasttag");
                                        }
                                        fVar.c = eVar;
                                        z = !TextUtils.isEmpty(eVar.f5914a);
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("img")) {
                                    int i2 = fVar.f5915a;
                                    boolean z3 = i2 == 2;
                                    if ((!z3 || !z) && (z3 || !z2)) {
                                        JSONObject optJSONObject4 = optJSONObject.optJSONObject("img");
                                        com.fyber.inneractive.sdk.response.nativead.c cVar = new com.fyber.inneractive.sdk.response.nativead.c();
                                        if (optJSONObject4 != null) {
                                            optJSONObject4.optInt("width");
                                            optJSONObject4.optInt("height");
                                            cVar.f5912a = v.a(optJSONObject4, "url");
                                        }
                                        if (i2 == 2) {
                                            z = !TextUtils.isEmpty(cVar.f5912a);
                                        } else if (i2 == 4) {
                                            z2 = !TextUtils.isEmpty(cVar.f5912a);
                                        }
                                        fVar.d = cVar;
                                    }
                                    fVar = null;
                                } else if (optJSONObject.has("data")) {
                                    JSONObject optJSONObject5 = optJSONObject.optJSONObject("data");
                                    com.fyber.inneractive.sdk.response.nativead.b bVar = new com.fyber.inneractive.sdk.response.nativead.b();
                                    if (optJSONObject5 != null) {
                                        bVar.f5911a = v.a(optJSONObject5, "value");
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
                    if (!TextUtils.isEmpty(a2.f5917a)) {
                        String a3 = v.a(jSONObject, "jstracker");
                        v.a(jSONObject, ShareConstants.WEB_DIALOG_PARAM_PRIVACY);
                        ArrayList a4 = com.fyber.inneractive.sdk.response.nativead.parser.b.a(jSONObject.optJSONArray("imptrackers"));
                        ArrayList a5 = com.fyber.inneractive.sdk.response.nativead.parser.a.a(jSONObject.optJSONArray("eventtrackers"));
                        com.fyber.inneractive.sdk.response.nativead.i iVar = new com.fyber.inneractive.sdk.response.nativead.i();
                        iVar.f5918a = arrayList;
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
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f5907a = jVar;
        this.e = jVar;
        return jVar;
    }
}
