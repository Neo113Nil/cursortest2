package com.google.firebase.storage;

import io.sentry.SentryLogEvents;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12024a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12025b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12026c;

    public h(ArrayList arrayList, ArrayList arrayList2, String str) {
        this.f12024a = arrayList;
        this.f12025b = arrayList2;
        this.f12026c = str;
    }

    public static h a(f fVar, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                String string = jSONArray.getString(i7);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(fVar.d(string));
            }
        }
        if (jSONObject.has(SentryLogEvents.JsonKeys.ITEMS)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(SentryLogEvents.JsonKeys.ITEMS);
            for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                arrayList2.add(fVar.d(jSONArray2.getJSONObject(i8).getString("name")));
            }
        }
        return new h(arrayList, arrayList2, jSONObject.optString("nextPageToken", null));
    }
}
