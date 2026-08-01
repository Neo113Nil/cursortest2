package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class fum {
    private static final Map<Integer, pcc<?, ?>> pcc = new ConcurrentHashMap();

    public static pcc<?, ?> pcc(Context context, int i) {
        pcc<?, ?> pccVar;
        Map<Integer, pcc<?, ?>> map = pcc;
        pcc<?, ?> pccVar2 = map.get(Integer.valueOf(i));
        if (pccVar2 != null) {
            return pccVar2;
        }
        synchronized (fum.class) {
            pcc<?, ?> pccVar3 = map.get(Integer.valueOf(i));
            if (pccVar3 == null) {
                pccVar = sf(context, i);
                map.put(Integer.valueOf(i), pccVar);
            } else {
                pccVar = pccVar3;
            }
        }
        return pccVar;
    }

    private static pcc<?, ?> sf(Context context, int i) {
        if (i == 7) {
            return new lu(context);
        }
        if (i == 8) {
            return new qf(context);
        }
        throw new IllegalArgumentException("Unsupported ad type: ".concat(String.valueOf(i)));
    }
}
