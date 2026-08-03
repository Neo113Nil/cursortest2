package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.k1 f4299a;
    public final android.net.Uri b;
    public final java.util.List c;

    public l1(com.fyber.inneractive.sdk.util.k1 k1Var, android.net.Uri uri, java.util.List list) {
        this.f4299a = k1Var;
        this.b = uri;
        this.c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f4299a.mPriority.compareTo(((com.fyber.inneractive.sdk.util.l1) obj).f4299a.mPriority);
    }
}
