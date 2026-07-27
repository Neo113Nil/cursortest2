package androidx.appcompat.widget;

import A0.j;
import D.z;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import g.AbstractC0301a;
import h.AbstractC0323a;
import i.C0327a;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.Field;
import l.AbstractC1105y;
import l.C1100t;
import l.g0;
import l.v0;
import x.AbstractC1247a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: M, reason: collision with root package name */
    public static final g0 f2022M = new g0(Float.class, "thumbPos");

    /* renamed from: N, reason: collision with root package name */
    public static final int[] f2023N = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f2024A;

    /* renamed from: B, reason: collision with root package name */
    public int f2025B;

    /* renamed from: C, reason: collision with root package name */
    public int f2026C;

    /* renamed from: D, reason: collision with root package name */
    public int f2027D;

    /* renamed from: E, reason: collision with root package name */
    public int f2028E;

    /* renamed from: F, reason: collision with root package name */
    public final TextPaint f2029F;

    /* renamed from: G, reason: collision with root package name */
    public final ColorStateList f2030G;

    /* renamed from: H, reason: collision with root package name */
    public StaticLayout f2031H;

    /* renamed from: I, reason: collision with root package name */
    public StaticLayout f2032I;

    /* renamed from: J, reason: collision with root package name */
    public final C0327a f2033J;

    /* renamed from: K, reason: collision with root package name */
    public ObjectAnimator f2034K;
    public final Rect L;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f2035a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f2036b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2037c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2038d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2039e;
    public Drawable f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2040g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2041h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2042i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2043j;

    /* renamed from: k, reason: collision with root package name */
    public int f2044k;

    /* renamed from: l, reason: collision with root package name */
    public int f2045l;

    /* renamed from: m, reason: collision with root package name */
    public int f2046m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2047n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f2048o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2049p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2050q;

    /* renamed from: r, reason: collision with root package name */
    public int f2051r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2052s;

    /* renamed from: t, reason: collision with root package name */
    public float f2053t;

    /* renamed from: u, reason: collision with root package name */
    public float f2054u;

    /* renamed from: v, reason: collision with root package name */
    public final VelocityTracker f2055v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2056w;

    /* renamed from: x, reason: collision with root package name */
    public float f2057x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public int f2058z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fe, code lost:
    
        if (r9 != null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.chicken.jump.road.pump.R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        this.f2036b = null;
        this.f2037c = null;
        this.f2038d = false;
        this.f2039e = false;
        this.f2040g = null;
        this.f2041h = null;
        this.f2042i = false;
        this.f2043j = false;
        this.f2055v = VelocityTracker.obtain();
        this.L = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f2029F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        j I3 = j.I(context, attributeSet, AbstractC0301a.f4942r, com.chicken.jump.road.pump.R.attr.switchStyle);
        Drawable A3 = I3.A(2);
        this.f2035a = A3;
        if (A3 != null) {
            A3.setCallback(this);
        }
        Drawable A4 = I3.A(11);
        this.f = A4;
        if (A4 != null) {
            A4.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) I3.f67c;
        this.f2048o = typedArray.getText(0);
        this.f2049p = typedArray.getText(1);
        this.f2050q = typedArray.getBoolean(3, true);
        this.f2044k = typedArray.getDimensionPixelSize(8, 0);
        this.f2045l = typedArray.getDimensionPixelSize(5, 0);
        this.f2046m = typedArray.getDimensionPixelSize(6, 0);
        this.f2047n = typedArray.getBoolean(4, false);
        ColorStateList z3 = I3.z(9);
        if (z3 != null) {
            this.f2036b = z3;
            this.f2038d = true;
        }
        PorterDuff.Mode c3 = AbstractC1105y.c(typedArray.getInt(10, -1), null);
        if (this.f2037c != c3) {
            this.f2037c = c3;
            this.f2039e = true;
        }
        if (this.f2038d || this.f2039e) {
            a();
        }
        ColorStateList z4 = I3.z(12);
        if (z4 != null) {
            this.f2040g = z4;
            this.f2042i = true;
        }
        PorterDuff.Mode c4 = AbstractC1105y.c(typedArray.getInt(13, -1), null);
        if (this.f2041h != c4) {
            this.f2041h = c4;
            this.f2043j = true;
        }
        if (this.f2042i || this.f2043j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC0301a.f4943s);
            if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) != 0) {
                Object obj = AbstractC0323a.f4982a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.f2030G = colorStateList;
            } else {
                this.f2030G = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i3 = obtainStyledAttributes.getInt(1, -1);
            int i4 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i4 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(defaultFromStyle);
                int i5 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C0327a c0327a = new C0327a();
                c0327a.f4996a = context2.getResources().getConfiguration().locale;
                this.f2033J = c0327a;
            } else {
                this.f2033J = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C1100t(this).d(attributeSet, com.chicken.jump.road.pump.R.attr.switchStyle);
        I3.L();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2052s = viewConfiguration.getScaledTouchSlop();
        this.f2056w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.f2057x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((v0.a(this) ? 1.0f - this.f2057x : this.f2057x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.L;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2035a;
        Rect b3 = drawable2 != null ? AbstractC1105y.b(drawable2) : AbstractC1105y.f9913a;
        return ((((this.y - this.f2024A) - rect.left) - rect.right) - b3.left) - b3.right;
    }

    public final void a() {
        Drawable drawable = this.f2035a;
        if (drawable != null) {
            if (this.f2038d || this.f2039e) {
                Drawable mutate = drawable.mutate();
                this.f2035a = mutate;
                if (this.f2038d) {
                    AbstractC1247a.h(mutate, this.f2036b);
                }
                if (this.f2039e) {
                    AbstractC1247a.i(this.f2035a, this.f2037c);
                }
                if (this.f2035a.isStateful()) {
                    this.f2035a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.f2042i || this.f2043j) {
                Drawable mutate = drawable.mutate();
                this.f = mutate;
                if (this.f2042i) {
                    AbstractC1247a.h(mutate, this.f2040g);
                }
                if (this.f2043j) {
                    AbstractC1247a.i(this.f, this.f2041h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        C0327a c0327a = this.f2033J;
        if (c0327a != null) {
            charSequence = c0327a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f2029F, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        int i4;
        int i5 = this.f2025B;
        int i6 = this.f2026C;
        int i7 = this.f2027D;
        int i8 = this.f2028E;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f2035a;
        Rect b3 = drawable != null ? AbstractC1105y.b(drawable) : AbstractC1105y.f9913a;
        Drawable drawable2 = this.f;
        Rect rect = this.L;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (b3 != null) {
                int i10 = b3.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = b3.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = b3.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = b3.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f2035a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f2024A + rect.right;
            this.f2035a.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1247a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f3) {
        super.drawableHotspotChanged(f, f3);
        Drawable drawable = this.f2035a;
        if (drawable != null) {
            AbstractC1247a.e(drawable, f, f3);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            AbstractC1247a.e(drawable2, f, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2035a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!v0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2046m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (v0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2046m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2050q;
    }

    public boolean getSplitTrack() {
        return this.f2047n;
    }

    public int getSwitchMinWidth() {
        return this.f2045l;
    }

    public int getSwitchPadding() {
        return this.f2046m;
    }

    public CharSequence getTextOff() {
        return this.f2049p;
    }

    public CharSequence getTextOn() {
        return this.f2048o;
    }

    public Drawable getThumbDrawable() {
        return this.f2035a;
    }

    public int getThumbTextPadding() {
        return this.f2044k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2036b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2037c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2040g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2041h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2035a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2034K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2034K.end();
        this.f2034K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2023N);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f2026C;
        int i4 = this.f2028E;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f2035a;
        if (drawable != null) {
            if (!this.f2047n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b3 = AbstractC1105y.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b3.left;
                rect.right -= b3.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f2031H : this.f2032I;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2030G;
            TextPaint textPaint = this.f2029F;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f2048o : this.f2049p;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        super.onLayout(z3, i3, i4, i5, i6);
        int i11 = 0;
        if (this.f2035a != null) {
            Drawable drawable = this.f;
            Rect rect = this.L;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b3 = AbstractC1105y.b(this.f2035a);
            i7 = Math.max(0, b3.left - rect.left);
            i11 = Math.max(0, b3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (v0.a(this)) {
            i8 = getPaddingLeft() + i7;
            width = ((this.y + i8) - i7) - i11;
        } else {
            width = (getWidth() - getPaddingRight()) - i11;
            i8 = (width - this.y) + i7 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i12 = this.f2058z;
            int i13 = height - (i12 / 2);
            i9 = i12 + i13;
            i10 = i13;
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i9 = this.f2058z + i10;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.f2058z;
        }
        this.f2025B = i8;
        this.f2026C = i10;
        this.f2028E = i9;
        this.f2027D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (this.f2050q) {
            if (this.f2031H == null) {
                this.f2031H = c(this.f2048o);
            }
            if (this.f2032I == null) {
                this.f2032I = c(this.f2049p);
            }
        }
        Drawable drawable = this.f2035a;
        int i8 = 0;
        Rect rect = this.L;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f2035a.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f2035a.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (this.f2050q) {
            i7 = (this.f2044k * 2) + Math.max(this.f2031H.getWidth(), this.f2032I.getWidth());
        } else {
            i7 = 0;
        }
        this.f2024A = Math.max(i7, i5);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i8 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i9 = rect.left;
        int i10 = rect.right;
        Drawable drawable3 = this.f2035a;
        if (drawable3 != null) {
            Rect b3 = AbstractC1105y.b(drawable3);
            i9 = Math.max(i9, b3.left);
            i10 = Math.max(i10, b3.right);
        }
        int max = Math.max(this.f2045l, (this.f2024A * 2) + i9 + i10);
        int max2 = Math.max(i8, i6);
        this.y = max;
        this.f2058z = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2048o : this.f2049p;
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        VelocityTracker velocityTracker = this.f2055v;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f2052s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i4 = this.f2051r;
                    if (i4 == 1) {
                        float x3 = motionEvent.getX();
                        float y = motionEvent.getY();
                        float f = i3;
                        if (Math.abs(x3 - this.f2053t) > f || Math.abs(y - this.f2054u) > f) {
                            this.f2051r = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f2053t = x3;
                            this.f2054u = y;
                            return true;
                        }
                    } else if (i4 == 2) {
                        float x4 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f3 = x4 - this.f2053t;
                        float f4 = thumbScrollRange != 0 ? f3 / thumbScrollRange : f3 > 0.0f ? 1.0f : -1.0f;
                        if (v0.a(this)) {
                            f4 = -f4;
                        }
                        float f5 = this.f2057x;
                        float f6 = f4 + f5;
                        float f7 = f6 >= 0.0f ? f6 > 1.0f ? 1.0f : f6 : 0.0f;
                        if (f7 != f5) {
                            this.f2053t = x4;
                            setThumbPosition(f7);
                        }
                        return true;
                    }
                }
            }
            if (this.f2051r == 2) {
                this.f2051r = 0;
                boolean z4 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z4) {
                    velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                    float xVelocity = velocityTracker.getXVelocity();
                    z3 = Math.abs(xVelocity) > ((float) this.f2056w) ? !v0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z3 = isChecked;
                }
                if (z3 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z3);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2051r = 0;
            velocityTracker.clear();
        } else {
            float x5 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f2035a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f2035a;
                Rect rect = this.L;
                drawable.getPadding(rect);
                int i5 = this.f2026C - i3;
                int i6 = (this.f2025B + thumbOffset) - i3;
                int i7 = this.f2024A + i6 + rect.left + rect.right + i3;
                int i8 = this.f2028E + i3;
                if (x5 > i6 && x5 < i7 && y3 > i5 && y3 < i8) {
                    this.f2051r = 1;
                    this.f2053t = x5;
                    this.f2054u = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        if (getWindowToken() != null) {
            Field field = z.f259a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2022M, isChecked ? 1.0f : 0.0f);
                this.f2034K = ofFloat;
                ofFloat.setDuration(250L);
                this.f2034K.setAutoCancel(true);
                this.f2034K.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f2034K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X0.a.O(callback, this));
    }

    public void setShowText(boolean z3) {
        if (this.f2050q != z3) {
            this.f2050q = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f2047n = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f2045l = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f2046m = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2029F;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2049p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2048o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2035a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2035a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f2057x = f;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(AbstractC0323a.a(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f2044k = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2036b = colorStateList;
        this.f2038d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2037c = mode;
        this.f2039e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(AbstractC0323a.a(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2040g = colorStateList;
        this.f2042i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2041h = mode;
        this.f2043j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2035a || drawable == this.f;
    }
}
