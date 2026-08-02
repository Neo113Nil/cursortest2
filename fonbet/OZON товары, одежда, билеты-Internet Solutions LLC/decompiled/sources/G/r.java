package G;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final RectF f9647a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    @NonNull
    public static Matrix a(@NonNull RectF rectF, @NonNull RectF rectF2, int i11, boolean z11) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f9647a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i11);
        if (z11) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static boolean b(@NonNull Rect rect, @NonNull Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean c(int i11) {
        if (i11 == 90 || i11 == 270) {
            return true;
        }
        if (i11 == 0 || i11 == 180) {
            return false;
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Invalid rotation degrees: "));
    }

    public static boolean d(@NonNull Size size, boolean z11, @NonNull Size size2) {
        float width;
        float width2;
        if (z11) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    @NonNull
    public static Size e(@NonNull Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    @NonNull
    public static String f(@NonNull Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    @NonNull
    public static Size g(@NonNull Size size, int i11) {
        x2.i.a("Invalid rotation degrees: " + i11, i11 % 90 == 0);
        return c(h(i11)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static int h(int i11) {
        return ((i11 % 360) + 360) % 360;
    }
}
