package io.appmetrica.analytics.screenshot.impl;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7563a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f7564b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7565c;

    public C0895k(boolean z2, java.util.List list, long j2) {
        this.f7563a = z2;
        this.f7564b = list;
        this.f7565c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!io.appmetrica.analytics.screenshot.impl.C0895k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        io.appmetrica.analytics.screenshot.impl.C0895k c0895k = (io.appmetrica.analytics.screenshot.impl.C0895k) obj;
        return this.f7563a == c0895k.f7563a && kotlin.jvm.internal.i.a(this.f7564b, c0895k.f7564b) && this.f7565c == c0895k.f7565c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f7565c) + ((this.f7564b.hashCode() + (java.lang.Boolean.hashCode(this.f7563a) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f7563a + ", mediaStoreColumnNames=" + this.f7564b + ", detectWindowSeconds=" + this.f7565c + ')';
    }

    public C0895k(io.appmetrica.analytics.screenshot.impl.B b2) {
        this(b2.b(), b2.c(), b2.a());
    }
}
