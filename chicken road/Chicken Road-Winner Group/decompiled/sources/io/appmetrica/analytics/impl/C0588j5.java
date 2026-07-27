package io.appmetrica.analytics.impl;

import android.content.Context;
import d2.C0274d;
import e2.AbstractC0293h;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0588j5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0537h5 f7589a;

    /* renamed from: b, reason: collision with root package name */
    public final C0563i5 f7590b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f7591c;

    /* renamed from: d, reason: collision with root package name */
    public final X4 f7592d;

    /* renamed from: e, reason: collision with root package name */
    public final C0898v4 f7593e;
    public final AbstractC0408c5 f;

    /* renamed from: g, reason: collision with root package name */
    protected final C0605jm f7594g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0678mh f7595h;

    /* renamed from: i, reason: collision with root package name */
    public final M8 f7596i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f7597j;

    /* renamed from: k, reason: collision with root package name */
    public final Mb f7598k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1005z9 f7599l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7600m;

    public C0588j5(Context context, X4 x4, C0898v4 c0898v4, AbstractC0408c5 abstractC0408c5, C0605jm c0605jm, InterfaceC0678mh interfaceC0678mh, ICommonExecutor iCommonExecutor, int i3, Mb mb, InterfaceC1005z9 interfaceC1005z9) {
        this(context, x4, c0898v4, abstractC0408c5, c0605jm, interfaceC0678mh, iCommonExecutor, new M8(), i3, new C0537h5(c0898v4.f8473a), new C0563i5(context, x4), mb, interfaceC1005z9);
    }

    public static C0463e9 c(C0459e5 c0459e5) {
        return new C0463e9(c0459e5);
    }

    public final R8 a() {
        Context context = this.f7591c;
        X4 x4 = this.f7592d;
        return new R8(new W8(context, x4), this.f7600m);
    }

    public final S6 b(C0459e5 c0459e5) {
        return new S6(c0459e5, C0513g7.a(this.f7591c).c(this.f7592d), new O6(c0459e5.c()), new C0694n7());
    }

    public final C0537h5 d() {
        return this.f7589a;
    }

    public final C0563i5 e() {
        return this.f7590b;
    }

    public final zo f() {
        zo zoVar;
        Do c0568ia;
        Co D3 = C0878ua.f8414H.D();
        X4 x4 = this.f7592d;
        synchronized (D3) {
            try {
                String valueOf = String.valueOf(x4);
                LinkedHashMap linkedHashMap = D3.f5817b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    C0392bf c0392bf = new C0392bf(C0513g7.a(D3.f5816a).b(x4));
                    if (x4.d()) {
                        String str = "appmetrica_vital_" + x4.f6823b + ".dat";
                        c0568ia = new C0692n5(AbstractC0293h.S(new C0274d(str, new C0568ia(D3.f5816a, str)), new C0274d("appmetrica_vital_main.dat", new C0568ia(D3.f5816a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0568ia = new C0568ia(D3.f5816a, "appmetrica_vital_" + x4.f6823b + ".dat");
                    }
                    obj = new zo(c0392bf, c0568ia, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                zoVar = (zo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zoVar;
    }

    public C0588j5(Context context, X4 x4, C0898v4 c0898v4, AbstractC0408c5 abstractC0408c5, C0605jm c0605jm, InterfaceC0678mh interfaceC0678mh, ICommonExecutor iCommonExecutor, M8 m8, int i3, C0537h5 c0537h5, C0563i5 c0563i5, Mb mb, InterfaceC1005z9 interfaceC1005z9) {
        this.f7591c = context;
        this.f7592d = x4;
        this.f7593e = c0898v4;
        this.f = abstractC0408c5;
        this.f7594g = c0605jm;
        this.f7595h = interfaceC0678mh;
        this.f7597j = iCommonExecutor;
        this.f7596i = m8;
        this.f7600m = i3;
        this.f7589a = c0537h5;
        this.f7590b = c0563i5;
        this.f7598k = mb;
        this.f7599l = interfaceC1005z9;
    }

    public final Ok c() {
        return new Ok(this.f7591c, this.f7592d);
    }

    public final Ai d(C0459e5 c0459e5) {
        Ai ai = new Ai(c0459e5, this.f.a(), this.f7597j);
        Mb mb = this.f7598k;
        synchronized (mb) {
            mb.f6283c.add(ai);
        }
        return ai;
    }

    public final Vg a(C0459e5 c0459e5) {
        return new Vg(new C0704nh(c0459e5, this.f7595h, new K3()), this.f7594g, new C0626kh(this.f7593e));
    }

    public static Wk a(C0459e5 c0459e5, zo zoVar, C0434d5 c0434d5) {
        Vk vk = new Vk(zoVar);
        return new Wk(c0459e5, vk, c0434d5, new C0723oa(c0459e5, vk, new Zk(c0459e5.h(), C0723oa.f7988g), AbstractC0921w1.a(), new SystemTimeProvider()), new H2(c0459e5, vk, new Zk(c0459e5.h(), H2.f6008g), AbstractC0921w1.a(), new SystemTimeProvider()));
    }

    public static Z4 b() {
        return new Z4();
    }

    public final C0871u3 b(C0392bf c0392bf) {
        Context context = this.f7591c;
        return new C0871u3(context, c0392bf, context.getPackageName(), new SafePackageManager());
    }

    public final C0799r9 a(C0392bf c0392bf, zo zoVar, Wk wk, S6 s6, C0583j0 c0583j0, Ok ok, Ai ai) {
        return new C0799r9(c0392bf, zoVar, wk, s6, c0583j0, this.f7596i, ok, this.f7600m, new C0511g5(ai), new Y8(zoVar, new Z8(zoVar)), new SystemTimeProvider());
    }

    public static C0989yi a(C0459e5 c0459e5, C0463e9 c0463e9) {
        return new C0989yi(c0463e9, c0459e5);
    }

    public InterfaceC0955x9 a(C9 c9, S6 s6, Vg vg, C0898v4 c0898v4, X4 x4, C0392bf c0392bf) {
        return this.f7599l.a(c9, s6, vg, c0898v4, x4, c0392bf).a();
    }

    public final C0948x2 a(C0392bf c0392bf) {
        return new C0948x2(this.f7592d, c0392bf);
    }
}
