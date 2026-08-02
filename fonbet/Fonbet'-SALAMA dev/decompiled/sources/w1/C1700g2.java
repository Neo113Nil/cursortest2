package w1;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: w1.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1700g2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17719c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f17720d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1700g2() {
        super(2, (byte) 0);
        this.f17719c = 1;
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17719c) {
            case 0:
                JSONObject a2 = super.a();
                HashMap hashMap = this.f17720d;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put((String) entry2.getKey(), entry2.getValue());
                            jSONObject2 = jSONObject3;
                        }
                        jSONObject.put((String) entry.getKey(), jSONObject2);
                    }
                }
                a2.put("fl.session.property", jSONObject);
                return a2;
            case 1:
                JSONObject a4 = super.a();
                a4.put("fl.consent.isGdprScope", false);
                JSONObject jSONObject4 = new JSONObject();
                HashMap hashMap2 = this.f17720d;
                if (hashMap2 != null) {
                    for (Map.Entry entry3 : hashMap2.entrySet()) {
                        jSONObject4.put((String) entry3.getKey(), entry3.getValue());
                    }
                }
                a4.put("fl.consent.strings", jSONObject4);
                return a4;
            default:
                JSONObject a7 = super.a();
                a7.put("fl.device.properties", AbstractC1707i1.d(this.f17720d));
                return a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700g2(int i7, HashMap hashMap) {
        super(2, (byte) 0);
        this.f17719c = i7;
        switch (i7) {
            case 2:
                super(2, (byte) 0);
                this.f17720d = new HashMap(hashMap);
                break;
            default:
                this.f17720d = new HashMap(hashMap);
                break;
        }
    }
}
