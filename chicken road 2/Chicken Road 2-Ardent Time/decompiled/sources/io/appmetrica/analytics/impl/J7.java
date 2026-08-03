package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class J7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f4488a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4489b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4490c;

    public J7(java.lang.String str, java.util.HashMap hashMap, java.lang.String str2) {
        this.f4489b = str;
        this.f4488a = hashMap;
        this.f4490c = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeferredDeeplinkState{mParameters=");
        sb.append(this.f4488a);
        sb.append(", mDeeplink='");
        sb.append(this.f4489b);
        sb.append("', mUnparsedReferrer='");
        return B1.a.j(sb, this.f4490c, "'}");
    }
}
