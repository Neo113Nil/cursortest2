package P4;

import O4.c;
import P4.d;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements O4.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f21814a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21815b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c.a f21816c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f21817d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21818e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<b> f21819f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21820g;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private P4.c f21821a = null;

        public final P4.c a() {
            return this.f21821a;
        }

        public final void b(P4.c cVar) {
            this.f21821a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int f21822h = 0;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f21823a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f21824b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final c.a f21825c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f21826d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f21827e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Q4.a f21828f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f21829g;

        private static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final EnumC0430b f21830a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final Throwable f21831b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull EnumC0430b callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f21830a = callbackName;
                this.f21831b = cause;
            }

            @NotNull
            public final EnumC0430b a() {
                return this.f21830a;
            }

            @Override // java.lang.Throwable
            @NotNull
            public final Throwable getCause() {
                return this.f21831b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: P4.d$b$b, reason: collision with other inner class name */
        public static final class EnumC0430b {
            private static final /* synthetic */ EnumC0430b[] $VALUES;
            public static final EnumC0430b ON_CONFIGURE;
            public static final EnumC0430b ON_CREATE;
            public static final EnumC0430b ON_DOWNGRADE;
            public static final EnumC0430b ON_OPEN;
            public static final EnumC0430b ON_UPGRADE;

            static {
                EnumC0430b enumC0430b = new EnumC0430b("ON_CONFIGURE", 0);
                ON_CONFIGURE = enumC0430b;
                EnumC0430b enumC0430b2 = new EnumC0430b("ON_CREATE", 1);
                ON_CREATE = enumC0430b2;
                EnumC0430b enumC0430b3 = new EnumC0430b("ON_UPGRADE", 2);
                ON_UPGRADE = enumC0430b3;
                EnumC0430b enumC0430b4 = new EnumC0430b("ON_DOWNGRADE", 3);
                ON_DOWNGRADE = enumC0430b4;
                EnumC0430b enumC0430b5 = new EnumC0430b("ON_OPEN", 4);
                ON_OPEN = enumC0430b5;
                $VALUES = new EnumC0430b[]{enumC0430b, enumC0430b2, enumC0430b3, enumC0430b4, enumC0430b5};
            }

            private EnumC0430b() {
                throw null;
            }

            public static EnumC0430b valueOf(String str) {
                return (EnumC0430b) Enum.valueOf(EnumC0430b.class, str);
            }

            public static EnumC0430b[] values() {
                return (EnumC0430b[]) $VALUES.clone();
            }
        }

        public static final class c {
            @NotNull
            public static P4.c a(@NotNull a refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                P4.c a11 = refHolder.a();
                if (a11 != null && a11.j(sqLiteDatabase)) {
                    return a11;
                }
                P4.c cVar = new P4.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }
        }

        /* renamed from: P4.d$b$d, reason: collision with other inner class name */
        public /* synthetic */ class C0431d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21832a;

            static {
                int[] iArr = new int[EnumC0430b.values().length];
                try {
                    iArr[EnumC0430b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0430b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC0430b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC0430b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC0430b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f21832a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context, String str, @NotNull final a dbRef, @NotNull final c.a callback, boolean z11) {
            super(context, str, null, callback.f19936a, new DatabaseErrorHandler() { // from class: P4.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    c.a callback2 = c.a.this;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    d.a dbRef2 = dbRef;
                    Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                    int i11 = d.b.f21822h;
                    Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                    c a11 = d.b.c.a(dbRef2, dbObj);
                    callback2.getClass();
                    c.a.c(a11);
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f21823a = context;
            this.f21824b = dbRef;
            this.f21825c = callback;
            this.f21826d = z11;
            this.f21828f = new Q4.a(str == null ? f.b("randomUUID().toString()") : str, context.getCacheDir(), false);
        }

        private final SQLiteDatabase j(boolean z11) {
            if (z11) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase k(boolean z11) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z12 = this.f21829g;
            Context context = this.f21823a;
            if (databaseName != null && !z12 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return j(z11);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return j(z11);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i11 = C0431d.f21832a[aVar.a().ordinal()];
                        if (i11 == 1) {
                            throw cause;
                        }
                        if (i11 == 2) {
                            throw cause;
                        }
                        if (i11 == 3) {
                            throw cause;
                        }
                        if (i11 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        if (databaseName == null || !this.f21826d) {
                            throw th2;
                        }
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return j(z11);
                    } catch (a e11) {
                        throw e11.getCause();
                    }
                }
            }
        }

        @NotNull
        public final O4.b c(boolean z11) {
            Q4.a aVar = this.f21828f;
            try {
                aVar.a((this.f21829g || getDatabaseName() == null) ? false : true);
                this.f21827e = false;
                SQLiteDatabase k11 = k(z11);
                if (!this.f21827e) {
                    P4.c d11 = d(k11);
                    aVar.c();
                    return d11;
                }
                close();
                O4.b c11 = c(z11);
                aVar.c();
                return c11;
            } catch (Throwable th2) {
                aVar.c();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            Q4.a aVar = this.f21828f;
            try {
                aVar.a(aVar.f22952a);
                super.close();
                this.f21824b.b(null);
                this.f21829g = false;
            } finally {
                aVar.c();
            }
        }

        @NotNull
        public final P4.c d(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return c.a(this.f21824b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            boolean z11 = this.f21827e;
            c.a aVar = this.f21825c;
            if (!z11 && aVar.f19936a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                aVar.b(d(db2));
            } catch (Throwable th2) {
                throw new a(EnumC0430b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f21825c.d(d(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(EnumC0430b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(@NotNull SQLiteDatabase db2, int i11, int i12) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f21827e = true;
            try {
                this.f21825c.e(d(db2), i11, i12);
            } catch (Throwable th2) {
                throw new a(EnumC0430b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(@NotNull SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f21827e) {
                try {
                    this.f21825c.f(d(db2));
                } catch (Throwable th2) {
                    throw new a(EnumC0430b.ON_OPEN, th2);
                }
            }
            this.f21829g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i11, int i12) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f21827e = true;
            try {
                this.f21825c.g(d(sqLiteDatabase), i11, i12);
            } catch (Throwable th2) {
                throw new a(EnumC0430b.ON_UPGRADE, th2);
            }
        }
    }

    static final class c extends AbstractC7737t implements Function0<b> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b invoke() {
            b sQLiteOpenHelper;
            d dVar = d.this;
            if (dVar.f21815b == null || !dVar.f21817d) {
                sQLiteOpenHelper = new b(dVar.f21814a, dVar.f21815b, new a(), dVar.f21816c, dVar.f21818e);
            } else {
                Context context = dVar.f21814a;
                Intrinsics.checkNotNullParameter(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                sQLiteOpenHelper = new b(dVar.f21814a, new File(noBackupFilesDir, dVar.f21815b).getAbsolutePath(), new a(), dVar.f21816c, dVar.f21818e);
            }
            boolean z11 = dVar.f21820g;
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z11);
            return sQLiteOpenHelper;
        }
    }

    public d(@NotNull Context context, String str, @NotNull c.a callback, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f21814a = context;
        this.f21815b = str;
        this.f21816c = callback;
        this.f21817d = z11;
        this.f21818e = z12;
        this.f21819f = k.b(new c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC4008j<b> interfaceC4008j = this.f21819f;
        if (interfaceC4008j.isInitialized()) {
            interfaceC4008j.getValue().close();
        }
    }

    @Override // O4.c
    @NotNull
    public final O4.b getWritableDatabase() {
        return this.f21819f.getValue().c(true);
    }

    @Override // O4.c
    public final void setWriteAheadLoggingEnabled(boolean z11) {
        InterfaceC4008j<b> interfaceC4008j = this.f21819f;
        if (interfaceC4008j.isInitialized()) {
            b sQLiteOpenHelper = interfaceC4008j.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z11);
        }
        this.f21820g = z11;
    }
}
