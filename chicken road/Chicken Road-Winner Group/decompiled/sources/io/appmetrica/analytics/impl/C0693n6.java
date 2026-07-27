package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693n6 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f7909a;

    /* renamed from: b, reason: collision with root package name */
    public final Zg f7910b;

    public C0693n6(Context context, InterfaceC0615k6 interfaceC0615k6, EnumC0569ib enumC0569ib, InterfaceC0475el interfaceC0475el, Executor executor, String str) {
        this.f7909a = executor;
        this.f7910b = new Zg(context, interfaceC0615k6, enumC0569ib, interfaceC0475el);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.f7909a;
        Zg zg = this.f7910b;
        C0879ub c0879ub = zg.f6913c;
        Consumer consumer = zg.f6915e;
        Context context = zg.f6911a;
        if (C0516ga.f7364c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0516ga.class)) {
                if (C0516ga.f7364c == null) {
                    C0516ga.f7364c = new C0516ga(context);
                }
            }
        }
        C0516ga c0516ga = C0516ga.f7364c;
        if (c0516ga != null) {
            executor.execute(new Yf(file, c0879ub, c0879ub, consumer, c0516ga, zg.f6912b));
        } else {
            kotlin.jvm.internal.j.g("INSTANCE");
            throw null;
        }
    }
}
