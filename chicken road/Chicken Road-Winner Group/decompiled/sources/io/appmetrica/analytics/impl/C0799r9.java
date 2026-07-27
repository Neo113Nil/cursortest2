package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0392bf f8205a;

    /* renamed from: b, reason: collision with root package name */
    public final zo f8206b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f8207c;

    /* renamed from: d, reason: collision with root package name */
    public final S6 f8208d;

    /* renamed from: e, reason: collision with root package name */
    public final M8 f8209e;
    public final Ok f;

    /* renamed from: g, reason: collision with root package name */
    public final C0583j0 f8210g;

    /* renamed from: h, reason: collision with root package name */
    public final Y8 f8211h;

    /* renamed from: i, reason: collision with root package name */
    public final C0511g5 f8212i;

    /* renamed from: j, reason: collision with root package name */
    public final TimeProvider f8213j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8214k;

    /* renamed from: l, reason: collision with root package name */
    public long f8215l;

    /* renamed from: m, reason: collision with root package name */
    public int f8216m;

    public C0799r9(C0392bf c0392bf, zo zoVar, Wk wk, S6 s6, C0583j0 c0583j0, M8 m8, Ok ok, int i3, C0511g5 c0511g5, Y8 y8, SystemTimeProvider systemTimeProvider) {
        this.f8205a = c0392bf;
        this.f8206b = zoVar;
        this.f8207c = wk;
        this.f8208d = s6;
        this.f8210g = c0583j0;
        this.f8209e = m8;
        this.f = ok;
        this.f8214k = i3;
        this.f8211h = y8;
        this.f8213j = systemTimeProvider;
        this.f8212i = c0511g5;
        this.f8215l = c0392bf.i();
        this.f8216m = c0392bf.h();
    }

    public final void a(W5 w5, Yk yk) {
        Map map = w5.f6789p;
        Ok ok = this.f;
        ok.getClass();
        map.putAll(new HashMap(ok.f6369b));
        w5.c(this.f8205a.j());
        w5.f6788o = Integer.valueOf(this.f8206b.b());
        C0558i0 a3 = this.f8210g.a();
        M8 m8 = this.f8209e;
        m8.getClass();
        L8 l8 = (L8) m8.f6280b.a(EnumC0569ib.a(w5.f6778d));
        S6 s6 = this.f8208d;
        E8 a4 = l8.a(w5);
        int i3 = w5.f6778d;
        Y8 y8 = this.f8211h;
        C0746p7 c0746p7 = new C0746p7(s6.f6559g, yk, i3, y8, a4, (C0756ph) s6.f6560h.f7202k.a(), a3);
        Long valueOf = Long.valueOf(yk.f6876a);
        EnumC0372al enumC0372al = yk.f6879d;
        Long valueOf2 = Long.valueOf(yk.f6877b);
        EnumC0569ib a5 = EnumC0569ib.a(c0746p7.f8057h.f6778d);
        long j3 = 0;
        if (!D9.f5839g.contains(EnumC0569ib.a(i3))) {
            zo zoVar = y8.f6859b;
            synchronized (zoVar) {
                j3 = zoVar.f8715a.a().optLong("global_number", 0L);
            }
            y8.f6859b.b(1 + j3);
        }
        s6.a(s6.f6564l.fromModel(new C0668m7(valueOf, enumC0372al, valueOf2, a5, Long.valueOf(j3), Long.valueOf(yk.f6878c), c0746p7.a())));
        this.f8212i.f7329a.h();
    }
}
