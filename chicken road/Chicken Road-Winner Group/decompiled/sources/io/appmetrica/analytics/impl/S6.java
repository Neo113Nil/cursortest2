package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class S6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f6554a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f6555b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487f7 f6556c;

    /* renamed from: d, reason: collision with root package name */
    public final R6 f6557d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6558e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6559g;

    /* renamed from: h, reason: collision with root package name */
    public final C0459e5 f6560h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f6561i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6562j;

    /* renamed from: k, reason: collision with root package name */
    public final O6 f6563k;

    /* renamed from: l, reason: collision with root package name */
    public final C0694n7 f6564l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public S6(C0459e5 c0459e5, C0487f7 c0487f7, O6 o6, C0694n7 c0694n7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6554a = reentrantReadWriteLock.readLock();
        this.f6555b = reentrantReadWriteLock.writeLock();
        this.f6558e = new Object();
        this.f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f6561i = atomicLong;
        this.f6562j = new ArrayList();
        this.f6556c = c0487f7;
        this.f6559g = c0459e5.getContext();
        this.f6560h = c0459e5;
        this.f6563k = o6;
        this.f6564l = c0694n7;
        atomicLong.set(c());
        R6 r6 = new R6(this, c0459e5);
        this.f6557d = r6;
        r6.setName(a(c0459e5));
    }

    public final long a(Set set) {
        this.f6554a.lock();
        Cursor cursor = null;
        long j3 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f6556c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i3 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i3++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j3 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0711no.a(cursor);
        this.f6554a.unlock();
        return j3;
    }

    public final long b() {
        this.f6554a.lock();
        try {
            return this.f6561i.get();
        } finally {
            this.f6554a.unlock();
        }
    }

    public final long c() {
        long j3;
        SQLiteDatabase readableDatabase;
        this.f6554a.lock();
        try {
            readableDatabase = this.f6556c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j3 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f6554a.unlock();
            return j3;
        }
        j3 = 0;
        this.f6554a.unlock();
        return j3;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursor2;
        this.f6554a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f6556c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f6554a.unlock();
                    AbstractC0711no.a(cursor2);
                    AbstractC0711no.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f6554a.unlock();
        AbstractC0711no.a(cursor2);
        AbstractC0711no.a(cursor3);
    }

    public final void e() {
        this.f6557d.start();
    }

    public final void a(X8 x8) {
        this.f6562j.add(x8);
    }

    public static String a(La la) {
        return "DatabaseWorker [" + la.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j3, EnumC0372al enumC0372al, long j4) {
        JSONObject jSONObject;
        boolean b3;
        B7 b7 = new B7(null, 1, 0 == true ? 1 : 0);
        C0756ph c0756ph = (C0756ph) this.f6560h.f7202k.a();
        Long valueOf = Long.valueOf(j3);
        Long valueOf2 = Long.valueOf(j4);
        try {
            jSONObject = new JSONObject().put("dId", c0756ph.getDeviceId()).put("uId", c0756ph.getUuid()).put("appVer", c0756ph.getAppVersion()).put("appBuild", c0756ph.getAppBuildNumber()).put("kitBuildType", c0756ph.getAnalyticsSdkBuildType()).put("osVer", c0756ph.getOsVersion()).put("osApiLev", c0756ph.getOsApiLevel()).put("lang", c0756ph.getLocale()).put("root", c0756ph.getDeviceRootStatus()).put("app_debuggable", ((U5) c0756ph).f6714a).put(CommonUrlParts.APP_FRAMEWORK, c0756ph.getAppFramework()).put("attribution_id", c0756ph.f8084r).put("analyticsSdkVersionName", c0756ph.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0756ph.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Kn.a());
        C0423ck c0423ck = AbstractC0397bk.f7063a;
        synchronized (c0423ck) {
            b3 = c0423ck.f7118b.b(true);
        }
        ContentValues fromModel = b7.fromModel(new A7(valueOf, enumC0372al, jSONObject2, new C1003z7(valueOf2, valueOf3, Boolean.valueOf(b3))));
        if (fromModel == null) {
            return;
        }
        this.f6555b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f6556c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f6555b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f6558e) {
            this.f.add(contentValues);
        }
        synchronized (this.f6557d) {
            this.f6557d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f6555b.lock();
            if (this.f6561i.get() > ((C0756ph) this.f6560h.f7202k.a()).f8088v && (writableDatabase = this.f6556c.getWritableDatabase()) != null) {
                int a3 = a(writableDatabase);
                this.f6561i.addAndGet(-a3);
                if (a3 != 0) {
                    Iterator it = this.f6562j.iterator();
                    while (it.hasNext()) {
                        ((X8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f6555b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f6563k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", D9.f5841i), TextUtils.join(", ", D9.f5842j), 10), 2, this.f6560h.f7194b.f6823b, true).f6277b;
        } catch (Throwable th) {
            Vj vj = AbstractC0861tj.f8372a;
            vj.getClass();
            vj.a(new C0887uj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j3, int i3, int i4, boolean z3) {
        if (i4 <= 0) {
            return;
        }
        this.f6555b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j3), "session_type", Integer.toString(i3), "id", "events", Integer.toString(i4 - 1));
            SQLiteDatabase writableDatabase = this.f6556c.getWritableDatabase();
            if (writableDatabase != null) {
                M6 a3 = this.f6563k.a(writableDatabase, format, 1, this.f6560h.f7194b.f6823b, z3);
                if (a3.f6276a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a3.f6276a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f6562j.iterator();
                    while (it2.hasNext()) {
                        ((X8) it2.next()).b(arrayList);
                    }
                }
                List list = a3.f6276a;
                if (list != null) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        a((ContentValues) list.get(i5), "Event removed from db");
                    }
                }
                this.f6561i.addAndGet(-a3.f6277b);
            }
        } catch (Throwable unused) {
        }
        this.f6555b.unlock();
    }

    public final ContentValues a(long j3, EnumC0372al enumC0372al) {
        ContentValues contentValues = new ContentValues();
        this.f6554a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f6556c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j3 + " AND type = " + enumC0372al.f7002a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0711no.a(cursor);
        this.f6554a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (D9.f5837d.contains(EnumC0569ib.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0668m7 model = new C0694n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f6560h.f7204m;
            EnumC0569ib enumC0569ib = model.f7845d;
            C0642l7 c0642l7 = model.f7847g;
            publicLogger.info(Vf.a(str, enumC0569ib, c0642l7.f7739b, c0642l7.f7740c), new Object[0]);
        }
    }

    public static boolean a(S6 s6) {
        boolean isEmpty;
        synchronized (s6.f6558e) {
            isEmpty = s6.f.isEmpty();
        }
        return isEmpty;
    }
}
