package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0924qa implements InterfaceC0564cc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0564cc
    public final C0664g9 a(C0921q7 c0921q7) {
        C0664g9 c0664g9 = null;
        if ((c0921q7 != null ? c0921q7.f9060b : null) != null && c0921q7.f9061c != null) {
            c0664g9 = new C0664g9();
            c0664g9.f8256b = c0921q7.f9060b.doubleValue();
            c0664g9.f8255a = c0921q7.f9061c.doubleValue();
            Integer num = c0921q7.f9062d;
            if (num != null) {
                c0664g9.f8261g = num.intValue();
            }
            Integer num2 = c0921q7.f9063e;
            if (num2 != null) {
                c0664g9.f8259e = num2.intValue();
            }
            Integer num3 = c0921q7.f9064f;
            if (num3 != null) {
                c0664g9.f8258d = num3.intValue();
            }
            Integer num4 = c0921q7.f9065g;
            if (num4 != null) {
                c0664g9.f8260f = num4.intValue();
            }
            Long l2 = c0921q7.f9066h;
            if (l2 != null) {
                c0664g9.f8257c = TimeUnit.MILLISECONDS.toSeconds(l2.longValue());
            }
            String str = c0921q7.f9067i;
            if (str != null) {
                if (str.equals("gps")) {
                    c0664g9.f8262h = 1;
                } else if (str.equals("network")) {
                    c0664g9.f8262h = 2;
                }
            }
            String str2 = c0921q7.f9068j;
            if (str2 != null) {
                c0664g9.f8263i = str2;
            }
        }
        return c0664g9;
    }
}
