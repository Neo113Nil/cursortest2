package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.gq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3749gq {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f7131a;
    public final Handler b;
    public final byte c;
    public final Y9 d;
    public long f;
    public InterfaceC3664dq h;
    public boolean j;
    public Job k;
    public final ArrayList e = new ArrayList(50);
    public final AtomicBoolean g = new AtomicBoolean(true);
    public final Lazy i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.gq$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3749gq.a(AbstractC3749gq.this);
        }
    });

    public AbstractC3749gq(WeakHashMap weakHashMap, Handler handler, byte b, Y9 y9) {
        this.f7131a = weakHashMap;
        this.b = handler;
        this.c = b;
        this.d = y9;
    }

    public static final RunnableC3637cq a(AbstractC3749gq abstractC3749gq) {
        return new RunnableC3637cq(abstractC3749gq, abstractC3749gq.g);
    }

    public final void b() {
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.h = null;
        this.g.set(true);
    }

    public abstract int c();

    public abstract void d();

    public final void e() {
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "pause " + this);
        }
        ((RunnableC3637cq) this.i.getValue()).run();
        Job job = this.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = null;
        this.b.removeCallbacksAndMessages(null);
        this.j = false;
        this.g.set(true);
    }

    public final void f() {
        Job launch$default;
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "resume " + this);
        }
        this.g.set(false);
        if (this.j || this.g.get()) {
            return;
        }
        this.j = true;
        launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new C3721fq(new WeakReference(this), null), 3, null);
        this.k = launch$default;
    }

    public final void a(View rootView, View view, View view2, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        C3693eq c3693eq = (C3693eq) this.f7131a.get(view);
        if (c3693eq == null) {
            c3693eq = new C3693eq();
            this.f7131a.put(view, c3693eq);
            this.f++;
        }
        c3693eq.f7094a = i;
        long j = this.f;
        c3693eq.b = j;
        c3693eq.c = rootView;
        long j2 = 50;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (Map.Entry entry : this.f7131a.entrySet()) {
                View view3 = (View) entry.getKey();
                if (((C3693eq) entry.getValue()).b < j3) {
                    this.e.add(view3);
                }
            }
            Iterator it = this.e.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.e.clear();
        }
        if (this.f7131a.size() == 1) {
            f();
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((C3693eq) this.f7131a.remove(view)) != null) {
            this.f--;
            if (this.f7131a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        Y9 y9 = this.d;
        if (y9 != null) {
            ((Z9) y9).c("VisibilityTracker", "clear " + this);
        }
        Job job = this.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = null;
        this.f7131a.clear();
        this.b.removeCallbacksAndMessages(null);
        this.j = false;
    }
}
