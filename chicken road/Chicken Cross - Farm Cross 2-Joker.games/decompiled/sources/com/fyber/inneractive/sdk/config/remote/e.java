package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public a f5281a;
    public List b = null;
    public String c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(JSONObject jSONObject) {
        a aVar;
        JSONArray jSONArray;
        String str;
        e eVar;
        String str2;
        String str3;
        ArrayList arrayList;
        e eVar2;
        String str4;
        JSONArray jSONArray2;
        g gVar;
        String str5 = null;
        String optString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        e eVar3 = new e();
        eVar3.c = optString;
        JSONObject optJSONObject = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        int optInt = optJSONObject == null ? -1 : optJSONObject.optInt("id", -1);
        String str6 = "isActive";
        if (optInt == -1) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.f5279a = String.valueOf(optInt);
            aVar.b = optJSONObject.optString("publisherId", null);
            aVar.c = f.a(optJSONObject.optJSONObject("monitor"));
            aVar.d = j.a(optJSONObject.optJSONObject("video"));
            aVar.e = b.a(optJSONObject.optJSONObject("display"));
            aVar.f = k.a(optJSONObject.optJSONObject("viewability"));
            aVar.g = optJSONObject.optString("isActive", null);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("native");
            if (optJSONObject2 != null) {
                UnitDisplayType.fromValue(optJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar3.f5281a = aVar;
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("spots");
        if (optJSONArray != null) {
            int i = 0;
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    String optString2 = optJSONObject3.optString("id", str5);
                    if (!TextUtils.isEmpty(optString2)) {
                        h hVar = new h();
                        hVar.f5283a = optString2;
                        hVar.b = optJSONObject3.optString(str6, str5);
                        hVar.c = b.a(optJSONObject3.optJSONObject("display"));
                        hVar.d = f.a(optJSONObject3.optJSONObject("monitor"));
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("native");
                        if (optJSONObject4 != null) {
                            UnitDisplayType.fromValue(optJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.e = j.a(optJSONObject3.optJSONObject("video"));
                        hVar.f = k.a(optJSONObject3.optJSONObject("viewability"));
                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("units");
                        if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                            jSONArray = optJSONArray;
                            str = str5;
                            eVar = eVar3;
                            str2 = str6;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            jSONArray = optJSONArray;
                            int i2 = 0;
                            while (i2 < optJSONArray2.length()) {
                                JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i2);
                                if (optJSONObject5 != null) {
                                    str4 = str6;
                                    i iVar = new i();
                                    eVar2 = eVar3;
                                    jSONArray2 = optJSONArray2;
                                    iVar.f5284a = optJSONObject5.optString("id", null);
                                    iVar.b = optJSONObject5.optString("spotId", null);
                                    iVar.c = b.a(optJSONObject5.optJSONObject("display"));
                                    iVar.d = f.a(optJSONObject5.optJSONObject("monitor"));
                                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("native");
                                    if (optJSONObject6 != null) {
                                        g gVar2 = new g();
                                        if (UnitDisplayType.fromValue(optJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                            iVar.e = gVar;
                                            iVar.f = j.a(optJSONObject5.optJSONObject("video"));
                                            iVar.g = k.a(optJSONObject5.optJSONObject("viewability"));
                                            arrayList.add(iVar);
                                        }
                                    }
                                    gVar = null;
                                    iVar.e = gVar;
                                    iVar.f = j.a(optJSONObject5.optJSONObject("video"));
                                    iVar.g = k.a(optJSONObject5.optJSONObject("viewability"));
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
                String str7 = str5;
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
        e eVar4 = eVar3;
        eVar4.b = arrayList2;
        return eVar4;
    }
}
