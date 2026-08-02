package V4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.Y;

/* loaded from: classes8.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final B f28072a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f28073b;

    final class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(y.b(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f7) {
            y.e(view, f7.floatValue());
        }
    }

    final class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            int i11 = Y.f42258g;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            int i11 = Y.f42258g;
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f28072a = new C();
        } else {
            f28072a = new B();
        }
        f28073b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    static void a() {
        f28072a.getClass();
    }

    static float b(@NonNull View view) {
        return f28072a.a(view);
    }

    static void c() {
        f28072a.getClass();
    }

    static void d(@NonNull View view, int i11, int i12, int i13, int i14) {
        f28072a.b(view, i11, i12, i13, i14);
    }

    static void e(@NonNull View view, float f7) {
        f28072a.c(view, f7);
    }

    static void f(int i11, @NonNull View view) {
        f28072a.d(i11, view);
    }

    static void g(@NonNull View view, @NonNull Matrix matrix) {
        f28072a.e(view, matrix);
    }

    static void h(@NonNull ViewGroup viewGroup, @NonNull Matrix matrix) {
        f28072a.f(viewGroup, matrix);
    }
}
