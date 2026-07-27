package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842n6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f8837a;

    /* renamed from: b, reason: collision with root package name */
    public final Zg f8838b;

    public C0842n6(Context context, InterfaceC0764k6 interfaceC0764k6, EnumC0718ib enumC0718ib, InterfaceC0624el interfaceC0624el, Executor executor, String str) {
        this.f8837a = executor;
        this.f8838b = new Zg(context, interfaceC0764k6, enumC0718ib, interfaceC0624el);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f8837a;
        Zg zg = this.f8838b;
        C1028ub c1028ub = zg.f7791c;
        Consumer consumer = zg.f7793e;
        Context context = zg.f7789a;
        if (C0665ga.f8264c == null) {
            synchronized (kotlin.jvm.internal.t.a(C0665ga.class)) {
                if (C0665ga.f8264c == null) {
                    C0665ga.f8264c = new C0665ga(context);
                }
            }
        }
        C0665ga c0665ga = C0665ga.f8264c;
        if (c0665ga != null) {
            executor.execute(new Yf(file, c1028ub, c1028ub, consumer, c0665ga, zg.f7790b));
        } else {
            kotlin.jvm.internal.i.l("INSTANCE");
            throw null;
        }
    }
}
