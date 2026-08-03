package io.appmetrica.analytics.networktasks.impl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.networktasks.internal.NetworkTask f7370a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f7371b;

    public d(io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask) {
        this.f7370a = networkTask;
        this.f7371b = networkTask.description();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.appmetrica.analytics.networktasks.impl.d.class != obj.getClass()) {
            return false;
        }
        return this.f7371b.equals(((io.appmetrica.analytics.networktasks.impl.d) obj).f7371b);
    }

    public final int hashCode() {
        return this.f7371b.hashCode();
    }
}
