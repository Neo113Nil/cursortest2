package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f11895a;
    public final Handler b;
    public final Rect c;
    public final ViewTreeObserver.OnPreDrawListener d;
    public WeakReference e;
    public final b1 f;
    public boolean g;
    public boolean h;

    public c1(Context context, WeakHashMap trackedViews, Handler visibilityHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackedViews, "trackedViews");
        Intrinsics.checkNotNullParameter(visibilityHandler, "visibilityHandler");
        this.f11895a = trackedViews;
        this.b = visibilityHandler;
        this.c = new Rect();
        this.f = new b1(this);
        this.d = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.c1$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return c1.a(c1.this);
            }
        };
        this.e = new WeakReference(null);
        this.h = a(context, (View) null);
    }

    public static final boolean a(c1 c1Var, View view, int i) {
        c1Var.getClass();
        if (view == null || view.getVisibility() != 0 || view.getParent() == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getVisibility() != 0) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("ImpressionTracker", "Parent visibility is not visible: " + parent);
                return false;
            }
            parent = viewGroup.getParent();
        }
        if (!view.getGlobalVisibleRect(c1Var.c)) {
            return false;
        }
        long height = view.getHeight() * view.getWidth();
        return height > 0 && ((long) 100) * (c1Var.c.height() * c1Var.c.width()) >= ((long) i) * height;
    }

    public static final void d(c1 c1Var) {
        if (c1Var.g) {
            return;
        }
        c1Var.g = true;
        c1Var.b.postDelayed(c1Var.f, 100L);
    }

    public final boolean a(Context context, View view) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View view2 = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view2 = decorView.findViewById(R.id.content);
        }
        if (view2 == null && view != null) {
            if (!ViewCompat.isAttachedToWindow(view)) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                Intrinsics.checkNotNullExpressionValue("c1", "TAG");
                com.vungle.ads.internal.util.t.c("c1", "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                view2 = rootView.findViewById(R.id.content);
            }
            if (view2 == null) {
                view2 = rootView;
            }
        }
        if (view2 == null) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            Intrinsics.checkNotNullExpressionValue("c1", "TAG");
            com.vungle.ads.internal.util.t.a("c1", "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            boolean z3 = com.vungle.ads.internal.util.u.f12190a;
            Intrinsics.checkNotNullExpressionValue("c1", "TAG");
            com.vungle.ads.internal.util.t.a("c1", "The root view tree observer was not alive");
            return false;
        }
        this.e = new WeakReference(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.d);
        return true;
    }

    public final void a(View view, z0 z0Var) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.h = a(view.getContext(), view);
        a1 a1Var = (a1) this.f11895a.get(view);
        if (a1Var == null) {
            a1Var = new a1();
            this.f11895a.put(view, a1Var);
            if (!this.g) {
                this.g = true;
                this.b.postDelayed(this.f, 100L);
            }
        }
        a1Var.c();
        a1Var.a(z0Var);
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f11895a.remove(view);
    }

    public final void a() {
        this.f11895a.clear();
        this.b.removeMessages(0);
        this.g = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        this.e.clear();
    }

    public static final boolean a(c1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.g) {
            this$0.g = true;
            this$0.b.postDelayed(this$0.f, 100L);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c1(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
