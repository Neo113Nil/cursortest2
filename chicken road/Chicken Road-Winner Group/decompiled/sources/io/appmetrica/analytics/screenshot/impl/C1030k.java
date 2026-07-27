package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9049a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9050b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9051c;

    public C1030k(boolean z3, List list, long j3) {
        this.f9049a = z3;
        this.f9050b = list;
        this.f9051c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1030k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C1030k c1030k = (C1030k) obj;
        return this.f9049a == c1030k.f9049a && kotlin.jvm.internal.j.a(this.f9050b, c1030k.f9050b) && this.f9051c == c1030k.f9051c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9051c) + ((this.f9050b.hashCode() + (Boolean.hashCode(this.f9049a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f9049a + ", mediaStoreColumnNames=" + this.f9050b + ", detectWindowSeconds=" + this.f9051c + ')';
    }

    public C1030k(B b3) {
        this(b3.b(), b3.c(), b3.a());
    }
}
