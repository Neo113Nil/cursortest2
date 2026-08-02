package w1;

import org.json.JSONObject;

/* renamed from: w1.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728n2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f17808c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17809d;

    public C1728n2(int i7, int i8) {
        super(2, (byte) 0);
        this.f17809d = i7 < 0 ? -1 : i7;
        this.f17808c = i8 < 0 ? -1 : i8;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.app.current.state", this.f17808c);
        a2.put("fl.app.previous.state", this.f17809d);
        return a2;
    }
}
