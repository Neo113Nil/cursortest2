package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822s6 implements InterfaceC0388bb {

    /* renamed from: a, reason: collision with root package name */
    public final C0848t6 f8289a;

    /* renamed from: b, reason: collision with root package name */
    public final Kh f8290b;

    public C0822s6(C0848t6 c0848t6) {
        this.f8289a = c0848t6;
        this.f8290b = c0848t6.a();
        C0587j4.l().getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0388bb
    public final void a(Sn sn) {
        Bi bi = this.f8289a.f8331a;
        Ah a3 = bi.a(sn, this.f8290b);
        Kh kh = a3.f5703e;
        Tl tl = bi.f5776e;
        if (tl != null) {
            kh.f6383b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f5774c.b(a3);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Unhandled exception received: " + sn, new Object[0]);
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        Map<String, String> map = appMetricaConfig.errorEnvironment;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Kh kh = this.f8290b;
                String key = entry.getKey();
                String value = entry.getValue();
                synchronized (kh) {
                    I8 i8 = kh.f6184c;
                    i8.f6091b.b(i8.f6090a, key, value);
                }
            }
        }
    }
}
