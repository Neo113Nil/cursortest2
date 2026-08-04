package p155w1;

import D1.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f17899d;

    public v2(String str, Map map) {
        super(2, (byte) 0);
        this.f17898c = str;
        this.f17899d = map;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        JSONObject jSONObjectD = AbstractC0998i1.d(this.f17899d);
        jSONObjectA.put("fl.origin.attribute.name", this.f17898c);
        jSONObjectA.put("fl.origin.attribute.parameters", jSONObjectD);
        return jSONObjectA;
    }
}
