package G4;

import C0.C0090i;
import W5.AbstractC0486a1;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONTokener;
import p098n4.C0929b;
import p098n4.C0932e;
import p098n4.C0934g;
import p155w1.C1009l0;
import p155w1.C1010l1;
import p155w1.C1013m0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final class M implements C, p114p4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2919e;

    public M(S s7, E4.y yVar) {
        this.f2915a = -1L;
        this.f2916b = s7;
        this.f2918d = new r(this, yVar);
    }

    public void A(H4.h hVar) {
        ((S) this.f2916b).b0("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", p113p3.f.C(hVar.f3318a), Long.valueOf(l()));
    }

    @Override // G4.C
    public void a(Z z4) {
        ((S) this.f2916b).f2931e.c(z4.b(l()));
    }

    @Override // p114p4.a
    public void b(C0934g c0934g, C0929b c0929b) {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iM = 0;
        int iO = 0;
        for (Map.Entry entry : c0929b.f15398a) {
            iM += gVar.m(c0934g.m((C0934g) entry.getKey()));
            iO += gVar.o(c0934g.m((C0934g) entry.getKey()), (v4.r) entry.getValue());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            String string = c0934g.toString();
            StringBuilder sbG = p150v0.a.g("Persisted a total of ", iO, " rows and deleted ", iM, " rows for a merge at ");
            sbG.append(string);
            sbG.append(" in ");
            sbG.append(jCurrentTimeMillis2);
            sbG.append("ms");
            tVar.W(null, sbG.toString(), new Object[0]);
        }
        z();
    }

    @Override // p114p4.a
    public void c() {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDelete = gVar.f14638a.delete("writes", null, null);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Deleted " + iDelete + " (all) write(s) in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p114p4.a
    public void d(long j) {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDelete = gVar.f14638a.delete("writes", "id = ?", new String[]{String.valueOf(j)});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Deleted " + iDelete + " write(s) with writeId " + j + " in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p114p4.a
    public void e(C0934g c0934g, v4.r rVar) {
        p114p4.c cVar;
        p114p4.d dVar = (p114p4.d) this.f2917c;
        if (dVar.f15713a.C(c0934g, p114p4.d.f15711f) != null) {
            return;
        }
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        gVar.u(c0934g, rVar, false);
        if (dVar.f15713a.m(c0934g, p114p4.d.f15710e) != null) {
            return;
        }
        p134s4.h hVarA = p134s4.h.a(c0934g);
        p114p4.c cVarB = dVar.b(hVarA);
        if (cVarB == null) {
            long j = dVar.f15716d;
            dVar.f15716d = 1 + j;
            cVar = new p114p4.c(j, hVarA, System.currentTimeMillis(), true, false);
        } else {
            p120q4.k.b("This should have been handled above!", !cVarB.f15708d);
            cVar = new p114p4.c(cVarB.f15705a, cVarB.f15706b, cVarB.f15707c, true, cVarB.f15709e);
        }
        dVar.f(cVar);
    }

    @Override // G4.C
    public void f() {
        p113p3.f.O("Committing a transaction without having started one", this.f2915a != -1, new Object[0]);
        this.f2915a = -1L;
    }

    @Override // G4.C
    public void g() {
        p113p3.f.O("Starting a transaction without committing the previous one", this.f2915a == -1, new Object[0]);
        E4.y yVar = (E4.y) this.f2917c;
        long j = yVar.f2247a + 1;
        yVar.f2247a = j;
        this.f2915a = j;
    }

    @Override // p114p4.a
    public void h(p134s4.h hVar, HashSet hashSet) {
        p120q4.k.b("We should only track keys for filtered queries.", !hVar.f16179b.h());
        p114p4.c cVarB = ((p114p4.d) this.f2917c).b(hVar);
        p120q4.k.b("We only expect tracked keys for currently-active queries.", cVarB != null && cVarB.f15709e);
        long j = cVarB.f15705a;
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArr = {String.valueOf(j)};
        SQLiteDatabase sQLiteDatabase = gVar.f14638a;
        sQLiteDatabase.delete("trackedKeys", "id = ?", strArr);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v4.c cVar = (v4.c) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", cVar.f17179a);
            sQLiteDatabase.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Set " + hashSet.size() + " tracked query keys for tracked query " + j + " in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // p114p4.a
    public void i(p134s4.h hVar) {
        ((p114p4.d) this.f2917c).g(hVar, false);
    }

    @Override // p114p4.a
    public Object j(Callable callable) {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.a();
        try {
            Object objCall = callable.call();
            gVar.f14638a.setTransactionSuccessful();
            gVar.d();
            return objCall;
        } catch (Throwable th) {
            try {
                ((android.support.v4.media.session.t) this.f2918d).a0("Caught Throwable.", th);
                throw new RuntimeException(th);
            } catch (Throwable th2) {
                gVar.d();
                throw th2;
            }
        }
    }

    @Override // p114p4.a
    public void k(long j, C0929b c0929b, C0934g c0934g) {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.q(c0934g, j, "m", p069j4.g.r(c0929b.D()));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Persisted user merge in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // G4.C
    public long l() {
        p113p3.f.O("Attempting to get a sequence number outside of a transaction", this.f2915a != -1, new Object[0]);
        return this.f2915a;
    }

    @Override // p114p4.a
    public void m(p134s4.h hVar, HashSet hashSet, HashSet hashSet2) {
        SQLiteDatabase sQLiteDatabase;
        p120q4.k.b("We should only track keys for filtered queries.", !hVar.f16179b.h());
        p114p4.c cVarB = ((p114p4.d) this.f2917c).b(hVar);
        p120q4.k.b("We only expect tracked keys for currently-active queries.", cVarB != null && cVarB.f15709e);
        long j = cVarB.f15705a;
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strValueOf = String.valueOf(j);
        Iterator it = hashSet2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            sQLiteDatabase = gVar.f14638a;
            if (!zHasNext) {
                break;
            } else {
                sQLiteDatabase.delete("trackedKeys", "id = ? AND key = ?", new String[]{strValueOf, ((v4.c) it.next()).f17179a});
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            v4.c cVar = (v4.c) it2.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("key", cVar.f17179a);
            sQLiteDatabase.insertWithOnConflict("trackedKeys", null, contentValues, 5);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            StringBuilder sbG = p150v0.a.g("Updated tracked query keys (", hashSet.size(), " added, ", hashSet2.size(), " removed) for tracked query id ");
            sbG.append(j);
            sbG.append(" in ");
            sbG.append(jCurrentTimeMillis2);
            sbG.append("ms");
            tVar.W(null, sbG.toString(), new Object[0]);
        }
    }

    @Override // p114p4.a
    public void n(p134s4.h hVar) {
        ((p114p4.d) this.f2917c).g(hVar, true);
    }

    @Override // p114p4.a
    public List o() {
        byte[] bArrE;
        p098n4.H h6;
        p069j4.g gVar = (p069j4.g) this.f2916b;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = gVar.f14638a.query("writes", new String[]{"id", "path", "type", "part", "node"}, null, null, null, null, "id, part");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    long j = cursorQuery.getLong(0);
                    C0934g c0934g = new C0934g(cursorQuery.getString(1));
                    String string = cursorQuery.getString(2);
                    if (cursorQuery.isNull(3)) {
                        bArrE = cursorQuery.getBlob(4);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        do {
                            arrayList2.add(cursorQuery.getBlob(4));
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                        } while (cursorQuery.getLong(0) == j);
                        cursorQuery.moveToPrevious();
                        bArrE = p069j4.g.e(arrayList2);
                    }
                    try {
                        Object objF = q6.a.f(new JSONTokener(new String(bArrE, p069j4.g.f14637e)).nextValue());
                        if ("o".equals(string)) {
                            h6 = new p098n4.H(j, c0934g, p115p6.a.a(objF, v4.j.f17190e), true);
                        } else {
                            if (!"m".equals(string)) {
                                throw new IllegalStateException("Got invalid write type: " + string);
                            }
                            h6 = new p098n4.H(j, C0929b.B((Map) objF), c0934g);
                        }
                        arrayList.add(h6);
                    } catch (JSONException e7) {
                        throw new IOException(e7);
                    }
                } catch (IOException e8) {
                    throw new RuntimeException("Failed to load writes", e8);
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Loaded " + arrayList.size() + " writes in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
        cursorQuery.close();
        return arrayList;
    }

    @Override // p114p4.a
    public void p(C0934g c0934g, v4.r rVar, long j) {
        p069j4.g gVar = (p069j4.g) this.f2916b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gVar.q(c0934g, j, "o", p069j4.g.r(rVar.u(true)));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        android.support.v4.media.session.t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Persisted user overwrite in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    @Override // G4.C
    public void q(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void r(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void s(H4.h hVar) {
        A(hVar);
    }

    @Override // G4.C
    public void t(V0 v6) {
        this.f2919e = v6;
    }

    @Override // p114p4.a
    public p134s4.a u(p134s4.h hVar) {
        HashSet<v4.c> hashSet;
        boolean z4;
        p114p4.c cVar;
        p114p4.d dVar = (p114p4.d) this.f2917c;
        boolean zD = dVar.d(hVar);
        p069j4.g gVar = (p069j4.g) this.f2916b;
        C0934g c0934g = hVar.f16178a;
        p134s4.g gVar2 = hVar.f16179b;
        if (zD) {
            p114p4.c cVarB = dVar.b(hVar);
            hashSet = (gVar2.h() || cVarB == null || !cVarB.f15708d) ? null : gVar.h(Collections.singleton(Long.valueOf(cVarB.f15705a)));
            z4 = true;
        } else {
            p120q4.k.b("Path is fully complete.", !dVar.d(p134s4.h.a(c0934g)));
            hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            Map map = (Map) dVar.f15713a.y(c0934g);
            if (map != null) {
                for (p114p4.c cVar2 : map.values()) {
                    if (!cVar2.f15706b.f16179b.h()) {
                        hashSet2.add(Long.valueOf(cVar2.f15705a));
                    }
                }
            }
            if (!hashSet2.isEmpty()) {
                hashSet.addAll(dVar.f15714b.h(hashSet2));
            }
            for (Map.Entry entry : dVar.f15713a.F(c0934g).f15862b) {
                v4.c cVar3 = (v4.c) entry.getKey();
                Object obj = ((p120q4.c) entry.getValue()).f15861a;
                if (obj != null && (cVar = (p114p4.c) ((Map) obj).get(p134s4.g.f16169i)) != null && cVar.f15708d) {
                    hashSet.add(cVar3);
                }
            }
            z4 = false;
        }
        v4.r rVarF = gVar.f(c0934g);
        if (hashSet == null) {
            return new p134s4.a(new v4.l(rVarF, gVar2.f16176g), z4, false);
        }
        v4.r rVarS = v4.j.f17190e;
        for (v4.c cVar4 : hashSet) {
            rVarS = rVarS.s(cVar4, rVarF.o(cVar4));
        }
        return new p134s4.a(new v4.l(rVarS, gVar2.f16176g), z4, true);
    }

    @Override // p114p4.a
    public void v(p134s4.h hVar, v4.r rVar) {
        boolean zH = hVar.f16179b.h();
        p069j4.g gVar = (p069j4.g) this.f2916b;
        C0934g c0934g = hVar.f16178a;
        if (zH) {
            gVar.v();
            gVar.u(c0934g, rVar, false);
        } else {
            gVar.v();
            gVar.u(c0934g, rVar, true);
        }
        w(hVar);
        z();
    }

    @Override // p114p4.a
    public void w(p134s4.h hVar) {
        boolean zH = hVar.f16179b.h();
        p114p4.d dVar = (p114p4.d) this.f2917c;
        if (zH) {
            p120q4.c cVarF = dVar.f15713a.F(hVar.f16178a);
            C1010l1 c1010l1 = new C1010l1(dVar);
            cVarF.getClass();
            cVarF.t(C0934g.f15421d, c1010l1, null);
            return;
        }
        dVar.getClass();
        p114p4.c cVarB = dVar.b(p114p4.d.e(hVar));
        if (cVarB == null || cVarB.f15708d) {
            return;
        }
        dVar.f(new p114p4.c(cVarB.f15705a, cVarB.f15706b, cVarB.f15707c, true, cVarB.f15709e));
    }

    @Override // G4.C
    public void x(H4.h hVar) {
        A(hVar);
    }

    @Override // p114p4.a
    public void y(C0934g c0934g, C0929b c0929b) {
        for (Map.Entry entry : c0929b.f15398a) {
            e(c0934g.m((C0934g) entry.getKey()), (v4.r) entry.getValue());
        }
    }

    public void z() {
        p120q4.c cVar;
        E4.y yVar;
        boolean z4;
        android.support.v4.media.session.t tVar;
        int size;
        int size2;
        M m7 = this;
        long j = m7.f2915a + 1;
        m7.f2915a = j;
        E4.y yVar2 = (E4.y) m7.f2919e;
        yVar2.getClass();
        long j3 = 1000;
        if (j > 1000) {
            android.support.v4.media.session.t tVar2 = (android.support.v4.media.session.t) m7.f2918d;
            if (tVar2.r0()) {
                tVar2.W(null, "Reached prune check threshold.", new Object[0]);
            }
            m7.f2915a = 0L;
            p069j4.g gVar = (p069j4.g) m7.f2916b;
            long jS = gVar.s();
            if (tVar2.r0()) {
                tVar2.W(null, AbstractC0486a1.g("Cache size: ", jS), new Object[0]);
            }
            boolean z7 = true;
            while (z7) {
                C1009l0 c1009l0 = p114p4.d.f15712g;
                p114p4.d dVar = (p114p4.d) m7.f2917c;
                long size3 = dVar.c(c1009l0).size();
                if (jS <= yVar2.f2247a && size3 <= j3) {
                    return;
                }
                ArrayList arrayListC = dVar.c(c1009l0);
                long size4 = arrayListC.size();
                long jMin = size4 - Math.min((long) Math.floor(size4 * 0.8f), j3);
                p114p4.b bVar = new p114p4.b();
                android.support.v4.media.session.t tVar3 = dVar.f15715c;
                if (tVar3.r0()) {
                    tVar3.W(null, "Pruning old queries.  Prunable: " + arrayListC.size() + " Count to prune: " + jMin, new Object[0]);
                }
                Collections.sort(arrayListC, new C0090i(3));
                for (int i7 = 0; i7 < jMin; i7++) {
                    p114p4.c cVar2 = (p114p4.c) arrayListC.get(i7);
                    C0934g c0934g = cVar2.f15706b.f16178a;
                    C1013m0 c1013m0 = p114p4.b.f15700b;
                    p120q4.c cVar3 = bVar.f15704a;
                    if (cVar3.C(c0934g, c1013m0) != null) {
                        throw new IllegalArgumentException("Can't prune path that was kept previously!");
                    }
                    if (cVar3.C(c0934g, p114p4.b.f15701c) == null) {
                        bVar = new p114p4.b(cVar3.E(c0934g, p114p4.b.f15702d));
                    }
                    p134s4.h hVarE = p114p4.d.e(cVar2.f15706b);
                    p114p4.c cVarB = dVar.b(hVarE);
                    p120q4.k.b("Query must exist to be removed.", cVarB != null);
                    long j7 = cVarB.f15705a;
                    p069j4.g gVar2 = dVar.f15714b;
                    gVar2.v();
                    String strValueOf = String.valueOf(j7);
                    SQLiteDatabase sQLiteDatabase = gVar2.f14638a;
                    sQLiteDatabase.delete("trackedQueries", "id = ?", new String[]{strValueOf});
                    sQLiteDatabase.delete("trackedKeys", "id = ?", new String[]{strValueOf});
                    p120q4.c cVar4 = dVar.f15713a;
                    C0934g c0934g2 = hVarE.f16178a;
                    Map map = (Map) cVar4.y(c0934g2);
                    map.remove(hVarE.f16179b);
                    if (map.isEmpty()) {
                        dVar.f15713a = dVar.f15713a.B(c0934g2);
                    }
                }
                for (int i8 = (int) jMin; i8 < arrayListC.size(); i8++) {
                    C0934g c0934g3 = ((p114p4.c) arrayListC.get(i8)).f15706b.f16178a;
                    C1013m0 c1013m1 = p114p4.b.f15700b;
                    p120q4.c cVar5 = bVar.f15704a;
                    if (cVar5.C(c0934g3, c1013m1) == null) {
                        bVar = new p114p4.b(cVar5.E(c0934g3, p114p4.b.f15703e));
                    }
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = dVar.f15713a.iterator();
                while (it.hasNext()) {
                    for (p114p4.c cVar6 : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                        if (cVar6.f15709e) {
                            arrayList.add(cVar6);
                        }
                    }
                }
                if (tVar3.r0()) {
                    tVar3.W(null, "Unprunable queries: " + arrayList.size(), new Object[0]);
                }
                Iterator it2 = arrayList.iterator();
                p114p4.b bVar2 = bVar;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    cVar = bVar2.f15704a;
                    if (!zHasNext) {
                        break;
                    }
                    C0934g c0934g4 = ((p114p4.c) it2.next()).f15706b.f16178a;
                    if (cVar.C(c0934g4, p114p4.b.f15700b) == null) {
                        bVar2 = new p114p4.b(cVar.E(c0934g4, p114p4.b.f15703e));
                    }
                }
                if (cVar.l()) {
                    C0934g c0934g5 = C0934g.f15421d;
                    if (cVar.l()) {
                        gVar.v();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Cursor cursorG = gVar.g(c0934g5, new String[]{"rowid", "path"});
                        p120q4.c cVar7 = new p120q4.c(null);
                        p120q4.c cVar8 = new p120q4.c(null);
                        while (true) {
                            boolean zMoveToNext = cursorG.moveToNext();
                            tVar = gVar.f14639b;
                            if (!zMoveToNext) {
                                break;
                            }
                            long j8 = cursorG.getLong(0);
                            E4.y yVar3 = yVar2;
                            C0934g c0934g6 = new C0934g(cursorG.getString(1));
                            if (c0934g5.z(c0934g6)) {
                                C0934g c0934gD = C0934g.D(c0934g5, c0934g6);
                                Boolean bool = (Boolean) cVar.A(c0934gD);
                                if (bool == null || !bool.booleanValue()) {
                                    Boolean bool2 = (Boolean) cVar.A(c0934gD);
                                    if (bool2 == null || bool2.booleanValue()) {
                                        tVar.C0("We are pruning at " + c0934g5 + " and have data at " + c0934g6 + " that isn't marked for pruning or keeping. Ignoring.");
                                    } else {
                                        cVar8 = cVar8.D(c0934gD, Long.valueOf(j8));
                                    }
                                } else {
                                    cVar7 = cVar7.D(c0934gD, Long.valueOf(j8));
                                }
                            } else {
                                tVar.C0("We are pruning at " + c0934g5 + " but we have data stored higher up at " + c0934g6 + ". Ignoring.");
                            }
                            yVar2 = yVar3;
                        }
                        yVar = yVar2;
                        if (cVar7.isEmpty()) {
                            size = 0;
                            size2 = 0;
                        } else {
                            ArrayList<p120q4.e> arrayList2 = new ArrayList();
                            C0934g c0934g7 = C0934g.f15421d;
                            gVar.l(c0934g5, c0934g7, cVar7, cVar8, bVar2, arrayList2);
                            ArrayList arrayList3 = new ArrayList();
                            cVar7.t(c0934g7, new p145u1.c(arrayList3, 24), null);
                            gVar.f14638a.delete("serverCache", "rowid IN (" + p069j4.g.b(arrayList3) + ")", null);
                            for (p120q4.e eVar : arrayList2) {
                                gVar.o(c0934g5.m((C0934g) eVar.f15863a), (v4.r) eVar.f15864b);
                            }
                            size = arrayList3.size();
                            size2 = arrayList2.size();
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (tVar.r0()) {
                            Locale locale = Locale.US;
                            tVar.W(null, AbstractC0486a1.i(p150v0.a.g("Pruned ", size, " rows with ", size2, " nodes resaved in "), jCurrentTimeMillis2, "ms"), new Object[0]);
                        }
                    } else {
                        yVar = yVar2;
                    }
                } else {
                    yVar = yVar2;
                    z7 = false;
                }
                jS = gVar.s();
                if (tVar2.r0()) {
                    z4 = false;
                    tVar2.W(null, AbstractC0486a1.g("Cache size after prune: ", jS), new Object[0]);
                } else {
                    z4 = false;
                }
                m7 = this;
                yVar2 = yVar;
                j3 = 1000;
            }
        }
    }

    public M(C0932e c0932e, p069j4.g gVar, E4.y yVar) {
        M4.e eVar = new M4.e();
        this.f2915a = 0L;
        this.f2916b = gVar;
        android.support.v4.media.session.t tVarC = c0932e.c("Persistence");
        this.f2918d = tVarC;
        this.f2917c = new p114p4.d(gVar, tVarC, eVar);
        this.f2919e = yVar;
    }
}
