package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Di implements io.appmetrica.analytics.impl.InterfaceC0243b3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f4214a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0243b3 f4215b;

    public Di(java.lang.Object obj, io.appmetrica.analytics.impl.InterfaceC0243b3 interfaceC0243b3) {
        this.f4214a = obj;
        this.f4215b = interfaceC0243b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0243b3
    public final int getBytesTruncated() {
        return this.f4215b.getBytesTruncated();
    }

    public final java.lang.String toString() {
        return "Result{result=" + this.f4214a + ", metaInfo=" + this.f4215b + '}';
    }
}
