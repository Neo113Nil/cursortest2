package p155w1;

import D1.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(boolean z4, int i7) {
        super(2, (byte) 0);
        this.f17843c = i7;
        this.f17844d = z4;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17843c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                jSONObjectA.put("fl.ccpa.optout", this.f17844d);
                return jSONObjectA;
            default:
                JSONObject jSONObjectA2 = super.a();
                jSONObjectA2.put("fl.report.previous.success", this.f17844d);
                return jSONObjectA2;
        }
    }
}
