package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zb implements io.appmetrica.analytics.impl.InterfaceC0841y6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5403a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5404b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0443in f5405c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y9 f5406d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Y6 f5407e;

    public Zb(android.content.Context context, java.lang.String str, io.appmetrica.analytics.impl.C0443in c0443in) {
        this(context, str, new io.appmetrica.analytics.impl.Y9(str), c0443in);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0841y6
    public final synchronized android.database.sqlite.SQLiteDatabase a() {
        io.appmetrica.analytics.impl.Y6 y6;
        try {
            this.f5406d.a();
            y6 = new io.appmetrica.analytics.impl.Y6(this.f5403a, this.f5404b, this.f5405c, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance());
            this.f5407e = y6;
        } catch (java.lang.Throwable unused) {
            return null;
        }
        return y6.getWritableDatabase();
    }

    public Zb(android.content.Context context, java.lang.String str, io.appmetrica.analytics.impl.Y9 y9, io.appmetrica.analytics.impl.C0443in c0443in) {
        this.f5403a = context;
        this.f5404b = str;
        this.f5406d = y9;
        this.f5405c = c0443in;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0841y6
    public final synchronized void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (java.lang.Throwable unused) {
            }
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) this.f5407e);
        this.f5406d.b();
        this.f5407e = null;
    }
}
