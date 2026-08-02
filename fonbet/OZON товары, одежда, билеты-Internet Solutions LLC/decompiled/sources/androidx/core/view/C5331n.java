package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.view.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5331n {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f42308a;

    /* renamed from: androidx.core.view.n$a */
    static class a {
        static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* renamed from: androidx.core.view.n$b */
    static class b {
        static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private C5331n(DisplayCutout displayCutout) {
        this.f42308a = displayCutout;
    }

    static C5331n f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C5331n(displayCutout);
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f42308a);
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f42308a);
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f42308a);
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f42308a);
        }
        return 0;
    }

    @NonNull
    public final androidx.core.graphics.d e() {
        return Build.VERSION.SDK_INT >= 30 ? androidx.core.graphics.d.c(b.b(this.f42308a)) : androidx.core.graphics.d.f42125e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5331n.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f42308a, ((C5331n) obj).f42308a);
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f42308a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    @NonNull
    public final String toString() {
        return "DisplayCutoutCompat{" + this.f42308a + "}";
    }
}
