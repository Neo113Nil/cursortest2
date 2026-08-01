package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4638s8 implements C7 {
    @Override // com.ironsource.C7
    public String a(Map<String, Object> map) {
        try {
            return String.format("%s=%s", "data", Base64.encodeToString(new JSONObject().put(C4761z5.R, C4761z5.S).put("data", new JSONObject(map)).toString().getBytes(), 2));
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
