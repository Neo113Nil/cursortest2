package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.compose.runtime.C0211b;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.media3.common.C0338w;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.g;
import com.google.android.material.shape.k;
import com.google.android.material.textfield.i;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    @Nullable
    public final ColorStateList A;
    public boolean A0;

    @Nullable
    public final ColorStateList B;
    public boolean B0;

    @Nullable
    public final ColorStateList C;
    public boolean C0;

    @Nullable
    public final ColorStateList D;
    public final boolean E;
    public CharSequence F;
    public boolean G;

    @Nullable
    public com.google.android.material.shape.g H;
    public com.google.android.material.shape.g I;
    public StateListDrawable J;
    public boolean K;

    @Nullable
    public com.google.android.material.shape.g L;

    @Nullable
    public com.google.android.material.shape.g M;

    @NonNull
    public com.google.android.material.shape.k N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final int T;
    public final int U;

    @ColorInt
    public int V;

    @ColorInt
    public int W;

    @NonNull
    public final FrameLayout a;
    public final Rect a0;

    @NonNull
    public final B b;
    public final Rect b0;

    @NonNull
    public final s c;
    public final RectF c0;
    public EditText d;

    @Nullable
    public ColorDrawable d0;
    public CharSequence e;
    public int e0;
    public int f;
    public final LinkedHashSet<d> f0;

    @Nullable
    public ColorDrawable g0;
    public int h0;
    public int i;
    public Drawable i0;
    public int j;
    public ColorStateList j0;
    public int k;
    public final ColorStateList k0;
    public final v l;

    @ColorInt
    public final int l0;
    public final boolean m;

    @ColorInt
    public final int m0;
    public final int n;

    @ColorInt
    public final int n0;
    public boolean o;
    public final ColorStateList o0;

    @NonNull
    public final C0338w p;

    @ColorInt
    public final int p0;

    @Nullable
    public final AppCompatTextView q;

    @ColorInt
    public final int q0;
    public final int r;

    @ColorInt
    public final int r0;
    public final int s;

    @ColorInt
    public final int s0;
    public final CharSequence t;

    @ColorInt
    public final int t0;
    public boolean u;
    public int u0;
    public AppCompatTextView v;
    public boolean v0;

    @Nullable
    public final ColorStateList w;
    public final com.google.android.material.internal.b w0;
    public final int x;
    public final boolean x0;

    @Nullable
    public final Fade y;
    public final boolean y0;

    @Nullable
    public final Fade z;
    public ValueAnimator z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.c.f;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.w0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class c extends AccessibilityDelegateCompat {
        public final TextInputLayout a;

        public c(@NonNull TextInputLayout textInputLayout) {
            this.a = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AppCompatTextView appCompatTextView;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            TextInputLayout textInputLayout = this.a;
            EditText editText = textInputLayout.d;
            v vVar = textInputLayout.l;
            CharSequence charSequence = null;
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence charSequence2 = textInputLayout.E ? textInputLayout.F : null;
            CharSequence charSequence3 = vVar.q ? vVar.p : null;
            CharSequence charSequence4 = textInputLayout.u ? textInputLayout.t : null;
            int i = textInputLayout.n;
            if (textInputLayout.m && textInputLayout.o && (appCompatTextView = textInputLayout.q) != null) {
                charSequence = appCompatTextView.getContentDescription();
            }
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
            boolean z = textInputLayout.v0;
            boolean isEmpty3 = TextUtils.isEmpty(charSequence3);
            boolean z2 = (isEmpty3 && TextUtils.isEmpty(charSequence)) ? false : true;
            String charSequence5 = !isEmpty2 ? charSequence2.toString() : "";
            B b = textInputLayout.b;
            View view2 = b.b;
            if (view2.getVisibility() == 0) {
                accessibilityNodeInfoCompat.setLabelFor(view2);
                accessibilityNodeInfoCompat.setTraversalAfter(view2);
            } else {
                accessibilityNodeInfoCompat.setTraversalAfter(b.d);
            }
            if (!isEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(charSequence5)) {
                accessibilityNodeInfoCompat.setText(charSequence5);
                if (!z && charSequence4 != null) {
                    accessibilityNodeInfoCompat.setText(charSequence5 + ", " + ((Object) charSequence4));
                }
            } else if (charSequence4 != null) {
                accessibilityNodeInfoCompat.setText(charSequence4);
            }
            if (!TextUtils.isEmpty(charSequence5)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(charSequence5);
                } else {
                    if (!isEmpty) {
                        charSequence5 = ((Object) text) + ", " + charSequence5;
                    }
                    accessibilityNodeInfoCompat.setText(charSequence5);
                }
                accessibilityNodeInfoCompat.setShowingHintText(isEmpty);
            }
            if (text == null || text.length() != i) {
                i = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(i);
            if (z2) {
                if (isEmpty3) {
                    charSequence3 = charSequence;
                }
                accessibilityNodeInfoCompat.setError(charSequence3);
            }
            View view3 = vVar.y;
            if (view3 != null) {
                accessibilityNodeInfoCompat.setLabelFor(view3);
            }
            textInputLayout.c.b().n(accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.a.c.b().o(accessibilityEvent);
        }
    }

    public interface d {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface e {
        void a();
    }

    public static class f extends AbsSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        @Nullable
        public CharSequence a;
        public boolean b;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final f createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() == 1;
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.a) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.haryanvi.netstream.R.attr.textInputStyle, com.haryanvi.netstream.R.style.Widget_Design_TextInputLayout), attributeSet, com.haryanvi.netstream.R.attr.textInputStyle);
        int i;
        CharSequence charSequence;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        boolean z;
        ColorStateList b2;
        this.f = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        v vVar = new v(this);
        this.l = vVar;
        this.p = new C0338w();
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new RectF();
        this.f0 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.w0 = bVar;
        this.C0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = com.google.android.material.animation.a.a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.g != 8388659) {
            bVar.g = 8388659;
            bVar.h(false);
        }
        com.google.android.material.internal.i.a(context2, attributeSet, com.haryanvi.netstream.R.attr.textInputStyle, com.haryanvi.netstream.R.style.Widget_Design_TextInputLayout);
        int[] iArr = com.google.android.material.a.B;
        com.google.android.material.internal.i.b(context2, attributeSet, iArr, com.haryanvi.netstream.R.attr.textInputStyle, com.haryanvi.netstream.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, com.haryanvi.netstream.R.attr.textInputStyle, com.haryanvi.netstream.R.style.Widget_Design_TextInputLayout);
        B b3 = new B(this, obtainStyledAttributes);
        this.b = b3;
        this.E = obtainStyledAttributes.getBoolean(48, true);
        n(obtainStyledAttributes.getText(4));
        this.y0 = obtainStyledAttributes.getBoolean(47, true);
        this.x0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            int i2 = obtainStyledAttributes.getInt(6, -1);
            this.f = i2;
            EditText editText = this.d;
            if (editText != null && i2 != -1) {
                editText.setMinEms(i2);
            }
        } else if (obtainStyledAttributes.hasValue(3)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            this.j = dimensionPixelSize;
            EditText editText2 = this.d;
            if (editText2 != null && dimensionPixelSize != -1) {
                editText2.setMinWidth(dimensionPixelSize);
            }
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int i3 = obtainStyledAttributes.getInt(5, -1);
            this.i = i3;
            EditText editText3 = this.d;
            if (editText3 != null && i3 != -1) {
                editText3.setMaxEms(i3);
            }
        } else if (obtainStyledAttributes.hasValue(2)) {
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            this.k = dimensionPixelSize2;
            EditText editText4 = this.d;
            if (editText4 != null && dimensionPixelSize2 != -1) {
                editText4.setMaxWidth(dimensionPixelSize2);
            }
        }
        this.N = com.google.android.material.shape.k.b(context2, attributeSet, com.haryanvi.netstream.R.attr.textInputStyle, com.haryanvi.netstream.R.style.Widget_Design_TextInputLayout).a();
        this.P = context2.getResources().getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.T = dimensionPixelSize3;
        this.U = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = dimensionPixelSize3;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        k.a e2 = this.N.e();
        if (dimension >= 0.0f) {
            e2.e = new com.google.android.material.shape.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f = new com.google.android.material.shape.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.g = new com.google.android.material.shape.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new com.google.android.material.shape.a(dimension4);
        }
        this.N = e2.a();
        ColorStateList b4 = com.google.android.material.resources.c.b(context2, obtainStyledAttributes, 7);
        if (b4 != null) {
            int defaultColor = b4.getDefaultColor();
            this.p0 = defaultColor;
            this.W = defaultColor;
            if (b4.isStateful()) {
                this.q0 = b4.getColorForState(new int[]{-16842910}, -1);
                this.r0 = b4.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.s0 = b4.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.r0 = defaultColor;
                ColorStateList colorStateList5 = AppCompatResources.getColorStateList(context2, com.haryanvi.netstream.R.color.mtrl_filled_background_color);
                this.q0 = colorStateList5.getColorForState(new int[]{-16842910}, -1);
                this.s0 = colorStateList5.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            i = 0;
        } else {
            i = 0;
            this.W = 0;
            this.p0 = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateList6 = obtainStyledAttributes.getColorStateList(1);
            this.k0 = colorStateList6;
            this.j0 = colorStateList6;
        }
        ColorStateList b5 = com.google.android.material.resources.c.b(context2, obtainStyledAttributes, 14);
        this.n0 = obtainStyledAttributes.getColor(14, i);
        this.l0 = ContextCompat.getColor(context2, com.haryanvi.netstream.R.color.mtrl_textinput_default_box_stroke_color);
        this.t0 = ContextCompat.getColor(context2, com.haryanvi.netstream.R.color.mtrl_textinput_disabled_color);
        this.m0 = ContextCompat.getColor(context2, com.haryanvi.netstream.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b5 != null) {
            if (b5.isStateful()) {
                this.l0 = b5.getDefaultColor();
                this.t0 = b5.getColorForState(new int[]{-16842910}, -1);
                this.m0 = b5.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
                this.n0 = b5.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
            } else if (this.n0 != b5.getDefaultColor()) {
                this.n0 = b5.getDefaultColor();
            }
            B();
        }
        if (obtainStyledAttributes.hasValue(15) && this.o0 != (b2 = com.google.android.material.resources.c.b(context2, obtainStyledAttributes, 15))) {
            this.o0 = b2;
            B();
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            int resourceId = obtainStyledAttributes.getResourceId(49, 0);
            TextInputLayout textInputLayout = bVar.a;
            com.google.android.material.resources.d dVar = new com.google.android.material.resources.d(textInputLayout.getContext(), resourceId);
            ColorStateList colorStateList7 = dVar.j;
            if (colorStateList7 != null) {
                bVar.k = colorStateList7;
            }
            float f2 = dVar.k;
            if (f2 != 0.0f) {
                bVar.i = f2;
            }
            ColorStateList colorStateList8 = dVar.a;
            if (colorStateList8 != null) {
                bVar.U = colorStateList8;
            }
            bVar.S = dVar.e;
            bVar.T = dVar.f;
            bVar.R = dVar.g;
            bVar.V = dVar.i;
            com.google.android.material.resources.a aVar = bVar.y;
            if (aVar != null) {
                aVar.c = true;
            }
            com.google.android.material.internal.a aVar2 = new com.google.android.material.internal.a(bVar);
            dVar.a();
            bVar.y = new com.google.android.material.resources.a(aVar2, dVar.n);
            dVar.c(textInputLayout.getContext(), bVar.y);
            bVar.h(false);
            this.k0 = bVar.k;
            if (this.d != null) {
                y(false, false);
                x();
            }
        }
        this.C = obtainStyledAttributes.getColorStateList(24);
        this.D = obtainStyledAttributes.getColorStateList(25);
        int resourceId2 = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i4 = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId3 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId4 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        int i5 = obtainStyledAttributes.getInt(19, -1);
        if (this.n != i5) {
            if (i5 > 0) {
                this.n = i5;
            } else {
                this.n = -1;
            }
            if (this.m && this.q != null) {
                EditText editText5 = this.d;
                r(editText5 == null ? null : editText5.getText());
            }
        }
        this.s = obtainStyledAttributes.getResourceId(22, 0);
        this.r = obtainStyledAttributes.getResourceId(20, 0);
        int i6 = obtainStyledAttributes.getInt(8, 0);
        if (i6 != this.Q) {
            this.Q = i6;
            if (this.d != null) {
                i();
            }
        }
        vVar.s = text;
        AppCompatTextView appCompatTextView = vVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(text);
        }
        vVar.t = i4;
        AppCompatTextView appCompatTextView2 = vVar.r;
        if (appCompatTextView2 != null) {
            ViewCompat.setAccessibilityLiveRegion(appCompatTextView2, i4);
        }
        vVar.z = resourceId3;
        AppCompatTextView appCompatTextView3 = vVar.y;
        if (appCompatTextView3 != null) {
            TextViewCompat.setTextAppearance(appCompatTextView3, resourceId3);
        }
        vVar.u = resourceId2;
        AppCompatTextView appCompatTextView4 = vVar.r;
        if (appCompatTextView4 != null) {
            vVar.h.p(appCompatTextView4, resourceId2);
        }
        if (this.v == null) {
            AppCompatTextView appCompatTextView5 = new AppCompatTextView(getContext());
            this.v = appCompatTextView5;
            appCompatTextView5.setId(com.haryanvi.netstream.R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.v, 2);
            Fade d2 = d();
            this.y = d2;
            charSequence = text3;
            d2.setStartDelay(67L);
            this.z = d();
            int i7 = this.x;
            this.x = i7;
            AppCompatTextView appCompatTextView6 = this.v;
            if (appCompatTextView6 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView6, i7);
            }
        } else {
            charSequence = text3;
        }
        if (TextUtils.isEmpty(charSequence)) {
            o(false);
        } else {
            if (!this.u) {
                o(true);
            }
            this.t = charSequence;
        }
        EditText editText6 = this.d;
        z(editText6 == null ? null : editText6.getText());
        this.x = resourceId4;
        AppCompatTextView appCompatTextView7 = this.v;
        if (appCompatTextView7 != null) {
            TextViewCompat.setTextAppearance(appCompatTextView7, resourceId4);
        }
        if (obtainStyledAttributes.hasValue(41)) {
            ColorStateList colorStateList9 = obtainStyledAttributes.getColorStateList(41);
            vVar.v = colorStateList9;
            AppCompatTextView appCompatTextView8 = vVar.r;
            if (appCompatTextView8 != null && colorStateList9 != null) {
                appCompatTextView8.setTextColor(colorStateList9);
            }
        }
        if (obtainStyledAttributes.hasValue(46)) {
            ColorStateList colorStateList10 = obtainStyledAttributes.getColorStateList(46);
            vVar.A = colorStateList10;
            AppCompatTextView appCompatTextView9 = vVar.y;
            if (appCompatTextView9 != null && colorStateList10 != null) {
                appCompatTextView9.setTextColor(colorStateList10);
            }
        }
        if (obtainStyledAttributes.hasValue(50) && this.k0 != (colorStateList4 = obtainStyledAttributes.getColorStateList(50))) {
            if (this.j0 != null || bVar.k == colorStateList4) {
                z = false;
            } else {
                bVar.k = colorStateList4;
                z = false;
                bVar.h(false);
            }
            this.k0 = colorStateList4;
            if (this.d != null) {
                y(z, z);
            }
        }
        if (obtainStyledAttributes.hasValue(23) && this.A != (colorStateList3 = obtainStyledAttributes.getColorStateList(23))) {
            this.A = colorStateList3;
            s();
        }
        if (obtainStyledAttributes.hasValue(21) && this.B != (colorStateList2 = obtainStyledAttributes.getColorStateList(21))) {
            this.B = colorStateList2;
            s();
        }
        if (obtainStyledAttributes.hasValue(58) && this.w != (colorStateList = obtainStyledAttributes.getColorStateList(58))) {
            this.w = colorStateList;
            AppCompatTextView appCompatTextView10 = this.v;
            if (appCompatTextView10 != null && colorStateList != null) {
                appCompatTextView10.setTextColor(colorStateList);
            }
        }
        s sVar = new s(this, obtainStyledAttributes);
        this.c = sVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        ViewCompat.setImportantForAccessibility(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.setImportantForAutofill(this, 1);
        }
        frameLayout.addView(b3);
        frameLayout.addView(sVar);
        addView(frameLayout);
        setEnabled(z5);
        m(z3);
        l(z2);
        if (this.m != z4) {
            if (z4) {
                AppCompatTextView appCompatTextView11 = new AppCompatTextView(getContext());
                this.q = appCompatTextView11;
                appCompatTextView11.setId(com.haryanvi.netstream.R.id.textinput_counter);
                this.q.setMaxLines(1);
                vVar.a(this.q, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.q.getLayoutParams(), getResources().getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_textinput_counter_margin_start));
                s();
                if (this.q != null) {
                    EditText editText7 = this.d;
                    r(editText7 == null ? null : editText7.getText());
                }
            } else {
                vVar.g(this.q, 2);
                this.q = null;
            }
            this.m = z4;
        }
        if (TextUtils.isEmpty(text2)) {
            if (vVar.x) {
                m(false);
                return;
            }
            return;
        }
        if (!vVar.x) {
            m(true);
        }
        vVar.c();
        vVar.w = text2;
        vVar.y.setText(text2);
        int i8 = vVar.n;
        if (i8 != 2) {
            vVar.o = 2;
        }
        vVar.i(i8, vVar.o, vVar.h(vVar.y, text2));
    }

    public static void k(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    public final void A(boolean z, boolean z2) {
        int defaultColor = this.o0.getDefaultColor();
        int colorForState = this.o0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.o0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.V = colorForState2;
        } else if (z2) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void B() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.H == null || this.Q == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.V = this.t0;
        } else if (q()) {
            if (this.o0 != null) {
                A(z2, z);
            } else {
                AppCompatTextView appCompatTextView2 = this.l.r;
                this.V = appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1;
            }
        } else if (!this.o || (appCompatTextView = this.q) == null) {
            if (z2) {
                this.V = this.n0;
            } else if (z) {
                this.V = this.m0;
            } else {
                this.V = this.l0;
            }
        } else if (this.o0 != null) {
            A(z2, z);
        } else {
            this.V = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            t();
        }
        s sVar = this.c;
        sVar.k();
        CheckableImageButton checkableImageButton = sVar.f;
        TextInputLayout textInputLayout = sVar.a;
        u.c(textInputLayout, sVar.c, sVar.d);
        u.c(textInputLayout, checkableImageButton, sVar.l);
        if (sVar.b() instanceof q) {
            if (!textInputLayout.q() || checkableImageButton.getDrawable() == null) {
                u.a(textInputLayout, checkableImageButton, sVar.l, sVar.m);
            } else {
                Drawable mutate = DrawableCompat.wrap(checkableImageButton.getDrawable()).mutate();
                AppCompatTextView appCompatTextView3 = textInputLayout.l.r;
                DrawableCompat.setTint(mutate, appCompatTextView3 != null ? appCompatTextView3.getCurrentTextColor() : -1);
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        B b2 = this.b;
        u.c(b2.a, b2.d, b2.e);
        if (this.Q == 2) {
            int i = this.S;
            if (z2 && isEnabled()) {
                this.S = this.U;
            } else {
                this.S = this.T;
            }
            if (this.S != i && e() && !this.v0) {
                if (e()) {
                    ((i) this.H).p(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.Q == 1) {
            if (!isEnabled()) {
                this.W = this.q0;
            } else if (z && !z2) {
                this.W = this.s0;
            } else if (z2) {
                this.W = this.r0;
            } else {
                this.W = this.p0;
            }
        }
        b();
    }

    @VisibleForTesting
    public final void a(float f2) {
        com.google.android.material.internal.b bVar = this.w0;
        if (bVar.b == f2) {
            return;
        }
        if (this.z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.z0 = valueAnimator;
            valueAnimator.setInterpolator(com.google.android.material.motion.a.d(getContext(), com.haryanvi.netstream.R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.b));
            this.z0.setDuration(com.google.android.material.motion.a.c(getContext(), com.haryanvi.netstream.R.attr.motionDurationMedium4, 167));
            this.z0.addUpdateListener(new b());
        }
        this.z0.setFloatValues(bVar.b, f2);
        this.z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        x();
        EditText editText = (EditText) view;
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        s sVar = this.c;
        int i2 = sVar.j;
        this.d = editText;
        int i3 = this.f;
        if (i3 != -1) {
            this.f = i3;
            if (editText != null && i3 != -1) {
                editText.setMinEms(i3);
            }
        } else {
            int i4 = this.j;
            this.j = i4;
            if (editText != null && i4 != -1) {
                editText.setMinWidth(i4);
            }
        }
        int i5 = this.i;
        if (i5 != -1) {
            this.i = i5;
            EditText editText2 = this.d;
            if (editText2 != null && i5 != -1) {
                editText2.setMaxEms(i5);
            }
        } else {
            int i6 = this.k;
            this.k = i6;
            EditText editText3 = this.d;
            if (editText3 != null && i6 != -1) {
                editText3.setMaxWidth(i6);
            }
        }
        this.K = false;
        i();
        c cVar = new c(this);
        EditText editText4 = this.d;
        if (editText4 != null) {
            ViewCompat.setAccessibilityDelegate(editText4, cVar);
        }
        Typeface typeface = this.d.getTypeface();
        com.google.android.material.internal.b bVar = this.w0;
        boolean j = bVar.j(typeface);
        if (bVar.w != typeface) {
            bVar.w = typeface;
            Typeface a2 = com.google.android.material.resources.j.a(bVar.a.getContext().getResources().getConfiguration(), typeface);
            bVar.v = a2;
            if (a2 == null) {
                a2 = bVar.w;
            }
            bVar.u = a2;
            z = true;
        } else {
            z = false;
        }
        if (j || z) {
            bVar.h(false);
        }
        float textSize = this.d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i7 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (bVar.W != letterSpacing) {
            bVar.W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i8 = (gravity & (-113)) | 48;
        if (bVar.g != i8) {
            bVar.g = i8;
            bVar.h(false);
        }
        if (bVar.f != gravity) {
            bVar.f = gravity;
            bVar.h(false);
        }
        this.u0 = ViewCompat.getMinimumHeight(editText);
        this.d.addTextChangedListener(new C(this, editText));
        if (this.j0 == null) {
            this.j0 = this.d.getHintTextColors();
        }
        if (this.E) {
            if (TextUtils.isEmpty(this.F)) {
                CharSequence hint = this.d.getHint();
                this.e = hint;
                n(hint);
                this.d.setHint((CharSequence) null);
            }
            this.G = true;
        }
        if (i7 >= 29) {
            t();
        }
        if (this.q != null) {
            r(this.d.getText());
        }
        v();
        this.l.b();
        this.b.bringToFront();
        sVar.bringToFront();
        Iterator<d> it = this.f0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        sVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        y(false, true);
    }

    public final void b() {
        int i;
        int i2;
        com.google.android.material.shape.g gVar = this.H;
        if (gVar == null) {
            return;
        }
        com.google.android.material.shape.k kVar = gVar.a.a;
        com.google.android.material.shape.k kVar2 = this.N;
        if (kVar != kVar2) {
            gVar.b(kVar2);
        }
        if (this.Q == 2 && (i = this.S) > -1 && (i2 = this.V) != 0) {
            com.google.android.material.shape.g gVar2 = this.H;
            gVar2.a.j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            g.b bVar = gVar2.a;
            if (bVar.d != valueOf) {
                bVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.W;
        if (this.Q == 1) {
            i3 = ColorUtils.compositeColors(this.W, com.google.android.material.color.a.a(getContext(), com.haryanvi.netstream.R.attr.colorSurface, 0));
        }
        this.W = i3;
        this.H.l(ColorStateList.valueOf(i3));
        com.google.android.material.shape.g gVar3 = this.L;
        if (gVar3 != null && this.M != null) {
            if (this.S > -1 && this.V != 0) {
                gVar3.l(this.d.isFocused() ? ColorStateList.valueOf(this.l0) : ColorStateList.valueOf(this.V));
                this.M.l(ColorStateList.valueOf(this.V));
            }
            invalidate();
        }
        w();
    }

    public final int c() {
        float d2;
        if (!this.E) {
            return 0;
        }
        com.google.android.material.internal.b bVar = this.w0;
        int i = this.Q;
        if (i == 0) {
            d2 = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = bVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final Fade d() {
        Fade fade = new Fade();
        fade.setDuration(com.google.android.material.motion.a.c(getContext(), com.haryanvi.netstream.R.attr.motionDurationShort2, 87));
        fade.setInterpolator(com.google.android.material.motion.a.d(getContext(), com.haryanvi.netstream.R.attr.motionEasingLinearInterpolator, com.google.android.material.animation.a.a));
        return fade;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.G = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(this.E ? this.F : null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.B0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.B0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        com.google.android.material.shape.g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.E;
        com.google.android.material.internal.b bVar = this.w0;
        if (z) {
            TextPaint textPaint = bVar.N;
            RectF rectF = bVar.e;
            int save = canvas2.save();
            if (bVar.B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(bVar.G);
                float f2 = bVar.p;
                float f3 = bVar.q;
                float f4 = bVar.F;
                if (f4 != 1.0f) {
                    canvas2.scale(f4, f4, f2, f3);
                }
                if (bVar.d0 <= 1 || bVar.C) {
                    canvas2.translate(f2, f3);
                    bVar.Y.draw(canvas2);
                } else {
                    float lineStart = bVar.p - bVar.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f3);
                    float f5 = alpha;
                    textPaint.setAlpha((int) (bVar.b0 * f5));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f6 = bVar.H;
                        float f7 = bVar.I;
                        float f8 = bVar.J;
                        int i2 = bVar.K;
                        textPaint.setShadowLayer(f6, f7, f8, ColorUtils.setAlphaComponent(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    bVar.Y.draw(canvas2);
                    textPaint.setAlpha((int) (bVar.a0 * f5));
                    if (i >= 31) {
                        float f9 = bVar.H;
                        float f10 = bVar.I;
                        float f11 = bVar.J;
                        int i3 = bVar.K;
                        textPaint.setShadowLayer(f9, f10, f11, ColorUtils.setAlphaComponent(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = bVar.Y.getLineBaseline(0);
                    CharSequence charSequence = bVar.c0;
                    float f12 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                    }
                    String trim = bVar.c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.M == null || (gVar = this.L) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.d.isFocused()) {
            Rect bounds = this.M.getBounds();
            Rect bounds2 = this.L.getBounds();
            float f13 = bVar.b;
            int centerX = bounds2.centerX();
            bounds.left = com.google.android.material.animation.a.c(centerX, bounds2.left, f13);
            bounds.right = com.google.android.material.animation.a.c(centerX, bounds2.right, f13);
            this.M.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.w0;
        if (bVar != null) {
            bVar.L = drawableState;
            ColorStateList colorStateList2 = bVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z = true;
                if (this.d != null) {
                    y(ViewCompat.isLaidOut(this) && isEnabled(), false);
                }
                v();
                B();
                if (z) {
                    invalidate();
                }
                this.A0 = false;
            }
        }
        z = false;
        if (this.d != null) {
        }
        v();
        B();
        if (z) {
        }
        this.A0 = false;
    }

    public final boolean e() {
        return this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof i);
    }

    public final com.google.android.material.shape.g f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float dimensionPixelOffset2 = editText instanceof x ? ((x) editText).d : getResources().getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.haryanvi.netstream.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.google.android.material.shape.j jVar = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar2 = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar3 = new com.google.android.material.shape.j();
        com.google.android.material.shape.j jVar4 = new com.google.android.material.shape.j();
        com.google.android.material.shape.f fVar = new com.google.android.material.shape.f();
        com.google.android.material.shape.f fVar2 = new com.google.android.material.shape.f();
        com.google.android.material.shape.f fVar3 = new com.google.android.material.shape.f();
        com.google.android.material.shape.f fVar4 = new com.google.android.material.shape.f();
        com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(f2);
        com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a(f2);
        com.google.android.material.shape.a aVar3 = new com.google.android.material.shape.a(dimensionPixelOffset);
        com.google.android.material.shape.a aVar4 = new com.google.android.material.shape.a(dimensionPixelOffset);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        kVar.a = jVar;
        kVar.b = jVar2;
        kVar.c = jVar3;
        kVar.d = jVar4;
        kVar.e = aVar;
        kVar.f = aVar2;
        kVar.g = aVar4;
        kVar.h = aVar3;
        kVar.i = fVar;
        kVar.j = fVar2;
        kVar.k = fVar3;
        kVar.l = fVar4;
        EditText editText2 = this.d;
        ColorStateList colorStateList = editText2 instanceof x ? ((x) editText2).e : null;
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = com.google.android.material.shape.g.y;
            TypedValue c2 = com.google.android.material.resources.b.c(context, com.haryanvi.netstream.R.attr.colorSurface, com.google.android.material.shape.g.class.getSimpleName());
            int i = c2.resourceId;
            colorStateList = ColorStateList.valueOf(i != 0 ? ContextCompat.getColor(context, i) : c2.data);
        }
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        gVar.j(context);
        gVar.l(colorStateList);
        gVar.k(dimensionPixelOffset2);
        gVar.b(kVar);
        g.b bVar = gVar.a;
        if (bVar.g == null) {
            bVar.g = new Rect();
        }
        gVar.a.g.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z) {
            B b2 = this.b;
            if (b2.c != null) {
                compoundPaddingLeft = b2.a();
                return compoundPaddingLeft + i;
            }
        }
        if (z) {
            s sVar = this.c;
            if (sVar.o != null) {
                compoundPaddingLeft = sVar.c();
                return compoundPaddingLeft + i;
            }
        }
        compoundPaddingLeft = this.d.getCompoundPaddingLeft();
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (!z) {
            s sVar = this.c;
            if (sVar.o != null) {
                compoundPaddingRight = sVar.c();
                return i - compoundPaddingRight;
            }
        }
        if (z) {
            B b2 = this.b;
            if (b2.c != null) {
                compoundPaddingRight = b2.a();
                return i - compoundPaddingRight;
            }
        }
        compoundPaddingRight = this.d.getCompoundPaddingRight();
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.Q;
        if (i == 0) {
            this.H = null;
            this.L = null;
            this.M = null;
        } else if (i == 1) {
            this.H = new com.google.android.material.shape.g(this.N);
            this.L = new com.google.android.material.shape.g();
            this.M = new com.google.android.material.shape.g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(C0211b.a(new StringBuilder(), i, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.E || (this.H instanceof i)) {
                this.H = new com.google.android.material.shape.g(this.N);
            } else {
                com.google.android.material.shape.k kVar = this.N;
                int i2 = i.A;
                if (kVar == null) {
                    kVar = new com.google.android.material.shape.k();
                }
                i.a aVar = new i.a(kVar, new RectF());
                i.b bVar = new i.b(aVar);
                bVar.z = aVar;
                this.H = bVar;
            }
            this.L = null;
            this.M = null;
        }
        w();
        B();
        if (i == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.R = getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.google.android.material.resources.c.d(getContext())) {
                this.R = getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && i == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.d), getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (com.google.android.material.resources.c.d(getContext())) {
                EditText editText2 = this.d;
                ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.d), getResources().getDimensionPixelSize(com.haryanvi.netstream.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (i != 0) {
            x();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                if (i == 2) {
                    if (this.I == null) {
                        this.I = f(true);
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.I);
                } else if (i == 1) {
                    if (this.J == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.J = stateListDrawable;
                        int[] iArr = {R.attr.state_above_anchor};
                        if (this.I == null) {
                            this.I = f(true);
                        }
                        stateListDrawable.addState(iArr, this.I);
                        this.J.addState(new int[0], f(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.J);
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        float f6;
        int i2;
        if (e()) {
            int width = this.d.getWidth();
            int gravity = this.d.getGravity();
            com.google.android.material.internal.b bVar = this.w0;
            boolean b2 = bVar.b(bVar.A);
            bVar.C = b2;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.c0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.Z / 2.0f);
                } else if ((gravity & GravityCompat.END) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.C) {
                        f6 = bVar.Z;
                        f5 = f6 + max;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f6 = bVar.Z;
                    f5 = f6 + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f7 = rectF.left;
                float f8 = this.P;
                rectF.left = f7 - f8;
                rectF.right += f8;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
                i iVar = (i) this.H;
                iVar.getClass();
                iVar.p(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.c0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(boolean z) {
        v vVar = this.l;
        TextInputLayout textInputLayout = vVar.h;
        if (vVar.q == z) {
            return;
        }
        vVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(vVar.g);
            vVar.r = appCompatTextView;
            appCompatTextView.setId(com.haryanvi.netstream.R.id.textinput_error);
            vVar.r.setTextAlignment(5);
            int i = vVar.u;
            vVar.u = i;
            AppCompatTextView appCompatTextView2 = vVar.r;
            if (appCompatTextView2 != null) {
                vVar.h.p(appCompatTextView2, i);
            }
            ColorStateList colorStateList = vVar.v;
            vVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = vVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = vVar.s;
            vVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = vVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = vVar.t;
            vVar.t = i2;
            AppCompatTextView appCompatTextView5 = vVar.r;
            if (appCompatTextView5 != null) {
                ViewCompat.setAccessibilityLiveRegion(appCompatTextView5, i2);
            }
            vVar.r.setVisibility(4);
            vVar.a(vVar.r, 0);
        } else {
            vVar.f();
            vVar.g(vVar.r, 0);
            vVar.r = null;
            textInputLayout.v();
            textInputLayout.B();
        }
        vVar.q = z;
    }

    public final void m(boolean z) {
        v vVar = this.l;
        TextInputLayout textInputLayout = vVar.h;
        if (vVar.x == z) {
            return;
        }
        vVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(vVar.g);
            vVar.y = appCompatTextView;
            appCompatTextView.setId(com.haryanvi.netstream.R.id.textinput_helper_text);
            vVar.y.setTextAlignment(5);
            vVar.y.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(vVar.y, 1);
            int i = vVar.z;
            vVar.z = i;
            AppCompatTextView appCompatTextView2 = vVar.y;
            if (appCompatTextView2 != null) {
                TextViewCompat.setTextAppearance(appCompatTextView2, i);
            }
            ColorStateList colorStateList = vVar.A;
            vVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = vVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            vVar.a(vVar.y, 1);
            vVar.y.setAccessibilityDelegate(new w(vVar));
        } else {
            vVar.c();
            int i2 = vVar.n;
            if (i2 == 2) {
                vVar.o = 0;
            }
            vVar.i(i2, vVar.o, vVar.h(vVar.y, ""));
            vVar.g(vVar.y, 1);
            vVar.y = null;
            textInputLayout.v();
            textInputLayout.B();
        }
        vVar.x = z;
    }

    public final void n(@Nullable CharSequence charSequence) {
        if (this.E) {
            if (!TextUtils.equals(charSequence, this.F)) {
                this.F = charSequence;
                com.google.android.material.internal.b bVar = this.w0;
                if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
                    bVar.A = charSequence;
                    bVar.B = null;
                    Bitmap bitmap = bVar.E;
                    if (bitmap != null) {
                        bitmap.recycle();
                        bVar.E = null;
                    }
                    bVar.h(false);
                }
                if (!this.v0) {
                    j();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void o(boolean z) {
        if (this.u == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.v;
            if (appCompatTextView != null) {
                this.a.addView(appCompatTextView);
                this.v.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.v;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.v = null;
        }
        this.u = z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.w0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        s sVar = this.c;
        sVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.C0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(sVar.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z = true;
        }
        boolean u = u();
        if (z || u) {
            this.d.post(new androidx.media3.exoplayer.dash.c(this, 2));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            Rect rect = this.a0;
            com.google.android.material.internal.c.a(this, editText, rect);
            com.google.android.material.shape.g gVar = this.L;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.T, rect.right, i5);
            }
            com.google.android.material.shape.g gVar2 = this.M;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.U, rect.right, i6);
            }
            if (this.E) {
                float textSize = this.d.getTextSize();
                com.google.android.material.internal.b bVar = this.w0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.g != i7) {
                    bVar.g = i7;
                    bVar.h(false);
                }
                if (bVar.f != gravity) {
                    bVar.f = gravity;
                    bVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean a2 = com.google.android.material.internal.m.a(this);
                int i8 = rect.bottom;
                Rect rect2 = this.b0;
                rect2.bottom = i8;
                int i9 = this.Q;
                if (i9 == 1) {
                    rect2.left = g(rect.left, a2);
                    rect2.top = rect.top + this.R;
                    rect2.right = h(rect.right, a2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, a2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, a2);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = bVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.u);
                textPaint.setLetterSpacing(bVar.W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.Q != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.Q != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.M = true;
                }
                bVar.h(false);
                if (!e() || this.v0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.C0;
        s sVar = this.c;
        if (!z) {
            sVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.C0 = true;
        }
        if (this.v != null && (editText = this.d) != null) {
            this.v.setGravity(editText.getGravity());
            this.v.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        sVar.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        CharSequence charSequence = fVar.a;
        v vVar = this.l;
        if (!vVar.q) {
            if (!TextUtils.isEmpty(charSequence)) {
                l(true);
            }
            if (fVar.b) {
                post(new a());
            }
            requestLayout();
        }
        if (TextUtils.isEmpty(charSequence)) {
            vVar.f();
        } else {
            vVar.c();
            vVar.p = charSequence;
            vVar.r.setText(charSequence);
            int i = vVar.n;
            if (i != 1) {
                vVar.o = 1;
            }
            vVar.i(i, vVar.o, vVar.h(vVar.r, charSequence));
        }
        if (fVar.b) {
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.O) {
            com.google.android.material.shape.c cVar = this.N.e;
            RectF rectF = this.c0;
            float a2 = cVar.a(rectF);
            float a3 = this.N.f.a(rectF);
            float a4 = this.N.h.a(rectF);
            float a5 = this.N.g.a(rectF);
            com.google.android.material.shape.k kVar = this.N;
            com.google.android.material.shape.d dVar = kVar.a;
            com.google.android.material.shape.d dVar2 = kVar.b;
            com.google.android.material.shape.d dVar3 = kVar.d;
            com.google.android.material.shape.d dVar4 = kVar.c;
            new com.google.android.material.shape.j();
            new com.google.android.material.shape.j();
            new com.google.android.material.shape.j();
            new com.google.android.material.shape.j();
            com.google.android.material.shape.f fVar = new com.google.android.material.shape.f();
            com.google.android.material.shape.f fVar2 = new com.google.android.material.shape.f();
            com.google.android.material.shape.f fVar3 = new com.google.android.material.shape.f();
            com.google.android.material.shape.f fVar4 = new com.google.android.material.shape.f();
            k.a.b(dVar2);
            k.a.b(dVar);
            k.a.b(dVar4);
            k.a.b(dVar3);
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a(a3);
            com.google.android.material.shape.a aVar2 = new com.google.android.material.shape.a(a2);
            com.google.android.material.shape.a aVar3 = new com.google.android.material.shape.a(a5);
            com.google.android.material.shape.a aVar4 = new com.google.android.material.shape.a(a4);
            com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k();
            kVar2.a = dVar2;
            kVar2.b = dVar;
            kVar2.c = dVar3;
            kVar2.d = dVar4;
            kVar2.e = aVar;
            kVar2.f = aVar2;
            kVar2.g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = fVar;
            kVar2.j = fVar2;
            kVar2.k = fVar3;
            kVar2.l = fVar4;
            this.O = z;
            com.google.android.material.shape.g gVar = this.H;
            if (gVar == null || gVar.a.a == kVar2) {
                return;
            }
            this.N = kVar2;
            b();
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        if (q()) {
            v vVar = this.l;
            fVar.a = vVar.q ? vVar.p : null;
        }
        s sVar = this.c;
        fVar.b = sVar.j != 0 && sVar.f.a;
        return fVar;
    }

    public final void p(@NonNull AppCompatTextView appCompatTextView, @StyleRes int i) {
        try {
            TextViewCompat.setTextAppearance(appCompatTextView, i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(appCompatTextView, com.haryanvi.netstream.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), com.haryanvi.netstream.R.color.design_error));
    }

    public final boolean q() {
        v vVar = this.l;
        return (vVar.o != 1 || vVar.r == null || TextUtils.isEmpty(vVar.p)) ? false : true;
    }

    public final void r(@Nullable Editable editable) {
        this.p.getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.o;
        int i = this.n;
        if (i == -1) {
            this.q.setText(String.valueOf(length));
            this.q.setContentDescription(null);
            this.o = false;
        } else {
            this.o = length > i;
            this.q.setContentDescription(getContext().getString(this.o ? com.haryanvi.netstream.R.string.character_counter_overflowed_content_description : com.haryanvi.netstream.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.n)));
            if (z != this.o) {
                s();
            }
            this.q.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(com.haryanvi.netstream.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.n))));
        }
        if (this.d == null || z == this.o) {
            return;
        }
        y(false, false);
        B();
        v();
    }

    public final void s() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.q;
        if (appCompatTextView != null) {
            p(appCompatTextView, this.o ? this.r : this.s);
            if (!this.o && (colorStateList2 = this.A) != null) {
                this.q.setTextColor(colorStateList2);
            }
            if (!this.o || (colorStateList = this.B) == null) {
                return;
            }
            this.q.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    @RequiresApi(29)
    public final void t() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.C;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue a2 = com.google.android.material.resources.b.a(context, com.haryanvi.netstream.R.attr.colorControlActivated);
            if (a2 != null) {
                int i = a2.resourceId;
                if (i != 0) {
                    colorStateList2 = ContextCompat.getColorStateList(context, i);
                } else {
                    int i2 = a2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.d.getTextCursorDrawable();
            Drawable mutate = DrawableCompat.wrap(textCursorDrawable2).mutate();
            if ((q() || (this.q != null && this.o)) && (colorStateList = this.D) != null) {
                colorStateList2 = colorStateList;
            }
            DrawableCompat.setTintList(mutate, colorStateList2);
        }
    }

    public final boolean u() {
        boolean z;
        if (this.d == null) {
            return false;
        }
        B b2 = this.b;
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((b2.d.getDrawable() != null || (b2.c != null && b2.b.getVisibility() == 0)) && b2.getMeasuredWidth() > 0) {
            int measuredWidth = b2.getMeasuredWidth() - this.d.getPaddingLeft();
            if (this.d0 == null || this.e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.d0 = colorDrawable;
                this.e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.d);
            Drawable drawable = compoundDrawablesRelative[0];
            ColorDrawable colorDrawable2 = this.d0;
            if (drawable != colorDrawable2) {
                TextViewCompat.setCompoundDrawablesRelative(this.d, colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.d0 != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.d);
                TextViewCompat.setCompoundDrawablesRelative(this.d, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.d0 = null;
                z = true;
            }
            z = false;
        }
        s sVar = this.c;
        if ((sVar.e() || ((sVar.j != 0 && sVar.d()) || sVar.o != null)) && sVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = sVar.p.getMeasuredWidth() - this.d.getPaddingRight();
            if (sVar.e()) {
                checkableImageButton = sVar.c;
            } else if (sVar.j != 0 && sVar.d()) {
                checkableImageButton = sVar.f;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.d);
            ColorDrawable colorDrawable3 = this.g0;
            if (colorDrawable3 != null && this.h0 != measuredWidth2) {
                this.h0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.g0, compoundDrawablesRelative3[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.g0 = colorDrawable4;
                this.h0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative3[2];
            ColorDrawable colorDrawable5 = this.g0;
            if (drawable2 != colorDrawable5) {
                this.i0 = drawable2;
                TextViewCompat.setCompoundDrawablesRelative(this.d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], colorDrawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.g0 != null) {
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.d);
            if (compoundDrawablesRelative4[2] == this.g0) {
                TextViewCompat.setCompoundDrawablesRelative(this.d, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.i0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.g0 = null;
            return z2;
        }
        return z;
    }

    public final void v() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.d;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (q()) {
            AppCompatTextView appCompatTextView2 = this.l.r;
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView2 != null ? appCompatTextView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
        } else if (this.o && (appCompatTextView = this.q) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.d.refreshDrawableState();
        }
    }

    public final void w() {
        int i;
        Drawable drawable;
        EditText editText = this.d;
        if (editText == null || this.H == null) {
            return;
        }
        if ((this.K || editText.getBackground() == null) && (i = this.Q) != 0) {
            EditText editText2 = this.d;
            if (!(editText2 instanceof AutoCompleteTextView) || r.a(editText2)) {
                drawable = this.H;
            } else {
                int b2 = com.google.android.material.color.a.b(this.d, com.haryanvi.netstream.R.attr.colorControlHighlight);
                int[][] iArr = D0;
                if (i == 2) {
                    Context context = getContext();
                    com.google.android.material.shape.g gVar = this.H;
                    TypedValue c2 = com.google.android.material.resources.b.c(context, com.haryanvi.netstream.R.attr.colorSurface, "TextInputLayout");
                    int i2 = c2.resourceId;
                    int color = i2 != 0 ? ContextCompat.getColor(context, i2) : c2.data;
                    com.google.android.material.shape.g gVar2 = new com.google.android.material.shape.g(gVar.a.a);
                    int c3 = com.google.android.material.color.a.c(0.1f, b2, color);
                    gVar2.l(new ColorStateList(iArr, new int[]{c3, 0}));
                    gVar2.setTint(color);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{c3, color});
                    com.google.android.material.shape.g gVar3 = new com.google.android.material.shape.g(gVar.a.a);
                    gVar3.setTint(-1);
                    drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
                } else if (i == 1) {
                    com.google.android.material.shape.g gVar4 = this.H;
                    int i3 = this.W;
                    drawable = new RippleDrawable(new ColorStateList(iArr, new int[]{com.google.android.material.color.a.c(0.1f, b2, i3), i3}), gVar4, gVar4);
                } else {
                    drawable = null;
                }
            }
            ViewCompat.setBackground(this.d, drawable);
            this.K = true;
        }
    }

    public final void x() {
        if (this.Q != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.j0;
        com.google.android.material.internal.b bVar = this.w0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.j0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.t0) : this.t0));
        } else if (q()) {
            AppCompatTextView appCompatTextView2 = this.l.r;
            bVar.i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.o && (appCompatTextView = this.q) != null) {
            bVar.i(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.k0) != null && bVar.k != colorStateList) {
            bVar.k = colorStateList;
            bVar.h(false);
        }
        s sVar = this.c;
        B b2 = this.b;
        boolean z5 = this.y0;
        if (z3 || !this.x0 || (isEnabled() && z4)) {
            if (z2 || this.v0) {
                ValueAnimator valueAnimator = this.z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.z0.cancel();
                }
                if (z && z5) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.v0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                z(editText3 != null ? editText3.getText() : null);
                b2.j = false;
                b2.c();
                sVar.q = false;
                sVar.m();
                return;
            }
            return;
        }
        if (z2 || !this.v0) {
            ValueAnimator valueAnimator2 = this.z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.z0.cancel();
            }
            if (z && z5) {
                a(0.0f);
            } else {
                bVar.k(0.0f);
            }
            if (e() && !((i) this.H).z.q.isEmpty() && e()) {
                ((i) this.H).p(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.v0 = true;
            AppCompatTextView appCompatTextView3 = this.v;
            if (appCompatTextView3 != null && this.u) {
                appCompatTextView3.setText((CharSequence) null);
                TransitionManager.beginDelayedTransition(this.a, this.z);
                this.v.setVisibility(4);
            }
            b2.j = true;
            b2.c();
            sVar.q = true;
            sVar.m();
        }
    }

    public final void z(@Nullable Editable editable) {
        this.p.getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.v0) {
            AppCompatTextView appCompatTextView = this.v;
            if (appCompatTextView == null || !this.u) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            TransitionManager.beginDelayedTransition(frameLayout, this.z);
            this.v.setVisibility(4);
            return;
        }
        if (this.v == null || !this.u || TextUtils.isEmpty(this.t)) {
            return;
        }
        this.v.setText(this.t);
        TransitionManager.beginDelayedTransition(frameLayout, this.y);
        this.v.setVisibility(0);
        this.v.bringToFront();
        announceForAccessibility(this.t);
    }
}
