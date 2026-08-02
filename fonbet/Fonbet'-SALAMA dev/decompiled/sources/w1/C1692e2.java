package w1;

import org.json.JSONObject;

/* renamed from: w1.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1692e2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f17694c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17695d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17696e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17697f;

    /* renamed from: x, reason: collision with root package name */
    public final int f17698x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17699y;

    public C1692e2(C1686d0 c1686d0) {
        super(2, (byte) 0);
        this.f17694c = c1686d0.f17670a;
        this.f17695d = c1686d0.f17671b;
        this.f17696e = c1686d0.f17672c;
        this.f17697f = c1686d0.f17673d;
        this.f17698x = c1686d0.f17674e;
        this.f17699y = c1686d0.f17675f;
    }

    @Override // D1.a
    public final JSONObject a() {
        String str;
        JSONObject a2 = super.a();
        a2.put("fl.session.timestamp", this.f17695d);
        a2.put("fl.initial.timestamp", this.f17696e);
        a2.put("fl.continue.session.millis", this.f17697f);
        a2.put("fl.session.state", L.e(this.f17694c));
        int i7 = this.f17698x;
        if (i7 == 1) {
            str = "SESSION_START";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str = "SESSION_END";
        }
        a2.put("fl.session.event", str);
        a2.put("fl.session.manual", this.f17699y);
        return a2;
    }
}
