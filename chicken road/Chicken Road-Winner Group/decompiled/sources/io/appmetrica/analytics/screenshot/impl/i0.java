package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9043a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9044b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9045c;

    public i0(boolean z3, List list, long j3) {
        this.f9043a = z3;
        this.f9044b = list;
        this.f9045c = j3;
    }

    public final long a() {
        return this.f9045c;
    }

    public final boolean b() {
        return this.f9043a;
    }

    public final List c() {
        return this.f9044b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f9043a + ", mediaStoreColumnNames=" + this.f9044b + ", detectWindowSeconds=" + this.f9045c + ')';
    }

    public i0(C1035p c1035p) {
        this(c1035p.b(), c1035p.c(), c1035p.a());
    }
}
