package p114p4;

import M4.e;
import android.content.ContentValues;
import android.database.Cursor;
import android.support.v4.media.session.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p036e6.c;
import p069j4.g;
import p098n4.C0934g;
import p120q4.k;
import p134s4.h;
import p155w1.C1009l0;
import q6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f15710e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f15711f = new c(22);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1009l0 f15712g = new C1009l0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p120q4.c f15713a = new p120q4.c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f15714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f15715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15716d;

    public d(g gVar, t tVar, e eVar) {
        this.f15716d = 0L;
        this.f15714b = gVar;
        this.f15715c = tVar;
        try {
            gVar.a();
            gVar.n(System.currentTimeMillis());
            gVar.f14638a.setTransactionSuccessful();
            gVar.d();
            t tVar2 = gVar.f14639b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Cursor cursorQuery = gVar.f14638a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
            ArrayList<c> arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        arrayList.add(new c(cursorQuery.getLong(0), h.b(new C0934g(cursorQuery.getString(1)), a.c(cursorQuery.getString(2))), cursorQuery.getLong(3), cursorQuery.getInt(4) != 0, cursorQuery.getInt(5) != 0));
                    } catch (IOException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (tVar2.r0()) {
                Locale locale = Locale.US;
                tVar2.W(null, "Loaded " + arrayList.size() + " tracked queries in " + jCurrentTimeMillis2 + "ms", new Object[0]);
            }
            cursorQuery.close();
            for (c cVar : arrayList) {
                this.f15716d = Math.max(cVar.f15705a + 1, this.f15716d);
                a(cVar);
            }
        } catch (Throwable th2) {
            gVar.d();
            throw th2;
        }
    }

    public static h e(h hVar) {
        return hVar.f16179b.h() ? h.a(hVar.f16178a) : hVar;
    }

    public final void a(c cVar) {
        h hVar = cVar.f15706b;
        boolean z4 = true;
        k.b("Can't have tracked non-default query that loads all data", !hVar.f16179b.h() || hVar.c());
        Map map = (Map) this.f15713a.y(hVar.f16178a);
        if (map == null) {
            map = new HashMap();
            this.f15713a = this.f15713a.D(hVar.f16178a, map);
        }
        p134s4.g gVar = hVar.f16179b;
        c cVar2 = (c) map.get(gVar);
        if (cVar2 != null && cVar2.f15705a != cVar.f15705a) {
            z4 = false;
        }
        k.c(z4);
        map.put(gVar, cVar);
    }

    public final c b(h hVar) {
        h hVarE = e(hVar);
        Map map = (Map) this.f15713a.y(hVarE.f16178a);
        if (map != null) {
            return (c) map.get(hVarE.f16179b);
        }
        return null;
    }

    public final ArrayList c(p120q4.g gVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15713a.iterator();
        while (it.hasNext()) {
            for (c cVar : ((Map) ((Map.Entry) it.next()).getValue()).values()) {
                if (gVar.p(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    public final boolean d(h hVar) {
        Map map;
        p120q4.c cVar = this.f15713a;
        e eVar = f15710e;
        C0934g c0934g = hVar.f16178a;
        if (cVar.m(c0934g, eVar) != null) {
            return true;
        }
        p134s4.g gVar = hVar.f16179b;
        return !gVar.h() && (map = (Map) this.f15713a.y(c0934g)) != null && map.containsKey(gVar) && ((c) map.get(gVar)).f15708d;
    }

    public final void f(c cVar) {
        a(cVar);
        g gVar = this.f15714b;
        gVar.v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(cVar.f15705a));
        h hVar = cVar.f15706b;
        contentValues.put("path", g.k(hVar.f16178a));
        p134s4.g gVar2 = hVar.f16179b;
        if (gVar2.f16177h == null) {
            try {
                gVar2.f16177h = a.d(gVar2.b());
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        contentValues.put("queryParams", gVar2.f16177h);
        contentValues.put("lastUse", Long.valueOf(cVar.f15707c));
        contentValues.put("complete", Boolean.valueOf(cVar.f15708d));
        contentValues.put("active", Boolean.valueOf(cVar.f15709e));
        gVar.f14638a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        t tVar = gVar.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Saved new tracked query in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    public final void g(h hVar, boolean z4) {
        c cVar;
        h hVarE = e(hVar);
        c cVarB = b(hVarE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (cVarB != null) {
            h hVar2 = cVarB.f15706b;
            if (hVar2.f16179b.h() && !hVar2.c()) {
                throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
            }
            cVar = new c(cVarB.f15705a, hVar2, jCurrentTimeMillis, cVarB.f15708d, z4);
        } else {
            k.b("If we're setting the query to inactive, we should already be tracking it!", z4);
            long j = this.f15716d;
            this.f15716d = 1 + j;
            cVar = new c(j, hVarE, jCurrentTimeMillis, false, z4);
        }
        f(cVar);
    }
}
