package J4;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import o.C8620b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String[] f13892n = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final s f13893a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap f13894b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final HashMap f13895c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f13896d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f13897e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f13898f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f13899g;

    /* renamed from: h, reason: collision with root package name */
    private volatile O4.f f13900h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final b f13901i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C8620b<c, d> f13902j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f13903k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f13904l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final q f13905m;

    public static final class a {
        @NotNull
        public static String a(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final long[] f13906a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final boolean[] f13907b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final int[] f13908c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f13909d;

        public b(int i11) {
            this.f13906a = new long[i11];
            this.f13907b = new boolean[i11];
            this.f13908c = new int[i11];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f13909d) {
                        return null;
                    }
                    long[] jArr = this.f13906a;
                    int length = jArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        int i13 = i12 + 1;
                        int i14 = 1;
                        boolean z11 = jArr[i11] > 0;
                        boolean[] zArr = this.f13907b;
                        if (z11 != zArr[i12]) {
                            int[] iArr = this.f13908c;
                            if (!z11) {
                                i14 = 2;
                            }
                            iArr[i12] = i14;
                        } else {
                            this.f13908c[i12] = 0;
                        }
                        zArr[i12] = z11;
                        i11++;
                        i12 = i13;
                    }
                    this.f13909d = false;
                    return (int[]) this.f13908c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean b(@NotNull int... tableIds) {
            boolean z11;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : tableIds) {
                        long[] jArr = this.f13906a;
                        long j11 = jArr[i11];
                        jArr[i11] = 1 + j11;
                        if (j11 == 0) {
                            this.f13909d = true;
                            z11 = true;
                        }
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }

        public final boolean c(@NotNull int... tableIds) {
            boolean z11;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z11 = false;
                    for (int i11 : tableIds) {
                        long[] jArr = this.f13906a;
                        long j11 = jArr[i11];
                        jArr[i11] = j11 - 1;
                        if (j11 == 1) {
                            this.f13909d = true;
                            z11 = true;
                        }
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String[] f13910a;

        public c(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f13910a = tables;
        }

        @NotNull
        public final String[] a() {
            return this.f13910a;
        }

        public abstract void b(@NotNull Set<String> set);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f13911a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final int[] f13912b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String[] f13913c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Set<String> f13914d;

        public d(@NotNull c observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f13911a = observer;
            this.f13912b = tableIds;
            this.f13913c = tableNames;
            this.f13914d = tableNames.length == 0 ? M.f71699a : e0.h(tableNames[0]);
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @NotNull
        public final int[] a() {
            return this.f13912b;
        }

        public final void b(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> set;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f13912b;
            int length = iArr.length;
            if (length != 0) {
                int i11 = 0;
                if (length != 1) {
                    Tc.j builder = new Tc.j();
                    int length2 = iArr.length;
                    int i12 = 0;
                    while (i11 < length2) {
                        int i13 = i12 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i11]))) {
                            builder.add(this.f13913c[i12]);
                        }
                        i11++;
                        i12 = i13;
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    set = builder.b();
                } else {
                    set = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f13914d : M.f71699a;
                }
            } else {
                set = M.f71699a;
            }
            if (set.isEmpty()) {
                return;
            }
            this.f13911a.b(set);
        }
    }

    public p(@NotNull s database, @NotNull HashMap shadowTablesMap, @NotNull HashMap viewTables, @NotNull String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f13893a = database;
        this.f13894b = shadowTablesMap;
        this.f13895c = viewTables;
        this.f13898f = new AtomicBoolean(false);
        this.f13901i = new b(tableNames.length);
        new o(database);
        this.f13902j = new C8620b<>();
        this.f13903k = new Object();
        this.f13904l = new Object();
        this.f13896d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            String str2 = tableNames[i11];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f13896d.put(lowerCase, Integer.valueOf(i11));
            String str3 = (String) this.f13894b.get(tableNames[i11]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i11] = lowerCase;
        }
        this.f13897e = strArr;
        for (Map.Entry entry : this.f13894b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f13896d.containsKey(lowerCase2)) {
                String str5 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = str5.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f13896d;
                linkedHashMap.put(lowerCase3, U.e(linkedHashMap, lowerCase2));
            }
        }
        this.f13905m = new q(this);
    }

    private final void j(O4.b bVar, int i11) {
        bVar.O0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i11 + ", 0)");
        String str = this.f13897e[i11];
        String[] strArr = f13892n;
        for (int i12 = 0; i12 < 3; i12++) {
            String str2 = strArr[i12];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i11 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.O0(str3);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void a(@NotNull c observer) {
        d g10;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] a11 = observer.a();
        Tc.j builder = new Tc.j();
        for (String str : a11) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            HashMap hashMap = this.f13895c;
            if (hashMap.containsKey(lowerCase)) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = hashMap.get(lowerCase2);
                Intrinsics.f(obj);
                builder.addAll((Collection) obj);
            } else {
                builder.add(str);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        String[] strArr = (String[]) builder.b().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str2 : strArr) {
            LinkedHashMap linkedHashMap = this.f13896d;
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = str2.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase3);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            arrayList.add(num);
        }
        int[] T02 = C7714v.T0(arrayList);
        d dVar = new d(observer, T02, strArr);
        synchronized (this.f13902j) {
            g10 = this.f13902j.g(observer, dVar);
        }
        if (g10 == null && this.f13901i.b(Arrays.copyOf(T02, T02.length))) {
            s sVar = this.f13893a;
            if (sVar.isOpenInternal()) {
                k(sVar.getOpenHelper().getWritableDatabase());
            }
        }
    }

    public final boolean b() {
        if (!this.f13893a.isOpenInternal()) {
            return false;
        }
        if (!this.f13899g) {
            this.f13893a.getOpenHelper().getWritableDatabase();
        }
        if (this.f13899g) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final O4.f c() {
        return this.f13900h;
    }

    @NotNull
    public final s d() {
        return this.f13893a;
    }

    @NotNull
    public final C8620b<c, d> e() {
        return this.f13902j;
    }

    @NotNull
    public final AtomicBoolean f() {
        return this.f13898f;
    }

    public final void g(@NotNull O4.b database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f13904l) {
            if (this.f13899g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.O0("PRAGMA temp_store = MEMORY;");
            database.O0("PRAGMA recursive_triggers='ON';");
            database.O0("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            k(database);
            this.f13900h = database.C1("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f13899g = true;
            Unit unit = Unit.f71690a;
        }
    }

    public final void h() {
        if (this.f13898f.compareAndSet(false, true)) {
            this.f13893a.getQueryExecutor().execute(this.f13905m);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void i(@NotNull c observer) {
        d h11;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f13902j) {
            h11 = this.f13902j.h(observer);
        }
        if (h11 != null) {
            b bVar = this.f13901i;
            int[] a11 = h11.a();
            if (bVar.c(Arrays.copyOf(a11, a11.length))) {
                s sVar = this.f13893a;
                if (sVar.isOpenInternal()) {
                    k(sVar.getOpenHelper().getWritableDatabase());
                }
            }
        }
    }

    public final void k(@NotNull O4.b database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.T1()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f13893a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.f13903k) {
                    int[] a11 = this.f13901i.a();
                    if (a11 != null) {
                        Intrinsics.checkNotNullParameter(database, "database");
                        if (database.W1()) {
                            database.J();
                        } else {
                            database.A();
                        }
                        try {
                            int length = a11.length;
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < length) {
                                int i13 = a11[i11];
                                int i14 = i12 + 1;
                                if (i13 == 1) {
                                    j(database, i12);
                                } else if (i13 == 2) {
                                    String str = this.f13897e[i12];
                                    String[] strArr = f13892n;
                                    for (int i15 = 0; i15 < 3; i15++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + a.a(str, strArr[i15]);
                                        Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder().apply(builderAction).toString()");
                                        database.O0(str2);
                                    }
                                }
                                i11++;
                                i12 = i14;
                            }
                            database.f1();
                            database.i1();
                            Unit unit = Unit.f71690a;
                        } catch (Throwable th2) {
                            database.i1();
                            throw th2;
                        }
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        } catch (IllegalStateException e12) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e12);
        }
    }
}
