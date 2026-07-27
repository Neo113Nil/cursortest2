package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ii implements InterfaceC0735j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6960a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0735j3 f6961b;

    public Ii(Object obj, InterfaceC0735j3 interfaceC0735j3) {
        this.f6960a = obj;
        this.f6961b = interfaceC0735j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0735j3
    public final int getBytesTruncated() {
        return this.f6961b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f6960a + ", metaInfo=" + this.f6961b + '}';
    }
}
