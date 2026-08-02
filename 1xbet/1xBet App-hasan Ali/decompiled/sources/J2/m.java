package J2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m extends b {
    public final q f;

    public m(int i, String str, String str2, b bVar, q qVar) {
        super(i, str, str2, bVar);
        this.f = qVar;
    }

    @Override // J2.b
    public final JSONObject o() {
        JSONObject o5 = super.o();
        q qVar = this.f;
        if (qVar == null) {
            o5.put("Response Info", "null");
            return o5;
        }
        o5.put("Response Info", qVar.a());
        return o5;
    }

    @Override // J2.b
    public final String toString() {
        try {
            return o().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
