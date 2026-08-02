package androidx.appcompat.widget;

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
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.gms.internal.ads.zzbbd;
import h.AbstractC1174a;
import java.util.WeakHashMap;
import k.C1322a;
import n3.AbstractC1464a;
import w1.C1726n0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: l0, reason: collision with root package name */
    public static final O0.c f8460l0 = new O0.c(Float.class, "thumbPos", 7);

    /* renamed from: m0, reason: collision with root package name */
    public static final int[] f8461m0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f8462A;

    /* renamed from: B, reason: collision with root package name */
    public int f8463B;

    /* renamed from: C, reason: collision with root package name */
    public int f8464C;

    /* renamed from: D, reason: collision with root package name */
    public int f8465D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8466E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f8467F;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f8468G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f8469H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f8470I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8471J;

    /* renamed from: K, reason: collision with root package name */
    public int f8472K;

    /* renamed from: L, reason: collision with root package name */
    public final int f8473L;

    /* renamed from: M, reason: collision with root package name */
    public float f8474M;

    /* renamed from: N, reason: collision with root package name */
    public float f8475N;

    /* renamed from: O, reason: collision with root package name */
    public final VelocityTracker f8476O;

    /* renamed from: P, reason: collision with root package name */
    public final int f8477P;

    /* renamed from: Q, reason: collision with root package name */
    public float f8478Q;

    /* renamed from: R, reason: collision with root package name */
    public int f8479R;

    /* renamed from: S, reason: collision with root package name */
    public int f8480S;

    /* renamed from: T, reason: collision with root package name */
    public int f8481T;

    /* renamed from: U, reason: collision with root package name */
    public int f8482U;

    /* renamed from: V, reason: collision with root package name */
    public int f8483V;

    /* renamed from: W, reason: collision with root package name */
    public int f8484W;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f8485a;

    /* renamed from: a0, reason: collision with root package name */
    public int f8486a0;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f8487b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f8488b0;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8489c;
    public final TextPaint c0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8490d;

    /* renamed from: d0, reason: collision with root package name */
    public final ColorStateList f8491d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8492e;

    /* renamed from: e0, reason: collision with root package name */
    public StaticLayout f8493e0;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8494f;

    /* renamed from: f0, reason: collision with root package name */
    public StaticLayout f8495f0;

    /* renamed from: g0, reason: collision with root package name */
    public final C1322a f8496g0;

    /* renamed from: h0, reason: collision with root package name */
    public ObjectAnimator f8497h0;

    /* renamed from: i0, reason: collision with root package name */
    public C0669w f8498i0;

    /* renamed from: j0, reason: collision with root package name */
    public W0 f8499j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Rect f8500k0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f8501x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f8502y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8503z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.salamadev.khotabaljomo3a.kichkabdelhamid.R.attr.switchStyle);
    }

    private C0669w getEmojiTextViewHelper() {
        if (this.f8498i0 == null) {
            this.f8498i0 = new C0669w(this);
        }
        return this.f8498i0;
    }

    private boolean getTargetCheckedState() {
        return this.f8478Q > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((q1.a(this) ? 1.0f - this.f8478Q : this.f8478Q) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f8494f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f8500k0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f8485a;
        Rect b7 = drawable2 != null ? AbstractC0637f0.b(drawable2) : AbstractC0637f0.f8622c;
        return ((((this.f8479R - this.f8481T) - rect.left) - rect.right) - b7.left) - b7.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f8469H = charSequence;
        C0669w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod j02 = ((Y4.D) emojiTextViewHelper.f8752b.f12667a).j0(this.f8496g0);
        if (j02 != null) {
            charSequence = j02.getTransformation(charSequence, this);
        }
        this.f8470I = charSequence;
        this.f8495f0 = null;
        if (this.f8471J) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f8467F = charSequence;
        C0669w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod j02 = ((Y4.D) emojiTextViewHelper.f8752b.f12667a).j0(this.f8496g0);
        if (j02 != null) {
            charSequence = j02.getTransformation(charSequence, this);
        }
        this.f8468G = charSequence;
        this.f8493e0 = null;
        if (this.f8471J) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f8485a;
        if (drawable != null) {
            if (this.f8490d || this.f8492e) {
                Drawable mutate = drawable.mutate();
                this.f8485a = mutate;
                if (this.f8490d) {
                    J.a.h(mutate, this.f8487b);
                }
                if (this.f8492e) {
                    J.a.i(this.f8485a, this.f8489c);
                }
                if (this.f8485a.isStateful()) {
                    this.f8485a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f8494f;
        if (drawable != null) {
            if (this.f8503z || this.f8462A) {
                Drawable mutate = drawable.mutate();
                this.f8494f = mutate;
                if (this.f8503z) {
                    J.a.h(mutate, this.f8501x);
                }
                if (this.f8462A) {
                    J.a.i(this.f8494f, this.f8502y);
                }
                if (this.f8494f.isStateful()) {
                    this.f8494f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f8467F);
        setTextOffInternal(this.f8469H);
        requestLayout();
    }

    public final void d() {
        if (this.f8499j0 == null && ((Y4.D) this.f8498i0.f8752b.f12667a).y() && g0.j.j != null) {
            g0.j a2 = g0.j.a();
            int b7 = a2.b();
            if (b7 == 3 || b7 == 0) {
                W0 w02 = new W0(this);
                this.f8499j0 = w02;
                a2.f(w02);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        int i8;
        int i9 = this.f8482U;
        int i10 = this.f8483V;
        int i11 = this.f8484W;
        int i12 = this.f8486a0;
        int thumbOffset = getThumbOffset() + i9;
        Drawable drawable = this.f8485a;
        Rect b7 = drawable != null ? AbstractC0637f0.b(drawable) : AbstractC0637f0.f8622c;
        Drawable drawable2 = this.f8494f;
        Rect rect = this.f8500k0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (b7 != null) {
                int i14 = b7.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = b7.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = b7.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = b7.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                    this.f8494f.setBounds(i9, i7, i11, i8);
                }
            } else {
                i7 = i10;
            }
            i8 = i12;
            this.f8494f.setBounds(i9, i7, i11, i8);
        }
        Drawable drawable3 = this.f8485a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i21 = thumbOffset - rect.left;
            int i22 = thumbOffset + this.f8481T + rect.right;
            this.f8485a.setBounds(i21, i10, i22, i12);
            Drawable background = getBackground();
            if (background != null) {
                J.a.f(background, i21, i10, i22, i12);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f7, float f8) {
        super.drawableHotspotChanged(f7, f8);
        Drawable drawable = this.f8485a;
        if (drawable != null) {
            J.a.e(drawable, f7, f8);
        }
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null) {
            J.a.e(drawable2, f7, f8);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8485a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!q1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f8479R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f8465D : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (q1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f8479R;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f8465D : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1464a.X(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f8471J;
    }

    public boolean getSplitTrack() {
        return this.f8466E;
    }

    public int getSwitchMinWidth() {
        return this.f8464C;
    }

    public int getSwitchPadding() {
        return this.f8465D;
    }

    public CharSequence getTextOff() {
        return this.f8469H;
    }

    public CharSequence getTextOn() {
        return this.f8467F;
    }

    public Drawable getThumbDrawable() {
        return this.f8485a;
    }

    public final float getThumbPosition() {
        return this.f8478Q;
    }

    public int getThumbTextPadding() {
        return this.f8463B;
    }

    public ColorStateList getThumbTintList() {
        return this.f8487b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f8489c;
    }

    public Drawable getTrackDrawable() {
        return this.f8494f;
    }

    public ColorStateList getTrackTintList() {
        return this.f8501x;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f8502y;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8485a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f8497h0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f8497h0.end();
        this.f8497h0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f8461m0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f8494f;
        Rect rect = this.f8500k0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i7 = this.f8483V;
        int i8 = this.f8486a0;
        int i9 = i7 + rect.top;
        int i10 = i8 - rect.bottom;
        Drawable drawable2 = this.f8485a;
        if (drawable != null) {
            if (!this.f8466E || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b7 = AbstractC0637f0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b7.left;
                rect.right -= b7.right;
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
        StaticLayout staticLayout = getTargetCheckedState() ? this.f8493e0 : this.f8495f0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f8491d0;
            TextPaint textPaint = this.c0;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i9 + i10) / 2) - (staticLayout.getHeight() / 2));
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
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f8467F : this.f8469H;
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
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i7, int i8, int i9, int i10) {
        int i11;
        int width;
        int i12;
        int i13;
        int i14;
        super.onLayout(z4, i7, i8, i9, i10);
        int i15 = 0;
        if (this.f8485a != null) {
            Drawable drawable = this.f8494f;
            Rect rect = this.f8500k0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b7 = AbstractC0637f0.b(this.f8485a);
            i11 = Math.max(0, b7.left - rect.left);
            i15 = Math.max(0, b7.right - rect.right);
        } else {
            i11 = 0;
        }
        if (q1.a(this)) {
            i12 = getPaddingLeft() + i11;
            width = ((this.f8479R + i12) - i11) - i15;
        } else {
            width = (getWidth() - getPaddingRight()) - i15;
            i12 = (width - this.f8479R) + i11 + i15;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i16 = this.f8480S;
            int i17 = height - (i16 / 2);
            i13 = i16 + i17;
            i14 = i17;
        } else if (gravity != 80) {
            i14 = getPaddingTop();
            i13 = this.f8480S + i14;
        } else {
            i13 = getHeight() - getPaddingBottom();
            i14 = i13 - this.f8480S;
        }
        this.f8482U = i12;
        this.f8483V = i14;
        this.f8486a0 = i13;
        this.f8484W = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11 = 0;
        if (this.f8471J) {
            StaticLayout staticLayout = this.f8493e0;
            TextPaint textPaint = this.c0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f8468G;
                this.f8493e0 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f8495f0 == null) {
                CharSequence charSequence2 = this.f8470I;
                this.f8495f0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f8485a;
        Rect rect = this.f8500k0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i9 = (this.f8485a.getIntrinsicWidth() - rect.left) - rect.right;
            i10 = this.f8485a.getIntrinsicHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        this.f8481T = Math.max(this.f8471J ? (this.f8463B * 2) + Math.max(this.f8493e0.getWidth(), this.f8495f0.getWidth()) : 0, i9);
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i11 = this.f8494f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i12 = rect.left;
        int i13 = rect.right;
        Drawable drawable3 = this.f8485a;
        if (drawable3 != null) {
            Rect b7 = AbstractC0637f0.b(drawable3);
            i12 = Math.max(i12, b7.left);
            i13 = Math.max(i13, b7.right);
        }
        int max = this.f8488b0 ? Math.max(this.f8464C, (this.f8481T * 2) + i12 + i13) : this.f8464C;
        int max2 = Math.max(i11, i10);
        this.f8479R = max;
        this.f8480S = max2;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f8467F : this.f8469H;
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
        boolean z4;
        VelocityTracker velocityTracker = this.f8476O;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f8473L;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i8 = this.f8472K;
                    if (i8 == 1) {
                        float x4 = motionEvent.getX();
                        float y4 = motionEvent.getY();
                        float f7 = i7;
                        if (Math.abs(x4 - this.f8474M) > f7 || Math.abs(y4 - this.f8475N) > f7) {
                            this.f8472K = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f8474M = x4;
                            this.f8475N = y4;
                            return true;
                        }
                    } else if (i8 == 2) {
                        float x7 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f8 = x7 - this.f8474M;
                        float f9 = thumbScrollRange != 0 ? f8 / thumbScrollRange : f8 > 0.0f ? 1.0f : -1.0f;
                        if (q1.a(this)) {
                            f9 = -f9;
                        }
                        float f10 = this.f8478Q;
                        float f11 = f9 + f10;
                        float f12 = f11 >= 0.0f ? f11 > 1.0f ? 1.0f : f11 : 0.0f;
                        if (f12 != f10) {
                            this.f8474M = x7;
                            setThumbPosition(f12);
                        }
                        return true;
                    }
                }
            }
            if (this.f8472K == 2) {
                this.f8472K = 0;
                boolean z7 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z7) {
                    velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf);
                    float xVelocity = velocityTracker.getXVelocity();
                    z4 = Math.abs(xVelocity) > ((float) this.f8477P) ? !q1.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f : getTargetCheckedState();
                } else {
                    z4 = isChecked;
                }
                if (z4 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z4);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f8472K = 0;
            velocityTracker.clear();
        } else {
            float x8 = motionEvent.getX();
            float y5 = motionEvent.getY();
            if (isEnabled() && this.f8485a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f8485a;
                Rect rect = this.f8500k0;
                drawable.getPadding(rect);
                int i9 = this.f8483V - i7;
                int i10 = (this.f8482U + thumbOffset) - i7;
                int i11 = this.f8481T + i10 + rect.left + rect.right + i7;
                int i12 = this.f8486a0 + i7;
                if (x8 > i10 && x8 < i11 && y5 > i9 && y5 < i12) {
                    this.f8472K = 1;
                    this.f8474M = x8;
                    this.f8475N = y5;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().c(z4);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        super.setChecked(z4);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f8467F;
                if (obj == null) {
                    obj = getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = P.U.f5037a;
                new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f8469H;
            if (obj3 == null) {
                obj3 = getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = P.U.f5037a;
            new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj4);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = P.U.f5037a;
            if (isLaidOut()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f8460l0, isChecked ? 1.0f : 0.0f);
                this.f8497h0 = ofFloat;
                ofFloat.setDuration(250L);
                V0.a(this.f8497h0, true);
                this.f8497h0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f8497h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1464a.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z4) {
        getEmojiTextViewHelper().d(z4);
        setTextOnInternal(this.f8467F);
        setTextOffInternal(this.f8469H);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z4) {
        this.f8488b0 = z4;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z4) {
        if (this.f8471J != z4) {
            this.f8471J = z4;
            requestLayout();
            if (z4) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z4) {
        this.f8466E = z4;
        invalidate();
    }

    public void setSwitchMinWidth(int i7) {
        this.f8464C = i7;
        requestLayout();
    }

    public void setSwitchPadding(int i7) {
        this.f8465D = i7;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.c0;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f8469H;
        if (obj == null) {
            obj = getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object obj = this.f8467F;
        if (obj == null) {
            obj = getResources().getString(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        new P.D(com.salamadev.khotabaljomo3a.kichkabdelhamid.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8485a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8485a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f7) {
        this.f8478Q = f7;
        invalidate();
    }

    public void setThumbResource(int i7) {
        setThumbDrawable(AbstractC1464a.w(getContext(), i7));
    }

    public void setThumbTextPadding(int i7) {
        this.f8463B = i7;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f8487b = colorStateList;
        this.f8490d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f8489c = mode;
        this.f8492e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8494f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i7) {
        setTrackDrawable(AbstractC1464a.w(getContext(), i7));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f8501x = colorStateList;
        this.f8503z = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f8502y = mode;
        this.f8462A = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8485a || drawable == this.f8494f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int resourceId;
        this.f8487b = null;
        this.f8489c = null;
        this.f8490d = false;
        this.f8492e = false;
        this.f8501x = null;
        this.f8502y = null;
        this.f8503z = false;
        this.f8462A = false;
        this.f8476O = VelocityTracker.obtain();
        this.f8488b0 = true;
        this.f8500k0 = new Rect();
        X0.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.c0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC1174a.f13345x;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        Drawable u4 = F7.u(2);
        this.f8485a = u4;
        if (u4 != null) {
            u4.setCallback(this);
        }
        Drawable u7 = F7.u(11);
        this.f8494f = u7;
        if (u7 != null) {
            u7.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) F7.f17806c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f8471J = typedArray.getBoolean(3, true);
        this.f8463B = typedArray.getDimensionPixelSize(8, 0);
        this.f8464C = typedArray.getDimensionPixelSize(5, 0);
        this.f8465D = typedArray.getDimensionPixelSize(6, 0);
        this.f8466E = typedArray.getBoolean(4, false);
        ColorStateList q7 = F7.q(9);
        if (q7 != null) {
            this.f8487b = q7;
            this.f8490d = true;
        }
        PorterDuff.Mode c3 = AbstractC0637f0.c(typedArray.getInt(10, -1), null);
        if (this.f8489c != c3) {
            this.f8489c = c3;
            this.f8492e = true;
        }
        if (this.f8490d || this.f8492e) {
            a();
        }
        ColorStateList q8 = F7.q(12);
        if (q8 != null) {
            this.f8501x = q8;
            this.f8503z = true;
        }
        PorterDuff.Mode c4 = AbstractC0637f0.c(typedArray.getInt(13, -1), null);
        if (this.f8502y != c4) {
            this.f8502y = c4;
            this.f8462A = true;
        }
        if (this.f8503z || this.f8462A) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, AbstractC1174a.f13346y);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f8491d0 = colorStateList;
            } else {
                this.f8491d0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f7 = dimensionPixelSize;
                if (f7 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f7);
                    requestLayout();
                }
            }
            int i8 = obtainStyledAttributes.getInt(1, -1);
            int i9 = obtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i8 != 1 ? i8 != 2 ? i8 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i9 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i9) : Typeface.create(typeface, i9);
                setSwitchTypeface(defaultFromStyle);
                int i10 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i9;
                textPaint.setFakeBoldText((i10 & 1) != 0);
                textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                C1322a c1322a = new C1322a();
                c1322a.f14650a = context2.getResources().getConfiguration().locale;
                this.f8496g0 = c1322a;
            } else {
                this.f8496g0 = null;
            }
            setTextOnInternal(this.f8467F);
            setTextOffInternal(this.f8469H);
            obtainStyledAttributes.recycle();
        }
        new F2.L0(this).f(attributeSet, i7);
        F7.H();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8473L = viewConfiguration.getScaledTouchSlop();
        this.f8477P = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
