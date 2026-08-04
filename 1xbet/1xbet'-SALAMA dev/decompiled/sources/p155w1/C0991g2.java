package p155w1;

import D1.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: w1.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991g2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f17726d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0991g2() {
        super(2, (byte) 0);
        this.f17725c = 1;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17725c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                HashMap map = this.f17726d;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                            jSONObject2 = jSONObject3;
                        }
                        jSONObject.put((String) entry.getKey(), jSONObject2);
                    }
                }
                jSONObjectA.put("fl.session.property", jSONObject);
                return jSONObjectA;
            case 1:
                JSONObject jSONObjectA2 = super.a();
                jSONObjectA2.put("fl.consent.isGdprScope", false);
                JSONObject jSONObject4 = new JSONObject();
                HashMap map2 = this.f17726d;
                if (map2 != null) {
                    for (Map.Entry entry3 : map2.entrySet()) {
                        jSONObject4.put((String) entry3.getKey(), entry3.getValue());
                    }
                }
                jSONObjectA2.put("fl.consent.strings", jSONObject4);
                return jSONObjectA2;
            default:
                JSONObject jSONObjectA3 = super.a();
                jSONObjectA3.put("fl.device.properties", AbstractC0998i1.d(this.f17726d));
                return jSONObjectA3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991g2(int i7, HashMap map) {
        super(2, (byte) 0);
        this.f17725c = i7;
        switch (i7) {
            case 2:
                super(2, (byte) 0);
                this.f17726d = new HashMap(map);
                break;
            default:
                this.f17726d = new HashMap(map);
                break;
        }
    }
}
