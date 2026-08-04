package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019n2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17815d;

    public C1019n2(int i7, int i8) {
        super(2, (byte) 0);
        this.f17815d = i7 < 0 ? -1 : i7;
        this.f17814c = i8 < 0 ? -1 : i8;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.app.current.state", this.f17814c);
        jSONObjectA.put("fl.app.previous.state", this.f17815d);
        return jSONObjectA;
    }
}
