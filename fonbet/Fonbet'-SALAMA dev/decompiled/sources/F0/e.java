package F0;

import android.database.Cursor;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2497b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f2498c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2499d;

    public e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f2496a = str;
        this.f2497b = Collections.unmodifiableMap(hashMap);
        this.f2498c = Collections.unmodifiableSet(hashSet);
        this.f2499d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(K0.b bVar, String str) {
        int i7;
        int i8;
        ArrayList arrayList;
        int i9;
        Cursor i10 = bVar.i("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (i10.getColumnCount() > 0) {
                int columnIndex = i10.getColumnIndex("name");
                int columnIndex2 = i10.getColumnIndex("type");
                int columnIndex3 = i10.getColumnIndex("notnull");
                int columnIndex4 = i10.getColumnIndex("pk");
                int columnIndex5 = i10.getColumnIndex("dflt_value");
                while (i10.moveToNext()) {
                    String string = i10.getString(columnIndex);
                    hashMap.put(string, new a(i10.getInt(columnIndex4), string, i10.getString(columnIndex2), i10.getString(columnIndex5), i10.getInt(columnIndex3) != 0, 2));
                }
            }
            i10.close();
            HashSet hashSet = new HashSet();
            i10 = bVar.i("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = i10.getColumnIndex("id");
                int columnIndex7 = i10.getColumnIndex(Session.JsonKeys.SEQ);
                int columnIndex8 = i10.getColumnIndex("table");
                int columnIndex9 = i10.getColumnIndex("on_delete");
                int columnIndex10 = i10.getColumnIndex("on_update");
                ArrayList b7 = b(i10);
                int count = i10.getCount();
                int i11 = 0;
                while (i11 < count) {
                    i10.moveToPosition(i11);
                    if (i10.getInt(columnIndex7) != 0) {
                        i7 = columnIndex6;
                        i8 = columnIndex7;
                        arrayList = b7;
                        i9 = count;
                    } else {
                        int i12 = i10.getInt(columnIndex6);
                        i7 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i8 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b7.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b7;
                            c cVar = (c) it.next();
                            int i13 = count;
                            if (cVar.f2489a == i12) {
                                arrayList2.add(cVar.f2491c);
                                arrayList3.add(cVar.f2492d);
                            }
                            b7 = arrayList4;
                            count = i13;
                        }
                        arrayList = b7;
                        i9 = count;
                        hashSet.add(new b(i10.getString(columnIndex8), i10.getString(columnIndex9), i10.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i11++;
                    columnIndex6 = i7;
                    columnIndex7 = i8;
                    b7 = arrayList;
                    count = i9;
                }
                i10.close();
                i10 = bVar.i("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = i10.getColumnIndex("name");
                    int columnIndex12 = i10.getColumnIndex("origin");
                    int columnIndex13 = i10.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (i10.moveToNext()) {
                            if ("c".equals(i10.getString(columnIndex12))) {
                                d c3 = c(bVar, i10.getString(columnIndex11), i10.getInt(columnIndex13) == 1);
                                if (c3 != null) {
                                    hashSet3.add(c3);
                                }
                            }
                        }
                        i10.close();
                        hashSet2 = hashSet3;
                        return new e(str, hashMap, hashSet, hashSet2);
                    }
                    return new e(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
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

    /* JADX WARN: Finally extract failed */
    public static d c(K0.b bVar, String str, boolean z4) {
        Cursor i7 = bVar.i("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = i7.getColumnIndex("seqno");
            int columnIndex2 = i7.getColumnIndex("cid");
            int columnIndex3 = i7.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (i7.moveToNext()) {
                    if (i7.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(i7.getInt(columnIndex)), i7.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(str, arrayList, z4);
                i7.close();
                return dVar;
            }
            i7.close();
            return null;
        } catch (Throwable th) {
            i7.close();
            throw th;
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
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f2497b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f2498c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f2496a + "', columns=" + this.f2497b + ", foreignKeys=" + this.f2498c + ", indices=" + this.f2499d + '}';
    }
}
