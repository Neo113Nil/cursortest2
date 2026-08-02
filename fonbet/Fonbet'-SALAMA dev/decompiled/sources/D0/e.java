package D0;

import C0.RunnableC0085d;
import W5.AbstractC0486a1;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class e {
    public static final String[] j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f1632b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f1633c;

    /* renamed from: f, reason: collision with root package name */
    public volatile K0.f f1636f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1637g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f1634d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f1635e = false;

    /* renamed from: h, reason: collision with root package name */
    public final o.f f1638h = new o.f();

    /* renamed from: i, reason: collision with root package name */
    public final RunnableC0085d f1639i = new RunnableC0085d(this, 3);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1631a = new HashMap();

    public e(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f1633c = workDatabase_Impl;
        this.f1637g = new c(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f1632b = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f1631a.put(lowerCase, Integer.valueOf(i7));
            String str2 = (String) hashMap.get(strArr[i7]);
            if (str2 != null) {
                this.f1632b[i7] = str2.toLowerCase(locale);
            } else {
                this.f1632b[i7] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f1631a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f1631a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        K0.b bVar = this.f1633c.f1653a;
        if (!(bVar != null && ((SQLiteDatabase) bVar.f3868b).isOpen())) {
            return false;
        }
        if (!this.f1635e) {
            this.f1633c.f1655c.l();
        }
        if (this.f1635e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(K0.b bVar, int i7) {
        bVar.g(AbstractC0486a1.f(i7, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f1632b[i7];
        StringBuilder sb = new StringBuilder();
        String[] strArr = j;
        for (int i8 = 0; i8 < 3; i8++) {
            String str2 = strArr[i8];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i7);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.g(sb.toString());
        }
    }

    public final void c(K0.b bVar) {
        if (((SQLiteDatabase) bVar.f3868b).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f1633c.f1660h.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.f1637g.a();
                    if (a2 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a2.length;
                    bVar.a();
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            int i8 = a2[i7];
                            if (i8 == 1) {
                                b(bVar, i7);
                            } else if (i8 == 2) {
                                String str = this.f1632b[i7];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = j;
                                for (int i9 = 0; i9 < 3; i9++) {
                                    String str2 = strArr[i9];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.g(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.f();
                            throw th;
                        }
                    }
                    bVar.j();
                    bVar.f();
                    c cVar = this.f1637g;
                    synchronized (cVar) {
                        cVar.f1627b = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e7) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                return;
            }
        }
    }
}
