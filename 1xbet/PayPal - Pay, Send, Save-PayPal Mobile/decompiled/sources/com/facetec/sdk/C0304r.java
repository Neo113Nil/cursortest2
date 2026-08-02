package com.facetec.sdk;

/* renamed from: com.facetec.sdk.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C0304r {
    C0304r() {
    }

    static java.lang.String e(java.lang.Throwable th) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
