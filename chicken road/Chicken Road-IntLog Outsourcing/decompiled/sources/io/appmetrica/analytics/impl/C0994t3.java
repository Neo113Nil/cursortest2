package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994t3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1130ya f9275a;

    public C0994t3() {
        this(new C1130ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(List<String> list) {
        On a6 = this.f9275a.a((List<Object>) list);
        C0792l8 c0792l8 = new C0792l8();
        c0792l8.f8678a = StringUtils.getUTF8Bytes((List<String>) a6.f7230a);
        InterfaceC0735j3 interfaceC0735j3 = a6.f7231b;
        int i2 = ((C1021u4) interfaceC0735j3).f8378a;
        return new Ii(c0792l8, interfaceC0735j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0994t3(C1130ya c1130ya) {
        this.f9275a = c1130ya;
    }

    public final List<String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
