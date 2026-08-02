package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f17934c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17935d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17936e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17937f;

    public y2(long j, int i7, long j3, long j7) {
        super(2, (byte) 0);
        this.f17934c = j;
        this.f17935d = j3;
        this.f17936e = j7;
        this.f17937f = i7;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.session.id", this.f17934c);
        long j = this.f17935d;
        a2.put("fl.session.elapsed.start.time", j);
        long j3 = this.f17936e;
        if (j3 >= j) {
            a2.put("fl.session.elapsed.end.time", j3);
        }
        a2.put("fl.session.id.current.state", this.f17937f);
        return a2;
    }
}
