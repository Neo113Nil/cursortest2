package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f8870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8871b;

    public d(NetworkTask networkTask) {
        this.f8870a = networkTask;
        this.f8871b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f8871b.equals(((d) obj).f8871b);
    }

    public final int hashCode() {
        return this.f8871b.hashCode();
    }
}
