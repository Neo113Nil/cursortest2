package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: androidx.core.view.animation.a$a, reason: collision with other inner class name */
    static class C0774a {
        static Interpolator a(float f7, float f11) {
            return new PathInterpolator(f7, f11);
        }

        static Interpolator b(float f7, float f11, float f12, float f13) {
            return new PathInterpolator(f7, f11, f12, f13);
        }

        static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    @NonNull
    public static Interpolator a(float f7, float f11, float f12, float f13) {
        return C0774a.b(f7, f11, f12, f13);
    }

    @NonNull
    public static Interpolator b(@NonNull Path path) {
        return C0774a.c(path);
    }
}
