package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1982a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f1983b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f1984c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f1985d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f1986e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f1987f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1988g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1989h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1990i;

    public ActionBarContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h.C0143a c0143a = new h.C0143a(this);
        java.lang.reflect.Field field = y.x.f8478a;
        setBackground(c0143a);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2532a);
        boolean z2 = false;
        this.f1985d = obtainStyledAttributes.getDrawable(0);
        this.f1986e = obtainStyledAttributes.getDrawable(2);
        this.f1990i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == com.watchfacestudio.huasi_urx110.R.id.split_action_bar) {
            this.f1988g = true;
            this.f1987f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1988g ? !(this.f1985d != null || this.f1986e != null) : this.f1987f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable drawable = this.f1985d;
        if (drawable != null && drawable.isStateful()) {
            this.f1985d.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable2 = this.f1986e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1986e.setState(getDrawableState());
        }
        android.graphics.drawable.Drawable drawable3 = this.f1987f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1987f.setState(getDrawableState());
    }

    public android.view.View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f1985d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f1986e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable3 = this.f1987f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1983b = findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar);
        this.f1984c = findViewById(com.watchfacestudio.huasi_urx110.R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.f1982a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (this.f1988g) {
            android.graphics.drawable.Drawable drawable = this.f1987f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1985d == null) {
                z3 = false;
            } else if (this.f1983b.getVisibility() == 0) {
                this.f1985d.setBounds(this.f1983b.getLeft(), this.f1983b.getTop(), this.f1983b.getRight(), this.f1983b.getBottom());
            } else {
                android.view.View view = this.f1984c;
                if (view == null || view.getVisibility() != 0) {
                    this.f1985d.setBounds(0, 0, 0, 0);
                } else {
                    this.f1985d.setBounds(this.f1984c.getLeft(), this.f1984c.getTop(), this.f1984c.getRight(), this.f1984c.getBottom());
                }
            }
            this.f1989h = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1983b == null && android.view.View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f1990i) >= 0) {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i4, android.view.View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f1983b == null) {
            return;
        }
        android.view.View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f1985d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1985d);
        }
        this.f1985d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            android.view.View view = this.f1983b;
            if (view != null) {
                this.f1985d.setBounds(view.getLeft(), this.f1983b.getTop(), this.f1983b.getRight(), this.f1983b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1988g ? !(this.f1985d != null || this.f1986e != null) : this.f1987f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2;
        android.graphics.drawable.Drawable drawable3 = this.f1987f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1987f);
        }
        this.f1987f = drawable;
        boolean z2 = this.f1988g;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1987f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1985d != null || this.f1986e != null) : this.f1987f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f1986e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1986e);
        }
        this.f1986e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1989h && this.f1986e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1988g ? !(this.f1985d != null || this.f1986e != null) : this.f1987f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f1982a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        android.graphics.drawable.Drawable drawable = this.f1985d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        android.graphics.drawable.Drawable drawable2 = this.f1986e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        android.graphics.drawable.Drawable drawable3 = this.f1987f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f1985d;
        boolean z2 = this.f1988g;
        return (drawable == drawable2 && !z2) || (drawable == this.f1986e && this.f1989h) || ((drawable == this.f1987f && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ActionMode startActionModeForChild(android.view.View view, android.view.ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(h.P p2) {
    }
}
