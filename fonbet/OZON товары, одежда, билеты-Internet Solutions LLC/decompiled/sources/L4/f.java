package L4;

import L4.e;
import Tc.j;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f {
    private static final List<e.c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        Tc.b builder = C7714v.B();
        while (cursor.moveToNext()) {
            int i11 = cursor.getInt(columnIndex);
            int i12 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            builder.add(new e.c(i11, i12, string, string2));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return C7714v.H0(builder.B());
    }

    private static final e.d b(O4.b bVar, String str, boolean z11) {
        Cursor N12 = bVar.N1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = N12.getColumnIndex("seqno");
            int columnIndex2 = N12.getColumnIndex("cid");
            int columnIndex3 = N12.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndex4 = N12.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (N12.moveToNext()) {
                    if (N12.getInt(columnIndex2) >= 0) {
                        int i11 = N12.getInt(columnIndex);
                        String columnName = N12.getString(columnIndex3);
                        String str2 = N12.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i11);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(values, "columnsMap.values");
                List U02 = C7714v.U0(values);
                Collection values2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(values2, "ordersMap.values");
                e.d dVar = new e.d(U02, z11, str, C7714v.U0(values2));
                N12.close();
                return dVar;
            }
            N12.close();
            return null;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0201, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, "builder");
        r7 = r10.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0208, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e c(@NotNull O4.b database, @NotNull String tableName) {
        Map u11;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Cursor N12 = database.N1("PRAGMA table_info(`" + tableName + "`)");
        try {
            if (N12.getColumnCount() <= 0) {
                u11 = U.c();
                N12.close();
            } else {
                int columnIndex = N12.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = N12.getColumnIndex("type");
                int columnIndex3 = N12.getColumnIndex("notnull");
                int columnIndex4 = N12.getColumnIndex("pk");
                int columnIndex5 = N12.getColumnIndex("dflt_value");
                Tc.d builder = new Tc.d();
                while (N12.moveToNext()) {
                    String name = N12.getString(columnIndex);
                    String type = N12.getString(columnIndex2);
                    boolean z11 = N12.getInt(columnIndex3) != 0;
                    int i11 = N12.getInt(columnIndex4);
                    String string = N12.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(type, "type");
                    builder.put(name, new e.a(name, type, i11, 2, z11, string));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                u11 = builder.u();
                N12.close();
            }
            N12 = database.N1("PRAGMA foreign_key_list(`" + tableName + "`)");
            try {
                int columnIndex6 = N12.getColumnIndex("id");
                int columnIndex7 = N12.getColumnIndex("seq");
                int columnIndex8 = N12.getColumnIndex("table");
                int columnIndex9 = N12.getColumnIndex("on_delete");
                int columnIndex10 = N12.getColumnIndex("on_update");
                List<e.c> a11 = a(N12);
                N12.moveToPosition(-1);
                j builder2 = new j();
                while (N12.moveToNext()) {
                    if (N12.getInt(columnIndex7) == 0) {
                        int i12 = N12.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        int i13 = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : a11) {
                            List<e.c> list = a11;
                            Map map = u11;
                            if (((e.c) obj).b() == i12) {
                                arrayList3.add(obj);
                            }
                            a11 = list;
                            u11 = map;
                        }
                        Map map2 = u11;
                        List<e.c> list2 = a11;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            e.c cVar = (e.c) it.next();
                            arrayList.add(cVar.a());
                            arrayList2.add(cVar.c());
                        }
                        String string2 = N12.getString(columnIndex8);
                        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = N12.getString(columnIndex9);
                        Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = N12.getString(columnIndex10);
                        Intrinsics.checkNotNullExpressionValue(string4, "cursor.getString(onUpdateColumnIndex)");
                        builder2.add(new e.b(string2, arrayList, string3, string4, arrayList2));
                        columnIndex6 = i13;
                        columnIndex7 = i14;
                        a11 = list2;
                        u11 = map2;
                    }
                }
                Map map3 = u11;
                Intrinsics.checkNotNullParameter(builder2, "builder");
                j b11 = builder2.b();
                N12.close();
                N12 = database.N1("PRAGMA index_list(`" + tableName + "`)");
                try {
                    int columnIndex11 = N12.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = N12.getColumnIndex("origin");
                    int columnIndex13 = N12.getColumnIndex("unique");
                    j jVar = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        j builder3 = new j();
                        while (true) {
                            if (!N12.moveToNext()) {
                                break;
                            }
                            if ("c".equals(N12.getString(columnIndex12))) {
                                String name2 = N12.getString(columnIndex11);
                                boolean z12 = N12.getInt(columnIndex13) == 1;
                                Intrinsics.checkNotNullExpressionValue(name2, "name");
                                e.d b12 = b(database, name2, z12);
                                if (b12 == null) {
                                    N12.close();
                                    break;
                                }
                                builder3.add(b12);
                            }
                        }
                        return new e(tableName, map3, b11, jVar);
                    }
                    N12.close();
                    return new e(tableName, map3, b11, jVar);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }
}
