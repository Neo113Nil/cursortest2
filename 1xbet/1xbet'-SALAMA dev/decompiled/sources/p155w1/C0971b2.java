package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0971b2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0971b2(int i7, int i8) {
        super(2, (byte) 0);
        this.f17656c = i8;
        this.f17657d = i7;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17656c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                int i7 = this.f17657d;
                if (i7 != Integer.MIN_VALUE) {
                    jSONObjectA.put("fl.demo.gender", i7);
                }
                return jSONObjectA;
            case 1:
                JSONObject jSONObjectA2 = super.a();
                jSONObjectA2.put("fl.error.count", this.f17657d);
                return jSONObjectA2;
            default:
                JSONObject jSONObjectA3 = super.a();
                jSONObjectA3.put("fl.app.orientation", this.f17657d);
                return jSONObjectA3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0971b2(int i7) {
        super(2, (byte) 0);
        this.f17656c = 2;
        this.f17657d = i7 < 0 ? 0 : i7;
    }
}
