package com.mbridge.msdk.video.bt.component;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: HandlerH5MessageManager.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f10050a;
    int b;
    int c;

    /* compiled from: HandlerH5MessageManager.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static c f10051a = new c();
    }

    public static c a() {
        return b.f10051a;
    }

    private c() {
        this.f10050a = "handlerNativeResult";
        this.b = 0;
        this.c = 1;
    }

    public void a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String optString = jSONObject.optString("uniqueIdentifier");
                    String optString2 = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                        JSONObject optJSONObject = jSONObject.optJSONObject("result");
                        int i = 0;
                        if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.toString())) {
                            i = optJSONObject.optInt("type", 0);
                        }
                        a(this.b, "receivedMessage", obj);
                        if (optString.equalsIgnoreCase("reporter")) {
                            com.mbridge.msdk.mbsignalcommon.Report.a.a().a(obj, optString2, optJSONArray, i);
                            return;
                        } else {
                            if (optString.equalsIgnoreCase("MediaPlayer")) {
                                com.mbridge.msdk.video.bt.component.b.a().a(obj, optString2, optJSONArray, i);
                                return;
                            }
                            return;
                        }
                    }
                    a(this.c, "module or method is null", obj);
                    return;
                }
            } catch (Exception e) {
                q0.a("HandlerH5MessageManager", e.getMessage());
                a(this.c, e.getMessage(), obj);
                return;
            } catch (Throwable th) {
                q0.a("HandlerH5MessageManager", th.getMessage());
                a(this.c, th.getMessage(), obj);
                return;
            }
        }
        a(this.c, "params is null", obj);
    }

    public void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, i);
            jSONObject.put("message", str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            q0.a("HandlerH5MessageManager", e.getMessage());
        } catch (Throwable th) {
            q0.a("HandlerH5MessageManager", th.getMessage());
        }
    }
}
