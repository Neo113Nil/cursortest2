package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f7132a;

    /* renamed from: b, reason: collision with root package name */
    public final C0719o6 f7133b;

    public C0429d0() {
        this(new W(new C1019zn()), new C0719o6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(C0403c0 c0403c0) {
        Z5 z5 = new Z5();
        z5.f6894a = this.f7132a.fromModel(c0403c0.f7075a);
        String str = c0403c0.f7076b;
        if (str != null) {
            z5.f6895b = str;
        }
        z5.f6896c = this.f7133b.a(c0403c0.f7077c);
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0429d0(W w3, C0719o6 c0719o6) {
        this.f7132a = w3;
        this.f7133b = c0719o6;
    }

    public final C0403c0 a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
