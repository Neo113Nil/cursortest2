package P1;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import b2.C5520a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static ThreadLocal<Paint> f21526a = new ThreadLocal<>();

    public static Typeface a(Typeface typeface, @NotNull E e11, @NotNull Context context) {
        if (typeface == null) {
            return null;
        }
        if (e11.a().isEmpty()) {
            return typeface;
        }
        ThreadLocal<Paint> threadLocal = f21526a;
        Paint paint = threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(C5520a.b(e11.a(), null, new T(Z1.a.a(context)), 31));
        return paint.getTypeface();
    }
}
