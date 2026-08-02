package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.m;
import com.google.android.material.shape.h;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {
    public static final /* synthetic */ int c = 0;
    public int a;
    public boolean b;

    public static class a extends AbsSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0121a();
        public int a;
        public boolean b;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a, reason: collision with other inner class name */
        public class C0121a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    @Nullable
    public final View a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public final CoordinatorLayout.Behavior getBehavior() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ActionMenuView actionMenuView;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            throw null;
        }
        int i5 = 0;
        while (true) {
            if (i5 >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i5++;
        }
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            View a2 = a();
            if ((a2 instanceof FloatingActionButton ? (FloatingActionButton) a2 : null) != null) {
                throw null;
            }
            new com.google.android.material.bottomappbar.a(this, actionMenuView, 0, false).run();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.a = aVar.a;
        this.b = aVar.b;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = this.a;
        aVar.b = this.b;
        return aVar;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        @NonNull
        public final Rect i;
        public WeakReference<BottomAppBar> j;
        public int k;
        public final a l;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Behavior behavior = Behavior.this;
                if (behavior.j.get() == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    behavior.i.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
                if (behavior.k == 0) {
                    int i9 = BottomAppBar.c;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
                    if (m.a(view)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                }
                int i10 = BottomAppBar.c;
                throw null;
            }
        }

        public Behavior() {
            this.l = new a();
            this.i = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.j = new WeakReference<>(bottomAppBar);
            int i2 = BottomAppBar.c;
            View a2 = bottomAppBar.a();
            if (a2 == null || ViewCompat.isLaidOut(a2)) {
                coordinatorLayout.onLayoutChild(bottomAppBar, i);
                return super.onLayoutChild(coordinatorLayout, bottomAppBar, i);
            }
            ((CoordinatorLayout.LayoutParams) a2.getLayoutParams()).anchorGravity = 81;
            this.k = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) a2.getLayoutParams())).bottomMargin;
            if (a2 instanceof FloatingActionButton) {
                throw null;
            }
            a2.addOnLayoutChangeListener(this.l);
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
            ((BottomAppBar) view).getClass();
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.l = new a();
            this.i = new Rect();
        }
    }
}
