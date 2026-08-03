package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f4985a;
    public final java.util.Set b;
    public final long c;
    public final com.inmobi.media.N d;
    public final com.inmobi.media.InterfaceC2772t9 e;
    public final android.content.Context f;
    public com.inmobi.media.L g;
    public com.inmobi.media.I6 h;
    public final kotlinx.coroutines.CoroutineScope i;
    public final java.util.concurrent.atomic.AtomicBoolean j;
    public kotlinx.coroutines.Job k;
    public com.inmobi.media.Oo l;
    public final com.inmobi.media.O m;
    public volatile boolean n;
    public final com.inmobi.media.T o;

    public U(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adView, java.util.Set friendlyViews, long j, com.inmobi.media.N listener, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.f4985a = adView;
        this.b = friendlyViews;
        this.c = j;
        this.d = listener;
        this.e = interfaceC2772t9;
        this.f = adView.getContext();
        this.i = com.inmobi.media.H9.d;
        this.j = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.m = new com.inmobi.media.O(this);
        this.o = new com.inmobi.media.T(this);
    }

    public static final com.inmobi.media.M a(com.inmobi.media.U u) {
        kotlin.Pair pair;
        android.graphics.RectF rectF;
        android.graphics.RectF rectF2;
        android.graphics.RectF rectF3;
        android.graphics.RectF rectF4;
        u.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        if (u.f4985a.getRootView() == null || u.f4985a.getVisibility() != 0 || !u.f4985a.hasWindowFocus() || !u.n || !u.f4985a.getGlobalVisibleRect(rect)) {
            return null;
        }
        android.content.Context context = u.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new kotlin.Pair(java.lang.Integer.valueOf(displayMetrics.widthPixels), java.lang.Integer.valueOf(displayMetrics.heightPixels));
        } catch (java.lang.Exception unused) {
            pair = new kotlin.Pair(0, 0);
        }
        int intValue = ((java.lang.Number) pair.component1()).intValue();
        int intValue2 = ((java.lang.Number) pair.component2()).intValue();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        if (!u.f4985a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View rootView = u.f4985a.getRootView();
        java.util.Set set = u.b;
        if (rootView instanceof android.view.ViewGroup) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.push(rootView);
            boolean z = false;
            while (!arrayDeque.isEmpty()) {
                android.view.View view = (android.view.View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(view, u.f4985a)) {
                        z = true;
                    } else if (!set.contains(view)) {
                        android.graphics.Rect rect3 = new android.graphics.Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            android.graphics.Rect rect4 = new android.graphics.Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(view, u.f4985a) || (globalVisibleRect && rect4.intersect(rect))) {
                                com.inmobi.media.B5.f4614a.getClass();
                                boolean z2 = !com.inmobi.media.B5.y() || view.getZ() >= u.f4985a.getZ();
                                if (z && z2) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof android.view.ViewGroup) {
                                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            com.inmobi.media.L l = u.g;
            if (l != null && (rectF4 = l.b) != null) {
                a(rect, arrayList2, rectF4);
            }
            com.inmobi.media.L l2 = u.g;
            if (l2 != null && (rectF3 = l2.b) != null) {
                a(rect, arrayList2, rectF3);
            }
            com.inmobi.media.L l3 = u.g;
            if (l3 != null && (rectF2 = l3.c) != null) {
                a(rect, arrayList2, rectF2);
            }
            com.inmobi.media.L l4 = u.g;
            if (l4 != null && (rectF = l4.d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new android.graphics.RectF((android.graphics.Rect) arrayList2.get(0)));
            } else {
                android.graphics.Region region = new android.graphics.Region();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((android.graphics.Rect) it.next(), android.graphics.Region.Op.UNION);
                }
                android.graphics.RegionIterator regionIterator = new android.graphics.RegionIterator(region);
                android.graphics.Rect rect5 = new android.graphics.Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new android.graphics.RectF(rect5));
                }
            }
        }
        return new com.inmobi.media.M(new android.graphics.RectF(rect2), arrayList, intValue, intValue2);
    }

    public static final kotlin.Unit b(com.inmobi.media.U u) {
        u.getClass();
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.u()) {
            u.l = new com.inmobi.media.Oo(u.f4985a, u.o, u.e);
        } else {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = u.e;
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u.k = com.inmobi.media.J3.a(u.i, 0L, u.c, new com.inmobi.media.S(u, null));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit c(com.inmobi.media.U u) {
        kotlinx.coroutines.Job job = u.k;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        com.inmobi.media.Oo oo = u.l;
        if (oo != null) {
            oo.a();
        }
        u.l = null;
        u.k = null;
        com.inmobi.media.I6 i6 = new com.inmobi.media.I6(0.0f, null, null);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(i6, u.h)) {
            ((com.inmobi.media.C2333ci) u.d).a(i6);
            u.h = i6;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void b(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.b.remove(view);
    }

    public final void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        if (this.j.compareAndSet(true, false)) {
            java.lang.Object a2 = com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.U$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.U.c(com.inmobi.media.U.this);
                }
            });
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
            if (m10801exceptionOrNullimpl != null && (interfaceC2772t9 = this.e) != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdExposureTracker", "Error stopping exposure tracking - " + m10801exceptionOrNullimpl.getMessage());
            }
            kotlin.Result.m10797boximpl(a2);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.e;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.j.compareAndSet(false, true)) {
            java.lang.Object a2 = com.inmobi.media.L3.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.U$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.U.b(com.inmobi.media.U.this);
                }
            });
            java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(a2);
            if (m10801exceptionOrNullimpl != null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdExposureTracker", "Error starting exposure tracking - " + m10801exceptionOrNullimpl.getMessage());
                }
                this.j.set(false);
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.W9.a(new com.inmobi.media.M2(m10801exceptionOrNullimpl));
            }
            kotlin.Result.m10797boximpl(a2);
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.e;
        if (interfaceC2772t92 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t92).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.b.add(view);
    }

    public final void a(java.lang.Throwable th) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.e;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("AdExposureTracker", "Error calculating exposure metrics - " + th.getMessage());
        }
    }

    public static final void a(android.graphics.Rect rect, java.util.ArrayList arrayList, android.graphics.RectF rectF) {
        if (rectF.intersect(new android.graphics.RectF(rect))) {
            arrayList.add(new android.graphics.Rect(com.inmobi.media.J3.b(rectF.left), com.inmobi.media.J3.b(rectF.top), com.inmobi.media.J3.b(rectF.right), com.inmobi.media.J3.b(rectF.bottom)));
        }
    }
}
