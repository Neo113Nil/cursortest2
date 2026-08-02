package com.google.android.material.search;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.j;
import com.google.android.material.shape.h;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class SearchBar extends Toolbar {

    @Nullable
    public Drawable a;

    public static class a extends AbsSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0125a();
        public final String a;

        /* renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        public class C0125a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }
    }

    public final void a() {
        ActionMenuView actionMenuView;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int i = 0;
        boolean z = getLayoutDirection() == 1;
        ImageButton a2 = j.a(this);
        int width = (a2 == null || !a2.isClickable()) ? 0 : z ? getWidth() - a2.getLeft() : a2.getRight();
        int i2 = 0;
        while (true) {
            if (i2 >= getChildCount()) {
                actionMenuView = null;
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                actionMenuView = (ActionMenuView) childAt;
                break;
            }
            i2++;
        }
        if (actionMenuView != null) {
            i = z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft();
        }
        float f = -(z ? i : width);
        if (!z) {
            width = i;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void inflateMenu(@MenuRes int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuBuilder;
        if (z) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        if (z) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            super.onRestoreInstanceState(((a) parcelable).getSuperState());
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        new a(super.onSaveInstanceState());
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        boolean z = onClickListener == null;
        ImageButton a2 = j.a(this);
        if (a2 == null) {
            return;
        }
        boolean z2 = !z;
        a2.setClickable(z2);
        a2.setFocusable(z2);
        Drawable background = a2.getBackground();
        if (background != null) {
            this.a = background;
        }
        a2.setBackgroundDrawable(z ? null : this.a);
        a();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean g;

        public ScrollingViewBehavior() {
            this.g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.g && (view2 instanceof AppBarLayout)) {
                this.g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                int integer = appBarLayout.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = integer;
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled, R.attr.state_liftable, -2130969689}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[]{android.R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
                appBarLayout.setStateListAnimator(stateListAnimator);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g = false;
        }
    }
}
