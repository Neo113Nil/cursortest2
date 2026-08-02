package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.compose.ui.graphics.C0235r;
import androidx.compose.ui.graphics.q;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
import com.haryanvi.netstream.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class b extends AppCompatCheckBox {
    public static final int[] v = {R.attr.state_indeterminate};
    public static final int[] w = {R.attr.state_error};
    public static final int[][] x = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @SuppressLint({"DiscouragedApi"})
    public static final int y = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    @NonNull
    public final LinkedHashSet<InterfaceC0122b> a;

    @Nullable
    public ColorStateList b;
    public boolean c;
    public final boolean d;
    public final boolean e;

    @Nullable
    public final CharSequence f;

    @Nullable
    public Drawable i;

    @Nullable
    public Drawable j;
    public boolean k;

    @Nullable
    public ColorStateList l;

    @Nullable
    public final ColorStateList m;

    @NonNull
    public final PorterDuff.Mode n;
    public int o;
    public int[] p;
    public boolean q;

    @Nullable
    public CharSequence r;

    @Nullable
    public CompoundButton.OnCheckedChangeListener s;

    @Nullable
    public final AnimatedVectorDrawableCompat t;
    public final a u;

    public class a extends Animatable2Compat.AnimationCallback {
        public a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = b.this.l;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public final void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            b bVar = b.this;
            ColorStateList colorStateList = bVar.l;
            if (colorStateList != null) {
                DrawableCompat.setTint(drawable, colorStateList.getColorForState(bVar.p, colorStateList.getDefaultColor()));
            }
        }
    }

    /* renamed from: com.google.android.material.checkbox.b$b, reason: collision with other inner class name */
    public interface InterfaceC0122b {
        void a();
    }

    public static class c extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<c> CREATOR = new a();
        public int a;

        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public final c createFromParcel(Parcel parcel) {
                c cVar = new c(parcel);
                cVar.a = ((Integer) parcel.readValue(c.class.getClassLoader())).intValue();
                return cVar;
            }

            @Override // android.os.Parcelable.Creator
            public final c[] newArray(int i) {
                return new c[i];
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.a;
            return androidx.concurrent.futures.a.a(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.a));
        }
    }

    public b(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        new LinkedHashSet();
        this.a = new LinkedHashSet<>();
        this.t = AnimatedVectorDrawableCompat.create(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.u = new a();
        Context context2 = getContext();
        this.i = CompoundButtonCompat.getButtonDrawable(this);
        ColorStateList colorStateList = this.l;
        this.l = colorStateList == null ? super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList() : colorStateList;
        setSupportButtonTintList(null);
        i.a(context2, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = com.google.android.material.a.o;
        i.b(context2, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        this.j = obtainStyledAttributes.getDrawable(2);
        if (this.i != null && com.google.android.material.resources.b.b(context2, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == y && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.i = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button);
                this.k = true;
                if (this.j == null) {
                    this.j = AppCompatResources.getDrawable(context2, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.m = com.google.android.material.resources.c.b(context2, obtainStyledAttributes, 3);
        this.n = m.b(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.c = obtainStyledAttributes.getBoolean(10, false);
        this.d = obtainStyledAttributes.getBoolean(6, true);
        this.e = obtainStyledAttributes.getBoolean(9, false);
        this.f = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            d(obtainStyledAttributes.getInt(7, 0));
        }
        obtainStyledAttributes.recycle();
        c();
    }

    public final void c() {
        ColorStateList colorStateList;
        Drawable drawable = this.i;
        ColorStateList colorStateList2 = this.l;
        PorterDuff.Mode buttonTintMode = CompoundButtonCompat.getButtonTintMode(this);
        Drawable drawable2 = null;
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList2 != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (buttonTintMode != null) {
                DrawableCompat.setTintMode(drawable, buttonTintMode);
            }
        }
        this.i = drawable;
        Drawable drawable3 = this.j;
        ColorStateList colorStateList3 = this.m;
        if (drawable3 != null) {
            if (colorStateList3 != null) {
                drawable2 = DrawableCompat.wrap(drawable3).mutate();
                PorterDuff.Mode mode = this.n;
                if (mode != null) {
                    DrawableCompat.setTintMode(drawable2, mode);
                }
            } else {
                drawable2 = drawable3;
            }
        }
        this.j = drawable2;
        if (this.k) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.t;
            if (animatedVectorDrawableCompat != null) {
                a aVar = this.u;
                animatedVectorDrawableCompat.unregisterAnimationCallback(aVar);
                animatedVectorDrawableCompat.registerAnimationCallback(aVar);
            }
            Drawable drawable4 = this.i;
            if ((drawable4 instanceof AnimatedStateListDrawable) && animatedVectorDrawableCompat != null) {
                ((AnimatedStateListDrawable) drawable4).addTransition(R.id.checked, R.id.unchecked, animatedVectorDrawableCompat, false);
                ((AnimatedStateListDrawable) this.i).addTransition(R.id.indeterminate, R.id.unchecked, animatedVectorDrawableCompat, false);
            }
        }
        Drawable drawable5 = this.i;
        if (drawable5 != null && (colorStateList = this.l) != null) {
            DrawableCompat.setTintList(drawable5, colorStateList);
        }
        Drawable drawable6 = this.j;
        if (drawable6 != null && colorStateList3 != null) {
            DrawableCompat.setTintList(drawable6, colorStateList3);
        }
        Drawable drawable7 = this.i;
        Drawable drawable8 = this.j;
        if (drawable7 == null) {
            drawable7 = drawable8;
        } else if (drawable8 != null) {
            int intrinsicWidth = drawable8.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable7.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable8.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable7.getIntrinsicWidth() || intrinsicHeight > drawable7.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable7.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable7.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable7, drawable8});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable7 = layerDrawable;
        }
        super.setButtonDrawable(drawable7);
        refreshDrawableState();
    }

    public final void d(int i) {
        AutofillManager d;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.o != i) {
            this.o = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            e();
            if (this.q) {
                return;
            }
            this.q = true;
            LinkedHashSet<InterfaceC0122b> linkedHashSet = this.a;
            if (linkedHashSet != null) {
                Iterator<InterfaceC0122b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.o != 2 && (onCheckedChangeListener = this.s) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (d = C0235r.d(getContext().getSystemService(q.d()))) != null) {
                d.notifyValueChanged(this);
            }
            this.q = false;
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 30 || this.r != null) {
            return;
        }
        int i = this.o;
        super.setStateDescription(i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public final Drawable getButtonDrawable() {
        return this.i;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public final ColorStateList getButtonTintList() {
        return this.l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.o == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && this.l == null && this.m == null) {
            this.c = true;
            if (this.b == null) {
                int b = com.google.android.material.color.a.b(this, R.attr.colorControlActivated);
                int b2 = com.google.android.material.color.a.b(this, R.attr.colorError);
                int b3 = com.google.android.material.color.a.b(this, R.attr.colorSurface);
                int b4 = com.google.android.material.color.a.b(this, R.attr.colorOnSurface);
                this.b = new ColorStateList(x, new int[]{com.google.android.material.color.a.c(1.0f, b3, b2), com.google.android.material.color.a.c(1.0f, b3, b), com.google.android.material.color.a.c(0.54f, b3, b4), com.google.android.material.color.a.c(0.38f, b3, b4), com.google.android.material.color.a.c(0.38f, b3, b4)});
            }
            CompoundButtonCompat.setButtonTintList(this, this.b);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.o == 2) {
            View.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (this.e) {
            View.mergeDrawableStates(onCreateDrawableState, w);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.p = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.d || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (m.a(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.e) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        d(cVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.a = this.o;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.l == colorStateList) {
            return;
        }
        this.l = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        d(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.s = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public final void setStateDescription(@Nullable CharSequence charSequence) {
        this.r = charSequence;
        if (charSequence == null) {
            e();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        d(!isChecked() ? 1 : 0);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(@Nullable Drawable drawable) {
        this.i = drawable;
        this.k = false;
        c();
    }
}
