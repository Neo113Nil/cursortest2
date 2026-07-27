package G0;

import b2.AbstractC0279e;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final String f756a;

    /* renamed from: b, reason: collision with root package name */
    public final String f757b;

    /* renamed from: c, reason: collision with root package name */
    public final String f758c;

    public /* synthetic */ H(JSONObject jSONObject) {
        this.f756a = jSONObject.optString("productId");
        this.f757b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f758c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h3 = (H) obj;
        return this.f756a.equals(h3.f756a) && this.f757b.equals(h3.f757b) && Objects.equals(this.f758c, h3.f758c);
    }

    public final int hashCode() {
        return Objects.hash(this.f756a, this.f757b, this.f758c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f756a);
        sb.append(", type: ");
        sb.append(this.f757b);
        sb.append(", offer token: ");
        return AbstractC0279e.h(sb, this.f758c, "}");
    }
}
