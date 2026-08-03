package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456ja implements io.appmetrica.analytics.impl.Vb {
    @Override // io.appmetrica.analytics.impl.Vb
    public final io.appmetrica.analytics.impl.Z8 a(io.appmetrica.analytics.impl.C0428i7 c0428i7) {
        io.appmetrica.analytics.impl.Z8 z8 = null;
        if ((c0428i7 != null ? c0428i7.f6076b : null) != null && c0428i7.f6077c != null) {
            z8 = new io.appmetrica.analytics.impl.Z8();
            z8.f5391b = c0428i7.f6076b.doubleValue();
            z8.f5390a = c0428i7.f6077c.doubleValue();
            java.lang.Integer num = c0428i7.f6078d;
            if (num != null) {
                z8.f5396g = num.intValue();
            }
            java.lang.Integer num2 = c0428i7.f6079e;
            if (num2 != null) {
                z8.f5394e = num2.intValue();
            }
            java.lang.Integer num3 = c0428i7.f6080f;
            if (num3 != null) {
                z8.f5393d = num3.intValue();
            }
            java.lang.Integer num4 = c0428i7.f6081g;
            if (num4 != null) {
                z8.f5395f = num4.intValue();
            }
            java.lang.Long l2 = c0428i7.f6082h;
            if (l2 != null) {
                z8.f5392c = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(l2.longValue());
            }
            java.lang.String str = c0428i7.f6083i;
            if (str != null) {
                if (str.equals("gps")) {
                    z8.f5397h = 1;
                } else if (str.equals("network")) {
                    z8.f5397h = 2;
                }
            }
            java.lang.String str2 = c0428i7.f6084j;
            if (str2 != null) {
                z8.f5398i = str2;
            }
        }
        return z8;
    }
}
