package F2;

import android.net.Uri;
import androidx.recyclerview.widget.m;
import ru.ozon.fintech.ui.input.CounterView;

/* loaded from: classes8.dex */
public final class c {
    public static final Exception a(E2.e eVar, String str, Exception exc) {
        if (exc instanceof a) {
            return new a(eVar, str);
        }
        if (exc instanceof d) {
            return new d(eVar, str);
        }
        throw new G2.a();
    }

    public static int b(long j11) {
        f(j11, "Request body size is negative");
        double d11 = j11 / 1024.0d;
        if (d11 == 0.0d) {
            return 1;
        }
        if (d11 > 0.0d && d11 < 10.0d) {
            return 2;
        }
        if (g(10, 50, d11)) {
            return 3;
        }
        if (g(50, m.e.DEFAULT_DRAG_ANIMATION_DURATION, d11)) {
            return 4;
        }
        if (g(m.e.DEFAULT_DRAG_ANIMATION_DURATION, CounterView.COUNTER_MAX_DEFAULT, d11)) {
            return 5;
        }
        if (g(CounterView.COUNTER_MAX_DEFAULT, 1000, d11)) {
            return 6;
        }
        return g(1000, 5000, d11) ? 7 : 8;
    }

    public static int c(long j11) {
        f(j11, "Request header size is negative");
        double d11 = j11 / 1024.0d;
        if (g(0, 1, d11)) {
            return 1;
        }
        if (g(1, 10, d11)) {
            return 2;
        }
        if (g(10, 25, d11)) {
            return 3;
        }
        if (g(25, 50, d11)) {
            return 4;
        }
        return g(50, 100, d11) ? 5 : 6;
    }

    public static int d(long j11) {
        f(j11, "Response body size is negative");
        double d11 = j11 / 1024.0d;
        if (d11 == 0.0d) {
            return 1;
        }
        if (d11 > 0.0d && d11 < 10.0d) {
            return 2;
        }
        if (g(10, 50, d11)) {
            return 3;
        }
        if (g(50, m.e.DEFAULT_DRAG_ANIMATION_DURATION, d11)) {
            return 4;
        }
        if (g(m.e.DEFAULT_DRAG_ANIMATION_DURATION, CounterView.COUNTER_MAX_DEFAULT, d11)) {
            return 5;
        }
        if (g(CounterView.COUNTER_MAX_DEFAULT, 1000, d11)) {
            return 6;
        }
        return g(1000, 5000, d11) ? 7 : 8;
    }

    public static int e(long j11) {
        f(j11, "Response header size is negative");
        double d11 = j11 / 1024.0d;
        if (g(0, 1, d11)) {
            return 1;
        }
        if (g(1, 10, d11)) {
            return 2;
        }
        if (g(10, 25, d11)) {
            return 3;
        }
        if (g(25, 50, d11)) {
            return 4;
        }
        return g(50, 100, d11) ? 5 : 6;
    }

    private static void f(long j11, String str) {
        if (j11 < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    private static boolean g(int i11, int i12, double d11) {
        return d11 >= ((double) i11) && d11 < ((double) i12);
    }

    public static boolean h(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
