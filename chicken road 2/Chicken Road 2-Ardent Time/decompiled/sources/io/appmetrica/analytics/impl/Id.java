package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Id {

    /* renamed from: a, reason: collision with root package name */
    public final s1.l f4451a;

    public Id(io.appmetrica.analytics.impl.Nd nd) {
        this.f4451a = nd;
    }

    public final io.appmetrica.analytics.impl.Jd a(android.content.Context context, io.appmetrica.analytics.impl.Sg sg) {
        return new io.appmetrica.analytics.impl.Jd(context, sg, this.f4451a, new H0.b(12), io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual");
    }

    public final io.appmetrica.analytics.impl.Jd b(android.content.Context context, io.appmetrica.analytics.impl.Sg sg) {
        return new io.appmetrica.analytics.impl.Jd(context, sg, this.f4451a, new H0.b(13), io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session");
    }

    public static final io.appmetrica.analytics.impl.InterfaceC0235al a(io.appmetrica.analytics.impl.G0 g02) {
        return new io.appmetrica.analytics.impl.Gd(g02.f4317f.f4363d);
    }

    public static final io.appmetrica.analytics.impl.InterfaceC0235al b(io.appmetrica.analytics.impl.G0 g02) {
        return new io.appmetrica.analytics.impl.X();
    }
}
