package com.facetec.sdk;

/* loaded from: classes8.dex */
enum x {
    NOT_RAN(0),
    NOT_DETECTED(1),
    DETECTED(2);


    /* renamed from: a, reason: collision with root package name */
    final int f3773a;

    x(int i) {
        this.f3773a = i;
    }

    static com.facetec.sdk.x a(int i) {
        for (com.facetec.sdk.x xVar : values()) {
            if (xVar.f3773a == i) {
                return xVar;
            }
        }
        throw new java.lang.IllegalArgumentException();
    }
}
