package j4;

import W5.AbstractC0486a1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.session.t;
import i4.C1267d;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import n4.C1471e;
import n4.C1473g;
import org.json.JSONException;
import org.json.JSONTokener;
import p6.AbstractC1539a;
import q4.k;
import v0.AbstractC1663a;
import v4.j;
import v4.p;
import v4.r;
import w1.C1761y0;

/* renamed from: j4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1321g {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f14631e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f14632a;

    /* renamed from: b, reason: collision with root package name */
    public final t f14633b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14634c;

    /* renamed from: d, reason: collision with root package name */
    public long f14635d = 0;

    public C1321g(Context context, C1471e c1471e, String str) {
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            this.f14633b = c1471e.c("Persistence");
            try {
                SQLiteDatabase writableDatabase = new C1320f(context, encode, null, 2).getWritableDatabase();
                writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
                writableDatabase.beginTransaction();
                writableDatabase.endTransaction();
                this.f14632a = writableDatabase;
            } catch (SQLiteException e7) {
                if (!(e7 instanceof SQLiteDatabaseLockedException)) {
                    throw e7;
                }
                throw new C1267d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e7);
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static String b(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (!z4) {
                sb.append(",");
            }
            sb.append(longValue);
            z4 = false;
        }
        return sb.toString();
    }

    public static r c(byte[] bArr) {
        Charset charset = f14631e;
        try {
            try {
                return AbstractC1539a.a(q6.a.f(new JSONTokener(new String(bArr, charset)).nextValue()), j.f17184e);
            } catch (JSONException e7) {
                throw new IOException(e7);
            }
        } catch (IOException e8) {
            throw new RuntimeException("Could not deserialize node: ".concat(new String(bArr, charset)), e8);
        }
    }

    public static byte[] e(List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[i7];
        Iterator it2 = list.iterator();
        int i8 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            i8 += bArr2.length;
        }
        return bArr;
    }

    public static String i(C1473g c1473g, int i7) {
        return k(c1473g) + String.format(Locale.US, ".part-%04d", Integer.valueOf(i7));
    }

    public static String j(String str) {
        k.b("Path keys must end with a '/'", str.endsWith("/"));
        return str.substring(0, str.length() - 1) + '0';
    }

    public static String k(C1473g c1473g) {
        if (c1473g.isEmpty()) {
            return "/";
        }
        return c1473g.toString() + "/";
    }

    public static byte[] r(Object obj) {
        try {
            return q6.a.d(obj).getBytes(f14631e);
        } catch (IOException e7) {
            throw new RuntimeException("Could not serialize leaf node", e7);
        }
    }

    public static ArrayList t(byte[] bArr) {
        int length = ((bArr.length - 1) / 262144) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 262144;
            int min = Math.min(262144, bArr.length - i8);
            byte[] bArr2 = new byte[min];
            System.arraycopy(bArr, i8, bArr2, 0, min);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public final void a() {
        k.b("runInTransaction called when an existing transaction is already in progress.", !this.f14634c);
        t tVar = this.f14633b;
        if (tVar.r0()) {
            tVar.W(null, "Starting transaction.", new Object[0]);
        }
        this.f14632a.beginTransaction();
        this.f14634c = true;
        this.f14635d = System.currentTimeMillis();
    }

    public final void d() {
        this.f14632a.endTransaction();
        this.f14634c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f14635d;
        t tVar = this.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Transaction completed. Elapsed: " + currentTimeMillis + "ms", new Object[0]);
        }
    }

    public final r f(C1473g c1473g) {
        long j;
        r c3;
        C1473g c1473g2;
        int i7;
        C1321g c1321g = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        Cursor g3 = c1321g.g(c1473g, new String[]{"path", "value"});
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis();
        while (g3.moveToNext()) {
            try {
                arrayList.add(g3.getString(0));
                arrayList2.add(g3.getBlob(1));
            } catch (Throwable th) {
                g3.close();
                throw th;
            }
        }
        g3.close();
        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
        long currentTimeMillis5 = System.currentTimeMillis();
        r rVar = j.f17184e;
        HashMap hashMap = new HashMap();
        int i8 = 0;
        boolean z4 = false;
        while (true) {
            int size = arrayList2.size();
            long j3 = currentTimeMillis4;
            t tVar = c1321g.f14633b;
            if (i8 >= size) {
                long j7 = currentTimeMillis2;
                for (Map.Entry entry : hashMap.entrySet()) {
                    rVar = rVar.q(C1473g.D(c1473g, (C1473g) entry.getKey()), (r) entry.getValue());
                }
                long currentTimeMillis6 = System.currentTimeMillis() - currentTimeMillis5;
                long currentTimeMillis7 = System.currentTimeMillis() - currentTimeMillis;
                if (tVar.r0()) {
                    Locale locale = Locale.US;
                    StringBuilder g7 = AbstractC1663a.g("Loaded a total of ", arrayList2.size(), " rows for a total of ", q4.d.j(rVar), " nodes at ");
                    g7.append(c1473g);
                    g7.append(" in ");
                    g7.append(currentTimeMillis7);
                    g7.append("ms (Query: ");
                    g7.append(j7);
                    g7.append("ms, Loading: ");
                    g7.append(j3);
                    g7.append("ms, Serializing: ");
                    g7.append(currentTimeMillis6);
                    g7.append("ms)");
                    tVar.W(null, g7.toString(), new Object[0]);
                }
                return rVar;
            }
            if (((String) arrayList.get(i8)).endsWith(".part-0000")) {
                j = currentTimeMillis2;
                c1473g2 = new C1473g(((String) arrayList.get(i8)).substring(0, r13.length() - 10));
                int i9 = i8 + 1;
                String k7 = k(c1473g2);
                if (!((String) arrayList.get(i8)).startsWith(k7)) {
                    throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
                }
                while (i9 < arrayList.size() && ((String) arrayList.get(i9)).equals(i(c1473g2, i9 - i8))) {
                    i9++;
                }
                if (i9 < arrayList.size()) {
                    if (((String) arrayList.get(i9)).startsWith(k7 + ".part-")) {
                        throw new IllegalStateException("Run did not finish with all parts");
                    }
                }
                int i10 = i9 - i8;
                if (tVar.r0()) {
                    tVar.W(null, AbstractC0486a1.f(i10, "Loading split node with ", " parts."), new Object[0]);
                }
                int i11 = i10 + i8;
                c3 = c(e(arrayList2.subList(i8, i11)));
                i8 = i11 - 1;
            } else {
                j = currentTimeMillis2;
                c3 = c((byte[]) arrayList2.get(i8));
                c1473g2 = new C1473g((String) arrayList.get(i8));
            }
            if (c1473g2.A() != null && c1473g2.A().equals(v4.c.f17171d)) {
                hashMap.put(c1473g2, c3);
            } else if (c1473g2.z(c1473g)) {
                k.b("Descendants of path must come after ancestors.", !z4);
                rVar = c3.g(C1473g.D(c1473g2, c1473g));
            } else {
                if (!c1473g.z(c1473g2)) {
                    throw new IllegalStateException("Loading an unrelated row with path " + c1473g2 + " for " + c1473g);
                }
                rVar = rVar.q(C1473g.D(c1473g, c1473g2), c3);
                i7 = 1;
                z4 = true;
                i8 += i7;
                c1321g = this;
                currentTimeMillis4 = j3;
                currentTimeMillis2 = j;
            }
            i7 = 1;
            i8 += i7;
            c1321g = this;
            currentTimeMillis4 = j3;
            currentTimeMillis2 = j;
        }
    }

    public final Cursor g(C1473g c1473g, String[] strArr) {
        String k7 = k(c1473g);
        String j = j(k7);
        int size = c1473g.size() + 3;
        String[] strArr2 = new String[size];
        int i7 = 0;
        k.c(size >= c1473g.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        C1473g c1473g2 = c1473g;
        while (!c1473g2.isEmpty()) {
            sb.append("path = ? OR ");
            strArr2[i7] = k(c1473g2);
            c1473g2 = c1473g2.C();
            i7++;
        }
        sb.append("path = ?)");
        strArr2[i7] = k(C1473g.f15415d);
        String e7 = e1.k.e(sb.toString(), " OR (path > ? AND path < ?)");
        strArr2[c1473g.size() + 1] = k7;
        strArr2[c1473g.size() + 2] = j;
        return this.f14632a.query("serverCache", strArr, e7, strArr2, null, null, "path");
    }

    public final HashSet h(Set set) {
        t tVar = this.f14633b;
        long currentTimeMillis = System.currentTimeMillis();
        Cursor query = this.f14632a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + b(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (query.moveToNext()) {
            try {
                hashSet.add(v4.c.b(query.getString(0)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Loaded " + hashSet.size() + " tracked queries keys for tracked queries " + set.toString() + " in " + currentTimeMillis2 + "ms", new Object[0]);
        }
        query.close();
        return hashSet;
    }

    public final void l(C1473g c1473g, C1473g c1473g2, q4.c cVar, q4.c cVar2, p4.b bVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = cVar.f15855a;
        q4.c cVar3 = bVar.f15698a;
        if (obj2 == null) {
            for (Map.Entry entry : cVar.f15856b) {
                v4.c cVar4 = (v4.c) entry.getKey();
                q4.c z4 = cVar3.z((v4.c) entry.getKey());
                if (z4.f15855a == null && (obj = cVar3.f15855a) != null) {
                    z4 = z4.D(C1473g.f15415d, (Boolean) obj);
                }
                l(c1473g, c1473g2.t(cVar4), (q4.c) entry.getValue(), cVar2.z(cVar4), new p4.b(z4), arrayList);
            }
            return;
        }
        C1761y0 c1761y0 = new C1761y0(new C1761y0(cVar2, 17), 19);
        cVar3.getClass();
        C1473g c1473g3 = C1473g.f15415d;
        Integer num = (Integer) cVar3.t(c1473g3, c1761y0, 0);
        if (num.intValue() > 0) {
            C1473g m7 = c1473g.m(c1473g2);
            t tVar = this.f14633b;
            if (tVar.r0()) {
                Locale locale = Locale.US;
                tVar.W(null, "Need to rewrite " + num + " nodes below path " + m7, new Object[0]);
            }
            C1761y0 c1761y02 = new C1761y0(new k1.g(cVar2, arrayList, c1473g2, f(m7)), 19);
            cVar3.getClass();
            cVar3.t(c1473g3, c1761y02, null);
        }
    }

    public final int m(C1473g c1473g) {
        String k7 = k(c1473g);
        return this.f14632a.delete("serverCache", "path >= ? AND path < ?", new String[]{k7, j(k7)});
    }

    public final void n(long j) {
        v();
        long currentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f14632a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        t tVar = this.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Reset active tracked queries in " + currentTimeMillis2 + "ms", new Object[0]);
        }
    }

    public final int o(C1473g c1473g, r rVar) {
        long b7 = q4.d.b(rVar);
        if (!(rVar instanceof v4.f) || b7 <= 16384) {
            p(c1473g, rVar);
            return 1;
        }
        t tVar = this.f14633b;
        int i7 = 0;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Node estimated serialized size at path " + c1473g + " of " + b7 + " bytes exceeds limit of 16384 bytes. Splitting up.", new Object[0]);
        }
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            i7 += o(c1473g.t(pVar.f17195a), pVar.f17196b);
        }
        if (!rVar.e().isEmpty()) {
            p(c1473g.t(v4.c.f17171d), rVar.e());
            i7++;
        }
        p(c1473g, j.f17184e);
        return i7 + 1;
    }

    public final void p(C1473g c1473g, r rVar) {
        byte[] r7 = r(rVar.u(true));
        int length = r7.length;
        SQLiteDatabase sQLiteDatabase = this.f14632a;
        if (length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", k(c1473g));
            contentValues.put("value", r7);
            sQLiteDatabase.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        ArrayList t7 = t(r7);
        t tVar = this.f14633b;
        if (tVar.r0()) {
            tVar.W(null, "Saving huge leaf node with " + t7.size() + " parts.", new Object[0]);
        }
        for (int i7 = 0; i7 < t7.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", i(c1473g, i7));
            contentValues2.put("value", (byte[]) t7.get(i7));
            sQLiteDatabase.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    public final void q(C1473g c1473g, long j, String str, byte[] bArr) {
        v();
        String[] strArr = {String.valueOf(j)};
        SQLiteDatabase sQLiteDatabase = this.f14632a;
        sQLiteDatabase.delete("writes", "id = ?", strArr);
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", k(c1473g));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            sQLiteDatabase.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        ArrayList t7 = t(bArr);
        for (int i7 = 0; i7 < t7.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", k(c1473g));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i7));
            contentValues2.put("node", (byte[]) t7.get(i7));
            sQLiteDatabase.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    public final long s() {
        Cursor rawQuery = this.f14632a.rawQuery("SELECT sum(length(value) + length(path)) FROM serverCache", null);
        try {
            if (rawQuery.moveToFirst()) {
                return rawQuery.getLong(0);
            }
            throw new IllegalStateException("Couldn't read database result!");
        } finally {
            rawQuery.close();
        }
    }

    public final void u(C1473g c1473g, r rVar, boolean z4) {
        int i7;
        int i8;
        long currentTimeMillis = System.currentTimeMillis();
        if (z4) {
            Iterator it = rVar.iterator();
            int i9 = 0;
            int i10 = 0;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                i10 += m(c1473g.t(pVar.f17195a));
                i9 += o(c1473g.t(pVar.f17195a), pVar.f17196b);
            }
            i7 = i9;
            i8 = i10;
        } else {
            i8 = m(c1473g);
            i7 = o(c1473g, rVar);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        t tVar = this.f14633b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            String c1473g2 = c1473g.toString();
            StringBuilder g3 = AbstractC1663a.g("Persisted a total of ", i7, " rows and deleted ", i8, " rows for a set at ");
            g3.append(c1473g2);
            g3.append(" in ");
            g3.append(currentTimeMillis2);
            g3.append("ms");
            tVar.W(null, g3.toString(), new Object[0]);
        }
    }

    public final void v() {
        k.b("Transaction expected to already be in progress.", this.f14634c);
    }
}
