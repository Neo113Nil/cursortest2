package G0;

import b2.AbstractC0279e;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f897a;

    /* renamed from: b, reason: collision with root package name */
    public final String f898b;

    /* renamed from: c, reason: collision with root package name */
    public final String f899c;

    public v(JSONObject jSONObject) {
        this.f897a = jSONObject.optString("productId");
        this.f898b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f899c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f897a.equals(vVar.f897a) && this.f898b.equals(vVar.f898b) && Objects.equals(this.f899c, vVar.f899c);
    }

    public final int hashCode() {
        return Objects.hash(this.f897a, this.f898b, this.f899c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f897a);
        sb.append(", type: ");
        sb.append(this.f898b);
        sb.append(", offer token: ");
        return AbstractC0279e.h(sb, this.f899c, "}");
    }
}
