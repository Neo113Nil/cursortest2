package p155w1;

import D1.a;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class S1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f17537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S1() {
        super(2, (byte) 0);
        this.f17536c = 1;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17536c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                Long l7 = (Long) this.f17537d;
                if (l7.longValue() != Long.MIN_VALUE) {
                    jSONObjectA.put("fl.demo.birthdate", l7);
                }
                return jSONObjectA;
            case 1:
                JSONObject jSONObjectA2 = super.a();
                JSONArray jSONArray = new JSONArray();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f17537d;
                    if (i7 >= arrayList.size()) {
                        jSONObjectA2.put("fl.variants", jSONArray);
                        return jSONObjectA2;
                    }
                    V1 v6 = (V1) arrayList.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fl.variant.id", v6.f17570a);
                    jSONObject.put("fl.variant.version", v6.f17571b);
                    jSONArray.put(jSONObject);
                    i7++;
                }
                break;
            default:
                JSONObject jSONObjectA3 = super.a();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((Map) this.f17537d).entrySet()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (String str : (List) entry.getValue()) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray2.put(str);
                        }
                    }
                    if (jSONArray2.length() > 0) {
                        jSONObject2.put((String) entry.getKey(), jSONArray2);
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObjectA3.put("fl.referrer.map", jSONObject2);
                }
                return jSONObjectA3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S1(Object obj, int i7) {
        super(2, (byte) 0);
        this.f17536c = i7;
        this.f17537d = obj;
    }
}
