package androidx.appcompat.widget;

import D.z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.chicken.jump.road.pump.R;
import g.AbstractC0301a;
import java.lang.reflect.Field;
import l.C1082a;
import l.S;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1921a;

    /* renamed from: b, reason: collision with root package name */
    public View f1922b;

    /* renamed from: c, reason: collision with root package name */
    public View f1923c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f1924d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f1925e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1927h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1928i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1082a c1082a = new C1082a(this);
        Field field = z.f259a;
        setBackground(c1082a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0301a.f4926a);
        boolean z3 = false;
        this.f1924d = obtainStyledAttributes.getDrawable(0);
        this.f1925e = obtainStyledAttributes.getDrawable(2);
        this.f1928i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1926g = true;
            this.f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1926g ? !(this.f1924d != null || this.f1925e != null) : this.f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1924d;
        if (drawable != null && drawable.isStateful()) {
            this.f1924d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1925e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1925e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1924d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1925e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1922b = findViewById(R.id.action_bar);
        this.f1923c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1921a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f1926g) {
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f1924d == null) {
                z4 = false;
            } else if (this.f1922b.getVisibility() == 0) {
                this.f1924d.setBounds(this.f1922b.getLeft(), this.f1922b.getTop(), this.f1922b.getRight(), this.f1922b.getBottom());
            } else {
                View view = this.f1923c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1924d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1924d.setBounds(this.f1923c.getLeft(), this.f1923c.getTop(), this.f1923c.getRight(), this.f1923c.getBottom());
                }
            }
            this.f1927h = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f1922b == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f1928i) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f1922b == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1924d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1924d);
        }
        this.f1924d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1922b;
            if (view != null) {
                this.f1924d.setBounds(view.getLeft(), this.f1922b.getTop(), this.f1922b.getRight(), this.f1922b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f1926g ? !(this.f1924d != null || this.f1925e != null) : this.f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f);
        }
        this.f = drawable;
        boolean z3 = this.f1926g;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f1924d != null || this.f1925e != null) : this.f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1925e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1925e);
        }
        this.f1925e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1927h && this.f1925e != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f1926g ? !(this.f1924d != null || this.f1925e != null) : this.f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f1921a = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f1924d;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f1925e;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1924d;
        boolean z3 = this.f1926g;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f1925e && this.f1927h) {
            return true;
        }
        return (drawable == this.f && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(S s3) {
    }
}
