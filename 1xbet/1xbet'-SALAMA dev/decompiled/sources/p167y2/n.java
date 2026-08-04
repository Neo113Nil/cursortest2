package p167y2;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class n extends C1057a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f18181e;

    public n(int i7, String str, String str2, C1057a c1057a, v vVar) {
        super(i7, str, str2, c1057a);
        this.f18181e = vVar;
    }

    @Override // p167y2.C1057a
    public final JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        v vVar = this.f18181e;
        if (vVar == null) {
            jSONObjectC.put("Response Info", "null");
        } else {
            jSONObjectC.put("Response Info", vVar.b());
        }
        return jSONObjectC;
    }

    @Override // p167y2.C1057a
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
