package Z6;

import S6.m;
import S6.r;
import V6.a;
import V6.b;
import V6.c;
import V6.d;
import V6.e;
import V6.f;
import Z6.r;
import a7.C4957a;
import a7.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b7.InterfaceC5572a;
import c7.C5758a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes9.dex */
public final class r implements d, a7.b, c {

    /* renamed from: f, reason: collision with root package name */
    private static final Q6.c f35634f = Q6.c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final y f35635a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5572a f35636b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5572a f35637c;

    /* renamed from: d, reason: collision with root package name */
    private final e f35638d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<String> f35639e;

    interface a<T, U> {
        U apply(T t2);
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f35640a;

        /* renamed from: b, reason: collision with root package name */
        final String f35641b;

        b(String str, String str2) {
            this.f35640a = str;
            this.f35641b = str2;
        }
    }

    r(InterfaceC5572a interfaceC5572a, InterfaceC5572a interfaceC5572a2, e eVar, y yVar, Pc.a<String> aVar) {
        this.f35635a = yVar;
        this.f35636b = interfaceC5572a;
        this.f35637c = interfaceC5572a2;
        this.f35638d = eVar;
        this.f35639e = aVar;
    }

    public static ArrayList m(r rVar, S6.r rVar2, SQLiteDatabase sQLiteDatabase) {
        e eVar = rVar.f35638d;
        ArrayList v11 = rVar.v(sQLiteDatabase, rVar2, eVar.c());
        for (Q6.e eVar2 : Q6.e.values()) {
            if (eVar2 != rVar2.d()) {
                int c11 = eVar.c() - v11.size();
                if (c11 <= 0) {
                    break;
                }
                r.a a11 = S6.r.a();
                a11.b(rVar2.b());
                a11.d(eVar2);
                a11.c(rVar2.c());
                v11.addAll(rVar.v(sQLiteDatabase, a11.a(), c11));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i11 = 0; i11 < v11.size(); i11++) {
            sb2.append(((j) v11.get(i11)).b());
            if (i11 < v11.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j11 = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j11));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j11), set);
                }
                set.add(new b(query.getString(1), query.getString(2)));
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }
        query.close();
        ListIterator listIterator = v11.listIterator();
        while (listIterator.hasNext()) {
            j jVar = (j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.b()))) {
                m.a l11 = jVar.a().l();
                for (b bVar : (Set) hashMap.get(Long.valueOf(jVar.b()))) {
                    l11.c(bVar.f35640a, bVar.f35641b);
                }
                listIterator.set(new Z6.b(jVar.b(), jVar.c(), l11.d()));
            }
        }
        return v11;
    }

    public static V6.a o(r rVar, HashMap hashMap, a.C0577a c0577a, Cursor cursor) {
        rVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i11 = cursor.getInt(1);
            c.b bVar = c.b.REASON_UNKNOWN;
            if (i11 != bVar.getNumber()) {
                c.b bVar2 = c.b.MESSAGE_TOO_OLD;
                if (i11 != bVar2.getNumber()) {
                    bVar2 = c.b.CACHE_FULL;
                    if (i11 != bVar2.getNumber()) {
                        bVar2 = c.b.PAYLOAD_TOO_BIG;
                        if (i11 != bVar2.getNumber()) {
                            bVar2 = c.b.MAX_RETRIES_REACHED;
                            if (i11 != bVar2.getNumber()) {
                                bVar2 = c.b.INVALID_PAYLOD;
                                if (i11 != bVar2.getNumber()) {
                                    bVar2 = c.b.SERVER_ERROR;
                                    if (i11 != bVar2.getNumber()) {
                                        W6.a.a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                    }
                                }
                            }
                        }
                    }
                }
                bVar = bVar2;
            }
            long j11 = cursor.getLong(2);
            if (!hashMap.containsKey(string)) {
                hashMap.put(string, new ArrayList());
            }
            List list = (List) hashMap.get(string);
            c.a c11 = V6.c.c();
            c11.c(bVar);
            c11.b(j11);
            list.add(c11.a());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            d.a c12 = V6.d.c();
            c12.c((String) entry.getKey());
            c12.b((List) entry.getValue());
            c0577a.a(c12.a());
        }
        final long t2 = rVar.f35636b.t();
        c0577a.e((V6.f) rVar.t(new a() { // from class: Z6.p
            @Override // Z6.r.a
            public final Object apply(Object obj) {
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                final long j12 = t2;
                return (V6.f) r.x(rawQuery, new r.a() { // from class: Z6.q
                    @Override // Z6.r.a
                    public final Object apply(Object obj2) {
                        Cursor cursor2 = (Cursor) obj2;
                        cursor2.moveToNext();
                        long j13 = cursor2.getLong(0);
                        f.a c13 = V6.f.c();
                        c13.c(j13);
                        c13.b(j12);
                        return c13.a();
                    }
                });
            }
        }));
        b.a b11 = V6.b.b();
        e.a c13 = V6.e.c();
        c13.b(rVar.r().compileStatement("PRAGMA page_size").simpleQueryForLong() * rVar.r().compileStatement("PRAGMA page_count").simpleQueryForLong());
        c13.c(e.f35622a.e());
        b11.b(c13.a());
        c0577a.d(b11.a());
        c0577a.c(rVar.f35639e.get());
        return c0577a.b();
    }

    public static Long p(r rVar, S6.m mVar, S6.r rVar2, SQLiteDatabase sQLiteDatabase) {
        long insert;
        long simpleQueryForLong = rVar.r().compileStatement("PRAGMA page_size").simpleQueryForLong() * rVar.r().compileStatement("PRAGMA page_count").simpleQueryForLong();
        e eVar = rVar.f35638d;
        if (simpleQueryForLong >= eVar.e()) {
            rVar.j(1L, c.b.CACHE_FULL, mVar.j());
            return -1L;
        }
        Long s11 = s(sQLiteDatabase, rVar2);
        if (s11 != null) {
            insert = s11.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", rVar2.b());
            contentValues.put("priority", Integer.valueOf(C5758a.a(rVar2.d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (rVar2.c() != null) {
                contentValues.put("extras", Base64.encodeToString(rVar2.c(), 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int d11 = eVar.d();
        byte[] a11 = mVar.e().a();
        boolean z11 = a11.length <= d11;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", mVar.j());
        contentValues2.put("timestamp_ms", Long.valueOf(mVar.f()));
        contentValues2.put("uptime_ms", Long.valueOf(mVar.k()));
        contentValues2.put("payload_encoding", mVar.e().b().a());
        contentValues2.put("code", mVar.d());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z11));
        contentValues2.put("payload", z11 ? a11 : new byte[0]);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z11) {
            int ceil = (int) Math.ceil(a11.length / d11);
            for (int i11 = 1; i11 <= ceil; i11++) {
                byte[] copyOfRange = Arrays.copyOfRange(a11, (i11 - 1) * d11, Math.min(i11 * d11, a11.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert2));
                contentValues3.put("sequence_num", Integer.valueOf(i11));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry<String, String> entry : mVar.i().entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert2));
            contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, entry.getKey());
            contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert2);
    }

    public static void q(r rVar, ArrayList arrayList, S6.r rVar2, Cursor cursor) {
        rVar.getClass();
        while (cursor.moveToNext()) {
            long j11 = cursor.getLong(0);
            boolean z11 = cursor.getInt(7) != 0;
            m.a a11 = S6.m.a();
            a11.i(cursor.getString(1));
            a11.h(cursor.getLong(2));
            a11.j(cursor.getLong(3));
            Q6.c cVar = f35634f;
            if (z11) {
                String string = cursor.getString(4);
                if (string != null) {
                    cVar = Q6.c.b(string);
                }
                a11.g(new S6.l(cVar, cursor.getBlob(5)));
            } else {
                String string2 = cursor.getString(4);
                if (string2 != null) {
                    cVar = Q6.c.b(string2);
                }
                Cursor query = rVar.r().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j11)}, null, null, "sequence_num");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    int i11 = 0;
                    while (query.moveToNext()) {
                        byte[] blob = query.getBlob(0);
                        arrayList2.add(blob);
                        i11 += blob.length;
                    }
                    byte[] bArr = new byte[i11];
                    int i12 = 0;
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        byte[] bArr2 = (byte[]) arrayList2.get(i13);
                        System.arraycopy(bArr2, 0, bArr, i12, bArr2.length);
                        i12 += bArr2.length;
                    }
                    query.close();
                    a11.g(new S6.l(cVar, bArr));
                } catch (Throwable th2) {
                    query.close();
                    throw th2;
                }
            }
            if (!cursor.isNull(6)) {
                a11.f(Integer.valueOf(cursor.getInt(6)));
            }
            arrayList.add(new Z6.b(j11, rVar2, a11.d()));
        }
    }

    private static Long s(SQLiteDatabase sQLiteDatabase, S6.r rVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(rVar.b(), String.valueOf(C5758a.a(rVar.d()))));
        if (rVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(rVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    private ArrayList v(SQLiteDatabase sQLiteDatabase, S6.r rVar, int i11) {
        ArrayList arrayList = new ArrayList();
        Long s11 = s(sQLiteDatabase, rVar);
        if (s11 == null) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{s11.toString()}, null, null, null, String.valueOf(i11));
        try {
            q(this, arrayList, rVar, query);
            return arrayList;
        } finally {
            query.close();
        }
    }

    private static String w(Iterable<j> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<j> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T x(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // Z6.d
    public final void E(final long j11, final S6.r rVar) {
        t(new a() { // from class: Z6.m
            @Override // Z6.r.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j11));
                S6.r rVar2 = rVar;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{rVar2.b(), String.valueOf(C5758a.a(rVar2.d()))}) < 1) {
                    contentValues.put("backend_name", rVar2.b());
                    contentValues.put("priority", Integer.valueOf(C5758a.a(rVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // Z6.d
    public final void N0(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            r().compileStatement("DELETE FROM events WHERE _id in " + w(iterable)).execute();
        }
    }

    @Override // Z6.d
    public final boolean U0(S6.r rVar) {
        Boolean bool;
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            Long s11 = s(r11, rVar);
            if (s11 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = r().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{s11.toString()});
                try {
                    Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                    rawQuery.close();
                    bool = valueOf;
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            }
            r11.setTransactionSuccessful();
            r11.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th3) {
            r11.endTransaction();
            throw th3;
        }
    }

    @Override // Z6.d
    public final Iterable<S6.r> Z0() {
        return (Iterable) t(new k());
    }

    @Override // a7.b
    public final <T> T c(b.a<T> aVar) {
        SQLiteDatabase r11 = r();
        InterfaceC5572a interfaceC5572a = this.f35637c;
        long t2 = interfaceC5572a.t();
        while (true) {
            try {
                r11.beginTransaction();
                try {
                    T execute = aVar.execute();
                    r11.setTransactionSuccessful();
                    return execute;
                } finally {
                    r11.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e11) {
                if (interfaceC5572a.t() >= this.f35638d.a() + t2) {
                    throw new C4957a("Timed out while trying to acquire the lock.", e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f35635a.close();
    }

    @Override // Z6.c
    public final void d() {
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            r11.compileStatement("DELETE FROM log_event_dropped").execute();
            r11.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f35636b.t()).execute();
            r11.setTransactionSuccessful();
        } finally {
            r11.endTransaction();
        }
    }

    @Override // Z6.d
    public final long e1(S6.r rVar) {
        Cursor rawQuery = r().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{rVar.b(), String.valueOf(C5758a.a(rVar.d()))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // Z6.d
    public final int i() {
        long t2 = this.f35636b.t() - this.f35638d.b();
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            String[] strArr = {String.valueOf(t2)};
            Cursor rawQuery = r11.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (rawQuery.moveToNext()) {
                try {
                    j(rawQuery.getInt(0), c.b.MESSAGE_TOO_OLD, rawQuery.getString(1));
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            }
            rawQuery.close();
            int delete = r11.delete("events", "timestamp_ms < ?", strArr);
            r11.setTransactionSuccessful();
            return delete;
        } finally {
            r11.endTransaction();
        }
    }

    @Override // Z6.c
    public final void j(final long j11, final c.b bVar, final String str) {
        t(new a() { // from class: Z6.n
            @Override // Z6.r.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                c.b bVar2 = bVar;
                String num = Integer.toString(bVar2.getNumber());
                String str2 = str;
                boolean booleanValue = ((Boolean) r.x(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, num}), new o())).booleanValue();
                long j12 = j11;
                if (booleanValue) {
                    sQLiteDatabase.execSQL(Sh.b.b(j12, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(bVar2.getNumber())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(bVar2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j12));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // Z6.c
    public final V6.a k() {
        a.C0577a e11 = V6.a.e();
        HashMap hashMap = new HashMap();
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            Cursor rawQuery = r11.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]);
            try {
                V6.a o11 = o(this, hashMap, e11, rawQuery);
                rawQuery.close();
                r11.setTransactionSuccessful();
                return o11;
            } catch (Throwable th2) {
                rawQuery.close();
                throw th2;
            }
        } finally {
            r11.endTransaction();
        }
    }

    @Override // Z6.d
    public final j p0(S6.r rVar, S6.m mVar) {
        W6.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", rVar.d(), mVar.j(), rVar.b());
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            Long p11 = p(this, mVar, rVar, r11);
            r11.setTransactionSuccessful();
            r11.endTransaction();
            long longValue = p11.longValue();
            if (longValue < 1) {
                return null;
            }
            return new Z6.b(longValue, rVar, mVar);
        } catch (Throwable th2) {
            r11.endTransaction();
            throw th2;
        }
    }

    @Override // Z6.d
    public final void p1(Iterable<j> iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + w(iterable);
            SQLiteDatabase r11 = r();
            r11.beginTransaction();
            try {
                r11.compileStatement(str).execute();
                Cursor rawQuery = r11.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        j(rawQuery.getInt(0), c.b.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                }
                rawQuery.close();
                r11.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                r11.setTransactionSuccessful();
            } finally {
                r11.endTransaction();
            }
        }
    }

    final SQLiteDatabase r() {
        y yVar = this.f35635a;
        Objects.requireNonNull(yVar);
        InterfaceC5572a interfaceC5572a = this.f35637c;
        long t2 = interfaceC5572a.t();
        while (true) {
            try {
                return yVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e11) {
                if (interfaceC5572a.t() >= this.f35638d.a() + t2) {
                    throw new C4957a("Timed out while trying to open db.", e11);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    final <T> T t(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            T apply = aVar.apply(r11);
            r11.setTransactionSuccessful();
            return apply;
        } finally {
            r11.endTransaction();
        }
    }

    @Override // Z6.d
    public final ArrayList w0(S6.r rVar) {
        SQLiteDatabase r11 = r();
        r11.beginTransaction();
        try {
            ArrayList m11 = m(this, rVar, r11);
            r11.setTransactionSuccessful();
            return m11;
        } finally {
            r11.endTransaction();
        }
    }
}
