package G0;

import android.text.TextUtils;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: G0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066p {

    /* renamed from: a, reason: collision with root package name */
    public final String f884a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f886c;

    /* renamed from: d, reason: collision with root package name */
    public final String f887d;

    /* renamed from: e, reason: collision with root package name */
    public final String f888e;

    /* renamed from: f, reason: collision with root package name */
    public final String f889f;

    /* renamed from: g, reason: collision with root package name */
    public final String f890g;

    /* renamed from: h, reason: collision with root package name */
    public final String f891h;

    /* renamed from: i, reason: collision with root package name */
    public final String f892i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f893j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f894k;

    public C0066p(String str) {
        this.f884a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f885b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f886c = optString;
        String optString2 = jSONObject.optString(WebViewManager.EVENT_TYPE_KEY);
        this.f887d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f888e = jSONObject.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE);
        this.f889f = jSONObject.optString("name");
        this.f890g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f891h = jSONObject.optString("skuDetailsToken");
        this.f892i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(new C0065o(optJSONArray.getJSONObject(i2)));
            }
            this.f893j = arrayList;
        } else {
            this.f893j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f885b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f885b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                arrayList2.add(new C0063m(optJSONArray2.getJSONObject(i3)));
            }
            this.f894k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f894k = null;
        } else {
            arrayList2.add(new C0063m(optJSONObject));
            this.f894k = arrayList2;
        }
    }

    public final C0063m a() {
        ArrayList arrayList = this.f894k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (C0063m) arrayList.get(0);
    }

    public final String b() {
        return this.f886c;
    }

    public final String c() {
        return this.f887d;
    }

    public final String d() {
        return this.f885b.optString("packageName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0066p) {
            return TextUtils.equals(this.f884a, ((C0066p) obj).f884a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f884a.hashCode();
    }

    public final String toString() {
        return "ProductDetails{jsonString='" + this.f884a + "', parsedJson=" + this.f885b.toString() + ", productId='" + this.f886c + "', productType='" + this.f887d + "', title='" + this.f888e + "', productDetailsToken='" + this.f891h + "', subscriptionOfferDetails=" + String.valueOf(this.f893j) + "}";
    }
}
