package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ii implements InterfaceC0586j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6110a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0586j3 f6111b;

    public Ii(Object obj, InterfaceC0586j3 interfaceC0586j3) {
        this.f6110a = obj;
        this.f6111b = interfaceC0586j3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0586j3
    public final int getBytesTruncated() {
        return this.f6111b.getBytesTruncated();
    }

    public final String toString() {
        return "Result{result=" + this.f6110a + ", metaInfo=" + this.f6111b + '}';
    }
}
