package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.b;
import com.google.android.material.internal.i;
import com.google.android.material.radiobutton.a;
import com.google.android.material.resources.c;
import com.google.android.material.textfield.x;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatAutoCompleteTextView createAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return new x(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatButton createButton(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        a aVar = new a(com.google.android.material.theme.overlay.a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, R.attr.radioButtonStyle);
        Context context2 = aVar.getContext();
        TypedArray d = i.d(context2, attributeSet, com.google.android.material.a.p, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(aVar, c.a(context2, d, 0));
        }
        aVar.b = d.getBoolean(1, false);
        d.recycle();
        return aVar;
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        com.google.android.material.textview.a aVar = new com.google.android.material.textview.a(com.google.android.material.theme.overlay.a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = aVar.getContext();
        if (com.google.android.material.resources.b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = com.google.android.material.a.s;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int a = com.google.android.material.textview.a.a(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (a == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, com.google.android.material.a.r);
                    int a2 = com.google.android.material.textview.a.a(aVar.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (a2 >= 0) {
                        aVar.setLineHeight(a2);
                    }
                }
            }
        }
        return aVar;
    }
}
