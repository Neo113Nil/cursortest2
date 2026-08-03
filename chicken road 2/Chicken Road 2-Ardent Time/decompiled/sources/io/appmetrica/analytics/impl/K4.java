package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class K4 extends io.appmetrica.analytics.coreapi.internal.db.DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J4 f4532a = new io.appmetrica.analytics.impl.J4();

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.I4 f4533b = new io.appmetrica.analytics.impl.I4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.f4532a.runScript(sQLiteDatabase);
        this.f4533b.runScript(sQLiteDatabase);
    }
}
