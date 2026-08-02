package T4;

import Y3.i;
import org.json.JSONObject;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class g extends c {

    /* renamed from: m, reason: collision with root package name */
    public final JSONObject f6367m;

    public g(C1726n0 c1726n0, i iVar, JSONObject jSONObject) {
        super(c1726n0, iVar);
        this.f6367m = jSONObject;
        q("X-HTTP-Method-Override", "PATCH");
    }

    @Override // T4.c
    public final String d() {
        return "PUT";
    }

    @Override // T4.c
    public final JSONObject e() {
        return this.f6367m;
    }
}
