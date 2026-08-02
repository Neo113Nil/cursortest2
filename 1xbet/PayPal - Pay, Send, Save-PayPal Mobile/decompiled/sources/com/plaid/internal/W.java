package com.plaid.internal;

/* loaded from: classes16.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.E5 f5958a;

    public W(com.plaid.internal.E5 e5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        this.f5958a = e5;
    }

    public final com.plaid.internal.X6 a(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "X6")) {
            return new com.plaid.internal.X6(this.f5958a);
        }
        throw new java.lang.IllegalArgumentException("Unknown crash api class: ".concat(java.lang.String.valueOf(str)));
    }
}
