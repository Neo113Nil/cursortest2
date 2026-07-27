package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class Zg {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6911a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0475el f6912b;

    /* renamed from: c, reason: collision with root package name */
    public final C0879ub f6913c = new C0879ub();

    /* renamed from: d, reason: collision with root package name */
    public final C0924w4 f6914d = new C0924w4(new C0451dm(), new C0898v4(), null);

    /* renamed from: e, reason: collision with root package name */
    public final Consumer f6915e;

    public Zg(Context context, final InterfaceC0615k6 interfaceC0615k6, final EnumC0569ib enumC0569ib, InterfaceC0475el interfaceC0475el) {
        this.f6911a = context;
        this.f6912b = interfaceC0475el;
        this.f6915e = new Consumer() { // from class: io.appmetrica.analytics.impl.So
            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
            public final void consume(Object obj) {
                Zg.a(EnumC0569ib.this, interfaceC0615k6, this, (C0776qb) obj);
            }
        };
    }

    public static final void a(EnumC0569ib enumC0569ib, InterfaceC0615k6 interfaceC0615k6, Zg zg, C0776qb c0776qb) {
        String str = c0776qb.f8147h;
        X3 x3 = new X3(str, c0776qb.f8145e, c0776qb.f, c0776qb.f8146g, c0776qb.f8148i);
        String str2 = c0776qb.f8142b;
        byte[] bArr = c0776qb.f8141a;
        int i3 = c0776qb.f8143c;
        HashMap hashMap = c0776qb.f8144d;
        String str3 = c0776qb.f8149j;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str);
        Set set = D9.f5834a;
        U3 u3 = new U3(bArr, str2, enumC0569ib.f7538a, orCreatePublicLogger);
        u3.f6705q = hashMap;
        u3.f6780g = i3;
        u3.f6777c = str3;
        ((Xg) interfaceC0615k6).a(x3, u3, zg.f6914d);
    }
}
