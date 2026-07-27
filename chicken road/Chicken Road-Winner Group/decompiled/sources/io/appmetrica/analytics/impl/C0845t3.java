package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845t3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0981ya f8327a;

    public C0845t3() {
        this(new C0981ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(List<String> list) {
        On a3 = this.f8327a.a((List<Object>) list);
        C0643l8 c0643l8 = new C0643l8();
        c0643l8.f7756a = StringUtils.getUTF8Bytes((List<String>) a3.f6370a);
        InterfaceC0586j3 interfaceC0586j3 = a3.f6371b;
        int i3 = ((C0872u4) interfaceC0586j3).f7472a;
        return new Ii(c0643l8, interfaceC0586j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0845t3(C0981ya c0981ya) {
        this.f8327a = c0981ya;
    }

    public final List<String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
