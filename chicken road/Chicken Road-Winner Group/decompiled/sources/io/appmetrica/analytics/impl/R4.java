package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* loaded from: classes.dex */
public final class R4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final Q4 f6492a = new Q4();

    /* renamed from: b, reason: collision with root package name */
    public final P4 f6493b = new P4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f6492a.runScript(sQLiteDatabase);
        this.f6493b.runScript(sQLiteDatabase);
    }
}
