package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y6 extends android.database.sqlite.SQLiteOpenHelper implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5327a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f5328b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0443in f5329c;

    public Y6(android.content.Context context, java.lang.String str, io.appmetrica.analytics.impl.C0443in c0443in, io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, io.appmetrica.analytics.impl.AbstractC0788w5.f7001b);
        this.f5329c = c0443in;
        this.f5327a = str;
        this.f5328b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (java.lang.Throwable th) {
            this.f5328b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5327a);
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.C0621pj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (java.lang.Throwable th) {
            this.f5328b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f5327a);
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.C0621pj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            this.f5329c.f6137a.runScript(sQLiteDatabase);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        io.appmetrica.analytics.impl.C0443in c0443in = this.f5329c;
        if (i2 <= i3) {
            c0443in.getClass();
            return;
        }
        try {
            c0443in.f6138b.runScript(sQLiteDatabase);
        } catch (java.lang.Throwable unused) {
        }
        try {
            c0443in.f6137a.runScript(sQLiteDatabase);
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        io.appmetrica.analytics.impl.C0443in c0443in = this.f5329c;
        c0443in.getClass();
        try {
            io.appmetrica.analytics.impl.InterfaceC0469jn interfaceC0469jn = c0443in.f6140d;
            if (interfaceC0469jn == null || interfaceC0469jn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0443in.f6138b.runScript(sQLiteDatabase);
            } catch (java.lang.Throwable unused) {
            }
            c0443in.f6137a.runScript(sQLiteDatabase);
        } catch (java.lang.Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        boolean z2;
        io.appmetrica.analytics.impl.C0443in c0443in = this.f5329c;
        c0443in.getClass();
        if (i3 > i2) {
            for (int i4 = i2 + 1; i4 <= i3; i4++) {
                try {
                    java.util.Collection collection = (java.util.Collection) c0443in.f6139c.f6642a.get(java.lang.Integer.valueOf(i4));
                    if (collection != null) {
                        java.util.Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((io.appmetrica.analytics.coreapi.internal.db.DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                }
            }
            z2 = false;
            if (!z2 && !(!c0443in.f6140d.a(sQLiteDatabase))) {
                try {
                    c0443in.f6138b.runScript(sQLiteDatabase);
                } catch (java.lang.Throwable unused2) {
                }
                try {
                    c0443in.f6137a.runScript(sQLiteDatabase);
                    return;
                } catch (java.lang.Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z2 = true;
        if (!(z2 | (c0443in.f6140d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
