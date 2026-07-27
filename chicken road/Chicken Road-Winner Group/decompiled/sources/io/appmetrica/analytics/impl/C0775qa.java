package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775qa implements InterfaceC0415cc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0415cc
    public final C0515g9 a(C0772q7 c0772q7) {
        C0515g9 c0515g9 = null;
        if ((c0772q7 != null ? c0772q7.f8121b : null) != null && c0772q7.f8122c != null) {
            c0515g9 = new C0515g9();
            c0515g9.f7357b = c0772q7.f8121b.doubleValue();
            c0515g9.f7356a = c0772q7.f8122c.doubleValue();
            Integer num = c0772q7.f8123d;
            if (num != null) {
                c0515g9.f7361g = num.intValue();
            }
            Integer num2 = c0772q7.f8124e;
            if (num2 != null) {
                c0515g9.f7360e = num2.intValue();
            }
            Integer num3 = c0772q7.f;
            if (num3 != null) {
                c0515g9.f7359d = num3.intValue();
            }
            Integer num4 = c0772q7.f8125g;
            if (num4 != null) {
                c0515g9.f = num4.intValue();
            }
            Long l3 = c0772q7.f8126h;
            if (l3 != null) {
                c0515g9.f7358c = TimeUnit.MILLISECONDS.toSeconds(l3.longValue());
            }
            String str = c0772q7.f8127i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0515g9.f7362h = 1;
                } else if (str.equals("network")) {
                    c0515g9.f7362h = 2;
                }
            }
            String str2 = c0772q7.f8128j;
            if (str2 != null) {
                c0515g9.f7363i = str2;
            }
        }
        return c0515g9;
    }
}
