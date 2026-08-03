package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class ActionBarContextView extends android.view.ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1992b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1993c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f1994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f1995e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f1996f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f1997g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f1998h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f1999i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2000j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2001k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2002l;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.actionModeStyle);
        int resourceId;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(com.watchfacestudio.huasi_urx110.R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new android.view.ContextThemeWrapper(context, typedValue.resourceId);
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.AbstractC0095a.f2535d, com.watchfacestudio.huasi_urx110.R.attr.actionModeStyle, 0);
        android.graphics.drawable.Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.AbstractC0106a.a(context, resourceId);
        java.lang.reflect.Field field = y.x.f8478a;
        setBackground(drawable);
        this.f2000j = obtainStyledAttributes.getResourceId(5, 0);
        this.f2001k = obtainStyledAttributes.getResourceId(4, 0);
        this.f1991a = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, com.watchfacestudio.huasi_urx110.R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(android.view.View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f1997g == null) {
            android.view.LayoutInflater.from(getContext()).inflate(com.watchfacestudio.huasi_urx110.R.layout.abc_action_bar_title_item, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.f1997g = linearLayout;
            this.f1998h = (android.widget.TextView) linearLayout.findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar_title);
            this.f1999i = (android.widget.TextView) this.f1997g.findViewById(com.watchfacestudio.huasi_urx110.R.id.action_bar_subtitle);
            int i2 = this.f2000j;
            if (i2 != 0) {
                this.f1998h.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f2001k;
            if (i3 != 0) {
                this.f1999i.setTextAppearance(getContext(), i3);
            }
        }
        this.f1998h.setText(this.f1994d);
        this.f1999i.setText(this.f1995e);
        boolean isEmpty = android.text.TextUtils.isEmpty(this.f1994d);
        boolean isEmpty2 = android.text.TextUtils.isEmpty(this.f1995e);
        this.f1999i.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1997g.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1997g.getParent() == null) {
            addView(this.f1997g);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1991a;
    }

    public java.lang.CharSequence getSubtitle() {
        return this.f1995e;
    }

    public java.lang.CharSequence getTitle() {
        return this.f1994d;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.AbstractC0095a.f2532a, com.watchfacestudio.huasi_urx110.R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1993c = false;
        }
        if (!this.f1993c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1993c = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1993c = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1994d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean a2 = h.t0.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        android.widget.LinearLayout linearLayout = this.f1997g;
        if (linearLayout != null && this.f1996f == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f1997g, paddingRight, paddingTop, paddingTop2, a2);
        }
        android.view.View view = this.f1996f;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (android.view.View.MeasureSpec.getMode(i3) == 0) {
            throw new java.lang.IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = android.view.View.MeasureSpec.getSize(i2);
        int i4 = this.f1991a;
        if (i4 <= 0) {
            i4 = android.view.View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        android.widget.LinearLayout linearLayout = this.f1997g;
        if (linearLayout != null && this.f1996f == null) {
            if (this.f2002l) {
                this.f1997g.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1997g.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1997g.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = java.lang.Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        android.view.View view = this.f1996f;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = java.lang.Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = java.lang.Math.min(i8, i5);
            }
            this.f1996f.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), android.view.View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f1991a > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1992b = false;
        }
        if (!this.f1992b) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1992b = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1992b = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1991a = i2;
    }

    public void setCustomView(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.f1996f;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1996f = view;
        if (view != null && (linearLayout = this.f1997g) != null) {
            removeView(linearLayout);
            this.f1997g = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f1995e = charSequence;
        a();
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f1994d = charSequence;
        a();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f2002l) {
            requestLayout();
        }
        this.f2002l = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
