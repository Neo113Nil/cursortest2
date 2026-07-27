package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Gl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0512g6 fromModel(Hl hl) {
        C0512g6 c0512g6 = new C0512g6();
        c0512g6.f7331a = (String) WrapUtils.getOrDefault(hl.f6043a, c0512g6.f7331a);
        c0512g6.f7332b = (String) WrapUtils.getOrDefault(hl.f6044b, c0512g6.f7332b);
        c0512g6.f7333c = ((Integer) WrapUtils.getOrDefault(hl.f6045c, Integer.valueOf(c0512g6.f7333c))).intValue();
        c0512g6.f = ((Integer) WrapUtils.getOrDefault(hl.f6046d, Integer.valueOf(c0512g6.f))).intValue();
        c0512g6.f7334d = (String) WrapUtils.getOrDefault(hl.f6047e, c0512g6.f7334d);
        c0512g6.f7335e = ((Boolean) WrapUtils.getOrDefault(hl.f, Boolean.valueOf(c0512g6.f7335e))).booleanValue();
        return c0512g6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Hl a(C0512g6 c0512g6) {
        throw new UnsupportedOperationException();
    }
}
