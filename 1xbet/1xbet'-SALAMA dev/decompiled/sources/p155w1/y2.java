package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17943f;

    public y2(long j, int i7, long j3, long j7) {
        super(2, (byte) 0);
        this.f17940c = j;
        this.f17941d = j3;
        this.f17942e = j7;
        this.f17943f = i7;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.session.id", this.f17940c);
        long j = this.f17941d;
        jSONObjectA.put("fl.session.elapsed.start.time", j);
        long j3 = this.f17942e;
        if (j3 >= j) {
            jSONObjectA.put("fl.session.elapsed.end.time", j3);
        }
        jSONObjectA.put("fl.session.id.current.state", this.f17943f);
        return jSONObjectA;
    }
}
