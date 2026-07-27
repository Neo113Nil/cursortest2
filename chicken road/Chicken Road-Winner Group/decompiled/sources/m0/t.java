package m0;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f10077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10079c;

    public t(JSONObject jSONObject) {
        this.f10077a = jSONObject.optString("productId");
        this.f10078b = jSONObject.optString("productType");
        String optString = jSONObject.optString("offerToken");
        this.f10079c = true == optString.isEmpty() ? null : optString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f10077a.equals(tVar.f10077a) && this.f10078b.equals(tVar.f10078b) && Objects.equals(this.f10079c, tVar.f10079c);
    }

    public final int hashCode() {
        return Objects.hash(this.f10077a, this.f10078b, this.f10079c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{id: ");
        sb.append(this.f10077a);
        sb.append(", type: ");
        sb.append(this.f10078b);
        sb.append(", offer token: ");
        return B0.c.l(sb, this.f10079c, "}");
    }
}
