package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f4582a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f4583b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y6 f4584c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.K6 f4585d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f4586e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f4587f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f4588g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f4589h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f4590i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f4591j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H6 f4592k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0350f7 f4593l;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public L6(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Y6 y6, io.appmetrica.analytics.impl.H6 h6, io.appmetrica.analytics.impl.C0350f7 c0350f7) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f4582a = reentrantReadWriteLock.readLock();
        this.f4583b = reentrantReadWriteLock.writeLock();
        this.f4586e = new java.lang.Object();
        this.f4587f = new java.util.ArrayList(3);
        java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong();
        this.f4590i = atomicLong;
        this.f4591j = new java.util.ArrayList();
        this.f4584c = y6;
        this.f4588g = x4.getContext();
        this.f4589h = x4;
        this.f4592k = h6;
        this.f4593l = c0350f7;
        atomicLong.set(b());
        io.appmetrica.analytics.impl.K6 k6 = new io.appmetrica.analytics.impl.K6(this, x4);
        this.f4585d = k6;
        k6.setName(a(x4));
    }

    public final long a() {
        this.f4582a.lock();
        try {
            return this.f4590i.get();
        } finally {
            this.f4582a.unlock();
        }
    }

    public final long b() {
        long j2;
        android.database.sqlite.SQLiteDatabase readableDatabase;
        this.f4582a.lock();
        try {
            readableDatabase = this.f4584c.getReadableDatabase();
        } catch (java.lang.Throwable unused) {
        }
        if (readableDatabase != null) {
            j2 = io.appmetrica.analytics.coreutils.internal.db.DBUtils.queryRowsCount(readableDatabase, "events");
            this.f4582a.unlock();
            return j2;
        }
        j2 = 0;
        this.f4582a.unlock();
        return j2;
    }

    public final void c() {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        this.f4582a.lock();
        android.database.Cursor cursor3 = null;
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = this.f4584c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new java.lang.String[0]);
                try {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new java.lang.String[0]);
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (java.lang.Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f4582a.unlock();
                    io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor2);
                    io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (java.lang.Throwable unused2) {
            cursor = null;
        }
        this.f4582a.unlock();
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor2);
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor3);
    }

    public final void d() {
        this.f4585d.start();
    }

    public final long a(java.util.Set set) {
        this.f4582a.lock();
        android.database.Cursor cursor = null;
        long j2 = 0;
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = this.f4584c.getReadableDatabase();
            if (readableDatabase != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                java.util.Iterator it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    if (i2 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i2++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
        this.f4582a.unlock();
        return j2;
    }

    public final void a(io.appmetrica.analytics.impl.S8 s8) {
        this.f4591j.add(s8);
    }

    public static java.lang.String a(io.appmetrica.analytics.impl.Ea ea) {
        return "DatabaseWorker [" + ea.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j2, io.appmetrica.analytics.impl.Vk vk, long j3) {
        org.json.JSONObject jSONObject;
        boolean b2;
        io.appmetrica.analytics.impl.C0712t7 c0712t7 = new io.appmetrica.analytics.impl.C0712t7(null, 1, 0 == true ? 1 : 0);
        io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) this.f4589h.f5265k.a();
        java.lang.Long valueOf = java.lang.Long.valueOf(j2);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j3);
        try {
            jSONObject = new org.json.JSONObject().put("dId", c0489kh.getDeviceId()).put("uId", c0489kh.getUuid()).put("appVer", c0489kh.getAppVersion()).put("appBuild", c0489kh.getAppBuildNumber()).put("kitBuildType", c0489kh.getAnalyticsSdkBuildType()).put("osVer", c0489kh.getOsVersion()).put("osApiLev", c0489kh.getOsApiLevel()).put("lang", c0489kh.getLocale()).put("root", c0489kh.getDeviceRootStatus()).put("app_debuggable", ((io.appmetrica.analytics.impl.N5) c0489kh).f4707a).put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_FRAMEWORK, c0489kh.getAppFramework()).put("attribution_id", c0489kh.f6298r).put("analyticsSdkVersionName", c0489kh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0489kh.getAnalyticsSdkBuildNumber());
        } catch (java.lang.Throwable unused) {
            jSONObject = new org.json.JSONObject();
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        java.lang.Long valueOf3 = java.lang.Long.valueOf(io.appmetrica.analytics.impl.In.a());
        io.appmetrica.analytics.impl.Xj xj = io.appmetrica.analytics.impl.Wj.f5222a;
        synchronized (xj) {
            b2 = xj.f5310b.b(true);
        }
        android.content.ContentValues fromModel = c0712t7.fromModel(new io.appmetrica.analytics.impl.C0686s7(valueOf, vk, jSONObject2, new io.appmetrica.analytics.impl.C0660r7(valueOf2, valueOf3, java.lang.Boolean.valueOf(b2))));
        if (fromModel == null) {
            return;
        }
        this.f4583b.lock();
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.f4584c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (java.lang.Throwable unused2) {
        }
        this.f4583b.unlock();
    }

    public final void a(android.content.ContentValues contentValues) {
        synchronized (this.f4586e) {
            this.f4587f.add(contentValues);
        }
        synchronized (this.f4585d) {
            this.f4585d.notifyAll();
        }
    }

    public final int a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f4592k.a(sQLiteDatabase, java.lang.String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", android.text.TextUtils.join(", ", io.appmetrica.analytics.impl.AbstractC0792w9.f7013i), android.text.TextUtils.join(", ", io.appmetrica.analytics.impl.AbstractC0792w9.f7014j), 10), 2, this.f4589h.f5256b.f4860b, true).f4286b;
        } catch (java.lang.Throwable th) {
            io.appmetrica.analytics.impl.Qj qj = io.appmetrica.analytics.impl.AbstractC0595oj.f6598a;
            qj.getClass();
            qj.a(new io.appmetrica.analytics.impl.C0621pj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j2, int i2, int i3, boolean z2) {
        if (i3 <= 0) {
            return;
        }
        this.f4583b.lock();
        try {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", java.lang.Long.toString(j2), "session_type", java.lang.Integer.toString(i2), "id", "events", java.lang.Integer.toString(i3 - 1));
            android.database.sqlite.SQLiteDatabase writableDatabase = this.f4584c.getWritableDatabase();
            if (writableDatabase != null) {
                io.appmetrica.analytics.impl.F6 a2 = this.f4592k.a(writableDatabase, format, 1, this.f4589h.f5256b.f4860b, z2);
                if (a2.f4285a != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = a2.f4285a.iterator();
                    while (it.hasNext()) {
                        java.lang.Integer asInteger = ((android.content.ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    java.util.Iterator it2 = this.f4591j.iterator();
                    while (it2.hasNext()) {
                        ((io.appmetrica.analytics.impl.S8) it2.next()).b(arrayList);
                    }
                }
                java.util.List list = a2.f4285a;
                if (list != null) {
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        a((android.content.ContentValues) list.get(i4), "Event removed from db");
                    }
                }
                this.f4590i.addAndGet(-a2.f4286b);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f4583b.unlock();
    }

    public final android.content.ContentValues a(long j2, io.appmetrica.analytics.impl.Vk vk) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        this.f4582a.lock();
        android.database.Cursor cursor = null;
        try {
            android.database.sqlite.SQLiteDatabase readableDatabase = this.f4584c.getReadableDatabase();
            if (readableDatabase != null) {
                java.util.Locale locale = java.util.Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j2 + " AND type = " + vk.f5177a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    android.database.DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        io.appmetrica.analytics.impl.AbstractC0522lo.a(cursor);
        this.f4582a.unlock();
        return contentValues;
    }

    public static java.lang.String a(java.util.LinkedHashMap linkedHashMap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("id >= ?");
        for (java.lang.String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (android.text.TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static java.lang.String[] a(java.lang.String[] strArr, java.util.LinkedHashMap linkedHashMap) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(strArr));
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.ContentValues contentValues, java.lang.String str) {
        java.lang.Integer asInteger = contentValues.getAsInteger("type");
        if (io.appmetrica.analytics.impl.AbstractC0792w9.f7008d.contains(io.appmetrica.analytics.impl.EnumC0251bb.a(asInteger != null ? asInteger.intValue() : -1))) {
            io.appmetrica.analytics.impl.C0324e7 model = new io.appmetrica.analytics.impl.C0350f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4589h.f5267m;
            io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = model.f5780d;
            io.appmetrica.analytics.impl.C0299d7 c0299d7 = model.f5783g;
            publicLogger.info(io.appmetrica.analytics.impl.Qf.a(str, enumC0251bb, c0299d7.f5698b, c0299d7.f5699c), new java.lang.Object[0]);
        }
    }

    public static boolean a(io.appmetrica.analytics.impl.L6 l6) {
        boolean isEmpty;
        synchronized (l6.f4586e) {
            isEmpty = l6.f4587f.isEmpty();
        }
        return isEmpty;
    }
}
