package com.ironsource;

/* renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3132ka {
    public static java.util.Map<java.lang.String, java.lang.Object> a(java.lang.Object[][] objArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (objArr != null) {
            try {
                for (java.lang.Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
        }
        return hashMap;
    }
}
