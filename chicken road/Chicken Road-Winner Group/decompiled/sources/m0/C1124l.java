package m0;

import org.json.JSONObject;

/* renamed from: m0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124l {

    /* renamed from: a, reason: collision with root package name */
    public final String f10055a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10056b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10057c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10058d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10059e;
    public final int f;

    public C1124l(JSONObject jSONObject) {
        this.f10058d = jSONObject.optString("billingPeriod");
        this.f10057c = jSONObject.optString("priceCurrencyCode");
        this.f10055a = jSONObject.optString("formattedPrice");
        this.f10056b = jSONObject.optLong("priceAmountMicros");
        this.f = jSONObject.optInt("recurrenceMode");
        this.f10059e = jSONObject.optInt("billingCycleCount");
    }
}
