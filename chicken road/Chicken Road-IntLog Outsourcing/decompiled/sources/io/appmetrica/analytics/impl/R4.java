package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes.dex */
public final class R4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final Q4 f7356a = new Q4();

    /* renamed from: b, reason: collision with root package name */
    public final P4 f7357b = new P4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f7356a.runScript(sQLiteDatabase);
        this.f7357b.runScript(sQLiteDatabase);
    }
}
