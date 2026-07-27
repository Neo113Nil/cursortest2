package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5046l;

/* loaded from: classes3.dex */
public final class j implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        JSONObject jSONObject = new JSONObject();
        String[] strArr = {AbstractC5015a.B, AbstractC5015a.C};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            String b = AbstractC5046l.b(str);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put(str, b);
            }
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.B;
    }
}
