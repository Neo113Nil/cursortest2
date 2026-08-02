package androidx.fragment.app;

import P.q0;
import W5.AbstractC0486a1;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import io.sentry.Session;
import j0.AbstractC1299a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9326a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9327b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f9328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        String str;
        t6.h.e(context, "context");
        this.f9326a = new ArrayList();
        this.f9327b = new ArrayList();
        this.f9329d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1299a.f14544b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f9327b.contains(view)) {
            this.f9326a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        t6.h.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0722v ? (AbstractComponentCallbacksC0722v) tag : null) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q0 q0Var;
        t6.h.e(windowInsets, "insets");
        q0 g3 = q0.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9328c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            t6.h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            q0Var = q0.g(onApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = P.U.f5037a;
            WindowInsets f7 = g3.f();
            if (f7 != null) {
                WindowInsets b7 = P.G.b(this, f7);
                if (!b7.equals(f7)) {
                    g3 = q0.g(b7, this);
                }
            }
            q0Var = g3;
        }
        if (!q0Var.f5101a.j()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                WeakHashMap weakHashMap2 = P.U.f5037a;
                WindowInsets f8 = q0Var.f();
                if (f8 != null) {
                    WindowInsets a2 = P.G.a(childAt, f8);
                    if (!a2.equals(f8)) {
                        q0.g(a2, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        t6.h.e(canvas, "canvas");
        if (this.f9329d) {
            Iterator it = this.f9326a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t6.h.e(canvas, "canvas");
        t6.h.e(view, "child");
        if (this.f9329d) {
            ArrayList arrayList = this.f9326a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        t6.h.e(view, "view");
        this.f9327b.remove(view);
        if (this.f9326a.remove(view)) {
            this.f9329d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0722v> F getFragment() {
        A a2;
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v;
        Q supportFragmentManager;
        View view = this;
        while (true) {
            a2 = null;
            if (view == null) {
                abstractComponentCallbacksC0722v = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0722v = tag instanceof AbstractComponentCallbacksC0722v ? (AbstractComponentCallbacksC0722v) tag : null;
            if (abstractComponentCallbacksC0722v != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0722v == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof A) {
                    a2 = (A) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (a2 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = a2.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0722v.l()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0722v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0722v.g();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        t6.h.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                t6.h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        t6.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        t6.h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        t6.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            t6.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            t6.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f9329d = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        t6.h.e(onApplyWindowInsetsListener, "listener");
        this.f9328c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        t6.h.e(view, "view");
        if (view.getParent() == this) {
            this.f9327b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, Q q7) {
        super(context, attributeSet);
        t6.h.e(context, "context");
        t6.h.e(attributeSet, Session.JsonKeys.ATTRS);
        t6.h.e(q7, "fm");
        this.f9326a = new ArrayList();
        this.f9327b = new ArrayList();
        this.f9329d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1299a.f14544b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0722v C3 = q7.C(id);
        if (classAttribute != null && C3 == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0486a1.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            J H7 = q7.H();
            context.getClassLoader();
            AbstractComponentCallbacksC0722v a2 = H7.a(classAttribute);
            t6.h.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f9517N = id;
            a2.f9518O = id;
            a2.f9519P = string;
            a2.f9513J = q7;
            C0726z c0726z = q7.f9403v;
            a2.f9514K = c0726z;
            a2.f9524U = true;
            if ((c0726z == null ? null : c0726z.f9551a) != null) {
                a2.f9524U = true;
            }
            C0702a c0702a = new C0702a(q7);
            c0702a.f9444o = true;
            a2.f9525V = this;
            c0702a.e(getId(), a2, string);
            if (!c0702a.f9437g) {
                Q q8 = c0702a.f9445p;
                if (q8.f9403v != null && !q8.f9376I) {
                    q8.z(true);
                    c0702a.a(q8.f9378K, q8.f9379L);
                    q8.f9384b = true;
                    try {
                        q8.T(q8.f9378K, q8.f9379L);
                        q8.d();
                        q8.e0();
                        q8.v();
                        ((HashMap) q8.f9385c.f14675b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        q8.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = q7.f9385c.t().iterator();
        while (it.hasNext()) {
            int i7 = ((V) it.next()).f9416c.f9518O;
            getId();
        }
    }
}
