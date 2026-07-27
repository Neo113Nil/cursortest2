package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public final String f4941a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4942b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f4943c;

    public Purchase(String str, String str2) {
        this.f4941a = str;
        this.f4942b = str2;
        this.f4943c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f4943c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f4943c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f4941a, purchase.f4941a) && TextUtils.equals(this.f4942b, purchase.f4942b);
    }

    public final int hashCode() {
        return this.f4941a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f4941a));
    }
}
