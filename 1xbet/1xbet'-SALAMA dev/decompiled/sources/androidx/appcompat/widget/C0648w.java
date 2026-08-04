package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f8751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p033e3.h f8752b;

    public C0648w(TextView textView) {
        this.f8751a = textView;
        p033e3.h hVar = new p033e3.h();
        hVar.f12673a = new p059i0.g(textView);
        this.f8752b = hVar;
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((Y4.D) this.f8752b.f12673a).r(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f8751a.getContext().obtainStyledAttributes(attributeSet, p051h.a.j, i7, 0);
        try {
            boolean z4 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z4);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z4) {
        ((Y4.D) this.f8752b.f12673a).S(z4);
    }

    public final void d(boolean z4) {
        ((Y4.D) this.f8752b.f12673a).T(z4);
    }
}
