package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mn implements io.appmetrica.analytics.impl.InterfaceC0243b3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f4694a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0243b3 f4695b;

    public Mn(java.lang.Object obj, io.appmetrica.analytics.impl.InterfaceC0243b3 interfaceC0243b3) {
        this.f4694a = obj;
        this.f4695b = interfaceC0243b3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0243b3
    public final int getBytesTruncated() {
        return this.f4695b.getBytesTruncated();
    }

    public final java.lang.String toString() {
        return "TrimmingResult{value=" + this.f4694a + ", metaInfo=" + this.f4695b + '}';
    }
}
