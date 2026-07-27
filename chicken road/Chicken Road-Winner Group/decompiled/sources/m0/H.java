package m0;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final String f9952a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9953b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9954c;

    public /* synthetic */ H(JSONObject jSONObject) {
        this.f9952a = jSONObject.optString("productId");
        this.f9953b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f9954c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return this.f9952a.equals(h3.f9952a) && this.f9953b.equals(h3.f9953b) && Objects.equals(this.f9954c, h3.f9954c);
    }

    public final int hashCode() {
        return Objects.hash(this.f9952a, this.f9953b, this.f9954c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f9952a);
        sb.append(", type: ");
        sb.append(this.f9953b);
        sb.append(", offer token: ");
        return B0.c.l(sb, this.f9954c, "}");
    }
}
