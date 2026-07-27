package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.util.Pair;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public final h9 f4370a;

    /* renamed from: b, reason: collision with root package name */
    public final k8 f4371b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f4372c;

    /* renamed from: d, reason: collision with root package name */
    public final b4 f4373d;

    /* renamed from: e, reason: collision with root package name */
    public final ib f4374e;
    public final x9 f;

    /* renamed from: g, reason: collision with root package name */
    public final c4 f4375g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f4376h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f4377i = new AtomicLong();

    /* renamed from: j, reason: collision with root package name */
    public final k9 f4378j = new k9(this);

    /* renamed from: k, reason: collision with root package name */
    public final l9 f4379k = new l9(this);

    /* renamed from: l, reason: collision with root package name */
    public final m9 f4380l = new m9(this);

    /* renamed from: m, reason: collision with root package name */
    public final n9 f4381m = new n9(this);

    /* renamed from: n, reason: collision with root package name */
    public final s9 f4382n = new s9(this);

    public t9(h9 h9Var, k8 k8Var, ThreadPoolExecutor threadPoolExecutor, b4 b4Var, ib ibVar, x9 x9Var, c4 c4Var) {
        this.f4370a = h9Var;
        this.f4371b = k8Var;
        this.f4372c = threadPoolExecutor;
        this.f4373d = b4Var;
        this.f4374e = ibVar;
        this.f = x9Var;
        this.f4375g = c4Var;
    }

    public final void a() {
        if (this.f4377i.compareAndSet(0L, SystemClock.uptimeMillis())) {
            h9 h9Var = this.f4370a;
            m9 m9Var = this.f4380l;
            synchronized (h9Var) {
                h9Var.f3829c.add(m9Var);
            }
            ((f6) this.f4374e.a()).a(this.f4378j);
            ((f6) this.f4374e.a()).a();
            k8 k8Var = this.f4371b;
            k8Var.f3952a.post(new r9(this));
        }
    }

    public final void b(d9 d9Var) {
        g9 a3 = a(d9Var.f3571a);
        long uptimeMillis = (this.f4377i.get() + a3.f) - SystemClock.uptimeMillis();
        if (uptimeMillis > 0) {
            a(uptimeMillis);
            return;
        }
        h9 h9Var = this.f4370a;
        long currentTimeMillis = System.currentTimeMillis();
        h9Var.getClass();
        long j3 = d9Var.f3572b;
        h9.a(j3, currentTimeMillis);
        SQLiteDatabase a4 = h9Var.a();
        a4.beginTransaction();
        try {
            int a5 = h9.a(a4, j3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("send", Long.valueOf(currentTimeMillis));
            contentValues.put("attempt", Integer.valueOf(a5 + 1));
            a4.update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j3)});
            a4.setTransactionSuccessful();
            a4.endTransaction();
            n9 n9Var = this.f4381m;
            Runnable runnable = (Runnable) this.f.a(d9Var, a3, n9Var);
            if (runnable != null) {
                this.f4372c.execute(runnable);
            } else if (n9Var != null) {
                n9Var.a(d9Var, 0);
            }
        } catch (Throwable th) {
            a4.endTransaction();
            throw th;
        }
    }

    public final g9 a(e9 e9Var) {
        g9 g9Var;
        Map b3;
        AnalyticsCategoryConfig analyticsCategoryConfig;
        synchronized (this.f4376h) {
            try {
                Pair pair = (Pair) this.f4376h.get(e9Var.f3629a);
                g9Var = (pair == null || SystemClock.uptimeMillis() >= ((Long) pair.second).longValue()) ? null : (g9) pair.first;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g9Var != null) {
            return g9Var;
        }
        this.f4375g.getClass();
        AnalyticsConfig h3 = MetaData.E().h();
        if (h3 != null && (b3 = h3.b()) != null && (analyticsCategoryConfig = (AnalyticsCategoryConfig) b3.get(e9Var.f3629a)) != null) {
            g9Var = new g9(e9Var.f3630b, analyticsCategoryConfig);
        }
        if (g9Var == null) {
            g9Var = e9Var.f3630b;
        }
        synchronized (this.f4376h) {
            this.f4376h.put(e9Var.f3629a, new Pair(g9Var, Long.valueOf(SystemClock.uptimeMillis() + 30000)));
        }
        return g9Var;
    }

    public final void b() {
        this.f4371b.f3952a.removeCallbacks(this.f4379k);
        if (!((f6) this.f4374e.a()).b()) {
            this.f4375g.getClass();
            AnalyticsConfig h3 = MetaData.E().h();
            a(h3 != null ? Math.max(300000L, si.f(h3.f())) : 300000L);
        } else {
            int max = Math.max(1, ((Integer) this.f4373d.a()).intValue());
            this.f4375g.getClass();
            AnalyticsConfig h4 = MetaData.E().h();
            try {
                this.f4370a.a(this.f4382n, h4 != null ? Math.max(1, h4.g()) : 1, max);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(d9 d9Var) {
        this.f4375g.getClass();
        AnalyticsConfig h3 = MetaData.E().h();
        if (h3 == null || h3.k()) {
            return;
        }
        g9 a3 = a(d9Var.f3571a);
        if (((Random) si.f4346d.a()).nextDouble() >= a3.f3755a) {
            return;
        }
        if (a3.f3758d) {
            k8 k8Var = this.f4371b;
            k8Var.f3952a.post(new p9(this, d9Var, a3));
        } else if (((f6) this.f4374e.a()).b()) {
            long uptimeMillis = (this.f4377i.get() + a3.f) - SystemClock.uptimeMillis();
            if (uptimeMillis > 0) {
                k8 k8Var2 = this.f4371b;
                k8Var2.f3952a.postDelayed(new q9(this, d9Var, a3), uptimeMillis);
            } else {
                Runnable runnable = (Runnable) this.f.a(d9Var, a3, null);
                if (runnable != null) {
                    this.f4372c.execute(runnable);
                }
            }
        }
    }

    public final void a(long j3) {
        if (j3 < 0) {
            j3 = 0;
        }
        this.f4371b.f3952a.postDelayed(this.f4379k, j3);
    }

    public final void a(d9 d9Var, int i3, long j3) {
        if (i3 == 1) {
            h9 h9Var = this.f4370a;
            h9Var.getClass();
            long j4 = d9Var.f3572b;
            h9.a(j4, j3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("sendSuccess", Long.valueOf(j3));
            h9Var.a().update("events", contentValues, "rowid = ?", new String[]{String.valueOf(j4)});
            a(0L);
            return;
        }
        this.f4375g.getClass();
        AnalyticsConfig h3 = MetaData.E().h();
        int max = h3 != null ? Math.max(1, h3.g()) : 1;
        h9 h9Var2 = this.f4370a;
        h9Var2.getClass();
        long j5 = d9Var.f3572b;
        h9.a(j5, j3);
        SQLiteDatabase a3 = h9Var2.a();
        a3.beginTransaction();
        try {
            if (h9.a(a3, j5) >= max) {
                a3.delete("events", "rowid = ?", new String[]{String.valueOf(j5)});
            } else {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("sendFailure", Long.valueOf(j3));
                a3.update("events", contentValues2, "rowid = ?", new String[]{String.valueOf(j5)});
            }
            a3.setTransactionSuccessful();
            a3.endTransaction();
            this.f4375g.getClass();
            AnalyticsConfig h4 = MetaData.E().h();
            a(h4 != null ? Math.max(1000L, h4.h()) : 1000L);
        } catch (Throwable th) {
            a3.endTransaction();
            throw th;
        }
    }
}
