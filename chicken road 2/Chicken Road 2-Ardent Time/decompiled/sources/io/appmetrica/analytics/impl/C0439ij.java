package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ij, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439ij implements io.appmetrica.analytics.impl.InterfaceC0373g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0373g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0414hj a(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5, io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.Bg bg;
        io.appmetrica.analytics.impl.C0562nc c0562nc = new io.appmetrica.analytics.impl.C0562nc(p3.f4809b, p3.f4808a);
        synchronized (c0297d5) {
            bg = (io.appmetrica.analytics.impl.Bg) c0297d5.f5694a.get(c0562nc.toString());
        }
        return new io.appmetrica.analytics.impl.C0414hj(bg);
    }
}
