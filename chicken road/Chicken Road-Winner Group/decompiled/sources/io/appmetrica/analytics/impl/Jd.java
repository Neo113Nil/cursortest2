package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Set;

/* loaded from: classes.dex */
public final class Jd implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Xg f6156a;

    /* renamed from: b, reason: collision with root package name */
    public final F0 f6157b;

    /* renamed from: c, reason: collision with root package name */
    public final Sd f6158c;

    public Jd(Xg xg, F0 f0, Sd sd) {
        this.f6156a = xg;
        this.f6157b = f0;
        this.f6158c = sd;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(String str) {
        Xg xg = this.f6156a;
        F0 f0 = this.f6157b;
        String str2 = f0.f5920a;
        String str3 = f0.f5921b;
        Integer valueOf = Integer.valueOf(f0.f5923d);
        F0 f02 = this.f6157b;
        X3 x3 = new X3(str2, str3, valueOf, f02.f5924e, f02.f5922c);
        Sd sd = this.f6158c;
        EnumC0569ib enumC0569ib = sd.f6597b;
        E0 e02 = sd.f6596a;
        String str4 = e02.f5866c;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(e02.f.f5920a);
        Set set = D9.f5834a;
        Bundle bundle = new Bundle();
        bundle.putString("payload_crash_id", str4);
        U3 u3 = new U3("", "", enumC0569ib.f7538a, orCreatePublicLogger);
        if (str != null) {
            u3.f(str);
        }
        u3.f6786m = bundle;
        u3.f6777c = sd.f6596a.f.f;
        xg.a(x3, u3, new C0924w4(new C0451dm(), new C0898v4(), null));
    }
}
