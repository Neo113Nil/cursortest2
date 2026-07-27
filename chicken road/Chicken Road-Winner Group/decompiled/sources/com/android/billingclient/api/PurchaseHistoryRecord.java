package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: a, reason: collision with root package name */
    public final String f2541a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2542b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f2543c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f2541a = str;
        this.f2542b = str2;
        this.f2543c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f2543c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    arrayList.add(optJSONArray.optString(i3));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f2543c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f2541a, purchaseHistoryRecord.f2541a) && TextUtils.equals(this.f2542b, purchaseHistoryRecord.f2542b);
    }

    public final int hashCode() {
        return this.f2541a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f2541a));
    }
}
