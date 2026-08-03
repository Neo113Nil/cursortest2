package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649ql implements io.appmetrica.analytics.impl.InterfaceC0841y6 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y6 f6698a;

    public C0649ql(io.appmetrica.analytics.impl.Y6 y6) {
        this.f6698a = y6;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0841y6
    public final void a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0841y6
    public final android.database.sqlite.SQLiteDatabase a() {
        try {
            return this.f6698a.getWritableDatabase();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
