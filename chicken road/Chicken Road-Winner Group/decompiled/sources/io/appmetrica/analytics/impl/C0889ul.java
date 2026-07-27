package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889ul implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final C0487f7 f8464a;

    public C0889ul(C0487f7 c0487f7) {
        this.f8464a = c0487f7;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final SQLiteDatabase a() {
        try {
            return this.f8464a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
