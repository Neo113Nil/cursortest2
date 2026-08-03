package com.fyber.inneractive.sdk.config.remote;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.remote.a f3630a;
    public java.util.List b = null;
    public java.lang.String c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.config.remote.e a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.remote.a aVar;
        org.json.JSONArray jSONArray;
        java.lang.String str;
        com.fyber.inneractive.sdk.config.remote.e eVar;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        com.fyber.inneractive.sdk.config.remote.e eVar2;
        java.lang.String str4;
        org.json.JSONArray jSONArray2;
        com.fyber.inneractive.sdk.config.remote.g gVar;
        java.lang.String str5 = null;
        java.lang.String optString = jSONObject.optString("updateHash", null);
        if (android.text.TextUtils.isEmpty(optString)) {
            return null;
        }
        com.fyber.inneractive.sdk.config.remote.e eVar3 = new com.fyber.inneractive.sdk.config.remote.e();
        eVar3.c = optString;
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("app");
        int optInt = optJSONObject == null ? -1 : optJSONObject.optInt("id", -1);
        java.lang.String str6 = "isActive";
        if (optInt == -1) {
            aVar = null;
        } else {
            aVar = new com.fyber.inneractive.sdk.config.remote.a();
            aVar.f3628a = java.lang.String.valueOf(optInt);
            aVar.b = optJSONObject.optString("publisherId", null);
            aVar.c = com.fyber.inneractive.sdk.config.remote.f.a(optJSONObject.optJSONObject("monitor"));
            aVar.d = com.fyber.inneractive.sdk.config.remote.j.a(optJSONObject.optJSONObject("video"));
            aVar.e = com.fyber.inneractive.sdk.config.remote.b.a(optJSONObject.optJSONObject("display"));
            aVar.f = com.fyber.inneractive.sdk.config.remote.k.a(optJSONObject.optJSONObject("viewability"));
            aVar.g = optJSONObject.optString("isActive", null);
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("native");
            if (optJSONObject2 != null) {
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(optJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar3.f3630a = aVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("spots");
        if (optJSONArray != null) {
            int i = 0;
            while (i < optJSONArray.length()) {
                org.json.JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    java.lang.String optString2 = optJSONObject3.optString("id", str5);
                    if (!android.text.TextUtils.isEmpty(optString2)) {
                        com.fyber.inneractive.sdk.config.remote.h hVar = new com.fyber.inneractive.sdk.config.remote.h();
                        hVar.f3632a = optString2;
                        hVar.b = optJSONObject3.optString(str6, str5);
                        hVar.c = com.fyber.inneractive.sdk.config.remote.b.a(optJSONObject3.optJSONObject("display"));
                        hVar.d = com.fyber.inneractive.sdk.config.remote.f.a(optJSONObject3.optJSONObject("monitor"));
                        org.json.JSONObject optJSONObject4 = optJSONObject3.optJSONObject("native");
                        if (optJSONObject4 != null) {
                            com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(optJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.e = com.fyber.inneractive.sdk.config.remote.j.a(optJSONObject3.optJSONObject("video"));
                        hVar.f = com.fyber.inneractive.sdk.config.remote.k.a(optJSONObject3.optJSONObject("viewability"));
                        org.json.JSONArray optJSONArray2 = optJSONObject3.optJSONArray("units");
                        if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                            jSONArray = optJSONArray;
                            str = str5;
                            eVar = eVar3;
                            str2 = str6;
                            arrayList = new java.util.ArrayList();
                        } else {
                            arrayList = new java.util.ArrayList();
                            jSONArray = optJSONArray;
                            int i2 = 0;
                            while (i2 < optJSONArray2.length()) {
                                org.json.JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject5 != null) {
                                    str4 = str6;
                                    com.fyber.inneractive.sdk.config.remote.i iVar = new com.fyber.inneractive.sdk.config.remote.i();
                                    eVar2 = eVar3;
                                    jSONArray2 = optJSONArray2;
                                    iVar.f3633a = optJSONObject5.optString("id", null);
                                    iVar.b = optJSONObject5.optString("spotId", null);
                                    iVar.c = com.fyber.inneractive.sdk.config.remote.b.a(optJSONObject5.optJSONObject("display"));
                                    iVar.d = com.fyber.inneractive.sdk.config.remote.f.a(optJSONObject5.optJSONObject("monitor"));
                                    org.json.JSONObject optJSONObject6 = optJSONObject5.optJSONObject("native");
                                    if (optJSONObject6 != null) {
                                        com.fyber.inneractive.sdk.config.remote.g gVar2 = new com.fyber.inneractive.sdk.config.remote.g();
                                        if (com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(optJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                            iVar.e = gVar;
                                            iVar.f = com.fyber.inneractive.sdk.config.remote.j.a(optJSONObject5.optJSONObject("video"));
                                            iVar.g = com.fyber.inneractive.sdk.config.remote.k.a(optJSONObject5.optJSONObject("viewability"));
                                            arrayList.add(iVar);
                                        }
                                    }
                                    gVar = null;
                                    iVar.e = gVar;
                                    iVar.f = com.fyber.inneractive.sdk.config.remote.j.a(optJSONObject5.optJSONObject("video"));
                                    iVar.g = com.fyber.inneractive.sdk.config.remote.k.a(optJSONObject5.optJSONObject("viewability"));
                                    arrayList.add(iVar);
                                } else {
                                    eVar2 = eVar3;
                                    str4 = str6;
                                    jSONArray2 = optJSONArray2;
                                }
                                i2++;
                                eVar3 = eVar2;
                                str6 = str4;
                                optJSONArray2 = jSONArray2;
                            }
                            eVar = eVar3;
                            str2 = str6;
                            str = null;
                        }
                        hVar.g = arrayList;
                        str3 = hVar;
                        if (str3 == null) {
                            arrayList2.add(str3);
                        }
                        i++;
                        str5 = str;
                        eVar3 = eVar;
                        optJSONArray = jSONArray;
                        str6 = str2;
                    }
                }
                jSONArray = optJSONArray;
                java.lang.String str7 = str5;
                str = str7;
                eVar = eVar3;
                str2 = str6;
                str3 = str7;
                if (str3 == null) {
                }
                i++;
                str5 = str;
                eVar3 = eVar;
                optJSONArray = jSONArray;
                str6 = str2;
            }
        }
        com.fyber.inneractive.sdk.config.remote.e eVar4 = eVar3;
        eVar4.b = arrayList2;
        return eVar4;
    }
}
