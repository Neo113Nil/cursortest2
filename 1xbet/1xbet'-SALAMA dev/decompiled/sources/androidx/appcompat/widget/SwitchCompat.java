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
import java.util.WeakHashMap;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final O0.c f8460l0 = new O0.c(Float.class, "thumbPos", 7);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int[] f8461m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f8462A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f8463B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f8464C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f8465D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f8466E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f8467F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public CharSequence f8468G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f8469H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f8470I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f8471J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f8472K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f8473L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f8474M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f8475N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final VelocityTracker f8476O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f8477P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f8478Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f8479R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f8480S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f8481T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f8482U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f8483V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f8484W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f8485a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f8486a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f8487b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f8488b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8489c;
    public final TextPaint c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8490d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ColorStateList f8491d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8492e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public StaticLayout f8493e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f8494f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public StaticLayout f8495f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final p070k.a f8496g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ObjectAnimator f8497h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public C0648w f8498i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public W0 f8499j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Rect f8500k0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f8501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f8502y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f8503z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.salamadev.nabilalawadi.kisaskoran.R.attr.switchStyle);
    }

    private C0648w getEmojiTextViewHelper() {
        if (this.f8498i0 == null) {
            this.f8498i0 = new C0648w(this);
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
        Rect rectB = drawable2 != null ? AbstractC0616f0.b(drawable2) : AbstractC0616f0.f8622c;
        return ((((this.f8479R - this.f8481T) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f8469H = charSequence;
        C0648w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodJ0 = ((Y4.D) emojiTextViewHelper.f8752b.f12673a).j0(this.f8496g0);
        if (transformationMethodJ0 != null) {
            charSequence = transformationMethodJ0.getTransformation(charSequence, this);
        }
        this.f8470I = charSequence;
        this.f8495f0 = null;
        if (this.f8471J) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f8467F = charSequence;
        C0648w emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodJ0 = ((Y4.D) emojiTextViewHelper.f8752b.f12673a).j0(this.f8496g0);
        if (transformationMethodJ0 != null) {
            charSequence = transformationMethodJ0.getTransformation(charSequence, this);
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
                Drawable drawableMutate = drawable.mutate();
                this.f8485a = drawableMutate;
                if (this.f8490d) {
                    J.a.h(drawableMutate, this.f8487b);
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
                Drawable drawableMutate = drawable.mutate();
                this.f8494f = drawableMutate;
                if (this.f8503z) {
                    J.a.h(drawableMutate, this.f8501x);
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
        if (this.f8499j0 == null && ((Y4.D) this.f8498i0.f8752b.f12673a).y() && p046g0.j.j != null) {
            p046g0.j jVarA = p046g0.j.a();
            int iB = jVarA.b();
            if (iB == 3 || iB == 0) {
                W0 w7 = new W0(this);
                this.f8499j0 = w7;
                jVarA.f(w7);
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
        Rect rectB = drawable != null ? AbstractC0616f0.b(drawable) : AbstractC0616f0.f8622c;
        Drawable drawable2 = this.f8494f;
        Rect rect = this.f8500k0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i13 = rect.left;
            thumbOffset += i13;
            if (rectB != null) {
                int i14 = rectB.left;
                if (i14 > i13) {
                    i9 += i14 - i13;
                }
                int i15 = rectB.top;
                int i16 = rect.top;
                i7 = i15 > i16 ? (i15 - i16) + i10 : i10;
                int i17 = rectB.right;
                int i18 = rect.right;
                if (i17 > i18) {
                    i11 -= i17 - i18;
                }
                int i19 = rectB.bottom;
                int i20 = rect.bottom;
                if (i19 > i20) {
                    i8 = i12 - (i19 - i20);
                }
                this.f8494f.setBounds(i9, i7, i11, i8);
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
        return p097n3.a.X(super.getCustomSelectionActionModeCallback());
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
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f8461m0);
        }
        return iArrOnCreateDrawableState;
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
                Rect rectB = AbstractC0616f0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
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
        canvas.restoreToCount(iSave2);
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
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z4, i7, i8, i9, i10);
        int iMax2 = 0;
        if (this.f8485a != null) {
            Drawable drawable = this.f8494f;
            Rect rect = this.f8500k0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = AbstractC0616f0.b(this.f8485a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (q1.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f8479R + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f8479R) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.f8480S;
            int i12 = height2 - (i11 / 2);
            height = i11 + i12;
            paddingTop = i12;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f8480S + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f8480S;
        }
        this.f8482U = paddingLeft;
        this.f8483V = paddingTop;
        this.f8486a0 = height;
        this.f8484W = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
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
            intrinsicWidth = (this.f8485a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f8485a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f8471J) {
            iMax = (this.f8463B * 2) + Math.max(this.f8493e0.getWidth(), this.f8495f0.getWidth());
        } else {
            iMax = 0;
        }
        this.f8481T = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f8494f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f8494f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f8485a;
        if (drawable3 != null) {
            Rect rectB = AbstractC0616f0.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.f8488b0 ? Math.max(this.f8464C, (this.f8481T * 2) + iMax2 + iMax3) : this.f8464C;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f8479R = iMax4;
        this.f8480S = iMax5;
        super.onMeasure(i7, i8);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
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

    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f7;
        VelocityTracker velocityTracker = this.f8476O;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i7 = this.f8473L;
        if (actionMasked != 0) {
            float f8 = 0.0f;
            if (actionMasked == 1) {
                if (this.f8472K == 2) {
                    this.f8472K = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f8477P) {
                            targetCheckedState = q1.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f8472K = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i8 = this.f8472K;
                if (i8 == 1) {
                    float x4 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    float f9 = i7;
                    if (Math.abs(x4 - this.f8474M) > f9 || Math.abs(y4 - this.f8475N) > f9) {
                        this.f8472K = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f8474M = x4;
                        this.f8475N = y4;
                        return true;
                    }
                } else if (i8 == 2) {
                    float x7 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f10 = x7 - this.f8474M;
                    if (thumbScrollRange != 0) {
                        f7 = f10 / thumbScrollRange;
                    } else {
                        f7 = f10 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (q1.a(this)) {
                        f7 = -f7;
                    }
                    float f11 = this.f8478Q;
                    float f12 = f7 + f11;
                    if (f12 >= 0.0f) {
                        f8 = f12 > 1.0f ? 1.0f : f12;
                    }
                    if (f8 != f11) {
                        this.f8474M = x7;
                        setThumbPosition(f8);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f8472K == 2) {
                    this.f8472K = 0;
                    if (motionEvent.getAction() == 1) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    zIsChecked = isChecked();
                    if (z4) {
                        velocityTracker.computeCurrentVelocity(zzbbd.zzq.zzf);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f8477P) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (q1.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f8472K = 0;
                velocityTracker.clear();
            }
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
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f8467F;
                if (string == null) {
                    string = getResources().getString(com.salamadev.nabilalawadi.kisaskoran.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = P.U.f5037a;
                new P.D(com.salamadev.nabilalawadi.kisaskoran.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f8469H;
            if (string2 == null) {
                string2 = getResources().getString(com.salamadev.nabilalawadi.kisaskoran.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = P.U.f5037a;
            new P.D(com.salamadev.nabilalawadi.kisaskoran.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, obj2);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = P.U.f5037a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f8460l0, zIsChecked ? 1.0f : 0.0f);
                this.f8497h0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                V0.a(this.f8497h0, true);
                this.f8497h0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f8497h0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p097n3.a.Y(callback, this));
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
        Object string = this.f8469H;
        if (string == null) {
            string = getResources().getString(com.salamadev.nabilalawadi.kisaskoran.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        new P.D(com.salamadev.nabilalawadi.kisaskoran.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.f8467F;
        if (string == null) {
            string = getResources().getString(com.salamadev.nabilalawadi.kisaskoran.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = P.U.f5037a;
        new P.D(com.salamadev.nabilalawadi.kisaskoran.R.id.tag_state_description, CharSequence.class, 64, 30, 2).d(this, string);
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
        setThumbDrawable(p097n3.a.w(getContext(), i7));
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
        setTrackDrawable(p097n3.a.w(getContext(), i7));
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
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i7);
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
        int[] iArr = p051h.a.f13351x;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        P.U.g(this, context, iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        Drawable drawableU = c1017n0F.u(2);
        this.f8485a = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(this);
        }
        Drawable drawableU2 = c1017n0F.u(11);
        this.f8494f = drawableU2;
        if (drawableU2 != null) {
            drawableU2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.f8471J = typedArray.getBoolean(3, true);
        this.f8463B = typedArray.getDimensionPixelSize(8, 0);
        this.f8464C = typedArray.getDimensionPixelSize(5, 0);
        this.f8465D = typedArray.getDimensionPixelSize(6, 0);
        this.f8466E = typedArray.getBoolean(4, false);
        ColorStateList colorStateListQ = c1017n0F.q(9);
        if (colorStateListQ != null) {
            this.f8487b = colorStateListQ;
            this.f8490d = true;
        }
        PorterDuff.Mode modeC = AbstractC0616f0.c(typedArray.getInt(10, -1), null);
        if (this.f8489c != modeC) {
            this.f8489c = modeC;
            this.f8492e = true;
        }
        if (this.f8490d || this.f8492e) {
            a();
        }
        ColorStateList colorStateListQ2 = c1017n0F.q(12);
        if (colorStateListQ2 != null) {
            this.f8501x = colorStateListQ2;
            this.f8503z = true;
        }
        PorterDuff.Mode modeC2 = AbstractC0616f0.c(typedArray.getInt(13, -1), null);
        if (this.f8502y != modeC2) {
            this.f8502y = modeC2;
            this.f8462A = true;
        }
        if (this.f8503z || this.f8462A) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p051h.a.f13352y);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f8491d0 = colorStateList;
            } else {
                this.f8491d0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f7 = dimensionPixelSize;
                if (f7 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f7);
                    requestLayout();
                }
            }
            int i8 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i9 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i8 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i8 != 2) {
                typeface = i8 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i9 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i9) : Typeface.create(typeface, i9);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i10 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i9;
                textPaint.setFakeBoldText((i10 & 1) != 0);
                textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                p070k.a aVar = new p070k.a();
                aVar.f14656a = context2.getResources().getConfiguration().locale;
                this.f8496g0 = aVar;
            } else {
                this.f8496g0 = null;
            }
            setTextOnInternal(this.f8467F);
            setTextOffInternal(this.f8469H);
            typedArrayObtainStyledAttributes.recycle();
        }
        new F2.L0(this).f(attributeSet, i7);
        c1017n0F.H();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8473L = viewConfiguration.getScaledTouchSlop();
        this.f8477P = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i7);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
