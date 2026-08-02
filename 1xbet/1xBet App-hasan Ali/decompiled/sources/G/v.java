package G;

import A0.C0040k0;
import A0.J0;
import O4.C0269o;
import O4.ExecutorC0255a;
import O4.InterfaceC0259e;
import O4.InterfaceC0262h;
import O4.RunnableC0268n;
import O4.S;
import P.AbstractC0287d0;
import T2.H;
import T2.L;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Insets;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0487p;
import androidx.work.impl.WorkDatabase_Impl;
import e2.C1930k;
import g1.C1968b;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k1.RunnableC2029a;
import n.AbstractC2144n;
import r.C2316B;
import r.C2321G;
import r.V;
import t3.AbstractC2425d;
import x0.k0;
import x1.C2640a;

/* loaded from: classes.dex */
public final class v implements k0, InterfaceC0262h, U2.d, D3.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1748k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1749l;

    /* renamed from: m, reason: collision with root package name */
    public Object f1750m;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f1748k = i;
        this.f1749l = obj;
        this.f1750m = obj2;
    }

    public static void f(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e3) {
            Log.w("SupportSQLite", "delete failed: ", e3);
        }
    }

    @Override // O4.InterfaceC0262h
    public void a(InterfaceC0259e interfaceC0259e, S s2) {
        ((C0269o) this.f1750m).f4219k.execute(new RunnableC0268n(this, (InterfaceC0262h) this.f1749l, s2, 0));
    }

    @Override // D3.c
    public void b(D3.o oVar) {
        ((Map) ((v3.g) this.f1750m).f20440m).remove((D3.f) this.f1749l);
    }

    @Override // x0.k0
    public void c(V v4) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1750m;
        linkedHashMap.clear();
        Iterator it = v4.iterator();
        while (true) {
            V.c cVar = (V.c) it;
            if (!cVar.hasNext()) {
                return;
            }
            Object b3 = ((B.q) this.f1749l).b(cVar.next());
            Integer num = (Integer) linkedHashMap.get(b3);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                cVar.remove();
            } else {
                linkedHashMap.put(b3, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // U2.d
    public U2.l d(String str) {
        H h3 = L.f5672l;
        L l5 = P2.o.f4767B.f4771c;
        new T2.y((Context) this.f1749l, (String) this.f1750m, str, null).l();
        return U2.l.f5881k;
    }

    @Override // x0.k0
    public boolean e(Object obj, Object obj2) {
        B.q qVar = (B.q) this.f1749l;
        return kotlin.jvm.internal.l.a(qVar.b(obj), qVar.b(obj2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [W3.e, java.lang.Object] */
    public InputMethodManager g() {
        return (InputMethodManager) this.f1750m.getValue();
    }

    @Override // O4.InterfaceC0262h
    public void h(InterfaceC0259e interfaceC0259e, Throwable th) {
        ((C0269o) this.f1750m).f4219k.execute(new RunnableC0268n(this, (InterfaceC0262h) this.f1749l, th, 1));
    }

    public Long i(String str) {
        R1.j b3 = R1.j.b("SELECT long_value FROM Preference where `key`=?", 1);
        b3.k(str, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1749l;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            Long l5 = null;
            if (g5.moveToFirst() && !g5.isNull(0)) {
                l5 = Long.valueOf(g5.getLong(0));
            }
            return l5;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public ArrayList j(String str) {
        R1.j b3 = R1.j.b("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            b3.i(1);
        } else {
            b3.k(str, 1);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1749l;
        workDatabase_Impl.b();
        Cursor g5 = workDatabase_Impl.g(b3);
        try {
            ArrayList arrayList = new ArrayList(g5.getCount());
            while (g5.moveToNext()) {
                arrayList.add(g5.getString(0));
            }
            return arrayList;
        } finally {
            g5.close();
            b3.l();
        }
    }

    public void k(o2.c cVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f1749l;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((o2.b) this.f1750m).e(cVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    public void l(k1.g gVar) {
        int i = gVar.f17567b;
        ExecutorC0255a executorC0255a = (ExecutorC0255a) this.f1750m;
        C1930k c1930k = (C1930k) this.f1749l;
        if (i != 0) {
            executorC0255a.execute(new RunnableC2029a(c1930k, i));
        } else {
            executorC0255a.execute(new D3.h(17, c1930k, gVar.f17566a, false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0073 A[EDGE_INSN: B:78:0x0073->B:62:0x0073 BREAK  A[LOOP:3: B:42:0x0024->B:63:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Y1.b bVar, int i, int i5) {
        List list;
        TreeMap treeMap;
        boolean z3;
        L4.n nVar = (L4.n) this.f1749l;
        J0 j02 = (J0) this.f1750m;
        int i6 = 0;
        if (nVar != null) {
            C1930k c1930k = (C1930k) nVar.f3104g;
            c1930k.getClass();
            if (i == i5) {
                list = Collections.EMPTY_LIST;
            } else {
                boolean z5 = i5 > i;
                ArrayList arrayList = new ArrayList();
                int i7 = i;
                do {
                    if (z5) {
                        if (i7 >= i5) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) c1930k.f16910l).get(Integer.valueOf(i7));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z5 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            int intValue = num.intValue();
                            if (z5) {
                                if (intValue <= i5 && intValue > i7) {
                                    arrayList.add(treeMap.get(num));
                                    z3 = true;
                                    i7 = intValue;
                                    break;
                                }
                            } else if (intValue >= i5 && intValue < i7) {
                                arrayList.add(treeMap.get(num));
                                z3 = true;
                                i7 = intValue;
                                break;
                                break;
                            }
                        }
                        z3 = false;
                    } else {
                        if (i7 <= i5) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) ((HashMap) c1930k.f16910l).get(Integer.valueOf(i7));
                        if (treeMap == null) {
                        }
                    }
                } while (z3);
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Cursor n5 = bVar.n("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (n5.moveToNext()) {
                    try {
                        arrayList2.add(n5.getString(0));
                    } catch (Throwable th) {
                        n5.close();
                        throw th;
                    }
                }
                n5.close();
                int size = arrayList2.size();
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    String str = (String) obj;
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.l("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((S1.a) it.next()).a(bVar);
                }
                R1.i v4 = J0.v(bVar);
                if (!v4.f5159b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + v4.f5158a);
                }
                q(bVar);
                return;
            }
        }
        L4.n nVar2 = (L4.n) this.f1749l;
        if (nVar2 != null) {
            if (!((i <= i5 || !nVar2.f3101c) && nVar2.f3100b)) {
                bVar.l("DROP TABLE IF EXISTS `Dependency`");
                bVar.l("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.l("DROP TABLE IF EXISTS `WorkTag`");
                bVar.l("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.l("DROP TABLE IF EXISTS `WorkName`");
                bVar.l("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.l("DROP TABLE IF EXISTS `Preference`");
                int i8 = WorkDatabase_Impl.f7100s;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) j02.f304k;
                ArrayList arrayList3 = workDatabase_Impl.f5156g;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    while (i6 < size2) {
                        ((g2.g) workDatabase_Impl.f5156g.get(i6)).getClass();
                        i6++;
                    }
                }
                J0.j(bVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i5 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void n() {
        ((W1.a) this.f1749l).a();
    }

    public void o(Bundle bundle) {
        W1.a aVar = (W1.a) this.f1749l;
        if (!aVar.f6029e) {
            aVar.a();
        }
        U1.e eVar = aVar.f6025a;
        if (eVar.g().h().compareTo(EnumC0487p.f7061n) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + eVar.g().h()).toString());
        }
        if (aVar.f6030g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = G4.l.C("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        aVar.f = bundle2;
        aVar.f6030g = true;
    }

    public void p(Bundle bundle) {
        W1.a aVar = (W1.a) this.f1749l;
        Bundle l5 = AbstractC2425d.l((W3.h[]) Arrays.copyOf(new W3.h[0], 0));
        Bundle bundle2 = aVar.f;
        if (bundle2 != null) {
            l5.putAll(bundle2);
        }
        synchronized (aVar.f6027c) {
            for (Map.Entry entry : aVar.f6028d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a5 = ((U1.d) entry.getValue()).a();
                kotlin.jvm.internal.l.f("key", str);
                kotlin.jvm.internal.l.f("value", a5);
                l5.putBundle(str, a5);
            }
        }
        if (l5.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", l5);
    }

    public void q(Y1.b bVar) {
        bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public void r(AbstractC0287d0 abstractC0287d0) {
        Object g5 = ((C2321G) this.f1750m).g(abstractC0287d0);
        if (g5 != null) {
            if (!(g5 instanceof C2316B)) {
                throw new ClassCastException();
            }
            C2316B c2316b = (C2316B) g5;
            Object[] objArr = c2316b.f18904a;
            if (c2316b.f18905b <= 0) {
                return;
            }
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap", objArr[0]);
            throw new ClassCastException();
        }
    }

    public String toString() {
        switch (this.f1748k) {
            case 18:
                return "Bounds{lower=" + ((C1968b) this.f1749l) + " upper=" + ((C1968b) this.f1750m) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(int i, Object obj, Object obj2, boolean z3) {
        this.f1748k = i;
        this.f1750m = obj;
        this.f1749l = obj2;
    }

    public v(W1.a aVar) {
        this.f1748k = 12;
        this.f1749l = aVar;
        this.f1750m = new v3.g(aVar);
    }

    public v(WorkDatabase_Impl workDatabase_Impl, int i) {
        this.f1748k = i;
        switch (i) {
            case 20:
                this.f1749l = workDatabase_Impl;
                this.f1750m = new o2.b(workDatabase_Impl, 6);
                break;
            default:
                this.f1749l = workDatabase_Impl;
                this.f1750m = new o2.b(workDatabase_Impl, 1);
                break;
        }
    }

    public v(int i) {
        this.f1748k = i;
        switch (i) {
            case 5:
                this.f1749l = new LinkedHashMap();
                this.f1750m = new LinkedHashMap();
                break;
            case 6:
                this.f1749l = new Q1.j(2);
                this.f1750m = new r.r(16);
                break;
            case 8:
                this.f1749l = new C2321G();
                this.f1750m = new C2321G();
                break;
            case 17:
                j3.e eVar = j3.e.f17512d;
                this.f1749l = new SparseIntArray();
                this.f1750m = eVar;
                break;
            case 23:
                this.f1749l = new ArrayList();
                this.f1750m = new ArrayList();
                break;
            default:
                this.f1749l = new R.e(new Reference[16]);
                this.f1750m = new ReferenceQueue();
                break;
        }
    }

    public v(View view) {
        this.f1748k = 0;
        this.f1749l = view;
        this.f1750m = G4.d.D(W3.f.f6034k, new C0040k0(6, this));
    }

    public v(B.q qVar) {
        this.f1748k = 3;
        this.f1749l = qVar;
        this.f1750m = new LinkedHashMap();
    }

    public v(ArrayList arrayList, ArrayList arrayList2) {
        this.f1748k = 13;
        int size = arrayList.size();
        this.f1749l = new int[size];
        this.f1750m = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f1749l)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f1750m)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public v(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f1748k = 18;
        lowerBound = bounds.getLowerBound();
        this.f1749l = C1968b.c(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f1750m = C1968b.c(upperBound);
    }

    public v(int i, int i5) {
        this.f1748k = 13;
        this.f1749l = new int[]{i, i5};
        this.f1750m = new float[]{0.0f, 1.0f};
    }

    public v(AbstractC2144n abstractC2144n) {
        this.f1748k = 1;
        this.f1749l = abstractC2144n;
        x1.i iVar = new x1.i(abstractC2144n);
        this.f1750m = iVar;
        abstractC2144n.addTextChangedListener(iVar);
        if (C2640a.f21068b == null) {
            synchronized (C2640a.f21067a) {
                try {
                    if (C2640a.f21068b == null) {
                        C2640a c2640a = new C2640a();
                        try {
                            C2640a.f21069c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2640a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C2640a.f21068b = c2640a;
                    }
                } finally {
                }
            }
        }
        abstractC2144n.setEditableFactory(C2640a.f21068b);
    }

    public v(int i, int i5, int i6) {
        this.f1748k = 13;
        this.f1749l = new int[]{i, i5, i6};
        this.f1750m = new float[]{0.0f, 0.5f, 1.0f};
    }
}
