package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import h.AbstractC1174a;
import w1.C1726n0;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a(context, attributeSet, i7);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7) {
        C1726n0 F7 = C1726n0.F(context, attributeSet, AbstractC1174a.f13341t, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        if (typedArray.hasValue(2)) {
            V.k.c(this, typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(F7.u(0));
        F7.H();
    }
}
