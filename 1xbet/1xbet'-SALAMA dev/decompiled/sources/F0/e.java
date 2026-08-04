package F0;

import android.database.Cursor;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f2499d;

    public e(String str, HashMap map, HashSet hashSet, HashSet hashSet2) {
        this.f2496a = str;
        this.f2497b = Collections.unmodifiableMap(map);
        this.f2498c = Collections.unmodifiableSet(hashSet);
        this.f2499d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(K0.b bVar, String str) {
        ArrayList arrayList;
        int i7;
        Cursor cursorI = bVar.i("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorI.getColumnCount() > 0) {
                int columnIndex = cursorI.getColumnIndex("name");
                int columnIndex2 = cursorI.getColumnIndex("type");
                int columnIndex3 = cursorI.getColumnIndex("notnull");
                int columnIndex4 = cursorI.getColumnIndex("pk");
                int columnIndex5 = cursorI.getColumnIndex("dflt_value");
                while (cursorI.moveToNext()) {
                    String string = cursorI.getString(columnIndex);
                    map.put(string, new a(cursorI.getInt(columnIndex4), string, cursorI.getString(columnIndex2), cursorI.getString(columnIndex5), cursorI.getInt(columnIndex3) != 0, 2));
                }
            }
            cursorI.close();
            HashSet hashSet = new HashSet();
            Cursor cursorI2 = bVar.i("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorI2.getColumnIndex("id");
                int columnIndex7 = cursorI2.getColumnIndex(Session.JsonKeys.SEQ);
                int columnIndex8 = cursorI2.getColumnIndex("table");
                int columnIndex9 = cursorI2.getColumnIndex("on_delete");
                int columnIndex10 = cursorI2.getColumnIndex("on_update");
                ArrayList<c> arrayListB = b(cursorI2);
                int count = cursorI2.getCount();
                int i8 = 0;
                while (i8 < count) {
                    cursorI2.moveToPosition(i8);
                    if (cursorI2.getInt(columnIndex7) != 0) {
                        arrayList = arrayListB;
                        i7 = count;
                    } else {
                        int i9 = cursorI2.getInt(columnIndex6);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (c cVar : arrayListB) {
                            ArrayList arrayList4 = arrayListB;
                            int i10 = count;
                            if (cVar.f2489a == i9) {
                                arrayList2.add(cVar.f2491c);
                                arrayList3.add(cVar.f2492d);
                            }
                            arrayListB = arrayList4;
                            count = i10;
                        }
                        arrayList = arrayListB;
                        i7 = count;
                        hashSet.add(new b(cursorI2.getString(columnIndex8), cursorI2.getString(columnIndex9), cursorI2.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i8++;
                    columnIndex6 = columnIndex6;
                    columnIndex7 = columnIndex7;
                    arrayListB = arrayList;
                    count = i7;
                }
                cursorI2.close();
                Cursor cursorI3 = bVar.i("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorI3.getColumnIndex("name");
                    int columnIndex12 = cursorI3.getColumnIndex("origin");
                    int columnIndex13 = cursorI3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorI3.close();
                        break;
                    }
                    HashSet hashSet3 = new HashSet();
                    while (true) {
                        if (!cursorI3.moveToNext()) {
                            cursorI3.close();
                            hashSet2 = hashSet3;
                            break;
                        }
                        if ("c".equals(cursorI3.getString(columnIndex12))) {
                            d dVarC = c(bVar, cursorI3.getString(columnIndex11), cursorI3.getInt(columnIndex13) == 1);
                            if (dVarC == null) {
                                cursorI3.close();
                                break;
                            }
                            hashSet3.add(dVarC);
                        }
                    }
                    return new e(str, map, hashSet, hashSet2);
                } catch (Throwable th) {
                    cursorI3.close();
                    throw th;
                }
            } catch (Throwable th2) {
                cursorI2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            cursorI.close();
            throw th3;
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex(Session.JsonKeys.SEQ);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < count; i7++) {
            cursor.moveToPosition(i7);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(K0.b bVar, String str, boolean z4) {
        Cursor cursorI = bVar.i("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorI.getColumnIndex("seqno");
            int columnIndex2 = cursorI.getColumnIndex("cid");
            int columnIndex3 = cursorI.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorI.moveToNext()) {
                    if (cursorI.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorI.getInt(columnIndex)), cursorI.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, arrayList, z4);
            }
            return null;
        } finally {
            cursorI.close();
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = eVar.f2496a;
        String str2 = this.f2496a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.f2497b;
        Map map2 = this.f2497b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f2498c;
        Set set3 = this.f2498c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f2499d;
        if (set4 == null || (set = eVar.f2499d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f2496a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f2497b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f2498c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f2496a + "', columns=" + this.f2497b + ", foreignKeys=" + this.f2498c + ", indices=" + this.f2499d + '}';
    }
}
