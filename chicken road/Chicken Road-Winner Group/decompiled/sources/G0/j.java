package G0;

import Y1.C;
import Y1.C0077a;
import Y1.C0079c;
import Y1.C0081e;
import Y1.C0082f;
import Y1.E;
import Y1.F;
import Y1.G;
import Y1.I;
import Y1.o;
import Y1.p;
import Y1.s;
import Y1.u;
import Y1.v;
import a.AbstractC0086a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import m0.C1120h;
import m0.C1123k;
import m0.C1124l;
import m0.C1125m;
import m0.C1126n;
import m0.InterfaceC1127o;
import m0.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements I0.b, H0.g, T1.c, InterfaceC1127o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f415c;

    public /* synthetic */ j(Object obj, int i3, Object obj2) {
        this.f413a = i3;
        this.f414b = obj;
        this.f415c = obj2;
    }

    public void a(V1.b bVar) {
        List list;
        ((C0077a) this.f414b).getClass();
        JSONObject jSONObject = (JSONObject) bVar.f1614b;
        String optString = jSONObject.optString("externalTransactionToken");
        String optString2 = jSONObject.optString("originalExternalTransactionId");
        if (optString2.isEmpty()) {
            optString2 = null;
        }
        ArrayList<t> arrayList = (ArrayList) bVar.f1615c;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (t tVar : arrayList) {
                String str = tVar.f10077a;
                v G3 = F2.b.G(tVar.f10078b);
                G g3 = new G();
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                g3.f1656a = str;
                g3.f1657b = tVar.f10079c;
                g3.f1658c = G3;
                arrayList2.add(g3);
            }
            list = arrayList2;
        }
        F f = new F();
        f.f1653a = optString2;
        if (optString == null) {
            throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
        }
        f.f1654b = optString;
        if (list == null) {
            throw new IllegalStateException("Nonnull field \"products\" is null.");
        }
        f.f1655c = list;
        C0077a c0077a = new C0077a(0);
        b0.i iVar = (b0.i) this.f415c;
        iVar.getClass();
        new D0.a((T1.f) iVar.f2461b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling", (T1.k) C0082f.f1677a, (P0.j) null).f(new ArrayList(Collections.singletonList(f)), new j(c0077a, 6, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.userSelectedalternativeBilling"));
    }

    @Override // H0.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        H0.i iVar = (H0.i) this.f414b;
        H0.a aVar = iVar.f501d;
        int i3 = aVar.f486b;
        A0.k kVar = (A0.k) this.f415c;
        ArrayList d3 = iVar.d(sQLiteDatabase, kVar, i3);
        for (x0.c cVar : x0.c.values()) {
            if (cVar != kVar.f71c) {
                int size = aVar.f486b - d3.size();
                if (size <= 0) {
                    break;
                }
                A0.j a3 = A0.k.a();
                a3.O(kVar.f69a);
                if (cVar == null) {
                    throw new NullPointerException("Null priority");
                }
                a3.f68d = cVar;
                a3.f67c = kVar.f70b;
                d3.addAll(iVar.d(sQLiteDatabase, a3.t(), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i4 = 0; i4 < d3.size(); i4++) {
            sb.append(((H0.b) d3.get(i4)).f490a);
            if (i4 < d3.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j3 = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j3));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j3), set);
                }
                set.add(new H0.h(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = d3.listIterator();
            while (listIterator.hasNext()) {
                H0.b bVar = (H0.b) listIterator.next();
                if (hashMap.containsKey(Long.valueOf(bVar.f490a))) {
                    A0.h c3 = bVar.f492c.c();
                    long j4 = bVar.f490a;
                    for (H0.h hVar : (Set) hashMap.get(Long.valueOf(j4))) {
                        c3.a(hVar.f496a, hVar.f497b);
                    }
                    listIterator.set(new H0.b(j4, bVar.f491b, c3.c()));
                }
            }
            return d3;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // I0.b
    public Object execute() {
        switch (this.f413a) {
            case 0:
                H0.i iVar = (H0.i) ((l) this.f414b).f421c;
                iVar.getClass();
                Iterable iterable = (Iterable) this.f415c;
                if (iterable.iterator().hasNext()) {
                    iVar.a().compileStatement("DELETE FROM events WHERE _id in " + H0.i.g(iterable)).execute();
                    break;
                }
                break;
            default:
                l lVar = (l) this.f414b;
                lVar.getClass();
                Iterator it = ((HashMap) this.f415c).entrySet().iterator();
                while (it.hasNext()) {
                    ((H0.i) lVar.f426i).e(((Integer) r2.getValue()).intValue(), D0.d.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // T1.c
    public void l(Object obj) {
        switch (this.f413a) {
            case 4:
                boolean z3 = obj instanceof List;
                C0077a c0077a = (C0077a) this.f414b;
                if (!z3) {
                    c0077a.g(AbstractC0086a.m((String) this.f415c));
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        c0077a.g(new C0079c((String) list.get(0), (String) list.get(1), list.get(2)));
                        break;
                    }
                }
                break;
            case 5:
                boolean z4 = obj instanceof List;
                C0077a c0077a2 = (C0077a) this.f414b;
                if (!z4) {
                    c0077a2.g(AbstractC0086a.m((String) this.f415c));
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        c0077a2.g(new C0079c((String) list2.get(0), (String) list2.get(1), list2.get(2)));
                        break;
                    }
                }
                break;
            default:
                boolean z5 = obj instanceof List;
                C0077a c0077a3 = (C0077a) this.f414b;
                if (!z5) {
                    c0077a3.g(AbstractC0086a.m((String) this.f415c));
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        c0077a3.g(new C0079c((String) list3.get(0), (String) list3.get(1), list3.get(2)));
                        break;
                    }
                }
                break;
        }
    }

    @Override // m0.InterfaceC1127o
    public void onProductDetailsResponse(C1120h c1120h, List list) {
        p pVar;
        ArrayList arrayList;
        o oVar;
        I i3 = (I) this.f414b;
        i3.getClass();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C1126n c1126n = (C1126n) it.next();
            i3.f.put(c1126n.f10067c, c1126n);
        }
        Y1.n s3 = F2.b.s(c1120h);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C1126n c1126n2 = (C1126n) it2.next();
            String str = c1126n2.f10069e;
            v G3 = F2.b.G(c1126n2.f10068d);
            C1123k a3 = c1126n2.a();
            if (a3 == null) {
                pVar = null;
            } else {
                Long valueOf = Long.valueOf(a3.f10051b);
                pVar = new p();
                pVar.f1711a = valueOf;
                String str2 = a3.f10050a;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                }
                pVar.f1712b = str2;
                String str3 = a3.f10052c;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                }
                pVar.f1713c = str3;
            }
            ArrayList arrayList3 = c1126n2.f10073j;
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C1125m c1125m = (C1125m) it3.next();
                    String str4 = c1125m.f10061b;
                    ArrayList arrayList5 = c1125m.f10064e;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = it2;
                    Iterator it5 = c1125m.f10063d.f1500a.iterator();
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        C1124l c1124l = (C1124l) it5.next();
                        Iterator it7 = it3;
                        String str5 = c1124l.f10055a;
                        Y1.n nVar = s3;
                        Long valueOf2 = Long.valueOf(c1124l.f10056b);
                        ArrayList arrayList7 = arrayList2;
                        Long valueOf3 = Long.valueOf(c1124l.f10059e);
                        p pVar2 = pVar;
                        int i4 = c1124l.f;
                        C c3 = i4 != 1 ? i4 != 2 ? C.NON_RECURRING : C.FINITE_RECURRING : C.INFINITE_RECURRING;
                        s sVar = new s();
                        sVar.f1717a = valueOf3;
                        sVar.f1718b = c3;
                        sVar.f1719c = valueOf2;
                        String str6 = c1124l.f10058d;
                        if (str6 == null) {
                            throw new IllegalStateException("Nonnull field \"billingPeriod\" is null.");
                        }
                        sVar.f1720d = str6;
                        if (str5 == null) {
                            throw new IllegalStateException("Nonnull field \"formattedPrice\" is null.");
                        }
                        sVar.f1721e = str5;
                        String str7 = c1124l.f10057c;
                        if (str7 == null) {
                            throw new IllegalStateException("Nonnull field \"priceCurrencyCode\" is null.");
                        }
                        sVar.f = str7;
                        arrayList6.add(sVar);
                        it3 = it7;
                        it5 = it6;
                        s3 = nVar;
                        arrayList2 = arrayList7;
                        pVar = pVar2;
                    }
                    Y1.n nVar2 = s3;
                    ArrayList arrayList8 = arrayList2;
                    Iterator it8 = it3;
                    p pVar3 = pVar;
                    if (c1125m.f == null) {
                        oVar = null;
                    } else {
                        Long valueOf4 = Long.valueOf(r0.f245b);
                        Long valueOf5 = Long.valueOf(r0.f246c);
                        oVar = new o();
                        oVar.f1709a = valueOf4;
                        oVar.f1710b = valueOf5;
                    }
                    E e3 = new E();
                    String str8 = c1125m.f10060a;
                    if (str8 == null) {
                        throw new IllegalStateException("Nonnull field \"basePlanId\" is null.");
                    }
                    e3.f1648a = str8;
                    e3.f1649b = str4;
                    String str9 = c1125m.f10062c;
                    if (str9 == null) {
                        throw new IllegalStateException("Nonnull field \"offerToken\" is null.");
                    }
                    e3.f1650c = str9;
                    if (arrayList5 == null) {
                        throw new IllegalStateException("Nonnull field \"offerTags\" is null.");
                    }
                    e3.f1651d = arrayList5;
                    e3.f1652e = arrayList6;
                    e3.f = oVar;
                    arrayList4.add(e3);
                    it2 = it4;
                    it3 = it8;
                    s3 = nVar2;
                    arrayList2 = arrayList8;
                    pVar = pVar3;
                }
                arrayList = arrayList4;
            }
            Y1.n nVar3 = s3;
            ArrayList arrayList9 = arrayList2;
            Iterator it9 = it2;
            p pVar4 = pVar;
            Y1.t tVar = new Y1.t();
            String str10 = c1126n2.f10070g;
            if (str10 == null) {
                throw new IllegalStateException("Nonnull field \"description\" is null.");
            }
            tVar.f1722a = str10;
            String str11 = c1126n2.f;
            if (str11 == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            tVar.f1723b = str11;
            String str12 = c1126n2.f10067c;
            if (str12 == null) {
                throw new IllegalStateException("Nonnull field \"productId\" is null.");
            }
            tVar.f1724c = str12;
            tVar.f1725d = G3;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"title\" is null.");
            }
            tVar.f1726e = str;
            tVar.f = pVar4;
            tVar.f1727g = arrayList;
            arrayList9.add(tVar);
            it2 = it9;
            arrayList2 = arrayList9;
            s3 = nVar3;
        }
        u uVar = new u();
        uVar.f1728a = s3;
        uVar.f1729b = arrayList2;
        ((C0081e) this.f415c).a(uVar);
    }
}
