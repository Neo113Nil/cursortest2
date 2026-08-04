package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17849d;

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.flush.frame.code", this.f17848c);
        jSONObjectA.put("fl.flush.frame.reason", this.f17849d);
        return jSONObjectA;
    }
}
