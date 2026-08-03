package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622pk implements io.appmetrica.analytics.impl.Ic {
    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(android.content.Context context) {
        io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0468jm.class);
        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a2 = rm.a(context, rm.b(context));
        io.appmetrica.analytics.impl.C0468jm c0468jm = (io.appmetrica.analytics.impl.C0468jm) a2.read();
        io.appmetrica.analytics.impl.C0442im a3 = c0468jm.a(c0468jm.f6227m);
        a3.f6126o = 0L;
        a2.save(new io.appmetrica.analytics.impl.C0468jm(a3));
    }
}
