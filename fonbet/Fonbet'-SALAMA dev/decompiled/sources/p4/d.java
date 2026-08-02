package p4;

import M4.e;
import android.content.ContentValues;
import android.database.Cursor;
import android.support.v4.media.session.t;
import e6.C1054c;
import j4.C1321g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import n4.C1473g;
import q4.k;
import s4.g;
import s4.h;
import w1.C1718l0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final e f15704e = new e();

    /* renamed from: f, reason: collision with root package name */
    public static final C1054c f15705f = new C1054c(22);

    /* renamed from: g, reason: collision with root package name */
    public static final C1718l0 f15706g = new C1718l0(22);

    /* renamed from: a, reason: collision with root package name */
    public q4.c f15707a = new q4.c(null);

    /* renamed from: b, reason: collision with root package name */
    public final C1321g f15708b;

    /* renamed from: c, reason: collision with root package name */
    public final t f15709c;

    /* renamed from: d, reason: collision with root package name */
    public long f15710d;

    public d(C1321g c1321g, t tVar, e eVar) {
        this.f15710d = 0L;
        this.f15708b = c1321g;
        this.f15709c = tVar;
        try {
            c1321g.a();
            c1321g.n(System.currentTimeMillis());
            c1321g.f14632a.setTransactionSuccessful();
            c1321g.d();
            t tVar2 = c1321g.f14633b;
            long currentTimeMillis = System.currentTimeMillis();
            Cursor query = c1321g.f14632a.query("trackedQueries", new String[]{"id", "path", "queryParams", "lastUse", "complete", "active"}, null, null, null, null, "id");
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                try {
                    try {
                        arrayList.add(new c(query.getLong(0), h.b(new C1473g(query.getString(1)), q6.a.c(query.getString(2))), query.getLong(3), query.getInt(4) != 0, query.getInt(5) != 0));
                    } catch (IOException e7) {
                        throw new RuntimeException(e7);
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (tVar2.r0()) {
                Locale locale = Locale.US;
                tVar2.W(null, "Loaded " + arrayList.size() + " tracked queries in " + currentTimeMillis2 + "ms", new Object[0]);
            }
            query.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                this.f15710d = Math.max(cVar.f15699a + 1, this.f15710d);
                a(cVar);
            }
        } catch (Throwable th2) {
            c1321g.d();
            throw th2;
        }
    }

    public static h e(h hVar) {
        return hVar.f16173b.h() ? h.a(hVar.f16172a) : hVar;
    }

    public final void a(c cVar) {
        h hVar = cVar.f15700b;
        boolean z4 = true;
        k.b("Can't have tracked non-default query that loads all data", !hVar.f16173b.h() || hVar.c());
        Map map = (Map) this.f15707a.y(hVar.f16172a);
        if (map == null) {
            map = new HashMap();
            this.f15707a = this.f15707a.D(hVar.f16172a, map);
        }
        g gVar = hVar.f16173b;
        c cVar2 = (c) map.get(gVar);
        if (cVar2 != null && cVar2.f15699a != cVar.f15699a) {
            z4 = false;
        }
        k.c(z4);
        map.put(gVar, cVar);
    }

    public final c b(h hVar) {
        h e7 = e(hVar);
        Map map = (Map) this.f15707a.y(e7.f16172a);
        if (map != null) {
            return (c) map.get(e7.f16173b);
        }
        return null;
    }

    public final ArrayList c(q4.g gVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f15707a.iterator();
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
        q4.c cVar = this.f15707a;
        e eVar = f15704e;
        C1473g c1473g = hVar.f16172a;
        if (cVar.m(c1473g, eVar) != null) {
            return true;
        }
        g gVar = hVar.f16173b;
        return !gVar.h() && (map = (Map) this.f15707a.y(c1473g)) != null && map.containsKey(gVar) && ((c) map.get(gVar)).f15702d;
    }

    public final void f(c cVar) {
        a(cVar);
        C1321g c1321g = this.f15708b;
        c1321g.v();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Long.valueOf(cVar.f15699a));
        h hVar = cVar.f15700b;
        contentValues.put("path", C1321g.k(hVar.f16172a));
        g gVar = hVar.f16173b;
        if (gVar.f16171h == null) {
            try {
                gVar.f16171h = q6.a.d(gVar.b());
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        contentValues.put("queryParams", gVar.f16171h);
        contentValues.put("lastUse", Long.valueOf(cVar.f15701c));
        contentValues.put("complete", Boolean.valueOf(cVar.f15702d));
        contentValues.put("active", Boolean.valueOf(cVar.f15703e));
        c1321g.f14632a.insertWithOnConflict("trackedQueries", null, contentValues, 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        t tVar = c1321g.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Saved new tracked query in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    public final void g(h hVar, boolean z4) {
        c cVar;
        h e7 = e(hVar);
        c b7 = b(e7);
        long currentTimeMillis = System.currentTimeMillis();
        if (b7 != null) {
            h hVar2 = b7.f15700b;
            if (hVar2.f16173b.h() && !hVar2.c()) {
                throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
            }
            cVar = new c(b7.f15699a, hVar2, currentTimeMillis, b7.f15702d, z4);
        } else {
            k.b("If we're setting the query to inactive, we should already be tracking it!", z4);
            long j = this.f15710d;
            this.f15710d = 1 + j;
            cVar = new c(j, e7, currentTimeMillis, false, z4);
        }
        f(cVar);
    }
}
