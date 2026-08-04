package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17955f;

    public z2(boolean z4, String str, int i7, int i8) {
        super(2, (byte) 0);
        this.f17952c = str;
        this.f17953d = i7;
        this.f17954e = z4;
        this.f17955f = i8;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        int i7;
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.agent.version", 345);
        jSONObjectA.put("fl.agent.platform", 3);
        jSONObjectA.put("fl.apikey", this.f17952c);
        jSONObjectA.put("fl.agent.report.key", this.f17953d);
        jSONObjectA.put("fl.background.session.metrics", this.f17954e);
        switch (this.f17955f) {
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
        jSONObjectA.put("fl.play.service.availability", i7);
        return jSONObjectA;
    }
}
