package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.κ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0478 extends AbstractC0599 {
    static {
        StringFog.decrypt("93iv/9y6xz/2\n", "hB3Bm5nItVA=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5461(C1226 c1226, ArrayList arrayList) {
        boolean booleanValue;
        JSONObject jSONObject;
        String str = (String) AbstractC0599.m5554(arrayList, 0, String.class);
        String str2 = c1226.m5929() + StringFog.decrypt("LA==\n", "FgXME1vfot8=\n") + Integer.toHexString(str.hashCode());
        Throwable th = (Throwable) AbstractC0599.m5554(arrayList, 1, Throwable.class);
        try {
            if (arrayList.size() > 2) {
                if (AbstractC0599.m5553(arrayList, 2, JSONObject.class)) {
                    JSONObject jSONObject2 = (JSONObject) AbstractC0599.m5554(arrayList, 2, JSONObject.class);
                    if (arrayList.size() > 3 && AbstractC0599.m5553(arrayList, 3, Boolean.class)) {
                        r1 = ((Boolean) AbstractC0599.m5554(arrayList, 3, Boolean.class)).booleanValue();
                    }
                    jSONObject = jSONObject2;
                    booleanValue = r1;
                } else {
                    booleanValue = AbstractC0599.m5553(arrayList, 2, Boolean.class) ? ((Boolean) AbstractC0599.m5554(arrayList, 2, Boolean.class)).booleanValue() : false;
                    jSONObject = null;
                }
                AbstractC0480.m5463(c1226.m5929(), str, str2, th, null, jSONObject, true, false, booleanValue);
            } else {
                AbstractC0480.m5463(c1226.m5929(), str, str2, th, null, null, true, false, false);
            }
        } catch (Throwable unused) {
        }
    }
}
