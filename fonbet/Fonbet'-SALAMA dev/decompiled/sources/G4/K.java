package G4;

import E4.AbstractC0178k;
import E4.C0170c;
import E4.C0171d;
import E4.C0177j;
import E4.EnumC0176i;
import W5.AbstractC0486a1;
import Y4.I0;
import a.AbstractC0603a;
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
import k4.AbstractC1341c;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class K implements InterfaceC0273f {

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f2900B = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final S f2902a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.c f2903b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2904c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2905d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final C0286t f2906e = new C0286t(0);

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2907f = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final PriorityQueue f2908x = new PriorityQueue(10, new C0269b(3));

    /* renamed from: y, reason: collision with root package name */
    public boolean f2909y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2910z = -1;

    /* renamed from: A, reason: collision with root package name */
    public long f2901A = -1;

    public K(S s7, R4.c cVar, C4.e eVar) {
        this.f2902a = s7;
        this.f2903b = cVar;
        String str = eVar.f1580a;
        this.f2904c = str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (H4.o.f(r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        r7 = new java.util.ArrayList(r0);
        r0 = new java.util.ArrayList();
        r8 = r5.G().a().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r8.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        r10 = (Y4.I0) r8.next();
        r11 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r11.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        r13 = (F4.c) r11.next();
        r14 = new F4.c();
        r13 = r13.f2746a;
        r13 = java.util.Arrays.copyOf(r13.f2751a, r13.f2752b);
        r15 = r14.f2746a;
        r15.a(r13.length);
        r4 = r13.length;
        r22 = r1;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r1 >= r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        r16 = r13[r1];
        r17 = r2;
        r2 = r15.f2751a;
        r18 = r3;
        r3 = r15.f2752b;
        r15.f2752b = r3 + 1;
        r2[r3] = r16;
        r1 = r1 + 1;
        r2 = r17;
        r3 = r18;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
    
        r1 = r14.a(r12);
        P6.b.S(r10, r1);
        r1.f0();
        r0.add(r14);
        r1 = r22;
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        r22 = r1;
        r17 = r2;
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object[] a(H4.a aVar, E4.I i7, Collection collection) {
        int i8;
        if (collection == null) {
            return null;
        }
        ArrayList<F4.c> arrayList = new ArrayList();
        arrayList.add(new F4.c());
        Iterator it = collection.iterator();
        Iterator it2 = aVar.b().iterator();
        while (it2.hasNext()) {
            H4.d dVar = (H4.d) it2.next();
            I0 i02 = (I0) it.next();
            for (F4.c cVar : arrayList) {
                H4.j jVar = dVar.f3310a;
                Iterator it3 = i7.f2125c.iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    i8 = dVar.f3311b;
                    if (!hasNext) {
                        break;
                    }
                    AbstractC0178k abstractC0178k = (AbstractC0178k) it3.next();
                    if (abstractC0178k instanceof C0177j) {
                        C0177j c0177j = (C0177j) abstractC0178k;
                        if (c0177j.f2201c.equals(jVar)) {
                            EnumC0176i enumC0176i = EnumC0176i.IN;
                            EnumC0176i enumC0176i2 = c0177j.f2199a;
                            if (enumC0176i2.equals(enumC0176i) || enumC0176i2.equals(EnumC0176i.NOT_IN)) {
                                break;
                            }
                        }
                    }
                    it = it;
                    it2 = it2;
                    dVar = dVar;
                }
                Iterator it4 = it;
                Iterator it5 = it2;
                H4.d dVar2 = dVar;
                p3.f a2 = cVar.a(i8);
                P6.b.S(i02, a2);
                a2.f0();
                it = it4;
                it2 = it5;
                dVar = dVar2;
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            F4.e eVar = ((F4.c) arrayList.get(i9)).f2746a;
            objArr[i9] = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
        }
        return objArr;
    }

    public static H4.b d(Collection collection) {
        p3.f.O("Found empty index group when looking for least recent index offset.", !collection.isEmpty(), new Object[0]);
        Iterator it = collection.iterator();
        H4.b bVar = ((H4.a) it.next()).f3302d.f3309b;
        int i7 = bVar.f3307c;
        while (it.hasNext()) {
            H4.b bVar2 = ((H4.a) it.next()).f3302d.f3309b;
            if (bVar2.compareTo(bVar) < 0) {
                bVar = bVar2;
            }
            i7 = Math.max(bVar2.f3307c, i7);
        }
        return new H4.b(bVar.f3305a, bVar.f3306b, i7);
    }

    @Override // G4.InterfaceC0273f
    public final List B(String str) {
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        ArrayList arrayList = new ArrayList();
        C1726n0 c0 = this.f2902a.c0("SELECT parent FROM collection_parents WHERE collection_id = ?");
        c0.c(str);
        Cursor J5 = c0.J();
        while (J5.moveToNext()) {
            try {
                arrayList.add(p3.f.A(J5.getString(0)));
            } catch (Throwable th) {
                if (J5 != null) {
                    try {
                        J5.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        J5.close();
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Collection] */
    @Override // G4.InterfaceC0273f
    public final List F(E4.I i7) {
        List list;
        Iterator it;
        Collection collection;
        List list2;
        H4.a aVar;
        int i8;
        byte[] bArr;
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = f(i7).iterator();
        while (true) {
            List list3 = null;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    E4.I i9 = (E4.I) pair.first;
                    H4.a aVar2 = (H4.a) pair.second;
                    i9.getClass();
                    H4.d a2 = aVar2.a();
                    if (a2 != null) {
                        Iterator it4 = i9.d(a2.f3310a).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                list = null;
                                break;
                            }
                            C0177j c0177j = (C0177j) it4.next();
                            int ordinal = c0177j.f2199a.ordinal();
                            I0 i02 = c0177j.f2200b;
                            if (ordinal == 6) {
                                list = Collections.singletonList(i02);
                                break;
                            }
                            if (ordinal == 7) {
                                list = i02.G().a();
                                break;
                            }
                        }
                    } else {
                        list = list3;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it5 = aVar2.b().iterator();
                    while (it5.hasNext()) {
                        H4.d dVar = (H4.d) it5.next();
                        Iterator it6 = i9.d(dVar.f3310a).iterator();
                        while (it6.hasNext()) {
                            C0177j c0177j2 = (C0177j) it6.next();
                            Iterator it7 = it6;
                            int ordinal2 = c0177j2.f2199a.ordinal();
                            it = it3;
                            H4.j jVar = dVar.f3310a;
                            I0 i03 = c0177j2.f2200b;
                            Iterator it8 = it5;
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 != 8) {
                                        if (ordinal2 != 9) {
                                            it6 = it7;
                                            it3 = it;
                                            it5 = it8;
                                        }
                                    }
                                }
                                linkedHashMap.put(jVar, i03);
                                collection = linkedHashMap.values();
                                break;
                            }
                            linkedHashMap.put(jVar, i03);
                            it6 = it7;
                            it3 = it;
                            it5 = it8;
                        }
                    }
                    it = it3;
                    collection = null;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it9 = aVar2.b().iterator();
                    boolean z4 = true;
                    while (it9.hasNext()) {
                        H4.d dVar2 = (H4.d) it9.next();
                        Iterator it10 = it9;
                        boolean b7 = t.e.b(dVar2.f3311b, 1);
                        C0170c c0170c = i9.f2129g;
                        Pair a4 = b7 ? i9.a(dVar2, c0170c) : i9.c(dVar2, c0170c);
                        arrayList4.add((I0) a4.first);
                        z4 &= ((Boolean) a4.second).booleanValue();
                        it9 = it10;
                    }
                    C0170c c0170c2 = new C0170c(arrayList4, z4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it11 = aVar2.b().iterator();
                    boolean z7 = true;
                    while (it11.hasNext()) {
                        H4.d dVar3 = (H4.d) it11.next();
                        Iterator it12 = it11;
                        boolean b8 = t.e.b(dVar3.f3311b, 1);
                        C0170c c0170c3 = i9.f2130h;
                        Pair c3 = b8 ? i9.c(dVar3, c0170c3) : i9.a(dVar3, c0170c3);
                        arrayList5.add((I0) c3.first);
                        z7 &= ((Boolean) c3.second).booleanValue();
                        it11 = it12;
                    }
                    C0170c c0170c4 = new C0170c(arrayList5, z7);
                    if (Q0.a.E()) {
                        Q0.a.v(1, "K", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", aVar2, i9, list, c0170c2, c0170c4);
                    }
                    Object[] a7 = a(aVar2, i9, c0170c2.f2170b);
                    String str = c0170c2.f2169a ? ">=" : ">";
                    Object[] a8 = a(aVar2, i9, arrayList5);
                    String str2 = z7 ? "<=" : "<";
                    Object[] a9 = a(aVar2, i9, collection);
                    int max = Math.max(a7.length, a8.length) * (list != null ? list.size() : 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT document_key, directional_value FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value ");
                    sb.append(str);
                    sb.append(" ? AND directional_value ");
                    sb.append(str2);
                    sb.append(" ? ");
                    StringBuilder h6 = L4.r.h(" UNION ", sb, max);
                    if (a9 != null) {
                        StringBuilder sb2 = new StringBuilder("SELECT document_key, directional_value FROM (");
                        sb2.append((CharSequence) h6);
                        sb2.append(") WHERE directional_value NOT IN (");
                        sb2.append((CharSequence) L4.r.h(", ", "?", a9.length));
                        sb2.append(")");
                        h6 = sb2;
                    }
                    int size = max / (list != null ? list.size() : 1);
                    Object[] objArr = new Object[(max * 5) + (a9 != null ? a9.length : 0)];
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < max) {
                        objArr[i11] = Integer.valueOf(aVar2.f3299a);
                        int i12 = i11 + 2;
                        objArr[i11 + 1] = this.f2904c;
                        int i13 = i11 + 3;
                        if (list != null) {
                            I0 i04 = (I0) list.get(i10 / size);
                            list2 = list;
                            F4.c cVar = new F4.c();
                            aVar = aVar2;
                            i8 = max;
                            p3.f a10 = cVar.a(1);
                            P6.b.S(i04, a10);
                            a10.f0();
                            F4.e eVar = cVar.f2746a;
                            bArr = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
                        } else {
                            list2 = list;
                            aVar = aVar2;
                            i8 = max;
                            bArr = f2900B;
                        }
                        objArr[i12] = bArr;
                        int i14 = i11 + 4;
                        int i15 = i10 % size;
                        objArr[i13] = a7[i15];
                        i11 += 5;
                        objArr[i14] = a8[i15];
                        i10++;
                        list = list2;
                        aVar2 = aVar;
                        max = i8;
                    }
                    if (a9 != null) {
                        int length = a9.length;
                        int i16 = 0;
                        while (i16 < length) {
                            objArr[i11] = a9[i16];
                            i16++;
                            i11++;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(h6.toString());
                    arrayList6.addAll(Arrays.asList(objArr));
                    Object[] array = arrayList6.toArray();
                    arrayList.add(String.valueOf(array[0]));
                    arrayList2.addAll(Arrays.asList(array).subList(1, array.length));
                    it3 = it;
                    list3 = null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(TextUtils.join(" UNION ", arrayList));
                sb3.append("ORDER BY directional_value, document_key ");
                List list4 = i7.f2124b;
                sb3.append(t.e.b(((E4.A) list4.get(list4.size() - 1)).f2084a, 1) ? "asc " : "desc ");
                String h7 = AbstractC0486a1.h("SELECT DISTINCT document_key FROM (", sb3.toString(), ")");
                if (i7.e()) {
                    StringBuilder d7 = t.e.d(h7, " LIMIT ");
                    d7.append(i7.f2128f);
                    h7 = d7.toString();
                }
                p3.f.O("Cannot perform query with more than 999 bind elements", arrayList2.size() < 1000, new Object[0]);
                C1726n0 c0 = this.f2902a.c0(h7);
                c0.c(arrayList2.toArray());
                ArrayList arrayList7 = new ArrayList();
                Cursor J5 = c0.J();
                while (J5.moveToNext()) {
                    try {
                        arrayList7.add(new H4.h(H4.m.y(J5.getString(0))));
                    } finally {
                    }
                }
                J5.close();
                Q0.a.v(1, "K", "Index scan returned %s documents", Integer.valueOf(arrayList7.size()));
                return arrayList7;
            }
            E4.I i17 = (E4.I) it2.next();
            H4.a b9 = b(i17);
            if (b9 == null) {
                return null;
            }
            arrayList3.add(Pair.create(i17, b9));
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
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        int i7 = this.f2910z + 1;
        String str = aVar.f3300b;
        ArrayList arrayList = aVar.f3301c;
        H4.a aVar2 = new H4.a(i7, str, arrayList, aVar.f3302d);
        Integer valueOf = Integer.valueOf(i7);
        this.f2903b.getClass();
        W4.a y4 = W4.g.y();
        y4.d();
        W4.g.v((W4.g) y4.f12096b);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            H4.d dVar = (H4.d) it.next();
            W4.c B7 = W4.e.B();
            String c3 = dVar.f3310a.c();
            B7.d();
            W4.e.v((W4.e) B7.f12096b, c3);
            int i8 = dVar.f3311b;
            if (i8 == 3) {
                B7.d();
                W4.e.x((W4.e) B7.f12096b);
            } else if (i8 == 1) {
                W4.d dVar2 = W4.d.ASCENDING;
                B7.d();
                W4.e.w((W4.e) B7.f12096b, dVar2);
            } else {
                W4.d dVar3 = W4.d.DESCENDING;
                B7.d();
                W4.e.w((W4.e) B7.f12096b, dVar3);
            }
            y4.d();
            W4.g.w((W4.g) y4.f12096b, (W4.e) B7.b());
        }
        this.f2902a.b0("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", valueOf, str, ((W4.g) y4.b()).d());
        h(aVar2);
    }

    @Override // G4.InterfaceC0273f
    public final H4.b L(E4.I i7) {
        ArrayList arrayList = new ArrayList();
        Iterator it = f(i7).iterator();
        while (it.hasNext()) {
            H4.a b7 = b((E4.I) it.next());
            if (b7 != null) {
                arrayList.add(b7);
            }
        }
        return d(arrayList);
    }

    @Override // G4.InterfaceC0273f
    public final H4.b O(String str) {
        Collection c3 = c(str);
        p3.f.O("minOffset was called for collection without indexes", !c3.isEmpty(), new Object[0]);
        return d(c3);
    }

    @Override // G4.InterfaceC0273f
    public final void X(E4.I i7) {
        H4.a aVar;
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        for (E4.I i8 : f(i7)) {
            int m7 = m(i8);
            if (m7 == 1 || m7 == 2) {
                String str = i8.f2127e;
                if (str == null) {
                    str = i8.f2126d.h();
                }
                TreeSet treeSet = new TreeSet(new C0269b(8));
                ArrayList arrayList = new ArrayList();
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
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0177j c0177j2 = (C0177j) it2.next();
                        if (!c0177j2.f2201c.equals(H4.j.f3321b)) {
                            EnumC0176i enumC0176i = EnumC0176i.ARRAY_CONTAINS;
                            EnumC0176i enumC0176i2 = c0177j2.f2199a;
                            boolean equals = enumC0176i2.equals(enumC0176i);
                            H4.j jVar = c0177j2.f2201c;
                            if (equals || enumC0176i2.equals(EnumC0176i.ARRAY_CONTAINS_ANY)) {
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
                    aVar = new H4.a(-1, str, arrayList2, H4.a.f3297e);
                }
                if (aVar != null) {
                    H(aVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r9.add(((H4.d) r8.get(r10)).f3310a.c());
        r10 = r10 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final H4.a b(E4.I i7) {
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        String str = i7.f2127e;
        H4.m mVar = i7.f2126d;
        if (str == null) {
            str = mVar.h();
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
        String str2 = i7.f2127e;
        if (str2 == null) {
            str2 = mVar.h();
        }
        Collection<H4.a> c3 = c(str2);
        H4.a aVar = null;
        if (c3.isEmpty()) {
            return null;
        }
        for (H4.a aVar2 : c3) {
            p3.f.O("Collection IDs do not match", aVar2.f3300b.equals(str), new Object[0]);
            if (treeSet.size() <= 1) {
                H4.d a2 = aVar2.a();
                if (a2 != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC0603a.a0((C0177j) it2.next(), a2)) {
                        }
                    }
                }
                Iterator it3 = i7.f2124b.iterator();
                ArrayList b7 = aVar2.b();
                HashSet hashSet = new HashSet();
                int i8 = 0;
                while (i8 < b7.size()) {
                    H4.d dVar = (H4.d) b7.get(i8);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (AbstractC0603a.a0((C0177j) it4.next(), dVar)) {
                            break;
                        }
                    }
                }
                if (i8 != b7.size()) {
                    if (treeSet.size() > 0) {
                        C0177j c0177j2 = (C0177j) treeSet.first();
                        if (!hashSet.contains(c0177j2.f2201c.c())) {
                            H4.d dVar2 = (H4.d) b7.get(i8);
                            if (AbstractC0603a.a0(c0177j2, dVar2) && AbstractC0603a.b0((E4.A) it3.next(), dVar2)) {
                            }
                        }
                        i8++;
                    }
                    while (i8 < b7.size()) {
                        H4.d dVar3 = (H4.d) b7.get(i8);
                        if (it3.hasNext() && AbstractC0603a.b0((E4.A) it3.next(), dVar3)) {
                            i8++;
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
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        Map map = (Map) this.f2907f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // G4.InterfaceC0273f
    public final void e(AbstractC1341c abstractC1341c) {
        int i7;
        byte[] copyOf;
        final int i8 = 1;
        final int i9 = 0;
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        Iterator it = abstractC1341c.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            for (H4.a aVar : c(((H4.h) entry.getKey()).f3318a.l(r3.f3312a.size() - 2))) {
                H4.h hVar = (H4.h) entry.getKey();
                TreeSet treeSet = new TreeSet();
                C1726n0 c0 = this.f2902a.c0("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                c0.c(Integer.valueOf(aVar.f3299a), hVar.f3318a.c(), this.f2904c);
                Cursor J5 = c0.J();
                while (true) {
                    try {
                        boolean moveToNext = J5.moveToNext();
                        i7 = aVar.f3299a;
                        if (!moveToNext) {
                            break;
                        } else {
                            treeSet.add(new F4.a(i7, hVar, J5.getBlob(0), J5.getBlob(1)));
                        }
                    } catch (Throwable th) {
                        if (J5 != null) {
                            try {
                                J5.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                J5.close();
                H4.k kVar = (H4.k) entry.getValue();
                TreeSet treeSet2 = new TreeSet();
                F4.c cVar = new F4.c();
                Iterator it2 = aVar.b().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        F4.e eVar = cVar.f2746a;
                        copyOf = Arrays.copyOf(eVar.f2751a, eVar.f2752b);
                        break;
                    }
                    H4.d dVar = (H4.d) it2.next();
                    I0 f7 = kVar.f3327e.f(dVar.f3310a);
                    if (f7 == null) {
                        copyOf = null;
                        break;
                    } else {
                        p3.f a2 = cVar.a(dVar.f3311b);
                        P6.b.S(f7, a2);
                        a2.f0();
                    }
                }
                if (copyOf != null) {
                    H4.d a4 = aVar.a();
                    if (a4 != null) {
                        I0 f8 = kVar.f3327e.f(a4.f3310a);
                        if (H4.o.f(f8)) {
                            for (I0 i02 : f8.G().a()) {
                                F4.c cVar2 = new F4.c();
                                p3.f a7 = cVar2.a(1);
                                P6.b.S(i02, a7);
                                a7.f0();
                                F4.e eVar2 = cVar2.f2746a;
                                treeSet2.add(new F4.a(i7, kVar.f3323a, Arrays.copyOf(eVar2.f2751a, eVar2.f2752b), copyOf));
                            }
                        }
                    } else {
                        treeSet2.add(new F4.a(i7, kVar.f3323a, new byte[0], copyOf));
                    }
                }
                if (!treeSet.equals(treeSet2)) {
                    final H4.k kVar2 = (H4.k) entry.getValue();
                    Q0.a.v(1, "K", "Updating index entries for document '%s'", kVar2.f3323a);
                    L4.h hVar2 = new L4.h(this) { // from class: G4.H

                        /* renamed from: b, reason: collision with root package name */
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
                                    Integer valueOf = Integer.valueOf(aVar2.f2740a);
                                    String c3 = kVar2.f3323a.f3318a.c();
                                    k7.f2902a.b0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", valueOf, k7.f2904c, aVar2.f2742c, aVar2.f2743d, c3);
                                    break;
                                default:
                                    K k8 = this.f2893b;
                                    k8.getClass();
                                    Integer valueOf2 = Integer.valueOf(aVar2.f2740a);
                                    String c4 = kVar2.f3323a.f3318a.c();
                                    k8.f2902a.b0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", valueOf2, k8.f2904c, aVar2.f2742c, aVar2.f2743d, c4);
                                    break;
                            }
                        }
                    };
                    L4.h hVar3 = new L4.h(this) { // from class: G4.H

                        /* renamed from: b, reason: collision with root package name */
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
                                    Integer valueOf = Integer.valueOf(aVar2.f2740a);
                                    String c3 = kVar2.f3323a.f3318a.c();
                                    k7.f2902a.b0("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", valueOf, k7.f2904c, aVar2.f2742c, aVar2.f2743d, c3);
                                    break;
                                default:
                                    K k8 = this.f2893b;
                                    k8.getClass();
                                    Integer valueOf2 = Integer.valueOf(aVar2.f2740a);
                                    String c4 = kVar2.f3323a.f3318a.c();
                                    k8.f2902a.b0("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", valueOf2, k8.f2904c, aVar2.f2742c, aVar2.f2743d, c4);
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
        List singletonList;
        HashMap hashMap = this.f2905d;
        if (hashMap.containsKey(i7)) {
            return (List) hashMap.get(i7);
        }
        ArrayList arrayList = new ArrayList();
        if (i7.f2125c.isEmpty()) {
            arrayList.add(i7);
        } else {
            C0171d c0171d = new C0171d(1, i7.f2125c);
            if (Collections.unmodifiableList(c0171d.f2171a).isEmpty()) {
                singletonList = Collections.emptyList();
            } else {
                AbstractC0178k k7 = Y4.D.k(Y4.D.l(c0171d));
                p3.f.O("computeDistributedNormalForm did not result in disjunctive normal form", Y4.D.x(k7), new Object[0]);
                singletonList = ((k7 instanceof C0177j) || Y4.D.z(k7)) ? Collections.singletonList(k7) : k7.b();
            }
            Iterator it = singletonList.iterator();
            while (it.hasNext()) {
                arrayList.add(new E4.I(i7.f2126d, i7.f2127e, ((AbstractC0178k) it.next()).b(), i7.f2124b, i7.f2128f, i7.f2129g, i7.f2130h));
            }
        }
        hashMap.put(i7, arrayList);
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
        HashMap hashMap = this.f2907f;
        String str = aVar.f3300b;
        Map map = (Map) hashMap.get(str);
        if (map == null) {
            map = new HashMap();
            hashMap.put(str, map);
        }
        int i7 = aVar.f3299a;
        H4.a aVar2 = (H4.a) map.get(Integer.valueOf(i7));
        PriorityQueue priorityQueue = this.f2908x;
        if (aVar2 != null) {
            priorityQueue.remove(aVar2);
        }
        map.put(Integer.valueOf(i7), aVar);
        priorityQueue.add(aVar);
        this.f2910z = Math.max(this.f2910z, i7);
        this.f2901A = Math.max(this.f2901A, aVar.f3302d.f3308a);
    }

    @Override // G4.InterfaceC0273f
    public final int m(E4.I i7) {
        List f7 = f(i7);
        Iterator it = f7.iterator();
        int i8 = 3;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            E4.I i9 = (E4.I) it.next();
            H4.a b7 = b(i9);
            if (b7 == null) {
                i8 = 1;
                break;
            }
            int size = b7.f3301c.size();
            HashSet hashSet = new HashSet();
            Iterator it2 = i9.f2125c.iterator();
            int i10 = 0;
            while (it2.hasNext()) {
                for (C0177j c0177j : ((AbstractC0178k) it2.next()).c()) {
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
        if (i7.e() && f7.size() > 1 && i8 == 3) {
            return 2;
        }
        return i8;
    }

    @Override // G4.InterfaceC0273f
    public final void s(H4.m mVar) {
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        p3.f.O("Expected a collection path.", mVar.f3312a.size() % 2 == 1, new Object[0]);
        if (this.f2906e.a(mVar)) {
            this.f2902a.b0("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", mVar.h(), p3.f.C((H4.m) mVar.t()));
        }
    }

    @Override // G4.InterfaceC0273f
    public final void start() {
        HashMap hashMap = new HashMap();
        S s7 = this.f2902a;
        C1726n0 c0 = s7.c0("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        c0.c(this.f2904c);
        c0.m(new I(hashMap, 0));
        s7.c0("SELECT index_id, collection_group, index_proto FROM index_configuration").m(new J(0, this, hashMap));
        this.f2909y = true;
    }

    @Override // G4.InterfaceC0273f
    public final void u(String str, H4.b bVar) {
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        this.f2901A++;
        for (H4.a aVar : c(str)) {
            H4.a aVar2 = new H4.a(aVar.f3299a, aVar.f3300b, aVar.f3301c, new H4.c(this.f2901A, bVar));
            Integer valueOf = Integer.valueOf(aVar.f3299a);
            Long valueOf2 = Long.valueOf(this.f2901A);
            H4.n nVar = bVar.f3305a;
            this.f2902a.b0("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", valueOf, this.f2904c, valueOf2, Long.valueOf(nVar.f3333a.f11828a), Integer.valueOf(nVar.f3333a.f11829b), p3.f.C(bVar.f3306b.f3318a), Integer.valueOf(bVar.f3307c));
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
        p3.f.O("IndexManager not started", this.f2909y, new Object[0]);
        H4.a aVar = (H4.a) this.f2908x.peek();
        if (aVar != null) {
            return aVar.f3300b;
        }
        return null;
    }
}
