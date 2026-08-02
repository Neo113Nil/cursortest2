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
import com.google.protobuf.AbstractC0911k;
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

/* loaded from: classes2.dex */
public class c extends A5.x {

    /* renamed from: d, reason: collision with root package name */
    public static final c f3353d = new c();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r4.equals(">") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static B l(Map map) {
        char c3 = 2;
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
        switch (str2.hashCode()) {
            case -1039747489:
                if (str2.equals("not-in")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 60:
                if (str2.equals("<")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 62:
                break;
            case 1084:
                if (str2.equals("!=")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1921:
                if (str2.equals("<=")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1952:
                if (str2.equals("==")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1983:
                if (str2.equals(">=")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3365:
                if (str2.equals("in")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 135338771:
                if (str2.equals("array-contains")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 355289138:
                if (str2.equals("array-contains-any")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                return new A(c0074s, EnumC0176i.NOT_IN, (List) obj);
            case 1:
                return new A(c0074s, EnumC0176i.LESS_THAN, obj);
            case 2:
                return new A(c0074s, EnumC0176i.GREATER_THAN, obj);
            case 3:
                return new A(c0074s, EnumC0176i.NOT_EQUAL, obj);
            case 4:
                return new A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj);
            case 5:
                return new A(c0074s, EnumC0176i.EQUAL, obj);
            case 6:
                return new A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj);
            case 7:
                return new A(c0074s, EnumC0176i.IN, (List) obj);
            case '\b':
                return new A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj);
            case '\t':
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
        FirebaseFirestore b8;
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
                int d7 = A5.x.d(byteBuffer);
                byte[] bArr = new byte[d7];
                byteBuffer.get(bArr);
                return new C0063g(AbstractC0911k.A(bArr, 0, d7));
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
                int d8 = A5.x.d(byteBuffer);
                ArrayList arrayList = new ArrayList(d8);
                for (int i7 = 0; i7 < d8; i7++) {
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
                        b8 = e.b(str2, str3);
                        if (b8 == null) {
                            b8 = FirebaseFirestore.e(Y3.i.f(str2), str3);
                            b8.h(k7);
                            e.g(b8, str3);
                        }
                    } finally {
                    }
                }
                return b8;
            case -59:
                try {
                    Map map = (Map) e(byteBuffer);
                    Object obj = map.get("firestore");
                    Objects.requireNonNull(obj);
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
                    Object obj2 = map.get("path");
                    Objects.requireNonNull(obj2);
                    String str4 = (String) obj2;
                    boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
                    Map map2 = (Map) map.get("parameters");
                    Z c3 = booleanValue ? firebaseFirestore.c(str4) : firebaseFirestore.b(str4);
                    if (map2 == null) {
                        return c3;
                    }
                    if (map2.containsKey("filters")) {
                        Object obj3 = map2.get("filters");
                        Objects.requireNonNull(obj3);
                        c3 = c3.j(l((Map) obj3));
                    }
                    Object obj4 = map2.get("where");
                    Objects.requireNonNull(obj4);
                    for (List list : (List) obj4) {
                        C0074s c0074s = (C0074s) list.get(0);
                        String str5 = (String) list.get(1);
                        Object obj5 = list.get(2);
                        if ("==".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.EQUAL, obj5));
                        } else if ("!=".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.NOT_EQUAL, obj5));
                        } else if ("<".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.LESS_THAN, obj5));
                        } else if ("<=".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj5));
                        } else if (">".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.GREATER_THAN, obj5));
                        } else if (">=".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj5));
                        } else if ("array-contains".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj5));
                        } else if ("array-contains-any".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj5));
                        } else if ("in".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.IN, (List) obj5));
                        } else if ("not-in".equals(str5)) {
                            c3.getClass();
                            c3 = c3.j(new A(c0074s, EnumC0176i.NOT_IN, (List) obj5));
                        } else {
                            Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str5 + " was received but not handled.");
                        }
                    }
                    Number number = (Number) map2.get("limit");
                    if (number != null) {
                        c3 = c3.d(number.longValue());
                    }
                    Number number2 = (Number) map2.get("limitToLast");
                    if (number2 != null) {
                        c3 = c3.e(number2.longValue());
                    }
                    List<List> list2 = (List) map2.get("orderBy");
                    if (list2 == null) {
                        return c3;
                    }
                    for (List list3 : list2) {
                        c3 = c3.f((C0074s) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? 2 : 1);
                    }
                    List list4 = (List) map2.get("startAt");
                    if (list4 != null) {
                        Object[] array = list4.toArray();
                        Objects.requireNonNull(array);
                        C0170c b9 = c3.b("startAt", true, array);
                        C c4 = c3.f1135a;
                        str = "FLTFirestoreMsgCodec";
                        try {
                            c3 = new Z(new C(c4.f2095f, c4.f2096g, c4.f2094e, c4.f2090a, c4.f2097h, c4.f2098i, b9, c4.f2099k), c3.f1136b);
                        } catch (Exception e7) {
                            e = e7;
                            Log.e(str, "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e);
                            return null;
                        }
                    } else {
                        str = "FLTFirestoreMsgCodec";
                    }
                    List list5 = (List) map2.get("startAfter");
                    if (list5 != null) {
                        Object[] array2 = list5.toArray();
                        Objects.requireNonNull(array2);
                        C0170c b10 = c3.b("startAfter", false, array2);
                        C c7 = c3.f1135a;
                        c3 = new Z(new C(c7.f2095f, c7.f2096g, c7.f2094e, c7.f2090a, c7.f2097h, c7.f2098i, b10, c7.f2099k), c3.f1136b);
                    }
                    List list6 = (List) map2.get("endAt");
                    if (list6 != null) {
                        Object[] array3 = list6.toArray();
                        Objects.requireNonNull(array3);
                        C0170c b11 = c3.b("endAt", true, array3);
                        C c8 = c3.f1135a;
                        c3 = new Z(new C(c8.f2095f, c8.f2096g, c8.f2094e, c8.f2090a, c8.f2097h, c8.f2098i, c8.j, b11), c3.f1136b);
                    }
                    List list7 = (List) map2.get("endBefore");
                    if (list7 == null) {
                        return c3;
                    }
                    Object[] array4 = list7.toArray();
                    Objects.requireNonNull(array4);
                    C0170c b12 = c3.b("endBefore", false, array4);
                    C c9 = c3.f1135a;
                    return new Z(new C(c9.f2095f, c9.f2096g, c9.f2094e, c9.f2090a, c9.f2097h, c9.f2098i, c9.j, b12), c3.f1136b);
                } catch (Exception e8) {
                    e = e8;
                    str = "FLTFirestoreMsgCodec";
                }
            case -58:
                Map map3 = (Map) e(byteBuffer);
                J j = new J();
                if (map3.get("persistenceEnabled") != null) {
                    if (Boolean.TRUE.equals((Boolean) map3.get("persistenceEnabled"))) {
                        long j3 = 104857600;
                        if (map3.get("cacheSizeBytes") != null) {
                            Long l7 = 104857600L;
                            Object obj6 = map3.get("cacheSizeBytes");
                            if (obj6 instanceof Long) {
                                l7 = (Long) obj6;
                            } else if (obj6 instanceof Integer) {
                                l7 = Long.valueOf(((Integer) obj6).intValue());
                            }
                            j3 = l7.longValue() == -1 ? -1L : l7.longValue();
                        }
                        j.b(new W(j3));
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
                    Double d9 = (Double) arrayList2.get(i8);
                    Objects.requireNonNull(d9, "Null value at index " + i8);
                    dArr[i8] = d9.doubleValue();
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
            HashMap hashMap = e.f3360y;
            synchronized (hashMap) {
                synchronized (hashMap) {
                    bVar = (b) hashMap.get(firebaseFirestore);
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
            HashMap hashMap2 = new HashMap();
            H4.h hVar = c0072p.f1187b;
            hVar.getClass();
            hashMap2.put("path", hVar.f3318a.c());
            if (c0072p.f1188c != null) {
                EnumC0071o enumC0071o = (EnumC0071o) e.f3361z.get(Integer.valueOf(c0072p.hashCode()));
                if (enumC0071o != null) {
                    hashMap2.put("data", c0072p.a(enumC0071o));
                } else {
                    hashMap2.put("data", c0072p.b());
                }
            } else {
                hashMap2.put("data", null);
            }
            hashMap2.put("metadata", c0072p.f1189d);
            e.f3361z.remove(Integer.valueOf(c0072p.hashCode()));
            k(byteArrayOutputStream, hashMap2);
            return;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            ArrayList arrayList = new ArrayList();
            HashMap hashMap3 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            EnumC0071o enumC0071o2 = (EnumC0071o) e.f3361z.get(Integer.valueOf(c0Var.hashCode()));
            Iterator it = c0Var.m().iterator();
            while (it.hasNext()) {
                C0072p c0072p2 = (C0072p) it.next();
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
            hashMap3.put("paths", arrayList);
            hashMap3.put("documents", arrayList2);
            hashMap3.put("metadatas", arrayList3);
            hashMap3.put("documentChanges", c0Var.l());
            hashMap3.put("metadata", c0Var.f1145f);
            e.f3361z.remove(Integer.valueOf(c0Var.hashCode()));
            k(byteArrayOutputStream, hashMap3);
            return;
        }
        if (obj instanceof C0065i) {
            C0065i c0065i = (C0065i) obj;
            HashMap hashMap4 = new HashMap();
            int e7 = t.e.e(c0065i.f1162a);
            if (e7 == 0) {
                str2 = "DocumentChangeType.added";
            } else if (e7 == 1) {
                str2 = "DocumentChangeType.modified";
            } else if (e7 == 2) {
                str2 = "DocumentChangeType.removed";
            }
            hashMap4.put("type", str2);
            a0 a0Var = c0065i.f1163b;
            hashMap4.put("data", a0Var.b());
            H4.h hVar3 = a0Var.f1187b;
            hVar3.getClass();
            hashMap4.put("path", hVar3.f3318a.c());
            hashMap4.put("oldIndex", Integer.valueOf(c0065i.f1164c));
            hashMap4.put("newIndex", Integer.valueOf(c0065i.f1165d));
            hashMap4.put("metadata", a0Var.f1189d);
            k(byteArrayOutputStream, hashMap4);
            return;
        }
        if (obj instanceof S) {
            S s7 = (S) obj;
            HashMap hashMap5 = new HashMap();
            hashMap5.put("bytesLoaded", Long.valueOf(s7.f1128c));
            hashMap5.put("documentsLoaded", Integer.valueOf(s7.f1126a));
            hashMap5.put("totalBytes", Long.valueOf(s7.f1129d));
            hashMap5.put("totalDocuments", Integer.valueOf(s7.f1127b));
            int e8 = t.e.e(s7.f1130e);
            if (e8 != 0) {
                str = "running";
                if (e8 != 1 && e8 == 2) {
                    str = "success";
                }
            } else {
                str = "error";
            }
            hashMap5.put("taskState", str);
            k(byteArrayOutputStream, hashMap5);
            return;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            HashMap hashMap6 = new HashMap();
            hashMap6.put("hasPendingWrites", Boolean.valueOf(f0Var.f1157a));
            hashMap6.put("isFromCache", Boolean.valueOf(f0Var.f1158b));
            k(byteArrayOutputStream, hashMap6);
            return;
        }
        if (obj instanceof C0063g) {
            byteArrayOutputStream.write(-73);
            byte[] K7 = ((C0063g) obj).f1159a.K();
            A5.x.j(byteArrayOutputStream, K7.length);
            byteArrayOutputStream.write(K7, 0, K7.length);
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
