package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5047m;
import sg.bigo.ads.c.C5035a;
import sg.bigo.ads.c.C5036b;
import sg.bigo.ads.c.C5037c;
import sg.bigo.ads.c.C5038d;
import sg.bigo.ads.c.C5039e;
import sg.bigo.ads.c.C5040f;
import sg.bigo.ads.c.C5041g;
import sg.bigo.ads.c.C5042h;
import sg.bigo.ads.c.C5043i;
import sg.bigo.ads.c.InterfaceC5044j;

/* loaded from: classes3.dex */
public final class k implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC5015a.N, new C5035a());
        hashMap.put(AbstractC5015a.O, new C5036b());
        hashMap.put(AbstractC5015a.P, new C5037c());
        hashMap.put(AbstractC5015a.Q, new C5038d());
        hashMap.put(AbstractC5015a.R, new C5039e());
        hashMap.put(AbstractC5015a.S, new C5040f());
        hashMap.put(AbstractC5015a.T, new C5041g());
        hashMap.put(AbstractC5015a.U, new C5042h());
        hashMap.put(AbstractC5015a.V, new C5043i());
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String a2 = AbstractC5047m.a(str);
            if (!TextUtils.isEmpty(a2) && ((InterfaceC5044j) entry.getValue()).a(a2)) {
                try {
                    jSONObject.put(str, a2);
                } catch (JSONException unused) {
                }
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.s;
    }
}
