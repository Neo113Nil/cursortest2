package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983e2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17703f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f17704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f17705y;

    public C0983e2(C0977d0 c0977d0) {
        super(2, (byte) 0);
        this.f17700c = c0977d0.f17676a;
        this.f17701d = c0977d0.f17677b;
        this.f17702e = c0977d0.f17678c;
        this.f17703f = c0977d0.f17679d;
        this.f17704x = c0977d0.f17680e;
        this.f17705y = c0977d0.f17681f;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        String str;
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.session.timestamp", this.f17701d);
        jSONObjectA.put("fl.initial.timestamp", this.f17702e);
        jSONObjectA.put("fl.continue.session.millis", this.f17703f);
        jSONObjectA.put("fl.session.state", L.e(this.f17700c));
        int i7 = this.f17704x;
        if (i7 == 1) {
            str = "SESSION_START";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str = "SESSION_END";
        }
        jSONObjectA.put("fl.session.event", str);
        jSONObjectA.put("fl.session.manual", this.f17705y);
        return jSONObjectA;
    }
}
