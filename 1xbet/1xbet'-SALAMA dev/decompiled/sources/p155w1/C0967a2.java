package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0967a2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17646d;

    public C0967a2(int i7, boolean z4) {
        super(2, (byte) 0);
        this.f17645c = i7;
        this.f17646d = z4;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.event.count", this.f17645c);
        jSONObjectA.put("fl.event.set.complete", this.f17646d);
        return jSONObjectA;
    }
}
