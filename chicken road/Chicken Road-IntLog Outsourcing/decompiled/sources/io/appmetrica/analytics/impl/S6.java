package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
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
    public final ReentrantReadWriteLock.ReadLock f7420a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f7421b;

    /* renamed from: c, reason: collision with root package name */
    public final C0636f7 f7422c;

    /* renamed from: d, reason: collision with root package name */
    public final R6 f7423d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7424e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7425f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7426g;

    /* renamed from: h, reason: collision with root package name */
    public final C0608e5 f7427h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f7428i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f7429j;

    /* renamed from: k, reason: collision with root package name */
    public final O6 f7430k;

    /* renamed from: l, reason: collision with root package name */
    public final C0843n7 f7431l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public S6(C0608e5 c0608e5, C0636f7 c0636f7, O6 o6, C0843n7 c0843n7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f7420a = reentrantReadWriteLock.readLock();
        this.f7421b = reentrantReadWriteLock.writeLock();
        this.f7424e = new Object();
        this.f7425f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f7428i = atomicLong;
        this.f7429j = new ArrayList();
        this.f7422c = c0636f7;
        this.f7426g = c0608e5.getContext();
        this.f7427h = c0608e5;
        this.f7430k = o6;
        this.f7431l = c0843n7;
        atomicLong.set(c());
        R6 r6 = new R6(this, c0608e5);
        this.f7423d = r6;
        r6.setName(a(c0608e5));
    }

    public final long a(Set set) {
        this.f7420a.lock();
        Cursor cursor = null;
        long j2 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f7422c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
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
        } catch (Throwable unused) {
        }
        AbstractC0860no.a(cursor);
        this.f7420a.unlock();
        return j2;
    }

    public final long b() {
        this.f7420a.lock();
        try {
            return this.f7428i.get();
        } finally {
            this.f7420a.unlock();
        }
    }

    public final long c() {
        long j2;
        SQLiteDatabase readableDatabase;
        this.f7420a.lock();
        try {
            readableDatabase = this.f7422c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j2 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f7420a.unlock();
            return j2;
        }
        j2 = 0;
        this.f7420a.unlock();
        return j2;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursor2;
        this.f7420a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f7422c.getReadableDatabase();
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
                    this.f7420a.unlock();
                    AbstractC0860no.a(cursor2);
                    AbstractC0860no.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f7420a.unlock();
        AbstractC0860no.a(cursor2);
        AbstractC0860no.a(cursor3);
    }

    public final void e() {
        this.f7423d.start();
    }

    public final void a(X8 x8) {
        this.f7429j.add(x8);
    }

    public static String a(La la) {
        return "DatabaseWorker [" + la.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j2, EnumC0521al enumC0521al, long j6) {
        JSONObject jSONObject;
        boolean b6;
        B7 b7 = new B7(null, 1, 0 == true ? 1 : 0);
        C0905ph c0905ph = (C0905ph) this.f7427h.f8095k.a();
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(j6);
        try {
            jSONObject = new JSONObject().put("dId", c0905ph.getDeviceId()).put("uId", c0905ph.getUuid()).put("appVer", c0905ph.getAppVersion()).put("appBuild", c0905ph.getAppBuildNumber()).put("kitBuildType", c0905ph.getAnalyticsSdkBuildType()).put("osVer", c0905ph.getOsVersion()).put("osApiLev", c0905ph.getOsApiLevel()).put("lang", c0905ph.getLocale()).put("root", c0905ph.getDeviceRootStatus()).put("app_debuggable", ((U5) c0905ph).f7587a).put(CommonUrlParts.APP_FRAMEWORK, c0905ph.getAppFramework()).put("attribution_id", c0905ph.f9021r).put("analyticsSdkVersionName", c0905ph.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0905ph.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Kn.a());
        C0572ck c0572ck = AbstractC0546bk.f7949a;
        synchronized (c0572ck) {
            b6 = c0572ck.f8006b.b(true);
        }
        ContentValues fromModel = b7.fromModel(new A7(valueOf, enumC0521al, jSONObject2, new C1152z7(valueOf2, valueOf3, Boolean.valueOf(b6))));
        if (fromModel == null) {
            return;
        }
        this.f7421b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f7422c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f7421b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f7424e) {
            this.f7425f.add(contentValues);
        }
        synchronized (this.f7423d) {
            this.f7423d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f7421b.lock();
            if (this.f7428i.get() > ((C0905ph) this.f7427h.f8095k.a()).f9025v && (writableDatabase = this.f7422c.getWritableDatabase()) != null) {
                int a6 = a(writableDatabase);
                this.f7428i.addAndGet(-a6);
                if (a6 != 0) {
                    Iterator it = this.f7429j.iterator();
                    while (it.hasNext()) {
                        ((X8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f7421b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f7430k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", D9.f6678i), TextUtils.join(", ", D9.f6679j), 10), 2, this.f7427h.f8086b.f7698b, true).f7133b;
        } catch (Throwable th) {
            Vj vj = AbstractC1010tj.f9323a;
            vj.getClass();
            vj.a(new C1036uj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j2, int i2, int i3, boolean z) {
        if (i3 <= 0) {
            return;
        }
        this.f7421b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j2), "session_type", Integer.toString(i2), OutcomeConstants.OUTCOME_ID, "events", Integer.toString(i3 - 1));
            SQLiteDatabase writableDatabase = this.f7422c.getWritableDatabase();
            if (writableDatabase != null) {
                M6 a6 = this.f7430k.a(writableDatabase, format, 1, this.f7427h.f8086b.f7698b, z);
                if (a6.f7132a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a6.f7132a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger(WebViewManager.EVENT_TYPE_KEY);
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f7429j.iterator();
                    while (it2.hasNext()) {
                        ((X8) it2.next()).b(arrayList);
                    }
                }
                List list = a6.f7132a;
                if (list != null) {
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        a((ContentValues) list.get(i6), "Event removed from db");
                    }
                }
                this.f7428i.addAndGet(-a6.f7133b);
            }
        } catch (Throwable unused) {
        }
        this.f7421b.unlock();
    }

    public final ContentValues a(long j2, EnumC0521al enumC0521al) {
        ContentValues contentValues = new ContentValues();
        this.f7420a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f7422c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j2 + " AND type = " + enumC0521al.f7885a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0860no.a(cursor);
        this.f7420a.unlock();
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
        Integer asInteger = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        if (D9.f6673d.contains(EnumC0718ib.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0817m7 model = new C0843n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f7427h.f8097m;
            EnumC0718ib enumC0718ib = model.f8770d;
            C0791l7 c0791l7 = model.f8773g;
            publicLogger.info(Vf.a(str, enumC0718ib, c0791l7.f8660b, c0791l7.f8661c), new Object[0]);
        }
    }

    public static boolean a(S6 s6) {
        boolean isEmpty;
        synchronized (s6.f7424e) {
            isEmpty = s6.f7425f.isEmpty();
        }
        return isEmpty;
    }
}
