package w1;

import org.json.JSONObject;

/* renamed from: w1.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1676a2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final int f17639c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17640d;

    public C1676a2(int i7, boolean z4) {
        super(2, (byte) 0);
        this.f17639c = i7;
        this.f17640d = z4;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.event.count", this.f17639c);
        a2.put("fl.event.set.complete", this.f17640d);
        return a2;
    }
}
