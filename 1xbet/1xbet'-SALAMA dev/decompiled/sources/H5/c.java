package H5;

import B4.A;
import B4.AbstractC0080y;
import B4.B;
import B4.C0063g;
import B4.C0065i;
import B4.C0070n;
import B4.C0072p;
import B4.C0074s;
import B4.C0075t;
import B4.C0076u;
import B4.C0078w;
import B4.C0081z;
import B4.EnumC0071o;
import B4.J;
import B4.K;
import B4.M;
import B4.S;
import B4.U;
import B4.V;
import B4.W;
import B4.Z;
import B4.a0;
import B4.c0;
import B4.f0;
import B4.j0;
import E4.C;
import E4.C0170c;
import E4.EnumC0176i;
import W5.AbstractC0486a1;
import android.util.Log;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0867k;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class c extends A5.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f3353d = new c();

    public static B l(Map map) {
        if (!map.containsKey("fieldPath")) {
            String str = (String) map.get("op");
            List list = (List) map.get("queries");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l((Map) it.next()));
            }
            if (str.equals("OR")) {
                return new C0081z(2, Arrays.asList((B[]) arrayList.toArray(new B[0])));
            }
            if (str.equals("AND")) {
                return new C0081z(1, Arrays.asList((B[]) arrayList.toArray(new B[0])));
            }
            throw new Error("Invalid operator");
        }
        String str2 = (String) map.get("op");
        C0074s c0074s = (C0074s) map.get("fieldPath");
        Object obj = map.get("value");
        str2.getClass();
        switch (str2) {
            case "not-in":
                return new A(c0074s, EnumC0176i.NOT_IN, (List) obj);
            case "<":
                return new A(c0074s, EnumC0176i.LESS_THAN, obj);
            case ">":
                return new A(c0074s, EnumC0176i.GREATER_THAN, obj);
            case "!=":
                return new A(c0074s, EnumC0176i.NOT_EQUAL, obj);
            case "<=":
                return new A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj);
            case "==":
                return new A(c0074s, EnumC0176i.EQUAL, obj);
            case ">=":
                return new A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj);
            case "in":
                return new A(c0074s, EnumC0176i.IN, (List) obj);
            case "array-contains":
                return new A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj);
            case "array-contains-any":
                return new A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj);
            default:
                throw new Error("Invalid operator");
        }
    }

    public static Object[] m(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(AbstractC0486a1.h("java.util.List was expected, unable to convert '", obj.getClass().getCanonicalName(), "' to an object array"));
    }

    @Override // A5.x
    public Object f(byte b7, ByteBuffer byteBuffer) {
        FirebaseFirestore firebaseFirestoreB;
        String str;
        switch (b7) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                A5.x.c(byteBuffer, 8);
                return new M(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) e(byteBuffer)).d((String) e(byteBuffer));
            case -73:
                int iD = A5.x.d(byteBuffer);
                byte[] bArr = new byte[iD];
                byteBuffer.get(bArr);
                return new C0063g(AbstractC0867k.A(bArr, 0, iD));
            case -72:
                return new C0076u(Arrays.asList(m(e(byteBuffer))));
            case -71:
                return new C0075t(Arrays.asList(m(e(byteBuffer))));
            case -70:
                return AbstractC0080y.f1196a;
            case -69:
                return AbstractC0080y.f1197b;
            case -68:
                return new Timestamp(byteBuffer.getLong(), byteBuffer.getInt());
            case -67:
                return new C0078w(Double.valueOf(((Number) e(byteBuffer)).doubleValue()));
            case -66:
                return new C0078w(Long.valueOf(((Number) e(byteBuffer)).intValue()));
            case -65:
                return C0074s.f1191c;
            case -64:
                int iD2 = A5.x.d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD2);
                for (int i7 = 0; i7 < iD2; i7++) {
                    arrayList.add(e(byteBuffer));
                }
                return C0074s.b((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                String str2 = (String) e(byteBuffer);
                String str3 = (String) e(byteBuffer);
                K k7 = (K) e(byteBuffer);
                synchronized (e.f3360y) {
                    try {
                        firebaseFirestoreB = e.b(str2, str3);
                        if (firebaseFirestoreB == null) {
                            firebaseFirestoreB = FirebaseFirestore.e(Y3.i.f(str2), str3);
                            firebaseFirestoreB.h(k7);
                            e.g(firebaseFirestoreB, str3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return firebaseFirestoreB;
            case -59:
                try {
                    Map map = (Map) e(byteBuffer);
                    Object obj = map.get("firestore");
                    Objects.requireNonNull(obj);
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
                    Object obj2 = map.get("path");
                    Objects.requireNonNull(obj2);
                    String str4 = (String) obj2;
                    boolean zBooleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
                    Map map2 = (Map) map.get("parameters");
                    Z zC = zBooleanValue ? firebaseFirestore.c(str4) : firebaseFirestore.b(str4);
                    if (map2 == null) {
                        return zC;
                    }
                    if (map2.containsKey("filters")) {
                        Object obj3 = map2.get("filters");
                        Objects.requireNonNull(obj3);
                        zC = zC.j(l((Map) obj3));
                    }
                    Object obj4 = map2.get("where");
                    Objects.requireNonNull(obj4);
                    for (List list : (List) obj4) {
                        C0074s c0074s = (C0074s) list.get(0);
                        String str5 = (String) list.get(1);
                        Object obj5 = list.get(2);
                        if ("==".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.EQUAL, obj5));
                        } else if ("!=".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.NOT_EQUAL, obj5));
                        } else if ("<".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.LESS_THAN, obj5));
                        } else if ("<=".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj5));
                        } else if (">".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.GREATER_THAN, obj5));
                        } else if (">=".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj5));
                        } else if ("array-contains".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj5));
                        } else if ("array-contains-any".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj5));
                        } else if ("in".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.IN, (List) obj5));
                        } else if ("not-in".equals(str5)) {
                            zC.getClass();
                            zC = zC.j(new A(c0074s, EnumC0176i.NOT_IN, (List) obj5));
                        } else {
                            Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str5 + " was received but not handled.");
                        }
                    }
                    Number number = (Number) map2.get("limit");
                    if (number != null) {
                        zC = zC.d(number.longValue());
                    }
                    Number number2 = (Number) map2.get("limitToLast");
                    if (number2 != null) {
                        zC = zC.e(number2.longValue());
                    }
                    List<List> list2 = (List) map2.get("orderBy");
                    if (list2 == null) {
                        return zC;
                    }
                    for (List list3 : list2) {
                        zC = zC.f((C0074s) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? 2 : 1);
                    }
                    List list4 = (List) map2.get("startAt");
                    if (list4 != null) {
                        Object[] array = list4.toArray();
                        Objects.requireNonNull(array);
                        C0170c c0170cB = zC.b("startAt", true, array);
                        C c3 = zC.f1135a;
                        str = "FLTFirestoreMsgCodec";
                        try {
                            zC = new Z(new C(c3.f2095f, c3.f2096g, c3.f2094e, c3.f2090a, c3.f2097h, c3.f2098i, c0170cB, c3.f2099k), zC.f1136b);
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } else {
                        str = "FLTFirestoreMsgCodec";
                    }
                    List list5 = (List) map2.get("startAfter");
                    if (list5 != null) {
                        Object[] array2 = list5.toArray();
                        Objects.requireNonNull(array2);
                        C0170c c0170cB2 = zC.b("startAfter", false, array2);
                        C c4 = zC.f1135a;
                        zC = new Z(new C(c4.f2095f, c4.f2096g, c4.f2094e, c4.f2090a, c4.f2097h, c4.f2098i, c0170cB2, c4.f2099k), zC.f1136b);
                    }
                    List list6 = (List) map2.get("endAt");
                    if (list6 != null) {
                        Object[] array3 = list6.toArray();
                        Objects.requireNonNull(array3);
                        C0170c c0170cB3 = zC.b("endAt", true, array3);
                        C c7 = zC.f1135a;
                        zC = new Z(new C(c7.f2095f, c7.f2096g, c7.f2094e, c7.f2090a, c7.f2097h, c7.f2098i, c7.j, c0170cB3), zC.f1136b);
                    }
                    List list7 = (List) map2.get("endBefore");
                    if (list7 == null) {
                        return zC;
                    }
                    Object[] array4 = list7.toArray();
                    Objects.requireNonNull(array4);
                    C0170c c0170cB4 = zC.b("endBefore", false, array4);
                    C c8 = zC.f1135a;
                    return new Z(new C(c8.f2095f, c8.f2096g, c8.f2094e, c8.f2090a, c8.f2097h, c8.f2098i, c8.j, c0170cB4), zC.f1136b);
                } catch (Exception e8) {
                    e = e8;
                    str = "FLTFirestoreMsgCodec";
                }
                Log.e(str, "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e);
                return null;
            case -58:
                Map map3 = (Map) e(byteBuffer);
                J j = new J();
                if (map3.get("persistenceEnabled") != null) {
                    if (Boolean.TRUE.equals((Boolean) map3.get("persistenceEnabled"))) {
                        long jLongValue = 104857600;
                        if (map3.get("cacheSizeBytes") != null) {
                            Long lValueOf = 104857600L;
                            Object obj6 = map3.get("cacheSizeBytes");
                            if (obj6 instanceof Long) {
                                lValueOf = (Long) obj6;
                            } else if (obj6 instanceof Integer) {
                                lValueOf = Long.valueOf(((Integer) obj6).intValue());
                            }
                            jLongValue = lValueOf.longValue() == -1 ? -1L : lValueOf.longValue();
                        }
                        j.b(new W(jLongValue));
                    } else {
                        V v6 = new V(0);
                        U u4 = new U();
                        u4.f1132a = v6;
                        j.b(u4);
                    }
                }
                if (map3.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST) != null) {
                    Object obj7 = map3.get(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
                    Objects.requireNonNull(obj7);
                    j.f1099a = (String) obj7;
                    if (map3.get("sslEnabled") != null) {
                        Object obj8 = map3.get("sslEnabled");
                        Objects.requireNonNull(obj8);
                        j.f1100b = ((Boolean) obj8).booleanValue();
                    }
                }
                return j.a();
            case -57:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                double[] dArr = new double[arrayList2.size()];
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    Double d7 = (Double) arrayList2.get(i8);
                    Objects.requireNonNull(d7, "Null value at index " + i8);
                    dArr[i8] = d7.doubleValue();
                }
                return new j0(dArr);
            default:
                return super.f(b7, byteBuffer);
        }
    }

    @Override // A5.x
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        String str;
        b bVar;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            A5.x.i(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof Timestamp) {
            byteArrayOutputStream.write(-68);
            Timestamp timestamp = (Timestamp) obj;
            A5.x.i(byteArrayOutputStream, timestamp.f11828a);
            A5.x.h(byteArrayOutputStream, timestamp.f11829b);
            return;
        }
        if (obj instanceof M) {
            byteArrayOutputStream.write(-75);
            A5.x.g(byteArrayOutputStream, 8);
            M m7 = (M) obj;
            A5.x.i(byteArrayOutputStream, Double.doubleToLongBits(m7.f1116a));
            A5.x.i(byteArrayOutputStream, Double.doubleToLongBits(m7.f1117b));
            return;
        }
        if (obj instanceof j0) {
            byteArrayOutputStream.write(-57);
            k(byteArrayOutputStream, (double[]) ((j0) obj).f1167a.clone());
            return;
        }
        if (obj instanceof C0070n) {
            byteArrayOutputStream.write(-74);
            C0070n c0070n = (C0070n) obj;
            FirebaseFirestore firebaseFirestore = c0070n.f1180b;
            Y3.i iVar = firebaseFirestore.f11968g;
            iVar.b();
            k(byteArrayOutputStream, iVar.f7664b);
            k(byteArrayOutputStream, c0070n.d());
            HashMap map = e.f3360y;
            synchronized (map) {
                synchronized (map) {
                    bVar = (b) map.get(firebaseFirestore);
                }
                k(byteArrayOutputStream, bVar.f3352b);
                return;
            }
            k(byteArrayOutputStream, bVar.f3352b);
            return;
        }
        String str2 = null;
        if (obj instanceof C0072p) {
            C0072p c0072p = (C0072p) obj;
            HashMap map2 = new HashMap();
            H4.h hVar = c0072p.f1187b;
            hVar.getClass();
            map2.put("path", hVar.f3318a.c());
            if (c0072p.f1188c != null) {
                EnumC0071o enumC0071o = (EnumC0071o) e.f3361z.get(Integer.valueOf(c0072p.hashCode()));
                if (enumC0071o != null) {
                    map2.put("data", c0072p.a(enumC0071o));
                } else {
                    map2.put("data", c0072p.b());
                }
            } else {
                map2.put("data", null);
            }
            map2.put("metadata", c0072p.f1189d);
            e.f3361z.remove(Integer.valueOf(c0072p.hashCode()));
            k(byteArrayOutputStream, map2);
            return;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            EnumC0071o enumC0071o2 = (EnumC0071o) e.f3361z.get(Integer.valueOf(c0Var.hashCode()));
            for (C0072p c0072p2 : c0Var.m()) {
                H4.h hVar2 = c0072p2.f1187b;
                hVar2.getClass();
                arrayList.add(hVar2.f3318a.c());
                if (enumC0071o2 != null) {
                    arrayList2.add(c0072p2.a(enumC0071o2));
                } else {
                    arrayList2.add(c0072p2.b());
                }
                arrayList3.add(c0072p2.f1189d);
            }
            map3.put("paths", arrayList);
            map3.put("documents", arrayList2);
            map3.put("metadatas", arrayList3);
            map3.put("documentChanges", c0Var.l());
            map3.put("metadata", c0Var.f1145f);
            e.f3361z.remove(Integer.valueOf(c0Var.hashCode()));
            k(byteArrayOutputStream, map3);
            return;
        }
        if (obj instanceof C0065i) {
            C0065i c0065i = (C0065i) obj;
            HashMap map4 = new HashMap();
            int iE = p136t.e.e(c0065i.f1162a);
            if (iE == 0) {
                str2 = "DocumentChangeType.added";
            } else if (iE == 1) {
                str2 = "DocumentChangeType.modified";
            } else if (iE == 2) {
                str2 = "DocumentChangeType.removed";
            }
            map4.put("type", str2);
            a0 a0Var = c0065i.f1163b;
            map4.put("data", a0Var.b());
            H4.h hVar3 = a0Var.f1187b;
            hVar3.getClass();
            map4.put("path", hVar3.f3318a.c());
            map4.put("oldIndex", Integer.valueOf(c0065i.f1164c));
            map4.put("newIndex", Integer.valueOf(c0065i.f1165d));
            map4.put("metadata", a0Var.f1189d);
            k(byteArrayOutputStream, map4);
            return;
        }
        if (obj instanceof S) {
            S s7 = (S) obj;
            HashMap map5 = new HashMap();
            map5.put("bytesLoaded", Long.valueOf(s7.f1128c));
            map5.put("documentsLoaded", Integer.valueOf(s7.f1126a));
            map5.put("totalBytes", Long.valueOf(s7.f1129d));
            map5.put("totalDocuments", Integer.valueOf(s7.f1127b));
            int iE2 = p136t.e.e(s7.f1130e);
            if (iE2 != 0) {
                str = "running";
                if (iE2 != 1 && iE2 == 2) {
                    str = "success";
                }
            } else {
                str = "error";
            }
            map5.put("taskState", str);
            k(byteArrayOutputStream, map5);
            return;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            HashMap map6 = new HashMap();
            map6.put("hasPendingWrites", Boolean.valueOf(f0Var.f1157a));
            map6.put("isFromCache", Boolean.valueOf(f0Var.f1158b));
            k(byteArrayOutputStream, map6);
            return;
        }
        if (obj instanceof C0063g) {
            byteArrayOutputStream.write(-73);
            byte[] bArrK = ((C0063g) obj).f1159a.K();
            A5.x.j(byteArrayOutputStream, bArrK.length);
            byteArrayOutputStream.write(bArrK, 0, bArrK.length);
            return;
        }
        if (!(obj instanceof Double)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        Double d7 = (Double) obj;
        if (Double.isNaN(d7.doubleValue())) {
            byteArrayOutputStream.write(-63);
            return;
        }
        if (d7.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
            byteArrayOutputStream.write(-61);
        } else if (d7.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
            byteArrayOutputStream.write(-62);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
