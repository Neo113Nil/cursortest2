package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    public static String pcc(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject pcc = pcc(it.next());
            if (pcc != null) {
                jSONArray.put(pcc);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> pcc(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                FilterWord pcc = pcc(jSONArray.optJSONObject(i));
                if (pcc != null && pcc.isValid()) {
                    arrayList.add(pcc);
                }
            }
        } catch (JSONException e) {
            lo.gm("MaterialMetaTools", e.getMessage());
        }
        return arrayList;
    }

    private static FilterWord pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FilterWord pcc = pcc(optJSONArray.optJSONObject(i));
                    if (pcc != null && pcc.isValid()) {
                        filterWord.addOption(pcc);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject pcc(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(pcc(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
