package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.sk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699sk implements io.appmetrica.analytics.impl.Ic {
    public static final boolean a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return true;
    }

    public static void b(android.content.Context context) {
        io.appmetrica.analytics.impl.Y6 y6;
        io.appmetrica.analytics.impl.C0673rk c0673rk = new io.appmetrica.analytics.impl.C0673rk();
        io.appmetrica.analytics.impl.C0648qk c0648qk = new io.appmetrica.analytics.impl.C0648qk();
        io.appmetrica.analytics.impl.C0443in c0443in = new io.appmetrica.analytics.impl.C0443in(c0648qk, c0648qk, new io.appmetrica.analytics.impl.C0612pa(false), new H0.b(18));
        io.appmetrica.analytics.impl.C0855yk B2 = io.appmetrica.analytics.impl.C0560na.f6484I.B();
        synchronized (B2) {
            io.appmetrica.analytics.impl.C0221a7 c0221a7 = B2.f7150a;
            y6 = new io.appmetrica.analytics.impl.Y6(context, new io.appmetrica.analytics.impl.Z6(c0221a7.f5468a, c0221a7.f5469b, false).a(context, c0673rk), c0443in, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
        }
        byte[] bArr = new io.appmetrica.analytics.impl.S2(new io.appmetrica.analytics.impl.C0649ql(y6), "binary_data").get("auto_inapp_collecting_info_data");
        if (bArr != null) {
            io.appmetrica.analytics.impl.C0560na.f6484I.B().c(context).insert("auto_inapp_collecting_info_data", bArr);
        }
    }

    @Override // io.appmetrica.analytics.impl.Ic
    public final void a(android.content.Context context) {
        io.appmetrica.analytics.impl.Rm rm = (io.appmetrica.analytics.impl.Rm) io.appmetrica.analytics.impl.Pm.a(io.appmetrica.analytics.impl.C0468jm.class);
        io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage<java.lang.Object> a2 = rm.a(context, rm.b(context));
        io.appmetrica.analytics.impl.C0468jm c0468jm = (io.appmetrica.analytics.impl.C0468jm) a2.read();
        io.appmetrica.analytics.impl.C0442im a3 = c0468jm.a(c0468jm.f6227m);
        a3.f6126o = 0L;
        a2.save(new io.appmetrica.analytics.impl.C0468jm(a3));
        b(context);
    }
}
