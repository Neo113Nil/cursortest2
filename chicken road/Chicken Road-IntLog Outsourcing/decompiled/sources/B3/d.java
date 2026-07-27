package B3;

import B0.o;
import B1.g;
import B4.r;
import G0.C0051a;
import N4.j;
import R4.n;
import T4.v;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C0276b;
import c0.C0301c;
import g4.C0471p;
import h4.C0483a;
import h4.C0485c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.i;
import t0.C1424c;
import t0.l;
import u1.AbstractC1477a;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275a;

    /* renamed from: b, reason: collision with root package name */
    public int f276b;

    /* renamed from: c, reason: collision with root package name */
    public Object f277c;

    /* renamed from: d, reason: collision with root package name */
    public Object f278d;

    public /* synthetic */ d(int i2, byte b6) {
        this.f275a = i2;
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z5 = i.g(str.charAt(!z ? i2 : length), 32) <= 0;
            if (z) {
                if (!z5) {
                    break;
                } else {
                    length--;
                }
            } else if (z5) {
                i2++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i2, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    public C0276b a() {
        String str = ((Long) this.f278d) == null ? " tokenExpirationTimestamp" : "";
        if (str.isEmpty()) {
            return new C0276b((String) this.f277c, ((Long) this.f278d).longValue(), this.f276b);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int c() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC1515c abstractActivityC1515c = (AbstractActivityC1515c) this.f277c;
        int i2 = this.f276b;
        View findViewById = abstractActivityC1515c.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f276b + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = ((Object[]) this.f277c)[i3];
            if (obj instanceof N4.e) {
                N4.e eVar = (N4.e) obj;
                if (!i.a(eVar.c(), j.f2191c)) {
                    int i6 = ((int[]) this.f278d)[i3];
                    if (i6 >= 0) {
                        sb.append(".");
                        sb.append(eVar.e(i6));
                    }
                } else if (((int[]) this.f278d)[i3] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f278d)[i3]);
                    sb.append("]");
                }
            } else if (obj != n.f2689a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    public void e(C0301c c0301c) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(C0301c c0301c) {
        boolean z;
        ArrayList arrayList;
        Cursor C2 = c0301c.C("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = C2;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z = true;
                    AbstractC1477a.e(C2, null);
                    V0.j jVar = (V0.j) this.f278d;
                    V0.j.B(c0301c);
                    if (!z) {
                        X.j M5 = V0.j.M(c0301c);
                        if (!M5.f3492b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + M5.f3491a);
                        }
                    }
                    c0301c.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c0301c.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f3212b;
                    arrayList = workDatabase_Impl.f4724f;
                    if (arrayList == null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((C1424c) workDatabase_Impl.f4724f.get(i2)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z = false;
            AbstractC1477a.e(C2, null);
            V0.j jVar2 = (V0.j) this.f278d;
            V0.j.B(c0301c);
            if (!z) {
            }
            c0301c.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c0301c.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) jVar2.f3212b;
            arrayList = workDatabase_Impl2.f4724f;
            if (arrayList == null) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1477a.e(C2, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(C0301c c0301c) {
        boolean z;
        X.f fVar;
        Cursor C2 = c0301c.C("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            Cursor cursor = C2;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) != 0) {
                    z = true;
                    AbstractC1477a.e(C2, null);
                    if (z) {
                        X.j M5 = V0.j.M(c0301c);
                        if (!M5.f3492b) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + M5.f3491a);
                        }
                        c0301c.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        c0301c.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    } else {
                        C2 = c0301c.A(new C0051a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            Cursor cursor2 = C2;
                            String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                            AbstractC1477a.e(C2, null);
                            if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                                throw new IllegalStateException(o.i("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                            }
                        } finally {
                        }
                    }
                    V0.j jVar = (V0.j) this.f278d;
                    ((WorkDatabase_Impl) jVar.f3212b).f4719a = c0301c;
                    c0301c.o("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f3212b;
                    workDatabase_Impl.getClass();
                    fVar = workDatabase_Impl.f4722d;
                    fVar.getClass();
                    synchronized (fVar.f3470k) {
                        if (fVar.f3465f) {
                            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            c0301c.o("PRAGMA temp_store = MEMORY;");
                            c0301c.o("PRAGMA recursive_triggers='ON';");
                            c0301c.o("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            fVar.c(c0301c);
                            fVar.f3466g = c0301c.c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            fVar.f3465f = true;
                        }
                    }
                    ArrayList arrayList = ((WorkDatabase_Impl) jVar.f3212b).f4724f;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((C1424c) ((WorkDatabase_Impl) jVar.f3212b).f4724f.get(i2)).getClass();
                            c0301c.a();
                            try {
                                c0301c.o("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - l.f11876a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                c0301c.D();
                                c0301c.g();
                            } catch (Throwable th) {
                                c0301c.g();
                                throw th;
                            }
                        }
                    }
                    this.f277c = null;
                    return;
                }
            }
            z = false;
            AbstractC1477a.e(C2, null);
            if (z) {
            }
            V0.j jVar2 = (V0.j) this.f278d;
            ((WorkDatabase_Impl) jVar2.f3212b).f4719a = c0301c;
            c0301c.o("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) jVar2.f3212b;
            workDatabase_Impl2.getClass();
            fVar = workDatabase_Impl2.f4722d;
            fVar.getClass();
            synchronized (fVar.f3470k) {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x003f A[EDGE_INSN: B:87:0x003f->B:70:0x003f BREAK  A[LOOP:3: B:49:0x002a->B:71:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(C0301c c0301c, int i2, int i3) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        boolean z;
        X.b bVar = (X.b) this.f277c;
        V0.j jVar = (V0.j) this.f278d;
        if (bVar != null) {
            P0.b bVar2 = bVar.f3447d;
            bVar2.getClass();
            if (i2 == i3) {
                iterable = C0471p.f5750a;
            } else {
                boolean z5 = i3 > i2;
                ArrayList arrayList = new ArrayList();
                int i6 = i2;
                do {
                    if (z5) {
                        if (i6 >= i3) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) bVar2.f2283a.get(Integer.valueOf(i6));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer targetVersion : z5 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            if (z5) {
                                int i7 = i6 + 1;
                                i.d(targetVersion, "targetVersion");
                                int intValue = targetVersion.intValue();
                                if (i7 <= intValue && intValue <= i3) {
                                    Object obj = treeMap.get(targetVersion);
                                    i.b(obj);
                                    arrayList.add(obj);
                                    i6 = targetVersion.intValue();
                                    z = true;
                                    break;
                                }
                            } else {
                                i.d(targetVersion, "targetVersion");
                                int intValue2 = targetVersion.intValue();
                                if (i3 <= intValue2 && intValue2 < i6) {
                                    Object obj2 = treeMap.get(targetVersion);
                                    i.b(obj2);
                                    arrayList.add(obj2);
                                    i6 = targetVersion.intValue();
                                    z = true;
                                    break;
                                    break;
                                }
                            }
                        }
                        z = false;
                    } else {
                        if (i6 <= i3) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) bVar2.f2283a.get(Integer.valueOf(i6));
                        if (treeMap == null) {
                        }
                    }
                } while (z);
                iterable = null;
            }
            if (iterable != null) {
                C0485c c0485c = new C0485c(10);
                Cursor C2 = c0301c.C("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                try {
                    Cursor cursor = C2;
                    while (cursor.moveToNext()) {
                        c0485c.add(cursor.getString(0));
                    }
                    AbstractC1477a.e(C2, null);
                    ListIterator listIterator = K1.b.D(c0485c).listIterator(0);
                    while (true) {
                        C0483a c0483a = (C0483a) listIterator;
                        if (!c0483a.hasNext()) {
                            break;
                        }
                        String triggerName = (String) c0483a.next();
                        i.d(triggerName, "triggerName");
                        if (r.O(triggerName, "room_fts_content_sync_", false)) {
                            c0301c.o("DROP TRIGGER IF EXISTS ".concat(triggerName));
                        }
                    }
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        ((Y.a) it.next()).a(c0301c);
                    }
                    X.j M5 = V0.j.M(c0301c);
                    if (!M5.f3492b) {
                        throw new IllegalStateException("Migration didn't properly handle: " + M5.f3491a);
                    }
                    c0301c.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    c0301c.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1477a.e(C2, th);
                        throw th2;
                    }
                }
            }
        }
        X.b bVar3 = (X.b) this.f277c;
        if (bVar3 != null) {
            boolean z6 = false;
            if ((i2 <= i3 || !bVar3.f3454k) && bVar3.f3453j && ((linkedHashSet = bVar3.f3455l) == null || !linkedHashSet.contains(Integer.valueOf(i2)))) {
                z6 = true;
            }
            if (!z6) {
                c0301c.o("DROP TABLE IF EXISTS `Dependency`");
                c0301c.o("DROP TABLE IF EXISTS `WorkSpec`");
                c0301c.o("DROP TABLE IF EXISTS `WorkTag`");
                c0301c.o("DROP TABLE IF EXISTS `SystemIdInfo`");
                c0301c.o("DROP TABLE IF EXISTS `WorkName`");
                c0301c.o("DROP TABLE IF EXISTS `WorkProgress`");
                c0301c.o("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVar.f3212b;
                ArrayList arrayList2 = workDatabase_Impl.f4724f;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((C1424c) workDatabase_Impl.f4724f.get(i8)).getClass();
                    }
                }
                V0.j.B(c0301c);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void i(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        AbstractActivityC1515c abstractActivityC1515c = (AbstractActivityC1515c) this.f277c;
        int i3 = this.f276b;
        View findViewById = abstractActivityC1515c.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }

    public String toString() {
        switch (this.f275a) {
            case 4:
                return d();
            case 5:
            default:
                return super.toString();
            case 6:
                StringBuilder sb = new StringBuilder();
                if (((v) this.f277c) == v.f2986c) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f276b);
                sb.append(' ');
                sb.append((String) this.f278d);
                return sb.toString();
        }
    }

    public d(int i2, String str, ArrayList arrayList) {
        this.f275a = 1;
        this.f276b = i2;
        this.f278d = str;
        this.f277c = arrayList;
    }

    public d(v vVar, int i2, String str) {
        this.f275a = 6;
        this.f277c = vVar;
        this.f276b = i2;
        this.f278d = str;
    }

    public d(C3.a aVar) {
        this.f275a = 0;
        this.f277c = new ConcurrentLinkedDeque();
        this.f276b = 1;
        this.f278d = aVar;
    }

    public d(int i2, AbstractActivityC1515c abstractActivityC1515c, g gVar) {
        this.f275a = 2;
        this.f277c = abstractActivityC1515c;
        this.f276b = i2;
        this.f278d = gVar;
        gVar.f215b = this;
    }

    public d(X.b bVar, V0.j jVar) {
        this.f275a = 5;
        this.f275a = 5;
        this.f276b = 16;
        this.f277c = bVar;
        this.f278d = jVar;
    }
}
