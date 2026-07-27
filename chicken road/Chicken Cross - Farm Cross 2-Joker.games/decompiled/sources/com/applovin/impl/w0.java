package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.l f4541a;
    protected final JSONObject b;

    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* renamed from: a, reason: collision with root package name */
        private final int f4542a;

        a(int i) {
            this.f4542a = i;
        }

        public int b() {
            return this.f4542a;
        }
    }

    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public w0(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        this.f4541a = lVar;
        this.b = jSONObject;
    }

    public static w0 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b c = c(JsonUtils.getString(jSONObject, "type", null));
        return c == b.ALERT ? new x0(jSONObject, lVar) : c == b.EVENT ? new z0(jSONObject, lVar) : new w0(jSONObject, lVar);
    }

    public String b() {
        return JsonUtils.getString(this.b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    protected String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                String str2 = (String) this.f4541a.B().N().get(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.l.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return com.applovin.impl.sdk.l.a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i = JsonUtils.getInt(this.b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.b, "destination_state_id_true", -1) : JsonUtils.getInt(this.b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
