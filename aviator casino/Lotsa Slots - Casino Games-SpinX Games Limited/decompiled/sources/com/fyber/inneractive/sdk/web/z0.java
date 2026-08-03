package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class z0 extends android.util.LruCache {
    public z0() {
        super(1048576);
    }

    @Override // android.util.LruCache
    public final int sizeOf(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.fyber.inneractive.sdk.web.c1 c1Var = (com.fyber.inneractive.sdk.web.c1) obj2;
        int i = 0;
        for (java.lang.String str2 : c1Var.b.keySet()) {
            if (str2 != null && (str = (java.lang.String) c1Var.b.get(str2)) != null) {
                i += str.length() + str2.length();
            }
        }
        return i + c1Var.f4328a.length;
    }
}
