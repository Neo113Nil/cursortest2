package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class f {

    static class a {
        static void a(EdgeEffect edgeEffect, float f7, float f11) {
            edgeEffect.onPull(f7, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f7, float f11) {
            try {
                return edgeEffect.onPullDistance(f7, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f7, f11);
                return 0.0f;
            }
        }
    }

    public static float a(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void b(@NonNull EdgeEffect edgeEffect, float f7, float f11) {
        a.a(edgeEffect, f7, f11);
    }

    public static float c(@NonNull EdgeEffect edgeEffect, float f7, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f7, f11);
        }
        a.a(edgeEffect, f7, f11);
        return f7;
    }
}
