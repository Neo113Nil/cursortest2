package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a(context, attributeSet, i7);
    }

    public final void a(Context context, AttributeSet attributeSet, int i7) {
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, p051h.a.f13347t, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        if (typedArray.hasValue(2)) {
            V.k.c(this, typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(c1017n0F.u(0));
        c1017n0F.H();
    }
}
