package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sj {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4972a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4973b;

    public Sj(java.lang.String str, java.lang.String str2) {
        this.f4972a = str;
        this.f4973b = str2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f4972a);
        sb.append("', eventValue='");
        return B1.a.j(sb, this.f4973b, "')");
    }
}
