package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class R6 extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f6495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f6496b;

    public R6(S6 s6, C0459e5 c0459e5) {
        this.f6496b = s6;
        this.f6495a = c0459e5;
    }

    public final synchronized void a(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                this.f6496b.getClass();
                Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            Iterator it2 = this.f6496b.f6562j.iterator();
            while (it2.hasNext()) {
                ((X8) it2.next()).a(arrayList2);
            }
            ((C0795r5) this.f6495a.f7207p).e();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (S6.a(this.f6496b)) {
                            wait();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f6496b.f6558e) {
                arrayList = new ArrayList(this.f6496b.f);
                this.f6496b.f.clear();
            }
            S6 s6 = this.f6496b;
            s6.getClass();
            if (!arrayList.isEmpty()) {
                s6.f6555b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = s6.f6556c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ContentValues contentValues = (ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                s6.f6561i.incrementAndGet();
                                s6.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            s6.f6561i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            s6.f6555b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                s6.f6555b.unlock();
            }
            a(arrayList);
        }
    }
}
