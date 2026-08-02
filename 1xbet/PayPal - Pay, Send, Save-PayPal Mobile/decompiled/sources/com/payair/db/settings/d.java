package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class d implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsEntry[] f4357a;
    public final /* synthetic */ com.payair.db.settings.DatabaseSettingsDao_Impl b;

    public d(com.payair.db.settings.DatabaseSettingsDao_Impl databaseSettingsDao_Impl, com.payair.db.settings.DatabaseSettingsEntry[] databaseSettingsEntryArr) {
        this.b = databaseSettingsDao_Impl;
        this.f4357a = databaseSettingsEntryArr;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        this.b.f4355a.beginTransaction();
        try {
            this.b.b.insert((java.lang.Object[]) this.f4357a);
            this.b.f4355a.setTransactionSuccessful();
            return kotlin.Unit.INSTANCE;
        } finally {
            this.b.f4355a.endTransaction();
        }
    }
}
