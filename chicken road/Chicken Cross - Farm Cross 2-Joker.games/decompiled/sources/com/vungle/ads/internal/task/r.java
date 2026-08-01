package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class r implements g {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final String h = "r";

    /* renamed from: a, reason: collision with root package name */
    public final d f12141a;
    public final Executor b;
    public final m c;
    public final CopyOnWriteArrayList d;
    public final q e;
    public long f;

    public r(d creator, com.vungle.ads.internal.executor.j executor, h hVar) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f12141a = creator;
        this.b = executor;
        this.c = hVar;
        this.f = Long.MAX_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new q(new WeakReference(this));
    }

    public final synchronized void a(e jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        e a2 = jobInfo.a();
        if (a2 != null) {
            String d = a2.d();
            long b = a2.b();
            a2.g();
            if (a2.f()) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    e a3 = pVar.a();
                    if (Intrinsics.areEqual(a3 != null ? a3.d() : null, d)) {
                        boolean z = u.f12190a;
                        String TAG = h;
                        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                        t.a(TAG, "replacing pending job with new " + d);
                        this.d.remove(pVar);
                    }
                }
            }
            this.d.add(new p(SystemClock.uptimeMillis() + b, a2));
            a();
        }
    }

    public final synchronized void a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        Iterator it = this.d.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            p pVar = (p) it.next();
            long j2 = pVar.f12139a;
            if (uptimeMillis >= j2) {
                this.d.remove(pVar);
                e eVar = pVar.b;
                if (eVar != null) {
                    this.b.execute(new f(eVar, this.f12141a, this, this.c));
                }
            } else {
                j = Math.min(j, j2);
            }
        }
        if (j != Long.MAX_VALUE && j != this.f) {
            Handler handler = g;
            handler.removeCallbacks(this.e);
            handler.postAtTime(this.e, h, j);
        }
        this.f = j;
    }
}
