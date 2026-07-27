package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f8021a;

    /* renamed from: b, reason: collision with root package name */
    public final C0868o6 f8022b;

    public C0578d0() {
        this(new W(new C1168zn()), new C0868o6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(C0552c0 c0552c0) {
        Z5 z5 = new Z5();
        z5.f7772a = this.f8021a.fromModel(c0552c0.f7962a);
        String str = c0552c0.f7963b;
        if (str != null) {
            z5.f7773b = str;
        }
        z5.f7774c = this.f8022b.a(c0552c0.f7964c);
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0578d0(W w3, C0868o6 c0868o6) {
        this.f8021a = w3;
        this.f8022b = c0868o6;
    }

    public final C0552c0 a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
