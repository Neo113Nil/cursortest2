package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import h.AbstractC1174a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8178a;

    /* renamed from: b, reason: collision with root package name */
    public View f8179b;

    /* renamed from: c, reason: collision with root package name */
    public View f8180c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f8181d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f8182e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8183f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f8184x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8185y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8186z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0626a c0626a = new C0626a(this);
        WeakHashMap weakHashMap = P.U.f5037a;
        setBackground(c0626a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1174a.f13323a);
        boolean z4 = false;
        this.f8181d = obtainStyledAttributes.getDrawable(0);
        this.f8182e = obtainStyledAttributes.getDrawable(2);
        this.f8186z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f8184x = true;
            this.f8183f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f8184x ? !(this.f8181d != null || this.f8182e != null) : this.f8183f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8181d;
        if (drawable != null && drawable.isStateful()) {
            this.f8181d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8182e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8182e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8183f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f8183f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8181d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8182e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8183f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8179b = findViewById(R.id.action_bar);
        this.f8180c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8178a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        super.onLayout(z4, i7, i8, i9, i10);
        boolean z7 = true;
        if (this.f8184x) {
            Drawable drawable = this.f8183f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z7 = false;
            }
        } else {
            if (this.f8181d == null) {
                z7 = false;
            } else if (this.f8179b.getVisibility() == 0) {
                this.f8181d.setBounds(this.f8179b.getLeft(), this.f8179b.getTop(), this.f8179b.getRight(), this.f8179b.getBottom());
            } else {
                View view = this.f8180c;
                if (view == null || view.getVisibility() != 0) {
                    this.f8181d.setBounds(0, 0, 0, 0);
                } else {
                    this.f8181d.setBounds(this.f8180c.getLeft(), this.f8180c.getTop(), this.f8180c.getRight(), this.f8180c.getBottom());
                }
            }
            this.f8185y = false;
        }
        if (z7) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f8179b == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f8186z) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f8179b == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8181d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8181d);
        }
        this.f8181d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8179b;
            if (view != null) {
                this.f8181d.setBounds(view.getLeft(), this.f8179b.getTop(), this.f8179b.getRight(), this.f8179b.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f8184x ? !(this.f8181d != null || this.f8182e != null) : this.f8183f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8183f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8183f);
        }
        this.f8183f = drawable;
        boolean z4 = this.f8184x;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f8183f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f8181d != null || this.f8182e != null) : this.f8183f == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f8182e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8182e);
        }
        this.f8182e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f8185y && this.f8182e != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f8184x ? !(this.f8181d != null || this.f8182e != null) : this.f8183f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(F0 f02) {
    }

    public void setTransitioning(boolean z4) {
        this.f8178a = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z4 = i7 == 0;
        Drawable drawable = this.f8181d;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f8182e;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f8183f;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8181d;
        boolean z4 = this.f8184x;
        return (drawable == drawable2 && !z4) || (drawable == this.f8182e && this.f8185y) || ((drawable == this.f8183f && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
