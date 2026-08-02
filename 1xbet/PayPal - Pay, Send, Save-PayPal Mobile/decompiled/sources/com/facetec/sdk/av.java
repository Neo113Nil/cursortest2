package com.facetec.sdk;

/* loaded from: classes8.dex */
final class av extends java.lang.Exception {
    av(java.lang.String str) {
        super(str);
    }

    av(java.lang.Throwable th) {
        super(th.getMessage(), th);
    }

    av(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }
}
