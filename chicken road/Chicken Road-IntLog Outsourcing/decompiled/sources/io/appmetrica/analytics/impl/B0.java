package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public abstract class B0 {
    public static I6 a(Handler handler, A0 a02) {
        return new I6(handler, a02);
    }

    public static Gf a(Context context, I6 i6) {
        return new Gf(context, i6);
    }

    public static Bi a(Gf gf, Context context, ICommonExecutor iCommonExecutor) {
        C0888p0 c0888p0 = new C0888p0(context, iCommonExecutor, C0736j4.l().e());
        return new Bi(c0888p0, new Un(new C0976sb()), new M4(gf), new C0598dk(context, c0888p0));
    }

    public static Sl a(Context context, Bi bi, C0515af c0515af, Handler handler) {
        return new Sl(bi, new C0522am(context, c0515af), handler);
    }

    public static C0878og a(Bi bi, C0515af c0515af, Handler handler) {
        return new C0878og(bi, c0515af, handler, c0515af.s());
    }

    public static C0880oi a(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        return new C0880oi(context, gf, bi, handler, sl);
    }

    public static C0745jd a(Context context) {
        return new C0745jd(C0736j4.l().f8484c.a(), C0736j4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
