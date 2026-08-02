package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import i.C6977a;
import j.C7232a;

/* renamed from: androidx.appcompat.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5068m {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ImageView f37956a;

    /* renamed from: b, reason: collision with root package name */
    private int f37957b = 0;

    public C5068m(@NonNull ImageView imageView) {
        this.f37956a = imageView;
    }

    final void a() {
        ImageView imageView = this.f37956a;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f37957b);
        }
    }

    final void b() {
        Drawable drawable = this.f37956a.getDrawable();
        if (drawable != null) {
            H.a(drawable);
        }
    }

    final boolean c() {
        return !(this.f37956a.getBackground() instanceof RippleDrawable);
    }

    public final void d(AttributeSet attributeSet, int i11) {
        int n11;
        ImageView imageView = this.f37956a;
        Context context = imageView.getContext();
        int[] iArr = C6977a.f65652f;
        b0 v11 = b0.v(context, attributeSet, iArr, i11, 0);
        androidx.core.view.Y.B(imageView, imageView.getContext(), iArr, attributeSet, v11.r(), i11);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (n11 = v11.n(1, -1)) != -1 && (drawable = C7232a.a(imageView.getContext(), n11)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                H.a(drawable);
            }
            if (v11.s(2)) {
                androidx.core.widget.g.a(imageView, v11.c(2));
            }
            if (v11.s(3)) {
                androidx.core.widget.g.b(imageView, H.c(v11.k(3, -1), null));
            }
            v11.x();
        } catch (Throwable th2) {
            v11.x();
            throw th2;
        }
    }

    final void e(@NonNull Drawable drawable) {
        this.f37957b = drawable.getLevel();
    }

    public final void f(int i11) {
        ImageView imageView = this.f37956a;
        if (i11 != 0) {
            Drawable a11 = C7232a.a(imageView.getContext(), i11);
            if (a11 != null) {
                H.a(a11);
            }
            imageView.setImageDrawable(a11);
        } else {
            imageView.setImageDrawable(null);
        }
        b();
    }
}
