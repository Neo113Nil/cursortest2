package w1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S1 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17530c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S1() {
        super(2, (byte) 0);
        this.f17530c = 1;
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17530c) {
            case 0:
                JSONObject a2 = super.a();
                Long l7 = (Long) this.f17531d;
                if (l7.longValue() != Long.MIN_VALUE) {
                    a2.put("fl.demo.birthdate", l7);
                }
                return a2;
            case 1:
                JSONObject a4 = super.a();
                JSONArray jSONArray = new JSONArray();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f17531d;
                    if (i7 >= arrayList.size()) {
                        a4.put("fl.variants", jSONArray);
                        return a4;
                    }
                    V1 v12 = (V1) arrayList.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fl.variant.id", v12.f17564a);
                    jSONObject.put("fl.variant.version", v12.f17565b);
                    jSONArray.put(jSONObject);
                    i7++;
                }
            default:
                JSONObject a7 = super.a();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((Map) this.f17531d).entrySet()) {
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
                    a7.put("fl.referrer.map", jSONObject2);
                }
                return a7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S1(Object obj, int i7) {
        super(2, (byte) 0);
        this.f17530c = i7;
        this.f17531d = obj;
    }
}
