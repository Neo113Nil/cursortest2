package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Ee implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0968xm fromModel(De de) {
        C0968xm c0968xm = new C0968xm();
        c0968xm.f8622a = de.f5846a;
        c0968xm.f8623b = de.f5847b;
        return c0968xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0968xm c0968xm = (C0968xm) obj;
        return new De(c0968xm.f8622a, c0968xm.f8623b);
    }

    public final De a(C0968xm c0968xm) {
        return new De(c0968xm.f8622a, c0968xm.f8623b);
    }
}
