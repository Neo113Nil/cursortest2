package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4497ka {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
            }
        }
        return hashMap;
    }
}
