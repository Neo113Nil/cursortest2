package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.haryanvi.netstream.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class B extends LinearLayout {
    public final TextInputLayout a;
    public final AppCompatTextView b;

    @Nullable
    public final CharSequence c;
    public final CheckableImageButton d;
    public final ColorStateList e;
    public final PorterDuff.Mode f;
    public final int i;
    public boolean j;

    public B(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.b = appCompatTextView;
        if (com.google.android.material.resources.c.d(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        checkableImageButton.setOnClickListener(null);
        u.d(checkableImageButton);
        checkableImageButton.setOnLongClickListener(null);
        u.d(checkableImageButton);
        if (tintTypedArray.hasValue(69)) {
            this.e = com.google.android.material.resources.c.b(getContext(), tintTypedArray, 69);
        }
        if (tintTypedArray.hasValue(70)) {
            this.f = com.google.android.material.internal.m.b(tintTypedArray.getInt(70, -1), null);
        }
        if (tintTypedArray.hasValue(66)) {
            Drawable drawable = tintTypedArray.getDrawable(66);
            checkableImageButton.setImageDrawable(drawable);
            if (drawable != null) {
                u.a(textInputLayout, checkableImageButton, this.e, this.f);
                if (checkableImageButton.getVisibility() != 0) {
                    checkableImageButton.setVisibility(0);
                    b();
                    c();
                }
                u.c(textInputLayout, checkableImageButton, this.e);
            } else {
                if (checkableImageButton.getVisibility() == 0) {
                    checkableImageButton.setVisibility(8);
                    b();
                    c();
                }
                checkableImageButton.setOnClickListener(null);
                u.d(checkableImageButton);
                checkableImageButton.setOnLongClickListener(null);
                u.d(checkableImageButton);
                if (checkableImageButton.getContentDescription() != null) {
                    checkableImageButton.setContentDescription(null);
                }
            }
            if (tintTypedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = tintTypedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            boolean z = tintTypedArray.getBoolean(64, true);
            if (checkableImageButton.b != z) {
                checkableImageButton.b = z;
                checkableImageButton.sendAccessibilityEvent(0);
            }
        }
        int dimensionPixelSize = tintTypedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.i) {
            this.i = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (tintTypedArray.hasValue(68)) {
            checkableImageButton.setScaleType(u.b(tintTypedArray.getInt(68, -1)));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(60, 0));
        if (tintTypedArray.hasValue(61)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(61));
        }
        CharSequence text2 = tintTypedArray.getText(59);
        this.c = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        c();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int i;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i = MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        return ViewCompat.getPaddingStart(this.b) + ViewCompat.getPaddingStart(this) + i;
    }

    public final void b() {
        EditText editText = this.a.d;
        if (editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.b, this.d.getVisibility() == 0 ? 0 : ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void c() {
        int i = (this.c == null || this.j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.u();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }
}
