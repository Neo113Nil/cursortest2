package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226ac implements io.appmetrica.analytics.impl.InterfaceC0373g4 {
    @Override // io.appmetrica.analytics.impl.InterfaceC0373g4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0735u4 a(android.content.Context context, io.appmetrica.analytics.impl.C0297d5 c0297d5, io.appmetrica.analytics.impl.P3 p3, io.appmetrica.analytics.impl.C0606p4 c0606p4) {
        io.appmetrica.analytics.impl.C0813x4 c0813x4;
        io.appmetrica.analytics.impl.C0761v4 c0761v4 = new io.appmetrica.analytics.impl.C0761v4(p3.f4809b);
        io.appmetrica.analytics.impl.C0839y4 c0839y4 = new io.appmetrica.analytics.impl.C0839y4();
        synchronized (c0297d5) {
            c0813x4 = (io.appmetrica.analytics.impl.C0813x4) c0297d5.a(c0761v4, c0606p4, c0839y4, c0297d5.f5695b);
        }
        return new io.appmetrica.analytics.impl.C0735u4(context, c0813x4, c0606p4);
    }
}
