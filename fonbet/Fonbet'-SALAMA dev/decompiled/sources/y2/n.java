package y2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends C1797a {

    /* renamed from: e, reason: collision with root package name */
    public final v f18175e;

    public n(int i7, String str, String str2, C1797a c1797a, v vVar) {
        super(i7, str, str2, c1797a);
        this.f18175e = vVar;
    }

    @Override // y2.C1797a
    public final JSONObject c() {
        JSONObject c3 = super.c();
        v vVar = this.f18175e;
        if (vVar == null) {
            c3.put("Response Info", "null");
        } else {
            c3.put("Response Info", vVar.b());
        }
        return c3;
    }

    @Override // y2.C1797a
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
