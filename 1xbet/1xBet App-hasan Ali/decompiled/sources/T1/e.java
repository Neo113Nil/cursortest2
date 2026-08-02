package T1;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5623a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f5624b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5625c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f5626d;

    public e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f5623a = str;
        this.f5624b = Collections.unmodifiableMap(hashMap);
        this.f5625c = Collections.unmodifiableSet(hashSet);
        this.f5626d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    public static e a(Y1.b bVar, String str) {
        int i;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        Cursor n5 = bVar.n("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (n5.getColumnCount() > 0) {
                int columnIndex = n5.getColumnIndex("name");
                int columnIndex2 = n5.getColumnIndex("type");
                int columnIndex3 = n5.getColumnIndex("notnull");
                int columnIndex4 = n5.getColumnIndex("pk");
                int columnIndex5 = n5.getColumnIndex("dflt_value");
                while (n5.moveToNext()) {
                    String string = n5.getString(columnIndex);
                    hashMap.put(string, new a(n5.getInt(columnIndex4), 2, string, n5.getString(columnIndex2), n5.getString(columnIndex5), n5.getInt(columnIndex3) != 0));
                }
            }
            n5.close();
            HashSet hashSet = new HashSet();
            n5 = bVar.n("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = n5.getColumnIndex("id");
                int columnIndex7 = n5.getColumnIndex("seq");
                int columnIndex8 = n5.getColumnIndex("table");
                int columnIndex9 = n5.getColumnIndex("on_delete");
                int columnIndex10 = n5.getColumnIndex("on_update");
                ArrayList b3 = b(n5);
                int count = n5.getCount();
                int i8 = 0;
                while (i8 < count) {
                    n5.moveToPosition(i8);
                    if (n5.getInt(columnIndex7) != 0) {
                        i = i8;
                        i5 = columnIndex6;
                        i6 = columnIndex7;
                        arrayList = b3;
                        i7 = count;
                    } else {
                        int i9 = n5.getInt(columnIndex6);
                        i = i8;
                        ArrayList arrayList2 = new ArrayList();
                        i5 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        i6 = columnIndex7;
                        int size = b3.size();
                        i7 = count;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = b3.get(i10);
                            i10++;
                            int i11 = size;
                            c cVar = (c) obj;
                            ArrayList arrayList4 = b3;
                            if (cVar.f5616k == i9) {
                                arrayList2.add(cVar.f5618m);
                                arrayList3.add(cVar.f5619n);
                            }
                            size = i11;
                            b3 = arrayList4;
                        }
                        arrayList = b3;
                        hashSet.add(new b(n5.getString(columnIndex8), n5.getString(columnIndex9), n5.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i8 = i + 1;
                    columnIndex6 = i5;
                    columnIndex7 = i6;
                    count = i7;
                    b3 = arrayList;
                }
                n5.close();
                n5 = bVar.n("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = n5.getColumnIndex("name");
                    int columnIndex12 = n5.getColumnIndex("origin");
                    int columnIndex13 = n5.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (n5.moveToNext()) {
                            if ("c".equals(n5.getString(columnIndex12))) {
                                d c5 = c(bVar, n5.getString(columnIndex11), n5.getInt(columnIndex13) == 1);
                                if (c5 != null) {
                                    hashSet3.add(c5);
                                }
                            }
                        }
                        n5.close();
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
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Finally extract failed */
    public static d c(Y1.b bVar, String str, boolean z3) {
        Cursor n5 = bVar.n("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = n5.getColumnIndex("seqno");
            int columnIndex2 = n5.getColumnIndex("cid");
            int columnIndex3 = n5.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (n5.moveToNext()) {
                    if (n5.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(n5.getInt(columnIndex)), n5.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                d dVar = new d(z3, str, arrayList);
                n5.close();
                return dVar;
            }
            n5.close();
            return null;
        } catch (Throwable th) {
            n5.close();
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
        String str = eVar.f5623a;
        String str2 = this.f5623a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = eVar.f5624b;
        Map map2 = this.f5624b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = eVar.f5625c;
        Set set3 = this.f5625c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.f5626d;
        if (set4 == null || (set = eVar.f5626d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.f5623a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f5624b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.f5625c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f5623a + "', columns=" + this.f5624b + ", foreignKeys=" + this.f5625c + ", indices=" + this.f5626d + '}';
    }
}
