package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import i.C6977a;
import l.C7755a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5066k {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f37954a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Y2.f f37955b;

    C5066k(@NonNull TextView textView) {
        this.f37954a = textView;
        this.f37955b = new Y2.f(textView);
    }

    @NonNull
    final InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f37955b.a(inputFilterArr);
    }

    public final boolean b() {
        return this.f37955b.b();
    }

    final void c(AttributeSet attributeSet, int i11) {
        TypedArray obtainStyledAttributes = this.f37954a.getContext().obtainStyledAttributes(attributeSet, C6977a.f65655i, i11, 0);
        try {
            boolean z11 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            e(z11);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    final void d(boolean z11) {
        this.f37955b.c(z11);
    }

    final void e(boolean z11) {
        this.f37955b.d(z11);
    }

    public final TransformationMethod f(C7755a c7755a) {
        return this.f37955b.e(c7755a);
    }
}
