package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690n3 implements ProtobufConverter {
    public final C0838sm a(C0638l3 c0638l3) {
        C0838sm c0838sm = new C0838sm();
        c0838sm.f8319a = c0638l3.f7732a;
        return c0838sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0838sm c0838sm = new C0838sm();
        c0838sm.f8319a = ((C0638l3) obj).f7732a;
        return c0838sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0638l3(((C0838sm) obj).f8319a);
    }

    public final C0638l3 a(C0838sm c0838sm) {
        return new C0638l3(c0838sm.f8319a);
    }
}
