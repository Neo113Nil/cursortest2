package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.media3.exoplayer.analytics.C0367l0;
import com.google.android.datatransport.runtime.b;
import com.google.android.datatransport.runtime.firebase.transport.a;
import com.google.android.datatransport.runtime.firebase.transport.c;
import com.google.android.datatransport.runtime.synchronization.b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@WorkerThread
/* loaded from: classes.dex */
public final class m implements d, com.google.android.datatransport.runtime.synchronization.b, c {
    public static final com.google.android.datatransport.c f = new com.google.android.datatransport.c("proto");
    public final v a;
    public final com.google.android.datatransport.runtime.time.a b;
    public final com.google.android.datatransport.runtime.time.a c;
    public final e d;
    public final javax.inject.a<String> e;

    public interface a<T, U> {
        U apply(T t);
    }

    public static class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public m(com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, e eVar, v vVar, javax.inject.a<String> aVar3) {
        this.a = vVar;
        this.b = aVar;
        this.c = aVar2;
        this.d = eVar;
        this.e = aVar3;
    }

    public static String H(Iterable<g> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    public static <T> T W(Cursor cursor, a<Cursor, T> aVar) {
        try {
            return aVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Nullable
    public static Long u(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.d dVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(dVar.a, String.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar.c))));
        byte[] bArr = dVar.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final Iterable F(com.google.android.datatransport.runtime.d dVar) {
        return (Iterable) x(new androidx.media3.exoplayer.hls.g(this, dVar));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    @Nullable
    public final com.google.android.datatransport.runtime.scheduling.persistence.b K(final com.google.android.datatransport.runtime.d dVar, final com.google.android.datatransport.runtime.i iVar) {
        com.google.android.datatransport.e eVar = dVar.c;
        iVar.k();
        if (Log.isLoggable(com.google.android.datatransport.runtime.logging.a.b("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(eVar);
        }
        long longValue = ((Long) x(new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
            public final Object apply(Object obj) {
                long insert;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                m mVar = m.this;
                long simpleQueryForLong = mVar.t().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar.t().compileStatement("PRAGMA page_count").simpleQueryForLong();
                e eVar2 = mVar.d;
                long e = eVar2.e();
                com.google.android.datatransport.runtime.i iVar2 = iVar;
                if (simpleQueryForLong >= e) {
                    mVar.s(1L, c.a.CACHE_FULL, iVar2.k());
                    return -1L;
                }
                com.google.android.datatransport.runtime.d dVar2 = dVar;
                Long u = m.u(sQLiteDatabase, dVar2);
                if (u != null) {
                    insert = u.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", dVar2.a);
                    contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(dVar2.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = dVar2.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d = eVar2.d();
                byte[] bArr2 = iVar2.d().b;
                boolean z = bArr2.length <= d;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", iVar2.k());
                contentValues2.put("timestamp_ms", Long.valueOf(iVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(iVar2.l()));
                contentValues2.put("payload_encoding", iVar2.d().a.a);
                contentValues2.put("code", iVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", iVar2.i());
                contentValues2.put("pseudonymous_id", iVar2.j());
                contentValues2.put("experiment_ids_clear_blob", iVar2.f());
                contentValues2.put("experiment_ids_encrypted_blob", iVar2.g());
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / d);
                    for (int i = 1; i <= ceil; i++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * d, Math.min(i * d, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new com.google.android.datatransport.runtime.scheduling.persistence.b(longValue, dVar, iVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final boolean M(com.google.android.datatransport.runtime.d dVar) {
        Boolean bool;
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            Long u = u(t, dVar);
            if (u == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = t().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{u.toString()});
                try {
                    Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                    rawQuery.close();
                    bool = valueOf;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            t.setTransactionSuccessful();
            t.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            t.endTransaction();
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final int b() {
        long a2 = this.b.a() - this.d.b();
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            String[] strArr = {String.valueOf(a2)};
            Cursor rawQuery = t.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            while (rawQuery.moveToNext()) {
                try {
                    s(rawQuery.getInt(0), c.a.MESSAGE_TOO_OLD, rawQuery.getString(1));
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
            rawQuery.close();
            int delete = t.delete("events", "timestamp_ms < ?", strArr);
            t.setTransactionSuccessful();
            return delete;
        } finally {
            t.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void c(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            t().compileStatement("DELETE FROM events WHERE _id in " + H(iterable)).execute();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final void d() {
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            t.compileStatement("DELETE FROM log_event_dropped").execute();
            t.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.b.a()).execute();
            t.setTransactionSuccessful();
        } finally {
            t.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final List g() {
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            Cursor rawQuery = t.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
            try {
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null backendName");
                    }
                    com.google.android.datatransport.e b2 = com.google.android.datatransport.runtime.util.a.b(rawQuery.getInt(2));
                    String string2 = rawQuery.getString(3);
                    arrayList.add(new com.google.android.datatransport.runtime.d(string, string2 == null ? null : Base64.decode(string2, 0), b2));
                }
                rawQuery.close();
                t.setTransactionSuccessful();
                return arrayList;
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        } finally {
            t.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void h(final long j, final com.google.android.datatransport.runtime.d dVar) {
        x(new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                com.google.android.datatransport.runtime.d dVar2 = dVar;
                String str = dVar2.a;
                com.google.android.datatransport.e eVar = dVar2.c;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(com.google.android.datatransport.runtime.util.a.a(eVar))}) < 1) {
                    contentValues.put("backend_name", str);
                    contentValues.put("priority", Integer.valueOf(com.google.android.datatransport.runtime.util.a.a(eVar)));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b
    public final <T> T l(b.a<T> aVar) {
        SQLiteDatabase t = t();
        com.google.android.datatransport.runtime.time.a aVar2 = this.c;
        long a2 = aVar2.a();
        while (true) {
            try {
                t.beginTransaction();
                try {
                    T execute = aVar.execute();
                    t.setTransactionSuccessful();
                    return execute;
                } finally {
                    t.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar2.a() >= this.d.a() + a2) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final com.google.android.datatransport.runtime.firebase.transport.a q() {
        int i = com.google.android.datatransport.runtime.firebase.transport.a.e;
        final a.C0103a c0103a = new a.C0103a();
        c0103a.a = null;
        c0103a.b = new ArrayList();
        c0103a.c = null;
        c0103a.d = "";
        final HashMap hashMap = new HashMap();
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            com.google.android.datatransport.runtime.firebase.transport.a aVar = (com.google.android.datatransport.runtime.firebase.transport.a) W(t.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
                public final Object apply(Object obj) {
                    HashMap hashMap2;
                    Cursor cursor = (Cursor) obj;
                    while (true) {
                        boolean moveToNext = cursor.moveToNext();
                        hashMap2 = hashMap;
                        if (!moveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i2 = cursor.getInt(1);
                        c.a aVar2 = c.a.REASON_UNKNOWN;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                aVar2 = c.a.MESSAGE_TOO_OLD;
                            } else if (i2 == 2) {
                                aVar2 = c.a.CACHE_FULL;
                            } else if (i2 == 3) {
                                aVar2 = c.a.PAYLOAD_TOO_BIG;
                            } else if (i2 == 4) {
                                aVar2 = c.a.MAX_RETRIES_REACHED;
                            } else if (i2 == 5) {
                                aVar2 = c.a.INVALID_PAYLOD;
                            } else if (i2 == 6) {
                                aVar2 = c.a.SERVER_ERROR;
                            } else {
                                com.google.android.datatransport.runtime.logging.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!hashMap2.containsKey(string)) {
                            hashMap2.put(string, new ArrayList());
                        }
                        ((List) hashMap2.get(string)).add(new com.google.android.datatransport.runtime.firebase.transport.c(j, aVar2));
                    }
                    Iterator it = hashMap2.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        a.C0103a c0103a2 = c0103a;
                        if (!hasNext) {
                            m mVar = m.this;
                            long a2 = mVar.b.a();
                            SQLiteDatabase t2 = mVar.t();
                            t2.beginTransaction();
                            try {
                                Cursor rawQuery = t2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                try {
                                    rawQuery.moveToNext();
                                    com.google.android.datatransport.runtime.firebase.transport.f fVar = new com.google.android.datatransport.runtime.firebase.transport.f(rawQuery.getLong(0), a2);
                                    rawQuery.close();
                                    t2.setTransactionSuccessful();
                                    t2.endTransaction();
                                    c0103a2.a = fVar;
                                    c0103a2.c = new com.google.android.datatransport.runtime.firebase.transport.b(new com.google.android.datatransport.runtime.firebase.transport.e(mVar.t().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar.t().compileStatement("PRAGMA page_count").simpleQueryForLong(), e.a.b));
                                    c0103a2.d = mVar.e.get();
                                    return new com.google.android.datatransport.runtime.firebase.transport.a(c0103a2.a, Collections.unmodifiableList(c0103a2.b), c0103a2.c, c0103a2.d);
                                } catch (Throwable th) {
                                    rawQuery.close();
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                t2.endTransaction();
                                throw th2;
                            }
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        int i3 = com.google.android.datatransport.runtime.firebase.transport.d.c;
                        new ArrayList();
                        c0103a2.b.add(new com.google.android.datatransport.runtime.firebase.transport.d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                }
            });
            t.setTransactionSuccessful();
            return aVar;
        } finally {
            t.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.c
    public final void s(final long j, final c.a aVar, final String str) {
        x(new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                int i = aVar.a;
                String num = Integer.toString(i);
                String str2 = str;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, num});
                try {
                    boolean z = rawQuery.getCount() > 0;
                    rawQuery.close();
                    long j2 = j;
                    if (z) {
                        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put(Constants.REASON, Integer.valueOf(i));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
        });
    }

    @VisibleForTesting
    public final SQLiteDatabase t() {
        v vVar = this.a;
        Objects.requireNonNull(vVar);
        com.google.android.datatransport.runtime.time.a aVar = this.c;
        long a2 = aVar.a();
        while (true) {
            try {
                return vVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.a() >= this.d.a() + a2) {
                    throw new com.google.android.datatransport.runtime.synchronization.a("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final long w(com.google.android.datatransport.runtime.n nVar) {
        Cursor rawQuery = t().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{nVar.a(), String.valueOf(com.google.android.datatransport.runtime.util.a.a(nVar.c()))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @VisibleForTesting
    public final <T> T x(a<SQLiteDatabase, T> aVar) {
        SQLiteDatabase t = t();
        t.beginTransaction();
        try {
            T apply = aVar.apply(t);
            t.setTransactionSuccessful();
            return apply;
        } finally {
            t.endTransaction();
        }
    }

    public final ArrayList y(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.d dVar, int i) {
        final ArrayList arrayList = new ArrayList();
        Long u = u(sQLiteDatabase, dVar);
        if (u == null) {
            return arrayList;
        }
        W(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{u.toString()}, null, null, null, String.valueOf(i)), new a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.m.a
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    b.a aVar = new b.a();
                    aVar.f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    aVar.a = string;
                    aVar.d = Long.valueOf(cursor.getLong(2));
                    aVar.e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        aVar.c = new com.google.android.datatransport.runtime.h(string2 == null ? m.f : new com.google.android.datatransport.c(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        com.google.android.datatransport.c cVar = string3 == null ? m.f : new com.google.android.datatransport.c(string3);
                        Cursor query = m.this.t().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i2 += blob.length;
                            }
                            byte[] bArr = new byte[i2];
                            int i3 = 0;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i4);
                                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                                i3 += bArr2.length;
                            }
                            query.close();
                            aVar.c = new com.google.android.datatransport.runtime.h(cVar, bArr);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        aVar.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        aVar.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        aVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        aVar.j = cursor.getBlob(11);
                    }
                    arrayList.add(new b(j, dVar, aVar.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.d
    public final void z(Iterable<g> iterable) {
        if (iterable.iterator().hasNext()) {
            x(new C0367l0(1, this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + H(iterable)));
        }
    }
}
