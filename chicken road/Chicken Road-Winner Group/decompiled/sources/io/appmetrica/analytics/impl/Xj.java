package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xj {

    /* renamed from: a, reason: collision with root package name */
    public final String f6832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6833b;

    public Xj(String str, String str2) {
        this.f6832a = str;
        this.f6833b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReportingLazyEvent(eventName='");
        sb.append(this.f6832a);
        sb.append("', eventValue='");
        return B0.c.l(sb, this.f6833b, "')");
    }
}
