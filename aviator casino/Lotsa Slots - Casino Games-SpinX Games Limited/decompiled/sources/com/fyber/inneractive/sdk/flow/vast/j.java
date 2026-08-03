package com.fyber.inneractive.sdk.flow.vast;

/* loaded from: classes3.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.g gVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.network.t tVar;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode;
        com.fyber.inneractive.sdk.network.x xVar;
        com.fyber.inneractive.sdk.external.InneractiveErrorCode inneractiveErrorCode2;
        com.fyber.inneractive.sdk.network.t tVar2;
        java.util.Set<com.fyber.inneractive.sdk.model.vast.r> keySet;
        java.lang.String str;
        java.lang.String str2 = gVar.i;
        if ("VastErrorInvalidFile".equals(str2)) {
            inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_INVALID_RESPONSE;
            if (gVar.j != null) {
                xVar = new com.fyber.inneractive.sdk.network.x().a(gVar.j, "exception");
            }
            xVar = null;
        } else if ("ErrorNoCompatibleMediaFile".equals(str2)) {
            inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE;
            java.util.LinkedHashMap linkedHashMap = gVar.M;
            if (linkedHashMap != null && (keySet = linkedHashMap.keySet()) != null && keySet.size() > 0) {
                com.fyber.inneractive.sdk.network.x xVar2 = new com.fyber.inneractive.sdk.network.x();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (com.fyber.inneractive.sdk.model.vast.r rVar2 : keySet) {
                    try {
                        com.fyber.inneractive.sdk.flow.vast.f fVar = (com.fyber.inneractive.sdk.flow.vast.f) linkedHashMap.get(rVar2);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("url", rVar2.g);
                        jSONObject.put("bitrate", rVar2.e);
                        jSONObject.put("mime", android.text.TextUtils.isEmpty(rVar2.d) ? "na" : rVar2.d);
                        jSONObject.put(com.ironsource.C3300u.g, rVar2.f3811a);
                        com.fyber.inneractive.sdk.flow.vast.e eVar = fVar.f3763a;
                        jSONObject.put("reason", eVar != null ? eVar.value : 0);
                        jSONObject.put("required_value", fVar.b);
                        jSONArray.put(jSONObject);
                    } catch (org.json.JSONException unused) {
                        com.fyber.inneractive.sdk.util.IAlog.a("VastResponseValidator: Failed converting media file data to Extra data json!", new java.lang.Object[0]);
                    }
                }
                xVar2.a(jSONArray, "media_files");
                xVar = xVar2;
            }
            xVar = null;
        } else if ("VastErrorTooManyWrappers".equals(str2)) {
            inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_TOO_MANY_WRAPPERS;
            xVar = new com.fyber.inneractive.sdk.network.x().a(java.lang.Integer.valueOf(com.fyber.inneractive.sdk.config.IAConfigManager.N.i.b), com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX);
        } else {
            if ("ErrorNoMediaFiles".equals(str2)) {
                inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_NO_MEDIA_FILES;
            } else if ("ErrorConfigurationMismatch".equals(str2)) {
                inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
                tVar2 = com.fyber.inneractive.sdk.network.t.INTERNAL_CONFIG_MISMATCH;
            } else {
                if (!"VastErrorUnsecure".equals(str2)) {
                    tVar = null;
                    inneractiveErrorCode = null;
                    xVar = null;
                    if (tVar != null) {
                        org.json.JSONArray b = rVar == null ? null : rVar.b();
                        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
                        wVar.b = tVar;
                        wVar.f3860a = inneractiveAdRequest;
                        wVar.d = b;
                        if (xVar != null) {
                            wVar.f.put(xVar.f3861a);
                        }
                        wVar.a((java.lang.String) null);
                    }
                    if (gVar.n != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) {
                        java.util.ArrayList arrayList = gVar.N;
                        if (arrayList != null && arrayList.size() > 0) {
                            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_EVENT_COMPANION_FILTERED;
                            org.json.JSONArray b2 = rVar == null ? null : rVar.b();
                            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar);
                            wVar2.c = uVar;
                            wVar2.f3860a = inneractiveAdRequest;
                            wVar2.d = b2;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                com.fyber.inneractive.sdk.model.vast.h hVar = (com.fyber.inneractive.sdk.model.vast.h) it.next();
                                hVar.getClass();
                                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                try {
                                    jSONObject3.put("w", hVar.f3804a);
                                    jSONObject3.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, hVar.b);
                                    jSONObject3.put(com.ironsource.M6.K0, hVar.g);
                                    jSONObject3.put("clt", hVar.h);
                                    java.lang.String str3 = hVar.f;
                                    if (str3 != null) {
                                        jSONObject3.put("content", str3);
                                        str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F;
                                    } else {
                                        str = null;
                                    }
                                    com.fyber.inneractive.sdk.model.vast.l lVar = hVar.d;
                                    if (lVar != null) {
                                        jSONObject3.put("content", lVar.b);
                                        jSONObject3.put("creativeType", hVar.d.f3806a);
                                        str = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D;
                                    }
                                    if (!android.text.TextUtils.isEmpty(hVar.e)) {
                                        jSONObject3.put("content", hVar.e);
                                        str = "iFrameResource";
                                    }
                                    if (str != null) {
                                        jSONObject3.put("type", str);
                                    }
                                    com.fyber.inneractive.sdk.flow.vast.b bVar = hVar.i;
                                    if (bVar != null) {
                                        jSONObject3.put("reason", bVar.f3760a);
                                        jSONObject3.put("exception", hVar.i.getMessage());
                                    }
                                } catch (org.json.JSONException e) {
                                    com.fyber.inneractive.sdk.util.IAlog.a("Failed creating Companion json object: %s", e.getMessage());
                                    jSONObject3 = null;
                                }
                                jSONArray2.put(jSONObject3);
                            }
                            try {
                                jSONObject2.put("companion_data", jSONArray2);
                            } catch (java.lang.Exception unused2) {
                                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONArray2);
                            }
                            wVar2.f.put(jSONObject2);
                            wVar2.a((java.lang.String) null);
                        }
                        com.fyber.inneractive.sdk.model.vast.b bVar2 = gVar.L;
                        int size = bVar2 != null ? bVar2.g.size() : 0;
                        java.util.ArrayList arrayList2 = gVar.N;
                        int size2 = arrayList2 != null ? arrayList2.size() : 0;
                        com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.NUMBER_OF_COMPANIONS;
                        org.json.JSONArray b3 = rVar == null ? null : rVar.b();
                        com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar);
                        wVar3.c = uVar2;
                        wVar3.f3860a = inneractiveAdRequest;
                        wVar3.d = b3;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(size + size2);
                        try {
                            jSONObject4.put("number_of_endcards", valueOf);
                        } catch (java.lang.Exception unused3) {
                            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "number_of_endcards", valueOf);
                        }
                        wVar3.f.put(jSONObject4);
                        wVar3.a((java.lang.String) null);
                    }
                    if (gVar.L != null) {
                        com.fyber.inneractive.sdk.flow.vast.i iVar = new com.fyber.inneractive.sdk.flow.vast.i(gVar);
                        if (iVar.size() > 0) {
                            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
                            com.fyber.inneractive.sdk.network.u uVar3 = com.fyber.inneractive.sdk.network.u.OMID_VAST_DETECTION;
                            org.json.JSONArray b4 = rVar == null ? null : rVar.b();
                            com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar);
                            wVar4.c = uVar3;
                            wVar4.f3860a = inneractiveAdRequest;
                            wVar4.d = b4;
                            java.util.Iterator it2 = iVar.iterator();
                            while (it2.hasNext()) {
                                com.fyber.inneractive.sdk.measurement.h hVar2 = (com.fyber.inneractive.sdk.measurement.h) it2.next();
                                hVar2.getClass();
                                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                                try {
                                    jSONObject6.put("success", java.lang.String.valueOf(hVar2.b()));
                                    if (!hVar2.b()) {
                                        jSONObject6.put("error_reason", hVar2.a());
                                    }
                                } catch (org.json.JSONException unused4) {
                                    jSONObject6 = null;
                                }
                                if (jSONObject6 != null) {
                                    jSONArray3.put(jSONObject6);
                                }
                            }
                            try {
                                jSONObject5.put("verifications", jSONArray3);
                            } catch (java.lang.Exception unused5) {
                                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "verifications", jSONArray3);
                            }
                            wVar4.f.put(jSONObject5);
                            wVar4.a((java.lang.String) null);
                        }
                    }
                    return inneractiveErrorCode;
                }
                inneractiveErrorCode2 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SERVER_INVALID_RESPONSE;
                tVar2 = com.fyber.inneractive.sdk.network.t.VAST_ERROR_UNSECURE_URL;
            }
            xVar = null;
        }
        com.fyber.inneractive.sdk.network.t tVar3 = tVar2;
        inneractiveErrorCode = inneractiveErrorCode2;
        tVar = tVar3;
        if (tVar != null) {
        }
        if (gVar.n != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.NATIVE) {
        }
        if (gVar.L != null) {
        }
        return inneractiveErrorCode;
    }
}
