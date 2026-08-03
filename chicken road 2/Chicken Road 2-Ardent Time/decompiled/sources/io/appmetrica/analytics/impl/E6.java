package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E6 implements io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C6 f4253a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f4254b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f4255c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f4256d = new java.util.HashSet();

    public E6(io.appmetrica.analytics.impl.C6 c6) {
        this.f4253a = c6;
        this.f4254b = ((io.appmetrica.analytics.impl.D6) c6).a();
    }

    public final synchronized void a(java.lang.Boolean bool) {
        try {
            if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
                if (this.f4254b == null) {
                }
            }
            boolean equals = java.lang.Boolean.FALSE.equals(bool);
            this.f4254b = java.lang.Boolean.valueOf(equals);
            ((io.appmetrica.analytics.impl.D6) this.f4253a).f4189a.c(equals).b();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(java.lang.Boolean bool) {
        if (this.f4254b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return java.lang.Boolean.TRUE.equals(this.f4254b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(java.lang.String str) {
        boolean z2;
        if (!this.f4255c.contains(str)) {
            z2 = java.lang.Boolean.TRUE.equals(this.f4254b);
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        java.lang.Boolean bool;
        try {
            bool = this.f4254b;
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return bool == null ? this.f4256d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(java.lang.String str, java.lang.Boolean bool) {
        try {
            if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
                if (!this.f4256d.contains(str) && !this.f4255c.contains(str)) {
                }
            }
            if (((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool, java.lang.Boolean.TRUE)).booleanValue()) {
                this.f4256d.add(str);
                this.f4255c.remove(str);
            } else {
                this.f4255c.add(str);
                this.f4256d.remove(str);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
