package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.m;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final /* synthetic */ int a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        @NonNull
        public final b i;

        public Behavior() {
            b bVar = new b();
            this.f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            this.d = 0;
            this.i = bVar;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean a(View view) {
            this.i.getClass();
            return view instanceof c;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.i.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    synchronized (com.google.android.material.snackbar.b.a().a) {
                    }
                }
            } else if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                synchronized (com.google.android.material.snackbar.b.a().a) {
                }
            }
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).getClass();
                throw null;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).getClass();
            throw null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class b {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class c extends FrameLayout {
        public static final a e = new a();

        @Nullable
        public final k a;
        public final int b;
        public ColorStateList c;
        public PorterDuff.Mode d;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NonNull Context context, AttributeSet attributeSet) {
            super(com.google.android.material.theme.overlay.a.a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Drawable wrap;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.google.android.material.a.y);
            if (obtainStyledAttributes.hasValue(6)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.a = k.b(context2, attributeSet, 0, 0).a();
            }
            float f = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(m.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            obtainStyledAttributes.getFloat(1, 1.0f);
            this.b = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(e);
            setFocusable(true);
            if (getBackground() == null) {
                int c = com.google.android.material.color.a.c(f, com.google.android.material.color.a.b(this, R.attr.colorSurface), com.google.android.material.color.a.b(this, R.attr.colorOnSurface));
                k kVar = this.a;
                if (kVar != null) {
                    int i = BaseTransientBottomBar.a;
                    g gVar = new g(kVar);
                    gVar.l(ColorStateList.valueOf(c));
                    gradientDrawable = gVar;
                } else {
                    Resources resources = getResources();
                    int i2 = BaseTransientBottomBar.a;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(c);
                    gradientDrawable = gradientDrawable2;
                }
                if (this.c != null) {
                    wrap = DrawableCompat.wrap(gradientDrawable);
                    DrawableCompat.setTintList(wrap, this.c);
                } else {
                    wrap = DrawableCompat.wrap(gradientDrawable);
                }
                ViewCompat.setBackground(this, wrap);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.b;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        @Override // android.view.View
        public final void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public final void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.c != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.c);
                DrawableCompat.setTintMode(drawable, this.d);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public final void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.c = colorStateList;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(wrap, colorStateList);
                DrawableCompat.setTintMode(wrap, this.d);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public final void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.d = mode;
            if (getBackground() != null) {
                Drawable wrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(wrap, mode);
                if (wrap != getBackground()) {
                    super.setBackgroundDrawable(wrap);
                }
            }
        }

        @Override // android.view.View
        public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
        }

        @Override // android.view.View
        public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : e);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        LinearInterpolator linearInterpolator = com.google.android.material.animation.a.a;
        new Handler(Looper.getMainLooper(), new a());
    }
}
