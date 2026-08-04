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
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.Session;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f9328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9329d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7) {
        String str;
        super(context, attributeSet, i7);
        t6.h.e(context, "context");
        this.f9326a = new ArrayList();
        this.f9327b = new ArrayList();
        this.f9329d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p066j0.a.f14550b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
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
        if ((tag instanceof AbstractComponentCallbacksC0701v ? (AbstractComponentCallbacksC0701v) tag : null) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        q0 q0VarG;
        t6.h.e(windowInsets, "insets");
        q0 q0VarG2 = q0.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9328c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            t6.h.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            q0VarG = q0.g(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = P.U.f5037a;
            WindowInsets windowInsetsF = q0VarG2.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsB = P.G.b(this, windowInsetsF);
                if (!windowInsetsB.equals(windowInsetsF)) {
                    q0VarG2 = q0.g(windowInsetsB, this);
                }
            }
            q0VarG = q0VarG2;
        }
        if (!q0VarG.f5101a.j()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                WeakHashMap weakHashMap2 = P.U.f5037a;
                WindowInsets windowInsetsF2 = q0VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = P.G.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        q0.g(windowInsetsA, childAt);
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

    public final <F extends AbstractComponentCallbacksC0701v> F getFragment() {
        A a2;
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v;
        Q supportFragmentManager;
        View view = this;
        while (true) {
            a2 = null;
            if (view == null) {
                abstractComponentCallbacksC0701v = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0701v = tag instanceof AbstractComponentCallbacksC0701v ? (AbstractComponentCallbacksC0701v) tag : null;
            if (abstractComponentCallbacksC0701v != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0701v == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof A) {
                    a2 = (A) context;
                    break;
                }
            }
            if (a2 == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = a2.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0701v.l()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0701v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0701v.g();
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p066j0.a.f14550b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vC = q7.C(id);
        if (classAttribute != null && abstractComponentCallbacksC0701vC == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0486a1.h("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            J jH = q7.H();
            context.getClassLoader();
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vA = jH.a(classAttribute);
            t6.h.d(abstractComponentCallbacksC0701vA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0701vA.f9517N = id;
            abstractComponentCallbacksC0701vA.f9518O = id;
            abstractComponentCallbacksC0701vA.f9519P = string;
            abstractComponentCallbacksC0701vA.f9513J = q7;
            C0705z c0705z = q7.f9403v;
            abstractComponentCallbacksC0701vA.f9514K = c0705z;
            abstractComponentCallbacksC0701vA.f9524U = true;
            if ((c0705z == null ? null : c0705z.f9551a) != null) {
                abstractComponentCallbacksC0701vA.f9524U = true;
            }
            C0681a c0681a = new C0681a(q7);
            c0681a.f9444o = true;
            abstractComponentCallbacksC0701vA.f9525V = this;
            c0681a.e(getId(), abstractComponentCallbacksC0701vA, string);
            if (!c0681a.f9437g) {
                Q q8 = c0681a.f9445p;
                if (q8.f9403v != null && !q8.f9376I) {
                    q8.z(true);
                    c0681a.a(q8.f9378K, q8.f9379L);
                    q8.f9384b = true;
                    try {
                        q8.T(q8.f9378K, q8.f9379L);
                        q8.d();
                        q8.e0();
                        q8.v();
                        ((HashMap) q8.f9385c.f14681b).values().removeAll(Collections.singleton(null));
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
