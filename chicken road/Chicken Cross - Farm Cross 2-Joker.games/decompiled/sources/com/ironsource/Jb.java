package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Jb {
    public final void a(Map<String, String> map, boolean z) {
        if (z && TextUtils.isEmpty(com.ironsource.mediationsdk.p.g().j()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.p.g().f(str);
                    return;
                }
            }
        }
    }
}
