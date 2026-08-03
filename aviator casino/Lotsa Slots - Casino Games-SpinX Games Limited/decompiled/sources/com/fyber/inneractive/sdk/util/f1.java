package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class f1 {
    public static java.lang.String a(java.lang.String str, java.util.HashMap hashMap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        boolean z = true;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            sb.append(z ? "?" : com.ironsource.X3.j.c);
            sb.append((java.lang.String) entry.getKey());
            sb.append(com.ironsource.X3.j.b);
            sb.append(android.net.Uri.encode((java.lang.String) entry.getValue()));
            z = false;
        }
        return sb.toString();
    }
}
