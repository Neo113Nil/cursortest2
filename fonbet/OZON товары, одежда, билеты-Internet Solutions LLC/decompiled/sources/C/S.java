package C;

import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private static int f4130a = 3;

    public static void a(@NonNull String str, @NonNull String str2) {
        if (g(3, str)) {
            Log.d(str, str2);
        }
    }

    public static void b(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (g(3, str)) {
            Log.d(str, str2, th2);
        }
    }

    public static void c(@NonNull String str, @NonNull String str2) {
        if (g(6, str)) {
            Log.e(str, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (g(6, str)) {
            Log.e(str, str2, th2);
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (g(4, str)) {
            Log.i(str, str2);
        }
    }

    public static boolean f(@NonNull String str) {
        return g(3, str);
    }

    private static boolean g(int i11, @NonNull String str) {
        return f4130a <= i11 || Log.isLoggable(str, i11);
    }

    public static boolean h() {
        return g(2, "CameraOrientationUtil");
    }

    static void i() {
        f4130a = 3;
    }

    static void j(int i11) {
        f4130a = i11;
    }

    public static void k(@NonNull String str, @NonNull String str2) {
        if (g(5, str)) {
            Log.w(str, str2);
        }
    }

    public static void l(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        if (g(5, str)) {
            Log.w(str, str2, th2);
        }
    }
}
