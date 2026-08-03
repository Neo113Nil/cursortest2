package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class D0 {
    public static io.appmetrica.analytics.impl.B6 a(android.os.Handler handler, io.appmetrica.analytics.impl.C0 c02) {
        return new io.appmetrica.analytics.impl.B6(handler, c02);
    }

    public static io.appmetrica.analytics.impl.Bf a(android.content.Context context, io.appmetrica.analytics.impl.B6 b6) {
        return new io.appmetrica.analytics.impl.Bf(context, b6);
    }

    public static io.appmetrica.analytics.impl.C0801wi a(io.appmetrica.analytics.impl.Bf bf, android.content.Context context, io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor) {
        io.appmetrica.analytics.impl.C0602p0 c0602p0 = new io.appmetrica.analytics.impl.C0602p0(context, iCommonExecutor);
        return new io.appmetrica.analytics.impl.C0801wi(c0602p0, new io.appmetrica.analytics.impl.Sn(new io.appmetrica.analytics.impl.C0509lb()), new io.appmetrica.analytics.impl.F4(bf), new io.appmetrica.analytics.impl.Yj(context, c0602p0));
    }

    public static io.appmetrica.analytics.impl.Ol a(android.content.Context context, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler) {
        return new io.appmetrica.analytics.impl.Ol(c0801wi, new io.appmetrica.analytics.impl.Wl(context, ve), handler);
    }

    public static io.appmetrica.analytics.impl.C0462jg a(io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Ve ve, android.os.Handler handler) {
        return new io.appmetrica.analytics.impl.C0462jg(c0801wi, ve, handler, ve.s());
    }

    public static io.appmetrica.analytics.impl.C0464ji a(android.content.Context context, io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.impl.C0801wi c0801wi, android.os.Handler handler, io.appmetrica.analytics.impl.Ol ol) {
        return new io.appmetrica.analytics.impl.C0464ji(context, bf, c0801wi, handler, ol);
    }

    public static io.appmetrica.analytics.impl.C0279cd a(android.content.Context context) {
        return new io.appmetrica.analytics.impl.C0279cd(io.appmetrica.analytics.impl.C0244b4.l().f5493c.a(), io.appmetrica.analytics.impl.C0244b4.l().b(context), "client_modules", new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider());
    }
}
