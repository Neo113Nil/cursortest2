package p069j4;

import W5.AbstractC0486a1;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.session.t;
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
import org.json.JSONException;
import org.json.JSONTokener;
import p063i4.d;
import p098n4.C0932e;
import p098n4.C0934g;
import p114p4.b;
import p115p6.a;
import p120q4.k;
import p155w1.C1052y0;
import v4.c;
import v4.f;
import v4.j;
import v4.p;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f14637e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f14638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f14639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14641d = 0;

    public g(Context context, C0932e c0932e, String str) {
        try {
            String strEncode = URLEncoder.encode(str, "utf-8");
            this.f14639b = c0932e.c("Persistence");
            try {
                SQLiteDatabase writableDatabase = new f(context, strEncode, null, 2).getWritableDatabase();
                writableDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", null).close();
                writableDatabase.beginTransaction();
                writableDatabase.endTransaction();
                this.f14638a = writableDatabase;
            } catch (SQLiteException e7) {
                if (!(e7 instanceof SQLiteDatabaseLockedException)) {
                    throw e7;
                }
                throw new d("Failed to gain exclusive lock to Firebase Database's offline persistence. This generally means you are using Firebase Database from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing FirebaseDatabase in your Application class. If you are intentionally using Firebase Database from multiple processes, you can only enable offline persistence (i.e. call setPersistenceEnabled(true)) in one of them.", e7);
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
            long jLongValue = ((Long) it.next()).longValue();
            if (!z4) {
                sb.append(",");
            }
            sb.append(jLongValue);
            z4 = false;
        }
        return sb.toString();
    }

    public static r c(byte[] bArr) {
        Charset charset = f14637e;
        try {
            try {
                return a.a(q6.a.f(new JSONTokener(new String(bArr, charset)).nextValue()), j.f17190e);
            } catch (JSONException e7) {
                throw new IOException(e7);
            }
        } catch (IOException e8) {
            throw new RuntimeException("Could not deserialize node: ".concat(new String(bArr, charset)), e8);
        }
    }

    public static byte[] e(List list) {
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[length];
        Iterator it2 = list.iterator();
        int length2 = 0;
        while (it2.hasNext()) {
            byte[] bArr2 = (byte[]) it2.next();
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static String i(C0934g c0934g, int i7) {
        return k(c0934g) + String.format(Locale.US, ".part-%04d", Integer.valueOf(i7));
    }

    public static String j(String str) {
        k.b("Path keys must end with a '/'", str.endsWith("/"));
        return str.substring(0, str.length() - 1) + '0';
    }

    public static String k(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return "/";
        }
        return c0934g.toString() + "/";
    }

    public static byte[] r(Object obj) {
        try {
            return q6.a.d(obj).getBytes(f14637e);
        } catch (IOException e7) {
            throw new RuntimeException("Could not serialize leaf node", e7);
        }
    }

    public static ArrayList t(byte[] bArr) {
        int length = ((bArr.length - 1) / 262144) + 1;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 262144;
            int iMin = Math.min(262144, bArr.length - i8);
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i8, bArr2, 0, iMin);
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public final void a() {
        k.b("runInTransaction called when an existing transaction is already in progress.", !this.f14640c);
        t tVar = this.f14639b;
        if (tVar.r0()) {
            tVar.W(null, "Starting transaction.", new Object[0]);
        }
        this.f14638a.beginTransaction();
        this.f14640c = true;
        this.f14641d = System.currentTimeMillis();
    }

    public final void d() {
        this.f14638a.endTransaction();
        this.f14640c = false;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f14641d;
        t tVar = this.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Transaction completed. Elapsed: " + jCurrentTimeMillis + "ms", new Object[0]);
        }
    }

    public final r f(C0934g c0934g) {
        r rVarC;
        C0934g c0934g2;
        int i7;
        g gVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorG = gVar.g(c0934g, new String[]{"path", "value"});
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        while (cursorG.moveToNext()) {
            try {
                arrayList.add(cursorG.getString(0));
                arrayList2.add(cursorG.getBlob(1));
            } catch (Throwable th) {
                cursorG.close();
                throw th;
            }
        }
        cursorG.close();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        r rVarQ = j.f17190e;
        HashMap map = new HashMap();
        int i8 = 0;
        boolean z4 = false;
        while (true) {
            int size = arrayList2.size();
            long j = jCurrentTimeMillis4;
            t tVar = gVar.f14639b;
            if (i8 >= size) {
                long j3 = jCurrentTimeMillis2;
                for (Map.Entry entry : map.entrySet()) {
                    rVarQ = rVarQ.q(C0934g.D(c0934g, (C0934g) entry.getKey()), (r) entry.getValue());
                }
                long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis5;
                long jCurrentTimeMillis7 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (tVar.r0()) {
                    Locale locale = Locale.US;
                    StringBuilder sbG = p150v0.a.g("Loaded a total of ", arrayList2.size(), " rows for a total of ", p120q4.d.j(rVarQ), " nodes at ");
                    sbG.append(c0934g);
                    sbG.append(" in ");
                    sbG.append(jCurrentTimeMillis7);
                    sbG.append("ms (Query: ");
                    sbG.append(j3);
                    sbG.append("ms, Loading: ");
                    sbG.append(j);
                    sbG.append("ms, Serializing: ");
                    sbG.append(jCurrentTimeMillis6);
                    sbG.append("ms)");
                    tVar.W(null, sbG.toString(), new Object[0]);
                }
                return rVarQ;
            }
            if (((String) arrayList.get(i8)).endsWith(".part-0000")) {
                String str = (String) arrayList.get(i8);
                c0934g2 = new C0934g(str.substring(0, str.length() - 10));
                int i9 = i8 + 1;
                String strK = k(c0934g2);
                if (!((String) arrayList.get(i8)).startsWith(strK)) {
                    throw new IllegalStateException("Extracting split nodes needs to start with path prefix");
                }
                while (i9 < arrayList.size() && ((String) arrayList.get(i9)).equals(i(c0934g2, i9 - i8))) {
                    i9++;
                }
                if (i9 < arrayList.size()) {
                    if (((String) arrayList.get(i9)).startsWith(strK + ".part-")) {
                        throw new IllegalStateException("Run did not finish with all parts");
                    }
                }
                int i10 = i9 - i8;
                if (tVar.r0()) {
                    tVar.W(null, AbstractC0486a1.f(i10, "Loading split node with ", " parts."), new Object[0]);
                }
                int i11 = i10 + i8;
                rVarC = c(e(arrayList2.subList(i8, i11)));
                i8 = i11 - 1;
            } else {
                rVarC = c((byte[]) arrayList2.get(i8));
                c0934g2 = new C0934g((String) arrayList.get(i8));
            }
            if (c0934g2.A() == null || !c0934g2.A().equals(c.f17177d)) {
                if (c0934g2.z(c0934g)) {
                    k.b("Descendants of path must come after ancestors.", !z4);
                    rVarQ = rVarC.g(C0934g.D(c0934g2, c0934g));
                } else {
                    if (!c0934g.z(c0934g2)) {
                        throw new IllegalStateException("Loading an unrelated row with path " + c0934g2 + " for " + c0934g);
                    }
                    rVarQ = rVarQ.q(C0934g.D(c0934g, c0934g2), rVarC);
                    i7 = 1;
                    z4 = true;
                }
                i8 += i7;
                gVar = this;
                jCurrentTimeMillis4 = j;
                jCurrentTimeMillis2 = jCurrentTimeMillis2;
            } else {
                map.put(c0934g2, rVarC);
            }
            i7 = 1;
            i8 += i7;
            gVar = this;
            jCurrentTimeMillis4 = j;
            jCurrentTimeMillis2 = jCurrentTimeMillis2;
        }
    }

    public final Cursor g(C0934g c0934g, String[] strArr) {
        String strK = k(c0934g);
        String strJ = j(strK);
        int size = c0934g.size() + 3;
        String[] strArr2 = new String[size];
        int i7 = 0;
        k.c(size >= c0934g.size() + 1);
        StringBuilder sb = new StringBuilder("(");
        C0934g c0934gC = c0934g;
        while (!c0934gC.isEmpty()) {
            sb.append("path = ? OR ");
            strArr2[i7] = k(c0934gC);
            c0934gC = c0934gC.C();
            i7++;
        }
        sb.append("path = ?)");
        strArr2[i7] = k(C0934g.f15421d);
        String strE = p031e1.k.e(sb.toString(), " OR (path > ? AND path < ?)");
        strArr2[c0934g.size() + 1] = strK;
        strArr2[c0934g.size() + 2] = strJ;
        return this.f14638a.query("serverCache", strArr, strE, strArr2, null, null, "path");
    }

    public final HashSet h(Set set) {
        t tVar = this.f14639b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Cursor cursorQuery = this.f14638a.query(true, "trackedKeys", new String[]{"key"}, "id IN (" + b(set) + ")", null, null, null, null, null);
        HashSet hashSet = new HashSet();
        while (cursorQuery.moveToNext()) {
            try {
                hashSet.add(c.b(cursorQuery.getString(0)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Loaded " + hashSet.size() + " tracked queries keys for tracked queries " + set.toString() + " in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
        cursorQuery.close();
        return hashSet;
    }

    public final void l(C0934g c0934g, C0934g c0934g2, p120q4.c cVar, p120q4.c cVar2, b bVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = cVar.f15861a;
        p120q4.c cVar3 = bVar.f15704a;
        if (obj2 == null) {
            for (Map.Entry entry : cVar.f15862b) {
                c cVar4 = (c) entry.getKey();
                p120q4.c cVarZ = cVar3.z((c) entry.getKey());
                if (cVarZ.f15861a == null && (obj = cVar3.f15861a) != null) {
                    cVarZ = cVarZ.D(C0934g.f15421d, (Boolean) obj);
                }
                l(c0934g, c0934g2.t(cVar4), (p120q4.c) entry.getValue(), cVar2.z(cVar4), new b(cVarZ), arrayList);
            }
            return;
        }
        C1052y0 c1052y0 = new C1052y0(new C1052y0(cVar2, 17), 19);
        cVar3.getClass();
        C0934g c0934g3 = C0934g.f15421d;
        Integer num = (Integer) cVar3.t(c0934g3, c1052y0, 0);
        if (num.intValue() > 0) {
            C0934g c0934gM = c0934g.m(c0934g2);
            t tVar = this.f14639b;
            if (tVar.r0()) {
                Locale locale = Locale.US;
                tVar.W(null, "Need to rewrite " + num + " nodes below path " + c0934gM, new Object[0]);
            }
            C1052y0 c1052y1 = new C1052y0(new p072k1.g(cVar2, arrayList, c0934g2, f(c0934gM)), 19);
            cVar3.getClass();
            cVar3.t(c0934g3, c1052y1, null);
        }
    }

    public final int m(C0934g c0934g) {
        String strK = k(c0934g);
        return this.f14638a.delete("serverCache", "path >= ? AND path < ?", new String[]{strK, j(strK)});
    }

    public final void n(long j) {
        v();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        contentValues.put("active", Boolean.FALSE);
        contentValues.put("lastUse", Long.valueOf(j));
        this.f14638a.updateWithOnConflict("trackedQueries", contentValues, "active = 1", new String[0], 5);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        t tVar = this.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Reset active tracked queries in " + jCurrentTimeMillis2 + "ms", new Object[0]);
        }
    }

    public final int o(C0934g c0934g, r rVar) {
        long jB = p120q4.d.b(rVar);
        if (!(rVar instanceof f) || jB <= 16384) {
            p(c0934g, rVar);
            return 1;
        }
        t tVar = this.f14639b;
        int iO = 0;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            tVar.W(null, "Node estimated serialized size at path " + c0934g + " of " + jB + " bytes exceeds limit of 16384 bytes. Splitting up.", new Object[0]);
        }
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            iO += o(c0934g.t(pVar.f17201a), pVar.f17202b);
        }
        if (!rVar.e().isEmpty()) {
            p(c0934g.t(c.f17177d), rVar.e());
            iO++;
        }
        p(c0934g, j.f17190e);
        return iO + 1;
    }

    public final void p(C0934g c0934g, r rVar) {
        byte[] bArrR = r(rVar.u(true));
        int length = bArrR.length;
        SQLiteDatabase sQLiteDatabase = this.f14638a;
        if (length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("path", k(c0934g));
            contentValues.put("value", bArrR);
            sQLiteDatabase.insertWithOnConflict("serverCache", null, contentValues, 5);
            return;
        }
        ArrayList arrayListT = t(bArrR);
        t tVar = this.f14639b;
        if (tVar.r0()) {
            tVar.W(null, "Saving huge leaf node with " + arrayListT.size() + " parts.", new Object[0]);
        }
        for (int i7 = 0; i7 < arrayListT.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("path", i(c0934g, i7));
            contentValues2.put("value", (byte[]) arrayListT.get(i7));
            sQLiteDatabase.insertWithOnConflict("serverCache", null, contentValues2, 5);
        }
    }

    public final void q(C0934g c0934g, long j, String str, byte[] bArr) {
        v();
        String[] strArr = {String.valueOf(j)};
        SQLiteDatabase sQLiteDatabase = this.f14638a;
        sQLiteDatabase.delete("writes", "id = ?", strArr);
        if (bArr.length < 262144) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Long.valueOf(j));
            contentValues.put("path", k(c0934g));
            contentValues.put("type", str);
            contentValues.put("part", (Integer) null);
            contentValues.put("node", bArr);
            sQLiteDatabase.insertWithOnConflict("writes", null, contentValues, 5);
            return;
        }
        ArrayList arrayListT = t(bArr);
        for (int i7 = 0; i7 < arrayListT.size(); i7++) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("id", Long.valueOf(j));
            contentValues2.put("path", k(c0934g));
            contentValues2.put("type", str);
            contentValues2.put("part", Integer.valueOf(i7));
            contentValues2.put("node", (byte[]) arrayListT.get(i7));
            sQLiteDatabase.insertWithOnConflict("writes", null, contentValues2, 5);
        }
    }

    public final long s() {
        Cursor cursorRawQuery = this.f14638a.rawQuery("SELECT sum(length(value) + length(path)) FROM serverCache", null);
        try {
            if (!cursorRawQuery.moveToFirst()) {
                throw new IllegalStateException("Couldn't read database result!");
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public final void u(C0934g c0934g, r rVar, boolean z4) {
        int iO;
        int iM;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z4) {
            Iterator it = rVar.iterator();
            int iO2 = 0;
            int iM2 = 0;
            while (it.hasNext()) {
                p pVar = (p) it.next();
                iM2 += m(c0934g.t(pVar.f17201a));
                iO2 += o(c0934g.t(pVar.f17201a), pVar.f17202b);
            }
            iO = iO2;
            iM = iM2;
        } else {
            iM = m(c0934g);
            iO = o(c0934g, rVar);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        t tVar = this.f14639b;
        if (tVar.r0()) {
            Locale locale = Locale.US;
            String string = c0934g.toString();
            StringBuilder sbG = p150v0.a.g("Persisted a total of ", iO, " rows and deleted ", iM, " rows for a set at ");
            sbG.append(string);
            sbG.append(" in ");
            sbG.append(jCurrentTimeMillis2);
            sbG.append("ms");
            tVar.W(null, sbG.toString(), new Object[0]);
        }
    }

    public final void v() {
        k.b("Transaction expected to already be in progress.", this.f14640c);
    }
}
