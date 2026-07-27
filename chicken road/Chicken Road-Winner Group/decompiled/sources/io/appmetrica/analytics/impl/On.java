package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class On implements InterfaceC0586j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6370a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0586j3 f6371b;

    public On(Object obj, InterfaceC0586j3 interfaceC0586j3) {
        this.f6370a = obj;
        this.f6371b = interfaceC0586j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0586j3
    public final int getBytesTruncated() {
        return this.f6371b.getBytesTruncated();
    }

    public final String toString() {
        return "TrimmingResult{value=" + this.f6370a + ", metaInfo=" + this.f6371b + '}';
    }
}
