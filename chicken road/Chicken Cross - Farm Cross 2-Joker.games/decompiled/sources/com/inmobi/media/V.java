package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final Ej f6901a;
    public final Set b;
    public final long c;
    public final O d;
    public final Y9 e;
    public final Context f;
    public M g;
    public C3702f7 h;
    public final CoroutineScope i;
    public final AtomicBoolean j;
    public Job k;
    public Lq l;
    public final P m;
    public volatile boolean n;
    public final U o;

    public V(Ej adView, Set friendlyViews, long j, O listener, Y9 y9) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6901a = adView;
        this.b = friendlyViews;
        this.c = j;
        this.d = listener;
        this.e = y9;
        this.f = adView.getContext();
        this.i = AbstractC3904ma.e;
        this.j = new AtomicBoolean(false);
        this.m = new P(this);
        this.o = new U(this);
    }

    public static final N a(V v) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        v.getClass();
        Rect rect = new Rect();
        if (v.f6901a.getRootView() == null || v.f6901a.getVisibility() != 0 || !v.f6901a.hasWindowFocus() || !v.n || !v.f6901a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = v.f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        Rect rect2 = new Rect();
        if (!v.f6901a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = v.f6901a.getRootView();
        Set set = v.b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (Intrinsics.areEqual(view, v.f6901a)) {
                        z = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (Intrinsics.areEqual(view, v.f6901a) || (globalVisibleRect && rect4.intersect(rect))) {
                                Y5.f6965a.getClass();
                                boolean z2 = !Y5.y() || view.getZ() >= v.f6901a.getZ();
                                if (z && z2) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            M m = v.g;
            if (m != null && (rectF4 = m.b) != null) {
                a(rect, arrayList2, rectF4);
            }
            M m2 = v.g;
            if (m2 != null && (rectF3 = m2.b) != null) {
                a(rect, arrayList2, rectF3);
            }
            M m3 = v.g;
            if (m3 != null && (rectF2 = m3.c) != null) {
                a(rect, arrayList2, rectF2);
            }
            M m4 = v.g;
            if (m4 != null && (rectF = m4.d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new N(new RectF(rect2), arrayList, intValue, intValue2);
    }

    public static final Unit b(V v) {
        v.getClass();
        Y5.f6965a.getClass();
        if (Y5.u()) {
            v.l = new Lq(v.f6901a, v.o, v.e);
        } else {
            Y9 y9 = v.e;
            if (y9 != null) {
                ((Z9) y9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        v.k = AbstractC3727g4.a(v.i, 0L, v.c, new T(v, null));
        return Unit.INSTANCE;
    }

    public static final Unit c(V v) {
        Job job = v.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Lq lq = v.l;
        if (lq != null) {
            lq.a();
        }
        v.l = null;
        v.k = null;
        C3702f7 c3702f7 = new C3702f7(0.0f, null, null);
        if (!Intrinsics.areEqual(c3702f7, v.h)) {
            ((C4054rj) v.d).a(c3702f7);
            v.h = c3702f7;
        }
        return Unit.INSTANCE;
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.b.remove(view);
    }

    public final void b() {
        Y9 y9;
        if (this.j.compareAndSet(true, false)) {
            Object a2 = AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.V$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return V.c(V.this);
                }
            });
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
            if (m8082exceptionOrNullimpl != null && (y9 = this.e) != null) {
                ((Z9) y9).b("AdExposureTracker", "Error stopping exposure tracking - " + m8082exceptionOrNullimpl.getMessage());
            }
            Result.m8078boximpl(a2);
            return;
        }
        Y9 y92 = this.e;
        if (y92 != null) {
            ((Z9) y92).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.j.compareAndSet(false, true)) {
            Object a2 = AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.V$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return V.b(V.this);
                }
            });
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
            if (m8082exceptionOrNullimpl != null) {
                Y9 y9 = this.e;
                if (y9 != null) {
                    ((Z9) y9).b("AdExposureTracker", "Error starting exposure tracking - " + m8082exceptionOrNullimpl.getMessage());
                }
                this.j.set(false);
                Lazy lazy = Ba.f6473a;
                Ba.a(new C3810j3(m8082exceptionOrNullimpl));
            }
            Result.m8078boximpl(a2);
            return;
        }
        Y9 y92 = this.e;
        if (y92 != null) {
            ((Z9) y92).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.b.add(view);
    }

    public final void a(Throwable th) {
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).b("AdExposureTracker", "Error calculating exposure metrics - " + th.getMessage());
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(AbstractC3727g4.b(rectF.left), AbstractC3727g4.b(rectF.top), AbstractC3727g4.b(rectF.right), AbstractC3727g4.b(rectF.bottom)));
        }
    }
}
