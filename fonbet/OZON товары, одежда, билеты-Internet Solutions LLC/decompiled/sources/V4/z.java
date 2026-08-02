package V4;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* loaded from: classes8.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    private static Field f28074a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f28075b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f28076c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f28077d = true;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f28078e = true;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f28079f = true;

    @SuppressLint({"NewApi"})
    public float a(@NonNull View view) {
        float transitionAlpha;
        if (f28076c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f28076c = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void b(@NonNull View view, int i11, int i12, int i13, int i14) {
        if (f28079f) {
            try {
                view.setLeftTopRightBottom(i11, i12, i13, i14);
            } catch (NoSuchMethodError unused) {
                f28079f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void c(@NonNull View view, float f7) {
        if (f28076c) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f28076c = false;
            }
        }
        view.setAlpha(f7);
    }

    public void d(int i11, @NonNull View view) {
        if (!f28075b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f28074a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f28075b = true;
        }
        Field field = f28074a;
        if (field != null) {
            try {
                f28074a.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, @NonNull Matrix matrix) {
        if (f28077d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f28077d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void f(@NonNull View view, @NonNull Matrix matrix) {
        if (f28078e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f28078e = false;
            }
        }
    }
}
