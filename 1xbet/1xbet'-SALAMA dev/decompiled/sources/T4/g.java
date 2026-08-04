package T4;

import Y3.i;
import org.json.JSONObject;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JSONObject f6367m;

    public g(C1017n0 c1017n0, i iVar, JSONObject jSONObject) {
        super(c1017n0, iVar);
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
