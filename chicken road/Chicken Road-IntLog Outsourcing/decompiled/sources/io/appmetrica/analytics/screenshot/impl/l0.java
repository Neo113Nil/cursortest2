package io.appmetrica.analytics.screenshot.impl;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10039a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10040b;

    public l0(boolean z, long j2) {
        this.f10039a = z;
        this.f10040b = j2;
    }

    public final long a() {
        return this.f10040b;
    }

    public final boolean b() {
        return this.f10039a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        sb.append(this.f10039a);
        sb.append(", delaySeconds=");
        return AbstractC0279e.g(sb, this.f10040b, ')');
    }

    public l0(a0 a0Var) {
        this(a0Var.b(), a0Var.a());
    }
}
