package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import live.football.scorerepublic.R;
import p000.C0083c2;
import p000.b61;
import p000.mz0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public boolean f330j;

    /* JADX INFO: renamed from: k */
    public View f331k;

    /* JADX INFO: renamed from: l */
    public View f332l;

    /* JADX INFO: renamed from: m */
    public Drawable f333m;

    /* JADX INFO: renamed from: n */
    public Drawable f334n;

    /* JADX INFO: renamed from: o */
    public Drawable f335o;

    /* JADX INFO: renamed from: p */
    public final boolean f336p;

    /* JADX INFO: renamed from: q */
    public boolean f337q;

    /* JADX INFO: renamed from: r */
    public final int f338r;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0083c2(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mz0.f5187a);
        boolean z = false;
        this.f333m = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f334n = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f338r = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f336p = true;
            this.f335o = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f336p ? !(this.f333m != null || this.f334n != null) : this.f335o == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f333m;
        if (drawable != null && drawable.isStateful()) {
            this.f333m.setState(getDrawableState());
        }
        Drawable drawable2 = this.f334n;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f334n.setState(getDrawableState());
        }
        Drawable drawable3 = this.f335o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f335o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f333m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f334n;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f335o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f331k = findViewById(R.id.action_bar);
        this.f332l = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f330j || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f336p) {
            Drawable drawable = this.f335o;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f333m == null) {
                z2 = false;
            } else if (this.f331k.getVisibility() == 0) {
                this.f333m.setBounds(this.f331k.getLeft(), this.f331k.getTop(), this.f331k.getRight(), this.f331k.getBottom());
            } else {
                View view = this.f332l;
                if (view == null || view.getVisibility() != 0) {
                    this.f333m.setBounds(0, 0, 0, 0);
                } else {
                    this.f333m.setBounds(this.f332l.getLeft(), this.f332l.getTop(), this.f332l.getRight(), this.f332l.getBottom());
                }
            }
            this.f337q = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f331k == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f338r) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f331k == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f333m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f333m);
        }
        this.f333m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f331k;
            if (view != null) {
                this.f333m.setBounds(view.getLeft(), this.f331k.getTop(), this.f331k.getRight(), this.f331k.getBottom());
            }
        }
        boolean z = false;
        if (!this.f336p ? !(this.f333m != null || this.f334n != null) : this.f335o == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f335o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f335o);
        }
        this.f335o = drawable;
        boolean z = this.f336p;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f335o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f333m != null || this.f334n != null) : this.f335o == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f334n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f334n);
        }
        this.f334n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f337q && this.f334n != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f336p ? !(this.f333m != null || this.f334n != null) : this.f335o == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f330j = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f333m;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f334n;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f335o;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f333m;
        boolean z = this.f336p;
        if (drawable == drawable2 && !z) {
            return true;
        }
        if (drawable == this.f334n && this.f337q) {
            return true;
        }
        return (drawable == this.f335o && z) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(b61 b61Var) {
    }
}
