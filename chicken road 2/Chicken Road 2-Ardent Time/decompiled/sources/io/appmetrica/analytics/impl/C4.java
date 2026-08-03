package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class C4 extends io.appmetrica.analytics.impl.Ff {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.B4 f4163a;

    public C4(io.appmetrica.analytics.impl.C0813x4 c0813x4) {
        this.f4163a = new io.appmetrica.analytics.impl.B4(c0813x4);
    }

    @Override // io.appmetrica.analytics.impl.Ff
    public final io.appmetrica.analytics.impl.W8 a(int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int ordinal = io.appmetrica.analytics.impl.EnumC0251bb.a(i2).ordinal();
        if (ordinal == 12) {
            arrayList.add(this.f4163a.f4094a);
        } else if (ordinal == 14) {
            arrayList.add(this.f4163a.f4095b);
        } else if (ordinal == 34) {
            arrayList.add(this.f4163a.f4096c);
        }
        return new io.appmetrica.analytics.impl.V8(arrayList);
    }
}
