package m0;

import D.C0009j;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: m0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125m {

    /* renamed from: a, reason: collision with root package name */
    public final String f10060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10061b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10062c;

    /* renamed from: d, reason: collision with root package name */
    public final U.K f10063d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10064e;
    public final C0009j f;

    public C1125m(JSONObject jSONObject) {
        this.f10060a = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.f10061b = true == optString.isEmpty() ? null : optString;
        this.f10062c = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        U.K k3 = new U.K();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                if (optJSONObject != null) {
                    arrayList.add(new C1124l(optJSONObject));
                }
            }
        }
        k3.f1500a = arrayList;
        this.f10063d = k3;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        this.f = optJSONObject2 != null ? new C0009j(optJSONObject2) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject3 != null) {
            optJSONObject3.getString("productId");
            optJSONObject3.optString("title");
            optJSONObject3.optString("name");
            optJSONObject3.optString("description");
            optJSONObject3.optString("basePlanId");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
            if (optJSONObject4 != null) {
                optJSONObject4.optString("billingPeriod");
                optJSONObject4.optString("priceCurrencyCode");
                optJSONObject4.optString("formattedPrice");
                optJSONObject4.optLong("priceAmountMicros");
                optJSONObject4.optInt("recurrenceMode");
                optJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList2.add(optJSONArray.getString(i4));
            }
        }
        this.f10064e = arrayList2;
    }
}
