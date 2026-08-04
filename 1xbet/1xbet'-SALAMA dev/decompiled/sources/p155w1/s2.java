package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17864c;

    public s2(long j) {
        super(2, (byte) 0);
        this.f17864c = j;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.frame.log.counter", this.f17864c);
        return jSONObjectA;
    }
}
