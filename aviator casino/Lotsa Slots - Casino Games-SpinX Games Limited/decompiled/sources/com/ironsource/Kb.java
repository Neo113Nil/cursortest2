package com.ironsource;

/* loaded from: classes5.dex */
public final class Kb {
    public final void a(java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        if (z && android.text.TextUtils.isEmpty(com.ironsource.mediationsdk.p.h().k()) && map != null && !map.isEmpty()) {
            for (java.lang.String str : map.keySet()) {
                if (com.ironsource.mediationsdk.utils.IronSourceUtils.a(str)) {
                    java.lang.String str2 = map.get(str);
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.p.h().f(str);
                    return;
                }
            }
        }
    }
}
