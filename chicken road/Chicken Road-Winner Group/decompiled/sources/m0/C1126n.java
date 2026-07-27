package m0;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126n {

    /* renamed from: a, reason: collision with root package name */
    public final String f10065a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f10066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10069e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10070g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10071h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10072i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10073j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10074k;

    public C1126n(String str) {
        this.f10065a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10066b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f10067c = optString;
        String optString2 = jSONObject.optString("type");
        this.f10068d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f10069e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.f10070g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f10071h = jSONObject.optString("skuDetailsToken");
        this.f10072i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                arrayList.add(new C1125m(optJSONArray.getJSONObject(i3)));
            }
            this.f10073j = arrayList;
        } else {
            this.f10073j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f10066b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f10066b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                arrayList2.add(new C1123k(optJSONArray2.getJSONObject(i4)));
            }
            this.f10074k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f10074k = null;
        } else {
            arrayList2.add(new C1123k(optJSONObject));
            this.f10074k = arrayList2;
        }
    }

    public final C1123k a() {
        ArrayList arrayList = this.f10074k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C1123k) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1126n) {
            return TextUtils.equals(this.f10065a, ((C1126n) obj).f10065a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10065a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f10065a + "', parsedJson=" + this.f10066b.toString() + ", productId='" + this.f10067c + "', productType='" + this.f10068d + "', title='" + this.f10069e + "', productDetailsToken='" + this.f10071h + "', subscriptionOfferDetails=" + String.valueOf(this.f10073j) + "}";
    }
}
