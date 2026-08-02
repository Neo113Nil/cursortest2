package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class oa {
    public static java.lang.String b(com.facetec.sdk.mv mvVar) {
        java.lang.String f = mvVar.f();
        java.lang.String j = mvVar.j();
        if (j == null) {
            return f;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(f);
        sb.append('?');
        sb.append(j);
        return sb.toString();
    }
}
