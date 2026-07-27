package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class C6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Jg f5786a;

    public C6() {
        this(new Jg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0460e6 fromModel(B6 b6) {
        C0460e6 fromModel = this.f5786a.fromModel(b6.f5756a);
        fromModel.f7224g = 1;
        C0435d6 c0435d6 = new C0435d6();
        fromModel.f7225h = c0435d6;
        c0435d6.f7142a = StringUtils.correctIllFormedString(b6.f5757b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C6(Jg jg) {
        this.f5786a = jg;
    }

    public final B6 a(C0460e6 c0460e6) {
        throw new UnsupportedOperationException();
    }
}
