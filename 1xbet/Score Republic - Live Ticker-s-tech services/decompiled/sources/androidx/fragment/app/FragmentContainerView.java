package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import live.football.scorerepublic.R;
import p000.AbstractActivityC0790v4;
import p000.AbstractC0024an;
import p000.C0042ay;
import p000.C0270h1;
import p000.C0722ta;
import p000.ai1;
import p000.ak1;
import p000.b60;
import p000.c50;
import p000.e50;
import p000.kz0;
import p000.n50;
import p000.t50;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public final ArrayList f531j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f532k;

    /* JADX INFO: renamed from: l */
    public View.OnApplyWindowInsetsListener f533l;

    /* JADX INFO: renamed from: m */
    public boolean f534m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, t50 t50Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f531j = new ArrayList();
        this.f532k = new ArrayList();
        this.f534m = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kz0.f4612b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        c50 c50VarM4698C = t50Var.m4698C(id);
        if (classAttribute != null && c50VarM4698C == null) {
            if (id == -1) {
                C0270h1.m2191g(AbstractC0024an.m284g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            n50 n50VarM4701G = t50Var.m4701G();
            context.getClassLoader();
            c50 c50VarM3484a = n50VarM4701G.m3484a(classAttribute);
            c50VarM3484a.getClass();
            c50VarM3484a.f1103G = id;
            c50VarM3484a.f1104H = id;
            c50VarM3484a.f1105I = string;
            c50VarM3484a.f1099C = t50Var;
            e50 e50Var = t50Var.f7319w;
            c50VarM3484a.f1100D = e50Var;
            c50VarM3484a.f1110N = true;
            if ((e50Var == null ? null : e50Var.f1951n) != null) {
                c50VarM3484a.f1110N = true;
            }
            C0722ta c0722ta = new C0722ta(t50Var);
            c0722ta.f7388o = true;
            c50VarM3484a.f1111O = this;
            c50VarM3484a.f1142y = true;
            c0722ta.m4778f(getId(), c50VarM3484a, string);
            if (c0722ta.f7380g) {
                C0270h1.m2191g("This transaction is already being added to the back stack");
                throw null;
            }
            t50 t50Var2 = c0722ta.f7390q;
            if (t50Var2.f7319w != null && !t50Var2.f7290J) {
                t50Var2.m4746z(true);
                C0722ta c0722ta2 = t50Var2.f7304h;
                if (c0722ta2 != null) {
                    c0722ta2.f7391r = false;
                    c0722ta2.m4776d();
                    if (t50.m4691J(3)) {
                        Log.d("FragmentManager", "Reversing mTransitioningOp " + t50Var2.f7304h + " as part of execSingleAction for action " + c0722ta);
                    }
                    t50Var2.f7304h.m4777e(false, false);
                    t50Var2.f7304h.mo4037a(t50Var2.f7292L, t50Var2.f7293M);
                    ArrayList arrayList = t50Var2.f7304h.f7374a;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        c50 c50Var = ((b60) obj).f734b;
                        if (c50Var != null) {
                            c50Var.f1139v = false;
                        }
                    }
                    t50Var2.f7304h = null;
                }
                c0722ta.mo4037a(t50Var2.f7292L, t50Var2.f7293M);
                t50Var2.f7298b = true;
                try {
                    t50Var2.m4710T(t50Var2.f7292L, t50Var2.f7293M);
                    t50Var2.m4722d();
                    t50Var2.m4725e0();
                    t50Var2.m4742v();
                    ((HashMap) t50Var2.f7299c.f2335l).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    t50Var2.m4722d();
                    throw th;
                }
            }
        }
        ArrayList arrayListM1665k = t50Var.f7299c.m1665k();
        int size2 = arrayListM1665k.size();
        while (i < size2) {
            Object obj2 = arrayListM1665k.get(i);
            i++;
            C0028a c0028a = (C0028a) obj2;
            c50 c50Var2 = c0028a.f537c;
            if (c50Var2.f1104H == getId() && (view = c50Var2.f1112P) != null && view.getParent() == null) {
                c50Var2.f1111O = this;
                c0028a.m418b();
                c0028a.m427k();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m416a(View view) {
        if (this.f532k.contains(view)) {
            this.f531j.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof c50 ? (c50) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        ak1 ak1VarM270b;
        windowInsets.getClass();
        ak1 ak1VarM270b2 = ak1.m270b(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f533l;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            ak1VarM270b = ak1.m270b(windowInsetsOnApplyWindowInsets, null);
        } else {
            WeakHashMap weakHashMap = ai1.f194a;
            WindowInsets windowInsetsM271a = ak1VarM270b2.m271a();
            if (windowInsetsM271a != null && !windowInsetsM271a.equals(windowInsetsM271a)) {
                ak1VarM270b2 = ak1.m270b(windowInsetsM271a, this);
            }
            ak1VarM270b = ak1VarM270b2;
        }
        if (!ak1VarM270b.f229a.mo4104p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ai1.m249b(getChildAt(i), ak1VarM270b);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f534m) {
            ArrayList arrayList = this.f531j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.f534m) {
            ArrayList arrayList = this.f531j;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f532k.remove(view);
        if (this.f531j.remove(view)) {
            this.f534m = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends c50> F getFragment() {
        c50 c50Var;
        AbstractActivityC0790v4 abstractActivityC0790v4;
        t50 t50VarM866h;
        View view = this;
        while (true) {
            if (view == null) {
                c50Var = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            c50Var = tag instanceof c50 ? (c50) tag : null;
            if (c50Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (c50Var == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC0790v4 = null;
                    break;
                }
                if (context instanceof AbstractActivityC0790v4) {
                    abstractActivityC0790v4 = (AbstractActivityC0790v4) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0790v4 == null) {
                C0042ay.m526c(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
            t50VarM866h = ((e50) abstractActivityC0790v4.f8056D.f793k).f1954q;
        } else {
            if (c50Var.f1100D == null || !c50Var.f1137t) {
                throw new IllegalStateException("The Fragment " + c50Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            t50VarM866h = c50Var.m866h();
        }
        return (F) t50VarM866h.m4698C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
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
                childAt.getClass();
                m416a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        m416a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        m416a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        m416a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m416a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            m416a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f534m = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f533l = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f532k.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.f531j = new ArrayList();
        this.f532k = new ArrayList();
        this.f534m = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kz0.f4612b, 0, 0);
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
}
