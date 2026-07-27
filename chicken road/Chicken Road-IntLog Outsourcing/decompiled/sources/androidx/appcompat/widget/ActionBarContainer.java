package androidx.appcompat.widget;

import E.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.chickyneer.roadway.R;
import g.AbstractC0444a;
import java.lang.reflect.Field;
import l.C1229a;
import l.O;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4109a;

    /* renamed from: b, reason: collision with root package name */
    public View f4110b;

    /* renamed from: c, reason: collision with root package name */
    public View f4111c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f4112d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f4113e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f4114f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4115g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4116h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4117i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1229a c1229a = new C1229a(this);
        Field field = G.f566a;
        setBackground(c1229a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0444a.f5693a);
        boolean z = false;
        this.f4112d = obtainStyledAttributes.getDrawable(0);
        this.f4113e = obtainStyledAttributes.getDrawable(2);
        this.f4117i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4115g = true;
            this.f4114f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4115g ? !(this.f4112d != null || this.f4113e != null) : this.f4114f == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4112d;
        if (drawable != null && drawable.isStateful()) {
            this.f4112d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4113e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4113e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4114f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4114f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4112d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4113e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4114f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4110b = findViewById(R.id.action_bar);
        this.f4111c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4109a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i6, int i7) {
        super.onLayout(z, i2, i3, i6, i7);
        boolean z5 = true;
        if (this.f4115g) {
            Drawable drawable = this.f4114f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f4112d == null) {
                z5 = false;
            } else if (this.f4110b.getVisibility() == 0) {
                this.f4112d.setBounds(this.f4110b.getLeft(), this.f4110b.getTop(), this.f4110b.getRight(), this.f4110b.getBottom());
            } else {
                View view = this.f4111c;
                if (view == null || view.getVisibility() != 0) {
                    this.f4112d.setBounds(0, 0, 0, 0);
                } else {
                    this.f4112d.setBounds(this.f4111c.getLeft(), this.f4111c.getTop(), this.f4111c.getRight(), this.f4111c.getBottom());
                }
            }
            this.f4116h = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i6;
        if (this.f4110b == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i6 = this.f4117i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f4110b == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4112d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4112d);
        }
        this.f4112d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4110b;
            if (view != null) {
                this.f4112d.setBounds(view.getLeft(), this.f4110b.getTop(), this.f4110b.getRight(), this.f4110b.getBottom());
            }
        }
        boolean z = false;
        if (!this.f4115g ? !(this.f4112d != null || this.f4113e != null) : this.f4114f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4114f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4114f);
        }
        this.f4114f = drawable;
        boolean z = this.f4115g;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f4114f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f4112d != null || this.f4113e != null) : this.f4114f == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4113e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4113e);
        }
        this.f4113e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4116h && this.f4113e != null) {
                throw null;
            }
        }
        boolean z = false;
        if (!this.f4115g ? !(this.f4112d != null || this.f4113e != null) : this.f4114f == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z) {
        this.f4109a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.f4112d;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f4113e;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f4114f;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4112d;
        boolean z = this.f4115g;
        return (drawable == drawable2 && !z) || (drawable == this.f4113e && this.f4116h) || ((drawable == this.f4114f && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(O o2) {
    }
}
