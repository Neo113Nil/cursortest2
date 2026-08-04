package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979d2 extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f17682A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17686f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f17687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f17688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f17689z;

    public C0979d2(int i7, String str, String str2, String str3, String str4, String str5, String str6, int i8) {
        super(2, (byte) 0);
        this.f1675b = 2;
        this.f17683c = i7 < 0 ? -1 : i7;
        this.f17684d = str;
        this.f17685e = str2;
        this.f17686f = str3;
        this.f17687x = str4;
        this.f17688y = str5;
        this.f17689z = str6;
        this.f17682A = i8;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.network.status", this.f17683c);
        String str = this.f17684d;
        if (str != null) {
            jSONObjectA.put("fl.cellular.name", str);
            jSONObjectA.put("fl.cellular.operator", this.f17685e);
            jSONObjectA.put("fl.cellular.sim.operator", this.f17686f);
            jSONObjectA.put("fl.cellular.sim.id", this.f17687x);
            jSONObjectA.put("fl.cellular.sim.name", this.f17688y);
            jSONObjectA.put("fl.cellular.band", this.f17689z);
            jSONObjectA.put("fl.cellular.signal.strength", this.f17682A);
        }
        return jSONObjectA;
    }
}
