package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5046l;
import sg.bigo.ads.c.AbstractC5047m;

/* loaded from: classes3.dex */
public final class e implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        Iterator it = AbstractC5015a.u0.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                str2 = "";
                break;
            }
            str2 = (String) it.next();
            if (!TextUtils.isEmpty(AbstractC5047m.a(str2))) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(AbstractC5015a.y, str2);
        }
        Iterator it2 = AbstractC5015a.v0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            if (AbstractC5046l.a(str3)) {
                str = str3;
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put(AbstractC5015a.x, str);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.t;
    }
}
