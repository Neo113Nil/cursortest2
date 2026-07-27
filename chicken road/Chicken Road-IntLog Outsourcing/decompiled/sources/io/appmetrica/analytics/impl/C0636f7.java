package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636f7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f8171a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f8172b;

    /* renamed from: c, reason: collision with root package name */
    public final C0807ln f8173c;

    public C0636f7(Context context, String str, C0807ln c0807ln, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, D5.f6668b);
        this.f8173c = c0807ln;
        this.f8171a = str;
        this.f8172b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f8172b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f8171a);
            Vj vj = AbstractC1010tj.f9323a;
            vj.getClass();
            vj.a(new C1036uj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f8172b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f8171a);
            Vj vj = AbstractC1010tj.f9323a;
            vj.getClass();
            vj.a(new C1036uj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8173c.f8749a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        C0807ln c0807ln = this.f8173c;
        if (i2 <= i3) {
            c0807ln.getClass();
            return;
        }
        try {
            c0807ln.f8750b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0807ln.f8749a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0807ln c0807ln = this.f8173c;
        c0807ln.getClass();
        try {
            InterfaceC0833mn interfaceC0833mn = c0807ln.f8752d;
            if (interfaceC0833mn == null || interfaceC0833mn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0807ln.f8750b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0807ln.f8749a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        boolean z;
        C0807ln c0807ln = this.f8173c;
        c0807ln.getClass();
        if (i3 > i2) {
            for (int i6 = i2 + 1; i6 <= i3; i6++) {
                try {
                    Collection collection = (Collection) c0807ln.f8751c.f9514a.get(Integer.valueOf(i6));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z = false;
            if (!z && !(!c0807ln.f8752d.a(sQLiteDatabase))) {
                try {
                    c0807ln.f8750b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0807ln.f8749a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z = true;
        if (!(z | (c0807ln.f8752d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
