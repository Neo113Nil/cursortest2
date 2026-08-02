package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import com.google.android.material.shape.g;
import com.google.android.material.shape.h;
import com.google.android.material.shape.k;
import com.google.android.material.shape.o;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o {
    public static final int[] q = {R.attr.state_checkable};
    public static final int[] r = {R.attr.state_checked};

    @NonNull
    public final com.google.android.material.button.a a;

    @NonNull
    public final LinkedHashSet<a> b;

    @Nullable
    public b c;

    @Nullable
    public final PorterDuff.Mode d;

    @Nullable
    public final ColorStateList e;

    @Nullable
    public Drawable f;

    @Nullable
    public String i;

    @Px
    public final int j;

    @Px
    public int k;

    @Px
    public int l;

    @Px
    public final int m;
    public boolean n;
    public boolean o;
    public final int p;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends AbsSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public boolean a;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, com.haryanvi.netstream.R.attr.materialButtonStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Button), attributeSet, com.haryanvi.netstream.R.attr.materialButtonStyle);
        boolean z;
        boolean z2;
        this.b = new LinkedHashSet<>();
        this.n = false;
        this.o = false;
        Context context2 = getContext();
        TypedArray d = i.d(context2, attributeSet, com.google.android.material.a.k, com.haryanvi.netstream.R.attr.materialButtonStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Button, new int[0]);
        int dimensionPixelSize = d.getDimensionPixelSize(12, 0);
        this.m = dimensionPixelSize;
        int i = d.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d = m.b(i, mode);
        this.e = com.google.android.material.resources.c.a(getContext(), d, 14);
        this.f = com.google.android.material.resources.c.c(getContext(), d, 10);
        this.p = d.getInteger(11, 1);
        this.j = d.getDimensionPixelSize(13, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, k.b(context2, attributeSet, com.haryanvi.netstream.R.attr.materialButtonStyle, com.haryanvi.netstream.R.style.Widget_MaterialComponents_Button).a());
        this.a = aVar;
        aVar.c = d.getDimensionPixelOffset(1, 0);
        aVar.d = d.getDimensionPixelOffset(2, 0);
        aVar.e = d.getDimensionPixelOffset(3, 0);
        aVar.f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            float dimensionPixelSize2 = d.getDimensionPixelSize(8, -1);
            k.a e = aVar.b.e();
            e.e = new com.google.android.material.shape.a(dimensionPixelSize2);
            e.f = new com.google.android.material.shape.a(dimensionPixelSize2);
            e.g = new com.google.android.material.shape.a(dimensionPixelSize2);
            e.h = new com.google.android.material.shape.a(dimensionPixelSize2);
            aVar.c(e.a());
        }
        aVar.g = d.getDimensionPixelSize(20, 0);
        aVar.h = m.b(d.getInt(7, -1), mode);
        aVar.i = com.google.android.material.resources.c.a(getContext(), d, 6);
        aVar.j = com.google.android.material.resources.c.a(getContext(), d, 19);
        aVar.k = com.google.android.material.resources.c.a(getContext(), d, 16);
        aVar.o = d.getBoolean(5, false);
        aVar.r = d.getDimensionPixelSize(9, 0);
        aVar.p = d.getBoolean(21, true);
        int paddingStart = ViewCompat.getPaddingStart(this);
        int paddingTop = getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this);
        int paddingBottom = getPaddingBottom();
        if (d.hasValue(0)) {
            aVar.n = true;
            setSupportBackgroundTintList(aVar.i);
            setSupportBackgroundTintMode(aVar.h);
            z2 = false;
            z = true;
        } else {
            g gVar = new g(aVar.b);
            gVar.j(getContext());
            DrawableCompat.setTintList(gVar, aVar.i);
            PorterDuff.Mode mode2 = aVar.h;
            if (mode2 != null) {
                DrawableCompat.setTintMode(gVar, mode2);
            }
            float f = aVar.g;
            ColorStateList colorStateList = aVar.j;
            gVar.a.j = f;
            gVar.invalidateSelf();
            g.b bVar = gVar.a;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
            g gVar2 = new g(aVar.b);
            gVar2.setTint(0);
            float f2 = aVar.g;
            int b2 = aVar.m ? com.google.android.material.color.a.b(this, com.haryanvi.netstream.R.attr.colorSurface) : 0;
            z = true;
            gVar2.a.j = f2;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(b2);
            g.b bVar2 = gVar2.a;
            if (bVar2.d != valueOf) {
                bVar2.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
            g gVar3 = new g(aVar.b);
            aVar.l = gVar3;
            DrawableCompat.setTint(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.a.a(aVar.k), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), aVar.c, aVar.e, aVar.d, aVar.f), aVar.l);
            aVar.q = rippleDrawable;
            super.setBackgroundDrawable(rippleDrawable);
            z2 = false;
            g b3 = aVar.b(false);
            if (b3 != null) {
                b3.k(aVar.r);
                b3.setState(getDrawableState());
            }
        }
        ViewCompat.setPaddingRelative(this, paddingStart + aVar.c, paddingTop + aVar.e, paddingEnd + aVar.d, paddingBottom + aVar.f);
        d.recycle();
        setCompoundDrawablePadding(dimensionPixelSize);
        d(this.f != null ? z : z2);
    }

    public final boolean a() {
        com.google.android.material.button.a aVar = this.a;
        return (aVar == null || aVar.n) ? false : true;
    }

    @Override // com.google.android.material.shape.o
    public final void b(@NonNull k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.a.c(kVar);
    }

    public final void c() {
        int i = this.p;
        if (i == 1 || i == 2) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f, null);
        } else if (i == 16 || i == 32) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f, null, null);
        }
    }

    public final void d(boolean z) {
        Drawable drawable = this.f;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f = mutate;
            DrawableCompat.setTintList(mutate, this.e);
            PorterDuff.Mode mode = this.d;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f, mode);
            }
            int i = this.j;
            int intrinsicWidth = i != 0 ? i : this.f.getIntrinsicWidth();
            if (i == 0) {
                i = this.f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f;
            int i2 = this.k;
            int i3 = this.l;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, i + i3);
            this.f.setVisible(true, z);
        }
        if (z) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i4 = this.p;
        if (((i4 == 1 || i4 == 2) && drawable3 != this.f) || (((i4 == 3 || i4 == 4) && drawable5 != this.f) || ((i4 == 16 || i4 == 32) && drawable4 != this.f))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        Layout.Alignment alignment;
        int min;
        if (this.f == null || getLayout() == null) {
            return;
        }
        int i3 = this.m;
        int i4 = this.j;
        int i5 = this.p;
        int i6 = this.p;
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            if (i6 == 16 || i6 == 32) {
                this.k = 0;
                if (i5 == 16) {
                    this.l = 0;
                    d(false);
                    return;
                }
                if (i4 == 0) {
                    i4 = this.f.getIntrinsicHeight();
                }
                if (getLineCount() > 1) {
                    min = getLayout().getHeight();
                } else {
                    TextPaint paint = getPaint();
                    String charSequence = getText().toString();
                    if (getTransformationMethod() != null) {
                        charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                    }
                    Rect rect = new Rect();
                    paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                    min = Math.min(rect.height(), getLayout().getHeight());
                }
                int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i4) - i3) - getPaddingBottom()) / 2);
                if (this.l != max) {
                    this.l = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.l = 0;
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            alignment = (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        } else {
            int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
            alignment = gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && alignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && alignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.k = 0;
            d(false);
            return;
        }
        if (i4 == 0) {
            i4 = this.f.getIntrinsicWidth();
        }
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i7 = 0; i7 < lineCount; i7++) {
            f = Math.max(f, getLayout().getLineWidth(i7));
        }
        int ceil = ((((i - ((int) Math.ceil(f))) - ViewCompat.getPaddingEnd(this)) - i4) - i3) - ViewCompat.getPaddingStart(this);
        if (alignment == Layout.Alignment.ALIGN_CENTER) {
            ceil /= 2;
        }
        if ((ViewCompat.getLayoutDirection(this) == 1) != (i5 == 4)) {
            ceil = -ceil;
        }
        if (this.k != ceil) {
            this.k = ceil;
            d(false);
        }
    }

    @Override // android.view.View
    @Nullable
    public final ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public final PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ColorStateList getSupportBackgroundTintList() {
        return a() ? this.a.i : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.a.h : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            h.b(this, this.a.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        com.google.android.material.button.a aVar = this.a;
        if (aVar != null && aVar.o) {
            View.mergeDrawableStates(onCreateDrawableState, q);
        }
        if (this.n) {
            View.mergeDrawableStates(onCreateDrawableState, r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        String name;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (TextUtils.isEmpty(this.i)) {
            com.google.android.material.button.a aVar = this.a;
            name = ((aVar == null || !aVar.o) ? Button.class : CompoundButton.class).getName();
        } else {
            name = this.i;
        }
        accessibilityEvent.setClassName(name);
        accessibilityEvent.setChecked(this.n);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        String name;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        com.google.android.material.button.a aVar = this.a;
        if (isEmpty) {
            name = ((aVar == null || !aVar.o) ? Button.class : CompoundButton.class).getName();
        } else {
            name = this.i;
        }
        accessibilityNodeInfo.setClassName(name);
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.o);
        accessibilityNodeInfo.setChecked(this.n);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = this.n;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.a.p) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f != null) {
            if (this.f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(@ColorInt int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        com.google.android.material.button.a aVar = this.a;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        com.google.android.material.button.a aVar = this.a;
        aVar.n = true;
        MaterialButton materialButton = aVar.a;
        materialButton.setSupportBackgroundTintList(aVar.i);
        materialButton.setSupportBackgroundTintMode(aVar.h);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        com.google.android.material.button.a aVar = this.a;
        if (aVar == null || !aVar.o || !isEnabled() || this.n == z) {
            return;
        }
        this.n = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.n;
            if (!materialButtonToggleGroup.f) {
                materialButtonToggleGroup.b(getId(), z2);
            }
        }
        if (this.o) {
            return;
        }
        this.o = true;
        Iterator<a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.o = false;
    }

    @Override // android.view.View
    @RequiresApi(21)
    public final void setElevation(float f) {
        super.setElevation(f);
        if (a()) {
            this.a.b(false).k(f);
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        com.google.android.material.button.a aVar = this.a;
        if (aVar.i != colorStateList) {
            aVar.i = colorStateList;
            if (aVar.b(false) != null) {
                DrawableCompat.setTintList(aVar.b(false), aVar.i);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        com.google.android.material.button.a aVar = this.a;
        if (aVar.h != mode) {
            aVar.h = mode;
            if (aVar.b(false) == null || aVar.h == null) {
                return;
            }
            DrawableCompat.setTintMode(aVar.b(false), aVar.h);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.n);
    }
}
