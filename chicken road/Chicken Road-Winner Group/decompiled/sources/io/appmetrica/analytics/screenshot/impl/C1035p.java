package io.appmetrica.analytics.screenshot.impl;

import e2.AbstractC0290e;
import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9066a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9067b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9068c;

    public C1035p(boolean z3, List list, long j3) {
        this.f9066a = z3;
        this.f9067b = list;
        this.f9068c = j3;
    }

    public final long a() {
        return this.f9068c;
    }

    public final boolean b() {
        return this.f9066a;
    }

    public final List c() {
        return this.f9067b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f9066a + ", mediaStoreColumnNames='" + this.f9067b + "', detectWindowSeconds=" + this.f9068c + ')';
    }

    public C1035p() {
        this(new O().f8997a, AbstractC0290e.Z(new O().f8999c), new O().f8998b);
    }
}
