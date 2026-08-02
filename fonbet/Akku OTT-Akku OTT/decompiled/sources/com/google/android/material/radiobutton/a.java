package com.google.android.material.radiobutton;

import android.R;
import android.content.res.ColorStateList;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;

/* loaded from: classes4.dex */
public final class a extends AppCompatRadioButton {
    public static final int[][] c = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @Nullable
    public ColorStateList a;
    public boolean b;

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b && CompoundButtonCompat.getButtonTintList(this) == null) {
            this.b = true;
            if (this.a == null) {
                int b = com.google.android.material.color.a.b(this, com.haryanvi.netstream.R.attr.colorControlActivated);
                int b2 = com.google.android.material.color.a.b(this, com.haryanvi.netstream.R.attr.colorOnSurface);
                int b3 = com.google.android.material.color.a.b(this, com.haryanvi.netstream.R.attr.colorSurface);
                this.a = new ColorStateList(c, new int[]{com.google.android.material.color.a.c(1.0f, b3, b), com.google.android.material.color.a.c(0.54f, b3, b2), com.google.android.material.color.a.c(0.38f, b3, b2), com.google.android.material.color.a.c(0.38f, b3, b2)});
            }
            CompoundButtonCompat.setButtonTintList(this, this.a);
        }
    }
}
