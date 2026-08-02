package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.core.graphics.b;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes8.dex */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static boolean a(@NonNull TextPaint textPaint, @NonNull String str) {
        return a.a(textPaint, str);
    }

    public static void b(@NonNull C5.a aVar, androidx.core.graphics.a aVar2) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(aVar, aVar2 != null ? b.C0768b.a(aVar2) : null);
        } else if (aVar2 == null) {
            aVar.setXfermode(null);
        } else {
            PorterDuff.Mode a11 = androidx.core.graphics.b.a(aVar2);
            aVar.setXfermode(a11 != null ? new PorterDuffXfermode(a11) : null);
        }
    }
}
