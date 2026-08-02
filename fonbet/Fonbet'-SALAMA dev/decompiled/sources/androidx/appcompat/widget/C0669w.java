package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import e3.C1023h;
import h.AbstractC1174a;
import i0.C1240g;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f8751a;

    /* renamed from: b, reason: collision with root package name */
    public final C1023h f8752b;

    public C0669w(TextView textView) {
        this.f8751a = textView;
        C1023h c1023h = new C1023h();
        c1023h.f12667a = new C1240g(textView);
        this.f8752b = c1023h;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((Y4.D) this.f8752b.f12667a).r(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray obtainStyledAttributes = this.f8751a.getContext().obtainStyledAttributes(attributeSet, AbstractC1174a.j, i7, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z4) {
        ((Y4.D) this.f8752b.f12667a).S(z4);
    }

    public final void d(boolean z4) {
        ((Y4.D) this.f8752b.f12667a).T(z4);
    }
}
