package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517lj implements io.appmetrica.analytics.impl.InterfaceC0373g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0373g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0414hj a(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5, io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.Bg bg;
        io.appmetrica.analytics.impl.Q4 q4 = new io.appmetrica.analytics.impl.Q4(p3.f4809b, p3.f4808a);
        synchronized (c0297d5) {
            bg = (io.appmetrica.analytics.impl.Bg) c0297d5.f5694a.get(q4.toString());
        }
        return new io.appmetrica.analytics.impl.C0414hj(bg);
    }
}
