package androidx.fragment.app;

import B0.A0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C5353y0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f42849a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f42850b;

    /* renamed from: c, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f42851c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42852d;

    /* loaded from: classes8.dex */
    public static final class a {
        @NotNull
        public static WindowInsets a(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @NotNull FragmentContainerView v11, @NotNull WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v11, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v11, insets);
            Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42849a = new ArrayList();
        this.f42850b = new ArrayList();
        this.f42852d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = Z2.a.f35341b;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
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

    private final void a(View view) {
        if (this.f42850b.contains(view)) {
            this.f42849a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NotNull View child, int i11, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) tag : null) != null) {
            super.addView(child, i11, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    public final <F extends ComponentCallbacksC5392m> F b() {
        r rVar;
        G supportFragmentManager;
        ComponentCallbacksC5392m i02 = G.i0(this);
        if (i02 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    rVar = null;
                    break;
                }
                if (context instanceof r) {
                    rVar = (r) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (rVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = rVar.getSupportFragmentManager();
        } else {
            if (!i02.isAdded()) {
                throw new IllegalStateException("The Fragment " + i02 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = i02.getChildFragmentManager();
        }
        return (F) supportFragmentManager.f0(getId());
    }

    public final void c(boolean z11) {
        this.f42852d = z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public final WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        C5353y0 u11 = C5353y0.u(null, insets);
        Intrinsics.checkNotNullExpressionValue(u11, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f42851c;
        C5353y0 u12 = onApplyWindowInsetsListener != null ? C5353y0.u(null, a.a(onApplyWindowInsetsListener, this, insets)) : androidx.core.view.Y.u(this, u11);
        Intrinsics.checkNotNullExpressionValue(u12, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!u12.o()) {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                androidx.core.view.Y.d(getChildAt(i11), u12);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f42852d) {
            Iterator it = this.f42849a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long j11) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.f42852d) {
            ArrayList arrayList = this.f42849a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j11);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f42850b.remove(view);
        if (this.f42849a.remove(view)) {
            this.f42852d = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    @NotNull
    public final WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
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
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i11) {
        View view = getChildAt(i11);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        a(view);
        super.removeViewAt(i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViews(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i11, int i12) {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            View view = getChildAt(i14);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i11, i12);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f42851c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.f42850b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f42849a = new ArrayList();
        this.f42850b = new ArrayList();
        this.f42852d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attrs, @NotNull G fm) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm, "fm");
        this.f42849a = new ArrayList();
        this.f42850b = new ArrayList();
        this.f42852d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = Z2.a.f35341b;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        ComponentCallbacksC5392m f02 = fm.f0(id2);
        if (classAttribute != null && f02 == null) {
            if (id2 == -1) {
                throw new IllegalStateException(A0.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            ComponentCallbacksC5392m a11 = fm.p0().a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(a11, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a11.mFragmentId = id2;
            a11.mContainerId = id2;
            a11.mTag = string;
            a11.mFragmentManager = fm;
            a11.mHost = fm.s0();
            a11.onInflate(context, attrs, (Bundle) null);
            C5380a c5380a = new C5380a(fm);
            c5380a.f42978p = true;
            a11.mContainer = this;
            a11.mInDynamicContainer = true;
            c5380a.n(getId(), a11, string, 1);
            c5380a.l();
        }
        fm.N0(this);
    }
}
