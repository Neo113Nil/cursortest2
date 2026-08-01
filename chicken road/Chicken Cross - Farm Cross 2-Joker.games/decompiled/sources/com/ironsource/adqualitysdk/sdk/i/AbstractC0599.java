package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ر, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0599 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5553(List list, int i, Class cls) {
        Object obj = list.get(i);
        return obj == null || cls.isAssignableFrom(obj.getClass());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m5554(List list, int i, Class cls) {
        Object obj = list.get(i);
        if (obj == null || cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ClassCastException(StringFog.decrypt("9KWrYCnVOx3Wt7Eu\n", "t8TFDkahG34=\n") + obj.getClass().getName() + StringFog.decrypt("HMKqAg==\n", "PLbFImfjiDA=\n") + cls.getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m5555(List list, int i) {
        ArrayList arrayList = new ArrayList();
        return (list.size() <= i || !m5553(list, i, List.class)) ? arrayList : (List) m5554(list, i, List.class);
    }
}
