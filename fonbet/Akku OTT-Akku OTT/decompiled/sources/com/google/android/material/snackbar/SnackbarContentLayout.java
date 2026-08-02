package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.haryanvi.netstream.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        com.google.android.material.motion.a.d(context, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.a.b);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.a.getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        boolean z2 = false;
        if (getOrientation() != 0) {
            setOrientation(0);
            z2 = true;
        }
        if (this.a.getPaddingTop() == dimensionPixelSize && this.a.getPaddingBottom() == dimensionPixelSize) {
            z = z2;
        } else {
            TextView textView = this.a;
            if (ViewCompat.isPaddingRelative(textView)) {
                ViewCompat.setPaddingRelative(textView, ViewCompat.getPaddingStart(textView), dimensionPixelSize, ViewCompat.getPaddingEnd(textView), dimensionPixelSize);
            } else {
                textView.setPadding(textView.getPaddingLeft(), dimensionPixelSize, textView.getPaddingRight(), dimensionPixelSize);
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
