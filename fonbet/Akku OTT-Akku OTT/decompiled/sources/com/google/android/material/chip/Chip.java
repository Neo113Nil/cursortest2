package com.google.android.material.chip;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.chip.c;
import com.google.android.material.internal.i;
import com.google.android.material.resources.f;
import com.google.android.material.shape.g;
import com.google.android.material.shape.h;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class Chip extends AppCompatCheckBox implements c.a, o, Checkable {
    public static final Rect r = new Rect();
    public static final int[] s = {R.attr.state_selected};
    public static final int[] t = {R.attr.state_checkable};

    @Nullable
    public final c a;

    @Nullable
    public InsetDrawable b;

    @Nullable
    public RippleDrawable c;

    @Nullable
    public CompoundButton.OnCheckedChangeListener d;
    public boolean e;
    public boolean f;
    public boolean i;
    public boolean j;
    public final boolean k;
    public int l;

    @Dimension(unit = 1)
    public int m;

    @Nullable
    public String n;
    public final Rect o;
    public final RectF p;
    public final a q;

    public class a extends f {
        public a() {
        }

        @Override // com.google.android.material.resources.f
        public final void a(int i) {
        }

        @Override // com.google.android.material.resources.f
        public final void b(@NonNull Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            c cVar = chip.a;
            chip.setText(cVar.B0 ? cVar.G : chip.getText());
            chip.requestLayout();
            chip.invalidate();
        }
    }

    public class b extends ExploreByTouchHelper {
        public b(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final int getVirtualViewAt(float f, float f2) {
            Rect rect = Chip.r;
            Chip chip = Chip.this;
            if (!chip.d()) {
                return 0;
            }
            RectF rectF = chip.p;
            rectF.setEmpty();
            chip.d();
            return rectF.contains(f, f2) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void getVisibleVirtualViews(@NonNull List<Integer> list) {
            list.add(0);
            Rect rect = Chip.r;
            Chip.this.d();
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                Chip chip = Chip.this;
                if (i == 0) {
                    return chip.performClick();
                }
                if (i == 1) {
                    chip.playSoundEffect(0);
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Chip chip = Chip.this;
            c cVar = chip.a;
            accessibilityNodeInfoCompat.setCheckable(cVar != null && cVar.R);
            accessibilityNodeInfoCompat.setClickable(chip.isClickable());
            accessibilityNodeInfoCompat.setClassName(chip.getAccessibilityClassName());
            accessibilityNodeInfoCompat.setText(chip.getText());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onPopulateNodeForVirtualView(int i, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i != 1) {
                accessibilityNodeInfoCompat.setContentDescription("");
                accessibilityNodeInfoCompat.setBoundsInParent(Chip.r);
                return;
            }
            Chip chip = Chip.this;
            CharSequence text = chip.getText();
            accessibilityNodeInfoCompat.setContentDescription(chip.getContext().getString(com.haryanvi.netstream.R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            RectF rectF = chip.p;
            rectF.setEmpty();
            chip.d();
            Rect rect = chip.o;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
            accessibilityNodeInfoCompat.setEnabled(chip.isEnabled());
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.j = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.haryanvi.netstream.R.attr.chipStyle);
        c cVar;
        int resourceId;
        int resourceId2;
        ColorStateList a2;
        Drawable drawable;
        int resourceId3;
        this.o = new Rect();
        this.p = new RectF();
        this.q = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        c cVar2 = new c(context2, attributeSet);
        Context context3 = cVar2.d0;
        int[] iArr = com.google.android.material.a.d;
        TypedArray d = i.d(context3, attributeSet, iArr, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        cVar2.D0 = d.hasValue(37);
        Context context4 = cVar2.d0;
        ColorStateList a3 = com.google.android.material.resources.c.a(context4, d, 24);
        if (cVar2.z != a3) {
            cVar2.z = a3;
            cVar2.onStateChange(cVar2.getState());
        }
        ColorStateList a4 = com.google.android.material.resources.c.a(context4, d, 11);
        if (cVar2.A != a4) {
            cVar2.A = a4;
            cVar2.onStateChange(cVar2.getState());
        }
        float dimension = d.getDimension(19, 0.0f);
        if (cVar2.B != dimension) {
            cVar2.B = dimension;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        if (d.hasValue(12)) {
            float dimension2 = d.getDimension(12, 0.0f);
            if (cVar2.C != dimension2) {
                cVar2.C = dimension2;
                k.a e = cVar2.a.a.e();
                e.e = new com.google.android.material.shape.a(dimension2);
                e.f = new com.google.android.material.shape.a(dimension2);
                e.g = new com.google.android.material.shape.a(dimension2);
                e.h = new com.google.android.material.shape.a(dimension2);
                cVar2.b(e.a());
            }
        }
        ColorStateList a5 = com.google.android.material.resources.c.a(context4, d, 22);
        if (cVar2.D != a5) {
            cVar2.D = a5;
            if (cVar2.D0) {
                g.b bVar = cVar2.a;
                if (bVar.d != a5) {
                    bVar.d = a5;
                    cVar2.onStateChange(cVar2.getState());
                }
            }
            cVar2.onStateChange(cVar2.getState());
        }
        float dimension3 = d.getDimension(23, 0.0f);
        if (cVar2.E != dimension3) {
            cVar2.E = dimension3;
            cVar2.e0.setStrokeWidth(dimension3);
            if (cVar2.D0) {
                cVar2.a.j = dimension3;
                cVar2.invalidateSelf();
            }
            cVar2.invalidateSelf();
        }
        ColorStateList a6 = com.google.android.material.resources.c.a(context4, d, 36);
        if (cVar2.F != a6) {
            cVar2.F = a6;
            cVar2.y0 = null;
            cVar2.onStateChange(cVar2.getState());
        }
        String text = d.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(cVar2.G, text)) {
            cVar2.G = text;
            cVar2.j0.d = true;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        com.google.android.material.resources.d dVar = (!d.hasValue(0) || (resourceId3 = d.getResourceId(0, 0)) == 0) ? null : new com.google.android.material.resources.d(context4, resourceId3);
        dVar.k = d.getDimension(1, dVar.k);
        cVar2.B(dVar);
        int i = d.getInt(3, 0);
        if (i == 1) {
            cVar2.A0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            cVar2.A0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            cVar2.A0 = TextUtils.TruncateAt.END;
        }
        cVar2.z(d.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            cVar2.z(d.getBoolean(15, false));
        }
        Drawable c = com.google.android.material.resources.c.c(context4, d, 14);
        Drawable drawable2 = cVar2.I;
        Drawable unwrap = drawable2 != null ? DrawableCompat.unwrap(drawable2) : null;
        if (unwrap != c) {
            float r2 = cVar2.r();
            cVar2.I = c != null ? DrawableCompat.wrap(c).mutate() : null;
            float r3 = cVar2.r();
            c.F(unwrap);
            if (cVar2.D()) {
                cVar2.p(cVar2.I);
            }
            cVar2.invalidateSelf();
            if (r2 != r3) {
                cVar2.w();
            }
        }
        if (d.hasValue(17)) {
            ColorStateList a7 = com.google.android.material.resources.c.a(context4, d, 17);
            cVar2.L = true;
            if (cVar2.J != a7) {
                cVar2.J = a7;
                if (cVar2.D()) {
                    DrawableCompat.setTintList(cVar2.I, a7);
                }
                cVar2.onStateChange(cVar2.getState());
            }
        }
        float dimension4 = d.getDimension(16, -1.0f);
        if (cVar2.K != dimension4) {
            float r4 = cVar2.r();
            cVar2.K = dimension4;
            float r5 = cVar2.r();
            cVar2.invalidateSelf();
            if (r4 != r5) {
                cVar2.w();
            }
        }
        cVar2.A(d.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            cVar2.A(d.getBoolean(26, false));
        }
        Drawable c2 = com.google.android.material.resources.c.c(context4, d, 25);
        Drawable drawable3 = cVar2.N;
        Drawable unwrap2 = drawable3 != null ? DrawableCompat.unwrap(drawable3) : null;
        if (unwrap2 != c2) {
            float s2 = cVar2.s();
            cVar2.N = c2 != null ? DrawableCompat.wrap(c2).mutate() : null;
            cVar2.O = new RippleDrawable(com.google.android.material.ripple.a.a(cVar2.F), cVar2.N, c.F0);
            float s3 = cVar2.s();
            c.F(unwrap2);
            if (cVar2.E()) {
                cVar2.p(cVar2.N);
            }
            cVar2.invalidateSelf();
            if (s2 != s3) {
                cVar2.w();
            }
        }
        ColorStateList a8 = com.google.android.material.resources.c.a(context4, d, 30);
        if (cVar2.P != a8) {
            cVar2.P = a8;
            if (cVar2.E()) {
                DrawableCompat.setTintList(cVar2.N, a8);
            }
            cVar2.onStateChange(cVar2.getState());
        }
        float dimension5 = d.getDimension(28, 0.0f);
        if (cVar2.Q != dimension5) {
            cVar2.Q = dimension5;
            cVar2.invalidateSelf();
            if (cVar2.E()) {
                cVar2.w();
            }
        }
        boolean z = d.getBoolean(6, false);
        if (cVar2.R != z) {
            cVar2.R = z;
            float r6 = cVar2.r();
            if (!z && cVar2.q0) {
                cVar2.q0 = false;
            }
            float r7 = cVar2.r();
            cVar2.invalidateSelf();
            if (r6 != r7) {
                cVar2.w();
            }
        }
        cVar2.y(d.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            cVar2.y(d.getBoolean(8, false));
        }
        Drawable c3 = com.google.android.material.resources.c.c(context4, d, 7);
        if (cVar2.T != c3) {
            float r8 = cVar2.r();
            cVar2.T = c3;
            float r9 = cVar2.r();
            c.F(cVar2.T);
            cVar2.p(cVar2.T);
            cVar2.invalidateSelf();
            if (r8 != r9) {
                cVar2.w();
            }
        }
        if (d.hasValue(9) && cVar2.U != (a2 = com.google.android.material.resources.c.a(context4, d, 9))) {
            cVar2.U = a2;
            if (cVar2.S && (drawable = cVar2.T) != null && cVar2.R) {
                DrawableCompat.setTintList(drawable, a2);
            }
            cVar2.onStateChange(cVar2.getState());
        }
        if (d.hasValue(39) && (resourceId2 = d.getResourceId(39, 0)) != 0) {
            com.google.android.material.animation.c.a(context4, resourceId2);
        }
        if (d.hasValue(33) && (resourceId = d.getResourceId(33, 0)) != 0) {
            com.google.android.material.animation.c.a(context4, resourceId);
        }
        float dimension6 = d.getDimension(21, 0.0f);
        if (cVar2.V != dimension6) {
            cVar2.V = dimension6;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        float dimension7 = d.getDimension(35, 0.0f);
        if (cVar2.W != dimension7) {
            float r10 = cVar2.r();
            cVar2.W = dimension7;
            float r11 = cVar2.r();
            cVar2.invalidateSelf();
            if (r10 != r11) {
                cVar2.w();
            }
        }
        float dimension8 = d.getDimension(34, 0.0f);
        if (cVar2.X != dimension8) {
            float r12 = cVar2.r();
            cVar2.X = dimension8;
            float r13 = cVar2.r();
            cVar2.invalidateSelf();
            if (r12 != r13) {
                cVar2.w();
            }
        }
        float dimension9 = d.getDimension(41, 0.0f);
        if (cVar2.Y != dimension9) {
            cVar2.Y = dimension9;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        float dimension10 = d.getDimension(40, 0.0f);
        if (cVar2.Z != dimension10) {
            cVar2.Z = dimension10;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        float dimension11 = d.getDimension(29, 0.0f);
        if (cVar2.a0 != dimension11) {
            cVar2.a0 = dimension11;
            cVar2.invalidateSelf();
            if (cVar2.E()) {
                cVar2.w();
            }
        }
        float dimension12 = d.getDimension(27, 0.0f);
        if (cVar2.b0 != dimension12) {
            cVar2.b0 = dimension12;
            cVar2.invalidateSelf();
            if (cVar2.E()) {
                cVar2.w();
            }
        }
        float dimension13 = d.getDimension(13, 0.0f);
        if (cVar2.c0 != dimension13) {
            cVar2.c0 = dimension13;
            cVar2.invalidateSelf();
            cVar2.w();
        }
        cVar2.C0 = d.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d.recycle();
        i.a(context2, attributeSet, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action);
        i.b(context2, attributeSet, iArr, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action);
        this.k = obtainStyledAttributes.getBoolean(32, false);
        this.m = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        c cVar3 = this.a;
        if (cVar3 != cVar2) {
            if (cVar3 != null) {
                cVar3.z0 = new WeakReference<>(null);
            }
            this.a = cVar2;
            cVar2.B0 = false;
            cVar2.z0 = new WeakReference<>(this);
            c(this.m);
        }
        cVar2.k(ViewCompat.getElevation(this));
        i.a(context2, attributeSet, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action);
        i.b(context2, attributeSet, iArr, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.haryanvi.netstream.R.attr.chipStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        new b(this);
        if (d() && (cVar = this.a) != null) {
            boolean z2 = cVar.M;
        }
        ViewCompat.setAccessibilityDelegate(this, null);
        if (!hasValue) {
            setOutlineProvider(new com.google.android.material.chip.b(this));
        }
        setChecked(this.e);
        setText(cVar2.G);
        setEllipsize(cVar2.A0);
        g();
        if (!this.a.B0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        super.setGravity(8388627);
        f();
        if (this.k) {
            setMinHeight(this.m);
        }
        this.l = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.google.android.material.chip.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.d;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
                }
            }
        });
    }

    @Override // com.google.android.material.chip.c.a
    public final void a() {
        c(this.m);
        requestLayout();
        invalidateOutline();
    }

    @Override // com.google.android.material.shape.o
    public final void b(@NonNull k kVar) {
        this.a.b(kVar);
    }

    public final void c(@Dimension int i) {
        this.m = i;
        if (!this.k) {
            InsetDrawable insetDrawable = this.b;
            if (insetDrawable == null) {
                e();
                return;
            }
            if (insetDrawable != null) {
                this.b = null;
                setMinWidth(0);
                c cVar = this.a;
                setMinHeight((int) (cVar != null ? cVar.B : 0.0f));
                e();
                return;
            }
            return;
        }
        int max = Math.max(0, i - ((int) this.a.B));
        int max2 = Math.max(0, i - this.a.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.b;
            if (insetDrawable2 == null) {
                e();
                return;
            }
            if (insetDrawable2 != null) {
                this.b = null;
                setMinWidth(0);
                c cVar2 = this.a;
                setMinHeight((int) (cVar2 != null ? cVar2.B : 0.0f));
                e();
                return;
            }
            return;
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.b != null) {
            Rect rect = new Rect();
            this.b.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.b = new InsetDrawable((Drawable) this.a, i2, i3, i2, i3);
        e();
    }

    public final boolean d() {
        c cVar = this.a;
        if (cVar == null) {
            return false;
        }
        Drawable drawable = cVar.N;
        return (drawable != null ? DrawableCompat.unwrap(drawable) : null) != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        boolean z = false;
        c cVar = this.a;
        if (cVar != null && c.v(cVar.N)) {
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.j) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.i) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.j) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.i) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            c cVar2 = this.a;
            if (!Arrays.equals(cVar2.x0, iArr)) {
                cVar2.x0 = iArr;
                if (cVar2.E()) {
                    z = cVar2.x(cVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        ColorStateList a2 = com.google.android.material.ripple.a.a(this.a.F);
        Drawable drawable = this.b;
        if (drawable == null) {
            drawable = this.a;
        }
        this.c = new RippleDrawable(a2, drawable, null);
        this.a.getClass();
        ViewCompat.setBackground(this, this.c);
        f();
    }

    public final void f() {
        c cVar;
        if (TextUtils.isEmpty(getText()) || (cVar = this.a) == null) {
            return;
        }
        int s2 = (int) (cVar.s() + cVar.c0 + cVar.Z);
        c cVar2 = this.a;
        int r2 = (int) (cVar2.r() + cVar2.V + cVar2.Y);
        if (this.b != null) {
            Rect rect = new Rect();
            this.b.getPadding(rect);
            r2 += rect.left;
            s2 += rect.right;
        }
        ViewCompat.setPaddingRelative(this, r2, getPaddingTop(), s2, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        c cVar = this.a;
        if (cVar != null) {
            paint.drawableState = cVar.getState();
        }
        c cVar2 = this.a;
        com.google.android.material.resources.d dVar = cVar2 != null ? cVar2.j0.f : null;
        if (dVar != null) {
            dVar.d(getContext(), paint, this.q);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.n)) {
            return this.n;
        }
        c cVar = this.a;
        if (cVar == null || !cVar.R) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        if (!(parent instanceof d)) {
            return "android.widget.Button";
        }
        ((d) parent).getClass();
        throw null;
    }

    @Override // android.widget.TextView
    @Nullable
    public final TextUtils.TruncateAt getEllipsize() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar.A0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, this.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, s);
        }
        c cVar = this.a;
        if (cVar != null && cVar.R) {
            View.mergeDrawableStates(onCreateDrawableState, t);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            RectF rectF = this.p;
            rectF.setEmpty();
            d();
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (this.i != contains) {
                this.i = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.i) {
            this.i = false;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        c cVar = this.a;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.R);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof d) {
            d dVar = (d) getParent();
            AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
            dVar.getClass();
            Object tag = getTag(com.haryanvi.netstream.R.id.row_index_key);
            wrap.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        RectF rectF = this.p;
        rectF.setEmpty();
        d();
        return (rectF.contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.l != i) {
            this.l = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r0 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        RectF rectF = this.p;
        rectF.setEmpty();
        d();
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    boolean z2 = this.f;
                    if (z2) {
                        if (!contains && z2) {
                            this.f = false;
                            refreshDrawableState();
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.f) {
                playSoundEffect(0);
                z = true;
                if (this.f) {
                    this.f = false;
                    refreshDrawableState();
                }
            }
            z = false;
            if (this.f) {
            }
        } else {
            if (contains) {
                if (!this.f) {
                    this.f = true;
                    refreshDrawableState();
                }
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            drawable2 = this.a;
        }
        if (drawable == drawable2 || drawable == this.c) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 == null) {
            drawable2 = this.a;
        }
        if (drawable == drawable2 || drawable == this.c) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public final void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        c cVar = this.a;
        if (cVar == null) {
            this.e = z;
        } else if (cVar.R) {
            super.setChecked(z);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final void setElevation(float f) {
        super.setElevation(f);
        c cVar = this.a;
        if (cVar != null) {
            cVar.k(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.a == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c cVar = this.a;
        if (cVar != null) {
            cVar.A0 = truncateAt;
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.a == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(@Px int i) {
        super.setMaxWidth(i);
        c cVar = this.a;
        if (cVar != null) {
            cVar.C0 = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c cVar = this.a;
        if (cVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(cVar.B0 ? null : charSequence, bufferType);
        c cVar2 = this.a;
        if (cVar2 == null || TextUtils.equals(cVar2.G, charSequence)) {
            return;
        }
        cVar2.G = charSequence;
        cVar2.j0.d = true;
        cVar2.invalidateSelf();
        cVar2.w();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        c cVar = this.a;
        if (cVar != null) {
            cVar.B(new com.google.android.material.resources.d(cVar.d0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        c cVar = this.a;
        if (cVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            com.google.android.material.internal.g gVar = cVar.j0;
            com.google.android.material.resources.d dVar = gVar.f;
            if (dVar != null) {
                dVar.k = applyDimension;
                gVar.a.setTextSize(applyDimension);
                cVar.a();
            }
        }
        g();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        c cVar = this.a;
        if (cVar != null) {
            cVar.B(new com.google.android.material.resources.d(cVar.d0, i));
        }
        g();
    }
}
