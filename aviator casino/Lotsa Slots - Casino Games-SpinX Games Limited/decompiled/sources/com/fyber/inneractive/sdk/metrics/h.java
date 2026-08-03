package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3796a = java.util.UUID.randomUUID().toString();
    public final java.lang.String b;

    public h(java.lang.String str) {
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.fyber.inneractive.sdk.metrics.h.class != obj.getClass()) {
            return false;
        }
        return this.f3796a.equals(((com.fyber.inneractive.sdk.metrics.h) obj).f3796a);
    }

    public final int hashCode() {
        return this.f3796a.hashCode();
    }
}
