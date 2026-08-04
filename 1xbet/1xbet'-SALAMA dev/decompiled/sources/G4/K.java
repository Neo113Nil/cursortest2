package G4;

import E4.AbstractC0178k;
import E4.C0170c;
import E4.C0171d;
import E4.C0177j;
import E4.EnumC0176i;
import W5.AbstractC0486a1;
import Y4.I0;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements InterfaceC0273f {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final byte[] f2900B = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f2902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4.c f2903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2905d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0286t f2906e = new C0286t(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2907f = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PriorityQueue f2908x = new PriorityQueue(10, new C0269b(3));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2909y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2910z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f2901A = -1;

    public K(S s7, R4.c cVar, C4.e eVar) {
        this.f2902a = s7;
        this.f2903b = cVar;
        String str = eVar.f1580a;
        this.f2904c = str == null ? "" : str;
    }

    public static Object[] a(H4.a aVar, E4.I i7, Collection collection) {
        Iterator it;
        Iterator it2;
        H4.d dVar;
        if (collection == null) {
            return null;
        }
        ArrayList<F4.c> arrayList = new ArrayList();
        arrayList.add(new F4.c());
        Iterator it3 = collection.iterator();
        Iterator it4 = aVar.b().iterator();
        while (it4.hasNext()) {
            H4.d dVar2 = (H4.d) it4.next();
            I0 i8 = (I0) it3.next();
            for (F4.c cVar : arrayList) {
                H4.j jVar = dVar2.f3310a;
                Iterator it5 = i7.f2125c.iterator();
                while (true) {
                    boolean zHasNext = it5.hasNext();
                    int i9 = dVar2.f3311b;
                    if (zHasNext) {
                        AbstractC0178k abstractC0178k = (AbstractC0178k) it5.next();
                        if (abstractC0178k instanceof C0177j) {
                            C0177j c0177j = (C0177j) abstractC0178k;
                            if (c0177j.f2201c.equals(jVar)) {
                                EnumC0176i enumC0176i = EnumC0176i.IN;
                                EnumC0176i enumC0176i2 = c0177j.f2199a;
                                if (enumC0176i2.equals(enumC0176i) || enumC0176i2.equals(EnumC0176i.NOT_IN)) {
                                    if (H4.o.f(i8)) {
                                        ArrayList<F4.c> arrayList2 = new ArrayList(arrayList);
                                        arrayList = new ArrayList();
                                        for (I0 i10 : i8.G().a()) {
                                            for (F4.c cVar2 : arrayList2) {
                                                F4.c cVar3 = new F4.c();
                                                F4.e eVar = cVar2.f2746a;
                                                byte[] bArrCopyOf = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
                                                F4.e eVar2 = cVar3.f2746a;
                                                eVar2.a(bArrCopyOf.length);
                                                Iterator it6 = it3;
                                                int i11 = 0;
                                                for (int length = bArrCopyOf.length; i11 < length; length = length) {
                                                    byte b7 = bArrCopyOf[i11];
                                                    Iterator it7 = it4;
                                                    byte[] bArr = eVar2.f2751a;
                                                    H4.d dVar3 = dVar2;
                                                    int i12 = eVar2.f2752b;
                                                    eVar2.f2752b = i12 + 1;
                                                    bArr[i12] = b7;
                                                    i11++;
                                                    it4 = it7;
                                                    dVar2 = dVar3;
                                                }
                                                p113p3.f fVarA = cVar3.a(i9);
                                                P6.b.S(i10, fVarA);
                                                fVarA.f0();
                                                arrayList.add(cVar3);
                                                it3 = it6;
                                                it4 = it4;
                                                dVar2 = dVar2;
                                            }
                                        }
                                        it = it3;
                                        it2 = it4;
                                        dVar = dVar2;
                                    }
                                    it3 = it;
                                    it4 = it2;
                                    dVar2 = dVar;
                                }
                            }
                        }
                        it3 = it3;
                        it4 = it4;
                        dVar2 = dVar2;
                    }
                    it = it3;
                    it2 = it4;
                    dVar = dVar2;
                    p113p3.f fVarA2 = cVar.a(i9);
                    P6.b.S(i8, fVarA2);
                    fVarA2.f0();
                    it3 = it;
                    it4 = it2;
                    dVar2 = dVar;
                }
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            F4.e eVar3 = ((F4.c) arrayList.get(i13)).f2746a;
            objArr[i13] = Arrays.copyOf(eVar3.f2751a, eVar3.f2752b);
        }
        return objArr;
    }

    public static H4.b d(Collection collection) {
        p113p3.f.O("Found empty index group when looking for least recent index offset.", !collection.isEmpty(), new Object[0]);
        Iterator it = collection.iterator();
        H4.b bVar = ((H4.a) it.next()).f3302d.f3309b;
        int iMax = bVar.f3307c;
        while (it.hasNext()) {
            H4.b bVar2 = ((H4.a) it.next()).f3302d.f3309b;
            if (bVar2.compareTo(bVar) < 0) {
                bVar = bVar2;
            }
            iMax = Math.max(bVar2.f3307c, iMax);
        }
        return new H4.b(bVar.f3305a, bVar.f3306b, iMax);
    }

    @Override // G4.InterfaceC0273f
    public final List B(String str) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        ArrayList arrayList = new ArrayList();
        C1017n0 c1017n0C0 = this.f2902a.c0("SELECT parent FROM collection_parents WHERE collection_id = ?");
        c1017n0C0.c(str);
        Cursor cursorJ = c1017n0C0.J();
        while (cursorJ.moveToNext()) {
            try {
                arrayList.add(p113p3.f.A(cursorJ.getString(0)));
            } catch (Throwable th) {
                if (cursorJ != null) {
                    try {
                        cursorJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorJ.close();
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Collection] */
    @Override // G4.InterfaceC0273f
    public final List F(E4.I i7) {
        List listSingletonList;
        Iterator it;
        Collection collectionValues;
        byte[] bArrCopyOf;
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = f(i7).iterator();
        while (true) {
            List list = null;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    E4.I i8 = (E4.I) pair.first;
                    H4.a aVar = (H4.a) pair.second;
                    i8.getClass();
                    H4.d dVarA = aVar.a();
                    if (dVarA != null) {
                        Iterator it4 = i8.d(dVarA.f3310a).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                listSingletonList = null;
                                break;
                            }
                            C0177j c0177j = (C0177j) it4.next();
                            int iOrdinal = c0177j.f2199a.ordinal();
                            I0 i9 = c0177j.f2200b;
                            if (iOrdinal == 6) {
                                listSingletonList = Collections.singletonList(i9);
                                break;
                            }
                            if (iOrdinal == 7) {
                                listSingletonList = i9.G().a();
                                break;
                            }
                        }
                    } else {
                        listSingletonList = list;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it5 = aVar.b().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            it = it3;
                            collectionValues = null;
                            break;
                        }
                        H4.d dVar = (H4.d) it5.next();
                        Iterator it6 = i8.d(dVar.f3310a).iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                C0177j c0177j2 = (C0177j) it6.next();
                                Iterator it7 = it6;
                                int iOrdinal2 = c0177j2.f2199a.ordinal();
                                it = it3;
                                H4.j jVar = dVar.f3310a;
                                I0 i10 = c0177j2.f2200b;
                                Iterator it8 = it5;
                                if (iOrdinal2 != 2) {
                                    if (iOrdinal2 != 3) {
                                        if (iOrdinal2 == 8) {
                                            linkedHashMap.put(jVar, i10);
                                        } else if (iOrdinal2 != 9) {
                                        }
                                    }
                                    linkedHashMap.put(jVar, i10);
                                    collectionValues = linkedHashMap.values();
                                    break;
                                }
                                linkedHashMap.put(jVar, i10);
                                it6 = it7;
                                it3 = it;
                                it5 = it8;
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it9 = aVar.b().iterator();
                    boolean zBooleanValue = true;
                    while (it9.hasNext()) {
                        H4.d dVar2 = (H4.d) it9.next();
                        Iterator it10 = it9;
                        boolean zB = p136t.e.b(dVar2.f3311b, 1);
                        C0170c c0170c = i8.f2129g;
                        Pair pairA = zB ? i8.a(dVar2, c0170c) : i8.c(dVar2, c0170c);
                        arrayList4.add((I0) pairA.first);
                        zBooleanValue &= ((Boolean) pairA.second).booleanValue();
                        it9 = it10;
                    }
                    C0170c c0170c2 = new C0170c(arrayList4, zBooleanValue);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it11 = aVar.b().iterator();
                    boolean zBooleanValue2 = true;
                    while (it11.hasNext()) {
                        H4.d dVar3 = (H4.d) it11.next();
                        Iterator it12 = it11;
                        boolean zB2 = p136t.e.b(dVar3.f3311b, 1);
                        C0170c c0170c3 = i8.f2130h;
                        Pair pairC = zB2 ? i8.c(dVar3, c0170c3) : i8.a(dVar3, c0170c3);
                        arrayList5.add((I0) pairC.first);
                        zBooleanValue2 &= ((Boolean) pairC.second).booleanValue();
                        it11 = it12;
                    }
                    C0170c c0170c4 = new C0170c(arrayList5, zBooleanValue2);
                    if (Q0.a.E()) {
                        Q0.a.v(1, "K", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", aVar, i8, listSingletonList, c0170c2, c0170c4);
                    }
                    Object[] objArrA = a(aVar, i8, c0170c2.f2170b);
                    String str = c0170c2.f2169a ? ">=" : ">";
                    Object[] objArrA2 = a(aVar, i8, arrayList5);
                    String str2 = zBooleanValue2 ? "<=" : "<";
                    Object[] objArrA3 = a(aVar, i8, collectionValues);
                    int iMax = Math.max(objArrA.length, objArrA2.length) * (listSingletonList != null ? listSingletonList.size() : 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value ");
                    sb.append(str);
                    sb.append(" ? AND directional_value ");
                    sb.append(str2);
                    sb.append(" ? ");
                    StringBuilder sbH = L4.r.h(" UNION ", sb, iMax);
                    if (objArrA3 != null) {
                        StringBuilder sb2 = new StringBuilder("SELECT document_key, directional_value FROM (");
                        sb2.append((CharSequence) sbH);
                        sb2.append(") WHERE directional_value NOT IN (");
                        sb2.append((CharSequence) L4.r.h(", ", "?", objArrA3.length));
                        sb2.append(")");
                        sbH = sb2;
                    }
                    int size = iMax / (listSingletonList != null ? listSingletonList.size() : 1);
                    Object[] objArr = new Object[(iMax * 5) + (objArrA3 != null ? objArrA3.length : 0)];
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < iMax) {
                        objArr[i12] = Integer.valueOf(aVar.f3299a);
                        int i13 = i12 + 2;
                        objArr[i12 + 1] = this.f2904c;
                        int i14 = i12 + 3;
                        if (listSingletonList != null) {
                            I0 i15 = (I0) listSingletonList.get(i11 / size);
                            F4.c cVar = new F4.c();
                            p113p3.f fVarA = cVar.a(1);
                            P6.b.S(i15, fVarA);
                            fVarA.f0();
                            F4.e eVar = cVar.f2746a;
                            bArrCopyOf = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
                        } else {
                            bArrCopyOf = f2900B;
                        }
                        objArr[i13] = bArrCopyOf;
                        int i16 = i12 + 4;
                        int i17 = i11 % size;
                        objArr[i14] = objArrA[i17];
                        i12 += 5;
                        objArr[i16] = objArrA2[i17];
                        i11++;
                        listSingletonList = listSingletonList;
                        aVar = aVar;
                        iMax = iMax;
                    }
                    if (objArrA3 != null) {
                        int length = objArrA3.length;
                        int i18 = 0;
                        while (i18 < length) {
                            objArr[i12] = objArrA3[i18];
                            i18++;
                            i12++;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(sbH.toString());
                    arrayList6.addAll(Arrays.asList(objArr));
                    Object[] array = arrayList6.toArray();
                    arrayList.add(String.valueOf(array[0]));
                    arrayList2.addAll(Arrays.asList(array).subList(1, array.length));
                    it3 = it;
                    list = null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(TextUtils.join(" UNION ", arrayList));
                sb3.append("ORDER BY directional_value, document_key ");
                List list2 = i7.f2124b;
                sb3.append(p136t.e.b(((E4.A) list2.get(list2.size() - 1)).f2084a, 1) ? "asc " : "desc ");
                String strH = AbstractC0486a1.h("SELECT DISTINCT document_key FROM (", sb3.toString(), ")");
                if (i7.e()) {
                    StringBuilder sbD = p136t.e.d(strH, " LIMIT ");
                    sbD.append(i7.f2128f);
                    strH = sbD.toString();
                }
                p113p3.f.O("Cannot perform query with more than 999 bind elements", arrayList2.size() < 1000, new Object[0]);
                C1017n0 c1017n0C0 = this.f2902a.c0(strH);
                c1017n0C0.c(arrayList2.toArray());
                ArrayList arrayList7 = new ArrayList();
                Cursor cursorJ = c1017n0C0.J();
                while (cursorJ.moveToNext()) {
                    try {
                        arrayList7.add(new H4.h(H4.m.y(cursorJ.getString(0))));
                    } catch (Throwable th) {
                        if (cursorJ == null) {
                            throw th;
                        }
                        try {
                            cursorJ.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                cursorJ.close();
                Q0.a.v(1, "K", "Index scan returned %s documents", Integer.valueOf(arrayList7.size()));
                return arrayList7;
            }
            E4.I i19 = (E4.I) it2.next();
            H4.a aVarB = b(i19);
            if (aVarB == null) {
                return null;
            }
            arrayList3.add(Pair.create(i19, aVarB));
        }
    }

    @Override // G4.InterfaceC0273f
    public final void G() {
        S s7 = this.f2902a;
        s7.b0("DELETE FROM index_configuration", new Object[0]);
        s7.b0("DELETE FROM index_entries", new Object[0]);
        s7.b0("DELETE FROM index_state", new Object[0]);
        this.f2908x.clear();
        this.f2907f.clear();
    }

    @Override // G4.InterfaceC0273f
    public final void H(H4.a aVar) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        int i7 = this.f2910z + 1;
        String str = aVar.f3300b;
        ArrayList<H4.d> arrayList = aVar.f3301c;
        H4.a aVar2 = new H4.a(i7, str, arrayList, aVar.f3302d);
        Integer numValueOf = Integer.valueOf(i7);
        this.f2903b.getClass();
        W4.a aVarY = W4.g.y();
        aVarY.d();
        W4.g.v((W4.g) aVarY.f12096b);
        for (H4.d dVar : arrayList) {
            W4.c cVarB = W4.e.B();
            String strC = dVar.f3310a.c();
            cVarB.d();
            W4.e.v((W4.e) cVarB.f12096b, strC);
            int i8 = dVar.f3311b;
            if (i8 == 3) {
                cVarB.d();
                W4.e.x((W4.e) cVarB.f12096b);
            } else if (i8 == 1) {
                W4.d dVar2 = W4.d.ASCENDING;
                cVarB.d();
                W4.e.w((W4.e) cVarB.f12096b, dVar2);
            } else {
                W4.d dVar3 = W4.d.DESCENDING;
                cVarB.d();
                W4.e.w((W4.e) cVarB.f12096b, dVar3);
            }
            aVarY.d();
            W4.g.w((W4.g) aVarY.f12096b, (W4.e) cVarB.b());
        }
        this.f2902a.b0("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", numValueOf, str, ((W4.g) aVarY.b()).d());
        h(aVar2);
    }

    @Override // G4.InterfaceC0273f
    public final H4.b L(E4.I i7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = f(i7).iterator();
        while (it.hasNext()) {
            H4.a aVarB = b((E4.I) it.next());
            if (aVarB != null) {
                arrayList.add(aVarB);
            }
        }
        return d(arrayList);
    }

    @Override // G4.InterfaceC0273f
    public final H4.b O(String str) {
        Collection collectionC = c(str);
        p113p3.f.O("minOffset was called for collection without indexes", !collectionC.isEmpty(), new Object[0]);
        return d(collectionC);
    }

    @Override // G4.InterfaceC0273f
    public final void X(E4.I i7) {
        H4.a aVar;
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        for (E4.I i8 : f(i7)) {
            int iM = m(i8);
            if (iM == 1 || iM == 2) {
                String strH = i8.f2127e;
                if (strH == null) {
                    strH = i8.f2126d.h();
                }
                TreeSet treeSet = new TreeSet(new C0269b(8));
                ArrayList<C0177j> arrayList = new ArrayList();
                Iterator it = i8.f2125c.iterator();
                while (it.hasNext()) {
                    C0177j c0177j = (C0177j) ((AbstractC0178k) it.next());
                    if (c0177j.f()) {
                        treeSet.add(c0177j);
                    } else {
                        arrayList.add(c0177j);
                    }
                }
                if (treeSet.size() > 1) {
                    aVar = null;
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0177j c0177j2 : arrayList) {
                        if (!c0177j2.f2201c.equals(H4.j.f3321b)) {
                            EnumC0176i enumC0176i = EnumC0176i.ARRAY_CONTAINS;
                            EnumC0176i enumC0176i2 = c0177j2.f2199a;
                            boolean zEquals = enumC0176i2.equals(enumC0176i);
                            H4.j jVar = c0177j2.f2201c;
                            if (zEquals || enumC0176i2.equals(EnumC0176i.ARRAY_CONTAINS_ANY)) {
                                arrayList2.add(new H4.d(3, jVar));
                            } else if (!hashSet.contains(jVar)) {
                                hashSet.add(jVar);
                                arrayList2.add(new H4.d(1, jVar));
                            }
                        }
                    }
                    for (E4.A a2 : i8.f2124b) {
                        if (!a2.f2085b.equals(H4.j.f3321b)) {
                            H4.j jVar2 = a2.f2085b;
                            if (!hashSet.contains(jVar2)) {
                                hashSet.add(jVar2);
                                arrayList2.add(new H4.d(a2.f2084a == 1 ? 1 : 2, jVar2));
                            }
                        }
                    }
                    aVar = new H4.a(-1, strH, arrayList2, H4.a.f3297e);
                }
                if (aVar != null) {
                    H(aVar);
                }
            }
        }
    }

    public final H4.a b(E4.I i7) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        String strH = i7.f2127e;
        H4.m mVar = i7.f2126d;
        if (strH == null) {
            strH = mVar.h();
        }
        TreeSet treeSet = new TreeSet(new C0269b(8));
        ArrayList arrayList = new ArrayList();
        Iterator it = i7.f2125c.iterator();
        while (it.hasNext()) {
            C0177j c0177j = (C0177j) ((AbstractC0178k) it.next());
            if (c0177j.f()) {
                treeSet.add(c0177j);
            } else {
                arrayList.add(c0177j);
            }
        }
        String strH2 = i7.f2127e;
        if (strH2 == null) {
            strH2 = mVar.h();
        }
        Collection<H4.a> collectionC = c(strH2);
        H4.a aVar = null;
        if (collectionC.isEmpty()) {
            return null;
        }
        for (H4.a aVar2 : collectionC) {
            p113p3.f.O("Collection IDs do not match", aVar2.f3300b.equals(strH), new Object[0]);
            if (treeSet.size() <= 1) {
                H4.d dVarA = aVar2.a();
                if (dVarA != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (p003a.a.a0((C0177j) it2.next(), dVarA)) {
                            }
                        }
                    }
                }
                Iterator it3 = i7.f2124b.iterator();
                ArrayList arrayListB = aVar2.b();
                HashSet hashSet = new HashSet();
                int i8 = 0;
                while (i8 < arrayListB.size()) {
                    H4.d dVar = (H4.d) arrayListB.get(i8);
                    Iterator it4 = arrayList.iterator();
                    do {
                        if (!it4.hasNext()) {
                            break;
                        }
                    } while (!p003a.a.a0((C0177j) it4.next(), dVar));
                    hashSet.add(((H4.d) arrayListB.get(i8)).f3310a.c());
                    i8++;
                }
                if (i8 != arrayListB.size()) {
                    if (treeSet.size() > 0) {
                        C0177j c0177j2 = (C0177j) treeSet.first();
                        if (!hashSet.contains(c0177j2.f2201c.c())) {
                            H4.d dVar2 = (H4.d) arrayListB.get(i8);
                            if (!p003a.a.a0(c0177j2, dVar2) || !p003a.a.b0((E4.A) it3.next(), dVar2)) {
                            }
                        }
                        i8++;
                    }
                    while (true) {
                        if (i8 < arrayListB.size()) {
                            H4.d dVar3 = (H4.d) arrayListB.get(i8);
                            if (it3.hasNext() && p003a.a.b0((E4.A) it3.next(), dVar3)) {
                                i8++;
                            }
                        }
                    }
                }
                if (aVar == null || aVar2.f3301c.size() > aVar.f3301c.size()) {
                    aVar = aVar2;
                }
            }
        }
        return aVar;
    }

    public final Collection c(String str) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        Map map = (Map) this.f2907f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // G4.InterfaceC0273f
    public final void e(p075k4.c cVar) {
        int i7;
        byte[] bArrCopyOf;
        final int i8 = 1;
        final int i9 = 0;
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            H4.m mVar = ((H4.h) entry.getKey()).f3318a;
            for (H4.a aVar : c(mVar.l(mVar.f3312a.size() - 2))) {
                H4.h hVar = (H4.h) entry.getKey();
                TreeSet treeSet = new TreeSet();
                C1017n0 c1017n0C0 = this.f2902a.c0("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                c1017n0C0.c(Integer.valueOf(aVar.f3299a), hVar.f3318a.c(), this.f2904c);
                Cursor cursorJ = c1017n0C0.J();
                while (true) {
                    try {
                        boolean zMoveToNext = cursorJ.moveToNext();
                        i7 = aVar.f3299a;
                        if (!zMoveToNext) {
                            break;
                        } else {
                            treeSet.add(new F4.a(i7, hVar, cursorJ.getBlob(0), cursorJ.getBlob(1)));
                        }
                    } catch (Throwable th) {
                        if (cursorJ != null) {
                            try {
                                cursorJ.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                cursorJ.close();
                H4.k kVar = (H4.k) entry.getValue();
                TreeSet treeSet2 = new TreeSet();
                F4.c cVar2 = new F4.c();
                Iterator it2 = aVar.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        F4.e eVar = cVar2.f2746a;
                        bArrCopyOf = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
                        break;
                    }
                    H4.d dVar = (H4.d) it2.next();
                    I0 i0F = kVar.f3327e.f(dVar.f3310a);
                    if (i0F == null) {
                        bArrCopyOf = null;
                        break;
                    } else {
                        p113p3.f fVarA = cVar2.a(dVar.f3311b);
                        P6.b.S(i0F, fVarA);
                        fVarA.f0();
                    }
                }
                if (bArrCopyOf != null) {
                    H4.d dVarA = aVar.a();
                    if (dVarA != null) {
                        I0 i0F2 = kVar.f3327e.f(dVarA.f3310a);
                        if (H4.o.f(i0F2)) {
                            for (I0 i10 : i0F2.G().a()) {
                                F4.c cVar3 = new F4.c();
                                p113p3.f fVarA2 = cVar3.a(1);
                                P6.b.S(i10, fVarA2);
                                fVarA2.f0();
                                F4.e eVar2 = cVar3.f2746a;
                                treeSet2.add(new F4.a(i7, kVar.f3323a, Arrays.copyOf(eVar2.f2751a, eVar2.f2752b), bArrCopyOf));
                            }
                        }
                    } else {
                        treeSet2.add(new F4.a(i7, kVar.f3323a, new byte[0], bArrCopyOf));
                    }
                }
                if (!treeSet.equals(treeSet2)) {
                    final H4.k kVar2 = (H4.k) entry.getValue();
                    Q0.a.v(1, "K", "Updating index entries for document '%s'", kVar2.f3323a);
                    L4.h hVar2 = new L4.h(this) { // from class: G4.H

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ K f2893b;

                        {
                            this.f2893b = this;
                        }

                        @Override // L4.h
                        public final void accept(Object obj) {
                            F4.a aVar2 = (F4.a) obj;
                            switch (i9) {
                                case 0:
                                    K k7 = this.f2893b;
                                    k7.getClass();
                                    Integer numValueOf = Integer.valueOf(aVar2.f2740a);
                                    String strC = kVar2.f3323a.f3318a.c();
                                    k7.f2902a.b0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", numValueOf, k7.f2904c, aVar2.f2742c, aVar2.f2743d, strC);
                                    break;
                                default:
                                    K k8 = this.f2893b;
                                    k8.getClass();
                                    Integer numValueOf2 = Integer.valueOf(aVar2.f2740a);
                                    String strC2 = kVar2.f3323a.f3318a.c();
                                    k8.f2902a.b0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", numValueOf2, k8.f2904c, aVar2.f2742c, aVar2.f2743d, strC2);
                                    break;
                            }
                        }
                    };
                    L4.h hVar3 = new L4.h(this) { // from class: G4.H

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ K f2893b;

                        {
                            this.f2893b = this;
                        }

                        @Override // L4.h
                        public final void accept(Object obj) {
                            F4.a aVar2 = (F4.a) obj;
                            switch (i8) {
                                case 0:
                                    K k7 = this.f2893b;
                                    k7.getClass();
                                    Integer numValueOf = Integer.valueOf(aVar2.f2740a);
                                    String strC = kVar2.f3323a.f3318a.c();
                                    k7.f2902a.b0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", numValueOf, k7.f2904c, aVar2.f2742c, aVar2.f2743d, strC);
                                    break;
                                default:
                                    K k8 = this.f2893b;
                                    k8.getClass();
                                    Integer numValueOf2 = Integer.valueOf(aVar2.f2740a);
                                    String strC2 = kVar2.f3323a.f3318a.c();
                                    k8.f2902a.b0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", numValueOf2, k8.f2904c, aVar2.f2742c, aVar2.f2743d, strC2);
                                    break;
                            }
                        }
                    };
                    H5.k kVar3 = L4.r.f4389a;
                    L4.r.f(treeSet.iterator(), treeSet2.iterator(), treeSet.comparator() != null ? treeSet.comparator() : new C0269b(10), hVar2, hVar3);
                }
            }
        }
    }

    public final List f(E4.I i7) {
        List listSingletonList;
        HashMap map = this.f2905d;
        if (map.containsKey(i7)) {
            return (List) map.get(i7);
        }
        ArrayList arrayList = new ArrayList();
        if (i7.f2125c.isEmpty()) {
            arrayList.add(i7);
        } else {
            C0171d c0171d = new C0171d(1, i7.f2125c);
            if (Collections.unmodifiableList(c0171d.f2171a).isEmpty()) {
                listSingletonList = Collections.emptyList();
            } else {
                AbstractC0178k abstractC0178kK = Y4.D.k(Y4.D.l(c0171d));
                p113p3.f.O("computeDistributedNormalForm did not result in disjunctive normal form", Y4.D.x(abstractC0178kK), new Object[0]);
                listSingletonList = ((abstractC0178kK instanceof C0177j) || Y4.D.z(abstractC0178kK)) ? Collections.singletonList(abstractC0178kK) : abstractC0178kK.b();
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                arrayList.add(new E4.I(i7.f2126d, i7.f2127e, ((AbstractC0178k) it.next()).b(), i7.f2124b, i7.f2128f, i7.f2129g, i7.f2130h));
            }
        }
        map.put(i7, arrayList);
        return arrayList;
    }

    @Override // G4.InterfaceC0273f
    public final void g(H4.a aVar) {
        Object[] objArr = {Integer.valueOf(aVar.f3299a)};
        S s7 = this.f2902a;
        s7.b0("DELETE FROM index_configuration WHERE index_id = ?", objArr);
        int i7 = aVar.f3299a;
        s7.b0("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(i7));
        s7.b0("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(i7));
        this.f2908x.remove(aVar);
        Map map = (Map) this.f2907f.get(aVar.f3300b);
        if (map != null) {
            map.remove(Integer.valueOf(i7));
        }
    }

    public final void h(H4.a aVar) {
        HashMap map = this.f2907f;
        String str = aVar.f3300b;
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(str, map2);
        }
        int i7 = aVar.f3299a;
        H4.a aVar2 = (H4.a) map2.get(Integer.valueOf(i7));
        PriorityQueue priorityQueue = this.f2908x;
        if (aVar2 != null) {
            priorityQueue.remove(aVar2);
        }
        map2.put(Integer.valueOf(i7), aVar);
        priorityQueue.add(aVar);
        this.f2910z = Math.max(this.f2910z, i7);
        this.f2901A = Math.max(this.f2901A, aVar.f3302d.f3308a);
    }

    @Override // G4.InterfaceC0273f
    public final int m(E4.I i7) {
        List<E4.I> listF = f(i7);
        int i8 = 3;
        for (E4.I i9 : listF) {
            H4.a aVarB = b(i9);
            if (aVarB == null) {
                i8 = 1;
                break;
            }
            int size = aVarB.f3301c.size();
            HashSet hashSet = new HashSet();
            Iterator it = i9.f2125c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                for (C0177j c0177j : ((AbstractC0178k) it.next()).c()) {
                    if (!c0177j.f2201c.equals(H4.j.f3321b)) {
                        EnumC0176i enumC0176i = EnumC0176i.ARRAY_CONTAINS;
                        EnumC0176i enumC0176i2 = c0177j.f2199a;
                        if (enumC0176i2.equals(enumC0176i) || enumC0176i2.equals(EnumC0176i.ARRAY_CONTAINS_ANY)) {
                            i10 = 1;
                        } else {
                            hashSet.add(c0177j.f2201c);
                        }
                    }
                }
            }
            for (E4.A a2 : i9.f2124b) {
                if (!a2.f2085b.equals(H4.j.f3321b)) {
                    hashSet.add(a2.f2085b);
                }
            }
            if (size < hashSet.size() + i10) {
                i8 = 2;
            }
        }
        if (i7.e() && listF.size() > 1 && i8 == 3) {
            return 2;
        }
        return i8;
    }

    @Override // G4.InterfaceC0273f
    public final void s(H4.m mVar) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        p113p3.f.O("Expected a collection path.", mVar.f3312a.size() % 2 == 1, new Object[0]);
        if (this.f2906e.a(mVar)) {
            this.f2902a.b0("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", mVar.h(), p113p3.f.C((H4.m) mVar.t()));
        }
    }

    @Override // G4.InterfaceC0273f
    public final void start() {
        HashMap map = new HashMap();
        S s7 = this.f2902a;
        C1017n0 c1017n0C0 = s7.c0("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        c1017n0C0.c(this.f2904c);
        c1017n0C0.m(new I(map, 0));
        s7.c0("SELECT index_id, collection_group, index_proto FROM index_configuration").m(new J(0, this, map));
        this.f2909y = true;
    }

    @Override // G4.InterfaceC0273f
    public final void u(String str, H4.b bVar) {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        this.f2901A++;
        for (H4.a aVar : c(str)) {
            H4.a aVar2 = new H4.a(aVar.f3299a, aVar.f3300b, aVar.f3301c, new H4.c(this.f2901A, bVar));
            Integer numValueOf = Integer.valueOf(aVar.f3299a);
            Long lValueOf = Long.valueOf(this.f2901A);
            H4.n nVar = bVar.f3305a;
            this.f2902a.b0("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", numValueOf, this.f2904c, lValueOf, Long.valueOf(nVar.f3333a.f11828a), Integer.valueOf(nVar.f3333a.f11829b), p113p3.f.C(bVar.f3306b.f3318a), Integer.valueOf(bVar.f3307c));
            h(aVar2);
        }
    }

    @Override // G4.InterfaceC0273f
    public final Collection x() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2907f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    @Override // G4.InterfaceC0273f
    public final String z() {
        p113p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        H4.a aVar = (H4.a) this.f2908x.peek();
        if (aVar != null) {
            return aVar.f3300b;
        }
        return null;
    }
}
