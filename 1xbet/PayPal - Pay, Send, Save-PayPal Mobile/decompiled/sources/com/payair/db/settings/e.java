package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class e implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsEntry f4358a;
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsDao_Impl b;

    public e(com.payair.db.settings.DatabaseSettingsDao_Impl databaseSettingsDao_Impl, com.payair.db.settings.DatabaseSettingsEntry databaseSettingsEntry) {
        this.b = databaseSettingsDao_Impl;
        this.f4358a = databaseSettingsEntry;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        this.b.f4355a.beginTransaction();
        try {
            this.b.c.handle(this.f4358a);
            this.b.f4355a.setTransactionSuccessful();
            return kotlin.Unit.INSTANCE;
        } finally {
            this.b.f4355a.endTransaction();
        }
    }
}
