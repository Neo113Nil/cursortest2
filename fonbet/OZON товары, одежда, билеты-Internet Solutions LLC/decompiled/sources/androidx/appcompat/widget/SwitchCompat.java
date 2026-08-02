package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.emoji2.text.j;
import i.C6977a;
import java.lang.ref.WeakReference;
import l.C7755a;

/* loaded from: classes8.dex */
public class SwitchCompat extends CompoundButton implements J {

    /* renamed from: R, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f37765R = new a(Float.class, "thumbPos");

    /* renamed from: S, reason: collision with root package name */
    private static final int[] f37766S = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private int f37767A;

    /* renamed from: B, reason: collision with root package name */
    private int f37768B;

    /* renamed from: C, reason: collision with root package name */
    private int f37769C;

    /* renamed from: D, reason: collision with root package name */
    private int f37770D;

    /* renamed from: E, reason: collision with root package name */
    private int f37771E;

    /* renamed from: F, reason: collision with root package name */
    private int f37772F;

    /* renamed from: G, reason: collision with root package name */
    private int f37773G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f37774H;

    /* renamed from: I, reason: collision with root package name */
    private final TextPaint f37775I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f37776J;

    /* renamed from: K, reason: collision with root package name */
    private StaticLayout f37777K;

    /* renamed from: L, reason: collision with root package name */
    private StaticLayout f37778L;

    /* renamed from: M, reason: collision with root package name */
    private C7755a f37779M;

    /* renamed from: N, reason: collision with root package name */
    ObjectAnimator f37780N;

    /* renamed from: O, reason: collision with root package name */
    @NonNull
    private C5066k f37781O;

    /* renamed from: P, reason: collision with root package name */
    private b f37782P;

    /* renamed from: Q, reason: collision with root package name */
    private final Rect f37783Q;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f37784a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f37785b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f37786c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37787d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37788e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f37789f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f37790g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f37791h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f37792i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37793j;

    /* renamed from: k, reason: collision with root package name */
    private int f37794k;

    /* renamed from: l, reason: collision with root package name */
    private int f37795l;

    /* renamed from: m, reason: collision with root package name */
    private int f37796m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f37797n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f37798o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f37799p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f37800q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f37801r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f37802s;

    /* renamed from: t, reason: collision with root package name */
    private int f37803t;

    /* renamed from: u, reason: collision with root package name */
    private int f37804u;

    /* renamed from: v, reason: collision with root package name */
    private float f37805v;

    /* renamed from: w, reason: collision with root package name */
    private float f37806w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f37807x;

    /* renamed from: y, reason: collision with root package name */
    private int f37808y;

    /* renamed from: z, reason: collision with root package name */
    float f37809z;

    final class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f37809z);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f7) {
            SwitchCompat switchCompat2 = switchCompat;
            switchCompat2.f37809z = f7.floatValue();
            switchCompat2.invalidate();
        }
    }

    static class b extends j.f {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f37810a;

        b(SwitchCompat switchCompat) {
            this.f37810a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.j.f
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f37810a.get();
            if (switchCompat != null) {
                switchCompat.h();
            }
        }

        @Override // androidx.emoji2.text.j.f
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f37810a.get();
            if (switchCompat != null) {
                switchCompat.h();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        Drawable drawable = this.f37784a;
        if (drawable != null) {
            boolean z11 = this.f37787d;
            boolean z12 = this.f37788e;
            if (z11 || z12) {
                Drawable mutate = drawable.mutate();
                this.f37784a = mutate;
                if (this.f37787d) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f37785b);
                }
                if (z12) {
                    androidx.core.graphics.drawable.a.k(this.f37784a, this.f37786c);
                }
                if (this.f37784a.isStateful()) {
                    this.f37784a.setState(getDrawableState());
                }
            }
        }
    }

    private void b() {
        Drawable drawable = this.f37789f;
        if (drawable != null) {
            boolean z11 = this.f37792i;
            boolean z12 = this.f37793j;
            if (z11 || z12) {
                Drawable mutate = drawable.mutate();
                this.f37789f = mutate;
                if (this.f37792i) {
                    androidx.core.graphics.drawable.a.j(mutate, this.f37790g);
                }
                if (z12) {
                    androidx.core.graphics.drawable.a.k(this.f37789f, this.f37791h);
                }
                if (this.f37789f.isStateful()) {
                    this.f37789f.setState(getDrawableState());
                }
            }
        }
    }

    @NonNull
    private C5066k c() {
        if (this.f37781O == null) {
            this.f37781O = new C5066k(this);
        }
        return this.f37781O;
    }

    private int d() {
        int i11 = i0.f37951d;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.f37809z : this.f37809z) * e()) + 0.5f);
    }

    private int e() {
        Drawable drawable = this.f37789f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f37783Q;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f37784a;
        Rect b11 = drawable2 != null ? H.b(drawable2) : H.f37629c;
        return ((((this.f37767A - this.f37769C) - rect.left) - rect.right) - b11.left) - b11.right;
    }

    private void k(CharSequence charSequence) {
        this.f37800q = charSequence;
        TransformationMethod f7 = c().f(this.f37779M);
        if (f7 != null) {
            charSequence = f7.getTransformation(charSequence, this);
        }
        this.f37801r = charSequence;
        this.f37778L = null;
        if (this.f37802s) {
            p();
        }
    }

    private void m(CharSequence charSequence) {
        this.f37798o = charSequence;
        TransformationMethod f7 = c().f(this.f37779M);
        if (f7 != null) {
            charSequence = f7.getTransformation(charSequence, this);
        }
        this.f37799p = charSequence;
        this.f37777K = null;
        if (this.f37802s) {
            p();
        }
    }

    private void p() {
        if (this.f37782P == null && this.f37781O.b() && androidx.emoji2.text.j.j()) {
            androidx.emoji2.text.j c11 = androidx.emoji2.text.j.c();
            int f7 = c11.f();
            if (f7 == 3 || f7 == 0) {
                b bVar = new b(this);
                this.f37782P = bVar;
                c11.o(bVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        int i11;
        int i12;
        int i13 = this.f37770D;
        int i14 = this.f37771E;
        int i15 = this.f37772F;
        int i16 = this.f37773G;
        int d11 = d() + i13;
        Drawable drawable = this.f37784a;
        Rect b11 = drawable != null ? H.b(drawable) : H.f37629c;
        Drawable drawable2 = this.f37789f;
        Rect rect = this.f37783Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i17 = rect.left;
            d11 += i17;
            if (b11 != null) {
                int i18 = b11.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = b11.top;
                int i21 = rect.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = b11.right;
                int i23 = rect.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = b11.bottom;
                int i25 = rect.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                    this.f37789f.setBounds(i13, i11, i15, i12);
                }
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f37789f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f37784a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i26 = d11 - rect.left;
            int i27 = d11 + this.f37769C + rect.right;
            this.f37784a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.g(background, i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f7, float f11) {
        super.drawableHotspotChanged(f7, f11);
        Drawable drawable = this.f37784a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, f7, f11);
        }
        Drawable drawable2 = this.f37789f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.f(drawable2, f7, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f37784a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f37789f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final ColorStateList f() {
        return this.f37785b;
    }

    public final ColorStateList g() {
        return this.f37790g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        int i11 = i0.f37951d;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f37767A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f37796m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        int i11 = i0.f37951d;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f37767A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f37796m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.l(super.getCustomSelectionActionModeCallback());
    }

    final void h() {
        m(this.f37798o);
        k(this.f37800q);
        requestLayout();
    }

    public final void i(Typeface typeface) {
        TextPaint textPaint = this.f37775I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void j(String str) {
        k(str);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence charSequence = this.f37800q;
        if (charSequence == null) {
            charSequence = getResources().getString(ru.ozon.app.android.R.string.abc_capital_off);
        }
        androidx.core.view.Y.N(this, charSequence);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f37784a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f37789f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f37780N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f37780N.end();
        this.f37780N = null;
    }

    public final void l(String str) {
        m(str);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence charSequence = this.f37798o;
        if (charSequence == null) {
            charSequence = getResources().getString(ru.ozon.app.android.R.string.abc_capital_on);
        }
        androidx.core.view.Y.N(this, charSequence);
    }

    public final void n(ColorStateList colorStateList) {
        this.f37785b = colorStateList;
        this.f37787d = true;
        a();
    }

    public final void o(ColorStateList colorStateList) {
        this.f37790g = colorStateList;
        this.f37792i = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f37766S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f37789f;
        Rect rect = this.f37783Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.f37771E;
        int i12 = this.f37773G;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f37784a;
        if (drawable != null) {
            if (!this.f37797n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b11 = H.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b11.left;
                rect.right -= b11.right;
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
        StaticLayout staticLayout = this.f37809z > 0.5f ? this.f37777K : this.f37778L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f37776J;
            TextPaint textPaint = this.f37775I;
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
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i13 + i14) / 2) - (staticLayout.getHeight() / 2));
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
            CharSequence charSequence = isChecked() ? this.f37798o : this.f37800q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int width;
        int i16;
        int i17;
        int i18;
        super.onLayout(z11, i11, i12, i13, i14);
        int i19 = 0;
        if (this.f37784a != null) {
            Drawable drawable = this.f37789f;
            Rect rect = this.f37783Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b11 = H.b(this.f37784a);
            i15 = Math.max(0, b11.left - rect.left);
            i19 = Math.max(0, b11.right - rect.right);
        } else {
            i15 = 0;
        }
        int i21 = i0.f37951d;
        if (getLayoutDirection() == 1) {
            i16 = getPaddingLeft() + i15;
            width = ((this.f37767A + i16) - i15) - i19;
        } else {
            width = (getWidth() - getPaddingRight()) - i19;
            i16 = (width - this.f37767A) + i15 + i19;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i22 = this.f37768B;
            int i23 = height - (i22 / 2);
            i17 = i22 + i23;
            i18 = i23;
        } else if (gravity != 80) {
            i18 = getPaddingTop();
            i17 = this.f37768B + i18;
        } else {
            i17 = getHeight() - getPaddingBottom();
            i18 = i17 - this.f37768B;
        }
        this.f37770D = i16;
        this.f37771E = i18;
        this.f37773G = i17;
        this.f37772F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        boolean z11 = this.f37802s;
        int i15 = 0;
        if (z11) {
            StaticLayout staticLayout = this.f37777K;
            TextPaint textPaint = this.f37775I;
            if (staticLayout == null) {
                CharSequence charSequence = this.f37799p;
                this.f37777K = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f37778L == null) {
                CharSequence charSequence2 = this.f37801r;
                this.f37778L = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f37784a;
        Rect rect = this.f37783Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i13 = (this.f37784a.getIntrinsicWidth() - rect.left) - rect.right;
            i14 = this.f37784a.getIntrinsicHeight();
        } else {
            i13 = 0;
            i14 = 0;
        }
        this.f37769C = Math.max(z11 ? (this.f37794k * 2) + Math.max(this.f37777K.getWidth(), this.f37778L.getWidth()) : 0, i13);
        Drawable drawable2 = this.f37789f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i15 = this.f37789f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i16 = rect.left;
        int i17 = rect.right;
        Drawable drawable3 = this.f37784a;
        if (drawable3 != null) {
            Rect b11 = H.b(drawable3);
            i16 = Math.max(i16, b11.left);
            i17 = Math.max(i17, b11.right);
        }
        boolean z12 = this.f37774H;
        int i18 = this.f37795l;
        if (z12) {
            i18 = Math.max(i18, (this.f37769C * 2) + i16 + i17);
        }
        int max = Math.max(i15, i14);
        this.f37767A = i18;
        this.f37768B = max;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f37798o : this.f37800q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        if (r9.f37809z > 0.5f) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L84;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker = this.f37807x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f37804u;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i12 = this.f37803t;
                    if (i12 == 1) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        float f7 = i11;
                        if (Math.abs(x11 - this.f37805v) > f7 || Math.abs(y11 - this.f37806w) > f7) {
                            this.f37803t = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f37805v = x11;
                            this.f37806w = y11;
                            return true;
                        }
                    } else if (i12 == 2) {
                        float x12 = motionEvent.getX();
                        int e11 = e();
                        float f11 = x12 - this.f37805v;
                        float f12 = e11 != 0 ? f11 / e11 : f11 > 0.0f ? 1.0f : -1.0f;
                        int i13 = i0.f37951d;
                        if (getLayoutDirection() == 1) {
                            f12 = -f12;
                        }
                        float f13 = this.f37809z;
                        float f14 = f12 + f13;
                        float f15 = f14 >= 0.0f ? f14 > 1.0f ? 1.0f : f14 : 0.0f;
                        if (f15 != f13) {
                            this.f37805v = x12;
                            this.f37809z = f15;
                            invalidate();
                        }
                        return true;
                    }
                }
            }
            if (this.f37803t == 2) {
                this.f37803t = 0;
                boolean z12 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z12) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker.getXVelocity();
                    if (Math.abs(xVelocity) > this.f37808y) {
                        int i14 = i0.f37951d;
                        z11 = getLayoutDirection() != 1 ? false : false;
                    }
                } else {
                    z11 = isChecked;
                }
                if (z11 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z11);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f37803t = 0;
            velocityTracker.clear();
        } else {
            float x13 = motionEvent.getX();
            float y12 = motionEvent.getY();
            if (isEnabled() && this.f37784a != null) {
                int d11 = d();
                Drawable drawable = this.f37784a;
                Rect rect = this.f37783Q;
                drawable.getPadding(rect);
                int i15 = this.f37771E - i11;
                int i16 = (this.f37770D + d11) - i11;
                int i17 = this.f37769C + i16 + rect.left + rect.right + i11;
                int i18 = this.f37773G + i11;
                if (x13 > i16 && x13 < i17 && y12 > i15 && y12 < i18) {
                    this.f37803t = 1;
                    this.f37805v = x13;
                    this.f37806w = y12;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z11) {
        super.setAllCaps(z11);
        c().d(z11);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence charSequence = this.f37798o;
                if (charSequence == null) {
                    charSequence = getResources().getString(ru.ozon.app.android.R.string.abc_capital_on);
                }
                androidx.core.view.Y.N(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.f37800q;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(ru.ozon.app.android.R.string.abc_capital_off);
            }
            androidx.core.view.Y.N(this, charSequence2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.f37780N;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.f37809z = isChecked ? 1.0f : 0.0f;
            invalidate();
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f37765R, isChecked ? 1.0f : 0.0f);
        this.f37780N = ofFloat;
        ofFloat.setDuration(250L);
        this.f37780N.setAutoCancel(true);
        this.f37780N.start();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.m(callback, this));
    }

    @Override // androidx.appcompat.widget.J
    public final void setEmojiCompatEnabled(boolean z11) {
        c().e(false);
        m(this.f37798o);
        k(this.f37800q);
        requestLayout();
    }

    @Override // android.widget.TextView
    public final void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(c().a(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f37784a || drawable == this.f37789f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, ru.ozon.app.android.R.attr.switchStyle);
        this.f37785b = null;
        this.f37786c = null;
        this.f37787d = false;
        this.f37788e = false;
        this.f37790g = null;
        this.f37791h = null;
        this.f37792i = false;
        this.f37793j = false;
        this.f37807x = VelocityTracker.obtain();
        this.f37774H = true;
        this.f37783Q = new Rect();
        W.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f37775I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C6977a.f65669w;
        b0 v11 = b0.v(context, attributeSet, iArr, ru.ozon.app.android.R.attr.switchStyle, 0);
        androidx.core.view.Y.B(this, context, iArr, attributeSet, v11.r(), ru.ozon.app.android.R.attr.switchStyle);
        Drawable g10 = v11.g(2);
        this.f37784a = g10;
        if (g10 != null) {
            g10.setCallback(this);
        }
        Drawable g11 = v11.g(11);
        this.f37789f = g11;
        if (g11 != null) {
            g11.setCallback(this);
        }
        m(v11.p(0));
        k(v11.p(1));
        this.f37802s = v11.a(3, true);
        this.f37794k = v11.f(8, 0);
        this.f37795l = v11.f(5, 0);
        this.f37796m = v11.f(6, 0);
        this.f37797n = v11.a(4, false);
        ColorStateList c11 = v11.c(9);
        if (c11 != null) {
            this.f37785b = c11;
            this.f37787d = true;
        }
        PorterDuff.Mode c12 = H.c(v11.k(10, -1), null);
        if (c12 != null) {
            this.f37786c = c12;
            this.f37788e = true;
        }
        if (this.f37787d || this.f37788e) {
            a();
        }
        ColorStateList c13 = v11.c(12);
        if (c13 != null) {
            this.f37790g = c13;
            this.f37792i = true;
        }
        PorterDuff.Mode c14 = H.c(v11.k(13, -1), null);
        if (c14 != null) {
            this.f37791h = c14;
            this.f37793j = true;
        }
        if (this.f37792i || this.f37793j) {
            b();
        }
        int n11 = v11.n(7, 0);
        if (n11 != 0) {
            b0 t2 = b0.t(context, n11, C6977a.f65670x);
            ColorStateList c15 = t2.c(3);
            if (c15 != null) {
                this.f37776J = c15;
            } else {
                this.f37776J = getTextColors();
            }
            int f7 = t2.f(0, 0);
            if (f7 != 0) {
                float f11 = f7;
                if (f11 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f11);
                    requestLayout();
                }
            }
            int k11 = t2.k(1, -1);
            int k12 = t2.k(2, -1);
            Typeface typeface = k11 != 1 ? k11 != 2 ? k11 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (k12 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(k12) : Typeface.create(typeface, k12);
                i(defaultFromStyle);
                int i12 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & k12;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                i(typeface);
            }
            if (t2.a(14, false)) {
                this.f37779M = new C7755a(getContext());
            } else {
                this.f37779M = null;
            }
            m(this.f37798o);
            k(this.f37800q);
            t2.x();
        }
        new C5080z(this).m(attributeSet, ru.ozon.app.android.R.attr.switchStyle);
        v11.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f37804u = viewConfiguration.getScaledTouchSlop();
        this.f37808y = viewConfiguration.getScaledMinimumFlingVelocity();
        c().c(attributeSet, ru.ozon.app.android.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
