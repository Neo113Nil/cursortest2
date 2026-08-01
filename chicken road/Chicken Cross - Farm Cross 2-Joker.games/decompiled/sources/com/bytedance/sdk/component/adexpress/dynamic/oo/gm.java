package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private HashMap<String, Object> pcc = new HashMap<>();
    private JSONObject sf;

    public gm(JSONObject jSONObject) {
        this.sf = jSONObject;
    }

    public Object pcc(String str) {
        if (this.pcc.containsKey(str)) {
            return this.pcc.get(str);
        }
        return null;
    }

    public boolean sf(String str) {
        return this.pcc.containsKey(str);
    }

    public void pcc() {
        Iterator<String> keys = this.sf.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.sf.opt(next);
            int i = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    this.pcc.put(next + "." + i + "." + next2, optJSONObject.opt(next2));
                                }
                            }
                            i++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt2 = jSONObject.opt(next3);
                            if ((opt2 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i2 = 0; i2 < ((JSONArray) opt2).length(); i2++) {
                                    this.pcc.put(next + "." + next3 + "." + i2, ((JSONArray) opt2).opt(i2));
                                }
                            } else if ((opt2 instanceof JSONObject) && TextUtils.equals(next3, FirebaseAnalytics.Param.COUPON)) {
                                Iterator<String> keys4 = ((JSONObject) opt2).keys();
                                while (keys4.hasNext()) {
                                    String next4 = keys4.next();
                                    this.pcc.put(next + "." + next3 + "." + next4, ((JSONObject) opt2).opt(next4));
                                }
                            } else if ((opt2 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                pcc(next, next3, opt2);
                            } else {
                                this.pcc.put(next + "." + next3, opt2);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.pcc.put(next, opt);
                if (opt instanceof String) {
                    this.pcc.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys5 = jSONObject2.keys();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    this.pcc.put(next + "." + next5, jSONObject2.opt(next5));
                }
            }
        }
    }

    private void pcc(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            this.pcc.put(str + "." + str2 + "." + next + "." + i + "." + next2, optJSONObject.opt(next2));
                        }
                        i++;
                    }
                }
            } else {
                this.pcc.put(str + "." + str2 + "." + next, opt);
            }
        }
    }
}
