package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final k7 f4839a = new k7();

    public static final List a(JSONArray jSONArray) {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                try {
                    arrayList.add(g7.f.a(jSONObject));
                } catch (JSONException e) {
                    mb.e("Failed to parse event tracker at index " + i, e);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return arrayList;
    }
}
