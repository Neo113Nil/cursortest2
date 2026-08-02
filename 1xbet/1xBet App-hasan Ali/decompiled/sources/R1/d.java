package R1;

import A0.C;
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
import p.C2240f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f5131j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b, reason: collision with root package name */
    public final String[] f5133b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f5134c;
    public volatile Y1.f f;

    /* renamed from: g, reason: collision with root package name */
    public final b f5137g;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5135d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f5136e = false;

    /* renamed from: h, reason: collision with root package name */
    public final C2240f f5138h = new C2240f();
    public final C i = new C(7, this);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5132a = new HashMap();

    public d(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f5134c = workDatabase_Impl;
        this.f5137g = new b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f5133b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f5132a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f5133b[i] = str2.toLowerCase(locale);
            } else {
                this.f5133b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f5132a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap hashMap3 = this.f5132a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        Y1.b bVar = this.f5134c.f5151a;
        if (!(bVar != null && ((SQLiteDatabase) bVar.f6123l).isOpen())) {
            return false;
        }
        if (!this.f5136e) {
            this.f5134c.f5153c.z();
        }
        if (this.f5136e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(Y1.b bVar, int i) {
        bVar.l(L1.a.l(i, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f5133b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f5131j;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
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
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.l(sb.toString());
        }
    }

    public final void c(Y1.b bVar) {
        if (((SQLiteDatabase) bVar.f6123l).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f5134c.f5157h.readLock();
                readLock.lock();
                try {
                    int[] a5 = this.f5137g.a();
                    if (a5 == null) {
                        readLock.unlock();
                        return;
                    }
                    int length = a5.length;
                    bVar.b();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i5 = a5[i];
                            if (i5 == 1) {
                                b(bVar, i);
                            } else if (i5 == 2) {
                                String str = this.f5133b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f5131j;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    String str2 = strArr[i6];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.l(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.k();
                            throw th;
                        }
                    }
                    bVar.p();
                    bVar.k();
                    b bVar2 = this.f5137g;
                    synchronized (bVar2) {
                        bVar2.f5127l = false;
                    }
                    readLock.unlock();
                } catch (Throwable th2) {
                    readLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException e3) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e3);
                return;
            }
        }
    }
}
