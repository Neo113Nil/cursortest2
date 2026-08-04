package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0987f2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17719d;

    public C0987f2(String str, String str2) {
        super(2, (byte) 0);
        this.f17718c = str == null ? "" : str;
        this.f17719d = str2 == null ? "" : str2;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.session.property.param.name", this.f17718c);
        jSONObjectA.put("fl.session.property.param.value", this.f17719d);
        return jSONObjectA;
    }
}
