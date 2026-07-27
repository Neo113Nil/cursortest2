package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10044a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10045b;

    public C1182n(boolean z, long j2) {
        this.f10044a = z;
        this.f10045b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1182n.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C1182n c1182n = (C1182n) obj;
        return this.f10044a == c1182n.f10044a && this.f10045b == c1182n.f10045b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10045b) + (Boolean.hashCode(this.f10044a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        sb.append(this.f10044a);
        sb.append(", delaySeconds=");
        return AbstractC0279e.g(sb, this.f10045b, ')');
    }

    public C1182n(H h3) {
        this(h3.b(), h3.a());
    }
}
