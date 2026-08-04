package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015m2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17805f;

    public C1015m2(String str, String str2, String str3, String str4) {
        super(2, (byte) 0);
        this.f17802c = str;
        this.f17803d = str2 == null ? "" : str2;
        this.f17804e = str3;
        this.f17805f = str4;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        String str = this.f17802c;
        if (str != null) {
            jSONObjectA.put("fl.app.version", str);
        }
        jSONObjectA.put("fl.app.version.override", this.f17803d);
        String str2 = this.f17804e;
        if (str2 != null) {
            jSONObjectA.put("fl.app.version.code", str2);
        }
        String str3 = this.f17805f;
        if (str3 != null) {
            jSONObjectA.put("fl.bundle.id", str3);
        }
        jSONObjectA.put("fl.build.environment", 3);
        return jSONObjectA;
    }
}
