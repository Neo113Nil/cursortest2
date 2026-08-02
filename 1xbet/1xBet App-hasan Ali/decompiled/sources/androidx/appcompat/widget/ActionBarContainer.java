package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import game.betting133.sports1xbet.R;
import h.AbstractC1986a;
import n.C2122a;
import n.p0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public boolean f6681k;

    /* renamed from: l, reason: collision with root package name */
    public View f6682l;

    /* renamed from: m, reason: collision with root package name */
    public View f6683m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f6684n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f6685o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f6686p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6687q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6688r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6689s;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2122a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1986a.f17169a);
        boolean z3 = false;
        this.f6684n = obtainStyledAttributes.getDrawable(0);
        this.f6685o = obtainStyledAttributes.getDrawable(2);
        this.f6689s = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f6687q = true;
            this.f6686p = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f6687q ? !(this.f6684n != null || this.f6685o != null) : this.f6686p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6684n;
        if (drawable != null && drawable.isStateful()) {
            this.f6684n.setState(getDrawableState());
        }
        Drawable drawable2 = this.f6685o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f6685o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f6686p;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f6686p.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6684n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f6685o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f6686p;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6682l = findViewById(R.id.action_bar);
        this.f6683m = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f6681k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i5, int i6, int i7) {
        super.onLayout(z3, i, i5, i6, i7);
        boolean z5 = true;
        if (this.f6687q) {
            Drawable drawable = this.f6686p;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f6684n == null) {
                z5 = false;
            } else if (this.f6682l.getVisibility() == 0) {
                this.f6684n.setBounds(this.f6682l.getLeft(), this.f6682l.getTop(), this.f6682l.getRight(), this.f6682l.getBottom());
            } else {
                View view = this.f6683m;
                if (view == null || view.getVisibility() != 0) {
                    this.f6684n.setBounds(0, 0, 0, 0);
                } else {
                    this.f6684n.setBounds(this.f6683m.getLeft(), this.f6683m.getTop(), this.f6683m.getRight(), this.f6683m.getBottom());
                }
            }
            this.f6688r = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (this.f6682l == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f6689s) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i5);
        if (this.f6682l == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f6684n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6684n);
        }
        this.f6684n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f6682l;
            if (view != null) {
                this.f6684n.setBounds(view.getLeft(), this.f6682l.getTop(), this.f6682l.getRight(), this.f6682l.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f6687q ? !(this.f6684n != null || this.f6685o != null) : this.f6686p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f6686p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f6686p);
        }
        this.f6686p = drawable;
        boolean z3 = this.f6687q;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f6686p) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f6684n != null || this.f6685o != null) : this.f6686p == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f6685o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f6685o);
        }
        this.f6685o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f6688r && this.f6685o != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f6687q ? !(this.f6684n != null || this.f6685o != null) : this.f6686p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f6681k = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z3 = i == 0;
        Drawable drawable = this.f6684n;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f6685o;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f6686p;
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
        Drawable drawable2 = this.f6684n;
        boolean z3 = this.f6687q;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f6685o && this.f6688r) {
            return true;
        }
        return (drawable == this.f6686p && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(p0 p0Var) {
    }
}
