package com.facebook.appevents.cloudbridge;

import android.content.SharedPreferences;
import com.facebook.E;
import com.facebook.G;
import com.facebook.internal.u;
import com.facebook.t;
import com.facebook.w;
import com.facebook.z;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements z.b {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x008d, code lost:
    
        r10 = new java.net.URL(java.lang.String.valueOf(r3.get("endpoint")));
        com.facebook.appevents.cloudbridge.h.a(java.lang.String.valueOf(r3.get("dataset_id")), r10.getProtocol() + "://" + r10.getHost(), java.lang.String.valueOf(r3.get("access_key")));
        com.facebook.appevents.cloudbridge.d.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    @Override // com.facebook.z.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(E response) {
        Intrinsics.checkNotNullParameter(response, "response");
        d.a.getClass();
        String TAG = d.b;
        Intrinsics.checkNotNullParameter(response, "response");
        t tVar = response.c;
        boolean z = false;
        Object obj = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        r3 = null;
        LinkedHashMap linkedHashMap = null;
        G g = G.d;
        if (tVar != null) {
            u.a aVar = u.Companion;
            Intrinsics.checkNotNull(TAG, "null cannot be cast to non-null type kotlin.String");
            Object[] objArr = {tVar.toString(), String.valueOf(tVar.k)};
            aVar.getClass();
            u.a.b(g, TAG, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", objArr);
            if (!com.facebook.internal.instrument.crashshield.a.b(d.class)) {
                try {
                    SharedPreferences sharedPreferences = w.a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
                    if (sharedPreferences != null) {
                        String string = sharedPreferences.getString("dataset_id", null);
                        String string2 = sharedPreferences.getString("endpoint", null);
                        String string3 = sharedPreferences.getString("access_key", null);
                        if (string != null && !StringsKt.isBlank(string) && string2 != null && !StringsKt.isBlank(string2) && string3 != null && !StringsKt.isBlank(string3)) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("endpoint", string2);
                            linkedHashMap2.put("dataset_id", string);
                            linkedHashMap2.put("access_key", string3);
                            linkedHashMap = linkedHashMap2;
                        }
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, d.class);
                }
            }
        }
        u.a aVar2 = u.Companion;
        Intrinsics.checkNotNull(TAG, "null cannot be cast to non-null type kotlin.String");
        aVar2.getClass();
        u.a.b(g, TAG, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject jSONObject = response.b;
        if (jSONObject != null) {
            try {
                obj = jSONObject.get("data");
            } catch (NullPointerException e) {
                u.a aVar3 = u.Companion;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Object[] objArr2 = {ExceptionsKt.stackTraceToString(e)};
                aVar3.getClass();
                u.a.b(g, TAG, "CloudBridge Settings API response is not a valid json: \n%s ", objArr2);
                return;
            } catch (JSONException e2) {
                u.a aVar4 = u.Companion;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Object[] objArr3 = {ExceptionsKt.stackTraceToString(e2)};
                aVar4.getClass();
                u.a.b(g, TAG, "CloudBridge Settings API response is not a valid json: \n%s ", objArr3);
                return;
            }
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        HashMap g2 = com.facebook.internal.E.g(new JSONObject((String) CollectionsKt.firstOrNull((List) com.facebook.internal.E.f((JSONArray) obj))));
        String str = (String) g2.get("endpoint");
        String str2 = (String) g2.get("dataset_id");
        String str3 = (String) g2.get("access_key");
        if (str == null || str2 == null || str3 == null) {
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            u.a.a(g, TAG, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            h.a(str2, str, str3);
            d.a(g2);
            if (g2.get("is_enabled") != null) {
                Object obj2 = g2.get("is_enabled");
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                z = ((Boolean) obj2).booleanValue();
            }
            d.c = z;
        } catch (MalformedURLException e3) {
            u.a aVar5 = u.Companion;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            Object[] objArr4 = {ExceptionsKt.stackTraceToString(e3)};
            aVar5.getClass();
            u.a.b(g, TAG, "CloudBridge Settings API response doesn't have valid url\n %s ", objArr4);
        }
    }
}
