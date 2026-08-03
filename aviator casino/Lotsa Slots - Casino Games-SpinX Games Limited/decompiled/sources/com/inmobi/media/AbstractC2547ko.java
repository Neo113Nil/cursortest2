package com.inmobi.media;

/* renamed from: com.inmobi.media.ko, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2547ko {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.WeakHashMap f5302a;
    public final android.os.Handler b;
    public final byte c;
    public final com.inmobi.media.InterfaceC2772t9 d;
    public long f;
    public com.inmobi.media.InterfaceC2470ho h;
    public boolean k;
    public final java.util.ArrayList e = new java.util.ArrayList(50);
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(true);
    public final kotlin.Lazy i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ko$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2547ko.a(com.inmobi.media.AbstractC2547ko.this);
        }
    });
    public final kotlin.Lazy j = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ko$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2547ko.b(com.inmobi.media.AbstractC2547ko.this);
        }
    });

    public AbstractC2547ko(java.util.WeakHashMap weakHashMap, android.os.Handler handler, byte b, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        this.f5302a = weakHashMap;
        this.b = handler;
        this.c = b;
        this.d = interfaceC2772t9;
    }

    public static final com.inmobi.media.RunnableC2444go a(com.inmobi.media.AbstractC2547ko abstractC2547ko) {
        return new com.inmobi.media.RunnableC2444go(abstractC2547ko, abstractC2547ko.g);
    }

    public static final java.lang.Runnable b(final com.inmobi.media.AbstractC2547ko abstractC2547ko) {
        return new java.lang.Runnable() { // from class: com.inmobi.media.ko$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.AbstractC2547ko.c(com.inmobi.media.AbstractC2547ko.this);
            }
        };
    }

    public static final void c(com.inmobi.media.AbstractC2547ko abstractC2547ko) {
        abstractC2547ko.b.post((com.inmobi.media.RunnableC2444go) abstractC2547ko.i.getValue());
    }

    public abstract int c();

    public abstract void d();

    public final void e() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "pause " + this);
        }
        ((com.inmobi.media.RunnableC2444go) this.i.getValue()).run();
        this.b.removeCallbacksAndMessages(null);
        this.k = false;
        this.g.set(true);
    }

    public final void f() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "resume " + this);
        }
        this.g.set(false);
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2521jo(this, null), 3, null);
    }

    public final void a(android.view.View rootView, android.view.View view, android.view.View view2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootView, "rootView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        com.inmobi.media.C2495io c2495io = (com.inmobi.media.C2495io) this.f5302a.get(view);
        if (c2495io == null) {
            c2495io = new com.inmobi.media.C2495io();
            this.f5302a.put(view, c2495io);
            this.f++;
        }
        c2495io.f5265a = i;
        long j = this.f;
        c2495io.b = j;
        c2495io.c = rootView;
        long j2 = 50;
        if (j % j2 == 0) {
            long j3 = j - j2;
            for (java.util.Map.Entry entry : this.f5302a.entrySet()) {
                android.view.View view3 = (android.view.View) entry.getKey();
                if (((com.inmobi.media.C2495io) entry.getValue()).b < j3) {
                    this.e.add(view3);
                }
            }
            java.util.Iterator it = this.e.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                a((android.view.View) it.next());
            }
            this.e.clear();
        }
        if (this.f5302a.size() == 1) {
            f();
        }
    }

    public final void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.h = null;
        this.g.set(true);
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((com.inmobi.media.C2495io) this.f5302a.remove(view)) != null) {
            this.f--;
            if (this.f5302a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.d;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("VisibilityTracker", "clear " + this);
        }
        this.f5302a.clear();
        this.b.removeMessages(0);
        this.k = false;
    }
}
