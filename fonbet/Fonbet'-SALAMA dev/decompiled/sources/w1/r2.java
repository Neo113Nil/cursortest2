package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public int f17842c;

    /* renamed from: d, reason: collision with root package name */
    public String f17843d;

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.flush.frame.code", this.f17842c);
        a2.put("fl.flush.frame.reason", this.f17843d);
        return a2;
    }
}
