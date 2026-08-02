package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750wk {

    /* renamed from: a, reason: collision with root package name */
    public final Wq f16144a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16145b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f16146c;

    /* renamed from: d, reason: collision with root package name */
    public final Nk f16147d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f16148e;
    public final C1482ql f;

    /* renamed from: g, reason: collision with root package name */
    public final C1041gs f16149g;

    /* renamed from: h, reason: collision with root package name */
    public final Xm f16150h;

    public C1750wk(Wq wq, Executor executor, Wk wk, Context context, C1482ql c1482ql, C1041gs c1041gs, Xm xm, Nk nk) {
        this.f16144a = wq;
        this.f16145b = executor;
        this.f16146c = wk;
        this.f16148e = context;
        this.f = c1482ql;
        this.f16149g = c1041gs;
        this.f16150h = xm;
        this.f16147d = nk;
    }

    public static final void b(InterfaceC0677Re interfaceC0677Re) {
        interfaceC0677Re.s0("/videoClicked", AbstractC1776x9.f16248h);
        C1028gf I5 = interfaceC0677Re.I();
        synchronized (I5.f13616n) {
            I5.f13599B = true;
        }
        interfaceC0677Re.s0("/getNativeAdViewSignals", AbstractC1776x9.f16258s);
        interfaceC0677Re.s0("/getNativeClickMeta", AbstractC1776x9.f16259t);
    }

    public final void a(InterfaceC0677Re interfaceC0677Re) {
        b(interfaceC0677Re);
        interfaceC0677Re.s0("/video", AbstractC1776x9.f16251l);
        interfaceC0677Re.s0("/videoMeta", AbstractC1776x9.f16252m);
        interfaceC0677Re.s0("/precache", new C1551s9(27));
        interfaceC0677Re.s0("/delayPageLoaded", AbstractC1776x9.f16255p);
        interfaceC0677Re.s0("/instrument", AbstractC1776x9.f16253n);
        interfaceC0677Re.s0("/log", AbstractC1776x9.f16247g);
        Object obj = null;
        interfaceC0677Re.s0("/click", new C1641u9(0, obj, obj));
        if (this.f16144a.f12096b != null) {
            C1028gf I5 = interfaceC0677Re.I();
            synchronized (I5.f13616n) {
                I5.f13601D = true;
            }
            interfaceC0677Re.s0("/open", new E9(null, null, null, null, null));
        } else {
            interfaceC0677Re.I().b(false);
        }
        if (P2.o.f4767B.f4790x.e(interfaceC0677Re.getContext())) {
            HashMap hashMap = new HashMap();
            if (interfaceC0677Re.v() != null) {
                hashMap = interfaceC0677Re.v().f10532w0;
            }
            interfaceC0677Re.s0("/logScionEvent", new C1641u9(1, interfaceC0677Re.getContext(), hashMap));
        }
    }
}
