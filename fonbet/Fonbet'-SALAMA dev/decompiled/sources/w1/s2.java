package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f17858c;

    public s2(long j) {
        super(2, (byte) 0);
        this.f17858c = j;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.frame.log.counter", this.f17858c);
        return a2;
    }
}
