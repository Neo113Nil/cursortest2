package com.applovin.impl;

import com.applovin.impl.i6;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f4355a;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.sdk.l lVar) {
        if (f4355a) {
            return;
        }
        lVar.E().a(h2.e1, "no_ads_loaded");
    }

    public static void b(final com.applovin.impl.sdk.l lVar) {
        Long l = (Long) lVar.a(v3.A8);
        if (l.longValue() <= 0) {
            return;
        }
        lVar.s0().a(new x6(lVar, true, "submitIntegrationErrorReport", new Runnable() { // from class: com.applovin.impl.o2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                o2.a(com.applovin.impl.sdk.l.this);
            }
        }), i6.b.OTHER, TimeUnit.SECONDS.toMillis(l.longValue()));
    }

    public static void a() {
        f4355a = true;
    }
}
