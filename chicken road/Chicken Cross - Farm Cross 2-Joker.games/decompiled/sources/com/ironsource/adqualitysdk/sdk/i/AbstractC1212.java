package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹾ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1212 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final HashMap f3414 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5923(String str) {
        HashMap hashMap = f3414;
        String str2 = (String) hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        hashMap.put(str, str);
        return str;
    }
}
