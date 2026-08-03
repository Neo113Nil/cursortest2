package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class SwitchCompat extends android.widget.CompoundButton {

    /* renamed from: Q, reason: collision with root package name */
    public static final h.e0 f2085Q = new h.e0(java.lang.Float.class, "thumbPos");

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f2086R = {android.R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f2087A;

    /* renamed from: B, reason: collision with root package name */
    public int f2088B;

    /* renamed from: C, reason: collision with root package name */
    public int f2089C;

    /* renamed from: D, reason: collision with root package name */
    public int f2090D;

    /* renamed from: E, reason: collision with root package name */
    public int f2091E;

    /* renamed from: F, reason: collision with root package name */
    public final android.text.TextPaint f2092F;
    public final android.content.res.ColorStateList G;

    /* renamed from: H, reason: collision with root package name */
    public android.text.StaticLayout f2093H;

    /* renamed from: I, reason: collision with root package name */
    public android.text.StaticLayout f2094I;

    /* renamed from: J, reason: collision with root package name */
    public final e.C0109a f2095J;

    /* renamed from: K, reason: collision with root package name */
    public android.animation.ObjectAnimator f2096K;

    /* renamed from: L, reason: collision with root package name */
    public final android.graphics.Rect f2097L;

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.Drawable f2098a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.res.ColorStateList f2099b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f2100c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2101d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2102e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f2103f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f2104g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f2105h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2106i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2107j;

    /* renamed from: k, reason: collision with root package name */
    public int f2108k;

    /* renamed from: l, reason: collision with root package name */
    public int f2109l;

    /* renamed from: m, reason: collision with root package name */
    public int f2110m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2111n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.CharSequence f2112o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f2113p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2114q;

    /* renamed from: r, reason: collision with root package name */
    public int f2115r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2116s;
    public float t;

    /* renamed from: u, reason: collision with root package name */
    public float f2117u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.VelocityTracker f2118v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2119w;

    /* renamed from: x, reason: collision with root package name */
    public float f2120x;

    /* renamed from: y, reason: collision with root package name */
    public int f2121y;

    /* renamed from: z, reason: collision with root package name */
    public int f2122z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.watchfacestudio.huasi_urx110.R.attr.switchStyle);
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        this.f2099b = null;
        this.f2100c = null;
        this.f2101d = false;
        this.f2102e = false;
        this.f2104g = null;
        this.f2105h = null;
        this.f2106i = false;
        this.f2107j = false;
        this.f2118v = android.view.VelocityTracker.obtain();
        this.f2097L = new android.graphics.Rect();
        android.text.TextPaint textPaint = new android.text.TextPaint(1);
        this.f2092F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        I0.b H2 = I0.b.H(context, attributeSet, c.AbstractC0095a.f2549r, com.watchfacestudio.huasi_urx110.R.attr.switchStyle);
        android.graphics.drawable.Drawable A2 = H2.A(2);
        this.f2098a = A2;
        if (A2 != null) {
            A2.setCallback(this);
        }
        android.graphics.drawable.Drawable A3 = H2.A(11);
        this.f2103f = A3;
        if (A3 != null) {
            A3.setCallback(this);
        }
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        this.f2112o = typedArray.getText(0);
        this.f2113p = typedArray.getText(1);
        this.f2114q = typedArray.getBoolean(3, true);
        this.f2108k = typedArray.getDimensionPixelSize(8, 0);
        this.f2109l = typedArray.getDimensionPixelSize(5, 0);
        this.f2110m = typedArray.getDimensionPixelSize(6, 0);
        this.f2111n = typedArray.getBoolean(4, false);
        android.content.res.ColorStateList z2 = H2.z(9);
        if (z2 != null) {
            this.f2099b = z2;
            this.f2101d = true;
        }
        android.graphics.PorterDuff.Mode c2 = h.AbstractC0165x.c(typedArray.getInt(10, -1), null);
        if (this.f2100c != c2) {
            this.f2100c = c2;
            this.f2102e = true;
        }
        if (this.f2101d || this.f2102e) {
            a();
        }
        android.content.res.ColorStateList z3 = H2.z(12);
        if (z3 != null) {
            this.f2104g = z3;
            this.f2106i = true;
        }
        android.graphics.PorterDuff.Mode c3 = h.AbstractC0165x.c(typedArray.getInt(13, -1), null);
        if (this.f2105h != c3) {
            this.f2105h = c3;
            this.f2107j = true;
        }
        if (this.f2106i || this.f2107j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, c.AbstractC0095a.f2550s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                java.lang.Object obj = d.AbstractC0106a.f2737a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.G = colorStateList;
            } else {
                this.G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes.getInt(1, -1);
            int i3 = obtainStyledAttributes.getInt(2, -1);
            android.graphics.Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : android.graphics.Typeface.MONOSPACE : android.graphics.Typeface.SERIF : android.graphics.Typeface.SANS_SERIF;
            if (i3 > 0) {
                android.graphics.Typeface defaultFromStyle = typeface == null ? android.graphics.Typeface.defaultFromStyle(i3) : android.graphics.Typeface.create(typeface, i3);
                setSwitchTypeface(defaultFromStyle);
                int i4 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                android.content.Context context2 = getContext();
                e.C0109a c0109a = new e.C0109a();
                c0109a.f2743a = context2.getResources().getConfiguration().locale;
                this.f2095J = c0109a;
            } else {
                this.f2095J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new h.C0160s(this).d(attributeSet, com.watchfacestudio.huasi_urx110.R.attr.switchStyle);
        H2.K();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f2116s = viewConfiguration.getScaledTouchSlop();
        this.f2119w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f2120x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h.t0.a(this) ? 1.0f - this.f2120x : this.f2120x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        android.graphics.drawable.Drawable drawable = this.f2103f;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.f2097L;
        drawable.getPadding(rect);
        android.graphics.drawable.Drawable drawable2 = this.f2098a;
        android.graphics.Rect b2 = drawable2 != null ? h.AbstractC0165x.b(drawable2) : h.AbstractC0165x.f3277a;
        return ((((this.f2121y - this.f2087A) - rect.left) - rect.right) - b2.left) - b2.right;
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable = this.f2098a;
        if (drawable != null) {
            if (this.f2101d || this.f2102e) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f2098a = mutate;
                if (this.f2101d) {
                    s.AbstractC0989a.h(mutate, this.f2099b);
                }
                if (this.f2102e) {
                    s.AbstractC0989a.i(this.f2098a, this.f2100c);
                }
                if (this.f2098a.isStateful()) {
                    this.f2098a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        android.graphics.drawable.Drawable drawable = this.f2103f;
        if (drawable != null) {
            if (this.f2106i || this.f2107j) {
                android.graphics.drawable.Drawable mutate = drawable.mutate();
                this.f2103f = mutate;
                if (this.f2106i) {
                    s.AbstractC0989a.h(mutate, this.f2104g);
                }
                if (this.f2107j) {
                    s.AbstractC0989a.i(this.f2103f, this.f2105h);
                }
                if (this.f2103f.isStateful()) {
                    this.f2103f.setState(getDrawableState());
                }
            }
        }
    }

    public final android.text.StaticLayout c(java.lang.CharSequence charSequence) {
        e.C0109a c0109a = this.f2095J;
        if (c0109a != null) {
            charSequence = c0109a.getTransformation(charSequence, this);
        }
        java.lang.CharSequence charSequence2 = charSequence;
        return new android.text.StaticLayout(charSequence2, this.f2092F, charSequence2 != null ? (int) java.lang.Math.ceil(android.text.Layout.getDesiredWidth(charSequence2, r2)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i2;
        int i3;
        int i4 = this.f2088B;
        int i5 = this.f2089C;
        int i6 = this.f2090D;
        int i7 = this.f2091E;
        int thumbOffset = getThumbOffset() + i4;
        android.graphics.drawable.Drawable drawable = this.f2098a;
        android.graphics.Rect b2 = drawable != null ? h.AbstractC0165x.b(drawable) : h.AbstractC0165x.f3277a;
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        android.graphics.Rect rect = this.f2097L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (b2 != null) {
                int i9 = b2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = b2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = b2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = b2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f2103f.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f2103f.setBounds(i4, i2, i6, i3);
        }
        android.graphics.drawable.Drawable drawable3 = this.f2098a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.f2087A + rect.right;
            this.f2098a.setBounds(i16, i5, i17, i7);
            android.graphics.drawable.Drawable background = getBackground();
            if (background != null) {
                s.AbstractC0989a.f(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        android.graphics.drawable.Drawable drawable = this.f2098a;
        if (drawable != null) {
            s.AbstractC0989a.e(drawable, f2, f3);
        }
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        if (drawable2 != null) {
            s.AbstractC0989a.e(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.f2098a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h.t0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2121y;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2110m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h.t0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2121y;
        return !android.text.TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2110m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2114q;
    }

    public boolean getSplitTrack() {
        return this.f2111n;
    }

    public int getSwitchMinWidth() {
        return this.f2109l;
    }

    public int getSwitchPadding() {
        return this.f2110m;
    }

    public java.lang.CharSequence getTextOff() {
        return this.f2113p;
    }

    public java.lang.CharSequence getTextOn() {
        return this.f2112o;
    }

    public android.graphics.drawable.Drawable getThumbDrawable() {
        return this.f2098a;
    }

    public int getThumbTextPadding() {
        return this.f2108k;
    }

    public android.content.res.ColorStateList getThumbTintList() {
        return this.f2099b;
    }

    public android.graphics.PorterDuff.Mode getThumbTintMode() {
        return this.f2100c;
    }

    public android.graphics.drawable.Drawable getTrackDrawable() {
        return this.f2103f;
    }

    public android.content.res.ColorStateList getTrackTintList() {
        return this.f2104g;
    }

    public android.graphics.PorterDuff.Mode getTrackTintMode() {
        return this.f2105h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f2098a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        android.animation.ObjectAnimator objectAnimator = this.f2096K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2096K.end();
        this.f2096K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            android.view.View.mergeDrawableStates(onCreateDrawableState, f2086R);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        android.graphics.drawable.Drawable drawable = this.f2103f;
        android.graphics.Rect rect = this.f2097L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f2089C;
        int i3 = this.f2091E;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        android.graphics.drawable.Drawable drawable2 = this.f2098a;
        if (drawable != null) {
            if (!this.f2111n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect b2 = h.AbstractC0165x.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.text.StaticLayout staticLayout = getTargetCheckedState() ? this.f2093H : this.f2094I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            android.content.res.ColorStateList colorStateList = this.G;
            android.text.TextPaint textPaint = this.f2092F;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i4 + i5) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        java.lang.CharSequence charSequence = isChecked() ? this.f2112o : this.f2113p;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (android.text.TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z2, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f2098a != null) {
            android.graphics.drawable.Drawable drawable = this.f2103f;
            android.graphics.Rect rect = this.f2097L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect b2 = h.AbstractC0165x.b(this.f2098a);
            i6 = java.lang.Math.max(0, b2.left - rect.left);
            i10 = java.lang.Math.max(0, b2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (h.t0.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.f2121y + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.f2121y) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f2122z;
            int i12 = height - (i11 / 2);
            i8 = i11 + i12;
            i9 = i12;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f2122z + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f2122z;
        }
        this.f2088B = i7;
        this.f2089C = i9;
        this.f2091E = i8;
        this.f2090D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.f2114q) {
            if (this.f2093H == null) {
                this.f2093H = c(this.f2112o);
            }
            if (this.f2094I == null) {
                this.f2094I = c(this.f2113p);
            }
        }
        android.graphics.drawable.Drawable drawable = this.f2098a;
        int i7 = 0;
        android.graphics.Rect rect = this.f2097L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f2098a.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f2098a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.f2114q) {
            i6 = (this.f2108k * 2) + java.lang.Math.max(this.f2093H.getWidth(), this.f2094I.getWidth());
        } else {
            i6 = 0;
        }
        this.f2087A = java.lang.Math.max(i6, i4);
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f2103f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        android.graphics.drawable.Drawable drawable3 = this.f2098a;
        if (drawable3 != null) {
            android.graphics.Rect b2 = h.AbstractC0165x.b(drawable3);
            i8 = java.lang.Math.max(i8, b2.left);
            i9 = java.lang.Math.max(i9, b2.right);
        }
        int max = java.lang.Math.max(this.f2109l, (this.f2087A * 2) + i8 + i9);
        int max2 = java.lang.Math.max(i7, i5);
        this.f2121y = max;
        this.f2122z = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        java.lang.CharSequence charSequence = isChecked() ? this.f2112o : this.f2113p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z2;
        android.view.VelocityTracker velocityTracker = this.f2118v;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.f2116s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i3 = this.f2115r;
                    if (i3 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        float f2 = i2;
                        if (java.lang.Math.abs(x2 - this.t) > f2 || java.lang.Math.abs(y2 - this.f2117u) > f2) {
                            this.f2115r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.t = x2;
                            this.f2117u = y2;
                            return true;
                        }
                    } else if (i3 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x3 - this.t;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (h.t0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f2120x;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.t = x3;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f2115r == 2) {
                this.f2115r = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    velocityTracker.computeCurrentVelocity(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z2 = java.lang.Math.abs(xVelocity) > ((float) this.f2119w) ? !h.t0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2115r = 0;
            velocityTracker.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f2098a != null) {
                int thumbOffset = getThumbOffset();
                android.graphics.drawable.Drawable drawable = this.f2098a;
                android.graphics.Rect rect = this.f2097L;
                drawable.getPadding(rect);
                int i4 = this.f2089C - i2;
                int i5 = (this.f2088B + thumbOffset) - i2;
                int i6 = this.f2087A + i5 + rect.left + rect.right + i2;
                int i7 = this.f2091E + i2;
                if (x4 > i5 && x4 < i6 && y3 > i4 && y3 < i7) {
                    this.f2115r = 1;
                    this.t = x4;
                    this.f2117u = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            java.lang.reflect.Field field = y.x.f8478a;
            if (isLaidOut()) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, f2085Q, isChecked ? 1.0f : 0.0f);
                this.f2096K = ofFloat;
                ofFloat.setDuration(250L);
                this.f2096K.setAutoCancel(true);
                this.f2096K.start();
                return;
            }
        }
        android.animation.ObjectAnimator objectAnimator = this.f2096K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q1.l.C(callback, this));
    }

    public void setShowText(boolean z2) {
        if (this.f2114q != z2) {
            this.f2114q = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f2111n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f2109l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.f2110m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface) {
        android.text.TextPaint textPaint = this.f2092F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(java.lang.CharSequence charSequence) {
        this.f2113p = charSequence;
        requestLayout();
    }

    public void setTextOn(java.lang.CharSequence charSequence) {
        this.f2112o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f2098a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2098a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.f2120x = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f2108k = i2;
        requestLayout();
    }

    public void setThumbTintList(android.content.res.ColorStateList colorStateList) {
        this.f2099b = colorStateList;
        this.f2101d = true;
        a();
    }

    public void setThumbTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f2100c = mode;
        this.f2102e = true;
        a();
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f2103f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2103f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(d.AbstractC0106a.a(getContext(), i2));
    }

    public void setTrackTintList(android.content.res.ColorStateList colorStateList) {
        this.f2104g = colorStateList;
        this.f2106i = true;
        b();
    }

    public void setTrackTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f2105h = mode;
        this.f2107j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2098a || drawable == this.f2103f;
    }
}
