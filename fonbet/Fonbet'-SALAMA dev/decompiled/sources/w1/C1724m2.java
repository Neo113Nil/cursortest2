package w1;

import org.json.JSONObject;

/* renamed from: w1.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724m2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final String f17796c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17797d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17798e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17799f;

    public C1724m2(String str, String str2, String str3, String str4) {
        super(2, (byte) 0);
        this.f17796c = str;
        this.f17797d = str2 == null ? "" : str2;
        this.f17798e = str3;
        this.f17799f = str4;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        String str = this.f17796c;
        if (str != null) {
            a2.put("fl.app.version", str);
        }
        a2.put("fl.app.version.override", this.f17797d);
        String str2 = this.f17798e;
        if (str2 != null) {
            a2.put("fl.app.version.code", str2);
        }
        String str3 = this.f17799f;
        if (str3 != null) {
            a2.put("fl.bundle.id", str3);
        }
        a2.put("fl.build.environment", 3);
        return a2;
    }
}
