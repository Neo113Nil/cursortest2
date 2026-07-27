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
        C0739p0 c0739p0 = new C0739p0(context, iCommonExecutor, C0587j4.l().e());
        return new Bi(c0739p0, new Un(new C0827sb()), new M4(gf), new C0449dk(context, c0739p0));
    }

    public static Sl a(Context context, Bi bi, C0366af c0366af, Handler handler) {
        return new Sl(bi, new C0373am(context, c0366af), handler);
    }

    public static C0729og a(Bi bi, C0366af c0366af, Handler handler) {
        return new C0729og(bi, c0366af, handler, c0366af.s());
    }

    public static C0731oi a(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        return new C0731oi(context, gf, bi, handler, sl);
    }

    public static C0596jd a(Context context) {
        return new C0596jd(C0587j4.l().f7572c.a(), C0587j4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
