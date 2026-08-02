package w1;

import org.json.JSONObject;

/* renamed from: w1.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696f2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final String f17712c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17713d;

    public C1696f2(String str, String str2) {
        super(2, (byte) 0);
        this.f17712c = str == null ? "" : str;
        this.f17713d = str2 == null ? "" : str2;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.session.property.param.name", this.f17712c);
        a2.put("fl.session.property.param.value", this.f17713d);
        return a2;
    }
}
