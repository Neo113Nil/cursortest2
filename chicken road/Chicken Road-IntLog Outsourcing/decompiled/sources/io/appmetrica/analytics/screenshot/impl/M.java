package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f9974a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j2) {
        S s2 = new S();
        s2.f9989a = j2.f9969a;
        W w3 = j2.f9970b;
        s2.f9990b = w3 != null ? this.f9974a.fromModel(w3) : null;
        return s2;
    }

    public M(Y y5) {
        this.f9974a = y5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y5, int i2, kotlin.jvm.internal.e eVar) {
        this(y5);
        if ((i2 & 1) != 0) {
            y5 = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s2) {
        return new J(s2.f9989a, this.f9974a.toModel(s2.f9990b));
    }
}
