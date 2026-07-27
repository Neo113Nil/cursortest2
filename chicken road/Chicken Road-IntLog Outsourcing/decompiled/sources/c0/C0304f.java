package c0;

import V0.j;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import d0.C0396a;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: c0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304f extends SQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f4876h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4877a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4878b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.d f4879c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4880d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4881e;

    /* renamed from: f, reason: collision with root package name */
    public final C0396a f4882f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0304f(Context context, String str, final j jVar, final B3.d callback, boolean z) {
        super(context, str, null, callback.f276b, new DatabaseErrorHandler() { // from class: c0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                B3.d callback2 = B3.d.this;
                kotlin.jvm.internal.i.e(callback2, "$callback");
                j jVar2 = jVar;
                int i2 = C0304f.f4876h;
                kotlin.jvm.internal.i.d(dbObj, "dbObj");
                C0301c y5 = B0.f.y(jVar2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + y5 + ".path");
                SQLiteDatabase sQLiteDatabase = y5.f4870a;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        B3.d.b(path);
                        return;
                    }
                    return;
                }
                List list = null;
                try {
                    try {
                        list = y5.f4871b;
                    } catch (SQLiteException unused) {
                    }
                    try {
                        y5.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            kotlin.jvm.internal.i.d(obj, "p.second");
                            B3.d.b((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            B3.d.b(path2);
                        }
                    }
                }
            }
        });
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f4877a = context;
        this.f4878b = jVar;
        this.f4879c = callback;
        this.f4880d = z;
        if (str == null) {
            str = UUID.randomUUID().toString();
            kotlin.jvm.internal.i.d(str, "randomUUID().toString()");
        }
        File cacheDir = context.getCacheDir();
        kotlin.jvm.internal.i.d(cacheDir, "context.cacheDir");
        this.f4882f = new C0396a(str, cacheDir, false);
    }

    public final C0301c a(boolean z) {
        C0396a c0396a = this.f4882f;
        try {
            c0396a.a((this.f4883g || getDatabaseName() == null) ? false : true);
            this.f4881e = false;
            SQLiteDatabase g6 = g(z);
            if (!this.f4881e) {
                C0301c b6 = b(g6);
                c0396a.b();
                return b6;
            }
            close();
            C0301c a6 = a(z);
            c0396a.b();
            return a6;
        } catch (Throwable th) {
            c0396a.b();
            throw th;
        }
    }

    public final C0301c b(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        return B0.f.y(this.f4878b, sqLiteDatabase);
    }

    public final SQLiteDatabase c(boolean z) {
        if (z) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            kotlin.jvm.internal.i.d(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        kotlin.jvm.internal.i.d(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0396a c0396a = this.f4882f;
        try {
            c0396a.a(c0396a.f5476a);
            super.close();
            this.f4878b.f3212b = null;
            this.f4883g = false;
        } finally {
            c0396a.b();
        }
    }

    public final SQLiteDatabase g(boolean z) {
        File parentFile;
        String databaseName = getDatabaseName();
        Context context = this.f4877a;
        if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return c(z);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return c(z);
            } catch (Throwable th) {
                super.close();
                if (th instanceof C0303e) {
                    C0303e c0303e = th;
                    int b6 = O.j.b(c0303e.f4874a);
                    Throwable th2 = c0303e.f4875b;
                    if (b6 == 0 || b6 == 1 || b6 == 2 || b6 == 3) {
                        throw th2;
                    }
                    if (!(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else {
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                    if (databaseName == null || !this.f4880d) {
                        throw th;
                    }
                }
                context.deleteDatabase(databaseName);
                try {
                    return c(z);
                } catch (C0303e e3) {
                    throw e3.f4875b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        try {
            B3.d dVar = this.f4879c;
            b(db);
            dVar.getClass();
        } catch (Throwable th) {
            throw new C0303e(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f4879c.f(b(sqLiteDatabase));
        } catch (Throwable th) {
            throw new C0303e(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i2, int i3) {
        kotlin.jvm.internal.i.e(db, "db");
        this.f4881e = true;
        try {
            this.f4879c.h(b(db), i2, i3);
        } catch (Throwable th) {
            throw new C0303e(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.i.e(db, "db");
        if (!this.f4881e) {
            try {
                this.f4879c.g(b(db));
            } catch (Throwable th) {
                throw new C0303e(5, th);
            }
        }
        this.f4883g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i2, int i3) {
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        this.f4881e = true;
        try {
            this.f4879c.h(b(sqLiteDatabase), i2, i3);
        } catch (Throwable th) {
            throw new C0303e(3, th);
        }
    }
}
