package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class K6 extends io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f4535a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.L6 f4536b;

    public K6(io.appmetrica.analytics.impl.L6 l6, io.appmetrica.analytics.impl.X4 x4) {
        this.f4536b = l6;
        this.f4535a = x4;
    }

    public final synchronized void a(java.util.ArrayList arrayList) {
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                android.content.ContentValues contentValues = (android.content.ContentValues) it.next();
                this.f4536b.getClass();
                java.lang.Integer asInteger = contentValues.getAsInteger("type");
                asInteger.intValue();
                arrayList2.add(asInteger);
            }
            java.util.Iterator it2 = this.f4536b.f4591j.iterator();
            while (it2.hasNext()) {
                ((io.appmetrica.analytics.impl.S8) it2.next()).a(arrayList2);
            }
            ((io.appmetrica.analytics.impl.C0477k5) this.f4535a.f5270p).e();
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        int i2;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (io.appmetrica.analytics.impl.L6.a(this.f4536b)) {
                            wait();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            } catch (java.lang.Throwable unused) {
                stopRunning();
            }
            synchronized (this.f4536b.f4586e) {
                arrayList = new java.util.ArrayList(this.f4536b.f4587f);
                this.f4536b.f4587f.clear();
            }
            io.appmetrica.analytics.impl.L6 l6 = this.f4536b;
            l6.getClass();
            if (!arrayList.isEmpty()) {
                long j2 = ((io.appmetrica.analytics.impl.C0489kh) l6.f4589h.f5265k.a()).f6301v;
                l6.f4583b.lock();
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    android.database.sqlite.SQLiteDatabase writableDatabase = l6.f4584c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                android.content.ContentValues contentValues = (android.content.ContentValues) it.next();
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                l6.f4590i.incrementAndGet();
                                l6.a(contentValues, "Event saved to db");
                            }
                            if (l6.f4590i.get() > j2) {
                                i2 = l6.a(writableDatabase);
                                l6.f4590i.addAndGet(-i2);
                            } else {
                                i2 = 0;
                            }
                            writableDatabase.setTransactionSuccessful();
                            if (i2 != 0) {
                                java.util.Iterator it2 = l6.f4591j.iterator();
                                while (it2.hasNext()) {
                                    ((io.appmetrica.analytics.impl.S8) it2.next()).a();
                                }
                            }
                        } catch (java.lang.Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            l6.f4583b.unlock();
                            a(arrayList);
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                } catch (java.lang.Throwable unused4) {
                }
                l6.f4583b.unlock();
            }
            a(arrayList);
        }
    }
}
