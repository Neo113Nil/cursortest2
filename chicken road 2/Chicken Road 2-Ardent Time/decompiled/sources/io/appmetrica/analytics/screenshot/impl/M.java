package io.appmetrica.analytics.screenshot.impl;

/* loaded from: classes.dex */
public final class M implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.screenshot.impl.Y f7506a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.S fromModel(io.appmetrica.analytics.screenshot.impl.J j2) {
        io.appmetrica.analytics.screenshot.impl.S s2 = new io.appmetrica.analytics.screenshot.impl.S();
        s2.f7521a = j2.f7501a;
        io.appmetrica.analytics.screenshot.impl.W w2 = j2.f7502b;
        s2.f7522b = w2 != null ? this.f7506a.fromModel(w2) : null;
        return s2;
    }

    public M(io.appmetrica.analytics.screenshot.impl.Y y2) {
        this.f7506a = y2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(io.appmetrica.analytics.screenshot.impl.Y y2, int i2, kotlin.jvm.internal.e eVar) {
        this(y2);
        if ((i2 & 1) != 0) {
            y2 = new io.appmetrica.analytics.screenshot.impl.Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.screenshot.impl.J toModel(io.appmetrica.analytics.screenshot.impl.S s2) {
        return new io.appmetrica.analytics.screenshot.impl.J(s2.f7521a, this.f7506a.toModel(s2.f7522b));
    }
}
