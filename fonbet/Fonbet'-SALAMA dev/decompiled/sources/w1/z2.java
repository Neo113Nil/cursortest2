package w1;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final String f17946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17947d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17948e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17949f;

    public z2(boolean z4, String str, int i7, int i8) {
        super(2, (byte) 0);
        this.f17946c = str;
        this.f17947d = i7;
        this.f17948e = z4;
        this.f17949f = i8;
    }

    @Override // D1.a
    public final JSONObject a() {
        int i7;
        JSONObject a2 = super.a();
        a2.put("fl.agent.version", 345);
        a2.put("fl.agent.platform", 3);
        a2.put("fl.apikey", this.f17946c);
        a2.put("fl.agent.report.key", this.f17947d);
        a2.put("fl.background.session.metrics", this.f17948e);
        switch (this.f17949f) {
            case 1:
                i7 = -2;
                break;
            case 2:
                i7 = -1;
                break;
            case 3:
                i7 = 0;
                break;
            case 4:
                i7 = 1;
                break;
            case 5:
                i7 = 2;
                break;
            case 6:
                i7 = 3;
                break;
            case 7:
                i7 = 4;
                break;
            case 8:
                i7 = 5;
                break;
            default:
                throw null;
        }
        a2.put("fl.play.service.availability", i7);
        return a2;
    }
}
