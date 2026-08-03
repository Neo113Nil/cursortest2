package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.no, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574no implements io.appmetrica.analytics.impl.Ka {
    @Override // io.appmetrica.analytics.impl.Ka
    public final java.lang.String a(android.content.Context context) {
        io.appmetrica.analytics.impl.C0468jm c0468jm;
        try {
            io.appmetrica.analytics.impl.Qm a2 = io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0468jm.class);
            if (a2 != null) {
                io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) a2;
                io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a3 = rm.a(context, rm.a(context));
                if (a3 != null && (c0468jm = (io.appmetrica.analytics.impl.C0468jm) a3.read()) != null) {
                    return c0468jm.f6215a;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
