package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5334o0 {

    /* renamed from: androidx.core.view.o0$a */
    /* loaded from: classes8.dex */
    static class a {
        static void a(@NonNull Window window, boolean z11) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* renamed from: androidx.core.view.o0$b */
    /* loaded from: classes8.dex */
    static class b {
        static void a(@NonNull Window window, boolean z11) {
            window.setDecorFitsSystemWindows(z11);
        }
    }

    public static void a(@NonNull Window window, boolean z11) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z11);
        } else {
            a.a(window, z11);
        }
    }
}
