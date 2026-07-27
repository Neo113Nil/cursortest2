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
public final class C0487f7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f7277b;

    /* renamed from: c, reason: collision with root package name */
    public final C0658ln f7278c;

    public C0487f7(Context context, String str, C0658ln c0658ln, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, D5.f5832b);
        this.f7278c = c0658ln;
        this.f7276a = str;
        this.f7277b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f7277b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7276a);
            Vj vj = AbstractC0861tj.f8372a;
            vj.getClass();
            vj.a(new C0887uj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f7277b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f7276a);
            Vj vj = AbstractC0861tj.f8372a;
            vj.getClass();
            vj.a(new C0887uj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f7278c.f7824a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        C0658ln c0658ln = this.f7278c;
        if (i3 <= i4) {
            c0658ln.getClass();
            return;
        }
        try {
            c0658ln.f7825b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0658ln.f7824a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0658ln c0658ln = this.f7278c;
        c0658ln.getClass();
        try {
            InterfaceC0684mn interfaceC0684mn = c0658ln.f7827d;
            if (interfaceC0684mn == null || interfaceC0684mn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0658ln.f7825b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0658ln.f7824a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i3, int i4) {
        boolean z3;
        C0658ln c0658ln = this.f7278c;
        c0658ln.getClass();
        if (i4 > i3) {
            for (int i5 = i3 + 1; i5 <= i4; i5++) {
                try {
                    Collection collection = (Collection) c0658ln.f7826c.f8557a.get(Integer.valueOf(i5));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z3 = false;
            if (!z3 && !(!c0658ln.f7827d.a(sQLiteDatabase))) {
                try {
                    c0658ln.f7825b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0658ln.f7824a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z3 = true;
        if (!(z3 | (c0658ln.f7827d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
